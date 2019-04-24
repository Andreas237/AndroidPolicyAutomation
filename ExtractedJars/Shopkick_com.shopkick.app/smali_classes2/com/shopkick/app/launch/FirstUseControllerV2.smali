.class public Lcom/shopkick/app/launch/FirstUseControllerV2;
.super Ljava/lang/Object;
.source "FirstUseControllerV2.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;
    }
.end annotation


# static fields
.field public static final FIRST_USE_COMPLETED_BY_CODE:Ljava/lang/String; = "firstUseCompletedByCode"

.field public static final FIRST_USE_COMPLETED_BY_USER:Ljava/lang/String; = "firstUseCompletedByUser"

.field public static final FIRST_USE_CONTROLLER_FETCH_FAILED:Ljava/lang/String; = "firstUseControllerFetchFailed"

.field public static final FIRST_USE_CONTROLLER_READY:Ljava/lang/String; = "firstUseControllerReady"

.field public static final FIRST_USE_IMAGE_RESOURCE_IDENTIFIER:Ljava/lang/String; = "firstuse_image"

.field public static final FIRST_USE_SCREENS_FINISHED:Ljava/lang/String; = "firstUseScreensFinished"

.field public static final FIRST_USE_SCREENS_PARAM_FLOW_ID:Ljava/lang/String; = "flow_id"

.field private static final FIRST_USE_SCREENS_TEMPLATE_VERSION:Ljava/lang/String; = "4"

.field public static final FIRST_USE_SCREEN_LOG_KEY_FLOW_ID:Ljava/lang/String; = "flow_id"

.field public static final FIRST_USE_SCREEN_PARAM_BUTTON_URL:Ljava/lang/String; = "button_url"

.field private static final LOG_TAG:Ljava/lang/String; = "FirstUseControllerV2"


# instance fields
.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

.field private appPreferences:Lcom/shopkick/app/application/AppPreferences;

.field private firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

.field public firstUseExperimentData:Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;

.field public firstUseSkScreens:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private gottenTOSConfirmation:Z

.field private hasBailedOutToDefaultFlow:Z

.field private hasUserTriedToInvite:Z

.field private inFirstUse:Z

.field public isReady:Z

.field private nextScreenIndex:I

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private transitioningForBailout:Z

.field private userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/shopkick/app/application/AppActivityManager;Lcom/shopkick/app/util/NotificationCenter;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/application/AppPreferences;Lcom/shopkick/app/account/UserAccountDataSource;)V
    .locals 1

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 56
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasBailedOutToDefaultFlow:Z

    .line 57
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->transitioningForBailout:Z

    .line 58
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasUserTriedToInvite:Z

    .line 118
    iput v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    .line 126
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->inFirstUse:Z

    .line 127
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->isReady:Z

    .line 135
    iput-object p3, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 136
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    .line 137
    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 138
    iput-object p4, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 139
    iput-object p5, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 p1, 0x1

    .line 143
    iput p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    return-void
.end method

.method private clearFirstUseData()V
    .locals 1

    const/4 v0, 0x0

    .line 322
    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseExperimentData:Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;

    return-void
.end method

.method private fetchAndPinResources(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 482
    invoke-static {}, Lcom/shopkick/app/application/SKApp;->getInstance()Lcom/shopkick/app/application/SKApp;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/application/SKApp;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    .line 483
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 484
    invoke-static {v1}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 485
    invoke-static {v0}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/util/GlideRequest;->submit()Lcom/bumptech/glide/request/FutureTarget;

    goto :goto_0

    :cond_1
    return-void
.end method

.method private fetchFirstUseConfig()V
    .locals 2

    .line 187
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseSkScreens:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseControllerReady"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_0
    const v0, 0x77a15

    .line 191
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onUserAction(I)V

    .line 192
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    if-nez v0, :cond_1

    .line 193
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    .line 194
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    const-string v1, "4"

    iput-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;->templatedScreensVersion:Ljava/lang/String;

    .line 195
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    :cond_1
    return-void
.end method

.method private finishFirstUse(Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;)V
    .locals 4

    const/4 v0, 0x0

    .line 298
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->inFirstUse:Z

    .line 299
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lcom/shopkick/app/application/AppPreferences;->setFirstUseCompleted(Z)V

    .line 301
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->maybeStart()V

    .line 304
    sget-object v1, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->FirstUseEndReasonAllScreensShown:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    if-ne p1, v1, :cond_0

    .line 306
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {p1}, Lcom/shopkick/app/application/AppPreferences;->getWebRegistrationId()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 308
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->deleteWebRegistrationId()V

    .line 309
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v1, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->makeWebRegistrationRequest(Ljava/lang/String;)V

    .line 313
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseScreensFinished"

    invoke-virtual {p1, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 315
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v1, Lcom/shopkick/logging/Area;->APP_LAUNCH:Lcom/shopkick/logging/Area;

    invoke-virtual {v1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v1

    const-string v3, "FirstUseController: FIRED FIRST USE COMPLETE NOTIFICATION"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1, v1, v2, v3, v0}, Lcom/shopkick/logging/DiagnosticLogger;->i(JLjava/lang/String;[Ljava/lang/Object;)V

    .line 316
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->clearFirstUseData()V

    .line 317
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "firstUseCompletedByUser"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    .line 318
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    return-void
.end method

.method private notifyFetchFailed(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 3

    .line 491
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/account/UserAccountDataSource;->generateHttpStatusCodeErrorMsg(Lcom/shopkick/fetchers/DataResponse;)Ljava/lang/String;

    move-result-object v0

    .line 492
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "ErrorMsg"

    .line 493
    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "HttpStatusCode"

    .line 494
    invoke-virtual {p1}, Lcom/shopkick/fetchers/DataResponse;->getStatusCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ClientErrorCode"

    .line 495
    iget p1, p1, Lcom/shopkick/fetchers/DataResponse;->clientError:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 496
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "firstUseControllerFetchFailed"

    invoke-virtual {p1, v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;Ljava/util/HashMap;)Ljava/util/List;

    return-void
.end method

.method private prepareToFinishFirstUse(Lcom/shopkick/app/activities/BaseActivity;Z)Z
    .locals 3

    .line 279
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v1, 0x3a

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->gottenTOSConfirmation:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    .line 280
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFirstUseCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p2, :cond_0

    .line 281
    new-instance p2, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;

    const/4 v2, 0x0

    invoke-direct {p2, v0, v1, v2}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 284
    invoke-virtual {p1, p2}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    move-result p1

    return p1

    :cond_0
    if-eqz p2, :cond_1

    .line 286
    sget-object p1, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->FirstUseEndReasonUserLogin:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;->FirstUseEndReasonAllScreensShown:Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;

    .line 288
    :goto_0
    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->finishFirstUse(Lcom/shopkick/app/launch/FirstUseControllerV2$FirstUseEndReason;)V

    const/4 p1, 0x1

    return p1
.end method

.method private reset()V
    .locals 2

    const/4 v0, 0x0

    .line 158
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasBailedOutToDefaultFlow:Z

    const/4 v1, 0x0

    .line 159
    iput-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseSkScreens:Ljava/util/List;

    .line 160
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->isReady:Z

    .line 161
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->gottenTOSConfirmation:Z

    const/4 v0, 0x1

    .line 162
    iput v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    return-void
.end method

.method private translateSkUrlToPageId(Ljava/lang/String;)Lcom/shopkick/app/activities/PageIdentifierV2;
    .locals 4

    .line 328
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 329
    invoke-static {v0}, Lcom/shopkick/app/url/URLDispatcher;->getUriKey(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "screen"

    .line 330
    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    .line 333
    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v0

    .line 334
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v3, 0x1

    if-gt v1, v3, :cond_1

    return-object v2

    :cond_1
    const/4 v1, 0x0

    .line 337
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 338
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 339
    invoke-static {p1}, Lcom/shopkick/app/url/UriUtils;->paramMap(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    .line 340
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v2

    .line 344
    :cond_2
    new-instance v1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v2, Lcom/shopkick/app/activities/FirstUseActivityV2;

    invoke-direct {v1, v2, v0, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-object v1
.end method


# virtual methods
.method public bailOutToDefaultFlow(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->transitioningForBailout:Z

    .line 62
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasBailedOutToDefaultFlow:Z

    .line 63
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseSkScreens:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    const/4 v1, 0x0

    .line 64
    iput v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    .line 66
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/activities/MultiScreenActivity;

    if-nez v1, :cond_0

    return-void

    .line 70
    :cond_0
    new-instance v2, Lcom/shopkick/app/activities/PageIdentifierV2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;

    invoke-direct {v2, v3, v4, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    .line 78
    invoke-virtual {v1, v2}, Lcom/shopkick/app/activities/MultiScreenActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    move-result p1

    xor-int/2addr p1, v0

    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->transitioningForBailout:Z

    .line 79
    iget-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->transitioningForBailout:Z

    if-eqz p1, :cond_1

    const-string p1, "Failed to transition to default screen. Screen transitioning underway"

    .line 81
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/launch/FirstUseControllerV2;->LOG_TAG:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public checkUserAlreadyRegisteredAndShouldSkipFirstUse()Z
    .locals 3

    .line 416
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 419
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v2, 0x3a

    if-ne v0, v2, :cond_2

    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->gottenTOSConfirmation:Z

    if-nez v0, :cond_2

    .line 422
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseSkScreens:Ljava/util/List;

    if-eqz v0, :cond_1

    .line 423
    invoke-interface {v0}, Ljava/util/List;->clear()V

    :cond_1
    return v1

    .line 427
    :cond_2
    iput-boolean v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->inFirstUse:Z

    .line 428
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFirstUseCompleted(Z)V

    return v1
.end method

.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public destroy()V
    .locals 2

    .line 147
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    .line 148
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    if-eqz v0, :cond_0

    .line 149
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    const/4 v0, 0x0

    .line 150
    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    .line 154
    :cond_0
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->reset()V

    return-void
.end method

.method public getInitialScreenPageIdentifier(Ljava/util/Map;)Lcom/shopkick/app/activities/PageIdentifierV2;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/shopkick/app/activities/PageIdentifierV2;"
        }
    .end annotation

    .line 454
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 458
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccountDataSource;->getUserCountry()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0x3a

    if-ne p1, v0, :cond_0

    iget-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->gottenTOSConfirmation:Z

    if-nez p1, :cond_0

    .line 459
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/FirstUseActivityV2;

    const-class v2, Lcom/shopkick/app/registration/TermsOfServiceConfirmationScreen;

    invoke-direct {p1, v0, v2, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-object p1

    .line 461
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object v3

    sget-object p1, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {p1}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v4

    new-instance v6, Ljava/lang/IllegalStateException;

    invoke-direct {v6}, Ljava/lang/IllegalStateException;-><init>()V

    const-string v7, "Tried to initialize first use for u.s. registered user"

    new-array v8, v2, [Ljava/lang/Object;

    invoke-virtual/range {v3 .. v8}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 463
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasBailedOutToDefaultFlow:Z

    .line 464
    new-instance p1, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v0, Lcom/shopkick/app/activities/FirstUseActivityV2;

    const-class v2, Lcom/shopkick/app/launch/FirstUseV5DefaultScreen;

    invoke-direct {p1, v0, v2, v1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-object p1

    .line 466
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseSkScreens:Ljava/util/List;

    if-eqz v0, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/StringUtils;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 467
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseSkScreens:Ljava/util/List;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 468
    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->translateSkUrlToPageId(Ljava/lang/String;)Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object p1

    return-object p1

    .line 472
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    if-eqz v0, :cond_3

    .line 473
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v2, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    .line 474
    iput-object v1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    .line 476
    :cond_3
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestSuccess"

    invoke-virtual {v0, p0, v1}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;)V

    .line 477
    new-instance v0, Lcom/shopkick/app/activities/PageIdentifierV2;

    const-class v1, Lcom/shopkick/app/activities/FirstUseActivityV2;

    const-class v2, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;

    invoke-direct {v0, v1, v2, p1}, Lcom/shopkick/app/activities/PageIdentifierV2;-><init>(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    return-object v0
.end method

.method public gotoNextScreen()Z
    .locals 1

    const/4 v0, 0x0

    .line 204
    invoke-virtual {p0, v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen(Z)Z

    move-result v0

    return v0
.end method

.method public gotoNextScreen(Z)Z
    .locals 7

    .line 215
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appActivityManager:Lcom/shopkick/app/application/AppActivityManager;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppActivityManager;->getCurrentActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 222
    :cond_0
    iget-boolean v2, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->transitioningForBailout:Z

    if-eqz v2, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x0

    .line 227
    iget-object v3, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v3}, Lcom/shopkick/app/application/AppPreferences;->getFirstUseCompleted()Z

    move-result v3

    if-nez v3, :cond_2

    .line 228
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseSkScreens:Ljava/util/List;

    :cond_2
    if-eqz v2, :cond_9

    .line 231
    iget v3, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_9

    if-nez p1, :cond_9

    .line 233
    iget p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 234
    iget v3, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    const/4 v4, 0x1

    add-int/2addr v3, v4

    iput v3, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    .line 238
    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->translateSkUrlToPageId(Ljava/lang/String;)Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v3

    :cond_3
    :goto_0
    if-nez v3, :cond_4

    .line 239
    iget v5, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_4

    .line 240
    invoke-direct {p0, p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->translateSkUrlToPageId(Ljava/lang/String;)Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object v3

    if-nez v3, :cond_3

    .line 242
    iget p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 243
    iget v5, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    add-int/2addr v5, v4

    iput v5, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    goto :goto_0

    :cond_4
    if-nez v3, :cond_5

    .line 248
    invoke-direct {p0, v0, v1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->prepareToFinishFirstUse(Lcom/shopkick/app/activities/BaseActivity;Z)Z

    move-result p1

    return p1

    .line 252
    :cond_5
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object p1

    invoke-virtual {v3}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    .line 253
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccountDataSource;->userIsRegistered()Z

    move-result v2

    if-nez v2, :cond_7

    if-eqz p1, :cond_7

    const-class v2, Lcom/shopkick/app/launch/FirstUseV2InviteScreen;

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    .line 257
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->gotoNextScreen()Z

    move-result p1

    if-nez p1, :cond_6

    .line 258
    iget p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    sub-int/2addr p1, v4

    iput p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    return v1

    :cond_6
    return v4

    .line 264
    :cond_7
    invoke-virtual {v0, v3}, Lcom/shopkick/app/activities/BaseActivity;->goToScreenForPageIdentifierV2(Lcom/shopkick/app/activities/PageIdentifierV2;)Z

    move-result p1

    if-nez p1, :cond_8

    .line 265
    iget p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    sub-int/2addr p1, v4

    iput p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->nextScreenIndex:I

    return v1

    :cond_8
    return v4

    .line 274
    :cond_9
    invoke-direct {p0, v0, p1}, Lcom/shopkick/app/launch/FirstUseControllerV2;->prepareToFinishFirstUse(Lcom/shopkick/app/activities/BaseActivity;Z)Z

    move-result p1

    return p1
.end method

.method public hasUserTriedToInvite()Z
    .locals 1

    .line 404
    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasUserTriedToInvite:Z

    return v0
.end method

.method public isInFirstUse()Z
    .locals 1

    .line 395
    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->inFirstUse:Z

    return v0
.end method

.method public launch()V
    .locals 1

    const/4 v0, 0x1

    .line 166
    iput-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->inFirstUse:Z

    .line 167
    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->prepareForOnlineFlow()V

    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string p2, "CreateGuestRequestSuccess"

    .line 354
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x77a16

    .line 355
    invoke-static {p1}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    .line 356
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->fetchFirstUseConfig()V

    :cond_0
    return-void
.end method

.method prepareForOnlineFlow()V
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->accountExists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->fetchFirstUseConfig()V

    goto :goto_0

    .line 177
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    invoke-virtual {v0}, Lcom/shopkick/app/account/UserAccountDataSource;->isCountryAvailableToCreateGuestAccount()Z

    move-result v0

    if-eqz v0, :cond_1

    const v0, 0x77a14

    .line 178
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onUserAction(I)V

    .line 179
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestSuccess"

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v1, v2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 180
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->userAccountDataSource:Lcom/shopkick/app/account/UserAccountDataSource;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/account/UserAccountDataSource;->makeUserCreateGuestRequestWithReason(I)V

    goto :goto_0

    .line 182
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "CreateGuestRequestFailureNoCountry"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :goto_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    const v0, 0x77a15

    .line 365
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onEndEvent(I)V

    const v0, 0x77a17

    .line 366
    invoke-static {v0}, Lcom/shopkick/app/application/SIP;->onUserAction(I)V

    .line 367
    iget-boolean v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasBailedOutToDefaultFlow:Z

    if-eqz v0, :cond_0

    return-void

    .line 370
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    if-ne p1, v0, :cond_3

    .line 371
    iget-boolean p1, p2, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz p1, :cond_2

    .line 372
    iget-object p1, p2, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigResponseV5;

    .line 373
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigResponseV5;->firstUseScreens:Ljava/util/List;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseSkScreens:Ljava/util/List;

    .line 374
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigResponseV5;->firstUseExperimentData:Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseExperimentData:Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;

    const/4 p2, 0x1

    .line 375
    iput-boolean p2, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->isReady:Z

    .line 376
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigResponseV5;->prefetchImageUrls:Ljava/util/List;

    .line 377
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigResponseV5;->firstUseExperimentData:Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/FirstUseExperimentData;->firstUseGiftCardPickerDetails:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;

    .line 378
    iget-object v0, v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;->imageUrl:Ljava/lang/String;

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 380
    :cond_1
    invoke-direct {p0, p2}, Lcom/shopkick/app/launch/FirstUseControllerV2;->fetchAndPinResources(Ljava/util/List;)V

    .line 381
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p2, "firstUseControllerReady"

    invoke-virtual {p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_1

    .line 383
    :cond_2
    invoke-direct {p0, p2}, Lcom/shopkick/app/launch/FirstUseControllerV2;->notifyFetchFailed(Lcom/shopkick/fetchers/DataResponse;)V

    :goto_1
    const/4 p1, 0x0

    .line 385
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->firstUseConfigRequestV5:Lcom/shopkick/app/fetchers/api/skapi/FirstUseConfigRequestV5;

    :cond_3
    return-void
.end method

.method public setFirstUseCompletedIfNotTrue()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getFirstUseCompleted()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->appPreferences:Lcom/shopkick/app/application/AppPreferences;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFirstUseCompleted(Z)V

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v1, "firstUseCompletedByCode"

    invoke-virtual {v0, v1}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    :cond_0
    return-void
.end method

.method public setGottenTOSConfirmation(Z)V
    .locals 0

    .line 294
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->gottenTOSConfirmation:Z

    return-void
.end method

.method public setHasUserTriedToInvite(Z)V
    .locals 0

    .line 400
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseControllerV2;->hasUserTriedToInvite:Z

    return-void
.end method
