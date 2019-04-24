.class Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;->onStatusChanged(Lo/acl;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

.field final synthetic val$d:Lo/acl;

.field final synthetic val$s:I


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;Lo/acl;I)V
    .locals 0

    .line 432
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$3;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$3;->val$d:Lo/acl;

    iput p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$3;->val$s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 435
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onStatusChanged 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 436
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$3;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 437
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceMeasureGuideFragment onStatusChanged 4"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 438
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$3;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$3;->val$d:Lo/acl;

    iget v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment$3$3;->val$s:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceMeasureGuideFragment;->handleStatusChangedInUiThread(Lo/acl;I)V

    .line 440
    :cond_0
    return-void
.end method
