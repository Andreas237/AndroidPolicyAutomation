.class public Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;
.super Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;
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

.field private onlyDeleteApplet:Z

.field private orderNo:Ljava/lang/String;

.field private partnerId:Ljava/lang/String;

.field private reason:Ljava/lang/String;

.field private refundAccountNumber:Ljava/lang/String;

.field private refundAccountType:Ljava/lang/String;

.field private refundTicketId:Ljava/lang/String;

.field private source:Ljava/lang/String;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 167
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/BaseRequest;-><init>()V

    .line 100
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->refundTicketId:Ljava/lang/String;

    .line 105
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->reason:Ljava/lang/String;

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->type:Ljava/lang/String;

    .line 122
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->source:Ljava/lang/String;

    .line 168
    invoke-virtual {p0, p1}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setIssuerId(Ljava/lang/String;)V

    .line 169
    invoke-virtual {p0, p2}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setCplc(Ljava/lang/String;)V

    .line 170
    invoke-virtual {p0, p3}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setAppletAid(Ljava/lang/String;)V

    .line 171
    invoke-virtual {p0, p4}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setDeviceModel(Ljava/lang/String;)V

    .line 172
    invoke-virtual {p0, p5}, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->setSeChipManuFacturer(Ljava/lang/String;)V

    .line 173
    return-void
.end method


# virtual methods
.method public getAppCode()Ljava/lang/String;
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->appCode:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getCardBalance()Ljava/lang/String;
    .locals 1

    .line 242
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->cardBalance:Ljava/lang/String;

    return-object v0
.end method

.method public getFlag()Ljava/lang/String;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->flag:Ljava/lang/String;

    return-object v0
.end method

.method public getOrderNo()Ljava/lang/String;
    .locals 1

    .line 156
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->orderNo:Ljava/lang/String;

    return-object v0
.end method

.method public getPartnerId()Ljava/lang/String;
    .locals 1

    .line 205
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->partnerId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getReason()Ljava/lang/String;
    .locals 1

    .line 187
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->reason:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getRefundAccountNumber()Ljava/lang/String;
    .locals 1

    .line 256
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->refundAccountNumber:Ljava/lang/String;

    return-object v0
.end method

.method public getRefundAccountType()Ljava/lang/String;
    .locals 1

    .line 246
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->refundAccountType:Ljava/lang/String;

    return-object v0
.end method

.method public getRefundTicketId()Ljava/lang/String;
    .locals 1

    .line 177
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->refundTicketId:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getSource()Ljava/lang/String;
    .locals 1

    .line 224
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->source:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 214
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->type:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public isOnlyDeleteApplet()Z
    .locals 1

    .line 233
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->onlyDeleteApplet:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public setAppCode(Ljava/lang/String;)V
    .locals 1

    .line 201
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->appCode:Ljava/lang/String;

    .line 202
    return-void
.end method

.method public setCardBalance(Ljava/lang/String;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->cardBalance:Ljava/lang/String;

    return-void
.end method

.method public setFlag(Ljava/lang/String;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->flag:Ljava/lang/String;

    .line 152
    return-void
.end method

.method public setOnlyDeleteApplet(Z)V
    .locals 1

    .line 237
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->onlyDeleteApplet:Z

    .line 238
    return-void
.end method

.method public setOrderNo(Ljava/lang/String;)V
    .locals 0

    .line 161
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->orderNo:Ljava/lang/String;

    .line 162
    return-void
.end method

.method public setPartnerId(Ljava/lang/String;)V
    .locals 1

    .line 209
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->partnerId:Ljava/lang/String;

    .line 210
    return-void
.end method

.method public setReason(Ljava/lang/String;)V
    .locals 1

    .line 192
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->reason:Ljava/lang/String;

    .line 193
    return-void
.end method

.method public setRefundAccountNumber(Ljava/lang/String;)V
    .locals 0

    .line 261
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->refundAccountNumber:Ljava/lang/String;

    .line 262
    return-void
.end method

.method public setRefundAccountType(Ljava/lang/String;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->refundAccountType:Ljava/lang/String;

    .line 252
    return-void
.end method

.method public setRefundTicketId(Ljava/lang/String;)V
    .locals 1

    .line 182
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->refundTicketId:Ljava/lang/String;

    .line 183
    return-void
.end method

.method public setSource(Ljava/lang/String;)V
    .locals 1

    .line 229
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->source:Ljava/lang/String;

    .line 230
    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 1

    .line 219
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/spi/serveraccess/request/DeleteAppletRequest;->type:Ljava/lang/String;

    .line 220
    return-void
.end method
