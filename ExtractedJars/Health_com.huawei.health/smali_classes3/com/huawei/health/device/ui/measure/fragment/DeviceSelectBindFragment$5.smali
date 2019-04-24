.class Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)V
    .locals 0

    .line 483
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 486
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;)Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;

    move-result-object v1

    invoke-static {v0, p3, v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;->access$1000(Lcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment;ILcom/huawei/health/device/ui/measure/fragment/DeviceSelectBindFragment$ProductListAdapter;)V

    .line 487
    return-void
.end method
