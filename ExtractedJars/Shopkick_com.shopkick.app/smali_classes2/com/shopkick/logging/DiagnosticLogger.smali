.class public Lcom/shopkick/logging/DiagnosticLogger;
.super Lcom/shopkick/logging/LoggerBase;
.source "DiagnosticLogger.java"


# static fields
.field private static volatile Instance:Lcom/shopkick/logging/DiagnosticLogger;

.field private static final InstanceLock:Ljava/lang/Object;

.field public static final LOGGER_TAG:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-class v0, Lcom/shopkick/logging/DiagnosticLogger;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/DiagnosticLogger;->LOGGER_TAG:Ljava/lang/String;

    const/4 v0, 0x0

    .line 19
    sput-object v0, Lcom/shopkick/logging/DiagnosticLogger;->Instance:Lcom/shopkick/logging/DiagnosticLogger;

    .line 20
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/shopkick/logging/DiagnosticLogger;->InstanceLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 66
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/logging/LoggerBase;-><init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    .line 70
    iget-object p1, p0, Lcom/shopkick/logging/DiagnosticLogger;->appendersLock:Ljava/lang/Object;

    monitor-enter p1

    .line 71
    :try_start_0
    iget-object p2, p0, Lcom/shopkick/logging/DiagnosticLogger;->appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance p3, Lcom/shopkick/logging/LogCatAppender;

    invoke-direct {p3}, Lcom/shopkick/logging/LogCatAppender;-><init>()V

    invoke-virtual {p2, p3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 72
    iget-object p2, p0, Lcom/shopkick/logging/DiagnosticLogger;->context:Landroid/content/Context;

    invoke-static {p2}, Lcom/shopkick/logging/RemoteAppender;->initialize(Landroid/content/Context;)V

    .line 73
    iget-object p2, p0, Lcom/shopkick/logging/DiagnosticLogger;->appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-static {}, Lcom/shopkick/logging/RemoteAppender;->getInstance()Lcom/shopkick/logging/RemoteAppender;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 74
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    iget-object p1, p0, Lcom/shopkick/logging/DiagnosticLogger;->context:Landroid/content/Context;

    invoke-static {p1}, Lcom/shopkick/logging/RemoteAppenderMessageFormatter;->initializeAdvertisingIdData(Landroid/content/Context;)Ljava/util/concurrent/Future;

    return-void

    :catchall_0
    move-exception p2

    .line 74
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method

.method static getInstance()Lcom/shopkick/logging/DiagnosticLogger;
    .locals 2

    .line 59
    sget-object v0, Lcom/shopkick/logging/DiagnosticLogger;->Instance:Lcom/shopkick/logging/DiagnosticLogger;

    if-eqz v0, :cond_0

    .line 62
    sget-object v0, Lcom/shopkick/logging/DiagnosticLogger;->Instance:Lcom/shopkick/logging/DiagnosticLogger;

    return-object v0

    .line 60
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DiagnosticLogger.initialize() must be called before using the DiagnosticLogger"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static getStackTrace([Ljava/lang/StackTraceElement;)Ljava/lang/String;
    .locals 10

    if-eqz p0, :cond_1

    .line 262
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 263
    array-length v1, p0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v4, p0, v3

    .line 264
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v6, "%1$s : %2$s : %3$s [%4$d]\n"

    const/4 v7, 0x4

    new-array v7, v7, [Ljava/lang/Object;

    .line 266
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v8

    aput-object v8, v7, v2

    .line 267
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x1

    aput-object v8, v7, v9

    const/4 v8, 0x2

    .line 268
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v9

    aput-object v9, v7, v8

    const/4 v8, 0x3

    .line 269
    invoke-virtual {v4}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v7, v8

    .line 264
    invoke-static {v5, v6, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 271
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 261
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'stacks\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static getThrowableDump(Ljava/lang/Throwable;)Ljava/lang/String;
    .locals 5

    if-eqz p0, :cond_0

    .line 252
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%s | %s | %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    .line 254
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    .line 255
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    .line 256
    invoke-virtual {p0}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object p0

    invoke-static {p0}, Lcom/shopkick/logging/DiagnosticLogger;->getStackTrace([Ljava/lang/StackTraceElement;)Ljava/lang/String;

    move-result-object p0

    aput-object p0, v2, v3

    .line 252
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 251
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'throwable\' cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static initialize(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_3

    if-eqz p0, :cond_2

    .line 45
    sget-object v0, Lcom/shopkick/logging/DiagnosticLogger;->Instance:Lcom/shopkick/logging/DiagnosticLogger;

    if-nez v0, :cond_1

    .line 46
    sget-object v0, Lcom/shopkick/logging/DiagnosticLogger;->InstanceLock:Ljava/lang/Object;

    monitor-enter v0

    .line 47
    :try_start_0
    sget-object v1, Lcom/shopkick/logging/DiagnosticLogger;->Instance:Lcom/shopkick/logging/DiagnosticLogger;

    if-nez v1, :cond_0

    .line 48
    new-instance v1, Lcom/shopkick/logging/DiagnosticLogger;

    invoke-direct {v1, p0, p1, p2}, Lcom/shopkick/logging/DiagnosticLogger;-><init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    sput-object v1, Lcom/shopkick/logging/DiagnosticLogger;->Instance:Lcom/shopkick/logging/DiagnosticLogger;

    .line 50
    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void

    .line 41
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'configurationProvider\' cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 38
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "\'context\' cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/logging/Level;",
            "JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-ltz p4, :cond_1

    .line 182
    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 187
    :cond_0
    new-instance v0, Lcom/shopkick/logging/Message;

    iget-object v7, p0, Lcom/shopkick/logging/DiagnosticLogger;->userId:Ljava/lang/String;

    move-object v1, v0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v7}, Lcom/shopkick/logging/Message;-><init>(Lcom/shopkick/logging/Level;JILjava/util/Map;Ljava/lang/String;)V

    .line 188
    invoke-virtual {p0, v0}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Message;)V

    return-void

    .line 179
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'event\' cannot be negative"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private varargs log(Lcom/shopkick/logging/Level;JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    if-eqz p5, :cond_2

    .line 197
    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/logging/DiagnosticLogger;->shouldLog(Lcom/shopkick/logging/Level;J)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 203
    :cond_0
    array-length v0, p6

    if-lez v0, :cond_1

    .line 204
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p5, p6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p5

    move-object v4, p5

    goto :goto_0

    :cond_1
    move-object v4, p5

    .line 210
    :goto_0
    new-instance p5, Lcom/shopkick/logging/Message;

    iget-object v6, p0, Lcom/shopkick/logging/DiagnosticLogger;->userId:Ljava/lang/String;

    move-object v0, p5

    move-object v1, p1

    move-wide v2, p2

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/logging/Message;-><init>(Lcom/shopkick/logging/Level;JLjava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 211
    invoke-virtual {p0, p5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Message;)V

    return-void

    .line 194
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'msg\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public d(JI)V
    .locals 6

    .line 105
    sget-object v1, Lcom/shopkick/logging/Level;->DEBUG:Lcom/shopkick/logging/Level;

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public d(JILjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 140
    sget-object v1, Lcom/shopkick/logging/Level;->DEBUG:Lcom/shopkick/logging/Level;

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public varargs d(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 86
    sget-object v1, Lcom/shopkick/logging/Level;->DEBUG:Lcom/shopkick/logging/Level;

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public e(JI)V
    .locals 6

    .line 126
    sget-object v1, Lcom/shopkick/logging/Level;->ERROR:Lcom/shopkick/logging/Level;

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public e(JILjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 161
    sget-object v1, Lcom/shopkick/logging/Level;->ERROR:Lcom/shopkick/logging/Level;

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public varargs e(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 95
    sget-object v1, Lcom/shopkick/logging/Level;->ERROR:Lcom/shopkick/logging/Level;

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 170
    sget-object v1, Lcom/shopkick/logging/Level;->ERROR:Lcom/shopkick/logging/Level;

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method protected getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 277
    iget-object v0, p0, Lcom/shopkick/logging/DiagnosticLogger;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    sget-object v1, Lcom/shopkick/logging/DiagnosticLogger;->LOGGER_TAG:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/shopkick/logging/ConfigurationProvider;->getLoggerConfig(Ljava/lang/String;)Lcom/shopkick/logging/LoggerConfig;

    move-result-object v0

    if-nez v0, :cond_0

    .line 280
    new-instance v0, Lcom/shopkick/logging/DiagnosticLogger$1;

    invoke-direct {v0, p0}, Lcom/shopkick/logging/DiagnosticLogger$1;-><init>(Lcom/shopkick/logging/DiagnosticLogger;)V

    return-object v0

    :cond_0
    return-object v0
.end method

.method public i(JI)V
    .locals 6

    .line 112
    sget-object v1, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public i(JILjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 147
    sget-object v1, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public varargs i(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 89
    sget-object v1, Lcom/shopkick/logging/Level;->INFO:Lcom/shopkick/logging/Level;

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public isLevelActive(Lcom/shopkick/logging/Level;)Z
    .locals 1

    .line 220
    invoke-virtual {p0}, Lcom/shopkick/logging/DiagnosticLogger;->getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/shopkick/logging/LoggerConfig;->isLevelActive(Lcom/shopkick/logging/Level;)Z

    move-result p1

    return p1
.end method

.method public shouldLog(Lcom/shopkick/logging/Level;J)Z
    .locals 3

    if-eqz p1, :cond_5

    .line 230
    invoke-virtual {p0}, Lcom/shopkick/logging/DiagnosticLogger;->getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;

    move-result-object v0

    invoke-interface {v0}, Lcom/shopkick/logging/LoggerConfig;->isLoggingEnabled()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 234
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/logging/DiagnosticLogger;->getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;

    move-result-object v0

    invoke-interface {v0, p2, p3}, Lcom/shopkick/logging/LoggerConfig;->isAreaActive(J)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    .line 238
    :cond_1
    invoke-virtual {p0}, Lcom/shopkick/logging/DiagnosticLogger;->getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/shopkick/logging/LoggerConfig;->isLevelActive(Lcom/shopkick/logging/Level;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    .line 241
    :cond_2
    iget-object p1, p0, Lcom/shopkick/logging/DiagnosticLogger;->appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/logging/Appender;

    .line 242
    iget-object v2, p0, Lcom/shopkick/logging/DiagnosticLogger;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    invoke-interface {v0, v2}, Lcom/shopkick/logging/Appender;->isEnabled(Lcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lcom/shopkick/logging/DiagnosticLogger;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    invoke-interface {v0, p2, p3, v2}, Lcom/shopkick/logging/Appender;->isAreaActive(JLcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_4
    return v1

    .line 228
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'level\' cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public v(JI)V
    .locals 6

    .line 98
    sget-object v1, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public v(JILjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 133
    sget-object v1, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public varargs v(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 83
    sget-object v1, Lcom/shopkick/logging/Level;->VERBOSE:Lcom/shopkick/logging/Level;

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public w(JI)V
    .locals 6

    .line 119
    sget-object v1, Lcom/shopkick/logging/Level;->WARN:Lcom/shopkick/logging/Level;

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public w(JILjava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 154
    sget-object v1, Lcom/shopkick/logging/Level;->WARN:Lcom/shopkick/logging/Level;

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JILjava/util/Map;)V

    return-void
.end method

.method public varargs w(JLjava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 92
    sget-object v1, Lcom/shopkick/logging/Level;->WARN:Lcom/shopkick/logging/Level;

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v2, p1

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public varargs w(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    .line 165
    sget-object v1, Lcom/shopkick/logging/Level;->WARN:Lcom/shopkick/logging/Level;

    move-object v0, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcom/shopkick/logging/DiagnosticLogger;->log(Lcom/shopkick/logging/Level;JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method
