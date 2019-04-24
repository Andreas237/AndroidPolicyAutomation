.class public Lcom/ibotta/android/api/auth/PostAuthWorkJob;
.super Lcom/ibotta/android/service/api/job/SingleApiJob;
.source "PostAuthWorkJob.java"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final authType:Lcom/ibotta/api/model/auth/AuthType;

.field private final lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

.field private final postAuthTask:Ljava/lang/Runnable;

.field private final postAuthType:Lcom/ibotta/android/api/auth/PostAuthType;

.field private final userFamiliarity:Lcom/ibotta/android/api/auth/UserFamiliarity;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/api/ApiCall;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/android/api/auth/UserFamiliarity;Lcom/ibotta/android/api/auth/PostAuthType;Ljava/lang/Runnable;)V
    .locals 0

    .line 47
    invoke-direct {p0, p4}, Lcom/ibotta/android/service/api/job/SingleApiJob;-><init>(Lcom/ibotta/api/ApiCall;)V

    .line 49
    iput-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 50
    iput-object p2, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 51
    iput-object p3, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 52
    iput-object p5, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->authType:Lcom/ibotta/api/model/auth/AuthType;

    .line 53
    iput-object p6, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->userFamiliarity:Lcom/ibotta/android/api/auth/UserFamiliarity;

    .line 54
    iput-object p7, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->postAuthType:Lcom/ibotta/android/api/auth/PostAuthType;

    .line 55
    iput-object p8, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->postAuthTask:Ljava/lang/Runnable;

    .line 57
    invoke-virtual {p0, p0}, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    return-void
.end method


# virtual methods
.method protected onAfterApiCall()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/ibotta/api/ApiException;
        }
    .end annotation

    .line 62
    invoke-super {p0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->onAfterApiCall()V

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 65
    invoke-virtual {p0}, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/call/customer/CustomerResponse;

    invoke-virtual {v0}, Lcom/ibotta/api/call/customer/CustomerResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object v0

    const-string v1, "API auth set."

    const/4 v2, 0x0

    .line 67
    new-array v3, v2, [Ljava/lang/Object;

    invoke-static {v1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    iget-object v1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    invoke-interface {v1, v0}, Lcom/ibotta/android/state/user/auth/AuthManager;->setAuthenticatedUser(Lcom/ibotta/api/model/customer/Customer;)V

    const-string v0, "Executing post auth task now..."

    .line 70
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->postAuthTask:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    const-string v0, "Post auth task finished."

    .line 72
    new-array v1, v2, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 4

    .line 83
    invoke-interface {p1, p0}, Lcom/ibotta/android/service/api/job/ApiJob;->removeListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 85
    invoke-virtual {p0}, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->isSuccessfullyLoaded()Z

    move-result p1

    if-eqz p1, :cond_2

    const-string p1, "Finishing login..."

    const/4 v0, 0x0

    .line 86
    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p1, v1}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    invoke-virtual {p0}, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->getApiResponse()Lcom/ibotta/api/ApiResponse;

    move-result-object p1

    check-cast p1, Lcom/ibotta/api/call/customer/CustomerResponse;

    invoke-virtual {p1}, Lcom/ibotta/api/call/customer/CustomerResponse;->getCustomer()Lcom/ibotta/api/model/customer/Customer;

    move-result-object p1

    .line 90
    iget-object v1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->postAuthType:Lcom/ibotta/android/api/auth/PostAuthType;

    sget-object v2, Lcom/ibotta/android/api/auth/PostAuthType;->USER_AUTH:Lcom/ibotta/android/api/auth/PostAuthType;

    if-ne v1, v2, :cond_0

    .line 91
    iget-object v1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v2, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->authType:Lcom/ibotta/api/model/auth/AuthType;

    invoke-interface {v1, p1, v2}, Lcom/ibotta/android/state/user/UserState;->recordLogin(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/api/model/auth/AuthType;)V

    .line 94
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->userState:Lcom/ibotta/android/state/user/UserState;

    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getTestingRoles()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/state/user/UserState;->setCustomerTestRoles(Ljava/util/List;)V

    .line 96
    iget-object v1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    iget-object v2, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->userFamiliarity:Lcom/ibotta/android/api/auth/UserFamiliarity;

    sget-object v3, Lcom/ibotta/android/api/auth/UserFamiliarity;->EXISTING_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    if-ne v2, v3, :cond_1

    const/4 v0, 0x1

    :cond_1
    invoke-interface {v1, p1, v0}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackCustomer(Lcom/ibotta/api/model/customer/Customer;Z)V

    .line 98
    iget-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->postAuthType:Lcom/ibotta/android/api/auth/PostAuthType;

    sget-object v0, Lcom/ibotta/android/api/auth/PostAuthType;->USER_AUTH:Lcom/ibotta/android/api/auth/PostAuthType;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->userFamiliarity:Lcom/ibotta/android/api/auth/UserFamiliarity;

    sget-object v0, Lcom/ibotta/android/api/auth/UserFamiliarity;->NEW_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    if-ne p1, v0, :cond_2

    .line 99
    iget-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJob;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    invoke-interface {p1}, Lcom/ibotta/android/tracking/sdk/LifecycleTracker;->trackRegistration()V

    :cond_2
    return-void
.end method

.method public onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    return-void
.end method
