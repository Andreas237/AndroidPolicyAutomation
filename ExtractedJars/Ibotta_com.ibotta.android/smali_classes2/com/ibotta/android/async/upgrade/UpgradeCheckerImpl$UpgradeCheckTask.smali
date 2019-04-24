.class public Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;
.super Landroid/os/AsyncTask;
.source "UpgradeCheckerImpl.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "UpgradeCheckTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field final synthetic this$0:Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;


# direct methods
.method protected constructor <init>(Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;)V
    .locals 0

    .line 168
    iput-object p1, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->this$0:Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "UpgradeCheckerImpl$UpgradeCheckTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "UpgradeCheckerImpl$UpgradeCheckTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
    .locals 5

    const/4 p1, 0x0

    const/4 v0, 0x0

    .line 175
    :try_start_0
    invoke-virtual {p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->isCancelled()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 179
    :cond_0
    new-instance v1, Lcom/ibotta/api/call/config/ConfigVersionCall;

    invoke-static {}, Lcom/ibotta/android/App;->getPlatform()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/ibotta/api/call/config/ConfigVersionCall;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 182
    :try_start_1
    invoke-virtual {v1}, Lcom/ibotta/api/call/config/ConfigVersionCall;->execute()Lcom/ibotta/api/ApiResponse;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/call/config/ConfigVersionResponse;
    :try_end_1
    .catch Lcom/ibotta/api/ApiException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_2
    const-string v3, "Failed to check for version upgrade."

    .line 184
    new-array v4, p1, [Ljava/lang/Object;

    invoke-static {v2, v3, v4}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v2, v0

    .line 187
    :goto_0
    invoke-virtual {v1}, Lcom/ibotta/api/call/config/ConfigVersionCall;->isSuccess()Z

    move-result v1

    if-eqz v1, :cond_2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/ibotta/api/call/config/ConfigVersionResponse;->getVersions()Ljava/util/LinkedHashMap;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 188
    invoke-virtual {v2}, Lcom/ibotta/api/call/config/ConfigVersionResponse;->getVersions()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 190
    invoke-virtual {v2}, Lcom/ibotta/api/call/config/ConfigVersionResponse;->getVersions()Ljava/util/LinkedHashMap;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object v2, v0

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    goto :goto_1

    .line 194
    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    move-object v0, v1

    goto :goto_2

    :catch_1
    move-exception v1

    const-string v2, "Failed to perform upgrade check."

    .line 198
    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v1, v2, p1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_2
    :goto_2
    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "UpgradeCheckerImpl$UpgradeCheckTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "UpgradeCheckerImpl$UpgradeCheckTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 168
    :goto_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->onPostExecute(Ljava/lang/String;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 1

    .line 206
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 207
    invoke-virtual {p0}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 211
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl$UpgradeCheckTask;->this$0:Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/async/upgrade/UpgradeCheckerImpl;->onUpgradeCheckFinished(Ljava/lang/String;)V

    return-void
.end method
