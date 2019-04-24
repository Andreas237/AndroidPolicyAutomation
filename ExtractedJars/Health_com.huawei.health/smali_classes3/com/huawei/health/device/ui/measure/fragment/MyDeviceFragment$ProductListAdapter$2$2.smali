.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;
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

    .line 962
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 965
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "user choose open BT"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 967
    :try_start_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->enable()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 969
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2102(I)I

    .line 970
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fdb\u5165onclickReconnect"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 971
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v1, v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$deviceInfoForWear:Lo/ahh;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v2, v2, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$reconnectlayout:Lo/egd;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v3, v3, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->val$loadinglayout:Landroid/widget/LinearLayout;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->access$2300(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;Lo/ahh;Lo/egd;Landroid/widget/LinearLayout;)V

    .line 972
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fdb\u5165initList(kind);"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 973
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v1, v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v1, v1, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lo/acl$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/acl$a;)V

    .line 974
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2$2;->this$2:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 975
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fdb\u5165  \u5237\u65b0over."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 979
    :cond_0
    goto :goto_0

    .line 977
    :catch_0
    move-exception v4

    .line 978
    const-string v0, "MyDeviceFragment"

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

    .line 980
    :goto_0
    return-void
.end method
