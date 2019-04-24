.class Lo/exo$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exo;->a(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egg;

.field final synthetic e:Lo/exo;


# direct methods
.method constructor <init>(Lo/exo;Lo/egg;)V
    .locals 0

    .line 1118
    iput-object p1, p0, Lo/exo$6;->e:Lo/exo;

    iput-object p2, p0, Lo/exo$6;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 1121
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestFitnessGoal result code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1122
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    instance-of v0, p2, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    if-eqz v0, :cond_0

    .line 1124
    move-object v4, p2

    check-cast v4, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    .line 1125
    const-string v0, "SCUI_FitnessMgrInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "requestFitnessGoal response = \ndataType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1126
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDataType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\nstepGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1127
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ncalorieGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1128
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCalorieGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ndistanceGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1129
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDistanceGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",\ndurationGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 1130
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDutationGoal()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 1125
    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1132
    iget-object v0, p0, Lo/exo$6;->e:Lo/exo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDataType()I

    move-result v1

    invoke-static {v0, v1}, Lo/exo;->g(Lo/exo;I)I

    .line 1133
    iget-object v0, p0, Lo/exo$6;->e:Lo/exo;

    invoke-static {v0}, Lo/exo;->g(Lo/exo;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 1135
    :pswitch_0
    iget-object v0, p0, Lo/exo$6;->e:Lo/exo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getStepGoal()I

    move-result v1

    invoke-static {v0, v1}, Lo/exo;->o(Lo/exo;I)I

    .line 1136
    goto :goto_0

    .line 1138
    :pswitch_1
    iget-object v0, p0, Lo/exo$6;->e:Lo/exo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCalorieGoal()I

    move-result v1

    invoke-static {v0, v1}, Lo/exo;->o(Lo/exo;I)I

    .line 1139
    goto :goto_0

    .line 1141
    :pswitch_2
    iget-object v0, p0, Lo/exo$6;->e:Lo/exo;

    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDistanceGoal()I

    move-result v1

    invoke-static {v0, v1}, Lo/exo;->o(Lo/exo;I)I

    .line 1142
    .line 1149
    :cond_0
    :goto_0
    :pswitch_3
    iget-object v0, p0, Lo/exo$6;->c:Lo/egg;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 1150
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 1151
    iget-object v0, p0, Lo/exo$6;->c:Lo/egg;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    goto :goto_1

    .line 1153
    :cond_1
    iget-object v0, p0, Lo/exo$6;->c:Lo/egg;

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 1156
    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method
