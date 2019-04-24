.class public Lcom/ibotta/tracking/generated/model/Body$PlatformEnum$Adapter;
.super Lcom/google/gson/TypeAdapter;
.source "Body.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Adapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 102
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/google/gson/stream/JsonReader;)Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 110
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    .line 111
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->fromValue(Ljava/lang/String;)Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 102
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum$Adapter;->read(Lcom/google/gson/stream/JsonReader;)Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 105
    invoke-virtual {p2}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    return-void
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 102
    check-cast p2, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/tracking/generated/model/Body$PlatformEnum$Adapter;->write(Lcom/google/gson/stream/JsonWriter;Lcom/ibotta/tracking/generated/model/Body$PlatformEnum;)V

    return-void
.end method
