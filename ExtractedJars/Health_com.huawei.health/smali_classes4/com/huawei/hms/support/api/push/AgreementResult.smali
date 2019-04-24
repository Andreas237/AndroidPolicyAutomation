.class public Lcom/huawei/hms/support/api/push/AgreementResult;
.super Lcom/huawei/hms/support/api/client/Result;
.source "SourceFile"


# instance fields
.field protected resp:Lcom/huawei/hms/support/api/entity/push/AgreementResp;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/huawei/hms/support/api/client/Result;-><init>()V

    return-void
.end method


# virtual methods
.method public getAgreementRes()Lcom/huawei/hms/support/api/entity/push/AgreementResp;
    .locals 1

    .line 50
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/AgreementResult;->resp:Lcom/huawei/hms/support/api/entity/push/AgreementResp;

    return-object v0
.end method

.method public isAgree()Z
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/AgreementResult;->resp:Lcom/huawei/hms/support/api/entity/push/AgreementResp;

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lcom/huawei/hms/support/api/push/AgreementResult;->resp:Lcom/huawei/hms/support/api/entity/push/AgreementResp;

    invoke-virtual {v0}, Lcom/huawei/hms/support/api/entity/push/AgreementResp;->isAgree()Z

    move-result v0

    return v0

    .line 65
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setAgreementRes(Lcom/huawei/hms/support/api/entity/push/AgreementResp;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/huawei/hms/support/api/push/AgreementResult;->resp:Lcom/huawei/hms/support/api/entity/push/AgreementResp;

    .line 42
    return-void
.end method
