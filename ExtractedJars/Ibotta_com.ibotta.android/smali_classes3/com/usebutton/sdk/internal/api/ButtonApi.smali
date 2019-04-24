.class public Lcom/usebutton/sdk/internal/api/ButtonApi;
.super Ljava/lang/Object;
.source "ButtonApi.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ButtonApi"


# instance fields
.field private final mApplicationId:Ljava/lang/String;

.field private final mBaseUrl:Ljava/lang/String;

.field private final mHttp:Lcom/usebutton/sdk/internal/api/Http;

.field private final mIdentifierForAdvertiserProvider:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

.field private mPermanentCapabilities:Lorg/json/JSONObject;

.field private mRateLimiter:Lcom/usebutton/sdk/internal/api/SessionRateLimiter;

.field private mSessionId:Ljava/lang/String;

.field private final mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;

.field private mUserIdentifier:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/HostInformation;Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;Lcom/usebutton/sdk/internal/api/Http;Lcom/usebutton/sdk/internal/api/RequestShepherd;)V
    .locals 6
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 60
    new-instance v5, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;

    invoke-direct {v5}, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/usebutton/sdk/internal/api/ButtonApi;-><init>(Lcom/usebutton/sdk/internal/api/HostInformation;Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;Lcom/usebutton/sdk/internal/api/Http;Lcom/usebutton/sdk/internal/api/RequestShepherd;Lcom/usebutton/sdk/internal/api/SessionRateLimiter;)V

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/api/HostInformation;Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;Lcom/usebutton/sdk/internal/api/Http;Lcom/usebutton/sdk/internal/api/RequestShepherd;Lcom/usebutton/sdk/internal/api/SessionRateLimiter;)V
    .locals 3
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HostInformation;->getApplicationId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mApplicationId:Ljava/lang/String;

    .line 68
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HostInformation;->getConfiguration()Lcom/usebutton/sdk/internal/ConfigurationOverride;

    move-result-object v0

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/ConfigurationOverride;->getBaseUrl()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/$"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mBaseUrl:Ljava/lang/String;

    .line 69
    iput-object p2, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mIdentifierForAdvertiserProvider:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

    .line 70
    iput-object p3, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    .line 71
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->buildCapabilities(Lcom/usebutton/sdk/internal/api/HostInformation;)Lorg/json/JSONObject;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mPermanentCapabilities:Lorg/json/JSONObject;

    .line 72
    iput-object p4, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;

    .line 73
    iput-object p5, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mRateLimiter:Lcom/usebutton/sdk/internal/api/SessionRateLimiter;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/api/HostInformation;Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;Lcom/usebutton/sdk/internal/api/RequestShepherd;)V
    .locals 2

    .line 53
    new-instance v0, Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HostInformation;->getUserAgent()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/Http;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, v0, p3}, Lcom/usebutton/sdk/internal/api/ButtonApi;-><init>(Lcom/usebutton/sdk/internal/api/HostInformation;Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;Lcom/usebutton/sdk/internal/api/Http;Lcom/usebutton/sdk/internal/api/RequestShepherd;)V

    return-void
.end method

.method private addDeviceIdentifiers(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "ifa"

    .line 161
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getIfa()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "ifa"

    .line 162
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "android_id"

    .line 163
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mIdentifierForAdvertiserProvider:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;->getSecondaryIdentifier()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const-string v0, "ifa_limited"

    .line 165
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mIdentifierForAdvertiserProvider:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;->isTrackingLimited()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    return-void
.end method

.method private addThirdPartyIdentifier(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 177
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const-string v0, "thirdparty_id"

    .line 181
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    invoke-direct {p0, p1, v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->putSafely(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static append(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 391
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-nez v0, :cond_0

    .line 393
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 394
    invoke-virtual {p0, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 396
    :cond_0
    invoke-virtual {v0, p2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    return-void
.end method

.method private buildCapabilities(Lcom/usebutton/sdk/internal/api/HostInformation;)Lorg/json/JSONObject;
    .locals 6

    .line 292
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "screen_scale"

    .line 294
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HostInformation;->getScreenDensity()F

    move-result p1

    float-to-double v2, p1

    invoke-virtual {v0, v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    const-string p1, "supported_display_types"

    const/4 v1, 0x2

    .line 295
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "standard_button_v1"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "inventory_button_v1"

    const/4 v5, 0x1

    aput-object v3, v2, v5

    .line 296
    invoke-static {v2}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toArray([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v2

    .line 295
    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "target_types"

    const/4 v2, 0x3

    .line 297
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "app_v1"

    aput-object v3, v2, v4

    const-string v3, "webview_v1"

    aput-object v3, v2, v5

    const-string v3, "browser_v1"

    aput-object v3, v2, v1

    invoke-static {v2}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toArray([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "supported_enhancements"

    .line 299
    invoke-static {}, Lcom/usebutton/sdk/internal/recipients/RecipientRegistry;->getEnhancements()[Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/JsonBuilder;->toArray([Ljava/lang/Object;)Lorg/json/JSONArray;

    move-result-object v1

    .line 298
    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "ButtonApi"

    const-string v2, "Couldn\'t form capabilities object."

    .line 301
    invoke-static {v1, v2, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-object v0
.end method

.method private buildContext(Lcom/usebutton/sdk/action/ActionQuery;)Lorg/json/JSONObject;
    .locals 4
    .param p1    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 263
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    if-eqz p1, :cond_0

    .line 266
    invoke-virtual {p1}, Lcom/usebutton/sdk/action/ActionQuery;->getData()Lorg/json/JSONObject;

    move-result-object p1

    goto :goto_0

    .line 268
    :cond_0
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    :goto_0
    const-string v1, "locale"

    .line 271
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "-"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v1, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->putSafely(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "user_local_time"

    .line 272
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->putSafely(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method private executeSessionRequest(Lcom/usebutton/sdk/internal/api/Request$Get;)Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    const-string v0, "session_id"

    .line 307
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mSessionId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameterIfNotNull(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    .line 308
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getIfa()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ifa"

    .line 309
    invoke-virtual {p1, v1, v0}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameterIfNotNull(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    if-nez v0, :cond_0

    const-string v0, "android_id"

    .line 311
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mIdentifierForAdvertiserProvider:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

    .line 312
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;->getSecondaryIdentifier()Ljava/lang/String;

    move-result-object v1

    .line 311
    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameterIfNotNull(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    :cond_0
    const-string v0, "ifa_limited"

    .line 314
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mIdentifierForAdvertiserProvider:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;->isTrackingLimited()Z

    move-result v1

    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameter(Ljava/lang/String;Z)Lcom/usebutton/sdk/internal/api/Request$Get;

    .line 316
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "thirdparty_id"

    .line 317
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Get;->withParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/Request$Get;

    .line 320
    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p1

    return-object p1
.end method

.method private getBaseSessionPayload()Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 378
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "session_id"

    .line 379
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mSessionId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 380
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->addDeviceIdentifiers(Lorg/json/JSONObject;)V

    .line 381
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->addThirdPartyIdentifier(Lorg/json/JSONObject;)V

    return-object v0
.end method

.method private getIfa()Ljava/lang/String;
    .locals 1

    .line 386
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mIdentifierForAdvertiserProvider:Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/util/IdentifierForAdvertiserProvider;->getPrimaryIdentifier()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private getLinks(Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/core/Response;
    .locals 3
    .param p2    # Lcom/usebutton/sdk/internal/api/AppStatus;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Lcom/usebutton/sdk/internal/api/AppStatus;",
            ")",
            "Lcom/usebutton/sdk/internal/core/Response<",
            "Lcom/usebutton/sdk/internal/api/models/AppActionDTO;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 460
    :try_start_0
    new-instance v0, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string v1, "/v1/session/get-links"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 461
    new-instance v1, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mPermanentCapabilities:Lorg/json/JSONObject;

    instance-of v2, v1, Lorg/json/JSONObject;

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    check-cast v1, Lorg/json/JSONObject;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->toString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 462
    invoke-direct {p0, v1, p2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->putAppsState(Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/api/AppStatus;)V

    .line 465
    new-instance p2, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    invoke-direct {p2, p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;-><init>(Lorg/json/JSONObject;)V

    .line 466
    invoke-virtual {p2, v1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->capabilities(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    .line 467
    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->thirdPartyId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    .line 468
    invoke-static {p2}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->userLocalTime(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    .line 469
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->build()Lcom/usebutton/sdk/internal/api/AppActionRequest;

    move-result-object p1

    .line 470
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    .line 472
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    .line 473
    iget-object p1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    .line 474
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p2

    const-string v0, "object"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    invoke-static {p2}, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/AppActionDTO;

    move-result-object p2

    .line 475
    invoke-static {p2, p1}, Lcom/usebutton/sdk/internal/core/Response;->success(Ljava/lang/Object;Lcom/usebutton/sdk/internal/api/HttpResponse;)Lcom/usebutton/sdk/internal/core/Response;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 477
    new-instance p2, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string v0, "Couldn\'t form request"

    invoke-direct {p2, v0, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private putAppsState(Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/api/AppStatus;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    const-string v0, "available_apps"

    .line 248
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/api/AppStatus;->getAvailableApps()Ljava/util/Set;

    move-result-object v1

    invoke-static {v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->setToArray(Ljava/util/Set;)Lorg/json/JSONArray;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "unavailable_apps"

    .line 249
    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/api/AppStatus;->getUnavailableApps()Ljava/util/Set;

    move-result-object p2

    invoke-static {p2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->setToArray(Ljava/util/Set;)Lorg/json/JSONArray;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "unqueryable_apps"

    .line 250
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {p1, p2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method private putSafely(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 285
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 288
    :cond_0
    invoke-virtual {p1, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    return-void
.end method

.method private setSessionId(Ljava/lang/String;)V
    .locals 5

    .line 85
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mSessionId:Ljava/lang/String;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 86
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const-string v0, "ButtonApi"

    const-string v1, "Changed session id from \'%s\' to \'%s\'"

    const/4 v2, 0x2

    .line 87
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mSessionId:Ljava/lang/String;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    aput-object p1, v2, v3

    .line 88
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 87
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 89
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mSessionId:Ljava/lang/String;

    return-void
.end method

.method public static setToArray(Ljava/util/Set;)Lorg/json/JSONArray;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/json/JSONArray;"
        }
    .end annotation

    .line 254
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 255
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 256
    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private urlFor(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 109
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mBaseUrl:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getApplicationId()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "^/"

    const-string v2, ""

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private valueOrNull(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 418
    :cond_0
    sget-object p1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    :goto_0
    return-object p1
.end method


# virtual methods
.method public createSession()Ljava/lang/String;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mRateLimiter:Lcom/usebutton/sdk/internal/api/SessionRateLimiter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->isRateLimited()Z

    move-result v0

    if-nez v0, :cond_1

    .line 121
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "application_id"

    .line 123
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mApplicationId:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 124
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->addDeviceIdentifiers(Lorg/json/JSONObject;)V

    .line 125
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->addThirdPartyIdentifier(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    .line 130
    new-instance v1, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string v2, "/v1/session"

    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 131
    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    move-result-object v0

    .line 135
    :try_start_1
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object v0

    .line 136
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object v1
    :try_end_1
    .catch Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    const-string v2, "object"

    .line 139
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "id"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException; {:try_start_2 .. :try_end_2} :catch_1

    .line 156
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->setSessionId(Ljava/lang/String;)V

    return-object v0

    :catch_0
    move-exception v1

    .line 141
    :try_start_3
    new-instance v2, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error while extracting session id from "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_3
    .catch Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception v0

    .line 145
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->wasUnauthorized()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "Session creation failed (Invalid App ID)"

    .line 146
    invoke-static {v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 148
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 149
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->getRequestId()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "Session creation failed (Request ID: %s)"

    .line 148
    invoke-static {v2, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    :goto_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mRateLimiter:Lcom/usebutton/sdk/internal/api/SessionRateLimiter;

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->parseException(Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;)V

    .line 153
    throw v0

    :catch_2
    move-exception v0

    .line 127
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 118
    :cond_1
    new-instance v0, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string v1, "Session requests have been rate limited."

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getApplicationId()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mApplicationId:Ljava/lang/String;

    return-object v0
.end method

.method public getAutofillMappings(Lorg/json/JSONObject;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 533
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v1, "autofill"

    .line 534
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 536
    new-instance p1, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string v1, "/v1/session/autofill-mappings"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 537
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    move-result-object p1

    .line 539
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {v1, p1}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    const/4 v0, 0x0

    .line 541
    :goto_0
    new-instance v1, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Couldn\'t form requestJson parameter, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public getButton(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/api/models/AppActionDTO;
    .locals 4
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/internal/api/AppStatus;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 220
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mPermanentCapabilities:Lorg/json/JSONObject;

    instance-of v2, v1, Lorg/json/JSONObject;

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    check-cast v1, Lorg/json/JSONObject;

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->toString(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/JSONObjectInstrumentation;->init(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 221
    invoke-direct {p0, v1, p4}, Lcom/usebutton/sdk/internal/api/ButtonApi;->putAppsState(Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/api/AppStatus;)V

    .line 224
    new-instance p4, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v2

    invoke-direct {p4, v2}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;-><init>(Lorg/json/JSONObject;)V

    .line 225
    invoke-virtual {p4, v1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->capabilities(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p4

    .line 226
    invoke-direct {p0, p3}, Lcom/usebutton/sdk/internal/api/ButtonApi;->buildContext(Lcom/usebutton/sdk/action/ActionQuery;)Lorg/json/JSONObject;

    move-result-object p3

    invoke-virtual {p4, p3}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->context(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p3

    .line 227
    invoke-virtual {p3, p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->placementId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    .line 228
    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->pubRef(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    .line 229
    invoke-static {p2}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->userLocalTime(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    .line 230
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->build()Lcom/usebutton/sdk/internal/api/AppActionRequest;

    move-result-object p1

    .line 231
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    const-string p2, "thirdparty_id"

    .line 233
    iget-object p3, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    invoke-direct {p0, p1, p2, p3}, Lcom/usebutton/sdk/internal/api/ButtonApi;->putSafely(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 234
    new-instance p2, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string p3, "/v1/session/get-button"

    invoke-direct {p0, p3}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 235
    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    move-result-object p1

    .line 236
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string p2, "object"

    .line 237
    invoke-virtual {p1, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    .line 238
    invoke-static {p2}, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->fromJson(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/models/AppActionDTO;

    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    move-object v3, p2

    move-object p2, p1

    move-object p1, v3

    goto :goto_1

    :catch_1
    move-exception p1

    move-object p2, v0

    :goto_1
    const-string p3, "ButtonApi"

    .line 241
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Malformed promotions response: "

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public getConfiguration()Lcom/usebutton/sdk/internal/models/Configuration;
    .locals 5
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 190
    new-instance v0, Lcom/usebutton/sdk/internal/api/Request$Get;

    const-string v1, "/v1/session/configuration"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Get;-><init>(Ljava/lang/String;)V

    .line 191
    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->executeSessionRequest(Lcom/usebutton/sdk/internal/api/Request$Get;)Lorg/json/JSONObject;

    move-result-object v0

    :try_start_0
    const-string v1, "object"

    .line 194
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "configuration"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    .line 195
    new-instance v2, Lcom/usebutton/sdk/internal/models/Configuration;

    invoke-direct {v2, v1}, Lcom/usebutton/sdk/internal/models/Configuration;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :catch_0
    move-exception v1

    .line 197
    new-instance v2, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not find configuration object in response"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public getHttp()Lcom/usebutton/sdk/internal/api/Http;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    return-object v0
.end method

.method public getLinks(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/core/Response;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/api/AppStatus;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/api/AppStatus;",
            ")",
            "Lcom/usebutton/sdk/internal/core/Response<",
            "Lcom/usebutton/sdk/internal/api/models/AppActionDTO;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 432
    :try_start_0
    new-instance v0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;-><init>(Lorg/json/JSONObject;)V

    .line 433
    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->merchantId(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    .line 434
    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->pubRef(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    .line 435
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->build()Lcom/usebutton/sdk/internal/api/AppActionRequest;

    move-result-object p1

    .line 436
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    .line 437
    invoke-direct {p0, p1, p3}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getLinks(Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/core/Response;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 439
    new-instance p2, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string p3, "Couldn\'t form request"

    invoke-direct {p2, p3, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public getLinks(Ljava/net/URL;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/core/Response;
    .locals 2
    .param p1    # Ljava/net/URL;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/usebutton/sdk/internal/api/AppStatus;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/URL;",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/api/AppStatus;",
            ")",
            "Lcom/usebutton/sdk/internal/core/Response<",
            "Lcom/usebutton/sdk/internal/api/models/AppActionDTO;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 446
    :try_start_0
    new-instance v0, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;-><init>(Lorg/json/JSONObject;)V

    .line 447
    invoke-virtual {v0, p2}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->pubRef(Ljava/lang/String;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p2

    .line 448
    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->url(Ljava/net/URL;)Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;

    move-result-object p1

    .line 449
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest$Builder;->build()Lcom/usebutton/sdk/internal/api/AppActionRequest;

    move-result-object p1

    .line 450
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/AppActionRequest;->toJson()Lorg/json/JSONObject;

    move-result-object p1

    .line 451
    invoke-direct {p0, p1, p3}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getLinks(Lorg/json/JSONObject;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/core/Response;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 453
    new-instance p2, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string p3, "Couldn\'t form request"

    invoke-direct {p2, p3, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public getShepherd()Lcom/usebutton/sdk/internal/api/RequestShepherd;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mShepherd:Lcom/usebutton/sdk/internal/api/RequestShepherd;

    return-object v0
.end method

.method public postEvents(Ljava/util/Collection;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 332
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v1, "current_time"

    .line 333
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoDateFormat(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 334
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "events"

    .line 339
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/api/models/ClientEventDTO;->toJsonObject()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v0, v2, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->append(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    .line 345
    :cond_1
    new-instance p1, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string v1, "/v1/session/events"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 346
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    move-result-object p1

    .line 347
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p1

    const/4 v0, 0x0

    .line 342
    :goto_1
    new-instance v1, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Couldn\'t form requestJson parameter, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public postPageView(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lorg/json/JSONObject;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 514
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v1, "url"

    .line 515
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "btn_ref"

    .line 516
    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "user_local_time"

    .line 517
    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    invoke-static {p2}, Lcom/usebutton/sdk/internal/util/ButtonUtil;->isoFormat(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "flags"

    .line 518
    new-instance p2, Lorg/json/JSONArray;

    invoke-direct {p2, p3}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 519
    new-instance p1, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string p2, "/v1/session/pageview"

    invoke-direct {p0, p2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 520
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    move-result-object p1

    .line 522
    iget-object p2, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {p2, p1}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    const/4 v0, 0x0

    .line 524
    :goto_0
    new-instance p2, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t form requestJson parameter, "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public postTap(Ljava/lang/String;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 555
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v0
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string v1, "btn_ref"

    .line 556
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 558
    new-instance p1, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string v1, "/v1/session/tap"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 559
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    move-result-object p1

    .line 561
    iget-object v1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {v1, p1}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    const/4 v0, 0x0

    .line 563
    :goto_0
    new-instance v1, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Couldn\'t form requestJson parameter, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public reportAuthChallengeResult(Lcom/usebutton/sdk/internal/models/AuthChallenge;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 484
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "thirdparty_id"

    .line 485
    iget-object v2, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "type"

    const-string v2, "android"

    .line 486
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "response"

    .line 487
    invoke-virtual {v0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p2, "btn_ref"

    .line 488
    invoke-virtual {v0, p2, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 489
    new-instance p2, Lcom/usebutton/sdk/internal/api/Request$Post;

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getPostbackUrl()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 490
    invoke-virtual {p2, v0}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    .line 492
    iget-object p3, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {p3, p2}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p2

    invoke-virtual {p2}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p2

    const-string p3, "object"

    invoke-virtual {p2, p3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    .line 493
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/models/AuthChallenge;->getAuthResultQueryKey()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    .line 497
    new-instance p2, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string p3, "Couldn\'t get pending deep link."

    invoke-direct {p2, p3, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public reportProbedApplications(Ljava/util/Collection;Ljava/util/Collection;)Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/json/JSONObject;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 357
    new-instance v0, Lcom/usebutton/sdk/internal/api/Request$Post;

    const-string v1, "/v1/session/schemes"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Post;-><init>(Ljava/lang/String;)V

    .line 359
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "available"

    .line 362
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "unavailable"

    .line 363
    new-instance v3, Lorg/json/JSONArray;

    invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 364
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, "available"

    .line 365
    invoke-static {v1, v3, v2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->append(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    .line 367
    :cond_0
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v2, "unavailable"

    .line 368
    invoke-static {v1, v2, p2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->append(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_1

    .line 370
    :cond_1
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/api/Request$Post;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 374
    iget-object p1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object p1

    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/HttpResponse;->body()Lorg/json/JSONObject;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    .line 372
    new-instance p2, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string v0, "Couldn\'t form json payload for schemes call."

    invoke-direct {p2, v0, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public setSessionInfo(Lcom/usebutton/sdk/internal/core/Storage;)V
    .locals 1
    .param p1    # Lcom/usebutton/sdk/internal/core/Storage;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 77
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Storage;->getSessionId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->setSessionId(Ljava/lang/String;)V

    .line 78
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/core/Storage;->getUserIdentifier()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    return-void
.end method

.method public setUserIdentifier(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 405
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mUserIdentifier:Ljava/lang/String;

    .line 407
    :try_start_0
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getBaseSessionPayload()Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "thirdparty_id"

    .line 408
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->valueOrNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 409
    new-instance p1, Lcom/usebutton/sdk/internal/api/Request$Put;

    const-string v1, "/v1/session/customer"

    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->urlFor(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Lcom/usebutton/sdk/internal/api/Request$Put;-><init>(Ljava/lang/String;)V

    .line 410
    invoke-virtual {p1, v0}, Lcom/usebutton/sdk/internal/api/Request$Put;->withBody(Lorg/json/JSONObject;)Lcom/usebutton/sdk/internal/api/Request$Post;

    .line 411
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/ButtonApi;->mHttp:Lcom/usebutton/sdk/internal/api/Http;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/api/Http;->executeRequest(Lcom/usebutton/sdk/internal/api/Request;)Lcom/usebutton/sdk/internal/api/HttpResponse;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 413
    new-instance v0, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string v1, "Couldn\'t create update customer request."

    invoke-direct {v0, v1, p1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
