.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

.field final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;I)V
    .locals 0

    .line 804
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iput p2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$1;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 807
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$1;->this$1:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    iget-object v0, v0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$2000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter$1;->val$position:I

    invoke-interface {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$onItemReconnectListener;->onItemClick(I)V

    .line 808
    return-void
.end method
