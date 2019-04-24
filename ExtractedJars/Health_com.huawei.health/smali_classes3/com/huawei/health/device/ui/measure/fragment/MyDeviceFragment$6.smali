.class Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$6;
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


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;)V
    .locals 0

    .line 542
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 545
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 546
    const/4 v0, 0x1

    iput v0, v1, Landroid/os/Message;->what:I

    .line 547
    const-string v0, "cancelEnableBluetooth"

    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 548
    const-string v0, "MyDeviceFragment"

    invoke-static {v0, v1}, Lo/ahj;->d(Ljava/lang/String;Landroid/os/Message;)V

    .line 549
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment$6;->this$0:Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/MyDeviceFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 550
    return-void
.end method
