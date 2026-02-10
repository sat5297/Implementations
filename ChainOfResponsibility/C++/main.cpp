#include "Logger.hpp"
#include "InfoLogger.hpp"
#include "DebugLogger.hpp"
#include "ErrorLogger.hpp"

#include <iostream>
int main(){
    Logger* infoLogger = new InfoLogger(new DebugLogger(new ErrorLogger(nullptr)));

    infoLogger->logMessage(Logger::INFO, "This is an information log.");
    infoLogger->logMessage(Logger::DEBUG, "This is a debug level information log.");
    infoLogger->logMessage(Logger::ERROR, "This is an error information log.");

    return 0;
}