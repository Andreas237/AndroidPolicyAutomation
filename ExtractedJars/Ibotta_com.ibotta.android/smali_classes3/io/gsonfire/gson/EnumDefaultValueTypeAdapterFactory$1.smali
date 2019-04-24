.class Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory$1;
.super Lcom/google/gson/TypeAdapter;
.source "EnumDefaultValueTypeAdapterFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;->create(Lcom/google/gson/Gson;Lcom/google/gson/reflect/TypeToken;)Lcom/google/gson/TypeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;

.field final synthetic val$originalTypeAdapter:Lcom/google/gson/TypeAdapter;


# direct methods
.method constructor <init>(Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;Lcom/google/gson/TypeAdapter;)V
    .locals 0

    .line 30
    iput-object p1, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory$1;->this$0:Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;

    iput-object p2, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory$1;->val$originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

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

    .line 39
    iget-object v0, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory$1;->val$originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/google/gson/TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    .line 41
    iget-object p1, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory$1;->this$0:Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;

    invoke-static {p1}, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;->access$000(Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory;)Ljava/lang/Enum;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p1
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 1
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

    .line 34
    iget-object v0, p0, Lio/gsonfire/gson/EnumDefaultValueTypeAdapterFactory$1;->val$originalTypeAdapter:Lcom/google/gson/TypeAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/google/gson/TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void
.end method
