.class public Lcom/shopkick/app/urlhandlers/LogHandler;
.super Lcom/shopkick/app/url/URLHandler;
.source "LogHandler.java"


# static fields
.field public static final DISPATCHER_KEY:Ljava/lang/String; = "log"

.field private static final PARAM_RECORD:Ljava/lang/String; = "record"


# instance fields
.field private logger:Lcom/shopkick/app/application/SKLogger;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/SKLogger;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/shopkick/app/url/URLHandler;-><init>()V

    .line 25
    iput-object p1, p0, Lcom/shopkick/app/urlhandlers/LogHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    return-void
.end method


# virtual methods
.method public execute()V
    .locals 3

    .line 30
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/LogHandler;->params:Ljava/util/Map;

    const-string v1, "record"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_0

    .line 32
    new-instance v1, Lcom/shopkick/app/urlhandlers/LogHandler$1;

    invoke-direct {v1, p0}, Lcom/shopkick/app/urlhandlers/LogHandler$1;-><init>(Lcom/shopkick/app/urlhandlers/LogHandler;)V

    invoke-virtual {v1}, Lcom/shopkick/app/urlhandlers/LogHandler$1;->getType()Ljava/lang/reflect/Type;

    move-result-object v1

    .line 33
    sget-object v2, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v2, v0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    .line 35
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v1, v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/util/HashMap;)V

    .line 36
    iget-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/urlhandlers/LogHandler;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    :cond_0
    return-void
.end method
