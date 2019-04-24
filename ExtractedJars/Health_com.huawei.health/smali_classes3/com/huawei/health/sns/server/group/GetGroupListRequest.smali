.class public Lcom/huawei/health/sns/server/group/GetGroupListRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/getUserGrpList"


# instance fields
.field private fromSeq_:I

.field private maxNum_:I

.field private newVersion_:Ljava/lang/String;

.field private oldVersion_:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 78
    const-string v0, "/getUserGrpList"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->method:Ljava/lang/String;

    .line 79
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->module:Ljava/lang/String;

    .line 80
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 93
    new-instance v0, Lcom/huawei/health/sns/server/group/GetGroupListResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/GetGroupListResponse;-><init>()V

    return-object v0
.end method

.method public getFromSeq_()I
    .locals 1

    .line 61
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->fromSeq_:I

    return v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 99
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    const-string v0, "GetGroupListRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getMaxNum_()I
    .locals 1

    .line 69
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->maxNum_:I

    return v0
.end method

.method public getNewVersion_()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->newVersion_:Ljava/lang/String;

    return-object v0
.end method

.method public getOldVersion_()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->oldVersion_:Ljava/lang/String;

    return-object v0
.end method

.method public setData(Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->oldVersion_:Ljava/lang/String;

    .line 85
    iput-object p2, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->newVersion_:Ljava/lang/String;

    .line 86
    iput p3, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->fromSeq_:I

    .line 87
    iput p4, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->maxNum_:I

    .line 88
    return-void
.end method

.method public setFromSeq_(I)V
    .locals 0

    .line 65
    iput p1, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->fromSeq_:I

    .line 66
    return-void
.end method

.method public setMaxNum_(I)V
    .locals 0

    .line 73
    iput p1, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->maxNum_:I

    .line 74
    return-void
.end method

.method public setNewVersion_(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->newVersion_:Ljava/lang/String;

    .line 58
    return-void
.end method

.method public setOldVersion_(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/huawei/health/sns/server/group/GetGroupListRequest;->oldVersion_:Ljava/lang/String;

    .line 50
    return-void
.end method
