.class public abstract Lcom/shopkick/logging/LoggerBase;
.super Ljava/lang/Object;
.source "LoggerBase.java"


# instance fields
.field protected final appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/shopkick/logging/Appender;",
            ">;"
        }
    .end annotation
.end field

.field protected final appendersLock:Ljava/lang/Object;

.field protected configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

.field protected final context:Landroid/content/Context;

.field protected userId:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lcom/shopkick/logging/LoggerBase;->appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 14
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/shopkick/logging/LoggerBase;->appendersLock:Ljava/lang/Object;

    .line 20
    iput-object p1, p0, Lcom/shopkick/logging/LoggerBase;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    .line 21
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/logging/LoggerBase;->context:Landroid/content/Context;

    .line 22
    iput-object p3, p0, Lcom/shopkick/logging/LoggerBase;->userId:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected final canRegisterAppender(Lcom/shopkick/logging/Appender;)Z
    .locals 3

    .line 75
    iget-object v0, p0, Lcom/shopkick/logging/LoggerBase;->appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/logging/Appender;

    .line 76
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-ne v1, v2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method protected abstract getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end method

.method public isAreaActive(J)Z
    .locals 4

    .line 58
    invoke-virtual {p0}, Lcom/shopkick/logging/LoggerBase;->getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/shopkick/logging/LoggerConfig;->isAreaActive(J)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 62
    :cond_0
    iget-object v0, p0, Lcom/shopkick/logging/LoggerBase;->appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/logging/Appender;

    .line 63
    iget-object v3, p0, Lcom/shopkick/logging/LoggerBase;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    invoke-interface {v2, p1, p2, v3}, Lcom/shopkick/logging/Appender;->isAreaActive(JLcom/shopkick/logging/ConfigurationProvider;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method protected log(Lcom/shopkick/logging/Message;)V
    .locals 3

    .line 85
    iget-object v0, p0, Lcom/shopkick/logging/LoggerBase;->appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/logging/Appender;

    .line 86
    iget-object v2, p0, Lcom/shopkick/logging/LoggerBase;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    invoke-interface {v1, p1, v2}, Lcom/shopkick/logging/Appender;->log(Lcom/shopkick/logging/Message;Lcom/shopkick/logging/ConfigurationProvider;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public registerAppender(Lcom/shopkick/logging/Appender;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 31
    iget-object v0, p0, Lcom/shopkick/logging/LoggerBase;->appendersLock:Ljava/lang/Object;

    monitor-enter v0

    .line 32
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/shopkick/logging/LoggerBase;->canRegisterAppender(Lcom/shopkick/logging/Appender;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 33
    iget-object v1, p0, Lcom/shopkick/logging/LoggerBase;->appenders:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    .line 37
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    .line 30
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "\'appender\' cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/shopkick/logging/LoggerBase;->userId:Ljava/lang/String;

    return-void
.end method
