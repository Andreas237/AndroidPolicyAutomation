.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->onProductItemClick(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

.field final synthetic val$productInfo:Lo/afj;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;Lo/afj;)V
    .locals 0

    .line 420
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$2;->val$productInfo:Lo/afj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 423
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$2;->val$productInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->i(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 424
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$2;->val$productInfo:Lo/afj;

    invoke-virtual {v1}, Lo/afj;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->h(Ljava/lang/String;)V

    .line 425
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindingFragment;->init()V

    .line 427
    :cond_0
    return-void
.end method
