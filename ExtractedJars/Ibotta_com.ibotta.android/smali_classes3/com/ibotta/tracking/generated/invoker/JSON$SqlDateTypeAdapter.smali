.class public Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "JSON.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/tracking/generated/invoker/JSON;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SqlDateTypeAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Ljava/sql/Date;",
        ">;"
    }
.end annotation


# instance fields
.field private dateFormat:Ljava/text/DateFormat;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 282
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/text/DateFormat;)V
    .locals 0

    .line 285
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 286
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;->dateFormat:Ljava/text/DateFormat;

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

    .line 278
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/sql/Date;

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/sql/Date;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 310
    sget-object v0, Lcom/ibotta/tracking/generated/invoker/JSON$1;->$SwitchMap$com$google$gson$stream$JsonToken:[I

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/stream/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 315
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    .line 317
    :try_start_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;->dateFormat:Ljava/text/DateFormat;

    if-eqz v0, :cond_0

    .line 318
    new-instance v0, Ljava/sql/Date;

    iget-object v1, p0, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;->dateFormat:Ljava/text/DateFormat;

    invoke-virtual {v1, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Date;-><init>(J)V

    return-object v0

    .line 320
    :cond_0
    new-instance v0, Ljava/sql/Date;

    new-instance v1, Ljava/text/ParsePosition;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ljava/text/ParsePosition;-><init>(I)V

    invoke-static {p1, v1}, Lcom/google/gson/internal/bind/util/ISO8601Utils;->parse(Ljava/lang/String;Ljava/text/ParsePosition;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Date;-><init>(J)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 322
    new-instance v0, Lcom/google/gson/JsonParseException;

    invoke-direct {v0, p1}, Lcom/google/gson/JsonParseException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 312
    :cond_1
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public setFormat(Ljava/text/DateFormat;)V
    .locals 0

    .line 290
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;->dateFormat:Ljava/text/DateFormat;

    return-void
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 278
    check-cast p2, Ljava/sql/Date;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/sql/Date;)V

    return-void
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/sql/Date;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 296
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    goto :goto_1

    .line 299
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON$SqlDateTypeAdapter;->dateFormat:Ljava/text/DateFormat;

    if-eqz v0, :cond_1

    .line 300
    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 302
    :cond_1
    invoke-virtual {p2}, Ljava/sql/Date;->toString()Ljava/lang/String;

    move-result-object p2

    .line 304
    :goto_0
    invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    :goto_1
    return-void
.end method
