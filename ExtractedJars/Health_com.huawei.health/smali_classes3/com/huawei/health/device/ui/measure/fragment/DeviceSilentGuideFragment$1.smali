.class Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 108
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "measure"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 109
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v2

    .line 110
    if-eqz v2, :cond_0

    .line 111
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)V

    .line 113
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 114
    goto :goto_0

    .line 115
    :cond_1
    invoke-static {}, Lo/agc;->c()Lo/agc;

    move-result-object v0

    invoke-virtual {v0}, Lo/agc;->b()Z

    move-result v2

    .line 116
    if-eqz v2, :cond_2

    .line 117
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)V

    .line 119
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceSilentGuideFragment;)V

    .line 121
    :goto_0
    return-void
.end method
