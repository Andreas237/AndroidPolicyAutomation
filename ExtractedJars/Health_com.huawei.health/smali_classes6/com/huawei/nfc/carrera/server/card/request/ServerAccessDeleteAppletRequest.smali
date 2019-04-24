.class public Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;
.super Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;
.source "SourceFile"


# static fields
.field public static final ADD_CARD_CONFLICT:Ljava/lang/String; = "3"

.field public static final ADD_CARD_FAIL_NO_UNFINISH_ORDER:Ljava/lang/String; = "6"

.field public static final ADD_CARD_FAIL_REFUND:Ljava/lang/String; = "8"

.field public static final ADD_CARD_PAY_FAIL_OR_CANCEL:Ljava/lang/String; = "4"

.field public static final CHIP_NEED_CLEAN:Ljava/lang/String; = "7"

.field public static final PRE_LOAD_CLEAN:Ljava/lang/String; = "5"

.field public static final REASON_LOST_CARD:Ljava/lang/String; = ""

.field public static final REASON_OPEN_CARD_FAIL:Ljava/lang/String; = ""

.field public static final REASON_REPAIRE_CARD:Ljava/lang/String; = ""

.field public static final SERVER_DELETE:Ljava/lang/String; = "2"

.field public static final TA_NO_RECORD:Ljava/lang/String; = "9"

.field public static final THIRD_DELETE:Ljava/lang/String; = "13"

.field public static final USER_DELETE:Ljava/lang/String; = "1"

.field public static final VIRTUAL_CARD_CANCEL:Ljava/lang/String; = "11"

.field public static final VIRTUAL_CARD_RECEIVE_PUSH_CLEAN:Ljava/lang/String; = "12"

.field public static final VIRTUAL_CARD_RETRY_DELETE_APPLET:Ljava/lang/String; = "10"


# instance fields
.field private appCode:Ljava/lang/String;

.field private cardBalance:Ljava/lang/String;

.field private flag:Ljava/lang/String;

.field private onlyDeleteApplet:Ljava/lang/String;

.field private orderNo:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private reason:Ljava/lang/String;

.field private refundAccountNumber:Ljava/lang/String;

.field private refundAccountType:Ljava/lang/String;

.field private refundTicketId:Ljava/lang/String;

.field private source:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 161
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessBaseRequest;-><init>()V

    .line 101
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->refundTicketId:Ljava/lang/String;

    .line 106
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->reason:Ljava/lang/String;

    .line 162
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setIssuerId(Ljava/lang/String;)V

    .line 163
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setCplc(Ljava/lang/String;)V

    .line 164
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setAppletAid(Ljava/lang/String;)V

    .line 165
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 166
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 167
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 194
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCardBalance()Ljava/lang/String;
    .locals 1

    .line 223
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->cardBalance:Ljava/lang/String;

    return-object v0
.end method

.method public getFlag()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->flag:Ljava/lang/String;

    return-object v0
.end method

.method public getOnlyDeleteApplet()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->onlyDeleteApplet:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getOrderNo()Ljava/lang/String;
    .locals 1

    .line 151
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->orderNo:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 202
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getReason()Ljava/lang/String;
    .locals 1

    .line 181
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->reason:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRefundAccountNumber()Ljava/lang/String;
    .locals 1

    .line 237
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->refundAccountNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getRefundAccountType()Ljava/lang/String;
    .locals 1

    .line 227
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->refundAccountType:Ljava/lang/String;

    return-object v0
.end method

.method public getRefundTicketId()Ljava/lang/String;
    .locals 1

    .line 171
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->refundTicketId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSource()Ljava/lang/String;
    .locals 1

    .line 206
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->source:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 190
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->appCode:Ljava/lang/String;

    .line 191
    return-void
.end method

.method public setCardBalance(Ljava/lang/String;)V
    .locals 0

    .line 221
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->cardBalance:Ljava/lang/String;

    return-void
.end method

.method public setFlag(Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->flag:Ljava/lang/String;

    .line 147
    return-void
.end method

.method public setOnlyDeleteApplet(Ljava/lang/String;)V
    .locals 1

    .line 218
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->onlyDeleteApplet:Ljava/lang/String;

    .line 219
    return-void
.end method

.method public setOrderNo(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->orderNo:Ljava/lang/String;

    .line 157
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 198
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->partnerId:Ljava/lang/String;

    .line 199
    return-void
.end method

.method public setReason(Ljava/lang/String;)V
    .locals 1

    .line 186
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->reason:Ljava/lang/String;

    .line 187
    return-void
.end method

.method public setRefundAccountNumber(Ljava/lang/String;)V
    .locals 0

    .line 242
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->refundAccountNumber:Ljava/lang/String;

    .line 243
    return-void
.end method

.method public setRefundAccountType(Ljava/lang/String;)V
    .locals 0

    .line 232
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->refundAccountType:Ljava/lang/String;

    .line 233
    return-void
.end method

.method public setRefundTicketId(Ljava/lang/String;)V
    .locals 1

    .line 176
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->refundTicketId:Ljava/lang/String;

    .line 177
    return-void
.end method

.method public setSource(Ljava/lang/String;)V
    .locals 1

    .line 210
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/server/card/request/ServerAccessDeleteAppletRequest;->source:Ljava/lang/String;

    .line 211
    return-void
.end method
