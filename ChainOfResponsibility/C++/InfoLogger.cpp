
#include <iostream>
#include "InfoLogger.hpp"


InfoLogger::InfoLogger(Logger* nextLoggerProcessor) : Logger(nextLoggerProcessor)
{
}

void InfoLogger::logMessage(int logLevel, std::string message)
{
    if (logLevel == Logger::INFO)
    {
        std::cout << "INFO: " << message << std::endl;
    }
    else
    {
        Logger::logMessage(logLevel, message);
    }
}
