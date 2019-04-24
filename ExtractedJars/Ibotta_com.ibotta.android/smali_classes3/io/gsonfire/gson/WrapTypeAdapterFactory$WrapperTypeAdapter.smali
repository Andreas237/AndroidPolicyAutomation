.class Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "WrapTypeAdapterFactory.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/gsonfire/gson/WrapTypeAdapterFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "WrapperTypeAdapter"
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
.field private final gson:Lcom/google/gson/Gson;

.field private final mapper:Lio/gsonfire/util/Mapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/gsonfire/util/Mapper<",
            "TT;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final originalTypeAdapter:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lio/gsonfire/gson/WrapTypeAdapterFactory;


# direct methods
.method public constructor <init>(Lio/gsonfire/gson/WrapTypeAdapterFactory;Lio/gsonfire/util/Mapper;Lcom/google/gson/Gson;Lcom/google/gson/TypeAdapter;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/gsonfire/util/Mapper<",
            "TT;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/gson/Gson;",
            "Lcom/google/gson/TypeAdapter<",
            "TT;>;)V"
        }
    .end annotation

    .line 54
    iput-object p1, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->this$0:Lio/gsonfire/gson/WrapTypeAdapterFactory;

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 55
    iput-object p2, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->mapper:Lio/gsonfire/util/Mapper;

    .line 56
    iput-object p3, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->gson:Lcom/google/gson/Gson;

    .line 57
    iput-object p4, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    return-void
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 1
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

    .line 76
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->beginObject()V

    .line 77
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextName()Ljava/lang/String;

    .line 78
    iget-object v0, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object v0

    .line 79
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->endObject()V

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

    if-nez p2, :cond_0

    .line 64
    iget-object v0, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->mapper:Lio/gsonfire/util/Mapper;

    invoke-interface {v0, p2}, Lio/gsonfire/util/Mapper;->map(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 67
    iget-object v1, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v1, p2}, Lcom/google/gson/TypeAdapter;->toJsonTree(Ljava/lang/Object;)Lcom/google/gson/JsonElement;

    move-result-object p2

    .line 68
    new-instance v1, Lcom/google/gson/JsonObject;

    invoke-direct {v1}, Lcom/google/gson/JsonObject;-><init>()V

    .line 69
    invoke-virtual {v1, v0, p2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    .line 70
    iget-object p2, p0, Lio/gsonfire/gson/WrapTypeAdapterFactory$WrapperTypeAdapter;->gson:Lcom/google/gson/Gson;

    instance-of v0, p2, Lcom/google/gson/Gson;

    if-nez v0, :cond_1

    invoke-virtual {p2, v1, p1}, Lcom/google/gson/Gson;->toJson(Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V

    goto :goto_0

    :cond_1
    check-cast p2, Lcom/google/gson/Gson;

    invoke-static {p2, v1, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Lcom/google/gson/JsonElement;Lcom/google/gson/stream/JsonWriter;)V

    :goto_0
    return-void
.end method
