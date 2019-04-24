.class Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;
.super Landroid/os/AsyncTask;
.source "SKDiskCache.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/fetchers/image/SKDiskCache;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "GetBytesFromCacheTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Void;",
        "[B>;"
    }
.end annotation


# instance fields
.field private callback:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/fetchers/image/ISKDiskCacheCallback;",
            ">;"
        }
    .end annotation
.end field

.field private key:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/fetchers/image/SKDiskCache;


# direct methods
.method public constructor <init>(Lcom/shopkick/fetchers/image/SKDiskCache;Ljava/lang/String;Lcom/shopkick/fetchers/image/ISKDiskCacheCallback;)V
    .locals 0

    .line 225
    iput-object p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->this$0:Lcom/shopkick/fetchers/image/SKDiskCache;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 226
    iput-object p2, p0, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->key:Ljava/lang/String;

    .line 227
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->callback:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 220
    invoke-virtual {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->doInBackground([Ljava/lang/Object;)[B

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Object;)[B
    .locals 1

    .line 233
    iget-object p1, p0, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->this$0:Lcom/shopkick/fetchers/image/SKDiskCache;

    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->key:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/fetchers/image/SKDiskCache;->getBytesFromCacheInternal(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 220
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->onPostExecute([B)V

    return-void
.end method

.method protected onPostExecute([B)V
    .locals 2

    .line 238
    iget-object v0, p0, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->callback:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/fetchers/image/ISKDiskCacheCallback;

    iget-object v1, p0, Lcom/shopkick/fetchers/image/SKDiskCache$GetBytesFromCacheTask;->key:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/shopkick/fetchers/image/ISKDiskCacheCallback;->onBytesReadFromDiskCache(Ljava/lang/String;[B)V

    return-void
.end method
