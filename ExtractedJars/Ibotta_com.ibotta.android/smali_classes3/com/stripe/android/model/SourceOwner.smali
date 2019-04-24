.class public Lcom/stripe/android/model/SourceOwner;
.super Lcom/stripe/android/model/StripeJsonModel;
.source "SourceOwner.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private mAddress:Lcom/stripe/android/model/Address;

.field private mEmail:Ljava/lang/String;

.field private mName:Ljava/lang/String;

.field private mPhone:Ljava/lang/String;

.field private mVerifiedAddress:Lcom/stripe/android/model/Address;

.field private mVerifiedEmail:Ljava/lang/String;

.field private mVerifiedName:Ljava/lang/String;

.field private mVerifiedPhone:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Lcom/stripe/android/model/StripeJsonModel;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/stripe/android/model/SourceOwner;->mAddress:Lcom/stripe/android/model/Address;

    .line 51
    iput-object p2, p0, Lcom/stripe/android/model/SourceOwner;->mEmail:Ljava/lang/String;

    .line 52
    iput-object p3, p0, Lcom/stripe/android/model/SourceOwner;->mName:Ljava/lang/String;

    .line 53
    iput-object p4, p0, Lcom/stripe/android/model/SourceOwner;->mPhone:Ljava/lang/String;

    .line 54
    iput-object p5, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedAddress:Lcom/stripe/android/model/Address;

    .line 55
    iput-object p6, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedEmail:Ljava/lang/String;

    .line 56
    iput-object p7, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedName:Ljava/lang/String;

    .line 57
    iput-object p8, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedPhone:Ljava/lang/String;

    return-void
.end method

.method public static fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/SourceOwner;
    .locals 11
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
    const-string v1, "address"

    .line 194
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 196
    invoke-static {v1}, Lcom/stripe/android/model/Address;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Address;

    move-result-object v1

    move-object v3, v1

    goto :goto_0

    :cond_1
    move-object v3, v0

    :goto_0
    const-string v1, "email"

    .line 198
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "name"

    .line 199
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "phone"

    .line 200
    invoke-static {p0, v1}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "verified_address"

    .line 202
    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 204
    invoke-static {v1}, Lcom/stripe/android/model/Address;->fromJson(Lorg/json/JSONObject;)Lcom/stripe/android/model/Address;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    :cond_2
    move-object v7, v0

    :goto_1
    const-string v0, "verified_email"

    .line 206
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "verified_name"

    .line 207
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v0, "verified_phone"

    .line 208
    invoke-static {p0, v0}, Lcom/stripe/android/model/StripeJsonUtils;->optString(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 210
    new-instance p0, Lcom/stripe/android/model/SourceOwner;

    move-object v2, p0

    invoke-direct/range {v2 .. v10}, Lcom/stripe/android/model/SourceOwner;-><init>(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public toJson()Lorg/json/JSONObject;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 147
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 148
    iget-object v1, p0, Lcom/stripe/android/model/SourceOwner;->mAddress:Lcom/stripe/android/model/Address;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->toJson()Lorg/json/JSONObject;

    move-result-object v1

    .line 149
    :goto_0
    iget-object v3, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedAddress:Lcom/stripe/android/model/Address;

    if-nez v3, :cond_1

    goto :goto_1

    .line 151
    :cond_1
    invoke-virtual {v3}, Lcom/stripe/android/model/Address;->toJson()Lorg/json/JSONObject;

    move-result-object v2

    :goto_1
    if-eqz v1, :cond_2

    .line 153
    :try_start_0
    invoke-virtual {v1}, Lorg/json/JSONObject;->length()I

    move-result v3

    if-lez v3, :cond_2

    const-string v3, "address"

    .line 154
    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string v1, "email"

    .line 156
    iget-object v3, p0, Lcom/stripe/android/model/SourceOwner;->mEmail:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "name"

    .line 157
    iget-object v3, p0, Lcom/stripe/android/model/SourceOwner;->mName:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "phone"

    .line 158
    iget-object v3, p0, Lcom/stripe/android/model/SourceOwner;->mPhone:Ljava/lang/String;

    invoke-static {v0, v1, v3}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v2, :cond_3

    .line 159
    invoke-virtual {v2}, Lorg/json/JSONObject;->length()I

    move-result v1

    if-lez v1, :cond_3

    const-string v1, "verified_address"

    .line 160
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    const-string v1, "verified_email"

    .line 162
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedEmail:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "verified_name"

    .line 163
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedName:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "verified_phone"

    .line 164
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedPhone:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/stripe/android/model/StripeJsonUtils;->putStringIfNotNull(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
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

    .line 127
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 128
    iget-object v1, p0, Lcom/stripe/android/model/SourceOwner;->mAddress:Lcom/stripe/android/model/Address;

    if-eqz v1, :cond_0

    const-string v2, "address"

    .line 129
    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->toMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    const-string v1, "email"

    .line 131
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mEmail:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "name"

    .line 132
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mName:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "phone"

    .line 133
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mPhone:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    iget-object v1, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedAddress:Lcom/stripe/android/model/Address;

    if-eqz v1, :cond_1

    const-string v2, "verified_address"

    .line 135
    invoke-virtual {v1}, Lcom/stripe/android/model/Address;->toMap()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    const-string v1, "verified_email"

    .line 137
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedEmail:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "verified_name"

    .line 138
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedName:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "verified_phone"

    .line 139
    iget-object v2, p0, Lcom/stripe/android/model/SourceOwner;->mVerifiedPhone:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    invoke-static {v0}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    return-object v0
.end method
