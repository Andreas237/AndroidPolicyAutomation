.class Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;
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

    .line 111
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->val$operationGuidePrompt:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->val$operationGuideImg:Landroid/widget/ImageView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 114
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$010(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I

    .line 115
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I

    move-result v0

    const/4 v1, 0x0

    if-le v1, v0, :cond_0

    .line 116
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->onBackPressed()V

    goto :goto_0

    .line 119
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Lo/afj;

    move-result-object v0

    iget-object v0, v0, Lo/afj;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I

    move-result v1

    if-le v0, v1, :cond_1

    .line 120
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->val$operationGuidePrompt:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v1}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Lo/afj;

    move-result-object v2

    iget-object v2, v2, Lo/afj;->p:Ljava/util/ArrayList;

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$000(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/afj$b;

    iget-object v2, v2, Lo/afj$b;->d:Ljava/lang/String;

    invoke-static {v1, v2}, Lo/afo;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->val$operationGuideImg:Landroid/widget/ImageView;

    invoke-static {}, Lo/ahj;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lo/afe;->b(Landroid/content/Context;)Lo/afe;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v2}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$200(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

    invoke-static {v3}, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;->access$100(Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;)Lo/afj;

    move-result-object v3

    iget-object v3, v3, Lo/afj;->p:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment$2;->this$0:Lcom/huawei/health/device/ui/measure/fragment/DeviceBindGuidFragment;

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

    .line 124
    :cond_1
    :goto_0
    return-void
.end method
