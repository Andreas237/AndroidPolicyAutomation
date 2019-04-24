.class Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;)V
    .locals 1

    .line 226
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 227
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$d;->c:Ljava/lang/ref/WeakReference;

    .line 228
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 9

    .line 232
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;

    .line 233
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 234
    const-string v0, "Track_Vo2maxMonthDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    return-void

    .line 237
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->J:Z

    .line 238
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 239
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 240
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->K:Ljava/util/HashMap;

    .line 241
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;

    .line 242
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->K:Ljava/util/HashMap;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getTimeStamp()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getVo2maxValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 243
    goto :goto_0

    .line 244
    :cond_1
    goto :goto_1

    .line 245
    :cond_2
    const/4 v0, 0x0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->K:Ljava/util/HashMap;

    .line 247
    :goto_1
    iget-object v5, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->e:Ljava/lang/Object;

    monitor-enter v5

    .line 248
    :try_start_0
    iget-boolean v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->b:Z

    if-eqz v0, :cond_3

    .line 249
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->O:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_2

    .line 251
    :cond_3
    const/4 v0, 0x1

    iput-boolean v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxMonthDetailFragment;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 253
    :goto_2
    monitor-exit v5

    goto :goto_3

    :catchall_0
    move-exception v8

    monitor-exit v5

    throw v8

    .line 254
    :goto_3
    return-void
.end method
