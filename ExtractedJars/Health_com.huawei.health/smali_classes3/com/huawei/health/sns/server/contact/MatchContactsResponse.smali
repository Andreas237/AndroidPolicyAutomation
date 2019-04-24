.class public Lcom/huawei/health/sns/server/contact/MatchContactsResponse;
.super Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/health/sns/server/contact/MatchContactsResponse$ContactInfo;,
        Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;
    }
.end annotation


# instance fields
.field private MatchContactsRsp_:Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSResponseBean;-><init>()V

    .line 20
    new-instance v0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;

    invoke-direct {v0}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;-><init>()V

    iput-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;->MatchContactsRsp_:Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;

    return-void
.end method


# virtual methods
.method public getMatchContactsRsp_()Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;->MatchContactsRsp_:Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;

    return-object v0
.end method

.method public getRespLog()Ljava/lang/String;
    .locals 2

    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    const-string v0, "MatchContactsResponse, size: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    iget-object v0, p0, Lcom/huawei/health/sns/server/contact/MatchContactsResponse;->MatchContactsRsp_:Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/contact/MatchContactsResponse$MatchContactsRsp;->getContactInfoList_()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 145
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
