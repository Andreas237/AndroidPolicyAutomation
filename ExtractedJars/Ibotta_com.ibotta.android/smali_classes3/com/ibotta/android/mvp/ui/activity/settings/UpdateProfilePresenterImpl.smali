.class public Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;
.super Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter;
.source "UpdateProfilePresenterImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter<",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;",
        ">;",
        "Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenter;"
    }
.end annotation


# instance fields
.field private birthDate:Ljava/lang/String;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private customer:Lcom/ibotta/api/model/customer/Customer;

.field private customerById:Lcom/ibotta/android/service/api/job/SingleApiJob;

.field private email:Ljava/lang/String;

.field private firstName:Ljava/lang/String;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private gender:Lcom/ibotta/api/call/customer/Gender;

.field private lastName:Ljava/lang/String;

.field private notifyEmailUpdate:Z

.field private password:Ljava/lang/String;

.field private final postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

.field private final userState:Lcom/ibotta/android/state/user/UserState;

.field private final validation:Lcom/ibotta/android/util/Validation;

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/util/Validation;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 55
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter;-><init>(Lcom/ibotta/android/mvp/base/MvpPresenterActions;)V

    .line 56
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 57
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    .line 58
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 59
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    .line 60
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method

.method private didEmailChange()Z
    .locals 2

    .line 123
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object v0

    .line 124
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->email:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 125
    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private isValid()Z
    .locals 9

    .line 242
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->firstName:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    .line 243
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->lastName:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v1

    .line 244
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->email:Ljava/lang/String;

    invoke-interface {v2, v3}, Lcom/ibotta/android/util/Validation;->isValidEmail(Ljava/lang/String;)Z

    move-result v2

    .line 245
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->birthDate:Ljava/lang/String;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 246
    :goto_0
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->gender:Lcom/ibotta/api/call/customer/Gender;

    if-eqz v6, :cond_1

    const/4 v6, 0x1

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 247
    :goto_1
    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->zip:Ljava/lang/String;

    invoke-interface {v7, v8}, Lcom/ibotta/android/util/Validation;->isValidZip(Ljava/lang/String;)Z

    move-result v7

    if-nez v0, :cond_2

    .line 251
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showFirstNameInvalid()V

    goto :goto_2

    :cond_2
    if-nez v1, :cond_3

    .line 253
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showLastNameInvalid()V

    goto :goto_2

    :cond_3
    if-nez v2, :cond_4

    .line 255
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showEmailInvalid()V

    goto :goto_2

    :cond_4
    if-nez v3, :cond_5

    .line 257
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showBirthDateInvalid()V

    goto :goto_2

    :cond_5
    if-nez v6, :cond_6

    .line 259
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showGenderInvalid()V

    goto :goto_2

    :cond_6
    if-nez v7, :cond_7

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showZipInvalid()V

    :goto_2
    const/4 v4, 0x0

    :cond_7
    return v4
.end method

.method public static synthetic lambda$onUpdateProfileSuccess$0(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;Z)V
    .locals 2

    .line 219
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    if-eqz p1, :cond_0

    .line 222
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {p1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->finish()V

    :cond_0
    return-void
.end method

.method private onResetPasswordSuccess()V
    .locals 1

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showResetPasswordSuccess()V

    return-void
.end method

.method private onUpdateProfileSuccess()V
    .locals 3

    .line 212
    iget-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->notifyEmailUpdate:Z

    xor-int/lit8 v1, v0, 0x1

    if-eqz v0, :cond_0

    .line 214
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showEmailUpdateInstructions()V

    :cond_0
    const/4 v0, 0x0

    .line 216
    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->notifyEmailUpdate:Z

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    new-instance v2, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfilePresenterImpl$-ai_dySgDzv4dqTRMMiiy-xYiOI;

    invoke-direct {v2, p0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/-$$Lambda$UpdateProfilePresenterImpl$-ai_dySgDzv4dqTRMMiiy-xYiOI;-><init>(Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;Z)V

    invoke-interface {v0, v2}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->runAsync(Ljava/lang/Runnable;)V

    return-void
.end method

.method private resetPassword()V
    .locals 2

    .line 270
    new-instance v0, Lcom/ibotta/api/call/customer/CustomerResetPasswordPutCall;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->email:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/ibotta/api/call/customer/CustomerResetPasswordPutCall;-><init>(Ljava/lang/String;)V

    .line 271
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->submitApiCall(Lcom/ibotta/api/ApiCall;)V

    return-void
.end method

.method private saveProfile()V
    .locals 3

    .line 275
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->birthDate:Ljava/lang/String;

    .line 276
    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->parseBirthDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v1

    .line 275
    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->apiBirthDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 278
    new-instance v1, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;

    invoke-direct {v1}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;-><init>()V

    .line 279
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v2}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setCustomerId(I)V

    .line 280
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->password:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setPassword(Ljava/lang/String;)V

    .line 282
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->password:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setCurrentPassword(Ljava/lang/String;)V

    .line 283
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->lastName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setLastName(Ljava/lang/String;)V

    .line 284
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->firstName:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setFirstName(Ljava/lang/String;)V

    .line 285
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->email:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setEmail(Ljava/lang/String;)V

    .line 286
    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setBirthDate(Ljava/lang/String;)V

    .line 287
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->gender:Lcom/ibotta/api/call/customer/Gender;

    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setGender(Lcom/ibotta/api/call/customer/Gender;)V

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->zip:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;->setZip(Ljava/lang/String;)V

    .line 290
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->postAuthWorkJobFactory:Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->createFor(Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;)Lcom/ibotta/android/api/auth/PostAuthWorkJob;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->submitApiJob(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method private validate()V
    .locals 8

    .line 232
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->firstName:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v0

    .line 233
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->email:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v1

    .line 234
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->birthDate:Ljava/lang/String;

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 235
    :goto_0
    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->gender:Lcom/ibotta/api/call/customer/Gender;

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 236
    :goto_1
    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validation:Lcom/ibotta/android/util/Validation;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->zip:Ljava/lang/String;

    invoke-interface {v6, v7}, Lcom/ibotta/android/util/Validation;->isEntered(Ljava/lang/String;)Z

    move-result v6

    .line 238
    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v7, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    if-eqz v5, :cond_2

    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    invoke-interface {v7, v3}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setSaveEnabled(Z)V

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

    .line 156
    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 158
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customerById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    if-nez v1, :cond_0

    .line 159
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-interface {v1}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result v1

    .line 160
    new-instance v2, Lcom/ibotta/android/service/api/job/SingleApiJob;

    new-instance v3, Lcom/ibotta/api/call/customer/CustomerByIdCall;

    invoke-direct {v3, v1}, Lcom/ibotta/api/call/customer/CustomerByIdCall;-><init>(I)V

    invoke-direct {v2, v3}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    iput-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customerById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    .line 163
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customerById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method protected onAbandonFetchJobs()V
    .locals 1

    const/4 v0, 0x0

    .line 170
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customerById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method

.method public onBirthDateChanged(III)V
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v0, p1, p2, p3}, Lcom/ibotta/android/util/Formatting;->birthDate(III)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->birthDate:Ljava/lang/String;

    .line 84
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast p1, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    iget-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->birthDate:Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setBirthDate(Ljava/lang/String;)V

    .line 85
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validate()V

    return-void
.end method

.method public onChooseBirthDateFocused()V
    .locals 4

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->birthDate:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->parseBirthDate(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v0

    .line 104
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 105
    invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    const/4 v0, 0x1

    .line 107
    invoke-virtual {v1, v0}, Ljava/util/Calendar;->get(I)I

    move-result v0

    const/4 v2, 0x2

    .line 108
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->get(I)I

    move-result v2

    const/4 v3, 0x5

    .line 109
    invoke-virtual {v1, v3}, Ljava/util/Calendar;->get(I)I

    move-result v1

    .line 111
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v3, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v3, v0, v2, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showBirthDateChooser(III)V

    return-void
.end method

.method public onEmailChanged(Ljava/lang/String;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->email:Ljava/lang/String;

    .line 78
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validate()V

    return-void
.end method

.method public onEmailUpdateDialogClosed()V
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->finish()V

    return-void
.end method

.method protected onFetchFinishedSuccessfully()V
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customerById:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerByIdResponse;

    .line 176
    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerByIdResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 178
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->firstName:Ljava/lang/String;

    .line 179
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getLastName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->lastName:Ljava/lang/String;

    .line 180
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getBirthDate()Ljava/util/Date;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->uiBirthDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->birthDate:Ljava/lang/String;

    .line 181
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->email:Ljava/lang/String;

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getGenderEnum()Lcom/ibotta/api/call/customer/Gender;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->gender:Lcom/ibotta/api/call/customer/Gender;

    .line 183
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v0}, Lcom/ibotta/api/model/customer/Customer;->getZip()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->zip:Ljava/lang/String;

    .line 185
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getFirstName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setFirstName(Ljava/lang/String;)V

    .line 186
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getLastName()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setLastName(Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getBirthDate()Ljava/util/Date;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Formatting;->uiBirthDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setBirthDate(Ljava/lang/String;)V

    .line 188
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setEmail(Ljava/lang/String;)V

    .line 189
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getGender()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setGender(Ljava/lang/String;)V

    .line 190
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getZip()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setZip(Ljava/lang/String;)V

    .line 191
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->setSaveEnabled(Z)V

    return-void
.end method

.method public onFirstNameChanged(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->firstName:Ljava/lang/String;

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validate()V

    return-void
.end method

.method public onGenderChanged(Lcom/ibotta/api/call/customer/Gender;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->gender:Lcom/ibotta/api/call/customer/Gender;

    .line 91
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validate()V

    return-void
.end method

.method public onLastNameChanged(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->lastName:Ljava/lang/String;

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validate()V

    return-void
.end method

.method public onPasswordCaptured(Ljava/lang/String;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->password:Ljava/lang/String;

    .line 146
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->saveProfile()V

    return-void
.end method

.method public onRefresh()V
    .locals 2

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    .line 197
    invoke-super {p0}, Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter;->onRefresh()V

    return-void
.end method

.method public onResetPasswordClicked()V
    .locals 1

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showResetPasswordConfirmation()V

    return-void
.end method

.method public onResetPasswordConfirmed()V
    .locals 0

    .line 135
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->resetPassword()V

    return-void
.end method

.method public onResetPasswordDialogClosed()V
    .locals 2

    .line 140
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public onSaveProfileClicked()V
    .locals 2

    .line 116
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->isValid()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 117
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->didEmailChange()Z

    move-result v0

    iput-boolean v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->notifyEmailUpdate:Z

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->mvpView:Lcom/ibotta/android/mvp/base/MvpView;

    check-cast v0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->customer:Lcom/ibotta/api/model/customer/Customer;

    invoke-virtual {v1}, Lcom/ibotta/api/model/customer/Customer;->getEmail()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfileView;->showPasswordCapture(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method protected onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 1

    .line 202
    invoke-super {p0, p1}, Lcom/ibotta/android/mvp/base/loading/AbstractPasswordUsingMvpPresenter;->onSubmitJobSuccess(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    .line 204
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/api/call/customer/CustomerPutCall;

    if-eqz v0, :cond_0

    .line 205
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->onUpdateProfileSuccess()V

    goto :goto_0

    .line 206
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->getApiCall()Lcom/ibotta/api/ApiCall;

    move-result-object p1

    instance-of p1, p1, Lcom/ibotta/api/call/customer/CustomerResetPasswordPutCall;

    if-eqz p1, :cond_1

    .line 207
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->onResetPasswordSuccess()V

    :cond_1
    :goto_0
    return-void
.end method

.method public onZipChanged(Ljava/lang/String;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->zip:Ljava/lang/String;

    .line 97
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/settings/UpdateProfilePresenterImpl;->validate()V

    return-void
.end method
