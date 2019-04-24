.class public final Lo/axe;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(J)V
    .locals 3

    .line 70
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 71
    if-eqz v2, :cond_0

    .line 73
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/model/user/User;->setState(I)V

    .line 74
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/axa;->a(Lcom/huawei/health/sns/model/user/User;)Z

    .line 75
    const-string v0, "UserManagerUtils"

    const-string v1, "setStateNormal"

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 77
    :cond_0
    return-void
.end method

.method public static c(JI)V
    .locals 4

    .line 49
    invoke-static {p2}, Lcom/huawei/health/sns/model/user/User;->isRelationOK(I)Z

    move-result v0

    if-nez v0, :cond_0

    .line 52
    return-void

    .line 55
    :cond_0
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 56
    if-eqz v3, :cond_1

    .line 58
    invoke-virtual {v3, p2}, Lcom/huawei/health/sns/model/user/User;->setRelation(I)V

    .line 59
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/axa;->a(Lcom/huawei/health/sns/model/user/User;)Z

    .line 60
    const-string v0, "UserManagerUtils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "set relation="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :cond_1
    return-void
.end method

.method public static c(JLjava/lang/String;)Z
    .locals 5

    .line 87
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 89
    const-string v0, "UserManagerUtils"

    const-string v1, "updateOldImageUrl imageUrl is null."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    :cond_0
    const/4 v2, 0x1

    .line 94
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v3

    .line 95
    if-eqz v3, :cond_1

    .line 97
    invoke-virtual {v3, p2}, Lcom/huawei/health/sns/model/user/User;->setOldImageUrl(Ljava/lang/String;)V

    .line 98
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v3}, Lo/axa;->a(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v2

    .line 99
    if-nez v2, :cond_1

    .line 101
    const-string v0, "UserManagerUtils"

    const-string v1, "updateOldImageUrl failed."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    :cond_1
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axi;->c(J)Lcom/huawei/health/sns/model/user/UserNotify;

    move-result-object v4

    .line 105
    if-eqz v4, :cond_2

    .line 107
    invoke-virtual {v4, p2, p2, v3}, Lcom/huawei/health/sns/model/user/UserNotify;->updateOldImageUrl(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/health/sns/model/user/User;)V

    .line 108
    invoke-static {}, Lo/axi;->d()Lo/axi;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/axi;->e(Lcom/huawei/health/sns/model/user/UserNotify;)Z

    move-result v2

    .line 110
    :cond_2
    return v2
.end method

.method public static c(Lcom/huawei/health/sns/model/user/User;)Z
    .locals 1

    .line 169
    if-eqz p0, :cond_2

    .line 171
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->isAssistant()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 173
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->isAlreadyFriend()Z

    move-result v0

    return v0

    .line 177
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/health/sns/model/user/User;->getRelation()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 180
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static d(J)Z
    .locals 3

    .line 138
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 139
    if-eqz v2, :cond_1

    .line 141
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->getIsFriend()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 144
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d(JLjava/lang/String;)Z
    .locals 3

    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    .line 30
    if-eqz v2, :cond_0

    .line 32
    invoke-virtual {v2, p2}, Lcom/huawei/health/sns/model/user/User;->setRemarkName(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->buildSortPinYin()V

    .line 34
    invoke-virtual {v2}, Lcom/huawei/health/sns/model/user/User;->buildSearchPinyin()V

    .line 35
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, v2}, Lo/axa;->a(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v1

    .line 37
    :cond_0
    return v1
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 121
    move-object v1, p0

    .line 122
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 124
    move-object v1, p1

    .line 126
    :cond_0
    return-object v1
.end method

.method public static e(J)Z
    .locals 2

    .line 156
    invoke-static {}, Lo/axa;->a()Lo/axa;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Lo/axa;->a(J)Lcom/huawei/health/sns/model/user/User;

    move-result-object v1

    .line 157
    invoke-static {v1}, Lo/axe;->c(Lcom/huawei/health/sns/model/user/User;)Z

    move-result v0

    return v0
.end method
