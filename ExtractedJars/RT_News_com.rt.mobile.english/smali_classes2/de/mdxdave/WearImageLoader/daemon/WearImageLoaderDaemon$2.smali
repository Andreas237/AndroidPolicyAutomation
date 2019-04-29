.class Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;
.super Ljava/lang/Object;
.source "WearImageLoaderDaemon.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->sentBitmap(Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

.field final synthetic val$asset:Lcom/google/android/gms/wearable/Asset;

.field final synthetic val$path:Ljava/lang/String;

.field final synthetic val$url:Ljava/lang/String;


# direct methods
.method constructor <init>(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    iput-object p2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$url:Ljava/lang/String;

    iput-object p3, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$path:Ljava/lang/String;

    iput-object p4, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$asset:Lcom/google/android/gms/wearable/Asset;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .line 135
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    iget-object v1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$url:Ljava/lang/String;

    iget-object v2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$path:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$200(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 137
    invoke-static {v0}, Lcom/google/android/gms/wearable/PutDataMapRequest;->create(Ljava/lang/String;)Lcom/google/android/gms/wearable/PutDataMapRequest;

    move-result-object v1

    .line 139
    invoke-virtual {v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v2

    const-string v3, "timestamp"

    new-instance v4, Ljava/util/Date;

    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    invoke-virtual {v4}, Ljava/util/Date;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/wearable/DataMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 141
    invoke-virtual {v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;->getDataMap()Lcom/google/android/gms/wearable/DataMap;

    move-result-object v2

    const-string v3, "image"

    iget-object v4, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$asset:Lcom/google/android/gms/wearable/Asset;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/wearable/DataMap;->putAsset(Ljava/lang/String;Lcom/google/android/gms/wearable/Asset;)V

    .line 143
    iget-object v2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-static {v2}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$300(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-static {v2}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$300(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/common/api/GoogleApiClient;->isConnected()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 144
    sget-object v2, Lcom/google/android/gms/wearable/Wearable;->DataApi:Lcom/google/android/gms/wearable/DataApi;

    iget-object v3, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-static {v3}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$300(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lcom/google/android/gms/common/api/GoogleApiClient;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/wearable/PutDataMapRequest;->asPutDataRequest()Lcom/google/android/gms/wearable/PutDataRequest;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Lcom/google/android/gms/wearable/DataApi;->putDataItem(Lcom/google/android/gms/common/api/GoogleApiClient;Lcom/google/android/gms/wearable/PutDataRequest;)Lcom/google/android/gms/common/api/PendingResult;

    move-result-object v1

    new-instance v2, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;

    invoke-direct {v2, p0, v0}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;-><init>(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/PendingResult;->setResultCallback(Lcom/google/android/gms/common/api/ResultCallback;)V

    goto :goto_0

    .line 166
    :cond_0
    invoke-static {}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$000()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ApiClient null of not connected"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-static {v0}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$400(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 169
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-static {v0}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$400(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    move-result-object v0

    iget-object v1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$url:Ljava/lang/String;

    iget-object v2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$path:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;->onBitmapError(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
