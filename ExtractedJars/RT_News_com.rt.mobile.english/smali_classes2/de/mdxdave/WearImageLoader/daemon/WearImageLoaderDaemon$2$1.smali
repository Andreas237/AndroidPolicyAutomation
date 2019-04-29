.class Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;
.super Ljava/lang/Object;
.source "WearImageLoaderDaemon.java"

# interfaces
.implements Lcom/google/android/gms/common/api/ResultCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/common/api/ResultCallback<",
        "Lcom/google/android/gms/wearable/DataApi$DataItemResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

.field final synthetic val$finalPath:Ljava/lang/String;


# direct methods
.method constructor <init>(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;Ljava/lang/String;)V
    .locals 0

    .line 144
    iput-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    iput-object p2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->val$finalPath:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onResult(Lcom/google/android/gms/common/api/Result;)V
    .locals 0

    .line 144
    check-cast p1, Lcom/google/android/gms/wearable/DataApi$DataItemResult;

    invoke-virtual {p0, p1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->onResult(Lcom/google/android/gms/wearable/DataApi$DataItemResult;)V

    return-void
.end method

.method public onResult(Lcom/google/android/gms/wearable/DataApi$DataItemResult;)V
    .locals 3

    .line 148
    invoke-interface {p1}, Lcom/google/android/gms/wearable/DataApi$DataItemResult;->getStatus()Lcom/google/android/gms/common/api/Status;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/common/api/Status;->isSuccess()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 151
    invoke-static {}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    iget-object v2, v2, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$url:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " send"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 153
    :cond_0
    invoke-static {}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$000()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    iget-object v2, v2, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$url:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " send error"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 156
    :goto_0
    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    iget-object v0, v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-static {v0}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$400(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    .line 158
    iget-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    iget-object p1, p1, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-static {p1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$400(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    move-result-object p1

    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    iget-object v0, v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$url:Ljava/lang/String;

    iget-object v1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->val$finalPath:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;->onBitmapSent(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 160
    :cond_1
    iget-object p1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    iget-object p1, p1, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->this$0:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;

    invoke-static {p1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;->access$400(Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon;)Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;

    move-result-object p1

    iget-object v0, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->this$1:Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;

    iget-object v0, v0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2;->val$url:Ljava/lang/String;

    iget-object v1, p0, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$2$1;->val$finalPath:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lde/mdxdave/WearImageLoader/daemon/WearImageLoaderDaemon$CallBack;->onBitmapError(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    return-void
.end method
