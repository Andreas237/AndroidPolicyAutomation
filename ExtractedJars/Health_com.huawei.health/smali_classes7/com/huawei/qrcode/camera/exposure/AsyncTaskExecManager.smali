.class public final Lcom/huawei/qrcode/camera/exposure/AsyncTaskExecManager;
.super Lcom/huawei/qrcode/common/PlatformSupportManager;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/huawei/qrcode/common/PlatformSupportManager<Lcom/huawei/qrcode/camera/exposure/AsyncTaskExecInterface;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-class v0, Lcom/huawei/qrcode/camera/exposure/AsyncTaskExecInterface;

    new-instance v1, Lcom/huawei/qrcode/camera/exposure/DefaultAsyncTaskExecInterface;

    invoke-direct {v1}, Lcom/huawei/qrcode/camera/exposure/DefaultAsyncTaskExecInterface;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/huawei/qrcode/common/PlatformSupportManager;-><init>(Ljava/lang/Class;Ljava/lang/Object;)V

    const-class v0, Lcom/huawei/qrcode/camera/exposure/HoneycombAsyncTaskExecInterface;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    invoke-virtual {p0, v1, v0}, Lcom/huawei/qrcode/camera/exposure/AsyncTaskExecManager;->addImplementationClass(ILjava/lang/String;)V

    return-void
.end method
