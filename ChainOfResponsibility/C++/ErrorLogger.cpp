#include "ErrorLogger.hpp"
#include <iostream>

ErrorLogger::ErrorLogger(Logger* nextLoggerProcessor) : Logger(nextLoggerProcessor)
{
}

void ErrorLogger::logMessage(int logLevel, std::string message)
{
    if (logLevel == Logger::ERROR)
    {
        std::cout << "ERROR: " << message << std::endl;
    }
    else
    {
        Logger::logMessage(logLevel, message);
    }
}