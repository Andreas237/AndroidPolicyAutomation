.class public final Lio/gsonfire/gson/FireTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "FireTypeAdapter.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/gson/TypeAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final classConfig:Lio/gsonfire/ClassConfig;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/gsonfire/ClassConfig<",
            "-TT;>;"
        }
    .end annotation
.end field

.field private final clazz:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final gson:Lcom/google/gson/Gson;

.field private final hooksInvoker:Lio/gsonfire/gson/HooksInvoker;

.field private final originalTypeAdapter:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lio/gsonfire/ClassConfig;Lcom/google/gson/TypeAdapter;Lcom/google/gson/Gson;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Lio/gsonfire/ClassConfig<",
            "-TT;>;",
            "Lcom/google/gson/TypeAdapter<",
            "TT;>;",
            "Lcom/google/gson/Gson;",
            ")V"
        }
    .end annotation

    .line 26
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 24
    new-instance v0, Lio/gsonfire/gson/HooksInvoker;

    invoke-direct {v0}, Lio/gsonfire/gson/HooksInvoker;-><init>()V

    iput-object v0, p0, Lio/gsonfire/gson/FireTypeAdapter;->hooksInvoker:Lio/gsonfire/gson/HooksInvoker;

    .line 27
    iput-object p2, p0, Lio/gsonfire/gson/FireTypeAdapter;->classConfig:Lio/gsonfire/ClassConfig;

    .line 28
    iput-object p4, p0, Lio/gsonfire/gson/FireTypeAdapter;->gson:Lcom/google/gson/Gson;

    .line 29
    iput-object p3, p0, Lio/gsonfire/gson/FireTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    .line 30
    iput-object p1, p0, Lio/gsonfire/gson/FireTypeAdapter;->clazz:Ljava/lang/Class;

    return-void
.end method

.method private deserialize(Lcom/google/gson/JsonElement;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonElement;",
            ")TT;"
        }
    .end annotation

    .line 82
    iget-object v0, p0, Lio/gsonfire/gson/FireTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/google/gson/TypeAdapter;->fromJsonTree(Lcom/google/gson/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private runPostDeserialize(Ljava/lang/Object;Lcom/google/gson/JsonElement;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/google/gson/JsonElement;",
            ")V"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lio/gsonfire/gson/FireTypeAdapter;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-virtual {v0}, Lio/gsonfire/ClassConfig;->getPostProcessors()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/gsonfire/PostProcessor;

    .line 71
    iget-object v2, p0, Lio/gsonfire/gson/FireTypeAdapter;->gson:Lcom/google/gson/Gson;

    invoke-interface {v1, p1, p2, v2}, Lio/gsonfire/PostProcessor;->postDeserialize(Ljava/lang/Object;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private runPostSerialize(Lcom/google/gson/JsonElement;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/JsonElement;",
            "TT;)V"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lio/gsonfire/gson/FireTypeAdapter;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-virtual {v0}, Lio/gsonfire/ClassConfig;->getPostProcessors()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/gsonfire/PostProcessor;

    .line 65
    iget-object v2, p0, Lio/gsonfire/gson/FireTypeAdapter;->gson:Lcom/google/gson/Gson;

    invoke-interface {v1, p1, p2, v2}, Lio/gsonfire/PostProcessor;->postSerialize(Lcom/google/gson/JsonElement;Ljava/lang/Object;Lcom/google/gson/Gson;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private runPreDeserialize(Lcom/google/gson/JsonElement;)V
    .locals 4

    .line 76
    iget-object v0, p0, Lio/gsonfire/gson/FireTypeAdapter;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-virtual {v0}, Lio/gsonfire/ClassConfig;->getPreProcessors()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/gsonfire/PreProcessor;

    .line 77
    iget-object v2, p0, Lio/gsonfire/gson/FireTypeAdapter;->clazz:Ljava/lang/Class;

    iget-object v3, p0, Lio/gsonfire/gson/FireTypeAdapter;->gson:Lcom/google/gson/Gson;

    invoke-interface {v1, v2, p1, v3}, Lio/gsonfire/PreProcessor;->preDeserialize(Ljava/lang/Class;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonReader;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 49
    new-instance v0, Lcom/google/gson/JsonParser;

    invoke-direct {v0}, Lcom/google/gson/JsonParser;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/gson/JsonParser;->parse(Lcom/google/gson/stream/JsonReader;)Lcom/google/gson/JsonElement;

    move-result-object p1

    .line 51
    invoke-direct {p0, p1}, Lio/gsonfire/gson/FireTypeAdapter;->runPreDeserialize(Lcom/google/gson/JsonElement;)V

    .line 52
    invoke-direct {p0, p1}, Lio/gsonfire/gson/FireTypeAdapter;->deserialize(Lcom/google/gson/JsonElement;)Ljava/lang/Object;

    move-result-object v0

    .line 55
    iget-object v1, p0, Lio/gsonfire/gson/FireTypeAdapter;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-virtual {v1}, Lio/gsonfire/ClassConfig;->isHooksEnabled()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 56
    iget-object v1, p0, Lio/gsonfire/gson/FireTypeAdapter;->hooksInvoker:Lio/gsonfire/gson/HooksInvoker;

    iget-object v2, p0, Lio/gsonfire/gson/FireTypeAdapter;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v1, v0, p1, v2}, Lio/gsonfire/gson/HooksInvoker;->postDeserialize(Ljava/lang/Object;Lcom/google/gson/JsonElement;Lcom/google/gson/Gson;)V

    .line 58
    :cond_0
    invoke-direct {p0, v0, p1}, Lio/gsonfire/gson/FireTypeAdapter;->runPostDeserialize(Ljava/lang/Object;Lcom/google/gson/JsonElement;)V

    return-object v0
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/stream/JsonWriter;",
            "TT;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 35
    iget-object v0, p0, Lio/gsonfire/gson/FireTypeAdapter;->classConfig:Lio/gsonfire/ClassConfig;

    invoke-virtual {v0}, Lio/gsonfire/ClassConfig;->isHooksEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 36
    iget-object v0, p0, Lio/gsonfire/gson/FireTypeAdapter;->hooksInvoker:Lio/gsonfire/gson/HooksInvoker;

    invoke-virtual {v0, p2}, Lio/gsonfire/gson/HooksInvoker;->preSerialize(Ljava/lang/Object;)V

    .line 39
    :cond_0
    iget-object v0, p0, Lio/gsonfire/gson/FireTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p2}, Lcom/google/gson/TypeAdapter;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object v0

    .line 42
    invoke-direct {p0, v0, p2}, Lio/gsonfire/gson/FireTypeAdapter;->runPostSerialize(Lcom/google/gson/JsonElement;Ljava/lang/Object;)V

    .line 44
    iget-object p2, p0, Lio/gsonfire/gson/FireTypeAdapter;->gson:Lcom/google/gson/Gson;

    instance-of v1, p2, Lcom/google/gson/Gson;

    if-nez v1, :cond_1

    invoke-virtual {p2, v0, p1}, Lcom/google/gson/Gson;->toJson(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V

    goto :goto_0

    :cond_1
    check-cast p2, Lcom/google/gson/Gson;

    invoke-static {p2, v0, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V

    :goto_0
    return-void
.end method
