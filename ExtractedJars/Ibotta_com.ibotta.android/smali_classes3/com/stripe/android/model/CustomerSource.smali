.class public Lcom/stripe/android/model/CustomerSource;
.super Lcom/stripe/android/model/StripeJsonModel;
.source "CustomerSource.java"

# interfaces
.implements Lcom/stripe/android/model/StripePaymentSource;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private mStripePaymentSource:Lcom/stripe/android/model/StripePaymentSource;


# direct methods
.method private constructor <init>(Lcom/stripe/android/model/StripePaymentSource;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/stripe/android/model/CustomerSource;->mStripePaymentSource:Lcom/stripe/android/model/StripePaymentSource;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/CustomerSource;
    .locals 3
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    const-string v1, "object"

    .line 94
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "card"

    .line 96
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 97
    invoke-static {p0}, Lcom/stripe/android/model/Card;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Card;

    move-result-object p0

    goto :goto_0

    :cond_1
    const-string v2, "source"

    .line 98
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 99
    invoke-static {p0}, Lcom/stripe/android/model/Source;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Source;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_3

    return-object v0

    .line 105
    :cond_3
    new-instance v0, Lcom/stripe/android/model/CustomerSource;

    invoke-direct {v0, p0}, Lcom/stripe/android/model/CustomerSource;-><init>(Lcom/stripe/android/model/StripePaymentSource;)V

    return-object v0
.end method


# virtual methods
.method public asCard()Lcom/stripe/android/model/Card;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 61
    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->mStripePaymentSource:Lcom/stripe/android/model/StripePaymentSource;

    instance-of v1, v0, Lcom/stripe/android/model/Card;

    if-eqz v1, :cond_0

    .line 62
    check-cast v0, Lcom/stripe/android/model/Card;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public asSource()Lcom/stripe/android/model/Source;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 38
    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->mStripePaymentSource:Lcom/stripe/android/model/StripePaymentSource;

    instance-of v1, v0, Lcom/stripe/android/model/Source;

    if-eqz v1, :cond_0

    .line 39
    check-cast v0, Lcom/stripe/android/model/Source;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->mStripePaymentSource:Lcom/stripe/android/model/StripePaymentSource;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Lcom/stripe/android/model/StripePaymentSource;->getId()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getSourceType()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 70
    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->mStripePaymentSource:Lcom/stripe/android/model/StripePaymentSource;

    instance-of v1, v0, Lcom/stripe/android/model/Card;

    if-eqz v1, :cond_0

    const-string v0, "card"

    return-object v0

    .line 72
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/model/Source;

    if-eqz v1, :cond_1

    .line 73
    check-cast v0, Lcom/stripe/android/model/Source;

    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getType()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "unknown"

    return-object v0
.end method

.method public getTokenizationMethod()Ljava/lang/String;
    .locals 4
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 46
    invoke-virtual {p0}, Lcom/stripe/android/model/CustomerSource;->asSource()Lcom/stripe/android/model/Source;

    move-result-object v0

    .line 47
    invoke-virtual {p0}, Lcom/stripe/android/model/CustomerSource;->asCard()Lcom/stripe/android/model/Card;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 48
    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "card"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 49
    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->getSourceTypeModel()Lcom/stripe/android/model/StripeSourceTypeModel;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/SourceCardData;

    if-eqz v0, :cond_1

    .line 51
    invoke-virtual {v0}, Lcom/stripe/android/model/SourceCardData;->getTokenizationMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    if-eqz v1, :cond_1

    .line 54
    invoke-virtual {v1}, Lcom/stripe/android/model/Card;->getTokenizationMethod()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->mStripePaymentSource:Lcom/stripe/android/model/StripePaymentSource;

    instance-of v1, v0, Lcom/stripe/android/model/Source;

    if-eqz v1, :cond_0

    .line 124
    check-cast v0, Lcom/stripe/android/model/Source;

    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 125
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/model/Card;

    if-eqz v1, :cond_1

    .line 126
    check-cast v0, Lcom/stripe/android/model/Card;

    invoke-virtual {v0}, Lcom/stripe/android/model/Card;->toJson()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0

    .line 128
    :cond_1
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    return-object v0
.end method

.method public toMap()Ljava/util/Map;
    .locals 2
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

    .line 112
    iget-object v0, p0, Lcom/stripe/android/model/CustomerSource;->mStripePaymentSource:Lcom/stripe/android/model/StripePaymentSource;

    instance-of v1, v0, Lcom/stripe/android/model/Source;

    if-eqz v1, :cond_0

    .line 113
    check-cast v0, Lcom/stripe/android/model/Source;

    invoke-virtual {v0}, Lcom/stripe/android/model/Source;->toMap()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 114
    :cond_0
    instance-of v1, v0, Lcom/stripe/android/model/Card;

    if-eqz v1, :cond_1

    .line 115
    check-cast v0, Lcom/stripe/android/model/Card;

    invoke-virtual {v0}, Lcom/stripe/android/model/Card;->toMap()Ljava/util/Map;

    move-result-object v0

    return-object v0

    .line 117
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    return-object v0
.end method
