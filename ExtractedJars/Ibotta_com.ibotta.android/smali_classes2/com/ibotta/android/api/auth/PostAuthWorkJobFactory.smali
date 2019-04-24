.class public Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;
.super Ljava/lang/Object;
.source "PostAuthWorkJobFactory.java"


# instance fields
.field private final authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

.field private final criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

.field private final lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/android/api/critical/CriticalDependency;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    .line 38
    iput-object p3, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    .line 39
    iput-object p4, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

    return-void
.end method


# virtual methods
.method public createFor(Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;)Lcom/ibotta/android/api/auth/PostAuthWorkJob;
    .locals 10

    .line 55
    new-instance v9, Lcom/ibotta/android/api/auth/PostAuthWorkJob;

    iget-object v1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v2, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    iget-object v3, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    new-instance v4, Lcom/ibotta/api/call/customer/CustomerPostCall;

    invoke-direct {v4, p1}, Lcom/ibotta/api/call/customer/CustomerPostCall;-><init>(Lcom/ibotta/api/call/customer/CustomerPostCall$CallParams;)V

    sget-object v5, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    sget-object v6, Lcom/ibotta/android/api/auth/UserFamiliarity;->NEW_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    sget-object v7, Lcom/ibotta/android/api/auth/PostAuthType;->USER_AUTH:Lcom/ibotta/android/api/auth/PostAuthType;

    new-instance v8, Lcom/ibotta/android/api/auth/PostAuthTask;

    iget-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

    invoke-direct {v8, p1}, Lcom/ibotta/android/api/auth/PostAuthTask;-><init>(Lcom/ibotta/android/api/critical/CriticalDependency;)V

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/api/auth/PostAuthWorkJob;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/api/ApiCall;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/android/api/auth/UserFamiliarity;Lcom/ibotta/android/api/auth/PostAuthType;Ljava/lang/Runnable;)V

    return-object v9
.end method

.method public createFor(Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;)Lcom/ibotta/android/api/auth/PostAuthWorkJob;
    .locals 10

    .line 67
    new-instance v9, Lcom/ibotta/android/api/auth/PostAuthWorkJob;

    iget-object v1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v2, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    iget-object v3, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    new-instance v4, Lcom/ibotta/api/call/customer/CustomerPutCall;

    invoke-direct {v4, p1}, Lcom/ibotta/api/call/customer/CustomerPutCall;-><init>(Lcom/ibotta/api/call/customer/CustomerPutCall$CallParams;)V

    sget-object v5, Lcom/ibotta/api/model/auth/AuthType;->IBOTTA:Lcom/ibotta/api/model/auth/AuthType;

    sget-object v6, Lcom/ibotta/android/api/auth/UserFamiliarity;->EXISTING_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    sget-object v7, Lcom/ibotta/android/api/auth/PostAuthType;->USER_UPDATE:Lcom/ibotta/android/api/auth/PostAuthType;

    new-instance v8, Lcom/ibotta/android/api/auth/PostAuthTask;

    iget-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

    invoke-direct {v8, p1}, Lcom/ibotta/android/api/auth/PostAuthTask;-><init>(Lcom/ibotta/android/api/critical/CriticalDependency;)V

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/api/auth/PostAuthWorkJob;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/api/ApiCall;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/android/api/auth/UserFamiliarity;Lcom/ibotta/android/api/auth/PostAuthType;Ljava/lang/Runnable;)V

    return-object v9
.end method

.method public createFor(Lcom/ibotta/api/model/auth/Login;)Lcom/ibotta/android/api/auth/PostAuthWorkJob;
    .locals 10

    .line 43
    new-instance v9, Lcom/ibotta/android/api/auth/PostAuthWorkJob;

    iget-object v1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v2, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->authManager:Lcom/ibotta/android/state/user/auth/AuthManager;

    iget-object v3, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->lifecycleTracker:Lcom/ibotta/android/tracking/sdk/LifecycleTracker;

    new-instance v4, Lcom/ibotta/api/call/auth/LoginCall;

    invoke-direct {v4, p1}, Lcom/ibotta/api/call/auth/LoginCall;-><init>(Lcom/ibotta/api/model/auth/Login;)V

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/api/model/auth/Login;->getAuthType()Lcom/ibotta/api/model/auth/AuthType;

    move-result-object v5

    sget-object v6, Lcom/ibotta/android/api/auth/UserFamiliarity;->EXISTING_USER:Lcom/ibotta/android/api/auth/UserFamiliarity;

    sget-object v7, Lcom/ibotta/android/api/auth/PostAuthType;->USER_AUTH:Lcom/ibotta/android/api/auth/PostAuthType;

    new-instance v8, Lcom/ibotta/android/api/auth/PostAuthTask;

    iget-object p1, p0, Lcom/ibotta/android/api/auth/PostAuthWorkJobFactory;->criticalDependency:Lcom/ibotta/android/api/critical/CriticalDependency;

    invoke-direct {v8, p1}, Lcom/ibotta/android/api/auth/PostAuthTask;-><init>(Lcom/ibotta/android/api/critical/CriticalDependency;)V

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/api/auth/PostAuthWorkJob;-><init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/user/auth/AuthManager;Lcom/ibotta/android/tracking/sdk/LifecycleTracker;Lcom/ibotta/api/ApiCall;Lcom/ibotta/api/model/auth/AuthType;Lcom/ibotta/android/api/auth/UserFamiliarity;Lcom/ibotta/android/api/auth/PostAuthType;Ljava/lang/Runnable;)V

    return-object v9
.end method
