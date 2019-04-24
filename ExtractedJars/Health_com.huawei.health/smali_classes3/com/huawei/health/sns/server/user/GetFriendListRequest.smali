.class public Lcom/huawei/health/sns/server/user/GetFriendListRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/getUserFrdInfoList"


# instance fields
.field private fromSeq_:I

.field private maxNum_:I

.field private newVersion_:Ljava/lang/String;

.field private oldVersion_:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 44
    const-string v0, "/getUserFrdInfoList"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->method:Ljava/lang/String;

    .line 45
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->module:Ljava/lang/String;

    .line 46
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->oldVersion_:Ljava/lang/String;

    .line 47
    iput p2, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->maxNum_:I

    .line 48
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 59
    new-instance v0, Lcom/huawei/health/sns/server/user/GetFriendListResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetFriendListResponse;-><init>()V

    return-object v0
.end method

.method public getFromSeq_()I
    .locals 1

    .line 33
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->fromSeq_:I

    .line 34
    return v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 65
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    const-string v0, "GetFriendListRequest"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setNextReqData(Ljava/lang/String;I)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->newVersion_:Ljava/lang/String;

    .line 53
    iput p2, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->fromSeq_:I

    .line 54
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 73
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GetFriendListRequest{oldVersion_=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->oldVersion_:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", newVersion_=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->newVersion_:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", fromSeq_="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->fromSeq_:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxNum_="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/sns/server/user/GetFriendListRequest;->maxNum_:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
