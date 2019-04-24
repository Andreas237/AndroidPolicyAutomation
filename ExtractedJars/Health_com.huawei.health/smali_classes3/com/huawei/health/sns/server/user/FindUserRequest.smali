.class public Lcom/huawei/health/sns/server/user/FindUserRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/findUser"

.field public static final FIND_TYPE_EMAIL:I = 0x1

.field public static final FIND_TYPE_PHONE:I = 0x0


# instance fields
.field private acctType_:I

.field private findContent_:Ljava/lang/String;

.field private findType_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 64
    const-string v0, "/findUser"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->method:Ljava/lang/String;

    .line 65
    const-string v0, "ISNS"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->module:Ljava/lang/String;

    .line 66
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->acctType_:I

    .line 67
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 79
    new-instance v0, Lcom/huawei/health/sns/server/user/FindUserResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/FindUserResponse;-><init>()V

    return-object v0
.end method

.method public getAcctType_()I
    .locals 1

    .line 47
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->acctType_:I

    return v0
.end method

.method public getFindContent_()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->findContent_:Ljava/lang/String;

    return-object v0
.end method

.method public getFindType_()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->findType_:I

    return v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 86
    const-string v0, "FindUserRequest ft:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->findType_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    const-string v0, ", at:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    iget v0, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->acctType_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setAcctType_(I)V
    .locals 0

    .line 51
    iput p1, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->acctType_:I

    .line 52
    return-void
.end method

.method public setData(ILjava/lang/String;I)V
    .locals 0

    .line 71
    iput p1, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->findType_:I

    .line 72
    iput-object p2, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->findContent_:Ljava/lang/String;

    .line 73
    iput p3, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->acctType_:I

    .line 74
    return-void
.end method

.method public setFindContent_(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->findContent_:Ljava/lang/String;

    .line 44
    return-void
.end method

.method public setFindType_(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/huawei/health/sns/server/user/FindUserRequest;->findType_:I

    .line 36
    return-void
.end method
