#include "Logger.hpp"

class ErrorLogger : public Logger
{
public:
    ErrorLogger(Logger* nextLoggerProcessor);
    void logMessage(int level, std::string message);
};
