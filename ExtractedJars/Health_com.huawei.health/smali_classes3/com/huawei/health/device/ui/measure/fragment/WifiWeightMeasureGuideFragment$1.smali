.class Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)V
    .locals 0

    .line 125
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-static {v0}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->access$600(Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 129
    return-void
.end method
