.class Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;
.super Landroid/os/AsyncTask;
.source "DeviceRegistrationAsyncImpl.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->createTask()Landroid/os/AsyncTask;
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

.field final synthetic this$0:Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;


# direct methods
.method constructor <init>(Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;->this$0:Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "DeviceRegistrationAsyncImpl$1#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "DeviceRegistrationAsyncImpl$1#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;->doInBackground([Ljava/lang/Void;)Ljava/lang/Void;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Void;
    .locals 2

    .line 47
    :try_start_0
    iget-object p1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;->this$0:Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;

    invoke-static {p1}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->access$000(Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;)Lcom/ibotta/android/async/device/DeviceRegistration;

    move-result-object p1

    invoke-interface {p1}, Lcom/ibotta/android/async/device/DeviceRegistration;->registerDevice()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "Failed to register device"

    const/4 v1, 0x0

    .line 49
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
    iget-object v1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "DeviceRegistrationAsyncImpl$1#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "DeviceRegistrationAsyncImpl$1#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    :goto_0
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;->onPostExecute(Ljava/lang/Void;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/Void;)V
    .locals 0

    .line 57
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 58
    iget-object p1, p0, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl$1;->this$0:Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;

    invoke-virtual {p1}, Lcom/ibotta/android/async/device/DeviceRegistrationAsyncImpl;->cleanUp()V

    return-void
.end method
