.class public Lcom/stripe/android/model/Customer;
.super Lcom/stripe/android/model/StripeJsonModel;
.source "Customer.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private mDefaultSource:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mHasMore:Ljava/lang/Boolean;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mId:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mShippingInformation:Lcom/stripe/android/model/ShippingInformation;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mSources:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/CustomerSource;",
            ">;"
        }
    .end annotation
.end field

.field private mTotalCount:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mUrl:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 55
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 50
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/model/Customer;->mSources:Ljava/util/List;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Customer;
    .locals 6
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const-string v0, "object"

    .line 163
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "customer"

    .line 164
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 167
    :cond_0
    new-instance v0, Lcom/stripe/android/model/Customer;

    invoke-direct {v0}, Lcom/stripe/android/model/Customer;-><init>()V

    const-string v1, "id"

    .line 168
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Customer;->mId:Ljava/lang/String;

    const-string v1, "default_source"

    .line 169
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Customer;->mDefaultSource:Ljava/lang/String;

    const-string v1, "shipping"

    .line 171
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v1}, Lcom/stripe/android/model/ShippingInformation;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/ShippingInformation;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Customer;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    const-string v1, "sources"

    .line 172
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_4

    const-string v1, "list"

    const-string v2, "object"

    .line 173
    invoke-static {p0, v2}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string v1, "has_more"

    .line 174
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optBoolean(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Customer;->mHasMore:Ljava/lang/Boolean;

    const-string v1, "total_count"

    .line 175
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optInteger(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Customer;->mTotalCount:Ljava/lang/Integer;

    const-string v1, "url"

    .line 176
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/stripe/android/model/Customer;->mUrl:Ljava/lang/String;

    .line 177
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const-string v2, "data"

    .line 178
    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    const/4 v2, 0x0

    .line 179
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 181
    :try_start_0
    invoke-virtual {p0, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v3

    .line 182
    invoke-static {v3}, Lcom/stripe/android/model/CustomerSource;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/CustomerSource;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v4, "apple_pay"

    .line 184
    invoke-virtual {v3}, Lcom/stripe/android/model/CustomerSource;->getTokenizationMethod()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 187
    :cond_1
    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 190
    :cond_3
    iput-object v1, v0, Lcom/stripe/android/model/Customer;->mSources:Ljava/util/List;

    :cond_4
    return-object v0
.end method

.method public static fromString(Ljava/lang/String;)Lcom/stripe/android/model/Customer;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 155
    :cond_0
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-static {p0}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-static {p0}, Lcom/stripe/android/model/Customer;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Customer;

    move-result-object p0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v0
.end method


# virtual methods
.method public getDefaultSource()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Lcom/stripe/android/model/Customer;->mDefaultSource:Ljava/lang/String;

    return-object v0
.end method

.method public getSourceById(Ljava/lang/String;)Lcom/stripe/android/model/CustomerSource;
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 88
    iget-object v0, p0, Lcom/stripe/android/model/Customer;->mSources:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/model/CustomerSource;

    .line 89
    invoke-virtual {v1}, Lcom/stripe/android/model/CustomerSource;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public getSources()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/CustomerSource;",
            ">;"
        }
    .end annotation

    .line 71
    iget-object v0, p0, Lcom/stripe/android/model/Customer;->mSources:Ljava/util/List;

    return-object v0
.end method

.method public toJson()Lorg/json/JSONObject;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 99
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "id"

    .line 100
    iget-object v2, p0, Lcom/stripe/android/model/Customer;->mId:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "object"

    const-string v2, "customer"

    .line 101
    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "default_source"

    .line 102
    iget-object v2, p0, Lcom/stripe/android/model/Customer;->mDefaultSource:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "shipping"

    .line 103
    iget-object v2, p0, Lcom/stripe/android/model/Customer;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonModel;->putStripeJsonModelIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Lcom/stripe/android/model/StripeJsonModel;)V

    .line 106
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "object"

    const-string v3, "list"

    .line 107
    invoke-static {v1, v2, v3}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "has_more"

    .line 108
    iget-object v3, p0, Lcom/stripe/android/model/Customer;->mHasMore:Ljava/lang/Boolean;

    invoke-static {v1, v2, v3}, Lcom/stripe/android/model/StripeJsonUtils;->putBooleanIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string v2, "total_count"

    .line 109
    iget-object v3, p0, Lcom/stripe/android/model/Customer;->mTotalCount:Ljava/lang/Integer;

    invoke-static {v1, v2, v3}, Lcom/stripe/android/model/StripeJsonUtils;->putIntegerIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v2, "data"

    .line 110
    iget-object v3, p0, Lcom/stripe/android/model/Customer;->mSources:Ljava/util/List;

    invoke-static {v1, v2, v3}, Lcom/stripe/android/model/Customer;->putStripeJsonModelListIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/util/List;)V

    const-string v2, "url"

    .line 111
    iget-object v3, p0, Lcom/stripe/android/model/Customer;->mUrl:Ljava/lang/String;

    invoke-static {v1, v2, v3}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "sources"

    .line 113
    invoke-static {v0, v2, v1}, Lcom/stripe/android/model/StripeJsonUtils;->putObjectIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Lorg/json/JSONObject;)V

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

    .line 121
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "id"

    .line 122
    iget-object v2, p0, Lcom/stripe/android/model/Customer;->mId:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "object"

    const-string v2, "customer"

    .line 123
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "default_source"

    .line 124
    iget-object v2, p0, Lcom/stripe/android/model/Customer;->mDefaultSource:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "shipping"

    .line 126
    iget-object v2, p0, Lcom/stripe/android/model/Customer;->mShippingInformation:Lcom/stripe/android/model/ShippingInformation;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonModel;->putStripeJsonModelMapIfNotNull(Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/StripeJsonModel;)V

    .line 131
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "has_more"

    .line 132
    iget-object v3, p0, Lcom/stripe/android/model/Customer;->mHasMore:Ljava/lang/Boolean;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "total_count"

    .line 133
    iget-object v3, p0, Lcom/stripe/android/model/Customer;->mTotalCount:Ljava/lang/Integer;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "object"

    const-string v3, "list"

    .line 134
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "url"

    .line 135
    iget-object v3, p0, Lcom/stripe/android/model/Customer;->mUrl:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "data"

    .line 136
    iget-object v3, p0, Lcom/stripe/android/model/Customer;->mSources:Ljava/util/List;

    invoke-static {v1, v2, v3}, Lcom/stripe/android/model/StripeJsonModel;->putStripeJsonModelListIfNotNull(Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V

    .line 140
    invoke-static {v1}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    const-string v2, "sources"

    .line 142
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    invoke-static {v0}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    return-object v0
.end method
