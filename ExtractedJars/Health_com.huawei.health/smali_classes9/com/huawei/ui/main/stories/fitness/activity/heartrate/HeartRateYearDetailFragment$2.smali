.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 46
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 47
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 49
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_BAR_CHART_DATA_UI 3......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)V

    .line 51
    goto :goto_0

    .line 53
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_TOTAL_DATA_UI 3......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$2;->a:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->g()Lo/ext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e(Lo/ext;)V

    .line 55
    .line 59
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xbbb -> :sswitch_0
        0xbbc -> :sswitch_1
    .end sparse-switch
.end method
