.class Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->showBluetoothUnBindDialog(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

.field final synthetic val$mapProductIntroductFragment:Ljava/util/Map;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/util/Map;)V
    .locals 0

    .line 892
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iput-object p2, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;->val$mapProductIntroductFragment:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 895
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/egv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 897
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2500(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 898
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2502(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Lo/egv;)Lo/egv;

    .line 899
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;->this$0:Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;

    iget-object v1, p0, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment$15;->val$mapProductIntroductFragment:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;->access$2400(Lcom/huawei/health/device/ui/measure/fragment/ProductIntroductionFragment;Ljava/util/Map;)V

    goto :goto_0

    .line 901
    :cond_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ProductIntroductionFragment showBluetoothUnBindDialog setPositiveButton mUnbindDialog = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 903
    :goto_0
    return-void
.end method
