.class Lcom/newrelic/com/google/gson/Gson$4;
.super Lcom/newrelic/com/google/gson/TypeAdapter;
.source "Gson.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/com/google/gson/Gson;->floatAdapter(Z)Lcom/newrelic/com/google/gson/TypeAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/newrelic/com/google/gson/TypeAdapter<",
        "Ljava/lang/Number;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/com/google/gson/Gson;


# direct methods
.method constructor <init>(Lcom/newrelic/com/google/gson/Gson;)V
    .locals 0

    .line 274
    iput-object p1, p0, Lcom/newrelic/com/google/gson/Gson$4;->this$0:Lcom/newrelic/com/google/gson/Gson;

    invoke-direct {p0}, Lcom/newrelic/com/google/gson/TypeAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Float;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 276
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->peek()Lcom/newrelic/com/google/gson/stream/JsonToken;

    move-result-object v0

    sget-object v1, Lcom/newrelic/com/google/gson/stream/JsonToken;->NULL:Lcom/newrelic/com/google/gson/stream/JsonToken;

    if-ne v0, v1, :cond_0

    .line 277
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->nextNull()V

    const/4 p1, 0x0

    return-object p1

    .line 280
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonReader;->nextDouble()D

    move-result-wide v0

    double-to-float p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 274
    invoke-virtual {p0, p1}, Lcom/newrelic/com/google/gson/Gson$4;->read(Lcom/newrelic/com/google/gson/stream/JsonReader;)Ljava/lang/Float;

    move-result-object p1

    return-object p1
.end method

.method public write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Number;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 284
    invoke-virtual {p1}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->nullValue()Lcom/newrelic/com/google/gson/stream/JsonWriter;

    return-void

    .line 287
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result v0

    .line 288
    iget-object v1, p0, Lcom/newrelic/com/google/gson/Gson$4;->this$0:Lcom/newrelic/com/google/gson/Gson;

    float-to-double v2, v0

    invoke-static {v1, v2, v3}, Lcom/newrelic/com/google/gson/Gson;->access$000(Lcom/newrelic/com/google/gson/Gson;D)V

    .line 289
    invoke-virtual {p1, p2}, Lcom/newrelic/com/google/gson/stream/JsonWriter;->value(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/stream/JsonWriter;

    return-void
.end method

.method public bridge synthetic write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 274
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p0, p1, p2}, Lcom/newrelic/com/google/gson/Gson$4;->write(Lcom/newrelic/com/google/gson/stream/JsonWriter;Ljava/lang/Number;)V

    return-void
.end method
