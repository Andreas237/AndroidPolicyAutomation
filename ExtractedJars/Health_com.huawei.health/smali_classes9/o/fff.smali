.class public Lo/fff;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private b:Ljava/lang/Object;

.field private e:I


# direct methods
.method public constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Lo/fff;->e:I

    .line 24
    iput-object p2, p0, Lo/fff;->b:Ljava/lang/Object;

    .line 25
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 28
    iget v0, p0, Lo/fff;->e:I

    return v0
.end method

.method public b()F
    .locals 1

    .line 63
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 64
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->b()F

    move-result v0

    return v0

    .line 66
    :cond_0
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireActualCalorie()F

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    .line 54
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 55
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->h()I

    move-result v0

    return v0

    .line 57
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d()I
    .locals 1

    .line 46
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 47
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->f()I

    move-result v0

    return v0

    .line 49
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_fitness:I

    return v0
.end method

.method public e()Ljava/lang/Object;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public f()I
    .locals 1

    .line 98
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 99
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->a()I

    move-result v0

    return v0

    .line 101
    :cond_0
    const/4 v0, 0x3

    return v0
.end method

.method public g()I
    .locals 1

    .line 87
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 88
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->c()I

    move-result v0

    return v0

    .line 90
    :cond_0
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireRecordType()I

    move-result v0

    return v0
.end method

.method public h()J
    .locals 2

    .line 71
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->d()J

    move-result-wide v0

    return-wide v0

    .line 74
    :cond_0
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireExerciseDuring()J

    move-result-wide v0

    return-wide v0
.end method

.method public i()F
    .locals 1

    .line 79
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 80
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->e()F

    move-result v0

    return v0

    .line 82
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public k()J
    .locals 2

    .line 108
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 109
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->i()J

    move-result-wide v0

    return-wide v0

    .line 111
    :cond_0
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireExerciseStartTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public l()F
    .locals 1

    .line 147
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 148
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->l()F

    move-result v0

    return v0

    .line 150
    :cond_0
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireActualCalorie()F

    move-result v0

    return v0
.end method

.method public m()J
    .locals 2

    .line 116
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 117
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->k()J

    move-result-wide v0

    return-wide v0

    .line 119
    :cond_0
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireExerciseEndTime()J

    move-result-wide v0

    return-wide v0
.end method

.method public n()I
    .locals 1

    .line 132
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 133
    const/4 v0, 0x0

    return v0

    .line 135
    :cond_0
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireRecordId()I

    move-result v0

    return v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    .line 124
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 125
    const-string v0, ""

    return-object v0

    .line 127
    :cond_0
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-virtual {v0}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;->acquireWorkoutName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public p()I
    .locals 1

    .line 140
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 141
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->m()I

    move-result v0

    return v0

    .line 143
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public s()I
    .locals 1

    .line 155
    iget v0, p0, Lo/fff;->e:I

    if-nez v0, :cond_0

    .line 156
    iget-object v0, p0, Lo/fff;->b:Ljava/lang/Object;

    check-cast v0, Lo/ffe;

    invoke-virtual {v0}, Lo/ffe;->g()I

    move-result v0

    return v0

    .line 158
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
