.class public Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;
.source "RegistrationPresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenter;"
    }
.end annotation


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private dateOfBirth:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;

.field private final deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private initialized:Z

.field private final partnerAppChecker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

.field private final postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final validation:Lcom/ibotta/android/util/Validation;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;Lcom/ibotta/android/state/app/config/AppConfig;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;)V
    .locals 0

    .line 65
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 66
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 67
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    .line 68
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 69
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    .line 70
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 71
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->partnerAppChecker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    .line 72
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 73
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    return-void
.end method

.method private clearErrorsOnValidInputs(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)V
    .locals 2

    .line 375
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isValidEmail(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setEmailInputStateValid()V

    .line 379
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getPassword()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isValidPassword(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 380
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setPasswordInputStateValid()V

    .line 383
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getDateOfBirth()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isValidBirthDate(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 384
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setBirthdateInputStateValid()V

    .line 387
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getZipCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isValidZip(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 388
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setZipCodeInputStateValid()V

    .line 391
    :cond_3
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getReferralCode()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    .line 392
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getReferralCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isValidReferralCode(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_4

    .line 393
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setReferralCodeInputStateValid()V

    goto :goto_0

    .line 395
    :cond_4
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setReferralCodeInputStateValid()V

    :goto_0
    return-void
.end method

.method private getOnboardingRetailers(Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/service/api/job/SingleApiJob;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;",
            ">;"
        }
    .end annotation

    .line 231
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 233
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v1

    instance-of v1, v1, Lcom/ibotta/api/call/customer/CustomerResponse;

    if-eqz v1, :cond_0

    .line 235
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/CustomerResponse;

    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/CustomerResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getOnboardingModules()Ljava/util/List;

    move-result-object p1

    .line 237
    invoke-static {p1}, Ljava9/util/stream/StreamSupport;->stream(Ljava/util/Collection;)Ljava9/util/stream/Stream;

    move-result-object p1

    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationPresenterImpl$z5xj6hiObkQQx6J5MilzWppAhKg;->INSTANCE:Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$RegistrationPresenterImpl$z5xj6hiObkQQx6J5MilzWppAhKg;

    .line 238
    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->map(Ljava9/util/function/Function;)Ljava9/util/stream/Stream;

    move-result-object p1

    .line 242
    invoke-static {}, Ljava9/util/stream/Collectors;->toUnmodifiableList()Ljava9/util/stream/Collector;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava9/util/stream/Stream;->collect(Ljava9/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    :cond_0
    return-object v0
.end method

.method private initWithFacebookInfo(Lcom/ibotta/android/state/social/FacebookInfo;)V
    .locals 4

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setFirstName(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getLastName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setLastName(Ljava/lang/String;)V

    .line 98
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setEmail(Ljava/lang/String;)V

    .line 100
    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 101
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 102
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getBirthDate()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Formatting;->parseBirthDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v1, 0x2

    .line 104
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v1

    const/4 v2, 0x5

    .line 105
    invoke-virtual {v0, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x1

    .line 106
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 108
    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;

    invoke-direct {v3, v0, v1, v2}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;-><init>(III)V

    iput-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->dateOfBirth:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;

    .line 109
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/FacebookInfo;->getBirthDate()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setBirthdate(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private initWithGoogleSignInInfo(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V
    .locals 2

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setFirstName(Ljava/lang/String;)V

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getLastName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setLastName(Ljava/lang/String;)V

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-virtual {p1}, Lcom/ibotta/android/state/social/GoogleSignInInfo;->getEmail()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setEmail(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic lambda$getOnboardingRetailers$0(Lcom/ibotta/api/model/customer/OnboardingModule;)Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;
    .locals 2

    .line 239
    new-instance v0, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;

    .line 240
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/OnboardingModule;->getTitle()Ljava/lang/String;

    move-result-object v1

    .line 241
    invoke-virtual {p0}, Lcom/ibotta/api/model/customer/OnboardingModule;->getOnboardingRetailers()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleHelper;->convertToOnboardingRetailerParcels(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lcom/ibotta/android/fragment/onboardingmodule/OnboardingModuleParcel;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method private validateRegistrationForm(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)Z
    .locals 8

    .line 318
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    .line 319
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v1

    .line 320
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getEmail()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/util/Validation;->isValidEmail(Ljava/lang/String;)Z

    move-result v2

    .line 321
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getPassword()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/ibotta/android/util/Validation;->isValidPassword(Ljava/lang/String;)Z

    move-result v3

    .line 322
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getZipCode()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/ibotta/android/util/Validation;->isValidZip(Ljava/lang/String;)Z

    move-result v4

    .line 323
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getDateOfBirth()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/ibotta/android/util/Validation;->isValidBirthDate(Ljava/lang/String;)Z

    move-result v5

    .line 326
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getReferralCode()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    .line 327
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getReferralCode()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v6, p1}, Lcom/ibotta/android/util/Validation;->isValidReferralCode(Ljava/lang/String;)Z

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    :goto_0
    if-nez v2, :cond_1

    .line 333
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v6, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v6}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setEmailInputStateError()V

    :cond_1
    if-nez v3, :cond_2

    .line 337
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v6, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v6}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setPasswordInputStateError()V

    :cond_2
    if-nez v5, :cond_3

    .line 341
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v6, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v6}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setBirthdateInputStateError()V

    :cond_3
    if-nez v4, :cond_4

    .line 345
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v6, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v6}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setZipCodeInputStateError()V

    :cond_4
    if-nez p1, :cond_5

    .line 349
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v6, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v6}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setReferralCodeInputStateError()V

    :cond_5
    const/4 v6, 0x0

    if-nez v0, :cond_6

    .line 354
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showInvalidFirstName()V

    goto :goto_1

    :cond_6
    if-nez v1, :cond_7

    .line 356
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showInvalidLastName()V

    goto :goto_1

    :cond_7
    if-nez v2, :cond_8

    .line 358
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showInvalidEmail()V

    goto :goto_1

    :cond_8
    if-nez v3, :cond_9

    .line 360
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showInvalidPassword()V

    goto :goto_1

    :cond_9
    if-nez v4, :cond_a

    .line 362
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showInvalidZipCode()V

    goto :goto_1

    :cond_a
    if-nez v5, :cond_b

    .line 364
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showInvalidDateOfBirth()V

    goto :goto_1

    :cond_b
    if-nez p1, :cond_c

    .line 366
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showInvalidReferralCode()V

    goto :goto_1

    :cond_c
    const/4 v6, 0x1

    :goto_1
    return v6
.end method


# virtual methods
.method protected getFetchJobs()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lcom/ibotta/android/service/api/job/ApiJob;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 0

    return-void
.end method

.method public onBirthdateChanged(Ljava/lang/String;)V
    .locals 1

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isValidBirthDate(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 292
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setBirthdateInputStateValid()V

    goto :goto_0

    .line 294
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setBirthdateInputStateError()V

    :goto_0
    return-void
.end method

.method public onBirthdateSet(III)V
    .locals 1

    .line 158
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;-><init>(III)V

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->dateOfBirth:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;

    .line 160
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/util/Formatting;->birthDate(III)Ljava/lang/String;

    move-result-object p1

    .line 161
    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p2, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p2, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setDateOfBirth(Ljava/lang/String;)V

    return-void
.end method

.method public onDateOfBirthFocused()V
    .locals 7

    .line 138
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->dateOfBirth:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 139
    iget v0, v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;->dateOfBirthYear:I

    .line 140
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->dateOfBirth:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;

    iget v2, v2, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;->dateOfBirthMonth:I

    .line 141
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->dateOfBirth:Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;

    iget v3, v3, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl$DateOfBirth;->dateOfBirthDayOfMonth:I

    goto :goto_0

    .line 143
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 145
    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v2

    add-int/lit8 v2, v2, -0x1e

    const/4 v3, 0x2

    .line 146
    invoke-virtual {v0, v3}, Ljava/util/Calendar;->get(I)I

    move-result v3

    const/4 v4, 0x5

    .line 147
    invoke-virtual {v0, v4}, Ljava/util/Calendar;->get(I)I

    move-result v0

    move v6, v3

    move v3, v0

    move v0, v2

    move v2, v6

    .line 150
    :goto_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    const/16 v5, -0x64

    .line 151
    invoke-virtual {v4, v1, v5}, Ljava/util/Calendar;->roll(II)V

    .line 153
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v1, v0, v2, v3, v4}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showDateOfBirthPicker(IIILjava/util/Calendar;)V

    return-void
.end method

.method public onEmailChanged(Ljava/lang/String;)V
    .locals 1

    .line 270
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isValidEmail(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 272
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setEmailInputStateValid()V

    goto :goto_0

    .line 274
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setEmailInputStateError()V

    :goto_0
    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 0

    return-void
.end method

.method public onFirstNameChanged(Ljava/lang/String;)V
    .locals 1

    .line 250
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 252
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setFirstNameInputStateValid()V

    goto :goto_0

    .line 254
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setFirstNameInputStateError()V

    :goto_0
    return-void
.end method

.method public onGenderFocused()V
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->showGenderPicker()V

    return-void
.end method

.method public onGenderSelected(Ljava/lang/String;)V
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setGender(Ljava/lang/String;)V

    return-void
.end method

.method public onLastNameChanged(Ljava/lang/String;)V
    .locals 1

    .line 260
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 262
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setLastNameInputStateValid()V

    goto :goto_0

    .line 264
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setLastNameInputStateError()V

    :goto_0
    return-void
.end method

.method public onPasswordChanged(Ljava/lang/String;)V
    .locals 1

    .line 280
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isValidPassword(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 282
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setPasswordInputStateValid()V

    goto :goto_0

    .line 284
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setPasswordInputStateError()V

    :goto_0
    return-void
.end method

.method public onReferralCodeChanged(Ljava/lang/String;)V
    .locals 1

    .line 310
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isValidReferralCode(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 313
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setReferralCodeInputStateError()V

    goto :goto_1

    .line 311
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setReferralCodeInputStateValid()V

    :goto_1
    return-void
.end method

.method public onRegistrationChanged(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)V
    .locals 7

    .line 176
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    .line 177
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v1

    .line 178
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getEmail()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v2

    .line 179
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getPassword()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v3

    .line 180
    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getDateOfBirth()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v4

    .line 181
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getZipCode()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v5

    .line 183
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->clearErrorsOnValidInputs(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)V

    .line 185
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    if-eqz v5, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p1, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setSignUpEnabled(Z)V

    return-void
.end method

.method public onSignUpClicked(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)V
    .locals 4

    .line 196
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validateRegistrationForm(Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 197
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getDateOfBirth()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->parseBirthDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->apiBirthDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 199
    new-instance v1, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;

    invoke-direct {v1}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;-><init>()V

    .line 200
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getFirstName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setFirstName(Ljava/lang/String;)V

    .line 201
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getLastName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setLastName(Ljava/lang/String;)V

    .line 202
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getEmail()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setEmail(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setPassword(Ljava/lang/String;)V

    .line 204
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getPassword()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setPasswordConfirmation(Ljava/lang/String;)V

    .line 205
    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setBirthDate(Ljava/lang/String;)V

    .line 206
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getGender()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/call/customer/Gender;->fromString(Ljava/lang/String;)Lcom/ibotta/api/call/customer/Gender;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setGender(Lcom/ibotta/api/call/customer/Gender;)V

    .line 207
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getZipCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setZip(Ljava/lang/String;)V

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->partnerAppChecker:Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    .line 209
    invoke-interface {v2}, Lcom/ibotta/android/state/app/config/AppConfig;->getPartnerAppTrackingConfig()Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;

    invoke-direct {v3, v2}, Lcom/ibotta/android/mvp/ui/activity/register/-$$Lambda$hu9Y5t-6CvYpB71O8xY33Vz4wBE;-><init>(Lcom/ibotta/android/state/app/config/pat/PartnerAppTrackingConfig;)V

    invoke-interface {v0, v3}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppChecker;->getInstalledPartnerAppJson(Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppNameAndIdMap;)Ljava/lang/String;

    move-result-object v0

    .line 208
    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setInstalledApps(Ljava/lang/String;)V

    .line 211
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->appHelper:Lcom/ibotta/android/util/AppHelper;

    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getReferralCode()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/ibotta/android/util/AppHelper;->isEmpty(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 212
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationForm;->getReferralCode()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setFriend(Ljava/lang/String;)V

    .line 215
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->deviceSecurity:Lcom/ibotta/android/security/DeviceSecurity;

    invoke-interface {p1}, Lcom/ibotta/android/security/DeviceSecurity;->getUniqueId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setDeviceUdid(Ljava/lang/String;)V

    .line 216
    sget-object p1, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {v1, p1}, Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;->setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V

    .line 218
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    invoke-virtual {p1, v1}, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->createFor(Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;)Lcom/ibotta/android/api/auth/PostAuthWorkJob;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    :cond_1
    return-void
.end method

.method public onStart()V
    .locals 2

    .line 78
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onStart()V

    .line 79
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->initialized:Z

    if-nez v0, :cond_2

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setSignUpEnabled(Z)V

    .line 82
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v0}, Lcom/ibotta/android/state/user/UserState;->getFacebookInfo()Lcom/ibotta/android/state/social/FacebookInfo;

    move-result-object v0

    .line 83
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getGoogleSignInInfo()Lcom/ibotta/android/state/social/GoogleSignInInfo;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 86
    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->initWithFacebookInfo(Lcom/ibotta/android/state/social/FacebookInfo;)V

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 88
    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->initWithGoogleSignInInfo(Lcom/ibotta/android/state/social/GoogleSignInInfo;)V

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 91
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->initialized:Z

    :cond_2
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 224
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractLoadingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 226
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->getOnboardingRetailers(Lcom/ibotta/android/service/api/job/SingleApiJob;)Ljava/util/List;

    move-result-object p1

    .line 227
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->notifySuccess(Ljava/util/List;)V

    return-void
.end method

.method public onZipCodeChanged(Ljava/lang/String;)V
    .locals 1

    .line 300
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Validation;->isValidZip(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 302
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setZipCodeInputStateValid()V

    goto :goto_0

    .line 304
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationPresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/register/RegistrationView;->setZipCodeInputStateError()V

    :goto_0
    return-void
.end method
