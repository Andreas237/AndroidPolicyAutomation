.class Lcom/ibotta/android/async/notification/NotificationCountManager$1;
.super Landroid/os/AsyncTask;
.source "NotificationCountManager.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/async/notification/NotificationCountManager;->doNotificationsClear()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
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

.field final synthetic this$0:Lcom/ibotta/android/async/notification/NotificationCountManager;


# direct methods
.method constructor <init>(Lcom/ibotta/android/async/notification/NotificationCountManager;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->this$0:Lcom/ibotta/android/async/notification/NotificationCountManager;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "NotificationCountManager$1#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "NotificationCountManager$1#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    .line 52
    new-instance p1, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;

    invoke-direct {p1}, Lcom/ibotta/android/notification/call/NotificationsSetReadPutCall;-><init>()V

    .line 54
    :try_start_0
    invoke-interface {p1}, Lcom/ibotta/api/ApiCall;->execute()Lcom/ibotta/api/ApiResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to make call to clear new notifications."

    const/4 v1, 0x0

    .line 56
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1, v0, v1}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "NotificationCountManager$1#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "NotificationCountManager$1#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->onPostExecute(Ljava/lang/Void;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 1

    .line 64
    iget-object p1, p0, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->this$0:Lcom/ibotta/android/async/notification/NotificationCountManager;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/ibotta/android/async/notification/NotificationCountManager;->access$102(Lcom/ibotta/android/async/notification/NotificationCountManager;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;

    .line 66
    iget-object p1, p0, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->this$0:Lcom/ibotta/android/async/notification/NotificationCountManager;

    invoke-static {p1}, Lcom/ibotta/android/async/notification/NotificationCountManager;->access$200(Lcom/ibotta/android/async/notification/NotificationCountManager;)Lcom/ibotta/android/service/api/job/CacheClearJobFactory;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearJobFactory;->create()Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clearCustomer(Z)Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/service/api/job/CacheClearBatchApiJob;->clear()V

    return-void
.end method

.method protected onPreExecute()V
    .locals 2

    .line 46
    invoke-super {p0}, Landroid/os/AsyncTask;->onPreExecute()V

    .line 47
    iget-object v0, p0, Lcom/ibotta/android/async/notification/NotificationCountManager$1;->this$0:Lcom/ibotta/android/async/notification/NotificationCountManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/async/notification/NotificationCountManager;->access$000(Lcom/ibotta/android/async/notification/NotificationCountManager;I)V

    return-void
.end method
