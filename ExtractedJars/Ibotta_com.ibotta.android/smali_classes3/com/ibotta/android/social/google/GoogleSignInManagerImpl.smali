.class public Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;
.super Ljava/lang/Object;
.source "GoogleSignInManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/social/google/GoogleSignInManager;


# instance fields
.field private final apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

.field private final apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private googleLinkListener:Lcom/ibotta/android/social/google/GoogleLinkListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final googleSignInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

.field private googleSignInListener:Lcom/ibotta/android/social/google/GoogleSignInListener;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleSignInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    .line 51
    iput-object p2, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 52
    iput-object p3, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 53
    iput-object p4, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    .line 54
    iput-object p5, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/social/google/GoogleLinkListener;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleLinkListener:Lcom/ibotta/android/social/google/GoogleLinkListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/ibotta/android/state/user/UserState;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    return-object p0
.end method

.method static synthetic access$200(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleSignInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    return-object p0
.end method

.method public static synthetic lambda$linkGoogleToIbotta$0(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleLinkListener:Lcom/ibotta/android/social/google/GoogleLinkListener;

    if-eqz v0, :cond_1

    .line 109
    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    iget-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleLinkListener:Lcom/ibotta/android/social/google/GoogleLinkListener;

    invoke-interface {p1}, Lcom/ibotta/android/social/google/GoogleLinkListener;->onGoogleLinkSuccess()V

    goto :goto_0

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleLinkListener:Lcom/ibotta/android/social/google/GoogleLinkListener;

    invoke-interface {p1}, Lcom/ibotta/android/service/api/job/ApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/social/google/GoogleLinkListener;->onGoogleLinkFailed(Lcom/ibotta/api/ApiException;)V

    :cond_1
    :goto_0
    return-void
.end method

.method static synthetic lambda$onConnected$1(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)Ljava/lang/String;
    .locals 0

    .line 164
    invoke-virtual {p0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getPhotoUrl()Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private onConnected(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    .locals 5

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v0}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getExpirationTimeSecs()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    .line 157
    invoke-static {}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->builder()Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;

    move-result-object v2

    .line 158
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-static {v3, v4}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;->id(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;

    move-result-object v2

    .line 159
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getServerAuthCode()Ljava/lang/String;

    move-result-object v3

    const-string v4, ""

    invoke-static {v3, v4}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;->authCode(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;

    move-result-object v2

    .line 160
    invoke-virtual {v2, v0, v1}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;->expiration(J)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;

    move-result-object v0

    .line 161
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getGivenName()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;->firstName(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;

    move-result-object v0

    .line 162
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getFamilyName()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;->lastName(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;

    move-result-object v0

    .line 163
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getEmail()Ljava/lang/String;

    move-result-object v1

    const-string v2, ""

    invoke-static {v1, v2}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;->email(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;

    move-result-object v0

    .line 164
    invoke-virtual {p1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;->getPhotoUrl()Landroid/net/Uri;

    move-result-object v1

    const-string v2, ""

    new-instance v3, Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$UWzY9NyV6OvED2l4WFZBfAPzI8w;

    invoke-direct {v3, p1}, Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$UWzY9NyV6OvED2l4WFZBfAPzI8w;-><init>(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V

    invoke-static {v1, v2, v3}, Lcom/ibotta/android/util/AppHelper$-CC;->sanitizeNull(Ljava/lang/Object;Ljava/lang/Object;Ljava9/util/function/Supplier;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;->profilePicUrl(Ljava/lang/String;)Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;

    move-result-object p1

    .line 165
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo$Builder;->build()Lcom/ibotta/android/state/social/GoogleSignInInfo;

    move-result-object p1

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->setGoogleSignInInfo(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V

    .line 169
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleSignInListener:Lcom/ibotta/android/social/google/GoogleSignInListener;

    if-eqz v0, :cond_0

    .line 170
    invoke-interface {v0, p1}, Lcom/ibotta/android/social/google/GoogleSignInListener;->onGoogleAuthSuccess(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V

    :cond_0
    return-void
.end method

.method private onConnectionFailed(Lcom/google/android/gms/common/api/ApiException;)V
    .locals 1

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->deleteGoogleSignInAuth()V

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleSignInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;->revokeAccess()Lcom/google/android/gms/tasks/Task;

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleSignInListener:Lcom/ibotta/android/social/google/GoogleSignInListener;

    if-eqz v0, :cond_0

    .line 179
    invoke-interface {v0, p1}, Lcom/ibotta/android/social/google/GoogleSignInListener;->onGoogleAuthFailure(Lcom/google/android/gms/common/api/ApiException;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public getSignInIntent()Landroid/content/Intent;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleSignInClient:Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;

    invoke-virtual {v0}, Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;->getSignInIntent()Landroid/content/Intent;

    move-result-object v0

    return-object v0
.end method

.method public linkGoogleToIbotta()V
    .locals 4

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getGoogleSignInInfo()Lcom/ibotta/android/state/social/GoogleSignInInfo;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 99
    :cond_0
    new-instance v1, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-direct {v1}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;-><init>()V

    .line 100
    iget-object v2, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerId(I)V

    .line 101
    sget-object v2, Lcom/ibotta/api/model/auth/AuthType;->GOOGLE:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V

    .line 102
    invoke-virtual {v0}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialIdentifier(Ljava/lang/String;)V

    .line 103
    invoke-virtual {v0}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getExpiration()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialExpiration(Ljava/lang/Long;)V

    .line 104
    invoke-virtual {v0}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getAuthCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialAuthCode(Ljava/lang/String;)V

    .line 106
    new-instance v0, Lcom/ibotta/android/service/api/job/SingleApiJob;

    iget-object v2, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    invoke-interface {v2, v1}, Lcom/ibotta/api/call/ApiCallFactory;->createCustomerSocialsPostCall(Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;)Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 107
    new-instance v1, Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$LockE6gcW0vcnQjte9NBR5KdTtU;

    invoke-direct {v1, p0}, Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$LockE6gcW0vcnQjte9NBR5KdTtU;-><init>(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 117
    iget-object v1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-interface {v1, v0}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    const/4 p2, 0x6

    if-eq p1, p2, :cond_0

    return-void

    .line 78
    :cond_0
    invoke-static {p3}, Lcom/google/android/gms/auth/api/signin/GoogleSignIn;->getSignedInAccountFromIntent(Landroid/content/Intent;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    .line 83
    :try_start_0
    const-class p2, Lcom/google/android/gms/common/api/ApiException;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/tasks/Task;->getResult(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;

    .line 84
    invoke-direct {p0, p1}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->onConnected(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V
    :try_end_0
    .catch Lcom/google/android/gms/common/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string p2, "Google sign in failed: %s"

    const/4 p3, 0x1

    .line 86
    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/ApiException;->getStatusCode()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/auth/api/signin/GoogleSignInStatusCodes;->getStatusCodeString(I)Ljava/lang/String;

    move-result-object v1

    aput-object v1, p3, v0

    invoke-static {p1, p2, p3}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    sget-object p2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    .line 88
    invoke-direct {p0, p1}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->onConnectionFailed(Lcom/google/android/gms/common/api/ApiException;)V

    :goto_0
    return-void
.end method

.method public setGoogleLinkListener(Lcom/ibotta/android/social/google/GoogleLinkListener;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/social/google/GoogleLinkListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleLinkListener:Lcom/ibotta/android/social/google/GoogleLinkListener;

    return-void
.end method

.method public setGoogleSignInListener(Lcom/ibotta/android/social/google/GoogleSignInListener;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/social/google/GoogleSignInListener;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 59
    iput-object p1, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->googleSignInListener:Lcom/ibotta/android/social/google/GoogleSignInListener;

    return-void
.end method

.method public unlinkGoogleFromIbotta(I)V
    .locals 2

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v0

    .line 123
    new-instance v1, Lcom/ibotta/api/call/customer/socials/CustomerSocialsDeleteCall;

    invoke-direct {v1, v0, p1}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsDeleteCall;-><init>(II)V

    .line 125
    new-instance p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-direct {p1, v1}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 126
    new-instance v0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl$1;-><init>(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)V

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->apiWorkSubmitter:Lcom/ibotta/android/service/api/ApiWorkSubmitter;

    invoke-interface {v0, p1}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method
