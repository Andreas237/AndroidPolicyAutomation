.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;
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

    .line 895
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 898
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose open BT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 900
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 901
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fdb\u5165onclickReconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 903
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$902(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;I)I

    .line 904
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v1, v1, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->val$view:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v2, v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->val$deviceInfoForWear:Lo/ahh;

    invoke-static {v0, v1, v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->access$1100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$ViewHolder;Lo/ahh;)V

    .line 905
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fdb\u5165initList(kind);"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 908
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 909
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceListAdapter initReconnect onClick deviceList.size"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v2, v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v2, v2, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 910
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)V

    .line 911
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->access$1300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$DeviceListAdapter;->notifyDataSetChanged()V

    .line 912
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fdb\u5165  \u5237\u65b0over."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 916
    :cond_0
    goto :goto_0

    .line 914
    :catch_0
    move-exception v4

    .line 915
    const-string v0, "DeviceBindingFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "user choose open BT error :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/RuntimeException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 917
    :goto_0
    return-void
.end method
