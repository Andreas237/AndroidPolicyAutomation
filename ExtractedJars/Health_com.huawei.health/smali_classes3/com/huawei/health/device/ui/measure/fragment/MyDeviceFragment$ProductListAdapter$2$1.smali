.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;)V
    .locals 0

    .line 982
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$1;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 985
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$1;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2200(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/egy;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 986
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$1;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2200(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->dismiss()V

    .line 987
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$1;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2202(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/egy;)Lo/egy;

    .line 989
    :cond_0
    return-void
.end method
