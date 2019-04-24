.class Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 55
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/BloodPressureMeasuringProgressFragment;->onBackPressed()Z

    .line 56
    return-void
.end method
