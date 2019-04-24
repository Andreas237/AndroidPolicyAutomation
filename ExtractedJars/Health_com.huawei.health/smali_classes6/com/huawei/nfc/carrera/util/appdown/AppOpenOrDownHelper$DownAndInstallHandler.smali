.class Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "DownAndInstallHandler"
.end annotation


# instance fields
.field private mWeakHelper:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;)V
    .locals 1

    .line 299
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 300
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;->mWeakHelper:Ljava/lang/ref/WeakReference;

    .line 301
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 306
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 307
    iget-object v0, p0, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper$DownAndInstallHandler;->mWeakHelper:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;

    .line 308
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 310
    const-string v0, "AppOpenOrDownHelper handler activity is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/nfc/carrera/util/LogX;->w(Ljava/lang/String;Z)V

    .line 311
    return-void

    .line 313
    :cond_0
    invoke-static {v2, p1}, Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;->access$1000(Lcom/huawei/nfc/carrera/util/appdown/AppOpenOrDownHelper;Landroid/os/Message;)V

    .line 314
    return-void
.end method
