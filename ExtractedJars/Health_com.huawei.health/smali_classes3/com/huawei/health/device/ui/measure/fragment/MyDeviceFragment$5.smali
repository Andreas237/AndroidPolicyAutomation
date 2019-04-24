.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->entryTypeEqualsPick(Lo/afj;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

.field final synthetic val$productInfo:Lo/afj;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/afj;)V
    .locals 0

    .line 535
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$5;->val$productInfo:Lo/afj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 538
    const-string v0, "MyDeviceFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyDeviceFragment sendMessage with bluetooth off"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 539
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$5;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$5;->val$productInfo:Lo/afj;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->access$1600(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;Lo/afj;)V

    .line 540
    return-void
.end method
