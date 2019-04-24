.class Lcom/huawei/qrcode/DownActivity$LocalHandler;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/DownActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LocalHandler"
.end annotation


# instance fields
.field private mWeakActivity:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/qrcode/DownActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/qrcode/DownActivity;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/qrcode/DownActivity$LocalHandler;->mWeakActivity:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    iget-object v0, p0, Lcom/huawei/qrcode/DownActivity$LocalHandler;->mWeakActivity:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/qrcode/DownActivity;

    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    const-string v0, "DownActivity handler activity is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->w(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-static {v2, p1}, Lcom/huawei/qrcode/DownActivity;->access$000(Lcom/huawei/qrcode/DownActivity;Landroid/os/Message;)V

    return-void
.end method
