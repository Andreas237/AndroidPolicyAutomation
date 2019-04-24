.class public Lo/dlo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private c:Landroid/content/Context;

.field private e:Lo/dln;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Lo/dlo;->c:Landroid/content/Context;

    .line 41
    iget-object v0, p0, Lo/dlo;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    iput-object v0, p0, Lo/dlo;->e:Lo/dln;

    .line 42
    return-void
.end method

.method private a(Ljava/lang/String;Lo/cwz;)Ljava/lang/String;
    .locals 5

    .line 251
    iget-object v0, p0, Lo/dlo;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 252
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get user failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    const/4 v0, 0x0

    return-object v0

    .line 257
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lo/cwz;->getSharedPreference(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private a(Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 4

    .line 220
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getEndDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/dmn;->e(Ljava/lang/String;)J

    move-result-wide v2

    .line 221
    const-wide/16 v0, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 222
    invoke-virtual {p2, v2, v3}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setExpireTime(J)V

    .line 224
    :cond_0
    return-void
.end method

.method private c()Z
    .locals 7

    .line 265
    const/4 v3, 0x0

    .line 266
    const-string v0, "reach_steps_goal_check_interval"

    iget-object v1, p0, Lo/dlo;->e:Lo/dln;

    invoke-direct {p0, v0, v1}, Lo/dlo;->a(Ljava/lang/String;Lo/cwz;)Ljava/lang/String;

    move-result-object v4

    .line 267
    if-eqz v4, :cond_0

    const-string v0, ""

    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 268
    :cond_0
    const/4 v3, 0x1

    goto :goto_0

    .line 270
    :cond_1
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    .line 272
    new-instance v0, Ljava/util/Date;

    const-wide/16 v1, 0x3e8

    mul-long/2addr v1, v5

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-static {v0}, Lo/dbu;->l(Ljava/util/Date;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 273
    const/4 v3, 0x1

    .line 277
    :cond_2
    :goto_0
    return v3
.end method

.method private e(Ljava/lang/String;Ljava/lang/String;Lo/cwz;)I
    .locals 5

    .line 234
    iget-object v0, p0, Lo/dlo;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v4

    .line 235
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 236
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get user failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    const/16 v0, -0x3ea

    return v0

    .line 240
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p3, v0, p2, v1}, Lo/cwz;->setSharedPreference(Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public a(Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;)V
    .locals 13

    .line 106
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createReachGoalActivitySmartMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityPosition()I

    move-result v0

    const/4 v1, 0x5

    if-ne v1, v0, :cond_0

    .line 110
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "companyactivity no recommod"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    return-void

    .line 115
    :cond_0
    const-string v0, "ai-walk-001"

    const/16 v1, 0x7530

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v4

    .line 117
    const-string v0, "ai-walk-001"

    const/16 v1, 0x7530

    invoke-static {v1, v0}, Lo/dmn;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 120
    new-instance v6, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v6}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 121
    const/16 v0, 0x2710

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 122
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 123
    const-string v0, "110000"

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 124
    invoke-virtual {v6, v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 125
    invoke-virtual {v6, v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 126
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 129
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 130
    new-instance v7, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-direct {v7}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;-><init>()V

    .line 131
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getWordDesc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->setContent(Ljava/lang/String;)V

    .line 132
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->setSubContent(Ljava/lang/String;)V

    .line 133
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityStatus()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->setMinContent(Ljava/lang/String;)V

    .line 134
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getLastModifyTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->setLastModifyTime(Ljava/lang/String;)V

    .line 135
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v7, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v8

    .line 136
    invoke-virtual {v6, v8}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 138
    invoke-direct {p0, p1, v6}, Lo/dlo;->a(Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    .line 139
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v9

    .line 140
    const/4 v0, 0x0

    if-ne v0, v9, :cond_1

    .line 141
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v10

    .line 142
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createReachGoalActivitySmartMsg, oldSmartMsg is null, isSuccess ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    return-void

    .line 147
    :cond_1
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual {v9}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    .line 149
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 150
    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->getSubContent()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 151
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createReachGoalActivitySmartMsg, same activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    invoke-virtual {v9}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getStatus()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    .line 153
    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->getLastModifyTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getLastModifyTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 154
    :cond_2
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v9}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v1

    invoke-virtual {v0, v1, v6}, Lo/dln;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v11

    .line 155
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createReachGoalActivitySmartMsg, MSG_STATUS_EXPIRED, update="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    goto :goto_0

    .line 159
    :cond_3
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    const/16 v1, 0x2710

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    move-result v11

    .line 160
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v12

    .line 161
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createReachGoalActivitySmartMsg, delResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", insertResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :cond_4
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;)V
    .locals 16

    .line 167
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createFitnessVedioSmartMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const-string v0, "ai-walk-003"

    const/16 v1, 0x7530

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v4

    .line 171
    const-string v0, "ai-walk-003"

    const/16 v1, 0x7530

    invoke-static {v1, v0}, Lo/dmn;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 174
    new-instance v6, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v6}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 175
    const/16 v0, 0x2712

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 176
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 177
    const-string v0, "110000"

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v6, v4}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 179
    invoke-virtual {v6, v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 180
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 183
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 184
    new-instance v7, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-direct {v7}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;-><init>()V

    .line 185
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v8

    .line 186
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->getFitWorkout()Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->setContent(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v7, v8}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->setSubContent(Ljava/lang/String;)V

    .line 188
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v7, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v9

    .line 189
    invoke-virtual {v6, v9}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 191
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlo;->e:Lo/dln;

    const/16 v1, 0x2712

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v10

    .line 192
    const/4 v0, 0x0

    if-ne v0, v10, :cond_0

    .line 193
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v11

    .line 194
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "newSmartMsg="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createFitnessVedioSmartMsg, oldSmartMsg is null, isSuccess ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    return-void

    .line 199
    :cond_0
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    .line 201
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;->getSubContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;

    .line 202
    invoke-virtual {v12}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->getFitWorkout()Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v13

    .line 203
    invoke-virtual {v13}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->getFitWorkout()Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 204
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createFitnessVedioSmartMsg, same fitWorkout"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getStatus()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 206
    invoke-virtual {v13}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ContentVideo;->getFitWorkout()Lcom/huawei/pluginFitnessAdvice/FitWorkout;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->accquireVersion()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 207
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v1

    invoke-virtual {v0, v1, v6}, Lo/dln;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v14

    .line 208
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createFitnessVedioSmartMsg, MSG_STATUS_EXPIRED or verion not same, update="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 209
    goto :goto_0

    .line 212
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlo;->e:Lo/dln;

    const/16 v1, 0x2712

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    move-result v14

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v0, v6}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v15

    .line 214
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createFitnessVedioSmartMsg, delResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", insertResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 217
    :cond_3
    :goto_0
    return-void
.end method

.method public c(Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;)V
    .locals 15

    .line 45
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createRemindReachStepsGoalSmartMsg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    const-string v0, "ai-walk-002"

    const/16 v1, 0x7530

    invoke-static {v1, v0}, Lo/dmn;->e(ILjava/lang/String;)I

    move-result v6

    .line 49
    const-string v0, "ai-walk-002"

    const/16 v1, 0x7530

    invoke-static {v1, v0}, Lo/dmn;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 52
    new-instance v8, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v8}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 53
    const/16 v0, 0x2711

    invoke-virtual {v8, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 54
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 55
    const-string v0, "110000"

    invoke-virtual {v8, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 56
    invoke-virtual {v8, v6}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 57
    invoke-virtual {v8, v7}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 58
    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 61
    const/4 v0, 0x3

    invoke-virtual {v8, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 62
    new-instance v0, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityName()Ljava/lang/String;

    move-result-object v1

    .line 63
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getTargetValue()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityStatus()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getLastModifyTime()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;-><init>(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V

    move-object v9, v0

    .line 64
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual {v0, v9, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v10

    .line 65
    invoke-virtual {v8, v10}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 67
    move-object/from16 v0, p1

    invoke-direct {p0, v0, v8}, Lo/dlo;->a(Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V

    .line 68
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v11

    .line 69
    const/4 v0, 0x0

    if-ne v0, v11, :cond_0

    .line 70
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v0, v8}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v12

    .line 72
    const-string v0, "reach_steps_goal_check_interval"

    invoke-static {}, Lo/dbu;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dlo;->e:Lo/dln;

    invoke-direct {p0, v0, v1, v2}, Lo/dlo;->e(Ljava/lang/String;Ljava/lang/String;Lo/cwz;)I

    .line 74
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createRemindReachStepsGoalSmartMsg, oldSmartMsg is null, isSuccess ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-void

    .line 79
    :cond_0
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    invoke-virtual {v11}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getMsgContent()Ljava/lang/String;

    move-result-object v1

    const-class v2, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    invoke-virtual {v0, v1, v2}, Lo/dmo;->b(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;

    .line 81
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 82
    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getActivityId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v12}, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->getActivityId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 83
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "createRemindReachStepsGoalSmartMsg, same activity"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-virtual {v11}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getStatus()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    .line 85
    invoke-virtual {v12}, Lcom/huawei/hwsmartinteractmgr/data/ContentRemindSteps;->getLastModifyTime()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/huawei/hwsmartinteractmgr/data/ActivitySimple;->getLastModifyTime()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 86
    invoke-direct {p0}, Lo/dlo;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 87
    :cond_1
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v11}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->getId()I

    move-result v1

    invoke-virtual {v0, v1, v8}, Lo/dln;->d(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v13

    .line 89
    const-string v0, "reach_steps_goal_check_interval"

    invoke-static {}, Lo/dbu;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dlo;->e:Lo/dln;

    invoke-direct {p0, v0, v1, v2}, Lo/dlo;->e(Ljava/lang/String;Ljava/lang/String;Lo/cwz;)I

    .line 91
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createRemindReachStepsGoalSmartMsg, MSG_STATUS_EXPIRED, update="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    goto :goto_0

    .line 95
    :cond_2
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    const/16 v1, 0x2711

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    move-result v13

    .line 96
    iget-object v0, p0, Lo/dlo;->e:Lo/dln;

    invoke-virtual {v0, v8}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    move-result v14

    .line 98
    const-string v0, "reach_steps_goal_check_interval"

    invoke-static {}, Lo/dbu;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lo/dlo;->e:Lo/dln;

    invoke-direct {p0, v0, v1, v2}, Lo/dlo;->e(Ljava/lang/String;Ljava/lang/String;Lo/cwz;)I

    .line 100
    const-string v0, "SMART_HealthcareInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "createRemindReachStepsGoalSmartMsg, delResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ", insertResult="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :cond_3
    :goto_0
    return-void
.end method
