.class Lo/exq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exq;->e(JLo/exn$d;ILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exq;

.field final synthetic c:Lo/egg;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/exq;ILo/egg;)V
    .locals 0

    .line 260
    iput-object p1, p0, Lo/exq$5;->a:Lo/exq;

    iput p2, p0, Lo/exq$5;->e:I

    iput-object p3, p0, Lo/exq$5;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 9

    .line 263
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportDetailTotalData requsetGetFitnessDataDetailByDataType 03 onResponse start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 264
    const/4 v4, -0x1

    .line 265
    const/4 v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 266
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    instance-of v0, p2, Ljava/util/List;

    if-eqz v0, :cond_2

    .line 267
    const/4 v4, 0x0

    .line 268
    move-object v6, p2

    check-cast v6, Ljava/util/List;

    .line 269
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSportDetailTotalData requsetGetFitnessDataDetailByDataType size = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    const/4 v7, 0x0

    :goto_0
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_0

    .line 271
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;

    .line 272
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->c(Lo/exq;)I

    move-result v1

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->getWalk()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exq;->d(Lo/exq;I)I

    .line 273
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->e(Lo/exq;)I

    move-result v1

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->getRun()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exq;->e(Lo/exq;I)I

    .line 274
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->b(Lo/exq;)I

    move-result v1

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->getClimb()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exq;->b(Lo/exq;I)I

    .line 275
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->d(Lo/exq;)I

    move-result v1

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->getRide()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exq;->c(Lo/exq;I)I

    .line 276
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->i(Lo/exq;)I

    move-result v1

    invoke-virtual {v8}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalValue;->getAll()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {v0, v1}, Lo/exq;->a(Lo/exq;I)I

    .line 270
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 279
    :cond_0
    iget v0, p0, Lo/exq$5;->e:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_1

    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 280
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->c(Lo/exq;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v0, v1}, Lo/exq;->d(Lo/exq;I)I

    .line 281
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->e(Lo/exq;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v0, v1}, Lo/exq;->e(Lo/exq;I)I

    .line 282
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->b(Lo/exq;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v0, v1}, Lo/exq;->b(Lo/exq;I)I

    .line 283
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->d(Lo/exq;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v0, v1}, Lo/exq;->c(Lo/exq;I)I

    .line 284
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->i(Lo/exq;)I

    move-result v1

    int-to-double v1, v1

    const/4 v3, 0x3

    invoke-static {v1, v2, v3}, Lo/cxh;->a(DI)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->round(D)J

    move-result-wide v1

    long-to-int v1, v1

    invoke-static {v0, v1}, Lo/exq;->a(Lo/exq;I)I

    .line 287
    :cond_1
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v0}, Lo/exq;->a(Lo/exq;)Lo/exm;

    move-result-object v0

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->c(Lo/exq;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/exm;->c(I)V

    .line 288
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v0}, Lo/exq;->a(Lo/exq;)Lo/exm;

    move-result-object v0

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->e(Lo/exq;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/exm;->a(I)V

    .line 289
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v0}, Lo/exq;->a(Lo/exq;)Lo/exm;

    move-result-object v0

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->d(Lo/exq;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/exm;->d(I)V

    .line 290
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v0}, Lo/exq;->a(Lo/exq;)Lo/exm;

    move-result-object v0

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->b(Lo/exq;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/exm;->i(I)V

    .line 291
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v0}, Lo/exq;->a(Lo/exq;)Lo/exm;

    move-result-object v0

    iget-object v1, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v1}, Lo/exq;->i(Lo/exq;)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/exm;->b(I)V

    .line 293
    iget-object v0, p0, Lo/exq$5;->a:Lo/exq;

    invoke-static {v0}, Lo/exq;->i(Lo/exq;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    .line 294
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSportDetailTotalData requsetGetFitnessDataDetailByDataType  mWalkTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exq$5;->a:Lo/exq;

    .line 295
    invoke-static {v3}, Lo/exq;->c(Lo/exq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mRunTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exq$5;->a:Lo/exq;

    .line 296
    invoke-static {v3}, Lo/exq;->e(Lo/exq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  mClimbTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exq$5;->a:Lo/exq;

    .line 297
    invoke-static {v3}, Lo/exq;->b(Lo/exq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mRideTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exq$5;->a:Lo/exq;

    .line 298
    invoke-static {v3}, Lo/exq;->d(Lo/exq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mFitnessTotalData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exq$5;->a:Lo/exq;

    .line 299
    invoke-static {v3}, Lo/exq;->i(Lo/exq;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 294
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 302
    :cond_2
    iget-object v0, p0, Lo/exq$5;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 303
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportDetailTotalData requsetGetFitnessDataDetailByDataType updateResponse.onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 304
    iget-object v0, p0, Lo/exq$5;->c:Lo/egg;

    invoke-interface {v0, v4, v5}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 307
    :cond_3
    const-string v0, "FitnessSportDataDetailInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestSportDetailTotalData requsetGetFitnessDataDetailByDataType 03 onResponse over"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    return-void
.end method
