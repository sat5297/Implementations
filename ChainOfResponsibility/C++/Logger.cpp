#include "Logger.hpp"

Logger::Logger(Logger* nextLoggerProcessor)
{
    this->nextLoggerProcessor = nextLoggerProcessor;
}

void Logger::logMessage(int level, std::string message)
{
    if (this->nextLoggerProcessor != nullptr)
    {
        this->nextLoggerProcessor->logMessage(level, message);
    }
}
