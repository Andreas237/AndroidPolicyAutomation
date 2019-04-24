.class public abstract Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;
.super Ljava/lang/Object;
.source "AbstractUrlResolver.java"

# interfaces
.implements Lcom/ibotta/android/routing/urlresolver/UrlResolver;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;
    }
.end annotation


# static fields
.field public static final HEADER_LOCATION:Ljava/lang/String; = "Location"


# instance fields
.field protected resolverTask:Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected createAsyncTask(Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;
    .locals 1

    .line 33
    new-instance v0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;

    invoke-direct {v0, p0}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;-><init>(Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;)V

    .line 34
    invoke-virtual {v0, p1}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->setListener(Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V

    return-object v0
.end method

.method protected fetchResolvedUrl(Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V
    .locals 2

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;->resolverTask:Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->cancel(Z)Z

    .line 28
    :cond_0
    invoke-virtual {p0, p2}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;->createAsyncTask(Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;->resolverTask:Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;

    .line 29
    iget-object p2, p0, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver;->resolverTask:Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;

    new-array v0, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    instance-of p1, p2, Landroid/os/AsyncTask;

    if-nez p1, :cond_1

    invoke-virtual {p2, v0}, Lcom/ibotta/android/routing/urlresolver/AbstractUrlResolver$UrlResolverAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_1
    check-cast p2, Landroid/os/AsyncTask;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void
.end method

.method protected abstract onUrlResolved(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/routing/urlresolver/UrlResolverListener;)V
.end method
