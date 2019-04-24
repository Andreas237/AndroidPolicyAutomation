.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$BindIResourceFileListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aff;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "BindIResourceFileListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;


# direct methods
.method private constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V
    .locals 0

    .line 701
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$BindIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$1;)V
    .locals 0

    .line 701
    invoke-direct {p0, p1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$BindIResourceFileListener;-><init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/String;)V
    .locals 5

    .line 705
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MyDeviceFragment resultCode is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " resultValue is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 706
    const/16 v0, 0xc8

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$BindIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$1800(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 707
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v4

    .line 708
    const/4 v0, 0x0

    iput v0, v4, Landroid/os/Message;->what:I

    .line 709
    iput-object p2, v4, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 710
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$BindIResourceFileListener;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$1900(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 712
    :cond_0
    return-void
.end method
