.class public Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/replyAddFrd"

.field public static final REPLY_AGREE:I = 0x1

.field public static final REPLY_REVERIFY:I = 0x2


# instance fields
.field private ansNote_:Ljava/lang/String;

.field private frdUID_:J

.field private reply_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 59
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 60
    const-string v0, "/replyAddFrd"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->method:Ljava/lang/String;

    .line 61
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->module:Ljava/lang/String;

    .line 62
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 74
    new-instance v0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;-><init>()V

    return-object v0
.end method

.method public getAnsNote_()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->ansNote_:Ljava/lang/String;

    .line 39
    return-object v0
.end method

.method public getFrdUID_()J
    .locals 2

    .line 32
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->frdUID_:J

    .line 33
    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    const-string v0, "ReplyAddFriendRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getReply_()I
    .locals 1

    .line 49
    iget v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->reply_:I

    .line 50
    return v0
.end method

.method public setData(JILjava/lang/String;)V
    .locals 0

    .line 66
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->frdUID_:J

    .line 67
    iput p3, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->reply_:I

    .line 68
    iput-object p4, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;->ansNote_:Ljava/lang/String;

    .line 69
    return-void
.end method
