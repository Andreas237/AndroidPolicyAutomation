.class public Lcom/newrelic/agent/android/payload/Payload;
.super Ljava/lang/Object;
.source "Payload.java"


# instance fields
.field private isPersistable:Z

.field private payload:Ljava/nio/ByteBuffer;

.field private final timestamp:J

.field private final uuid:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lcom/newrelic/agent/android/payload/Payload;->isPersistable:Z

    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Lcom/newrelic/agent/android/payload/Payload;->timestamp:J

    .line 18
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/newrelic/agent/android/payload/Payload;->uuid:Ljava/lang/String;

    .line 19
    iput-boolean v0, p0, Lcom/newrelic/agent/android/payload/Payload;->isPersistable:Z

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/newrelic/agent/android/payload/Payload;-><init>()V

    .line 24
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/payload/Payload;->payload:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public asJsonMeta()Ljava/lang/String;
    .locals 1

    .line 71
    invoke-virtual {p0}, Lcom/newrelic/agent/android/payload/Payload;->asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;

    move-result-object v0

    invoke-virtual {v0}, Lcom/newrelic/com/google/gson/JsonObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public asJsonObject()Lcom/newrelic/com/google/gson/JsonObject;
    .locals 4

    .line 64
    new-instance v0, Lcom/newrelic/com/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/newrelic/com/google/gson/JsonObject;-><init>()V

    const-string v1, "timestamp"

    .line 65
    iget-wide v2, p0, Lcom/newrelic/agent/android/payload/Payload;->timestamp:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    const-string v1, "uuid"

    .line 66
    iget-object v2, p0, Lcom/newrelic/agent/android/payload/Payload;->uuid:Ljava/lang/String;

    invoke-static {v2}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/newrelic/com/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/newrelic/com/google/gson/JsonElement;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 57
    instance-of v0, p1, Lcom/newrelic/agent/android/payload/Payload;

    if-eqz v0, :cond_0

    .line 58
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/Payload;->uuid:Ljava/lang/String;

    check-cast p1, Lcom/newrelic/agent/android/payload/Payload;

    iget-object p1, p1, Lcom/newrelic/agent/android/payload/Payload;->uuid:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public getBytes()[B
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/Payload;->payload:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    return-object v0
.end method

.method public getTimestamp()J
    .locals 2

    .line 32
    iget-wide v0, p0, Lcom/newrelic/agent/android/payload/Payload;->timestamp:J

    return-wide v0
.end method

.method public getUuid()Ljava/lang/String;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/newrelic/agent/android/payload/Payload;->uuid:Ljava/lang/String;

    return-object v0
.end method

.method public isPersisted()Z
    .locals 1

    .line 52
    iget-boolean v0, p0, Lcom/newrelic/agent/android/payload/Payload;->isPersistable:Z

    return v0
.end method

.method public isStale(J)Z
    .locals 3

    .line 40
    iget-wide v0, p0, Lcom/newrelic/agent/android/payload/Payload;->timestamp:J

    add-long/2addr v0, p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    cmp-long v2, v0, p1

    if-gtz v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public putBytes([B)V
    .locals 0

    .line 44
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/payload/Payload;->payload:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public setPersisted(Z)V
    .locals 0

    .line 48
    iput-boolean p1, p0, Lcom/newrelic/agent/android/payload/Payload;->isPersistable:Z

    return-void
.end method
