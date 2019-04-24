.class Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->showMeasureTimeoutDialog(Landroid/content/Context;)V
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

    .line 287
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 290
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment$3;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;

    const-class v1, Lcom/huawei/health/device/ui/measure/fragment/WiFiProductIntroductionFragment;

    invoke-virtual {v0, v1}, Lcom/huawei/health/device/ui/measure/fragment/WifiWeightMeasureGuideFragment;->popupFragment(Ljava/lang/Class;)V

    .line 291
    return-void
.end method
