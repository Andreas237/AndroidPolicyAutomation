.class public Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "LaunchPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenter;"
    }
.end annotation


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

.field private fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field private final postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final variantFactory:Lcom/ibotta/android/features/factory/VariantFactory;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/android/features/factory/VariantFactory;)V
    .locals 0

    .line 53
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 54
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    .line 55
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 56
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 57
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    .line 58
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->variantFactory:Lcom/ibotta/android/features/factory/VariantFactory;

    return-void
.end method

.method private getRetailerPickerVariant()Lcom/ibotta/android/features/apppicker/RetailerPickerVariant;
    .locals 3

    .line 239
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->variantFactory:Lcom/ibotta/android/features/factory/VariantFactory;

    const-string v1, "retailer_picker"

    const-class v2, Lcom/ibotta/android/features/apppicker/RetailerPickerVariant;

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/features/factory/VariantFactory;->getVariant(Ljava/lang/String;Ljava/lang/Class;)Lcom/ibotta/android/features/Variant;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/apppicker/RetailerPickerVariant;

    return-object v0
.end method

.method private isGoogleLoginCall(Lcom/ibotta/api/ApiCall;)Z
    .locals 2

    .line 214
    instance-of v0, p1, Lcom/ibotta/api/call/auth/LoginCall;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 215
    check-cast p1, Lcom/ibotta/api/call/auth/LoginCall;

    invoke-virtual {p1}, Lcom/ibotta/api/call/auth/LoginCall;->getLogin()Lcom/ibotta/api/model/auth/Login;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object p1

    .line 216
    sget-object v0, Lcom/ibotta/api/model/auth/AuthType;->GOOGLE:Lcom/ibotta/api/model/auth/AuthType;

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :cond_1
    return v1
.end method

.method private showFirstLoggedInScreen()V
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showFeatured()V

    .line 235
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->finish()V

    return-void
.end method

.method private showRegistrationSuccessScreen(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;)V"
        }
    .end annotation

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->isEligibleForPersonalization()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 224
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->getRetailerPickerVariant()Lcom/ibotta/android/features/apppicker/RetailerPickerVariant;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/features/apppicker/RetailerPickerVariant;->getPickerType()Lcom/ibotta/android/features/apppicker/PickerType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/features/apppicker/PickerType;->REMOVE_PICKER:Lcom/ibotta/android/features/apppicker/PickerType;

    if-eq v0, v1, :cond_0

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showPersonalStoreChooser(Ljava/util/List;)V

    goto :goto_0

    .line 227
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showFeatured()V

    .line 230
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->finish()V

    return-void
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    .line 63
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 65
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/auth/AuthManager;->isAuthenticated()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 66
    new-instance v1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v2, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v3}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v3

    invoke-direct {v2, v3}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v1, v2}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 69
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v1, :cond_1

    .line 70
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 78
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onDebugMenuRequested()V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showDebugMenu()V

    return-void
.end method

.method public onEmailLoginSuccess()V
    .locals 0

    .line 166
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->showFirstLoggedInScreen()V

    return-void
.end method

.method public onFacebookAuthSuccess()V
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    if-eqz v0, :cond_0

    .line 153
    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->fetchInfo()V

    :cond_0
    return-void
.end method

.method public onFacebookInfoSuccess()V
    .locals 1

    .line 159
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    if-eqz v0, :cond_0

    .line 160
    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->logIn()V

    :cond_0
    return-void
.end method

.method public onFacebookInteractionFailed()V
    .locals 2

    .line 142
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpPresenterActions:Lcom/ibotta/android/mvp/base/MvpPresenterActions;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/base/MvpPresenterActions;->isNetworkConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/user/UserState;->setNewUser(Z)V

    .line 144
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showRegistration()V

    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showNetworkConnectionErrorDialog()V

    :goto_0
    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->custByIdJob:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-eqz v0, :cond_0

    .line 84
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->showFirstLoggedInScreen()V

    goto :goto_0

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showControls()V

    .line 87
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->loadVideo()V

    :goto_0
    return-void
.end method

.method public onGoogleSignInSuccess(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V
    .locals 2

    .line 183
    invoke-static {}, Lcom/ibotta/api/model/auth/Login;->builder()Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/auth/AuthType;->GOOGLE:Lcom/ibotta/api/model/auth/AuthType;

    .line 184
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/auth/Login$Builder;->authType(Lcom/ibotta/api/model/auth/AuthType;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    .line 185
    invoke-interface {v1}, Lcom/ibotta/android/security/DeviceSecurity;->getUniqueId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/auth/Login$Builder;->deviceUdid(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    .line 186
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/auth/Login$Builder;->customerSocialIdentifier(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object v0

    .line 187
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getAuthCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/api/model/auth/Login$Builder;->customerSocialAuthCode(Ljava/lang/String;)Lcom/ibotta/api/model/auth/Login$Builder;

    move-result-object p1

    .line 188
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login$Builder;->build()Lcom/ibotta/api/model/auth/Login;

    move-result-object p1

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->createFor(Lcom/ibotta/api/model/auth/Login;)Lcom/ibotta/android/api/auth/PostAuthWorkJob;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public onLogInClicked()V
    .locals 2

    .line 121
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/user/UserState;->setNewUser(Z)V

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showLogIn()V

    return-void
.end method

.method public onLoginSuccess()V
    .locals 0

    .line 137
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->showFirstLoggedInScreen()V

    return-void
.end method

.method public onLostAuthDetected()V
    .locals 1

    .line 132
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showAuthLostMessage()V

    return-void
.end method

.method public onRegistrationSuccess(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;)V"
        }
    .end annotation

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getFacebookInfo()Lcom/ibotta/android/state/social/FacebookInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    if-eqz v0, :cond_0

    .line 172
    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->linkFacebookToIbotta()V

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getGoogleSignInInfo()Lcom/ibotta/android/state/social/GoogleSignInInfo;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    if-eqz v0, :cond_1

    .line 175
    invoke-interface {v0}, Lcom/ibotta/android/social/google/GoogleSignInManager;->linkGoogleToIbotta()V

    .line 178
    :cond_1
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->showRegistrationSuccessScreen(Ljava/util/List;)V

    return-void
.end method

.method public onSignInFacebookClicked()V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->ensureFacebookSession()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    invoke-virtual {v0}, Lcom/ibotta/android/social/facebook/FacebookManager;->fetchInfo()V

    :cond_0
    return-void
.end method

.method public onSignInGoogleClicked()V
    .locals 1

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->signInWithGoogle()V

    return-void
.end method

.method public onSignUpEmailClicked()V
    .locals 2

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/state/user/UserState;->setNewUser(Z)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showRegistration()V

    return-void
.end method

.method protected onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 204
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->isGoogleLoginCall(Lcom/ibotta/api/ApiCall;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/ibotta/android/state/user/UserState;->setNewUser(Z)V

    .line 206
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showRegistration()V

    .line 207
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->hideSubmittedJobLoading()V

    goto :goto_0

    .line 209
    :cond_0
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobFailed(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    :goto_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    .line 195
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 197
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->isGoogleLoginCall(Lcom/ibotta/api/ApiCall;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 198
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchView;->showFeatured()V

    :cond_0
    return-void
.end method

.method public setFacebookManager(Lcom/ibotta/android/social/facebook/FacebookManager;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->fbManager:Lcom/ibotta/android/social/facebook/FacebookManager;

    return-void
.end method

.method public setGoogleSignInManager(Lcom/ibotta/android/social/google/GoogleSignInManager;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/launch/LaunchPresenterImpl;->googleSignInManager:Lcom/ibotta/android/social/google/GoogleSignInManager;

    return-void
.end method
