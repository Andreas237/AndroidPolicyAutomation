.class public Lcom/ibotta/android/features/variant/FlagsUserFactory;
.super Ljava/lang/Object;
.source "FlagsUserFactory.java"


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final buildProfile:Lcom/ibotta/android/profile/BuildProfile;

.field private final googleAIDRetriever:Lcom/ibotta/android/async/device/GoogleAIDRetriever;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/async/device/GoogleAIDRetriever;Lcom/ibotta/android/profile/BuildProfile;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 21
    iput-object p2, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 22
    iput-object p3, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->googleAIDRetriever:Lcom/ibotta/android/async/device/GoogleAIDRetriever;

    .line 23
    iput-object p4, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    return-void
.end method


# virtual methods
.method public create()Lcom/ibotta/android/features/FlagsUser;
    .locals 5

    .line 27
    iget-object v0, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v0

    .line 28
    iget-object v1, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 29
    iget-object v1, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->googleAIDRetriever:Lcom/ibotta/android/async/device/GoogleAIDRetriever;

    invoke-interface {v1}, Lcom/ibotta/android/async/device/GoogleAIDRetriever;->getGoogleAID()Ljava/lang/String;

    move-result-object v1

    .line 30
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->hasEmployeeTesterRole()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 31
    :goto_1
    iget-object v3, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v3}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    const-string v3, ""

    goto :goto_2

    :cond_2
    iget-object v3, p0, Lcom/ibotta/android/features/variant/FlagsUserFactory;->buildProfile:Lcom/ibotta/android/profile/BuildProfile;

    invoke-interface {v3}, Lcom/ibotta/android/profile/BuildProfile;->getAppVersionName()Ljava/lang/String;

    move-result-object v3

    .line 33
    :goto_2
    new-instance v4, Lcom/ibotta/android/features/FlagsUser;

    invoke-direct {v4, v0, v1, v2, v3}, Lcom/ibotta/android/features/FlagsUser;-><init>(ZLjava/lang/String;ZLjava/lang/String;)V

    return-object v4
.end method
