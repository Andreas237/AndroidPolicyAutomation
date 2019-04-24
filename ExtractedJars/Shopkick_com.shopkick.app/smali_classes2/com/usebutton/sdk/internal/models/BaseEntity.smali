.class public abstract Lcom/usebutton/sdk/internal/models/BaseEntity;
.super Ljava/lang/Object;
.source "BaseEntity.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "BaseEntity"


# instance fields
.field private final mData:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 28
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/models/BaseEntity;-><init>(Lorg/json/JSONObject;)V

    return-void
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    const-string/jumbo p1, "type"

    .line 34
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/models/BaseEntity;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/usebutton/sdk/internal/models/BaseEntity;->setValue(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static actualIdentifierName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "custom"

    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 101
    invoke-static {}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object p0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getApplicationId()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public accumulateArray(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/usebutton/sdk/internal/models/BaseEntity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 109
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    invoke-virtual {v0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-nez v0, :cond_0

    .line 111
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 112
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    invoke-virtual {v1, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 114
    :cond_0
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/BaseEntity;->getData()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 116
    :catch_0
    sget-object v0, Lcom/usebutton/sdk/internal/models/BaseEntity;->TAG:Ljava/lang/String;

    const-string v1, "Couldn\'t accumulate %s on entity %s under %s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p2, v2, v3

    const/4 p2, 0x1

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, p2

    const/4 p2, 0x2

    aput-object p1, v2, p2

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public getData()Lorg/json/JSONObject;
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    return-object v0
.end method

.method protected abstract getType()Ljava/lang/String;
.end method

.method public putIdentifier(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 88
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    const-string v1, "identifiers"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-nez v0, :cond_0

    .line 90
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 91
    iget-object v1, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    const-string v2, "identifiers"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    :cond_0
    invoke-static {p1}, Lcom/usebutton/sdk/internal/models/BaseEntity;->actualIdentifierName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 95
    :catch_0
    sget-object v0, Lcom/usebutton/sdk/internal/models/BaseEntity;->TAG:Ljava/lang/String;

    const-string v1, "Couldn\'t add identifier: to entity %s=%s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    const/4 p1, 0x2

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    aput-object p2, v2, p1

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setValue(Ljava/lang/String;D)V
    .locals 4

    .line 64
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 66
    :catch_0
    sget-object v0, Lcom/usebutton/sdk/internal/models/BaseEntity;->TAG:Ljava/lang/String;

    const-string v1, "Couldn\'t add value for name %s: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    aput-object p2, v2, p1

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setValue(Ljava/lang/String;Lcom/usebutton/sdk/internal/models/BaseEntity;)V
    .locals 4

    .line 55
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/models/BaseEntity;->getData()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 57
    :catch_0
    sget-object v0, Lcom/usebutton/sdk/internal/models/BaseEntity;->TAG:Ljava/lang/String;

    const-string v1, "Couldn\'t add value for name %s: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setValue(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 73
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 75
    :catch_0
    sget-object v0, Lcom/usebutton/sdk/internal/models/BaseEntity;->TAG:Ljava/lang/String;

    const-string v1, "Couldn\'t add value for name %s: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public setValue(Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 4

    .line 46
    :try_start_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/models/BaseEntity;->mData:Lorg/json/JSONObject;

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 48
    :catch_0
    sget-object v0, Lcom/usebutton/sdk/internal/models/BaseEntity;->TAG:Ljava/lang/String;

    const-string v1, "Couldn\'t add value for name %s: %s"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object p2, v2, p1

    invoke-static {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
