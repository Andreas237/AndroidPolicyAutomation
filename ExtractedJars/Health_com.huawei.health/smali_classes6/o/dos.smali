.class public Lo/dos;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/model/UserInfomation;)Z
    .locals 5

    .line 17
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 18
    :cond_0
    const-string v0, "UserInfomationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "diff arg null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 19
    const/4 v0, 0x1

    return v0

    .line 22
    :cond_1
    const/4 v4, 0x0

    .line 24
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 25
    const/4 v4, 0x1

    .line 28
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getLanguageCode()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getLanguageCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 29
    const/4 v4, 0x1

    .line 33
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getBirthdayStatus()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 34
    const/4 v4, 0x1

    .line 37
    :cond_4
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getBirthday()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 38
    const/4 v4, 0x1

    .line 41
    :cond_5
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getGender()I

    move-result v1

    if-eq v0, v1, :cond_6

    .line 42
    const/4 v4, 0x1

    .line 45
    :cond_6
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getPortraitUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 46
    const/4 v4, 0x1

    .line 49
    :cond_7
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v1

    if-eq v0, v1, :cond_8

    .line 50
    const/4 v4, 0x1

    .line 53
    :cond_8
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_9

    .line 54
    const/4 v4, 0x1

    .line 57
    :cond_9
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v1

    if-eq v0, v1, :cond_a

    .line 58
    const/4 v4, 0x1

    .line 61
    :cond_a
    return v4
.end method

.method public static c(Lcom/huawei/up/model/UserInfomation;Lcom/huawei/up/model/UserInfomation;)Z
    .locals 5

    .line 69
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 70
    :cond_0
    const-string v0, "UserInfomationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "diff arg null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const/4 v0, 0x1

    return v0

    .line 74
    :cond_1
    const/4 v4, 0x0

    .line 76
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getHeight()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 77
    const/4 v4, 0x1

    .line 80
    :cond_2
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getWeight()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    .line 81
    const/4 v4, 0x1

    .line 84
    :cond_3
    invoke-virtual {p1}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 85
    const/4 v4, 0x1

    .line 87
    :cond_4
    return v4
.end method

.method public static d(Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;
    .locals 6

    .line 92
    if-nez p0, :cond_0

    .line 93
    const-string v0, "UserInfomationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "transfer2METRIC arg null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    const/4 v0, 0x0

    return-object v0

    .line 97
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getClientSet()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 98
    const-string v0, "UserInfomationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNIT_TYPE_ENGLISH not stand"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const-string v0, "UserInfomationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UNIT_TYPE_ENGLISH need trans to UNIT_TYPE_METRIC"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getMetricHeight()I

    move-result v4

    .line 103
    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->getMetricWeight()F

    move-result v5

    .line 104
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setHeight(Ljava/lang/Integer;)V

    .line 105
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setWeight(Ljava/lang/Float;)V

    .line 106
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/huawei/up/model/UserInfomation;->setClientSet(Ljava/lang/Integer;)V

    .line 107
    const-string v0, "UserInfomationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " setUserInfo Entry,(UNIT_TYPE_METRIC) user="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/huawei/up/model/UserInfomation;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    :cond_1
    return-object p0
.end method

.method public static e(Ljava/lang/Object;Lcom/huawei/up/model/UserInfomation;)Lcom/huawei/up/model/UserInfomation;
    .locals 7

    .line 117
    if-nez p0, :cond_0

    .line 118
    const-string v0, "UserInfomationUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " getUserInfoSafe lock is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 119
    new-instance v0, Lcom/huawei/up/model/UserInfomation;

    invoke-direct {v0}, Lcom/huawei/up/model/UserInfomation;-><init>()V

    return-object v0

    .line 122
    :cond_0
    move-object v5, p0

    monitor-enter v5

    .line 123
    move-object v4, p1

    .line 124
    monitor-exit v5

    nop

    .line 125
    return-object v4
.end method
