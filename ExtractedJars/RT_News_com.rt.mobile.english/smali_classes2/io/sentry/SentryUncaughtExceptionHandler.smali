.class public Lio/sentry/SentryUncaughtExceptionHandler;
.super Ljava/lang/Object;
.source "SentryUncaughtExceptionHandler.java"

# interfaces
.implements Ljava/lang/Thread$UncaughtExceptionHandler;


# static fields
.field private static final logger:Lorg/slf4j/Logger;


# instance fields
.field private defaultExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

.field private volatile enabled:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    const-class v0, Lio/sentry/SentryClientFactory;

    invoke-static {v0}, Lorg/slf4j/LoggerFactory;->getLogger(Ljava/lang/Class;)Lorg/slf4j/Logger;

    move-result-object v0

    sput-object v0, Lio/sentry/SentryUncaughtExceptionHandler;->logger:Lorg/slf4j/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 25
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/SentryUncaughtExceptionHandler;->enabled:Ljava/lang/Boolean;

    .line 34
    iput-object p1, p0, Lio/sentry/SentryUncaughtExceptionHandler;->defaultExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    return-void
.end method

.method public static setup()Lio/sentry/SentryUncaughtExceptionHandler;
    .locals 4

    .line 80
    sget-object v0, Lio/sentry/SentryUncaughtExceptionHandler;->logger:Lorg/slf4j/Logger;

    const-string v1, "Configuring uncaught exception handler."

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 82
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 84
    sget-object v1, Lio/sentry/SentryUncaughtExceptionHandler;->logger:Lorg/slf4j/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "default UncaughtExceptionHandler class=\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lorg/slf4j/Logger;->debug(Ljava/lang/String;)V

    .line 87
    :cond_0
    new-instance v1, Lio/sentry/SentryUncaughtExceptionHandler;

    invoke-direct {v1, v0}, Lio/sentry/SentryUncaughtExceptionHandler;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    .line 88
    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    return-object v1
.end method


# virtual methods
.method public disable()V
    .locals 1

    const/4 v0, 0x0

    .line 96
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/SentryUncaughtExceptionHandler;->enabled:Ljava/lang/Boolean;

    .line 103
    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    if-ne v0, p0, :cond_0

    .line 105
    iget-object v0, p0, Lio/sentry/SentryUncaughtExceptionHandler;->defaultExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-static {v0}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    :cond_0
    return-void
.end method

.method public isEnabled()Ljava/lang/Boolean;
    .locals 1

    .line 110
    iget-object v0, p0, Lio/sentry/SentryUncaughtExceptionHandler;->enabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V
    .locals 3

    .line 46
    iget-object v0, p0, Lio/sentry/SentryUncaughtExceptionHandler;->enabled:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 47
    sget-object v0, Lio/sentry/SentryUncaughtExceptionHandler;->logger:Lorg/slf4j/Logger;

    const-string v1, "Uncaught exception received."

    invoke-interface {v0, v1}, Lorg/slf4j/Logger;->trace(Ljava/lang/String;)V

    .line 49
    new-instance v0, Lio/sentry/event/EventBuilder;

    invoke-direct {v0}, Lio/sentry/event/EventBuilder;-><init>()V

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withMessage(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    sget-object v1, Lio/sentry/event/Event$Level;->FATAL:Lio/sentry/event/Event$Level;

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withLevel(Lio/sentry/event/Event$Level;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    new-instance v1, Lio/sentry/event/interfaces/ExceptionInterface;

    invoke-direct {v1, p2}, Lio/sentry/event/interfaces/ExceptionInterface;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    .line 55
    :try_start_0
    invoke-static {v0}, Lio/sentry/Sentry;->capture(Lio/sentry/event/EventBuilder;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 57
    sget-object v1, Lio/sentry/SentryUncaughtExceptionHandler;->logger:Lorg/slf4j/Logger;

    const-string v2, "Error sending uncaught exception to Sentry."

    invoke-interface {v1, v2, v0}, Lorg/slf4j/Logger;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    :cond_0
    :goto_0
    iget-object v0, p0, Lio/sentry/SentryUncaughtExceptionHandler;->defaultExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lio/sentry/SentryUncaughtExceptionHandler;->defaultExceptionHandler:Ljava/lang/Thread$UncaughtExceptionHandler;

    invoke-interface {v0, p1, p2}, Ljava/lang/Thread$UncaughtExceptionHandler;->uncaughtException(Ljava/lang/Thread;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 65
    :cond_1
    instance-of v0, p2, Ljava/lang/ThreadDeath;

    if-nez v0, :cond_2

    .line 67
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Exception in thread \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\" "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    .line 68
    sget-object p1, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-static {p2, p1}, Lcom/google/devtools/build/android/desugar/runtime/ThrowableExtension;->printStackTrace(Ljava/lang/Throwable;Ljava/io/PrintStream;)V

    :cond_2
    :goto_1
    return-void
.end method
