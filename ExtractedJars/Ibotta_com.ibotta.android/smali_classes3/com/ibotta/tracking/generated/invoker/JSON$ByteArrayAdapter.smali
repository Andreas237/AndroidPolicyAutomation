.class public Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "JSON.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/tracking/generated/invoker/JSON;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ByteArrayAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "[B>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/tracking/generated/invoker/JSON;


# direct methods
.method public constructor <init>(Lcom/ibotta/tracking/generated/invoker/JSON;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;->this$0:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 153
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;->read(Lcom/google/gson/stream/JsonReader;)[B

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/google/gson/stream/JsonReader;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 166
    sget-object v0, Lcom/ibotta/tracking/generated/invoker/JSON$1;->$SwitchMap$com$google$gson$stream$JsonToken:[I

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/stream/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 171
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    .line 172
    invoke-static {p1}, Lokio/ByteString;->decodeBase64(Ljava/lang/String;)Lokio/ByteString;

    move-result-object p1

    .line 173
    invoke-virtual {p1}, Lokio/ByteString;->toByteArray()[B

    move-result-object p1

    return-object p1

    .line 168
    :cond_0
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 153
    check-cast p2, [B

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/tracking/generated/invoker/JSON$ByteArrayAdapter;->write(Lcom/google/gson/stream/JsonWriter;[B)V

    return-void
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;[B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 158
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    goto :goto_0

    .line 160
    :cond_0
    invoke-static {p2}, Lokio/ByteString;->of([B)Lokio/ByteString;

    move-result-object p2

    invoke-virtual {p2}, Lokio/ByteString;->base64()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    :goto_0
    return-void
.end method
