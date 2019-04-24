.class public Lcom/shopkick/logging/EventLogger;
.super Lcom/shopkick/logging/LoggerBase;
.source "EventLogger.java"


# static fields
.field public static final LOGGER_TAG:Ljava/lang/String;

.field private static final eventLoggerExecutorService:Ljava/util/concurrent/ThreadPoolExecutor;

.field public static final paramKeyAction:Ljava/lang/String; = "action"

.field public static final paramKeyElement:Ljava/lang/String; = "element"

.field public static final paramKeyEventType:Ljava/lang/String; = "event_type"

.field public static final paramKeyRecordId:Ljava/lang/String; = "record_id"

.field public static final paramKeyScreen:Ljava/lang/String; = "screen"


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 24
    const-class v0, Lcom/shopkick/logging/EventLogger;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/logging/EventLogger;->LOGGER_TAG:Ljava/lang/String;

    .line 32
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v7, Ljava/util/concurrent/LinkedBlockingDeque;

    invoke-direct {v7}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    const/4 v2, 0x1

    const/4 v3, 0x5

    const-wide/16 v4, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    sput-object v0, Lcom/shopkick/logging/EventLogger;->eventLoggerExecutorService:Ljava/util/concurrent/ThreadPoolExecutor;

    return-void
.end method

.method constructor <init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lcom/shopkick/logging/LoggerBase;-><init>(Lcom/shopkick/logging/ConfigurationProvider;Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected getLoggerConfig()Lcom/shopkick/logging/LoggerConfig;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/shopkick/logging/EventLogger;->configurationProvider:Lcom/shopkick/logging/ConfigurationProvider;

    sget-object v1, Lcom/shopkick/logging/EventLogger;->LOGGER_TAG:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/shopkick/logging/ConfigurationProvider;->getLoggerConfig(Ljava/lang/String;)Lcom/shopkick/logging/LoggerConfig;

    move-result-object v0

    if-nez v0, :cond_0

    .line 120
    new-instance v0, Lcom/shopkick/logging/EventLogger$2;

    invoke-direct {v0, p0}, Lcom/shopkick/logging/EventLogger$2;-><init>(Lcom/shopkick/logging/EventLogger;)V

    return-object v0

    :cond_0
    return-object v0
.end method

.method public log(JLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/Map;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p6    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p7    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-nez p4, :cond_0

    if-nez p5, :cond_0

    if-nez p6, :cond_0

    return-void

    .line 97
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/logging/EventLogger;->isAreaActive(J)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p7, :cond_1

    .line 99
    new-instance p7, Ljava/util/HashMap;

    invoke-direct {p7}, Ljava/util/HashMap;-><init>()V

    .line 101
    :cond_1
    invoke-static {p3}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 103
    iget-object p3, p0, Lcom/shopkick/logging/EventLogger;->userId:Ljava/lang/String;

    :cond_2
    const-string v0, "screen"

    .line 106
    invoke-interface {p7, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "element"

    .line 107
    invoke-interface {p7, p4, p5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p4, "action"

    .line 108
    invoke-interface {p7, p4, p6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    new-instance p4, Lcom/shopkick/logging/Message;

    invoke-direct {p4, p1, p2, p7, p3}, Lcom/shopkick/logging/Message;-><init>(JLjava/util/Map;Ljava/lang/String;)V

    .line 110
    invoke-virtual {p0, p4}, Lcom/shopkick/logging/EventLogger;->log(Lcom/shopkick/logging/Message;)V

    :cond_3
    return-void
.end method

.method public log(JLjava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V
    .locals 1
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p4, :cond_4

    .line 52
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_0

    goto :goto_0

    .line 60
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/shopkick/logging/EventLogger;->isAreaActive(J)Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p5, :cond_1

    .line 62
    new-instance p5, Ljava/util/HashMap;

    invoke-direct {p5}, Ljava/util/HashMap;-><init>()V

    .line 64
    :cond_1
    invoke-static {p3}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    iget-object p3, p0, Lcom/shopkick/logging/EventLogger;->userId:Ljava/lang/String;

    :cond_2
    const-string v0, "event_type"

    .line 69
    invoke-interface {p5, v0, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    new-instance p4, Lcom/shopkick/logging/Message;

    invoke-direct {p4, p1, p2, p5, p3}, Lcom/shopkick/logging/Message;-><init>(JLjava/util/Map;Ljava/lang/String;)V

    .line 71
    sget-object p1, Lcom/shopkick/logging/EventLogger;->eventLoggerExecutorService:Ljava/util/concurrent/ThreadPoolExecutor;

    new-instance p2, Lcom/shopkick/logging/EventLogger$1;

    invoke-direct {p2, p0, p4}, Lcom/shopkick/logging/EventLogger$1;-><init>(Lcom/shopkick/logging/EventLogger;Lcom/shopkick/logging/Message;)V

    invoke-virtual {p1, p2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    :cond_3
    return-void

    :cond_4
    :goto_0
    return-void
.end method
