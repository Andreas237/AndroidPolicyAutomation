.class public Lcom/stripe/android/model/SourceReceiver;
.super Lcom/stripe/android/model/StripeJsonModel;
.source "SourceReceiver.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private mAddress:Ljava/lang/String;

.field private mAmountCharged:J

.field private mAmountReceived:J

.field private mAmountReturned:J


# direct methods
.method constructor <init>(Ljava/lang/String;JJJ)V
    .locals 0

    .line 34
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/stripe/android/model/SourceReceiver;->mAddress:Ljava/lang/String;

    .line 36
    iput-wide p2, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountCharged:J

    .line 37
    iput-wide p4, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountReceived:J

    .line 38
    iput-wide p6, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountReturned:J

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceReceiver;
    .locals 9
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "address"

    .line 118
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 119
    new-instance v0, Lcom/stripe/android/model/SourceReceiver;

    const-string v1, "amount_charged"

    .line 120
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    const-string v1, "amount_received"

    .line 121
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v5

    const-string v1, "amount_returned"

    .line 122
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v7

    move-object v1, v0

    invoke-direct/range {v1 .. v8}, Lcom/stripe/android/model/SourceReceiver;-><init>(Ljava/lang/String;JJJ)V

    return-object v0
.end method


# virtual methods
.method public toJson()Lorg/json/JSONObject;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 90
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "address"

    .line 91
    iget-object v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAddress:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    const-string v1, "amount_charged"

    .line 93
    iget-wide v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountCharged:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "amount_received"

    .line 94
    iget-wide v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountReceived:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v1, "amount_returned"

    .line 95
    iget-wide v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountReturned:J

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object v0
.end method

.method public toMap()Ljava/util/Map;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 76
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 77
    iget-object v1, p0, Lcom/stripe/android/model/SourceReceiver;->mAddress:Ljava/lang/String;

    invoke-static {v1}, Lcom/stripe/android/StripeTextUtils;->isBlank(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "address"

    .line 78
    iget-object v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAddress:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v1, "address"

    .line 80
    iget-object v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAddress:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "amount_charged"

    .line 81
    iget-wide v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountCharged:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "amount_received"

    .line 82
    iget-wide v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountReceived:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "amount_returned"

    .line 83
    iget-wide v2, p0, Lcom/stripe/android/model/SourceReceiver;->mAmountReturned:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
