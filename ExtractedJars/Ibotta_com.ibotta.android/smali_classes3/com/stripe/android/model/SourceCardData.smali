.class public Lcom/stripe/android/model/SourceCardData;
.super Lcom/stripe/android/model/StripeSourceTypeModel;
.source "SourceCardData.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/model/SourceCardData$ThreeDSecureStatus;
    }
.end annotation


# instance fields
.field private mAddressLine1Check:Ljava/lang/String;

.field private mAddressZipCheck:Ljava/lang/String;

.field private mBrand:Ljava/lang/String;

.field private mCountry:Ljava/lang/String;

.field private mCvcCheck:Ljava/lang/String;

.field private mDynamicLast4:Ljava/lang/String;

.field private mExpiryMonth:Ljava/lang/Integer;

.field private mExpiryYear:Ljava/lang/Integer;

.field private mFunding:Ljava/lang/String;

.field private mLast4:Ljava/lang/String;

.field private mThreeDSecureStatus:Ljava/lang/String;

.field private mTokenizationMethod:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 12

    .line 68
    invoke-direct {p0}, Lcom/stripe/android/model/StripeSourceTypeModel;-><init>()V

    const-string v0, "address_line1_check"

    const-string v1, "address_zip_check"

    const-string v2, "brand"

    const-string v3, "country"

    const-string v4, "cvc_check"

    const-string v5, "dynamic_last4"

    const-string v6, "exp_month"

    const-string v7, "exp_year"

    const-string v8, "funding"

    const-string v9, "last4"

    const-string v10, "three_d_secure"

    const-string v11, "tokenization_method"

    .line 69
    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/stripe/android/model/SourceCardData;->addStandardFields([Ljava/lang/String;)V

    return-void
.end method

.method static asThreeDSecureStatus(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 290
    invoke-static {p0}, Lcom/stripe/android/model/StripeJsonUtils;->nullIfNullOrEmpty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "required"

    .line 295
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p0, "required"

    return-object p0

    :cond_1
    const-string v0, "optional"

    .line 297
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p0, "optional"

    return-object p0

    :cond_2
    const-string v0, "not_supported"

    .line 299
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    const-string p0, "not_supported"

    return-object p0

    :cond_3
    const-string p0, "unknown"

    return-object p0
.end method

.method static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceCardData;
    .locals 3
    .param p0    # Lorg/json/JSONObject;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 254
    :cond_0
    new-instance v0, Lcom/stripe/android/model/SourceCardData;

    invoke-direct {v0}, Lcom/stripe/android/model/SourceCardData;-><init>()V

    const-string v1, "address_line1_check"

    .line 255
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/stripe/android/model/SourceCardData;->setAddressLine1Check(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "address_zip_check"

    .line 256
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setAddressZipCheck(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "brand"

    .line 257
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/model/Card;->asCardBrand(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setBrand(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "country"

    .line 258
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setCountry(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "cvc_check"

    .line 259
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setCvcCheck(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "dynamic_last4"

    .line 260
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setDynamicLast4(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "exp_month"

    .line 261
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optInteger(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setExpiryMonth(Ljava/lang/Integer;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "exp_year"

    .line 262
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optInteger(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setExpiryYear(Ljava/lang/Integer;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "funding"

    .line 263
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/model/Card;->asFundingType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setFunding(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "last4"

    .line 264
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setLast4(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "three_d_secure"

    .line 265
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/stripe/android/model/SourceCardData;->asThreeDSecureStatus(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setThreeDSecureStatus(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    move-result-object v1

    const-string v2, "tokenization_method"

    .line 267
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/stripe/android/model/SourceCardData;->setTokenizationMethod(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;

    .line 269
    iget-object v1, v0, Lcom/stripe/android/model/SourceCardData;->mStandardFields:Ljava/util/Set;

    .line 270
    invoke-static {p0, v1}, Lcom/stripe/android/model/SourceCardData;->jsonObjectToMapWithoutKeys(Lorg/json/JSONObject;Ljava/util/Set;)Ljava/util/Map;

    move-result-object p0

    if-eqz p0, :cond_1

    .line 272
    invoke-virtual {v0, p0}, Lcom/stripe/android/model/SourceCardData;->setAdditionalFields(Ljava/util/Map;)V

    :cond_1
    return-object v0
.end method

.method private setAddressLine1Check(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 189
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mAddressLine1Check:Ljava/lang/String;

    return-object p0
.end method

.method private setAddressZipCheck(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 194
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mAddressZipCheck:Ljava/lang/String;

    return-object p0
.end method

.method private setBrand(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mBrand:Ljava/lang/String;

    return-object p0
.end method

.method private setCountry(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mCountry:Ljava/lang/String;

    return-object p0
.end method

.method private setCvcCheck(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mCvcCheck:Ljava/lang/String;

    return-object p0
.end method

.method private setDynamicLast4(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mDynamicLast4:Ljava/lang/String;

    return-object p0
.end method

.method private setExpiryMonth(Ljava/lang/Integer;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 219
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mExpiryMonth:Ljava/lang/Integer;

    return-object p0
.end method

.method private setExpiryYear(Ljava/lang/Integer;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 224
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mExpiryYear:Ljava/lang/Integer;

    return-object p0
.end method

.method private setFunding(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 229
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mFunding:Ljava/lang/String;

    return-object p0
.end method

.method private setLast4(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 234
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mLast4:Ljava/lang/String;

    return-object p0
.end method

.method private setThreeDSecureStatus(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 239
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mThreeDSecureStatus:Ljava/lang/String;

    return-object p0
.end method

.method private setTokenizationMethod(Ljava/lang/String;)Lcom/stripe/android/model/SourceCardData;
    .locals 0

    .line 244
    iput-object p1, p0, Lcom/stripe/android/model/SourceCardData;->mTokenizationMethod:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public getBrand()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/stripe/android/model/SourceCardData;->mBrand:Ljava/lang/String;

    return-object v0
.end method

.method public getExpiryMonth()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/stripe/android/model/SourceCardData;->mExpiryMonth:Ljava/lang/Integer;

    return-object v0
.end method

.method public getExpiryYear()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 122
    iget-object v0, p0, Lcom/stripe/android/model/SourceCardData;->mExpiryYear:Ljava/lang/Integer;

    return-object v0
.end method

.method public getFunding()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 128
    iget-object v0, p0, Lcom/stripe/android/model/SourceCardData;->mFunding:Ljava/lang/String;

    return-object v0
.end method

.method public getLast4()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/stripe/android/model/SourceCardData;->mLast4:Ljava/lang/String;

    return-object v0
.end method

.method public getTokenizationMethod()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 144
    iget-object v0, p0, Lcom/stripe/android/model/SourceCardData;->mTokenizationMethod:Ljava/lang/String;

    return-object v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 150
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "address_line1_check"

    .line 151
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mAddressLine1Check:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "address_zip_check"

    .line 152
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mAddressZipCheck:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "brand"

    .line 153
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mBrand:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "country"

    .line 154
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mCountry:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "dynamic_last4"

    .line 155
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mDynamicLast4:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "exp_month"

    .line 156
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mExpiryMonth:Ljava/lang/Integer;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putIntegerIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "exp_year"

    .line 157
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mExpiryYear:Ljava/lang/Integer;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putIntegerIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v1, "funding"

    .line 158
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mFunding:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "last4"

    .line 159
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mLast4:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "three_d_secure"

    .line 160
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mThreeDSecureStatus:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "tokenization_method"

    .line 161
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mTokenizationMethod:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    iget-object v1, p0, Lcom/stripe/android/model/SourceCardData;->mAdditionalFields:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/stripe/android/model/SourceCardData;->putAdditionalFieldsIntoJsonObject(Lorg/json/JSONObject;Ljava/util/Map;)V

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

    .line 170
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "address_line1_check"

    .line 171
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mAddressLine1Check:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "address_zip_check"

    .line 172
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mAddressZipCheck:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "brand"

    .line 173
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mBrand:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "country"

    .line 174
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mCountry:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "dynamic_last4"

    .line 175
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mDynamicLast4:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "exp_month"

    .line 176
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mExpiryMonth:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "exp_year"

    .line 177
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mExpiryYear:Ljava/lang/Integer;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "funding"

    .line 178
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mFunding:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "last4"

    .line 179
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mLast4:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "three_d_secure"

    .line 180
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mThreeDSecureStatus:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "tokenization_method"

    .line 181
    iget-object v2, p0, Lcom/stripe/android/model/SourceCardData;->mTokenizationMethod:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    iget-object v1, p0, Lcom/stripe/android/model/SourceCardData;->mAdditionalFields:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/stripe/android/model/SourceCardData;->putAdditionalFieldsIntoMap(Ljava/util/Map;Ljava/util/Map;)V

    .line 184
    invoke-static {v0}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    return-object v0
.end method
