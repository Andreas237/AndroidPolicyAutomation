.class public final Lio/gsonfire/gson/DateRFC3339TypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "DateRFC3339TypeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Ljava/util/Date;",
        ">;"
    }
.end annotation


# instance fields
.field private final dateFormatThreadLocal:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/text/DateFormat;",
            ">;"
        }
    .end annotation
.end field

.field private final serializationTimezone:Ljava/util/TimeZone;

.field private final serializeTime:Z


# direct methods
.method public constructor <init>(Ljava/util/TimeZone;Z)V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 21
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->dateFormatThreadLocal:Ljava/lang/ThreadLocal;

    .line 34
    iput-object p1, p0, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->serializationTimezone:Ljava/util/TimeZone;

    .line 35
    iput-boolean p2, p0, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->serializeTime:Z

    return-void
.end method

.method private getDateFormat()Ljava/text/DateFormat;
    .locals 3

    .line 39
    iget-object v0, p0, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->dateFormatThreadLocal:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    if-nez v0, :cond_0

    .line 41
    new-instance v0, Lio/gsonfire/util/RFC3339DateFormat;

    iget-object v1, p0, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->serializationTimezone:Ljava/util/TimeZone;

    iget-boolean v2, p0, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->serializeTime:Z

    invoke-direct {v0, v1, v2}, Lio/gsonfire/util/RFC3339DateFormat;-><init>(Ljava/util/TimeZone;Z)V

    .line 42
    iget-object v1, p0, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->dateFormatThreadLocal:Ljava/lang/ThreadLocal;

    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    return-object v0
.end method


# virtual methods
.method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17
    invoke-virtual {p0, p1}, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Date;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 56
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextString()Ljava/lang/String;

    move-result-object p1

    .line 58
    :try_start_0
    invoke-direct {p0}, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->getDateFormat()Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    .line 60
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Could not parse date "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 17
    check-cast p2, Ljava/util/Date;

    invoke-virtual {p0, p1, p2}, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Date;)V

    return-void
.end method

.method public write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Date;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 51
    invoke-direct {p0}, Lio/gsonfire/gson/DateRFC3339TypeAdapter;->getDateFormat()Ljava/text/DateFormat;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/gson/stream/JsonWriter;->value(Ljava/lang/String;)Lcom/google/gson/stream/JsonWriter;

    return-void
.end method
