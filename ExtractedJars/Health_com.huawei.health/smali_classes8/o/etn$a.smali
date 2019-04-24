.class Lo/etn$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/etn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/etn;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/etn;)V
    .locals 1

    .line 238
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 239
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/etn$a;->d:Ljava/lang/ref/WeakReference;

    .line 240
    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 6

    .line 271
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchGoalInfo failure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 272
    iget-object v0, p0, Lo/etn$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/etn;

    .line 273
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 274
    return-void

    .line 277
    :cond_0
    iget-object v5, v4, Lo/etn;->d:Landroid/os/Handler;

    .line 278
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 279
    return-void

    .line 282
    :cond_1
    const/16 v0, 0x2710

    iput v0, v4, Lo/etn;->t:I

    .line 283
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 284
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 7

    .line 244
    iget-object v0, p0, Lo/etn$a;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/etn;

    .line 245
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 246
    return-void

    .line 249
    :cond_0
    iget-object v5, v4, Lo/etn;->d:Landroid/os/Handler;

    .line 250
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 251
    return-void

    .line 254
    :cond_1
    if-eqz p2, :cond_3

    .line 255
    move-object v6, p2

    check-cast v6, Ljava/util/List;

    .line 256
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchGoalInfo_data_stepGoal "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 258
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    double-to-int v0, v0

    iput v0, v4, Lo/etn;->t:I

    goto :goto_0

    .line 260
    :cond_2
    const/16 v0, 0x2710

    iput v0, v4, Lo/etn;->t:I

    .line 262
    :goto_0
    goto :goto_1

    .line 263
    :cond_3
    const-string v0, "PLGACHIEVE_StepTrendCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchGoalInfo data is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    const/16 v0, 0x2710

    iput v0, v4, Lo/etn;->t:I

    .line 266
    :goto_1
    const/4 v0, 0x4

    invoke-virtual {v5, v0}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 267
    return-void
.end method
