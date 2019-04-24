.class public Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;
.super Landroid/os/AsyncTask;
.source "FAFSocialConnectAsyncTask.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field private authType:Lcom/ibotta/api/model/auth/AuthType;

.field private final cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

.field private customerId:I

.field private expiration:Ljava/lang/Long;

.field private id:Ljava/lang/String;

.field private secret:Ljava/lang/String;

.field private token:Ljava/lang/String;

.field private tokenSource:Lcom/ibotta/android/async/social/TokenSource;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/service/api/job/CacheClearJobFactory;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "FAFSocialConnectAsyncTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "FAFSocialConnectAsyncTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 3

    .line 65
    iget-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->tokenSource:Lcom/ibotta/android/async/social/TokenSource;

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 67
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/android/async/social/TokenSource;->load()V

    .line 68
    iget-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->tokenSource:Lcom/ibotta/android/async/social/TokenSource;

    invoke-interface {p1}, Lcom/ibotta/android/async/social/TokenSource;->getToken()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->token:Ljava/lang/String;

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->tokenSource:Lcom/ibotta/android/async/social/TokenSource;

    invoke-interface {p1}, Lcom/ibotta/android/async/social/TokenSource;->getExpiration()Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->expiration:Ljava/lang/Long;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v2, "Failed to load token from token source."

    .line 71
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    sget-object v1, Lcom/ibotta/android/crash/IbottaCrashProxy;->IbottaCrashManager:Lcom/ibotta/android/crash/CrashManager;

    invoke-virtual {v1, p1}, Lcom/ibotta/android/crash/CrashManager;->trackException(Ljava/lang/Throwable;)V

    return-object v0

    .line 77
    :cond_0
    :goto_0
    new-instance p1, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;

    invoke-direct {p1}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;-><init>()V

    .line 78
    iget-object v2, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->authType:Lcom/ibotta/api/model/auth/AuthType;

    invoke-virtual {p1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V

    .line 79
    iget v2, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->customerId:I

    invoke-virtual {p1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerId(I)V

    .line 80
    iget-object v2, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->id:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialIdentifier(Ljava/lang/String;)V

    .line 81
    iget-object v2, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->token:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialToken(Ljava/lang/String;)V

    .line 82
    iget-object v2, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->secret:Ljava/lang/String;

    invoke-virtual {p1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialSecret(Ljava/lang/String;)V

    .line 83
    iget-object v2, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->expiration:Ljava/lang/Long;

    invoke-virtual {p1, v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;->setCustomerSocialExpiration(Ljava/lang/Long;)V

    .line 85
    new-instance v2, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;

    invoke-direct {v2, p1}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;-><init>(Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall$CallParams;)V

    .line 87
    :try_start_1
    invoke-virtual {v2}, Lcom/ibotta/api/call/customer/socials/CustomerSocialsPostCall;->execute()Lcom/ibotta/api/ApiResponse;

    const-string p1, "Fire-and-forget social connection successful."

    .line 88
    new-array v2, v1, [Ljava/lang/Object;

    invoke-static {p1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    const-string v2, "Failed to do a fire-and-forget social connection."

    .line 90
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v2, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "FAFSocialConnectAsyncTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "FAFSocialConnectAsyncTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    :goto_0
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->onPostExecute(Ljava/lang/Void;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1

    .line 98
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 99
    iget-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->cacheClearFactory:Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method public setAuthType(Lcom/ibotta/api/model/auth/AuthType;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->authType:Lcom/ibotta/api/model/auth/AuthType;

    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 40
    iput p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->customerId:I

    return-void
.end method

.method public setExpiration(Ljava/lang/Long;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->expiration:Ljava/lang/Long;

    return-void
.end method

.method public setId(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->id:Ljava/lang/String;

    return-void
.end method

.method public setSecret(Ljava/lang/String;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->secret:Ljava/lang/String;

    return-void
.end method

.method public setToken(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->token:Ljava/lang/String;

    return-void
.end method

.method public setTokenSource(Lcom/ibotta/android/async/social/TokenSource;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/android/async/social/FAFSocialConnectAsyncTask;->tokenSource:Lcom/ibotta/android/async/social/TokenSource;

    return-void
.end method
