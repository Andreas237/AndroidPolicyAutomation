.class public Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;
    }
.end annotation


# instance fields
.field private UpdatePushTokenRsp_:Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    return-void
.end method


# virtual methods
.method public getRespLog()Ljava/lang/String;
    .locals 3

    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UpdatePushTokenResponse, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-super {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;->getRespLog()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getUpdatePushTokenRsp()Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;
    .locals 1

    .line 26
    iget-object v0, p0, Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse;->UpdatePushTokenRsp_:Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;

    return-object v0
.end method

.method public setUpdatePushTokenRsp_(Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse;->UpdatePushTokenRsp_:Lcom/huawei/health/sns/server/push/UpdatePushTokenResponse$UpdatePushTokenRsp;

    .line 20
    return-void
.end method
