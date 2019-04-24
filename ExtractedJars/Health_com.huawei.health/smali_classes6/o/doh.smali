.class public Lo/doh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$b;


# instance fields
.field private b:I

.field private c:Z

.field private e:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lo/doh;->e:Landroid/content/Context;

    .line 23
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/doh;->c:Z

    .line 169
    const/4 v0, 0x0

    iput v0, p0, Lo/doh;->b:I

    .line 26
    iput-object p1, p0, Lo/doh;->e:Landroid/content/Context;

    .line 27
    return-void
.end method

.method static synthetic b(Lo/doh;)Landroid/content/Context;
    .locals 1

    .line 17
    iget-object v0, p0, Lo/doh;->e:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public b(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 10

    .line 56
    move-object v4, p0

    monitor-enter v4

    .line 57
    :try_start_0
    iget-boolean v0, p0, Lo/doh;->c:Z

    if-eqz v0, :cond_0

    .line 58
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "block!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    monitor-exit v4

    return-void

    .line 62
    :cond_0
    :try_start_1
    new-instance v5, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v5}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    .line 63
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setName(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setGender(Ljava/lang/Integer;)V

    .line 65
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setPortraitUrl(Ljava/lang/String;)V

    .line 66
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPicPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setPicPath(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthdayStatus(Ljava/lang/String;)V

    .line 68
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setBirthday(Ljava/lang/String;)V

    .line 69
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getLanguageCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setLanguageCode(Ljava/lang/String;)V

    .line 71
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 72
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 73
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setClientSet(Ljava/lang/Integer;)V

    .line 75
    new-instance v6, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 76
    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setUser(I)V

    .line 77
    iget v0, p0, Lo/doh;->b:I

    if-nez v0, :cond_1

    .line 78
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData start :DATA_ALL"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "all data set in HiUserInfo to DB,warning,not permitted"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    monitor-exit v4

    return-void

    .line 84
    :cond_1
    :try_start_2
    iget v0, p0, Lo/doh;->b:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 87
    :sswitch_0
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData start :UP_DATA_ONLY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const/high16 v0, 0x10000000

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setModifiedIntent(I)V

    .line 90
    goto :goto_1

    .line 93
    :sswitch_1
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData start :DP_DATA_ONLY"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const/high16 v0, 0x20000000

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setModifiedIntent(I)V

    .line 96
    goto :goto_1

    .line 99
    :goto_0
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unknown data type in HiUserInfo to DB,warning"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    :goto_1
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 106
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNIT_TYPE_ENGLISH not stand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 107
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNIT_TYPE_ENGLISH need trans to UNIT_TYPE_METRIC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 111
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getMetricHeight()I

    move-result v7

    .line 112
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getMetricWeight()F

    move-result v8

    .line 113
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 114
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 115
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/huawei/up/model/UserInfomation;->setClientSet(Ljava/lang/Integer;)V

    .line 118
    :cond_2
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHeight(I)V

    .line 119
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 120
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setUnitType(I)V

    .line 122
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setName(Ljava/lang/String;)V

    .line 123
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_3

    .line 124
    const/4 v0, -0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setGender(I)V

    goto :goto_3

    .line 125
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    .line 126
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setGender(I)V

    goto :goto_3

    .line 128
    :cond_4
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    if-nez v0, :cond_5

    const/4 v0, 0x1

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setGender(I)V

    .line 132
    :goto_3
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 133
    const v0, 0x12fa981

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setBirthday(I)V

    goto :goto_4

    .line 135
    :cond_6
    invoke-virtual {v5}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiUserInfo;->setBirthday(I)V

    .line 138
    :goto_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {v6, v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 140
    const-string v0, "HiHealthWriter"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " setUserData start, user=(1)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " setUserData start, user=(2)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {v6}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    iget-object v0, p0, Lo/doh;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    new-instance v1, Lo/doh$3;

    invoke-direct {v1, p0, v5, p2}, Lo/doh$3;-><init>(Lo/doh;Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V

    invoke-virtual {v0, v6, v1}, Lo/clq;->b(Lcom/huawei/hihealth/HiUserInfo;Lo/clz;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 166
    monitor-exit v4

    goto :goto_5

    :catchall_0
    move-exception v9

    monitor-exit v4

    throw v9

    .line 167
    :goto_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x10000000 -> :sswitch_0
        0x20000000 -> :sswitch_1
    .end sparse-switch
.end method

.method public c(I)V
    .locals 2

    .line 172
    move-object v0, p0

    monitor-enter v0

    .line 174
    :try_start_0
    iput p1, p0, Lo/doh;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 176
    :goto_0
    return-void
.end method

.method public e()V
    .locals 3

    .line 49
    move-object v1, p0

    monitor-enter v1

    .line 50
    const/4 v0, 0x0

    :try_start_0
    iput-boolean v0, p0, Lo/doh;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 52
    :goto_0
    return-void
.end method

.method public e(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    .locals 6

    .line 31
    move-object v4, p0

    monitor-enter v4

    .line 32
    :try_start_0
    iget-boolean v0, p0, Lo/doh;->c:Z

    if-eqz v0, :cond_0

    .line 33
    const-string v0, "HiHealthWriter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "block!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    monitor-exit v4

    return-void

    .line 36
    :cond_0
    :try_start_1
    invoke-virtual {p0, p1, p2}, Lo/doh;->b(Lcom/huawei/up/model/UserInfomation;Lo/dod$b$d;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 38
    :goto_0
    return-void
.end method
