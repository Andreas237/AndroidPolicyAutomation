.class Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 225
    const-string v0, "WifiDevicePressureCalibrateResultGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "button click retry"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity$3;->c:Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity;->h(Lcom/huawei/ui/main/stories/fitness/activity/pressurecalibrate/activity/WifiDevicePressureCalibrateResultGuideActivity;)V

    .line 227
    return-void
.end method
