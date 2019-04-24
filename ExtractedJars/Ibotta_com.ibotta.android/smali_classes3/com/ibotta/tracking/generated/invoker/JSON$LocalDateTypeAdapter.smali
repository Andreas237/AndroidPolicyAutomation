.class public Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "JSON.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/tracking/generated/invoker/JSON;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "LocalDateTypeAdapter"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Lorg/threeten/bp/LocalDate;",
        ">;"
    }
.end annotation


# instance fields
.field private formatter:Lorg/threeten/bp/format/DateTimeFormatter;

.field final synthetic this$0:Lcom/ibotta/tracking/generated/invoker/JSON;


# direct methods
.method public constructor <init>(Lcom/ibotta/tracking/generated/invoker/JSON;)V
    .locals 1

    .line 230
    sget-object v0, Lorg/threeten/bp/format/DateTimeFormatter;->ISO_LOCAL_DATE:Lorg/threeten/bp/format/DateTimeFormatter;

    invoke-direct {p0, p1, v0}, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;-><init>(Lcom/ibotta/tracking/generated/invoker/JSON;Lorg/threeten/bp/format/DateTimeFormatter;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/tracking/generated/invoker/JSON;Lorg/threeten/bp/format/DateTimeFormatter;)V
    .locals 0

    .line 233
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;->this$0:Lcom/ibotta/tracking/generated/invoker/JSON;

    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 234
    iput-object p2, p0, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;->formatter:Lorg/threeten/bp/format/DateTimeFormatter;

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

    .line 225
    invoke-virtual {p0, p1}, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Lorg/threeten/bp/LocalDate;

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/google/gson/stream/JsonReader;)Lorg/threeten/bp/LocalDate;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 252
    sget-object v0, Lcom/ibotta/tracking/generated/invoker/JSON$1;->$SwitchMap$com$google$gson$stream$JsonToken:[I

    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->peek()Lcom/google/gson/stream/JsonToken;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/stream/JsonToken;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 257
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    .line 258
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;->formatter:Lorg/threeten/bp/format/DateTimeFormatter;

    invoke-static {p1, v0}, Lorg/threeten/bp/LocalDate;->parse(Ljava/lang/CharSequence;Lorg/threeten/bp/format/DateTimeFormatter;)Lorg/threeten/bp/LocalDate;

    move-result-object p1

    return-object p1

    .line 254
    :cond_0
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextNull()V

    const/4 p1, 0x0

    return-object p1
.end method

.method public setFormat(Lorg/threeten/bp/format/DateTimeFormatter;)V
    .locals 0

    .line 238
    iput-object p1, p0, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;->formatter:Lorg/threeten/bp/format/DateTimeFormatter;

    return-void
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 225
    check-cast p2, Lorg/threeten/bp/LocalDate;

    invoke-virtual {p0, p1, p2}, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Lorg/threeten/bp/LocalDate;)V

    return-void
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Lorg/threeten/bp/LocalDate;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 244
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    goto :goto_0

    .line 246
    :cond_0
    iget-object v0, p0, Lcom/ibotta/tracking/generated/invoker/JSON$LocalDateTypeAdapter;->formatter:Lorg/threeten/bp/format/DateTimeFormatter;

    invoke-virtual {v0, p2}, Lorg/threeten/bp/format/DateTimeFormatter;->format(Lorg/threeten/bp/temporal/TemporalAccessor;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    :goto_0
    return-void
.end method
