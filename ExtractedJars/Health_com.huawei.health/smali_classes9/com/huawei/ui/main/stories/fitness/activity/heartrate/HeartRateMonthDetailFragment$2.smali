.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 47
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 48
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 50
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_BAR_CHART_DATA_UI 1......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)V

    .line 52
    goto :goto_0

    .line 54
    :sswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_TOTAL_DATA_UI 1......"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$2;->c:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->f()Lo/ext;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->e(Lo/ext;)V

    .line 56
    .line 60
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xbbb -> :sswitch_0
        0xbbc -> :sswitch_1
    .end sparse-switch
.end method
