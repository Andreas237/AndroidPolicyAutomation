.class public Lcom/ibotta/android/social/facebook/FacebookManager;
.super Ljava/lang/Object;
.source "FacebookManager.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;,
        Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;,
        Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;,
        Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;,
        Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;
    }
.end annotation


# static fields
.field private static final FB_READ_PERMS:[Ljava/lang/String;


# instance fields
.field private final activity:Landroid/app/Activity;

.field private final apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private final deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

.field private fbAuthListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;

.field private fbCallbackManager:Lcom/facebook/CallbackManager;

.field private fbInfoListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;

.field private fbLinkListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;

.field private fbLoginListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;

.field private fbUiListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;

.field private final postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "user_birthday"

    const-string v1, "email"

    const-string v2, "user_friends"

    .line 49
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/social/facebook/FacebookManager;->FB_READ_PERMS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 106
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->activity:Landroid/app/Activity;

    .line 107
    iput-object p2, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    .line 108
    iput-object p3, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    .line 109
    iput-object p4, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    .line 110
    iput-object p5, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    .line 111
    iput-object p6, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 112
    iput-object p7, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 113
    iput-object p8, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/social/facebook/FacebookManager;)Landroid/app/Activity;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->activity:Landroid/app/Activity;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/social/facebook/FacebookManager;)Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;
    .locals 0

    .line 47
    iget-object p0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbUiListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;

    return-object p0
.end method

.method static synthetic access$1000(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onFacebookAuthCancelled()V

    return-void
.end method

.method static synthetic access$200(Lcom/ibotta/android/social/facebook/FacebookManager;Lcom/ibotta/api/model/customer/Customer;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->onFacebookLoginSuccess(Lcom/ibotta/api/model/customer/Customer;)V

    return-void
.end method

.method static synthetic access$300(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onFacebookLoginFailed()V

    return-void
.end method

.method static synthetic access$400(Lcom/ibotta/android/social/facebook/FacebookManager;Lcom/ibotta/android/state/social/FacebookInfo;)V
    .locals 0

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/social/facebook/FacebookManager;->onFacebookInfoSuccess(Lcom/ibotta/android/state/social/FacebookInfo;)V

    return-void
.end method

.method static synthetic access$500(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onFacebookInfoFailed()V

    return-void
.end method

.method static synthetic access$600(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onLinkSuccess()V

    return-void
.end method

.method static synthetic access$700(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onLinkFailed()V

    return-void
.end method

.method static synthetic access$800(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onUnlinkSuccess()V

    return-void
.end method

.method static synthetic access$900(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->onUnlinkFailed()V

    return-void
.end method

.method private authFacebook()V
    .locals 3

    const-string v0, "authFacebook"

    const/4 v1, 0x0

    .line 378
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 380
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbCallbackManager:Lcom/facebook/CallbackManager;

    new-instance v2, Lcom/ibotta/android/social/facebook/FacebookManager$5;

    invoke-direct {v2, p0}, Lcom/ibotta/android/social/facebook/FacebookManager$5;-><init>(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    invoke-virtual {v0, v1, v2}, Lcom/facebook/login/LoginManager;->registerCallback(Lcom/facebook/CallbackManager;Lcom/facebook/FacebookCallback;)V

    .line 396
    invoke-static {}, Lcom/facebook/login/LoginManager;->getInstance()Lcom/facebook/login/LoginManager;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->activity:Landroid/app/Activity;

    sget-object v2, Lcom/ibotta/android/social/facebook/FacebookManager;->FB_READ_PERMS:[Ljava/lang/String;

    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/login/LoginManager;->logInWithReadPermissions(Landroid/app/Activity;Ljava/util/Collection;)V

    return-void
.end method

.method private hasAllFacebookPerms()Z
    .locals 7

    .line 400
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    .line 401
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 405
    :cond_0
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->getPermissions()Ljava/util/Set;

    move-result-object v0

    .line 407
    sget-object v2, Lcom/ibotta/android/social/facebook/FacebookManager;->FB_READ_PERMS:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v4, v3, :cond_2

    aget-object v6, v2, v4

    .line 408
    invoke-interface {v0, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    add-int/lit8 v5, v5, 0x1

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 413
    :cond_2
    sget-object v0, Lcom/ibotta/android/social/facebook/FacebookManager;->FB_READ_PERMS:[Ljava/lang/String;

    array-length v0, v0

    if-ne v5, v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1

    :cond_4
    :goto_1
    return v1
.end method

.method private onFacebookAuthCancelled()V
    .locals 2

    const-string v0, "onFacebookAuthCancelled"

    const/4 v1, 0x0

    .line 333
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private onFacebookInfoFailed()V
    .locals 1

    .line 344
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbInfoListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;->onFacebookInfoFailed()V

    return-void
.end method

.method private onFacebookInfoSuccess(Lcom/ibotta/android/state/social/FacebookInfo;)V
    .locals 2

    .line 337
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/user/UserState;->saveFacebookId(Ljava/lang/String;)V

    .line 338
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->setFacebookInfo(Lcom/ibotta/android/state/social/FacebookInfo;)V

    .line 340
    iget-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbInfoListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;

    invoke-interface {p1}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;->onFacebookInfoSuccess()V

    return-void
.end method

.method private onFacebookLoginFailed()V
    .locals 1

    .line 374
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbLoginListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;->onFacebookLoginFailed()V

    return-void
.end method

.method private onFacebookLoginSuccess(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 1

    .line 368
    invoke-virtual {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->doSocialConnectionFacebookAsync()V

    .line 370
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbLoginListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;

    invoke-interface {v0, p1}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;->onFacebookLoginSuccess(Lcom/ibotta/api/model/customer/Customer;)V

    return-void
.end method

.method private onLinkFailed()V
    .locals 1

    .line 354
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->deleteFacebookAuth()V

    .line 355
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbLinkListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;->onFacebookLinkFailed()V

    return-void
.end method

.method private onLinkSuccess()V
    .locals 1

    .line 348
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbLinkListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;

    if-eqz v0, :cond_0

    .line 349
    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;->onFacebookLinkSuccess()V

    :cond_0
    return-void
.end method

.method private onUnlinkFailed()V
    .locals 1

    .line 364
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbLinkListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;->onFacebookUnlinkFailed()V

    return-void
.end method

.method private onUnlinkSuccess()V
    .locals 1

    .line 359
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->deleteFacebookAuth()V

    .line 360
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbLinkListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;->onFacebookUnlinkSuccess()V

    return-void
.end method


# virtual methods
.method protected doSocialConnectionFacebookAsync()V
    .locals 7

    const-string v0, "doSocialConnectionFacebookAsync"

    const/4 v1, 0x0

    .line 417
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 418
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Skipping Facebook async connection. Not logged in."

    .line 419
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    const-wide/16 v2, 0x0

    .line 426
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 428
    invoke-virtual {v4}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v0

    .line 429
    invoke-virtual {v4}, Lcom/facebook/AccessToken;->getExpires()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    .line 432
    :cond_1
    new-instance v4, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;

    iget-object v5, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    iget-object v6, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-direct {v4, v5, v6}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;-><init>(Lcom/ibotta/android/service/api/job/CacheClearJobFactory;Lcom/ibotta/android/state/user/UserState;)V

    .line 433
    sget-object v5, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v4, v5}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V

    .line 434
    iget-object v5, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v5}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->setCustomerId(I)V

    .line 435
    iget-object v5, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v5}, Lcom/ibotta/android/state/user/UserState;->getFacebookId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->setId(Ljava/lang/String;)V

    .line 436
    invoke-virtual {v4, v0}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->setToken(Ljava/lang/String;)V

    .line 437
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->setExpiration(Ljava/lang/Long;)V

    .line 439
    new-array v0, v1, [Ljava/lang/Void;

    instance-of v1, v4, Landroid/os/AsyncTask;

    if-nez v1, :cond_2

    invoke-virtual {v4, v0}, Lcom/ibotta/android/async/social/FAFFacebookSocialConnectAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_2
    check-cast v4, Landroid/os/AsyncTask;

    invoke-static {v4, v0}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method public ensureFacebookSession()Z
    .locals 3

    const-string v0, "ensureFacebookSession"

    const/4 v1, 0x0

    .line 151
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->hasAllFacebookPerms()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 158
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->authFacebook()V

    return v1
.end method

.method public fetchInfo()V
    .locals 2

    const-string v0, "fetchInfo"

    const/4 v1, 0x0

    .line 206
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v1, Lcom/ibotta/android/social/facebook/FacebookInfoApiCall;

    invoke-direct {v1}, Lcom/ibotta/android/social/facebook/FacebookInfoApiCall;-><init>()V

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 208
    new-instance v1, Lcom/ibotta/android/social/facebook/FacebookManager$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/social/facebook/FacebookManager$2;-><init>(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 235
    iget-object v1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public linkFacebookToIbotta()V
    .locals 5

    .line 242
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 244
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v1

    .line 245
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->getExpires()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    .line 248
    :goto_0
    new-instance v0, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-direct {v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;-><init>()V

    .line 249
    iget-object v4, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v4}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v4

    invoke-virtual {v0, v4}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerId(I)V

    .line 250
    sget-object v4, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v0, v4}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V

    .line 251
    iget-object v4, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v4}, Lcom/ibotta/android/state/user/UserState;->getFacebookId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialIdentifier(Ljava/lang/String;)V

    if-eqz v1, :cond_1

    .line 253
    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialToken(Ljava/lang/String;)V

    .line 255
    :cond_1
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialExpiration(Ljava/lang/Long;)V

    .line 257
    iget-object v1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v1, v0}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerSocialsPostCall(Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;)Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;

    move-result-object v0

    .line 259
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {v1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 260
    new-instance v0, Lcom/ibotta/android/social/facebook/FacebookManager$3;

    invoke-direct {v0, p0}, Lcom/ibotta/android/social/facebook/FacebookManager$3;-><init>(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    invoke-virtual {v1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 284
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-interface {v0, v1}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public logIn()V
    .locals 6

    .line 164
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getFacebookId()Ljava/lang/String;

    move-result-object v0

    .line 168
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 170
    invoke-virtual {v1}, Lcom/facebook/AccessToken;->getToken()Ljava/lang/String;

    move-result-object v2

    .line 171
    invoke-virtual {v1}, Lcom/facebook/AccessToken;->getExpires()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    .line 174
    :goto_0
    invoke-static {}, Lcom/ibotta/api/model/auth/Login;->builder()Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v1

    sget-object v5, Lcom/ibotta/api/model/auth/AuthType;->FACEBOOK:Lcom/ibotta/api/model/auth/AuthType;

    .line 175
    invoke-virtual {v1, v5}, Lcom/ibotta/api/model/auth/Login$Builder;->authType(Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v1

    iget-object v5, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    .line 176
    invoke-interface {v5}, Lcom/ibotta/android/security/DeviceSecurity;->getUniqueId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/ibotta/api/model/auth/Login$Builder;->deviceUdid(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v1

    .line 177
    invoke-virtual {v1, v0}, Lcom/ibotta/api/model/auth/Login$Builder;->customerSocialIdentifier(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    .line 178
    invoke-virtual {v0, v2}, Lcom/ibotta/api/model/auth/Login$Builder;->customerSocialToken(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    .line 179
    invoke-virtual {v0, v3, v4}, Lcom/ibotta/api/model/auth/Login$Builder;->customerSocialExpiration(J)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    .line 180
    invoke-virtual {v0}, Lcom/ibotta/api/model/auth/Login$Builder;->build()Lcom/ibotta/api/model/auth/Login;

    move-result-object v0

    .line 182
    iget-object v1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    invoke-virtual {v1, v0}, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->createFor(Lcom/ibotta/api/model/auth/Login;)Lcom/ibotta/android/api/auth/PostAuthWorkJob;

    move-result-object v0

    .line 183
    new-instance v1, Lcom/ibotta/android/social/facebook/FacebookManager$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/social/facebook/FacebookManager$1;-><init>(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 202
    iget-object v1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    .line 145
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbCallbackManager:Lcom/facebook/CallbackManager;

    if-eqz v0, :cond_0

    .line 146
    invoke-interface {v0, p1, p2, p3}, Lcom/facebook/CallbackManager;->onActivityResult(IILandroid/content/Intent;)Z

    :cond_0
    return-void
.end method

.method public onCreate()V
    .locals 1

    .line 137
    invoke-static {}, Lcom/facebook/CallbackManager$Factory;->create()Lcom/facebook/CallbackManager;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbCallbackManager:Lcom/facebook/CallbackManager;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    const/4 v0, 0x0

    .line 141
    iput-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbCallbackManager:Lcom/facebook/CallbackManager;

    return-void
.end method

.method protected onFacebookAuthFail(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "onFacebookAuthFail"

    const/4 v1, 0x0

    .line 324
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 325
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->deleteFacebookAuth()V

    .line 327
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbAuthListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;->onFacebookAuthFailed()V

    .line 329
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected onFacebookAuthSuccess()V
    .locals 2

    const-string v0, "onFacebookAuthSuccess"

    const/4 v1, 0x0

    .line 314
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 315
    invoke-static {}, Lcom/facebook/AccessToken;->getCurrentAccessToken()Lcom/facebook/AccessToken;

    move-result-object v0

    .line 316
    iget-object v1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbUiListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;

    invoke-interface {v1}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;->isAutoSocialConnect()Z

    move-result v1

    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/facebook/AccessToken;->isExpired()Z

    move-result v0

    if-nez v0, :cond_0

    .line 317
    invoke-virtual {p0}, Lcom/ibotta/android/social/facebook/FacebookManager;->fetchInfo()V

    .line 320
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbAuthListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;

    invoke-interface {v0}, Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;->onFacebookAuthSuccess()V

    return-void
.end method

.method public setAuthListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbAuthListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookAuthListener;

    return-void
.end method

.method public setInfoListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbInfoListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookInfoListener;

    return-void
.end method

.method public setLinkListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbLinkListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLinkListener;

    return-void
.end method

.method public setLoginListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbLoginListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookLoginListener;

    return-void
.end method

.method public setUiListener(Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->fbUiListener:Lcom/ibotta/android/social/facebook/FacebookManager$FacebookUiListener;

    return-void
.end method

.method public unlinkFacebookFromIbotta(I)V
    .locals 2

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    .line 289
    new-instance v1, Lcom/ibotta/api/call/customer/socials/CustomerSocialsDeleteCall;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsDeleteCall;-><init>(II)V

    .line 291
    new-instance p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {p1, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 292
    new-instance v0, Lcom/ibotta/android/social/facebook/FacebookManager$4;

    invoke-direct {v0, p0}, Lcom/ibotta/android/social/facebook/FacebookManager$4;-><init>(Lcom/ibotta/android/social/facebook/FacebookManager;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 310
    iget-object v0, p0, Lcom/ibotta/android/social/facebook/FacebookManager;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method
