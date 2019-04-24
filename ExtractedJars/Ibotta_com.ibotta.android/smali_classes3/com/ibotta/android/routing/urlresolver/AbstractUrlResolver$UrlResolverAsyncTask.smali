.class public Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;
.super Landroid/os/AsyncTask;
.source "AbstractUrlResolver.java"

# interfaces
.implements Lcom/newrelic/agent/android/api/v2/TraceFieldInterface;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "UrlResolverAsyncTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/String;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public _nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

.field protected listener:Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;

.field protected originalUrl:Ljava/lang/String;

.field final synthetic this$0:Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;


# direct methods
.method protected constructor <init>(Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;)V
    .locals 0

    .line 38
    iput-object p1, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->this$0:Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method public _nr_setTrace(Lcom/newrelic/agent/android/tracing/Trace;)V
    .locals 0

    :try_start_0
    iput-object p1, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "AbstractUrlResolver$UrlResolverAsyncTask#doInBackground"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "AbstractUrlResolver$UrlResolverAsyncTask#doInBackground"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :goto_0
    check-cast p1, [Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->doInBackground([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    invoke-static {p0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->unloadTraceContext(Ljava/lang/Object;)V

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 51
    :try_start_0
    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->originalUrl:Ljava/lang/String;

    .line 52
    invoke-virtual {p0}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->executeHttpCall()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "Failed to resolve URL: %1$s"

    const/4 v2, 0x1

    .line 54
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->originalUrl:Ljava/lang/String;

    aput-object v3, v2, v0

    invoke-static {p1, v1, v2}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method protected executeHttpCall()Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 61
    invoke-virtual {p0}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->getHttpUrlConnection()Ljava/net/HttpURLConnection;

    move-result-object v0

    const/4 v1, 0x0

    .line 62
    invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V

    .line 64
    new-instance v1, Ljava/net/URL;

    const-string v2, "Location"

    invoke-virtual {v0, v2}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URL;->toExternalForm()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method protected getHttpUrlConnection()Ljava/net/HttpURLConnection;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 68
    new-instance v0, Ljava/net/URL;

    iget-object v1, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->originalUrl:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/instrumentation/URLConnectionInstrumentation;->openConnection(Ljava/net/URLConnection;)Ljava/net/URLConnection;

    move-result-object v0

    check-cast v0, Ljava/net/HttpURLConnection;

    return-object v0
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->_nr_trace:Lcom/newrelic/agent/android/tracing/Trace;

    const-string v2, "AbstractUrlResolver$UrlResolverAsyncTask#onPostExecute"

    invoke-static {v1, v2, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V

    goto :goto_0

    :catch_0
    const-string v1, "AbstractUrlResolver$UrlResolverAsyncTask#onPostExecute"

    invoke-static {v0, v1, v0}, Lcom/newrelic/agent/android/tracing/TraceMachine;->enterMethod(Lcom/newrelic/agent/android/tracing/Trace;Ljava/lang/String;Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    :goto_0
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->onPostExecute(Ljava/lang/String;)V

    invoke-static {}, Lcom/newrelic/agent/android/tracing/TraceMachine;->exitMethod()V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 3

    .line 73
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 75
    iget-object v0, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->this$0:Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;

    iget-object v1, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->originalUrl:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->listener:Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;

    invoke-virtual {v0, p1, v1, v2}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;->onUrlResolved(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V

    return-void
.end method

.method public setListener(Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->listener:Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;

    return-void
.end method
