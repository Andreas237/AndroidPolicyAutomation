.class public Lcom/huawei/health/sns/server/group/GetGroupNotifyListRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/getGrpNotifyList"


# instance fields
.field public maxNum_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 36
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 37
    const-string v0, "/getGrpNotifyList"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListRequest;->method:Ljava/lang/String;

    .line 38
    const-string v0, "IGroup"

    iput-object v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListRequest;->module:Ljava/lang/String;

    .line 39
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 44
    new-instance v0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/group/GetGroupNotifyListResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 1

    .line 50
    const-string v0, "GetGroupNotifyListRequest"

    .line 51
    return-object v0
.end method

.method public getMaxNum_()I
    .locals 1

    .line 23
    iget v0, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListRequest;->maxNum_:I

    return v0
.end method

.method public setMaxNum_(I)V
    .locals 0

    .line 27
    iput p1, p0, Lcom/huawei/health/sns/server/group/GetGroupNotifyListRequest;->maxNum_:I

    .line 28
    return-void
.end method
