.class Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22$1;
.super Lcom/newrelic/com/google/gson/TypeAdapter;
.source "TypeAdapters.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22;->create(Lcom/newrelic/com/google/gson/Gson;Lcom/newrelic/com/google/gson/reflect/TypeToken;)Lcom/newrelic/com/google/gson/TypeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/newrelic/com/google/gson/TypeAdapter<",
        "Ljava/sql/Timestamp;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22;

.field final synthetic val$dateTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;


# direct methods
.method constructor <init>(Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22;Lcom/newrelic/com/google/gson/TypeAdapter;)V
    .locals 0

    .line 524
    iput-object p1, p0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22$1;->this$0:Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22;

    iput-object p2, p0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22$1;->val$dateTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-direct {p0}, Lcom/newrelic/com/google/gson/TypeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 524
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22$1;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/sql/Timestamp;

    move-result-object p1

    return-object p1
.end method

.method public read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/sql/Timestamp;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 526
    iget-object v0, p0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22$1;->val$dateTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-virtual {v0, p1}, Lcom/newrelic/com/google/gson/TypeAdapter;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    .line 527
    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 524
    check-cast p2, Ljava/sql/Timestamp;

    invoke-virtual {p0, p1, p2}, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22$1;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/sql/Timestamp;)V

    return-void
.end method

.method public write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/sql/Timestamp;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 531
    iget-object v0, p0, Lcom/newrelic/com/google/gson/internal/bind/TypeAdapters$22$1;->val$dateTypeAdapter:Lcom/newrelic/com/google/gson/TypeAdapter;

    invoke-virtual {v0, p1, p2}, Lcom/newrelic/com/google/gson/TypeAdapter;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V

    return-void
.end method
