.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)V
    .locals 0

    .line 222
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 225
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->v:Z

    .line 226
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestDatas onResponse !!! err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 228
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestDatas onResponse sucess!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xbbb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 233
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment$4;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateMonthDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xbbc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 235
    :cond_1
    return-void
.end method
