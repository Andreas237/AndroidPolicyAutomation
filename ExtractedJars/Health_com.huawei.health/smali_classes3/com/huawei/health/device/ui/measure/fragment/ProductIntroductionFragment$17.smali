.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egz$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showChooseTimerDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)V
    .locals 0

    .line 1074
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/app/Dialog;IILjava/lang/String;)V
    .locals 5

    .line 1077
    if-eqz p4, :cond_0

    .line 1078
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v2}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v2

    invoke-virtual {p4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$3000(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2902(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;I)I

    .line 1080
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/device/ui/DeviceMainActivity;

    .line 1081
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2900(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/device/ui/DeviceMainActivity;->c(I)V

    .line 1082
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$17;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$800(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$3100(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/lang/String;)V

    .line 1083
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 1084
    return-void
.end method
