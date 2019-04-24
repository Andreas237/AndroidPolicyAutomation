.class public Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;
    }
.end annotation


# static fields
.field public static final ALREAD_FRIEND:I = 0x5

.field public static final INVITATION_EXPIRED:I = 0x1

.field public static final OVER_FRIEND_MAX_NUM:I = 0x3

.field public static final REPLY_OVER_LIMIT_TIMES:I = 0x2

.field public static final SUCC:I = 0x0

.field public static final THE_OTHER_OVER_FRIEND_MAX_NUM:I = 0x4


# instance fields
.field public ReplyAddFrdRsp_:Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getReplyAddFrdRsp_()Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;
    .locals 1

    .line 44
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;->ReplyAddFrdRsp_:Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 72
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    const-string v0, "ReplyAddFriendResponse"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;->ReplyAddFrdRsp_:Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;

    if-eqz v0, :cond_0

    .line 76
    const-string v0, ", r:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;->ReplyAddFrdRsp_:Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;

    iget v0, v0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;->result_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    const-string v0, ", s:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;->ReplyAddFrdRsp_:Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;

    iget-object v0, v0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;->sendTime_:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 83
    :cond_0
    const-string v0, " null"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    :goto_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setReplyAddFrdRsp_(Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse;->ReplyAddFrdRsp_:Lcom/huawei/health/sns/server/user/ReplyAddFriendResponse$ReplyAddFrdRsp;

    .line 49
    return-void
.end method
