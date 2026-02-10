#include "DebugLogger.hpp"
#include <iostream>

DebugLogger::DebugLogger(Logger* nextLoggerProcessor) : Logger(nextLoggerProcessor)
{
}

void DebugLogger::logMessage(int logLevel, std::string message)
{
    if (logLevel == Logger::DEBUG)
    {
        std::cout << "DEBUG: " << message << std::endl;
    }
    else
    {
        Logger::logMessage(logLevel, message);
    }
}