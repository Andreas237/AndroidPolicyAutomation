.class Lo/exv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exv;->a(Ljava/util/Date;ILo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/exv;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/exv;Lo/egg;)V
    .locals 0

    .line 235
    iput-object p1, p0, Lo/exv$4;->d:Lo/exv;

    iput-object p2, p0, Lo/exv$4;->e:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 8

    .line 238
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getPressureAdvice errorCode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    .line 240
    move-object v4, p2

    check-cast v4, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;

    .line 241
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->getError_code()I

    move-result v5

    .line 242
    if-nez v5, :cond_0

    .line 243
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->getAdvice_num_1()I

    move-result v6

    .line 244
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/fitness/interactors/stressAdvice/PressureAdeviceRetrunValue;->getAdvice_num_2()I

    move-result v7

    .line 245
    const-string v0, "BasePressureMeasureFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "adviceNum_1 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " adviceNum_2 = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lo/exv$4;->d:Lo/exv;

    iget-object v1, p0, Lo/exv$4;->d:Lo/exv;

    invoke-static {v1, v7}, Lo/exv;->d(Lo/exv;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/exv;->e(Lo/exv;Ljava/lang/String;)Ljava/lang/String;

    .line 249
    :cond_0
    iget-object v0, p0, Lo/exv$4;->e:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 250
    return-void
.end method
