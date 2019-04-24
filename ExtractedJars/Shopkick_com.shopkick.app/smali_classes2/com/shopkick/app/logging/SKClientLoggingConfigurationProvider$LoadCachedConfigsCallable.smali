.class Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;
.super Ljava/lang/Object;
.source "SKClientLoggingConfigurationProvider.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "LoadCachedConfigsCallable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;->this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$1;)V
    .locals 0

    .line 249
    invoke-direct {p0, p1}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;-><init>(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)V

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Boolean;
    .locals 7

    .line 254
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;->this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    invoke-static {v0}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->access$200(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f100002

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v0

    .line 255
    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v1

    .line 256
    new-array v1, v1, [B

    .line 257
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    .line 258
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 259
    new-instance v0, Ljava/lang/String;

    const-string v2, "UTF-8"

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 261
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    .line 264
    :try_start_1
    sget-object v2, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    const-class v3, Lcom/google/gson/JsonElement;

    invoke-virtual {v2, v0, v3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/gson/JsonElement;

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v0

    .line 265
    invoke-virtual {v0}, Lcom/google/gson/JsonObject;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 267
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 268
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    .line 269
    sget-object v4, Lcom/shopkick/app/util/GsonUtils;->gson:Lcom/google/gson/Gson;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/gson/JsonElement;

    const-class v5, Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    invoke-virtual {v4, v2, v5}, Lcom/google/gson/Gson;->fromJson(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/LogConfig;

    .line 270
    new-instance v4, Lcom/shopkick/app/logging/EventAppenderConfig;

    sget-object v5, Lcom/shopkick/logging/Area;->ALL:Lcom/shopkick/logging/Area;

    .line 271
    invoke-virtual {v5}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v5

    invoke-direct {v4, v1, v5, v6, v2}, Lcom/shopkick/app/logging/EventAppenderConfig;-><init>(ZJLcom/shopkick/app/fetchers/api/skapi/LogConfig;)V

    .line 275
    invoke-static {}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->access$300()Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 276
    :try_start_2
    iget-object v5, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;->this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    invoke-static {v5}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->access$500(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)Ljava/util/Map;

    move-result-object v5

    iget-object v6, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;->this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    invoke-static {v6}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->access$400(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_0

    .line 277
    iget-object v5, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;->this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    invoke-static {v5}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->access$500(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)Ljava/util/Map;

    move-result-object v5

    iget-object v6, p0, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;->this$0:Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;

    invoke-static {v6}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;->access$400(Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider;)Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v5, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    :cond_0
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 286
    :catch_1
    :cond_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 249
    invoke-virtual {p0}, Lcom/shopkick/app/logging/SKClientLoggingConfigurationProvider$LoadCachedConfigsCallable;->call()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
