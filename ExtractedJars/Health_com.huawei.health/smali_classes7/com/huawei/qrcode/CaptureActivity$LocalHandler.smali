.class Lcom/huawei/qrcode/CaptureActivity$LocalHandler;
.super Landroid/os/Handler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/qrcode/CaptureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "LocalHandler"
.end annotation


# instance fields
.field private weakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/qrcode/CaptureActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/qrcode/CaptureActivity;)V
    .locals 1

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$LocalHandler;->weakReference:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    iget-object v0, p0, Lcom/huawei/qrcode/CaptureActivity$LocalHandler;->weakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/qrcode/CaptureActivity;

    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    const-string v0, "CaptureActivity handleMessage captureActivity is null."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return-void

    :cond_0
    invoke-virtual {v2}, Lcom/huawei/qrcode/CaptureActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "CaptureActivity handleMessage captureActivity is finishing."

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/qrcode/util/LogX;->i(Ljava/lang/String;Z)V

    return-void

    :cond_1
    invoke-static {v2, p1}, Lcom/huawei/qrcode/CaptureActivity;->access$000(Lcom/huawei/qrcode/CaptureActivity;Landroid/os/Message;)V

    return-void
.end method
