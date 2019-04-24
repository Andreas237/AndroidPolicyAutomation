.class public Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/getOtherUserInfo"

.field public static final SRCTYPE_FRIEND:I = 0x0

.field public static final SRCTYPE_GROUP_MEMBER:I = 0x2

.field public static final SRCTYPE_INVITE_TO_JOIN_GROUP:I = 0x3

.field public static final SRCTYPE_PETITION:I = 0x1

.field public static final SRCTYPE_STRANGER:I = 0x4


# instance fields
.field private dstUserID_:J

.field private grpID_:J

.field private srcType_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->srcType_:I

    .line 78
    const-string v0, "/getOtherUserInfo"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->method:Ljava/lang/String;

    .line 79
    const-string v0, "ISNS"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->module:Ljava/lang/String;

    .line 80
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 92
    new-instance v0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetOtherUserInfoResponse;-><init>()V

    return-object v0
.end method

.method public getDstUserID_()J
    .locals 2

    .line 54
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->dstUserID_:J

    .line 55
    return-wide v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 69
    iget-wide v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->grpID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    const-string v0, "GetOtherUserInfoRequest st:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->srcType_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setData(JIJ)V
    .locals 0

    .line 84
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->dstUserID_:J

    .line 85
    iput p3, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->srcType_:I

    .line 86
    iput-wide p4, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->grpID_:J

    .line 87
    return-void
.end method

.method public setDstUserID_(J)V
    .locals 0

    .line 49
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->dstUserID_:J

    .line 50
    return-void
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 73
    iput-wide p1, p0, Lcom/huawei/health/sns/server/user/GetOtherUserInfoRequest;->grpID_:J

    .line 74
    return-void
.end method
