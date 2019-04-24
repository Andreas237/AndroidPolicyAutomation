.class Lo/exl$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exl;->a(JLo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exl;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/exl;Lo/egg;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lo/exl$3;->a:Lo/exl;

    iput-object p2, p0, Lo/exl$3;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 313
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    instance-of v0, p2, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    if-eqz v0, :cond_0

    .line 314
    move-object v4, p2

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;

    .line 315
    iget-object v0, p0, Lo/exl$3;->a:Lo/exl;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getCalorie()I

    move-result v1

    div-int/lit16 v1, v1, 0x3e8

    invoke-static {v0, v1}, Lo/exl;->d(Lo/exl;I)I

    .line 316
    iget-object v0, p0, Lo/exl$3;->a:Lo/exl;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getSteps()I

    move-result v1

    invoke-static {v0, v1}, Lo/exl;->a(Lo/exl;I)I

    .line 317
    iget-object v0, p0, Lo/exl$3;->a:Lo/exl;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getDistance()I

    move-result v1

    invoke-static {v0, v1}, Lo/exl;->e(Lo/exl;I)I

    .line 318
    iget-object v0, p0, Lo/exl$3;->a:Lo/exl;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/FitnessTotalData;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/high16 v2, 0x40400000    # 3.0f

    div-float/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v0, v1}, Lo/exl;->c(Lo/exl;I)I

    .line 319
    const-string v0, "FitnessDataListInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestSpecificOneDayFitnessTotalData mCalories "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exl$3;->a:Lo/exl;

    invoke-static {v3}, Lo/exl;->a(Lo/exl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mSteps = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exl$3;->a:Lo/exl;

    .line 320
    invoke-static {v3}, Lo/exl;->e(Lo/exl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " mDistance = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/exl$3;->a:Lo/exl;

    invoke-static {v3}, Lo/exl;->k(Lo/exl;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 319
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    :cond_0
    iget-object v0, p0, Lo/exl$3;->e:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 324
    iget-object v0, p0, Lo/exl$3;->e:Lo/egg;

    iget-object v1, p0, Lo/exl$3;->a:Lo/exl;

    invoke-static {v1}, Lo/exl;->k(Lo/exl;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 326
    :cond_1
    return-void
.end method
