.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)V
    .locals 0

    .line 408
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 6

    .line 411
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->h(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)Lo/fah;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/fah;->c(II)Ljava/lang/String;

    move-result-object v4

    .line 412
    new-instance v5, Ljava/util/Date;

    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-direct {v5, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 413
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->i(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 414
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0, v5}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;Ljava/util/Date;)Ljava/util/Date;

    .line 415
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0, p1}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;I)I

    .line 416
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0, p2}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;I)I

    .line 417
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1779

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 418
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment$7;->c:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;->k(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CoreSleepYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x1779

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 419
    return-void
.end method
