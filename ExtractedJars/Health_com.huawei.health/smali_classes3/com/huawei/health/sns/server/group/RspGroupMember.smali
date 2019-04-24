.class public Lcom/huawei/health/sns/server/group/RspGroupMember;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;
.source "SourceFile"


# instance fields
.field private imageURLDownload_:Ljava/lang/String;

.field private imageURL_:Ljava/lang/String;

.field private joinTime_:Ljava/lang/String;

.field private mbNickName_:Ljava/lang/String;

.field private mbUID_:J

.field private siteID_:I

.field private state_:I

.field private userNickname_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/JsonBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getImageURLDownload_()Ljava/lang/String;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/RspGroupMember;->imageURLDownload_:Ljava/lang/String;

    .line 70
    return-object v0
.end method

.method public getImageURL_()Ljava/lang/String;
    .locals 1

    .line 63
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/RspGroupMember;->imageURL_:Ljava/lang/String;

    .line 64
    return-object v0
.end method

.method public getJoinTime_()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/RspGroupMember;->joinTime_:Ljava/lang/String;

    .line 88
    return-object v0
.end method

.method public getMbNickName_()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/RspGroupMember;->mbNickName_:Ljava/lang/String;

    .line 82
    return-object v0
.end method

.method public getMbUID_()J
    .locals 2

    .line 57
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/RspGroupMember;->mbUID_:J

    .line 58
    return-wide v0
.end method

.method public getSiteID_()I
    .locals 1

    .line 99
    iget v0, p0, Lcom/huawei/health/sns/server/group/RspGroupMember;->siteID_:I

    .line 100
    return v0
.end method

.method public getState_()I
    .locals 1

    .line 93
    iget v0, p0, Lcom/huawei/health/sns/server/group/RspGroupMember;->state_:I

    .line 94
    return v0
.end method

.method public getUserNickName_()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/RspGroupMember;->userNickname_:Ljava/lang/String;

    .line 76
    return-object v0
.end method
