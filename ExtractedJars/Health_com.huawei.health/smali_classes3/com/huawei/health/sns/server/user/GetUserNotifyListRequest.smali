.class public Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;
.super Lcom/huawei/health/sns/server/SNSRequestBean;
.source "SourceFile"


# static fields
.field public static final APIMETHOD:Ljava/lang/String; = "/getFrdNotifyList"


# instance fields
.field public maxNum_:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 23
    invoke-direct {p0}, Lcom/huawei/health/sns/server/SNSRequestBean;-><init>()V

    .line 24
    const-string v0, "/getFrdNotifyList"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;->method:Ljava/lang/String;

    .line 25
    const-string v0, "IFriend"

    iput-object v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;->module:Ljava/lang/String;

    .line 26
    return-void
.end method


# virtual methods
.method public createResponse()Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;
    .locals 1

    .line 31
    new-instance v0, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/user/GetUserNotifyListResponse;-><init>()V

    return-object v0
.end method

.method public getLog()Ljava/lang/String;
    .locals 2

    .line 37
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    const-string v0, "GetUserNotifyListRequest maxNum:"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    iget v0, p0, Lcom/huawei/health/sns/server/user/GetUserNotifyListRequest;->maxNum_:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
