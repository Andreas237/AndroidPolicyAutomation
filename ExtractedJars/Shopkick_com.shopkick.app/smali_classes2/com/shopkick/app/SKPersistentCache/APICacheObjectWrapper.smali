.class public Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;
.super Lcom/shopkick/app/fetchers/api/IAPIObject;
.source "APICacheObjectWrapper.java"


# instance fields
.field public apiObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

.field public className:Ljava/lang/String;

.field public entityToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/fetchers/api/IAPIObject;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->entityToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 23
    iput-object p2, p0, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->apiObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 24
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->className:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/fetchers/api/IAPIObject;Ljava/lang/String;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/IAPIObject;-><init>()V

    .line 28
    iput-object p1, p0, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->entityToken:Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    .line 29
    iput-object p2, p0, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->apiObject:Lcom/shopkick/app/fetchers/api/IAPIObject;

    .line 30
    iput-object p3, p0, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->className:Ljava/lang/String;

    return-void
.end method

.method public static fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;
    .locals 4

    .line 39
    :try_start_0
    sget-object v0, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v1, Lcom/google/gson/JsonObject;

    invoke-virtual {v0, p0, v1}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/gson/JsonObject;

    const-string v0, "entity_token"

    .line 40
    invoke-virtual {p0, v0}, Lcom/google/gson/JsonObject;->getAsJsonObject(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object v0

    .line 41
    new-instance v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;

    invoke-direct {v1}, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;-><init>()V

    const-string v2, "cache_key"

    .line 42
    invoke-static {v0, v2}, Lcom/shopkick/app/util/GsonUtils;->getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheKey:Ljava/lang/String;

    const-string v2, "cache_version"

    .line 43
    invoke-static {v0, v2}, Lcom/shopkick/app/util/GsonUtils;->getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->cacheVersion:Ljava/lang/String;

    const-string v2, "entity_id"

    .line 44
    invoke-static {v0, v2}, Lcom/shopkick/app/util/GsonUtils;->getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Lcom/shopkick/app/fetchers/api/skapi/EntityToken;->entityId:Ljava/lang/String;

    const-string v0, "class_name"

    .line 46
    invoke-static {p0, v0}, Lcom/shopkick/app/util/GsonUtils;->getAsString(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 47
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v3, "api_object"

    .line 49
    invoke-virtual {p0, v3}, Lcom/google/gson/JsonObject;->getAsJsonObject(Ljava/lang/String;)Lcom/google/gson/JsonObject;

    move-result-object p0

    .line 50
    sget-object v3, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v3, p0, v2}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/fetchers/api/IAPIObject;

    if-eqz p1, :cond_0

    .line 51
    instance-of p1, p0, Lcom/shopkick/app/fetchers/api/PostProcessable;

    if-eqz p1, :cond_0

    .line 52
    move-object p1, p0

    check-cast p1, Lcom/shopkick/app/fetchers/api/PostProcessable;

    invoke-interface {p1}, Lcom/shopkick/app/fetchers/api/PostProcessable;->postProcess()V

    .line 54
    :cond_0
    new-instance p1, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    invoke-direct {p1, v1, p0, v0}, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;-><init>(Lcom/shopkick/app/fetchers/api/skapi/EntityToken;Lcom/shopkick/app/fetchers/api/IAPIObject;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public cloneObject(Z)Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;
    .locals 1

    .line 34
    invoke-virtual {p0}, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->fromJson(Ljava/lang/String;Z)Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic cloneObject(Z)Lcom/shopkick/app/fetchers/api/IAPIObject;
    .locals 0

    .line 13
    invoke-virtual {p0, p1}, Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;->cloneObject(Z)Lcom/shopkick/app/SKPersistentCache/APICacheObjectWrapper;

    move-result-object p1

    return-object p1
.end method
