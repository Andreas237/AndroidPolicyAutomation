.class public Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse$DelFrdNotifyListRsp;
    }
.end annotation


# instance fields
.field public DelFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse$DelFrdNotifyListRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getDelFrdNotifyListRsp_()Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse$DelFrdNotifyListRsp;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse;->DelFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse$DelFrdNotifyListRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeleteUserNotifyListResponse "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public setDelFrdNotifyListRsp_(Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse$DelFrdNotifyListRsp;)V
    .locals 0

    .line 25
    iput-object p1, p0, Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse;->DelFrdNotifyListRsp_:Lcom/huawei/health/sns/server/user/DeleteUserNotifyListResponse$DelFrdNotifyListRsp;

    .line 26
    return-void
.end method
