.class public final Lcom/microblink/internal/services/io/BitmapServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/io/BitmapService;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "BitmapServiceImpl"


# instance fields
.field private EMPTY:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private bitmapAsyncTask:Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;

.field private call:Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/Call<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->EMPTY:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 2

    iget-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->bitmapAsyncTask:Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->bitmapAsyncTask:Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;

    :cond_0
    iget-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->call:Lretrofit2/Call;

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel(Lretrofit2/Call;)V

    return-void
.end method

.method public final enqueue(Ljava/util/Collection;Lcom/microblink/OnNullableCompleteListener;)V
    .locals 3
    .param p1    # Ljava/util/Collection;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;)V"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/internal/services/io/BitmapServiceImpl;->cancel()V

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_1

    new-instance v0, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;

    const/16 v1, 0xa

    new-instance v2, Lcom/microblink/internal/services/io/BitmapServiceImpl$1;

    invoke-direct {v2, p0, p2}, Lcom/microblink/internal/services/io/BitmapServiceImpl$1;-><init>(Lcom/microblink/internal/services/io/BitmapServiceImpl;Lcom/microblink/OnNullableCompleteListener;)V

    invoke-direct {v0, v1, v2}, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;-><init>(ILcom/microblink/OnNullableCompleteListener;)V

    iput-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->bitmapAsyncTask:Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;

    iget-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->bitmapAsyncTask:Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/String;

    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    instance-of v1, v0, Landroid/os/AsyncTask;

    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Lcom/microblink/internal/services/io/BitmapServiceImpl$BitmapAsyncTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/os/AsyncTask;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/instrumentation/AsyncTaskInstrumentation;->execute(Landroid/os/AsyncTask;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    :goto_0
    return-void

    :cond_1
    iget-object p1, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->EMPTY:Ljava/util/List;

    invoke-interface {p2, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "BitmapServiceImpl"

    const-string v1, "bitmap service enqueue exception!!!"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, p1, v1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/microblink/OnNullableCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final execute(Ljava/util/Collection;)Ljava/util/List;
    .locals 5
    .param p1    # Ljava/util/Collection;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/internal/services/io/BitmapServiceImpl;->cancel()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-class v3, Lcom/microblink/internal/services/io/DownloadService;

    invoke-static {v3}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/services/io/DownloadService;

    invoke-interface {v3, v2}, Lcom/microblink/internal/services/io/DownloadService;->download(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v2

    iput-object v2, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->call:Lretrofit2/Call;

    iget-object v2, p0, Lcom/microblink/internal/services/io/BitmapServiceImpl;->call:Lretrofit2/Call;

    invoke-interface {v2}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v2

    invoke-virtual {v2}, Lretrofit2/Response;->isSuccessful()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lokhttp3/ResponseBody;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v2}, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const-string v3, "BitmapServiceImpl"

    invoke-virtual {v2}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object v2

    invoke-static {v2}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object v2

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v3, v2, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_2
    return-object v1

    :catch_0
    move-exception p1

    const-string v1, "BitmapServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, p1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method
