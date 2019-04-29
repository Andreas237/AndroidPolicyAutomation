.class public Lio/sentry/jul/SentryHandler;
.super Ljava/util/logging/Handler;
.source "SentryHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/sentry/jul/SentryHandler$DropSentryFilter;
    }
.end annotation


# static fields
.field public static final THREAD_ID:Ljava/lang/String; = "Sentry-ThreadId"


# instance fields
.field protected printfStyle:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 36
    invoke-direct {p0}, Ljava/util/logging/Handler;-><init>()V

    .line 37
    invoke-virtual {p0}, Lio/sentry/jul/SentryHandler;->retrieveProperties()V

    .line 38
    new-instance v0, Lio/sentry/jul/SentryHandler$DropSentryFilter;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/sentry/jul/SentryHandler$DropSentryFilter;-><init>(Lio/sentry/jul/SentryHandler;Lio/sentry/jul/SentryHandler$1;)V

    invoke-virtual {p0, v0}, Lio/sentry/jul/SentryHandler;->setFilter(Ljava/util/logging/Filter;)V

    return-void
.end method

.method protected static formatMessageParameters([Ljava/lang/Object;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 70
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 71
    array-length v2, p0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, p0, v1

    if-eqz v3, :cond_0

    .line 72
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method protected static getLevel(Ljava/util/logging/Level;)Lio/sentry/event/Event$Level;
    .locals 2

    .line 48
    invoke-virtual {p0}, Ljava/util/logging/Level;->intValue()I

    move-result v0

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v1}, Ljava/util/logging/Level;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_0

    .line 49
    sget-object p0, Lio/sentry/event/Event$Level;->ERROR:Lio/sentry/event/Event$Level;

    return-object p0

    .line 50
    :cond_0
    invoke-virtual {p0}, Ljava/util/logging/Level;->intValue()I

    move-result v0

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-virtual {v1}, Ljava/util/logging/Level;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 51
    sget-object p0, Lio/sentry/event/Event$Level;->WARNING:Lio/sentry/event/Event$Level;

    return-object p0

    .line 52
    :cond_1
    invoke-virtual {p0}, Ljava/util/logging/Level;->intValue()I

    move-result v0

    sget-object v1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    invoke-virtual {v1}, Ljava/util/logging/Level;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_2

    .line 53
    sget-object p0, Lio/sentry/event/Event$Level;->INFO:Lio/sentry/event/Event$Level;

    return-object p0

    .line 54
    :cond_2
    invoke-virtual {p0}, Ljava/util/logging/Level;->intValue()I

    move-result p0

    sget-object v0, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    invoke-virtual {v0}, Ljava/util/logging/Level;->intValue()I

    move-result v0

    if-lt p0, v0, :cond_3

    .line 55
    sget-object p0, Lio/sentry/event/Event$Level;->DEBUG:Lio/sentry/event/Event$Level;

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0
.end method

.method private parseLevelOrDefault(Ljava/lang/String;)Ljava/util/logging/Level;
    .locals 0

    .line 89
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/logging/Level;->parse(Ljava/lang/String;)Ljava/util/logging/Level;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 91
    :catch_0
    sget-object p1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    return-object p1
.end method


# virtual methods
.method public close()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/SecurityException;
        }
    .end annotation

    .line 193
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->startManagingThread()V

    .line 195
    :try_start_0
    invoke-static {}, Lio/sentry/Sentry;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    :goto_0
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :catch_0
    move-exception v0

    :try_start_1
    const-string v1, "An exception occurred while closing the Sentry connection"

    const/4 v2, 0x3

    .line 197
    invoke-virtual {p0, v1, v0, v2}, Lio/sentry/jul/SentryHandler;->reportError(Ljava/lang/String;Ljava/lang/Exception;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 199
    :goto_2
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    throw v0
.end method

.method protected createEventBuilder(Ljava/util/logging/LogRecord;)Lio/sentry/event/EventBuilder;
    .locals 6

    .line 120
    new-instance v0, Lio/sentry/event/EventBuilder;

    invoke-direct {v0}, Lio/sentry/event/EventBuilder;-><init>()V

    const-string v1, "java.util.logging"

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withSdkIntegration(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getLevel()Ljava/util/logging/Level;

    move-result-object v1

    invoke-static {v1}, Lio/sentry/jul/SentryHandler;->getLevel(Ljava/util/logging/Level;)Lio/sentry/event/Event$Level;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withLevel(Lio/sentry/event/Event$Level;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getMillis()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withTimestamp(Ljava/util/Date;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getLoggerName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withLogger(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    move-result-object v0

    .line 126
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getMessage()Ljava/lang/String;

    move-result-object v1

    .line 127
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getResourceBundle()Ljava/util/ResourceBundle;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getResourceBundle()Ljava/util/ResourceBundle;

    move-result-object v2

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ResourceBundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 128
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getResourceBundle()Ljava/util/ResourceBundle;

    move-result-object v1

    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 132
    :cond_0
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getParameters()[Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    .line 133
    new-instance v2, Lio/sentry/event/interfaces/MessageInterface;

    invoke-direct {v2, v1}, Lio/sentry/event/interfaces/MessageInterface;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lio/sentry/event/EventBuilder;->withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/event/EventBuilder;

    goto :goto_1

    .line 136
    :cond_1
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getParameters()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lio/sentry/jul/SentryHandler;->formatMessageParameters([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    .line 138
    :try_start_0
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getParameters()[Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v1, v3}, Lio/sentry/jul/SentryHandler;->formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v3

    goto :goto_0

    :catch_0
    const/4 v3, 0x0

    move-object v4, v1

    .line 144
    :goto_0
    new-instance v5, Lio/sentry/event/interfaces/MessageInterface;

    invoke-direct {v5, v1, v2, v3}, Lio/sentry/event/interfaces/MessageInterface;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Lio/sentry/event/EventBuilder;->withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/event/EventBuilder;

    move-object v1, v4

    .line 146
    :goto_1
    invoke-virtual {v0, v1}, Lio/sentry/event/EventBuilder;->withMessage(Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    .line 148
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getThrown()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 150
    new-instance v2, Lio/sentry/event/interfaces/ExceptionInterface;

    invoke-direct {v2, v1}, Lio/sentry/event/interfaces/ExceptionInterface;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Lio/sentry/event/EventBuilder;->withSentryInterface(Lio/sentry/event/interfaces/SentryInterface;)Lio/sentry/event/EventBuilder;

    .line 153
    :cond_2
    invoke-static {}, Lorg/slf4j/MDC;->getMDCAdapter()Lorg/slf4j/spi/MDCAdapter;

    move-result-object v1

    invoke-interface {v1}, Lorg/slf4j/spi/MDCAdapter;->getCopyOfContextMap()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_4

    .line 155
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 156
    invoke-static {}, Lio/sentry/Sentry;->getStoredClient()Lio/sentry/SentryClient;

    move-result-object v3

    invoke-virtual {v3}, Lio/sentry/SentryClient;->getMdcTags()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 157
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Lio/sentry/event/EventBuilder;->withTag(Ljava/lang/String;Ljava/lang/String;)Lio/sentry/event/EventBuilder;

    goto :goto_2

    .line 159
    :cond_3
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Lio/sentry/event/EventBuilder;->withExtra(Ljava/lang/String;Ljava/lang/Object;)Lio/sentry/event/EventBuilder;

    goto :goto_2

    :cond_4
    const-string v1, "Sentry-ThreadId"

    .line 164
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getThreadID()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/sentry/event/EventBuilder;->withExtra(Ljava/lang/String;Ljava/lang/Object;)Lio/sentry/event/EventBuilder;

    return-object v0
.end method

.method public flush()V
    .locals 0

    return-void
.end method

.method protected formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 179
    iget-boolean v0, p0, Lio/sentry/jul/SentryHandler;->printfStyle:Z

    if-eqz v0, :cond_0

    .line 180
    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 182
    :cond_0
    invoke-static {p1, p2}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public publish(Ljava/util/logging/LogRecord;)V
    .locals 2

    .line 98
    invoke-virtual {p0, p1}, Lio/sentry/jul/SentryHandler;->isLoggable(Ljava/util/logging/LogRecord;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->isManagingThread()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    .line 102
    :cond_0
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->startManagingThread()V

    .line 104
    :try_start_0
    invoke-virtual {p0, p1}, Lio/sentry/jul/SentryHandler;->createEventBuilder(Ljava/util/logging/LogRecord;)Lio/sentry/event/EventBuilder;

    move-result-object p1

    .line 105
    invoke-static {p1}, Lio/sentry/Sentry;->capture(Lio/sentry/event/EventBuilder;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    :goto_0
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    move-exception p1

    :try_start_1
    const-string v0, "An exception occurred while creating a new event in Sentry"

    const/4 v1, 0x1

    .line 107
    invoke-virtual {p0, v0, p1, v1}, Lio/sentry/jul/SentryHandler;->reportError(Ljava/lang/String;Ljava/lang/Exception;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_1
    return-void

    .line 109
    :goto_2
    invoke-static {}, Lio/sentry/environment/SentryEnvironment;->stopManagingThread()V

    throw p1

    :cond_1
    :goto_3
    return-void
.end method

.method protected retrieveProperties()V
    .locals 4

    .line 81
    invoke-static {}, Ljava/util/logging/LogManager;->getLogManager()Ljava/util/logging/LogManager;

    move-result-object v0

    .line 82
    const-class v1, Lio/sentry/jul/SentryHandler;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".printfStyle"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/logging/LogManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {p0, v2}, Lio/sentry/jul/SentryHandler;->setPrintfStyle(Z)V

    .line 84
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".level"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/LogManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/sentry/jul/SentryHandler;->parseLevelOrDefault(Ljava/lang/String;)Ljava/util/logging/Level;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/sentry/jul/SentryHandler;->setLevel(Ljava/util/logging/Level;)V

    return-void
.end method

.method public setPrintfStyle(Z)V
    .locals 0

    .line 204
    iput-boolean p1, p0, Lio/sentry/jul/SentryHandler;->printfStyle:Z

    return-void
.end method
