#pragma once

#include <string>
#include "Logger.hpp"

class InfoLogger : public Logger
{
public:
    InfoLogger(Logger* nextLoggerProcessor);
    void logMessage(int level, std::string message);
};