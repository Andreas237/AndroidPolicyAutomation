.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)V
    .locals 0

    .line 209
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 212
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    const/4 v1, 0x0

    iput-boolean v1, v0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->v:Z

    .line 213
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Ljava/lang/String;

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

    .line 214
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 215
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->e(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestDatas sucess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 219
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xbbb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 220
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment$1;->d:Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;->c(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateYearDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xbbc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 222
    :cond_1
    return-void
.end method
