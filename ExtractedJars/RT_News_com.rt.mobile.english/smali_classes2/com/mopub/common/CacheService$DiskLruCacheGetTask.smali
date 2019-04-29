.class Lcom/mopub/common/CacheService$DiskLruCacheGetTask;
.super Landroid/os/AsyncTask;
.source "CacheService.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/CacheService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DiskLruCacheGetTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "[B>;"
    }
.end annotation


# instance fields
.field private final mDiskLruCacheGetListener:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

.field private final mKey:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/mopub/common/CacheService$DiskLruCacheGetListener;)V
    .locals 0

    .line 196
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 197
    iput-object p2, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mDiskLruCacheGetListener:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    .line 198
    iput-object p1, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 192
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->doInBackground([Ljava/lang/Void;)[B

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)[B
    .locals 0

    .line 203
    iget-object p1, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mKey:Ljava/lang/String;

    invoke-static {p1}, Lcom/mopub/common/CacheService;->getFromDiskCache(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method protected onCancelled()V
    .locals 3

    .line 220
    iget-object v0, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mDiskLruCacheGetListener:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mDiskLruCacheGetListener:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    iget-object v1, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mKey:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/mopub/common/CacheService$DiskLruCacheGetListener;->onComplete(Ljava/lang/String;[B)V

    :cond_0
    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 192
    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->onPostExecute([B)V

    return-void
.end method

.method protected onPostExecute([B)V
    .locals 2

    .line 208
    invoke-virtual {p0}, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    invoke-virtual {p0}, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->onCancelled()V

    return-void

    .line 213
    :cond_0
    iget-object v0, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mDiskLruCacheGetListener:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    if-eqz v0, :cond_1

    .line 214
    iget-object v0, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mDiskLruCacheGetListener:Lcom/mopub/common/CacheService$DiskLruCacheGetListener;

    iget-object v1, p0, Lcom/mopub/common/CacheService$DiskLruCacheGetTask;->mKey:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/mopub/common/CacheService$DiskLruCacheGetListener;->onComplete(Ljava/lang/String;[B)V

    :cond_1
    return-void
.end method
