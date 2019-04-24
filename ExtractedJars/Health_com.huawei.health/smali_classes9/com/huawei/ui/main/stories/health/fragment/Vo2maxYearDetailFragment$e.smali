.class Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;)V
    .locals 1

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 261
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$e;->e:Ljava/lang/ref/WeakReference;

    .line 262
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 11

    .line 266
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;

    .line 267
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 268
    const-string v0, "Track_Vo2maxYearDetailFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fragment is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 269
    return-void

    .line 271
    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->J:Z

    .line 272
    const/4 v0, 0x0

    if-ne v0, p1, :cond_4

    .line 273
    move-object v5, p2

    check-cast v5, Ljava/util/List;

    .line 274
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    .line 275
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;

    .line 276
    new-instance v0, Ljava/util/Date;

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getTimeStamp()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->g(Ljava/util/Date;)Ljava/util/Date;

    move-result-object v0

    invoke-static {v0}, Lo/dbu;->f(Ljava/util/Date;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    mul-long v8, v0, v2

    .line 277
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 278
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getVo2maxValue()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 279
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getVo2maxValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 282
    :cond_1
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v7}, Lcom/huawei/hwcommonmodel/fitnessdatatype/Vo2maxDetail;->getVo2maxValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    :cond_2
    :goto_1
    goto/16 :goto_0

    .line 285
    :cond_3
    goto :goto_2

    .line 286
    :cond_4
    const/4 v0, 0x0

    iput-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->K:Ljava/util/HashMap;

    .line 288
    :goto_2
    iget-object v5, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->e:Ljava/lang/Object;

    monitor-enter v5

    .line 289
    :try_start_0
    iget-boolean v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->b:Z

    if-eqz v0, :cond_5

    .line 290
    iget-object v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->O:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_3

    .line 292
    :cond_5
    const/4 v0, 0x1

    iput-boolean v0, v4, Lcom/huawei/ui/main/stories/health/fragment/Vo2maxYearDetailFragment;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    :goto_3
    monitor-exit v5

    goto :goto_4

    :catchall_0
    move-exception v10

    monitor-exit v5

    throw v10

    .line 295
    :goto_4
    return-void
.end method
