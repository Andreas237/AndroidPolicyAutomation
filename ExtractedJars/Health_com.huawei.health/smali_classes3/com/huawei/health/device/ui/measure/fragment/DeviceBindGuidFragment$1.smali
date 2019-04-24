.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

.field final synthetic val$operationGuideImg:Landroid/widget/ImageView;

.field final synthetic val$operationGuidePrompt:Landroid/widget/TextView;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;Landroid/widget/TextView;Landroid/widget/ImageView;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->val$operationGuidePrompt:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->val$operationGuideImg:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 85
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$008(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I

    .line 86
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Lo/afj;

    move-result-object v1

    iget-object v1, v1, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lt v0, v1, :cond_1

    .line 88
    const-string v0, "TAG"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mProductId:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-static {}, Lo/afd;->e()Lo/afd;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/afd;->g(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;-><init>()V

    .line 91
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 92
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningUniversalFragment;->setArguments(Landroid/os/Bundle;)V

    .line 94
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$300(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 95
    goto/16 :goto_0

    .line 96
    :cond_0
    new-instance v5, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;

    invoke-direct {v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceScanningFragment;-><init>()V

    .line 97
    new-instance v6, Landroid/os/Bundle;

    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 98
    const-string v0, "productId"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    const-string v0, "title"

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$400(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    invoke-virtual {v5, v6}, Lcom/huawei/health/device/ui/BaseFragment;->setArguments(Landroid/os/Bundle;)V

    .line 101
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v0, v5}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$500(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;Lcom/huawei/health/device/ui/BaseFragment;)V

    .line 102
    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->val$operationGuidePrompt:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Lo/afj;

    move-result-object v2

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    iget-object v2, v2, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->val$operationGuideImg:Landroid/widget/ImageView;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Lo/afj;

    move-result-object v3

    iget-object v3, v3, Lo/afj;->p:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v4}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/afj$b;

    iget-object v3, v3, Lo/afj$b;->c:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lo/afe;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/afo;->e(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 107
    :goto_0
    return-void
.end method
