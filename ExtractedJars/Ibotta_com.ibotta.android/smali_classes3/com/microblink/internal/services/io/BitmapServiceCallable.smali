.class public Lcom/microblink/internal/services/io/BitmapServiceCallable;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/Cancelable;",
        "Ljava/util/concurrent/Callable<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "BitmapServiceCallable"


# instance fields
.field private call:Lretrofit2/Call;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lretrofit2/Call<",
            "Lokhttp3/ResponseBody;",
            ">;"
        }
    .end annotation
.end field

.field private url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/io/BitmapServiceCallable;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public call()Landroid/graphics/Bitmap;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lcom/microblink/internal/services/io/BitmapServiceCallable;->cancel()V

    const-class v1, Lcom/microblink/internal/services/io/DownloadService;

    invoke-static {v1}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/io/DownloadService;

    iget-object v2, p0, Lcom/microblink/internal/services/io/BitmapServiceCallable;->url:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/microblink/internal/services/io/DownloadService;->download(Ljava/lang/String;)Lretrofit2/Call;

    move-result-object v1

    iput-object v1, p0, Lcom/microblink/internal/services/io/BitmapServiceCallable;->call:Lretrofit2/Call;

    iget-object v1, p0, Lcom/microblink/internal/services/io/BitmapServiceCallable;->call:Lretrofit2/Call;

    invoke-interface {v1}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v1

    invoke-virtual {v1}, Lretrofit2/Response;->isSuccessful()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lokhttp3/ResponseBody;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-static {v1}, Lcom/newrelic/agent/android/instrumentation/BitmapFactoryInstrumentation;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v2, "BitmapServiceCallable"

    invoke-virtual {v1}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-static {v1}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object v1

    new-array v3, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "BitmapServiceCallable"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v2, v1, v0}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p0}, Lcom/microblink/internal/services/io/BitmapServiceCallable;->call()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/io/BitmapServiceCallable;->call:Lretrofit2/Call;

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->cancel(Lretrofit2/Call;)V

    return-void
.end method
