.class public Lcom/stripe/android/model/SourceSepaDebitData;
.super Lcom/stripe/android/model/StripeSourceTypeModel;
.source "SourceSepaDebitData.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private mBankCode:Ljava/lang/String;

.field private mBranchCode:Ljava/lang/String;

.field private mCountry:Ljava/lang/String;

.field private mFingerPrint:Ljava/lang/String;

.field private mLast4:Ljava/lang/String;

.field private mMandateReference:Ljava/lang/String;

.field private mMandateUrl:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 7

    .line 40
    invoke-direct {p0}, Lcom/stripe/android/model/StripeSourceTypeModel;-><init>()V

    const-string v0, "bank_code"

    const-string v1, "branch_code"

    const-string v2, "country"

    const-string v3, "fingerprint"

    const-string v4, "last4"

    const-string v5, "mandate_reference"

    const-string v6, "mandate_url"

    .line 41
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/model/SourceSepaDebitData;->addStandardFields([Ljava/lang/String;)V

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceSepaDebitData;
    .locals 3
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 57
    :cond_0
    new-instance v0, Lcom/stripe/android/model/SourceSepaDebitData;

    invoke-direct {v0}, Lcom/stripe/android/model/SourceSepaDebitData;-><init>()V

    const-string v1, "bank_code"

    .line 58
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/model/SourceSepaDebitData;->setBankCode(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;

    move-result-object v1

    const-string v2, "branch_code"

    .line 59
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceSepaDebitData;->setBranchCode(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;

    move-result-object v1

    const-string v2, "country"

    .line 60
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceSepaDebitData;->setCountry(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;

    move-result-object v1

    const-string v2, "fingerprint"

    .line 61
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceSepaDebitData;->setFingerPrint(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;

    move-result-object v1

    const-string v2, "last4"

    .line 62
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceSepaDebitData;->setLast4(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;

    move-result-object v1

    const-string v2, "mandate_reference"

    .line 63
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceSepaDebitData;->setMandateReference(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;

    move-result-object v1

    const-string v2, "mandate_url"

    .line 64
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceSepaDebitData;->setMandateUrl(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;

    .line 66
    iget-object v1, v0, Lcom/stripe/android/model/SourceSepaDebitData;->mStandardFields:Ljava/util/Set;

    .line 67
    invoke-static {p0, v1}, Lcom/stripe/android/model/SourceSepaDebitData;->jsonObjectToMapWithoutKeys(Lorg/json/JSONObject;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 69
    invoke-virtual {v0, p0}, Lcom/stripe/android/model/SourceSepaDebitData;->setAdditionalFields(Ljava/util/Map;)V

    :cond_1
    return-object v0
.end method

.method private setBankCode(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mBankCode:Ljava/lang/String;

    return-object p0
.end method

.method private setBranchCode(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mBranchCode:Ljava/lang/String;

    return-object p0
.end method

.method private setCountry(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mCountry:Ljava/lang/String;

    return-object p0
.end method

.method private setFingerPrint(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mFingerPrint:Ljava/lang/String;

    return-object p0
.end method

.method private setLast4(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mLast4:Ljava/lang/String;

    return-object p0
.end method

.method private setMandateReference(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mMandateReference:Ljava/lang/String;

    return-object p0
.end method

.method private setMandateUrl(Ljava/lang/String;)Lcom/stripe/android/model/SourceSepaDebitData;
    .locals 0

    .line 176
    iput-object p1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mMandateUrl:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public toJson()Lorg/json/JSONObject;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 105
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "bank_code"

    .line 106
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mBankCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "branch_code"

    .line 107
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mBranchCode:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "country"

    .line 108
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mCountry:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "fingerprint"

    .line 109
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mFingerPrint:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "last4"

    .line 110
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mLast4:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mandate_reference"

    .line 111
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mMandateReference:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mandate_url"

    .line 112
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mMandateUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    iget-object v1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mAdditionalFields:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/stripe/android/model/SourceSepaDebitData;->putAdditionalFieldsIntoJsonObject(Lorg/json/JSONObject;Ljava/util/Map;)V

    return-object v0
.end method

.method public toMap()Ljava/util/Map;
    .locals 3
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

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "bank_code"

    .line 122
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mBankCode:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "branch_code"

    .line 123
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mBranchCode:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "country"

    .line 124
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mCountry:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "fingerprint"

    .line 125
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mFingerPrint:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last4"

    .line 126
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mLast4:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "mandate_reference"

    .line 127
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mMandateReference:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "mandate_url"

    .line 128
    iget-object v2, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mMandateUrl:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    iget-object v1, p0, Lcom/stripe/android/model/SourceSepaDebitData;->mAdditionalFields:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/stripe/android/model/SourceSepaDebitData;->putAdditionalFieldsIntoMap(Ljava/util/Map;Ljava/util/Map;)V

    .line 131
    invoke-static {v0}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    return-object v0
.end method
