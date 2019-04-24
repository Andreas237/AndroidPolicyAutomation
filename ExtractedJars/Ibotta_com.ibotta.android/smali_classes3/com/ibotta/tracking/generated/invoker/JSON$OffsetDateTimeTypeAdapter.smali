.class public Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "JSON.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/tracking/generated/invoker/JSON;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OffsetDateTimeTypeAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Lorg/threeten/bp/OffsetDateTime;",
        ">;"
    }
.end annotation


# instance fields
.field private formatter:Lorg/threeten/bp/format/DateTimeFormatter;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 186
    sget-object v0, Lorg/threeten/bp/format/DateTimeFormatter;->ISO_OFFSET_DATE_TIME:Lorg/threeten/bp/format/DateTimeFormatter;

    invoke-direct {p0, v0}, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;-><init>(Lorg/threeten/bp/format/DateTimeFormatter;)V

    return-void
.end method

.method public constructor <init>(Lorg/threeten/bp/format/DateTimeFormatter;)V
    .locals 0

    .line 189
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 190
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;->formatter:Lorg/threeten/bp/format/DateTimeFormatter;

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

    .line 181
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Lorg/threeten/bp/OffsetDateTime;

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/google/gson/stream/JsonReader;)Lorg/threeten/bp/OffsetDateTime;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 208
    sget-object v0, Lcom/ibotta/tracking/generated/invoker/JSON$1;->$SwitchMap$com$google$gson$stream$JsonToken:[I

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/stream/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    .line 213
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "+0000"

    .line 214
    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x5

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "Z"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;->formatter:Lorg/threeten/bp/format/DateTimeFormatter;

    invoke-static {p1, v0}, Lorg/threeten/bp/OffsetDateTime;->parse(Ljava/lang/CharSequence;Lorg/threeten/bp/format/DateTimeFormatter;)Lorg/threeten/bp/OffsetDateTime;

    move-result-object p1

    return-object p1

    .line 210
    :cond_1
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public setFormat(Lorg/threeten/bp/format/DateTimeFormatter;)V
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;->formatter:Lorg/threeten/bp/format/DateTimeFormatter;

    return-void
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 181
    check-cast p2, Lorg/threeten/bp/OffsetDateTime;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Lorg/threeten/bp/OffsetDateTime;)V

    return-void
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Lorg/threeten/bp/OffsetDateTime;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 200
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    goto :goto_0

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON$OffsetDateTimeTypeAdapter;->formatter:Lorg/threeten/bp/format/DateTimeFormatter;

    invoke-virtual {v0, p2}, Lorg/threeten/bp/format/DateTimeFormatter;->format(Lorg/threeten/bp/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    :goto_0
    return-void
.end method
