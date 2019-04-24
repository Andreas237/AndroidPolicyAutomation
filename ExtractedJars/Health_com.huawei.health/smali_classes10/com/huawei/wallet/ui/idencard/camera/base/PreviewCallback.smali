.class public Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$PreviewCallback;


# instance fields
.field private a:Landroid/os/Handler;

.field private b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method e(Landroid/os/Handler;I)V
    .locals 0

    .line 30
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;->a:Landroid/os/Handler;

    .line 31
    iput p2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;->b:I

    .line 32
    return-void
.end method

.method public onPreviewFrame([BLandroid/hardware/Camera;)V
    .locals 3

    .line 38
    if-eqz p2, :cond_0

    .line 40
    invoke-virtual {p2, p1}, Landroid/hardware/Camera;->addCallbackBuffer([B)V

    .line 42
    :cond_0
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;->a:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 44
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;->a:Landroid/os/Handler;

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;->b:I

    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v2

    .line 45
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/PreviewCallback;->a:Landroid/os/Handler;

    .line 47
    goto :goto_0

    .line 50
    :cond_1
    const-string v0, "Got preview callback, but no handler for it"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 52
    :goto_0
    return-void
.end method
