.class Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1$2;->this$1:Lcom/huawei/health/device/ui/measure/fragment/HeartRateDeviceRunGuide$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 81
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not to enable bluetooth"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    return-void
.end method
