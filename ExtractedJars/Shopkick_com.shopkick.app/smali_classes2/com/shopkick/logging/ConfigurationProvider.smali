.class public interface abstract Lcom/shopkick/logging/ConfigurationProvider;
.super Ljava/lang/Object;
.source "ConfigurationProvider.java"


# virtual methods
.method public abstract getAppenderConfig(Ljava/lang/String;)Lcom/shopkick/logging/AppenderConfig;
.end method

.method public abstract getLoggerConfig(Ljava/lang/String;)Lcom/shopkick/logging/LoggerConfig;
.end method

.method public abstract isSKLoggerDevloggingDisabled()Z
.end method

.method public abstract isSKLoggerOnlyDevloggingDisabled()Z
.end method
