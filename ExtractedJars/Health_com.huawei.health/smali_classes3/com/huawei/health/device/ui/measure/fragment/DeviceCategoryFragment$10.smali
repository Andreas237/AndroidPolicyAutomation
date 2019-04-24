.class Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->downloadOneZipFile(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

.field final synthetic val$index:I

.field final synthetic val$pluginInfo:Lo/ear;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/ear;I)V
    .locals 0

    .line 692
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->val$pluginInfo:Lo/ear;

    iput p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->val$index:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 6

    .line 694
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneZipFile result status = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Lo/eba;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",and uuid = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/eay;->g()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 695
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 696
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneZipFile one zip succeed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 697
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {}, Lo/afq;->e()Lo/afq;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->val$pluginInfo:Lo/ear;

    invoke-virtual {v2}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lo/afq;->e(Ljava/lang/String;)Lo/afj;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1900(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/afj;)V

    .line 699
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2000(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->val$pluginInfo:Lo/ear;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 701
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2100(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)J

    move-result-wide v1

    invoke-virtual {p2}, Lo/eba;->d()I

    move-result v3

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2102(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;J)J

    .line 702
    iget v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->val$index:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2200(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 703
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->val$index:I

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$2300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;I)V

    goto :goto_0

    .line 705
    :cond_0
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneZipFile all zip succeed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 706
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 707
    const/16 v0, 0x64

    iput v0, v5, Landroid/os/Message;->what:I

    .line 708
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 709
    return-void

    .line 711
    :cond_1
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 712
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 713
    const/16 v0, 0x67

    iput v0, v5, Landroid/os/Message;->what:I

    .line 714
    invoke-virtual {p2}, Lo/eba;->b()I

    move-result v0

    iput v0, v5, Landroid/os/Message;->arg1:I

    .line 715
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 716
    goto :goto_0

    .line 718
    :cond_2
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadOneZipFile failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 719
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v5

    .line 720
    const/16 v0, 0x65

    iput v0, v5, Landroid/os/Message;->what:I

    .line 721
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$10;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 723
    :goto_0
    return-void
.end method
