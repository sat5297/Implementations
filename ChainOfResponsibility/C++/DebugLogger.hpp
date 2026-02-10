# include "Logger.hpp"

class DebugLogger : public Logger
{
public: 
    DebugLogger(Logger* nextLoggerProcessor);
    void logMessage(int level, std::string message);
};