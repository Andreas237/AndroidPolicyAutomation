.class public Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# instance fields
.field private d:Landroid/os/Handler;

.field private e:I


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
    iput-object p1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->d:Landroid/os/Handler;

    .line 31
    iput p2, p0, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->e:I

    .line 32
    return-void
.end method

.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 4

    .line 37
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->d:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Got auto-focus result: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 40
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->d:Landroid/os/Handler;

    iget v1, p0, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->e:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v3

    .line 41
    iget-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->d:Landroid/os/Handler;

    invoke-virtual {v0, v3}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/ui/idencard/camera/base/AutoFocusCallback;->d:Landroid/os/Handler;

    .line 43
    goto :goto_0

    .line 46
    :cond_0
    const-string v0, "Got auto-focus callback, but no handler for it"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 48
    :goto_0
    return-void
.end method
