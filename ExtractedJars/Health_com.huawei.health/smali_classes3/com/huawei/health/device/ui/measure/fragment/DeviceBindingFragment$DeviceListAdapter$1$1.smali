.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;)V
    .locals 0

    .line 919
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$1;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 922
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$1;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 923
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$1;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 924
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$1;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1002(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Lo/egy;)Lo/egy;

    .line 926
    :cond_0
    return-void
.end method
