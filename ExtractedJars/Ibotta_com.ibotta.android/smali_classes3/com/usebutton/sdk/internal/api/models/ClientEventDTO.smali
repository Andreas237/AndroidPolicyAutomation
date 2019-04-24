.class public Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;
.super Ljava/lang/Object;
.source "ClientEventDTO.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private mEventName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mEventProperties:Lorg/json/JSONObject;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mSequenceNumber:I
    .annotation build Landroid/support/annotation/IntRange;
        from = 0x0L
    .end annotation
.end field

.field private mTime:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mUuid:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;ILjava/util/UUID;Ljava/lang/String;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mEventName:Ljava/lang/String;

    .line 34
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mEventProperties:Lorg/json/JSONObject;

    .line 35
    iput p3, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mSequenceNumber:I

    .line 36
    invoke-virtual {p4}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mUuid:Ljava/lang/String;

    .line 37
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mTime:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lorg/json/JSONObject;Ljava/util/UUID;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mEventName:Ljava/lang/String;

    .line 45
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mEventProperties:Lorg/json/JSONObject;

    .line 46
    invoke-virtual {p3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mUuid:Ljava/lang/String;

    .line 47
    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mTime:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getName()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mEventName:Ljava/lang/String;

    return-object v0
.end method

.method public getProperties()Lorg/json/JSONObject;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mEventProperties:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getSequenceNumber()I
    .locals 1

    .line 71
    iget v0, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mSequenceNumber:I

    return v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mTime:Ljava/lang/String;

    return-object v0
.end method

.method public getUuid()Ljava/lang/String;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mUuid:Ljava/lang/String;

    return-object v0
.end method

.method public setSequenceNumber(I)V
    .locals 0

    .line 92
    iput p1, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mSequenceNumber:I

    return-void
.end method

.method public toJsonObject()Lorg/json/JSONObject;
    .locals 3

    .line 51
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "name"

    .line 53
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mEventName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "value"

    .line 54
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mEventProperties:Lorg/json/JSONObject;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "seqn"

    .line 55
    iget v2, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mSequenceNumber:I

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    const-string v1, "uuid"

    .line 56
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mUuid:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "time"

    .line 57
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->mTime:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 60
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 67
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->toJsonObject()Lorg/json/JSONObject;

    move-result-object v0

    instance-of v1, v0, Lorg/json/JSONObject;

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->toString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
