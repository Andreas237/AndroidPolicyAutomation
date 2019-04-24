.class public Lo/fhp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lo/exo;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/fhp;->b:Lo/exo;

    .line 44
    iput-object p1, p0, Lo/fhp;->a:Landroid/content/Context;

    .line 45
    invoke-static {p1}, Lo/exo;->d(Landroid/content/Context;)Lo/exo;

    move-result-object v0

    iput-object v0, p0, Lo/fhp;->b:Lo/exo;

    .line 46
    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 5

    .line 106
    const/16 v0, 0xcd

    if-gt p1, v0, :cond_0

    .line 107
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_light:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 108
    :cond_0
    const/16 v0, 0x19a

    if-gt p1, v0, :cond_1

    .line 109
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_center:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 111
    :cond_1
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_height:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 113
    :goto_0
    const-string v0, "FitnessGoalInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStepLevelStr() calorieGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",calorieLevel="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    return-object v4
.end method

.method public a(Lo/egg;)V
    .locals 1

    .line 68
    iget-object v0, p0, Lo/fhp;->b:Lo/exo;

    invoke-virtual {v0, p1}, Lo/exo;->a(Lo/egg;)V

    .line 69
    return-void
.end method

.method public a(ILcom/huawei/up/model/UserInfomation;)[I
    .locals 11

    .line 181
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 182
    const-string v0, "FitnessGoalInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == userInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    return-object v0

    .line 185
    :cond_0
    const-string v0, "FitnessGoalInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "calValue="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "userInfo.weight="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    mul-int/lit16 v0, p1, 0x3e8

    div-int/lit16 v6, v0, 0x5dc

    .line 187
    mul-int/lit16 v0, p1, 0x3e8

    div-int/lit16 v7, v0, 0x1a2c

    .line 190
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v8

    .line 191
    const/4 v0, 0x0

    cmpg-float v0, v8, v0

    if-gtz v0, :cond_1

    .line 192
    const/high16 v8, 0x42000000    # 32.0f

    .line 194
    :cond_1
    mul-int/lit16 v0, p1, 0x3e8

    int-to-double v0, v0

    float-to-double v2, v8

    const-wide v4, 0x4004cccccccccccdL    # 2.6

    mul-double/2addr v2, v4

    div-double/2addr v0, v2

    double-to-int v0, v0

    div-int/lit8 v9, v0, 0x3c

    .line 195
    const/4 v0, 0x3

    new-array v10, v0, [I

    const/4 v0, 0x0

    aput v6, v10, v0

    const/4 v0, 0x1

    aput v7, v10, v0

    const/4 v0, 0x2

    aput v9, v10, v0

    .line 196
    return-object v10

    nop

    :array_0
    .array-data 4
        0x0
        0x0
        0x0
    .end array-data
.end method

.method public c(D)Ljava/lang/String;
    .locals 5

    .line 124
    const-wide/high16 v0, 0x40a9000000000000L    # 3200.0

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_0

    .line 125
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_light:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 126
    :cond_0
    const-wide/high16 v0, 0x40b9000000000000L    # 6400.0

    cmpg-double v0, p1, v0

    if-gtz v0, :cond_1

    .line 127
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_center:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 129
    :cond_1
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_height:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 131
    :goto_0
    const-string v0, "FitnessGoalInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStepLevelStr() distanceGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",distanceLevel="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    return-object v4
.end method

.method public c(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;)Ljava/lang/String;
    .locals 6

    .line 205
    const-string v5, ""

    .line 206
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getDataType()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 208
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCurrValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_settings_steps_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 209
    goto :goto_0

    .line 211
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCurrValue()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_energy_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 212
    goto :goto_0

    .line 214
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;->getCurrValue()I

    move-result v1

    int-to-double v1, v1

    const-wide v3, 0x408f400000000000L    # 1000.0

    div-double/2addr v1, v3

    invoke-static {v1, v2}, Lo/dbu;->c(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_band_data_sport_distance_unit:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 215
    .line 219
    :goto_0
    :pswitch_3
    return-object v5

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method public c(IILo/egg;)V
    .locals 1

    .line 78
    iget-object v0, p0, Lo/fhp;->b:Lo/exo;

    invoke-virtual {v0, p1, p2, p3}, Lo/exo;->a(IILo/egg;)V

    .line 79
    return-void
.end method

.method public d(DLcom/huawei/up/model/UserInfomation;)I
    .locals 7

    .line 161
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 162
    const-string v0, "FitnessGoalInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == userInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const/4 v0, 0x0

    return v0

    .line 166
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double/2addr v0, v2

    const-wide v2, 0x3fdae147ae147ae1L    # 0.42

    mul-double v4, v0, v2

    .line 167
    div-double v0, p1, v4

    double-to-int v6, v0

    .line 168
    invoke-virtual {p0, v6, p3}, Lo/fhp;->e(ILcom/huawei/up/model/UserInfomation;)I

    move-result v0

    return v0
.end method

.method public e(ILcom/huawei/up/model/UserInfomation;)I
    .locals 12

    .line 142
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 143
    const-string v0, "FitnessGoalInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "null == userInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    const/4 v0, 0x0

    return v0

    .line 146
    :cond_0
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    div-double v4, v0, v2

    .line 147
    invoke-virtual {p2}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v6

    .line 148
    const-wide v0, 0x3fdae147ae147ae1L    # 0.42

    mul-double v7, v4, v0

    .line 149
    const-wide v0, 0x4005c050b3545e5aL    # 2.718903924

    mul-double/2addr v0, v7

    float-to-double v2, v6

    mul-double/2addr v0, v2

    const-wide v2, 0x40ac200000000000L    # 3600.0

    div-double v9, v0, v2

    .line 150
    int-to-double v0, p1

    mul-double/2addr v0, v9

    double-to-int v11, v0

    .line 151
    return v11
.end method

.method public e(I)Ljava/lang/String;
    .locals 5

    .line 88
    const/16 v0, 0x18bd

    if-gt p1, v0, :cond_0

    .line 89
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_light:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 90
    :cond_0
    const/16 v0, 0x317a

    if-gt p1, v0, :cond_1

    .line 91
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_center:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    .line 93
    :cond_1
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_settings_goal_height:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 95
    :goto_0
    const-string v0, "FitnessGoalInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStepLevelStr() stepGoal="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",stepLevel="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    return-object v4
.end method

.method public e(Lo/egg;)V
    .locals 2

    .line 53
    iget-object v0, p0, Lo/fhp;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/dnm;->a(Landroid/content/Context;)Lo/dnm;

    move-result-object v0

    new-instance v1, Lo/fhp$2;

    invoke-direct {v1, p0, p1}, Lo/fhp$2;-><init>(Lo/fhp;Lo/egg;)V

    invoke-virtual {v0, v1}, Lo/dnm;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 61
    return-void
.end method
