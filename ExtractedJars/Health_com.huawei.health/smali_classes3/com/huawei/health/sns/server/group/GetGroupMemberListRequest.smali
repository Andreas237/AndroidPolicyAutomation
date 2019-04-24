.class public Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/getGrpMemberList"


# instance fields
.field private fromSeq_:I

.field private grpID_:J

.field private maxNum_:I

.field private newVersion_:Ljava/lang/String;

.field private oldVersion_:Ljava/lang/String;


# direct methods
.method public constructor <init>(JI)V
    .locals 1

    .line 91
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 92
    const-string v0, "/getGrpMemberList"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->method:Ljava/lang/String;

    .line 93
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->module:Ljava/lang/String;

    .line 94
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->grpID_:J

    .line 95
    iput p3, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->maxNum_:I

    .line 96
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 108
    new-instance v0, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/GetGroupMemberListResponse;-><init>()V

    return-object v0
.end method

.method public getFromSeq_()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->fromSeq_:I

    return v0
.end method

.method public getGrpID_()J
    .locals 2

    .line 83
    iget-wide v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->grpID_:J

    return-wide v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 114
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 115
    const-string v0, "GetGroupMemberListRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMaxNum_()I
    .locals 1

    .line 75
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->maxNum_:I

    return v0
.end method

.method public getNewVersion_()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->newVersion_:Ljava/lang/String;

    return-object v0
.end method

.method public getOldVersion_()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->oldVersion_:Ljava/lang/String;

    return-object v0
.end method

.method public setData(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->oldVersion_:Ljava/lang/String;

    .line 101
    iput-object p2, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->newVersion_:Ljava/lang/String;

    .line 102
    iput p3, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->fromSeq_:I

    .line 103
    return-void
.end method

.method public setFromSeq_(I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->fromSeq_:I

    .line 72
    return-void
.end method

.method public setGrpID_(J)V
    .locals 0

    .line 87
    iput-wide p1, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->grpID_:J

    .line 88
    return-void
.end method

.method public setMaxNum_(I)V
    .locals 0

    .line 79
    iput p1, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->maxNum_:I

    .line 80
    return-void
.end method

.method public setNewVersion_(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->newVersion_:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setOldVersion_(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/GetGroupMemberListRequest;->oldVersion_:Ljava/lang/String;

    .line 56
    return-void
.end method
