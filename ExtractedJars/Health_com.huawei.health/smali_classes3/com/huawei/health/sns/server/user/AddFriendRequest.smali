.class public Lcom/huawei/health/sns/server/user/AddFriendRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/addFriend"


# instance fields
.field private frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

.field private frdUID_:J

.field private myOrigin_:Lcom/huawei/health/sns/server/user/Origin;

.field private phoneDigest_:Ljava/lang/String;

.field private remarkName_:Ljava/lang/String;

.field private verifyNote_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 47
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 48
    const-string v0, "/addFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->method:Ljava/lang/String;

    .line 49
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->module:Ljava/lang/String;

    .line 50
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 97
    new-instance v0, Lcom/huawei/health/sns/server/user/AddFriendResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/AddFriendResponse;-><init>()V

    return-object v0
.end method

.method public getFrdUID_()J
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->frdUID_:J

    .line 55
    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 104
    const-string v0, "AddFriendRequest fo:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 106
    const-string v0, ", mo:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->myOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getVerifyNote_()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->verifyNote_:Ljava/lang/String;

    .line 61
    return-object v0
.end method

.method public setFrdOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    .line 87
    return-void
.end method

.method public setFrdUID_(J)V
    .locals 0

    .line 66
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->frdUID_:J

    .line 67
    return-void
.end method

.method public setMyOrigin_(Lcom/huawei/health/sns/server/user/Origin;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->myOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    .line 92
    return-void
.end method

.method public setPhoneDigest_(Ljava/lang/String;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->phoneDigest_:Ljava/lang/String;

    .line 82
    return-void
.end method

.method public setRemarkName_(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->remarkName_:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setVerifyNote_(Ljava/lang/String;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->verifyNote_:Ljava/lang/String;

    .line 77
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AddFriendRequest{frdUID_="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->frdUID_:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", remarkName_=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->remarkName_:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", verifyNote_=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->verifyNote_:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", phoneDigest_=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->phoneDigest_:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", frdOrigin_="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->frdOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", myOrigin_="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/user/AddFriendRequest;->myOrigin_:Lcom/huawei/health/sns/server/user/Origin;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
