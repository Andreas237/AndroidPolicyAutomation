.class Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwdevicedfxmanager/callback/IDeviceDFXBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/home/WearHomeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V
    .locals 0

    .line 6472
    iput-object p1, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/String;)V
    .locals 4

    .line 6517
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get device log failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6519
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6520
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6521
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$4;

    invoke-direct {v1, p0, p1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$4;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6530
    return-void
.end method

.method public onProgress(ILjava/lang/String;)V
    .locals 2

    .line 6533
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 6534
    const/16 v0, 0x402

    iput v0, v1, Landroid/os/Message;->what:I

    .line 6535
    iput p1, v1, Landroid/os/Message;->arg1:I

    .line 6536
    iput-object p2, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 6537
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 6538
    return-void
.end method

.method public onSuccess(ILjava/lang/String;)V
    .locals 4

    .line 6475
    const/4 v0, 0x2

    if-ne v0, p1, :cond_0

    .line 6476
    const-string v0, "WearHomeActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6b63\u5728\u8fdb\u884clog\u91c7\u96c6"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6477
    return-void

    .line 6479
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->Q(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)V

    .line 6480
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->a(Lcom/huawei/ui/homewear21/home/WearHomeActivity;Z)Z

    .line 6481
    iget-object v0, p0, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;->a:Lcom/huawei/ui/homewear21/home/WearHomeActivity;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity;->u(Lcom/huawei/ui/homewear21/home/WearHomeActivity;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/home/WearHomeActivity$75$2;-><init>(Lcom/huawei/ui/homewear21/home/WearHomeActivity$75;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 6513
    return-void
.end method
