.class Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)V
    .locals 1

    .line 459
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 460
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$d;->e:Ljava/lang/ref/WeakReference;

    .line 461
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 464
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment$d;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;

    .line 465
    if-eqz v4, :cond_1

    .line 466
    const/4 v0, 0x0

    iput-boolean v0, v4, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    .line 467
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestDatas onResponse err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mLoadingState = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, v4, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->v:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 469
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->a(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestDatas sucess!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 471
    :cond_0
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xbbb

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 472
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xbbc

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 473
    invoke-static {v4}, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;->b(Lcom/huawei/ui/main/stories/fitness/activity/heartrate/HeartRateDayDetailFragment;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xbbd

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 475
    :cond_1
    return-void
.end method
