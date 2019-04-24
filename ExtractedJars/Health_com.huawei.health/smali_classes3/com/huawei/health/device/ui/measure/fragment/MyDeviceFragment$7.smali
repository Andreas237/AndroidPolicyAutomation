.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->entryTypeEqualsList(ILo/afj;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

.field final synthetic val$position:I

.field final synthetic val$productInfo:Lo/afj;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/afj;I)V
    .locals 0

    .line 647
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->val$productInfo:Lo/afj;

    iput p3, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 650
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->val$productInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 651
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->val$productInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 652
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Ljava/util/ArrayList;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->val$position:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 653
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$ProductListAdapter;->notifyDataSetChanged()V

    .line 654
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$7;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$1700(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V

    .line 656
    :cond_0
    return-void
.end method
