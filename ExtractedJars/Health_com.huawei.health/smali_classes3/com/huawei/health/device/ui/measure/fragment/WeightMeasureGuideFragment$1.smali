.class Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 101
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 102
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 104
    :sswitch_0
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "WeightMeasureGuideFragment receive msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    iget-object v0, p0, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment$1;->this$0:Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;

    invoke-virtual {v0}, Lcom/huawei/health/device/ui/measure/fragment/WeightMeasureGuideFragment;->startMeasure()V

    .line 106
    .line 110
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
