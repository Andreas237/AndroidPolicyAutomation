.class Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "ExcludeByValueTypeAdapterFactory.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ExcludeByValueTypeAdapter"
.end annotation


# instance fields
.field private final gson:Lcom/google/gson/Gson;

.field private final originalTypeAdapter:Lcom/google/gson/TypeAdapter;

.field final synthetic this$0:Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;


# direct methods
.method public constructor <init>(Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->this$0:Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 45
    iput-object p2, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->gson:Lcom/google/gson/Gson;

    .line 46
    iput-object p3, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    return-void
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 98
    iget-object v0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 53
    iget-object v0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    const/4 v0, 0x0

    .line 57
    iget-object v1, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->this$0:Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;

    invoke-static {v1}, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->access$000(Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;)Lio/gsonfire/util/reflection/FieldInspector;

    move-result-object v1

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-class v3, Lio/gsonfire/annotations/ExcludeByValue;

    invoke-virtual {v1, v2, v3}, Lio/gsonfire/util/reflection/FieldInspector;->getAnnotatedMembers(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Field;

    .line 59
    :try_start_0
    const-class v3, Lio/gsonfire/annotations/ExcludeByValue;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Field;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v3

    check-cast v3, Lio/gsonfire/annotations/ExcludeByValue;

    .line 60
    invoke-interface {v3}, Lio/gsonfire/annotations/ExcludeByValue;->value()Ljava/lang/Class;

    move-result-object v3

    .line 62
    iget-object v4, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->this$0:Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;

    invoke-static {v4}, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->access$100(Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;)Lio/gsonfire/util/reflection/Factory;

    move-result-object v4

    invoke-interface {v4, v3}, Lio/gsonfire/util/reflection/Factory;->get(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/gsonfire/gson/ExclusionByValueStrategy;

    .line 63
    invoke-virtual {v2, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Lio/gsonfire/gson/ExclusionByValueStrategy;->shouldSkipField(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 64
    iget-object v3, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->this$0:Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;

    invoke-static {v3}, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;->access$200(Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory;)Lio/gsonfire/util/FieldNameResolver;

    move-result-object v3

    invoke-virtual {v3, v2}, Lio/gsonfire/util/FieldNameResolver;->getFieldName(Ljava/lang/reflect/Field;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    if-nez v0, :cond_3

    .line 70
    iget-object v3, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v3, p2}, Lcom/google/gson/TypeAdapter;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object v3

    if-eqz v3, :cond_4

    .line 71
    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->isJsonNull()Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v3}, Lcom/google/gson/JsonElement;->isJsonObject()Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_1

    .line 74
    :cond_2
    iget-object v0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p2}, Lcom/google/gson/TypeAdapter;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/JsonElement;->getAsJsonObject()Lcom/google/gson/JsonObject;

    move-result-object v0

    .line 78
    :cond_3
    invoke-virtual {v0, v2}, Lcom/google/gson/JsonObject;->remove(Ljava/lang/String;)Lcom/google/gson/JsonElement;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 82
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    :goto_1
    if-eqz v0, :cond_6

    .line 88
    iget-object p2, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->gson:Lcom/google/gson/Gson;

    instance-of v1, p2, Lcom/google/gson/Gson;

    if-nez v1, :cond_5

    invoke-virtual {p2, v0, p1}, Lcom/google/gson/Gson;->toJson(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V

    goto :goto_2

    :cond_5
    check-cast p2, Lcom/google/gson/Gson;

    invoke-static {p2, v0, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V

    goto :goto_2

    .line 91
    :cond_6
    iget-object v0, p0, Lio/gsonfire/gson/ExcludeByValueTypeAdapterFactory$ExcludeByValueTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
