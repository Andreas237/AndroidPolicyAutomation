.class public Lcom/ibotta/android/state/user/auth/AuthManagerImpl;
.super Ljava/lang/Object;
.source "AuthManagerImpl.java"

# interfaces
.implements Lcom/ibotta/android/state/user/auth/AuthManager;


# static fields
.field protected static final REFRESH_THRESHOLD:J


# instance fields
.field private final apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 24
    sget-object v0, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xc

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->REFRESH_THRESHOLD:J

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/call/ApiCallFactory;)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 32
    iput-object p2, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 33
    iput-object p3, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    return-void
.end method

.method private getApiAuth()Lcom/ibotta/android/state/user/auth/ApiAuth;
    .locals 3

    .line 121
    invoke-static {}, Lcom/ibotta/android/state/user/auth/ApiAuth;->builder()Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 122
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getAuthToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;->authToken(Ljava/lang/String;)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 123
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getAuthRefreshToken()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;->authRefreshToken(Ljava/lang/String;)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 124
    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getAuthTokenExpiration()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;->authTokenExpiration(J)Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;

    move-result-object v0

    .line 125
    invoke-virtual {v0}, Lcom/ibotta/android/state/user/auth/ApiAuth$Builder;->build()Lcom/ibotta/android/state/user/auth/ApiAuth;

    move-result-object v0

    return-object v0
.end method

.method private saveAuthRefreshToken(Ljava/lang/String;)V
    .locals 1

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->setAuthRefreshToken(Ljava/lang/String;)V

    return-void
.end method

.method private saveAuthToken(Ljava/lang/String;)V
    .locals 1

    .line 108
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->testValidAuthToken(Ljava/lang/String;)V

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->setAuthToken(Ljava/lang/String;)V

    return-void
.end method

.method private saveAuthTokenExpiration(Ljava/util/Date;)V
    .locals 3
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    goto :goto_0

    :cond_0
    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/state/user/UserState;->setAuthTokenExpiration(J)V

    return-void
.end method

.method private testValidAuthToken(Ljava/lang/String;)V
    .locals 3

    .line 131
    :try_start_0
    new-instance v0, Lokhttp3/Headers$Builder;

    invoke-direct {v0}, Lokhttp3/Headers$Builder;-><init>()V

    const-string v1, "foo"

    invoke-virtual {v0, v1, p1}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 133
    sget-object v0, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Cannot parse token as valid HTTP header"

    invoke-direct {v1, v2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public clearAuthentication()V
    .locals 1

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->deletePersistedData()V

    .line 69
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->deleteFacebookAuth()V

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->deleteGoogleSignInAuth()V

    return-void
.end method

.method public getAuthToken()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getAuthToken()Ljava/lang/String;

    move-result-object v0

    .line 39
    invoke-direct {p0, v0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->testValidAuthToken(Ljava/lang/String;)V

    return-object v0
.end method

.method public isAuthenticated()Z
    .locals 2

    .line 63
    sget-object v0, Lcom/ibotta/android/state/user/auth/ApiAuth;->EMPTY:Lcom/ibotta/android/state/user/auth/ApiAuth;

    invoke-direct {p0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->getApiAuth()Lcom/ibotta/android/state/user/auth/ApiAuth;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public onLogOut(Z)V
    .locals 0

    .line 104
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->clearAuthentication()V

    return-void
.end method

.method public refreshAuthToken()V
    .locals 5
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/android/state/user/auth/NotAuthenticatedException;
        }
    .end annotation

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->isAuthenticated()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    invoke-direct {p0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->getApiAuth()Lcom/ibotta/android/state/user/auth/ApiAuth;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/state/user/auth/ApiAuth;->getAuthTokenExpiration()J

    move-result-wide v0

    .line 80
    iget-object v2, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-interface {v2}, Lcom/ibotta/android/util/AppHelper;->getCurrentTime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    .line 82
    sget-wide v2, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->REFRESH_THRESHOLD:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->apiCallFactory:Lcom/ibotta/api/call/ApiCallFactory;

    iget-object v1, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/api/call/ApiCallFactory;->createRefreshTokenCall(I)Lcom/ibotta/api/call/auth/RefreshTokenCall;

    move-result-object v0

    const/4 v1, 0x0

    .line 88
    :try_start_0
    invoke-virtual {v0}, Lcom/ibotta/api/call/auth/RefreshTokenCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/auth/RefreshTokenResponse;

    .line 90
    invoke-virtual {v0}, Lcom/ibotta/api/call/auth/RefreshTokenResponse;->getAuthenticationToken()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->saveAuthToken(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v0}, Lcom/ibotta/api/call/auth/RefreshTokenResponse;->getAuthenticationToken()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->saveAuthRefreshToken(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v0}, Lcom/ibotta/api/call/auth/RefreshTokenResponse;->getAuthenticationTokenExpiration()Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->saveAuthTokenExpiration(Ljava/util/Date;)V

    const-string v0, "Auth token successfully refreshed."

    .line 94
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/ibotta/api/ApiException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 96
    sget-object v2, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v2, v0}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    const-string v2, "Failed to refresh user\'s auth token."

    .line 97
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    .line 76
    :cond_1
    new-instance v0, Lcom/ibotta/android/state/user/auth/NotAuthenticatedException;

    const-string v1, "Invalid request, user is not authenticated."

    invoke-direct {v0, v1}, Lcom/ibotta/android/state/user/auth/NotAuthenticatedException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setAuthToken(Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->saveAuthToken(Ljava/lang/String;)V

    return-void
.end method

.method public setAuthenticatedUser(Lcom/ibotta/api/model/customer/Customer;)V
    .locals 2

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getAuthenticationToken()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->saveAuthToken(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getAuthenticationToken()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->saveAuthRefreshToken(Ljava/lang/String;)V

    .line 54
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getAuthenticationTokenExpiration()Ljava/util/Date;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->saveAuthTokenExpiration(Ljava/util/Date;)V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/user/UserState;->setCustomerId(I)V

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getZip()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/user/UserState;->setCustomerZip(Ljava/lang/String;)V

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/state/user/auth/AuthManagerImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->isEligibleForPersonalization50()Z

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/state/user/UserState;->setEligibleForPersonalization(Z)V

    return-void
.end method
