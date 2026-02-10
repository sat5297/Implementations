#pragma once

#include <string>

class Logger
{
public:
    int static const INFO = 1;
    int static const DEBUG = 2;
    int static const ERROR = 3;
    Logger* nextLoggerProcessor;
    Logger(Logger* nextLoggerProcessor);
    virtual void logMessage(int level, std::string message);    
};