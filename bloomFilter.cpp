#include <iostream>
#include <vector>
#include <unordered_map>
#define ll long long

using namespace std;

/*
    Bloom Filter is a probabilistic data structure which is used to check the presence of an element.
    It means surely no or maybe yes.
    The input strings are hashed using certain number of hash functions and stored.
    When a search query comes for a string it is checked in the bloom filter using the same approach.
    

*/

class BloomFilter {
    private:
        static const int SIZE = 256;
        int bitArray[SIZE];

        int hashFunctionBase10(string str){
            ll hash = 0;
            for(int i = 0; i < str.size(); i++){
                hash = hash * 10 + (int)str[i];
                hash = hash % SIZE;
            }
            return hash % SIZE;
        }

        int hashFunctionBase7(string str){
            ll hash = 5;
            for(int i = 0; i < str.size(); i++){
                hash = hash + pow(17, i) * str[i];
                hash = hash % SIZE;
            }
            return hash % SIZE;
        }

        int hashFunctionBase32(string str){
            ll hash = 7;
            for(int i = 0; i < str.size(); i++){
                hash = (hash * 31 + str[i]) % SIZE;
            }
            return hash % SIZE;
        }

        int hashFunctionBase(string str){
            ll hash = 5;
            int p = 7;
            for(int i = 0; i < str.size(); i++){
                hash += hash * 7 + str[0] * pow(p, i);
                hash = hash % SIZE;
            }
            return hash % SIZE;
        }

        bool lookUp(string str){
            int ind1 = hashFunctionBase10(str);
            int ind2 = hashFunctionBase32(str);
            int ind3 = hashFunctionBase7(str);
            int ind4 = hashFunctionBase(str);

            return bitArray[ind1] && bitArray[ind2] && bitArray[ind3] && bitArray[ind4]; 
        }

        void insert(string str){
            if(lookUp(str)){
                cout << str << " Already present probably ..!!\n";
            }
            else {
                int ind1 = hashFunctionBase10(str);
                int ind2 = hashFunctionBase32(str);
                int ind3 = hashFunctionBase7(str);
                int ind4 = hashFunctionBase(str);

                bitArray[ind1] = bitArray[ind2] = bitArray[ind3] = bitArray[ind4] = true;
            }
        }
    
    public:
        bool lookupUtility(string str){
            return lookUp(str);
        }

        void insertUtility(string str){
            return insert(str);
        }

};

int main(){
    int test;
    cout << "Enter the number of strings to insert\n";
    cin >> test;
    string str;
    BloomFilter bs;

    for(int i = 0; i < test; i++){
        cin >> str;
        bs.insertUtility(str);
    }

    cout << "Enter the numbers of string to lookup\n";
    cin >> test;

    for(int i = 0; i < test; i++){
        cin >> str;
        cout << (bs.lookupUtility(str) ? "Probably present\n" : "Definitely absent\n") << endl;
    }
    return 0;
}