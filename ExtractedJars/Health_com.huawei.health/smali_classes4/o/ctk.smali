.class public Lo/ctk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiGoalInfo;)Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;
    .locals 7

    .line 98
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 99
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    invoke-direct {p0, v0}, Lo/ctk;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 100
    :cond_1
    new-instance v4, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;

    invoke-direct {v4}, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;-><init>()V

    .line 101
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    invoke-static {v0}, Lo/cmm;->e(I)I

    move-result v5

    .line 102
    if-gtz v5, :cond_2

    .line 103
    const-string v0, "HiH_UserInfoSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHiGoalInfo no such goalPeriod, goalPeriod is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    const/4 v0, 0x0

    return-object v0

    .line 106
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    invoke-static {v0, v5}, Lo/cmm;->e(II)I

    move-result v6

    .line 107
    if-gtz v6, :cond_3

    .line 108
    const-string v0, "HiH_UserInfoSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHiGoalInfo no such cloudGoalType,cloudGoalType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/4 v0, 0x0

    return-object v0

    .line 111
    :cond_3
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->setGoalPeriod(Ljava/lang/Integer;)V

    .line 112
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->setGoalType(Ljava/lang/Integer;)V

    .line 113
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->setGoalValue(Ljava/lang/String;)V

    .line 114
    return-object v4
.end method

.method private a(I)Z
    .locals 4

    .line 161
    const/4 v0, 0x1

    if-lt p1, v0, :cond_0

    const/16 v0, 0x2e

    if-le p1, v0, :cond_1

    .line 162
    :cond_0
    const-string v0, "HiH_UserInfoSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no such goalType, goalType is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    const/4 v0, 0x0

    return v0

    .line 165
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method private d(Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;)Lcom/huawei/hihealth/HiGoalInfo;
    .locals 6

    .line 69
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 70
    :cond_0
    new-instance v4, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiGoalInfo;-><init>()V

    .line 71
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->getGoalType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->getGoalPeriod()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lo/cmm;->a(II)I

    move-result v5

    .line 72
    if-gtz v5, :cond_1

    .line 73
    const-string v0, "HiH_UserInfoSwitch"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchUserGoalsInfo no such local goal type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v0, 0x0

    return-object v0

    .line 76
    :cond_1
    invoke-virtual {v4, v5}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalType(I)V

    .line 77
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;->getGoalValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalValue(D)V

    .line 78
    return-object v4
.end method


# virtual methods
.method public b(Ljava/util/List;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiUserPreference;>;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 134
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 135
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 137
    :cond_1
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 138
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hihealth/HiUserPreference;

    .line 139
    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserPreference;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    goto :goto_0

    .line 141
    :cond_2
    return-object v2
.end method

.method public c(Lcom/huawei/hihealth/HiUserInfo;)Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;
    .locals 3

    .line 28
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 29
    :cond_0
    new-instance v2, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;

    invoke-direct {v2}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;-><init>()V

    .line 30
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setBirthday(Ljava/lang/Integer;)V

    .line 31
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setEmail(Ljava/lang/String;)V

    .line 32
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setGender(Ljava/lang/Integer;)V

    .line 33
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setHeight(Ljava/lang/Integer;)V

    .line 34
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getMobile()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setMobile(Ljava/lang/String;)V

    .line 35
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setName(Ljava/lang/String;)V

    .line 36
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setPortraitUrl(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v0

    float-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setWeight(Ljava/lang/Integer;)V

    .line 38
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setUnitType(Ljava/lang/Integer;)V

    .line 39
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getCreateTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->setModifyTime(Ljava/lang/Long;)V

    .line 40
    return-object v2
.end method

.method public c(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;>;)Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation

    .line 83
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 84
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 86
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 88
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;

    .line 89
    const-string v0, "HiH_UserInfoSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchUserGoalsInfos userGoalInfo is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 90
    invoke-direct {p0, v7}, Lo/ctk;->d(Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;)Lcom/huawei/hihealth/HiGoalInfo;

    move-result-object v5

    .line 91
    if-nez v5, :cond_2

    goto :goto_0

    .line 92
    :cond_2
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    goto :goto_0

    .line 94
    :cond_3
    return-object v4
.end method

.method public c(Ljava/util/Map;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Ljava/util/List<Lcom/huawei/hihealth/HiUserPreference;>;"
        }
    .end annotation

    .line 145
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 146
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 149
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map$Entry;

    .line 150
    new-instance v4, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 151
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 152
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 153
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserPreference;->setSyncStatus(I)V

    .line 154
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    goto :goto_0

    .line 156
    :cond_2
    return-object v1
.end method

.method public d(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;)Ljava/util/List<Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;>;"
        }
    .end annotation

    .line 119
    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 122
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 124
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiGoalInfo;

    .line 125
    invoke-direct {p0, v7}, Lo/ctk;->a(Lcom/huawei/hihealth/HiGoalInfo;)Lcom/huawei/hwcloudmodel/model/userprofile/UserGoalsInfo;

    move-result-object v5

    .line 126
    const-string v0, "HiH_UserInfoSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchHiGoalInfos userGoalInfo is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    if-nez v5, :cond_2

    goto :goto_0

    .line 128
    :cond_2
    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    goto :goto_0

    .line 130
    :cond_3
    return-object v4
.end method

.method public e(Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 6

    .line 44
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 45
    :cond_0
    new-instance v4, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 46
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getBirthday()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 47
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getBirthday()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setBirthday(I)V

    .line 49
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setEmail(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getGender()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 51
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getGender()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setGender(I)V

    .line 53
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getHeight()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHeight(I)V

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getMobile()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setMobile(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setName(Ljava/lang/String;)V

    .line 56
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHeadImgUrl(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getWeight()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 58
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getUnitType()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiUserInfo;->setUnitType(I)V

    .line 59
    invoke-virtual {p1}, Lcom/huawei/hwcloudmodel/model/userprofile/UserBasicInfo;->getModifyTime()Ljava/lang/Long;

    move-result-object v5

    .line 60
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    .line 61
    :cond_3
    const-string v0, "HiH_UserInfoSwitch"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "switchUserBasicInfo old cloud modifyTime , it is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    .line 64
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 65
    return-object v4
.end method
