.class public abstract Lcom/shopkick/logging/AppenderBase;
.super Ljava/lang/Object;
.source "AppenderBase.java"

# interfaces
.implements Lcom/shopkick/logging/Appender;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;
.end method

.method public isAreaActive(JLcom/shopkick/logging/ConfigurationProvider;)Z
    .locals 0

    .line 14
    invoke-virtual {p0, p3}, Lcom/shopkick/logging/AppenderBase;->getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p3

    invoke-interface {p3, p1, p2}, Lcom/shopkick/logging/AppenderConfig;->isAreaActive(J)Z

    move-result p1

    return p1
.end method

.method public isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lcom/shopkick/logging/AppenderBase;->getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p1

    invoke-interface {p1}, Lcom/shopkick/logging/AppenderConfig;->isEnabled()Z

    move-result p1

    return p1
.end method

.method public shouldLog(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)Z
    .locals 0

    .line 20
    invoke-virtual {p0, p2}, Lcom/shopkick/logging/AppenderBase;->getAppenderConfig(Lcom/shopkick/logging/ConfigurationProvider;)Lcom/shopkick/logging/AppenderConfig;

    move-result-object p2

    invoke-interface {p2, p1}, Lcom/shopkick/logging/AppenderConfig;->shouldLog(Lcom/shopkick/logging/Message;)Z

    move-result p1

    return p1
.end method
