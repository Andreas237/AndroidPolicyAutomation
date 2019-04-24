.class public Lcom/huawei/hihealthservice/old/dataswitch/UserDataToHiUserData;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public switchAccountInfo(Lcom/huawei/hihealthservice/old/model/AccountInfo;I)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 3

    .line 19
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 20
    const/4 v0, 0x0

    return-object v0

    .line 22
    :cond_0
    new-instance v2, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiAccountInfo;-><init>()V

    .line 23
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserID()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setHuid(Ljava/lang/String;)V

    .line 24
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 25
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getAccessToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setAccessToken(Ljava/lang/String;)V

    .line 26
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getServiceToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setServiceToken(Ljava/lang/String;)V

    .line 27
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getThirdOpenId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setThirdOpenId(Ljava/lang/String;)V

    .line 28
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getExpiresIn()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiAccountInfo;->setExpiresIn(J)V

    .line 29
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getUserName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setUserName(Ljava/lang/String;)V

    .line 30
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getSiteId()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setSiteId(I)V

    .line 31
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setType(I)V

    .line 32
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/AccountInfo;->getThirdToken()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setThirdToken(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v2, p2}, Lcom/huawei/hihealth/HiAccountInfo;->setAppId(I)V

    .line 34
    return-object v2
.end method

.method public switchStepGoal(II)Lcom/huawei/hihealth/HiGoalInfo;
    .locals 3

    .line 64
    new-instance v2, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiGoalInfo;-><init>()V

    .line 65
    const/4 v0, 0x2

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalType(I)V

    .line 66
    int-to-double v0, p1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalValue(D)V

    .line 67
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalUnit(I)V

    .line 68
    invoke-virtual {v2, p2}, Lcom/huawei/hihealth/HiGoalInfo;->setOwnerId(I)V

    .line 69
    return-object v2
.end method

.method public switchWeightGoal(FI)Lcom/huawei/hihealth/HiGoalInfo;
    .locals 3

    .line 73
    new-instance v2, Lcom/huawei/hihealth/HiGoalInfo;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiGoalInfo;-><init>()V

    .line 74
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalType(I)V

    .line 75
    float-to-double v0, p1

    invoke-virtual {v2, v0, v1}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalValue(D)V

    .line 76
    const/16 v0, 0x9

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiGoalInfo;->setGoalUnit(I)V

    .line 77
    invoke-virtual {v2, p2}, Lcom/huawei/hihealth/HiGoalInfo;->setOwnerId(I)V

    .line 78
    return-object v2
.end method

.method public swtichUserInfo(Lcom/huawei/hihealthservice/old/model/UserInfo;JLjava/lang/String;)Lcom/huawei/hihealth/HiUserInfo;
    .locals 3

    .line 38
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 39
    const/4 v0, 0x0

    return-object v0

    .line 42
    :cond_0
    new-instance v2, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 43
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-gtz v0, :cond_1

    .line 44
    invoke-virtual {v2, p4}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    goto :goto_0

    .line 46
    :cond_1
    invoke-static {p2, p3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 48
    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setOwerID(I)V

    .line 49
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setRelateType(I)V

    .line 50
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getBirthday()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setBirthday(I)V

    .line 51
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getEmail()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setEmail(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getGender()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setGender(I)V

    .line 54
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getHeadImgUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHeadImgUrl(Ljava/lang/String;)V

    .line 55
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getHeight()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHeight(I)V

    .line 56
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getMobile()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setMobile(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getWeight()F

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setWeight(F)V

    .line 58
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setName(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p1}, Lcom/huawei/hihealthservice/old/model/UserInfo;->getUnitType()I

    move-result v0

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserInfo;->setUnitType(I)V

    .line 60
    return-object v2
.end method
