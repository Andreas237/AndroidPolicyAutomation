.class Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eaz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->buildNeedUpdateDownLoadDeviceList(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

.field final synthetic val$ezPluginIndexInfo:Lo/ear;

.field final synthetic val$lastDeviceUUID:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;Lo/ear;Ljava/lang/String;)V
    .locals 0

    .line 592
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;->val$ezPluginIndexInfo:Lo/ear;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;->val$lastDeviceUUID:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPullingChange(Lo/eay;Lo/eba;)V
    .locals 4

    .line 594
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildNeedUpdateDownLoadDeviceList result status = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Lo/eba;->c:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 595
    iget v0, p2, Lo/eba;->c:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 596
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildNeedUpdateDownLoadDeviceList is already new"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 597
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1600(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;->val$ezPluginIndexInfo:Lo/ear;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 599
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;->val$lastDeviceUUID:Ljava/lang/String;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;->val$ezPluginIndexInfo:Lo/ear;

    invoke-virtual {v1}, Lo/ear;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 600
    const-string v0, "PluginDevice_DeviceCategoryFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "buildNeedUpdateDownLoadDeviceList finish downloading last device"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment$8;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/DeviceCategoryFragment;)V

    .line 603
    :cond_1
    return-void
.end method
