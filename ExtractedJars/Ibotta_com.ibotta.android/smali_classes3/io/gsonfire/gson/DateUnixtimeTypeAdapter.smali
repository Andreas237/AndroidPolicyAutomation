.class abstract Lio/gsonfire/gson/DateUnixtimeTypeAdapter;
.super Lcom/google/gson/TypeAdapter;
.source "DateUnixtimeTypeAdapter.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/gson/TypeAdapter<",
        "Ljava/util/Date;",
        ">;"
    }
.end annotation


# instance fields
.field private final allowNegativeTimestamp:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/google/gson/TypeAdapter;-><init>()V

    .line 18
    iput-boolean p1, p0, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;->allowNegativeTimestamp:Z

    return-void
.end method


# virtual methods
.method protected abstract fromTimestamp(J)Ljava/util/Date;
.end method

.method public bridge synthetic read(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    invoke-virtual {p0, p1}, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;->read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method public final read(Lcom/google/gson/stream/JsonReader;)Ljava/util/Date;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 33
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonReader;->nextLong()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    .line 34
    iget-boolean p1, p0, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;->allowNegativeTimestamp:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 35
    :cond_1
    :goto_0
    invoke-virtual {p0, v0, v1}, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;->fromTimestamp(J)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method protected abstract toTimestamp(Ljava/util/Date;)J
.end method

.method public bridge synthetic write(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    check-cast p2, Ljava/util/Date;

    invoke-virtual {p0, p1, p2}, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;->write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Date;)V

    return-void
.end method

.method public final write(Lcom/google/gson/stream/JsonWriter;Ljava/util/Date;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 23
    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_1

    .line 24
    iget-boolean v0, p0, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;->allowNegativeTimestamp:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/google/gson/stream/JsonWriter;->nullValue()Lcom/google/gson/stream/JsonWriter;

    goto :goto_1

    .line 25
    :cond_1
    :goto_0
    invoke-virtual {p0, p2}, Lio/gsonfire/gson/DateUnixtimeTypeAdapter;->toTimestamp(Ljava/util/Date;)J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lcom/google/gson/stream/JsonWriter;->value(J)Lcom/google/gson/stream/JsonWriter;

    :goto_1
    return-void
.end method
