.class public Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/eclipse/paho/client/mqttv3/logging/Logger;


# instance fields
.field private catalogID:Ljava/lang/String;

.field private julLogger:Ljava/util/logging/Logger;

.field private logMessageCatalog:Ljava/util/ResourceBundle;

.field private loggerName:Ljava/lang/String;

.field private resourceName:Ljava/lang/String;

.field private traceMessageCatalog:Ljava/util/ResourceBundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->julLogger:Ljava/util/logging/Logger;

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->logMessageCatalog:Ljava/util/ResourceBundle;

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->traceMessageCatalog:Ljava/util/ResourceBundle;

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->catalogID:Ljava/lang/String;

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->resourceName:Ljava/lang/String;

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->loggerName:Ljava/lang/String;

    return-void
.end method

.method protected static dumpMemoryTrace47(Ljava/util/logging/Logger;)V
    .locals 3

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/util/logging/Logger;->getHandlers()[Ljava/util/logging/Handler;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-lt v1, v2, :cond_0

    invoke-virtual {p0}, Ljava/util/logging/Logger;->getParent()Ljava/util/logging/Logger;

    move-result-object p0

    invoke-static {p0}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->dumpMemoryTrace47(Ljava/util/logging/Logger;)V

    return-void

    :cond_0
    aget-object v2, v0, v1

    instance-of v2, v2, Ljava/util/logging/MemoryHandler;

    if-eqz v2, :cond_1

    aget-object v2, v0, v1

    monitor-enter v2

    :try_start_0
    aget-object p0, v0, v1

    check-cast p0, Ljava/util/logging/MemoryHandler;

    invoke-virtual {p0}, Ljava/util/logging/MemoryHandler;->push()V

    monitor-exit v2

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private getResourceMessage(Ljava/util/ResourceBundle;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    :try_start_0
    invoke-virtual {p1, p2}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-object p1, p2

    return-object p1
.end method

.method private logToJsr47(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ResourceBundle;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 1

    const-string p4, "====="

    invoke-virtual {p6, p4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result p4

    const/4 v0, -0x1

    if-ne p4, v0, :cond_0

    invoke-direct {p0, p5, p6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->getResourceMessage(Ljava/util/ResourceBundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p4

    invoke-static {p4, p7}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p6

    :cond_0
    new-instance p4, Ljava/util/logging/LogRecord;

    new-instance p5, Ljava/lang/StringBuffer;

    iget-object p7, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->resourceName:Ljava/lang/String;

    invoke-static {p7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p7

    invoke-direct {p5, p7}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V

    const-string p7, ": "

    invoke-virtual {p5, p7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p5, p6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {p5}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p5

    invoke-direct {p4, p1, p5}, Ljava/util/logging/LogRecord;-><init>(Ljava/util/logging/Level;Ljava/lang/String;)V

    invoke-virtual {p4, p2}, Ljava/util/logging/LogRecord;->setSourceClassName(Ljava/lang/String;)V

    invoke-virtual {p4, p3}, Ljava/util/logging/LogRecord;->setSourceMethodName(Ljava/lang/String;)V

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->loggerName:Ljava/lang/String;

    invoke-virtual {p4, p1}, Ljava/util/logging/LogRecord;->setLoggerName(Ljava/lang/String;)V

    if-eqz p8, :cond_1

    invoke-virtual {p4, p8}, Ljava/util/logging/LogRecord;->setThrown(Ljava/lang/Throwable;)V

    :cond_1
    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->julLogger:Ljava/util/logging/Logger;

    invoke-virtual {p1, p4}, Ljava/util/logging/Logger;->log(Ljava/util/logging/LogRecord;)V

    return-void
.end method

.method private mapJULLevel(I)Ljava/util/logging/Level;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const/4 p1, 0x0

    return-object p1

    :pswitch_0
    sget-object p1, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    return-object p1

    :pswitch_1
    sget-object p1, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    return-object p1

    :pswitch_2
    sget-object p1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    return-object p1

    :pswitch_3
    sget-object p1, Ljava/util/logging/Level;->CONFIG:Ljava/util/logging/Level;

    return-object p1

    :pswitch_4
    sget-object p1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    return-object p1

    :pswitch_5
    sget-object p1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    return-object p1

    :pswitch_6
    sget-object p1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public config(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public config(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x4

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public config(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const/4 v1, 0x4

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public dumpTrace()V
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->julLogger:Ljava/util/logging/Logger;

    invoke-static {v0}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->dumpMemoryTrace47(Ljava/util/logging/Logger;)V

    return-void
.end method

.method public fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x5

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public fine(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const/4 v1, 0x5

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public finer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public finer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x6

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public finer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const/4 v1, 0x6

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public finest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x7

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public finest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x7

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public finest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const/4 v1, 0x7

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public formatMessage(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    :try_start_0
    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->logMessageCatalog:Ljava/util/ResourceBundle;

    invoke-virtual {p2, p1}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_0
    .catch Ljava/util/MissingResourceException; {:try_start_0 .. :try_end_0} :catch_0

    move-object p1, p2

    :catch_0
    return-object p1
.end method

.method public info(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public info(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x3

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public info(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const/4 v1, 0x3

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public initialise(Ljava/util/ResourceBundle;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->logMessageCatalog:Ljava/util/ResourceBundle;

    iput-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->traceMessageCatalog:Ljava/util/ResourceBundle;

    iput-object p3, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->resourceName:Ljava/lang/String;

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->loggerName:Ljava/lang/String;

    iget-object p2, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->loggerName:Ljava/lang/String;

    invoke-static {p2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object p2

    iput-object p2, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->julLogger:Ljava/util/logging/Logger;

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->logMessageCatalog:Ljava/util/ResourceBundle;

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->traceMessageCatalog:Ljava/util/ResourceBundle;

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->logMessageCatalog:Ljava/util/ResourceBundle;

    const-string p2, "0"

    invoke-virtual {p1, p2}, Ljava/util/ResourceBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->catalogID:Ljava/lang/String;

    return-void
.end method

.method public isLoggable(I)Z
    .locals 1

    iget-object v0, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->julLogger:Ljava/util/logging/Logger;

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->mapJULLevel(I)Ljava/util/logging/Level;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p1

    return p1
.end method

.method public log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 9

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->mapJULLevel(I)Ljava/util/logging/Level;

    move-result-object v1

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->julLogger:Ljava/util/logging/Logger;

    invoke-virtual {p1, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->catalogID:Ljava/lang/String;

    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->logMessageCatalog:Ljava/util/ResourceBundle;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->logToJsr47(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ResourceBundle;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public setResourceName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->resourceName:Ljava/lang/String;

    return-void
.end method

.method public severe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public severe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public severe(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const/4 v1, 0x1

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public trace(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 9

    invoke-direct {p0, p1}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->mapJULLevel(I)Ljava/util/logging/Level;

    move-result-object v1

    iget-object p1, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->julLogger:Ljava/util/logging/Logger;

    invoke-virtual {p1, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object v4, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->catalogID:Ljava/lang/String;

    iget-object v5, p0, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->traceMessageCatalog:Ljava/util/ResourceBundle;

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v0 .. v8}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->logToJsr47(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ResourceBundle;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public warning(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v1, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public warning(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 7

    const/4 v1, 0x2

    const/4 v6, 0x0

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public warning(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 7

    const/4 v1, 0x2

    move-object v0, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v0 .. v6}, Lorg/eclipse/paho/client/mqttv3/logging/JSR47Logger;->log(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method
