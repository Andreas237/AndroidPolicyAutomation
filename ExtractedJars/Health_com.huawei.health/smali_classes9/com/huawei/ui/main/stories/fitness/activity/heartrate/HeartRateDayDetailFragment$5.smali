.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V
    .locals 0

    .line 165
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 168
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 169
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 171
    :pswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_BAR_CHART_DATA_UI  DAY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    .line 173
    goto :goto_0

    .line 175
    :pswitch_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UPDATE_TOTAL_DATA_UI  DAY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V

    .line 177
    goto :goto_0

    .line 179
    :pswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SHOE_PROVICY_DIALOG"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;->e:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a:Landroid/content/Context;

    new-instance v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5$4;-><init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$5;)V

    invoke-static {v0, v1}, Lo/fjb;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 186
    .line 190
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xbbb
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
