.class public Lo/bld;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    return-void
.end method


# virtual methods
.method public b(Lcom/huawei/health/sns/model/user/User;ILjava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 3

    .line 40
    new-instance v2, Lcom/huawei/health/sns/server/user/AddFriendRequest;

    invoke-direct {v2}, Lcom/huawei/health/sns/server/user/AddFriendRequest;-><init>()V

    .line 41
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getUserId()J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setFrdUID_(J)V

    .line 42
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getRemarkName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setRemarkName_(Ljava/lang/String;)V

    .line 45
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    invoke-virtual {v2, p3}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setVerifyNote_(Ljava/lang/String;)V

    .line 52
    :cond_0
    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->e:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    if-eq p2, v0, :cond_1

    sget-object v0, Lcom/huawei/health/sns/model/user/User$a;->b:Lcom/huawei/health/sns/model/user/User$a;

    invoke-virtual {v0}, Lcom/huawei/health/sns/model/user/User$a;->ordinal()I

    move-result v0

    if-ne p2, v0, :cond_2

    .line 54
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 56
    invoke-virtual {p1}, Lcom/huawei/health/sns/model/user/User;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setPhoneDigest_(Ljava/lang/String;)V

    .line 60
    :cond_2
    return-object v2
.end method

.method public d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;
    .locals 6

    .line 72
    instance-of v0, p1, Lcom/huawei/health/sns/model/user/UserNotify;

    if-eqz v0, :cond_1

    .line 74
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/model/user/UserNotify;

    .line 75
    new-instance v4, Lcom/huawei/health/sns/server/user/AddFriendRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/user/AddFriendRequest;-><init>()V

    .line 76
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getUserId()J

    move-result-wide v0

    invoke-virtual {v4, v0, v1}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setFrdUID_(J)V

    .line 77
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    invoke-virtual {v4, p2}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setVerifyNote_(Ljava/lang/String;)V

    .line 81
    :cond_0
    invoke-virtual {v3}, Lcom/huawei/health/sns/model/user/UserNotify;->getPhoneDigest()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setPhoneDigest_(Ljava/lang/String;)V

    .line 84
    invoke-static {v3}, Lcom/huawei/health/sns/server/user/Origin;->matchUserNotifyType(Lcom/huawei/health/sns/model/user/UserNotify;)[Lcom/huawei/health/sns/server/user/Origin;

    move-result-object v5

    .line 85
    const/4 v0, 0x0

    aget-object v0, v5, v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setFrdOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 86
    const/4 v0, 0x1

    aget-object v0, v5, v0

    invoke-virtual {v4, v0}, Lcom/huawei/health/sns/server/user/AddFriendRequest;->setMyOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V

    .line 87
    const-string v0, "AddFriendReq"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "NotifyButton frdOrigin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v2, v5, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",myOrigin:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const/4 v2, 0x1

    aget-object v2, v5, v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    return-object v4

    .line 92
    :cond_1
    const-string v0, "AddFriendReq"

    const-string v1, "getAddFriendRequest bean not instanceof UserNotify"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const/4 v0, 0x0

    return-object v0
.end method
