.class public Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;
.super Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;
.source "SourceFile"


# static fields
.field public static final TRANSFER_NOT_SUPPORT_HAS_APPLIED:Ljava/lang/String; = "3"

.field public static final TRANSFER_NOT_SUPPORT_HAS_APPLY_BY_OTHER:Ljava/lang/String; = "4"

.field public static final TRANSFER_NOT_SUPPORT_HAS_UNFINISHED:Ljava/lang/String; = "2"

.field public static final TRANSFER_NOT_SUPPORT_INVALID:Ljava/lang/String; = "1"

.field public static final TRANSFER_SUPPORT:Ljava/lang/String; = "0"


# instance fields
.field private cycle:Ljava/lang/String;

.field private fee:Ljava/lang/String;

.field private payTimePoint:Ljava/lang/String;

.field private transferAbility:Ljava/lang/String;

.field private transferCurrentCardmoveTimes:I

.field private transferEventId:Ljava/lang/String;

.field private transferExpireDaysIn:I

.field private transferExpireDaysOut:I

.field private transferFeeCardmoveNum:I

.field private transferMaxCardmoveNum:I

.field private transferStatus:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/huawei/nfc/carrera/server/card/response/CardServerBaseResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCycle()Ljava/lang/String;
    .locals 1

    .line 154
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->cycle:Ljava/lang/String;

    return-object v0
.end method

.method public getFee()Ljava/lang/String;
    .locals 1

    .line 162
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->fee:Ljava/lang/String;

    return-object v0
.end method

.method public getPayTimePoint()Ljava/lang/String;
    .locals 1

    .line 170
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->payTimePoint:Ljava/lang/String;

    return-object v0
.end method

.method public getTransferAbility()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferAbility:Ljava/lang/String;

    return-object v0
.end method

.method public getTransferCurrentCardmoveTimes()I
    .locals 1

    .line 145
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferCurrentCardmoveTimes:I

    return v0
.end method

.method public getTransferEventId()Ljava/lang/String;
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferEventId:Ljava/lang/String;

    return-object v0
.end method

.method public getTransferExpireDaysIn()I
    .locals 1

    .line 137
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferExpireDaysIn:I

    return v0
.end method

.method public getTransferExpireDaysOut()I
    .locals 1

    .line 129
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferExpireDaysOut:I

    return v0
.end method

.method public getTransferFeeCardmoveNum()I
    .locals 1

    .line 121
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferFeeCardmoveNum:I

    return v0
.end method

.method public getTransferMaxCardmoveNum()I
    .locals 1

    .line 113
    iget v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferMaxCardmoveNum:I

    return v0
.end method

.method public getTransferStatus()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferStatus:Ljava/lang/String;

    return-object v0
.end method

.method public setCycle(Ljava/lang/String;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->cycle:Ljava/lang/String;

    .line 159
    return-void
.end method

.method public setFee(Ljava/lang/String;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->fee:Ljava/lang/String;

    .line 167
    return-void
.end method

.method public setPayTimePoint(Ljava/lang/String;)V
    .locals 0

    .line 174
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->payTimePoint:Ljava/lang/String;

    .line 175
    return-void
.end method

.method public setTransferAbility(Ljava/lang/String;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferAbility:Ljava/lang/String;

    .line 94
    return-void
.end method

.method public setTransferCurrentCardmoveTimes(I)V
    .locals 0

    .line 149
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferCurrentCardmoveTimes:I

    .line 150
    return-void
.end method

.method public setTransferEventId(Ljava/lang/String;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferEventId:Ljava/lang/String;

    .line 110
    return-void
.end method

.method public setTransferExpireDaysIn(I)V
    .locals 0

    .line 141
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferExpireDaysIn:I

    .line 142
    return-void
.end method

.method public setTransferExpireDaysOut(I)V
    .locals 0

    .line 133
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferExpireDaysOut:I

    .line 134
    return-void
.end method

.method public setTransferFeeCardmoveNum(I)V
    .locals 0

    .line 125
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferFeeCardmoveNum:I

    .line 126
    return-void
.end method

.method public setTransferMaxCardmoveNum(I)V
    .locals 0

    .line 117
    iput p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferMaxCardmoveNum:I

    .line 118
    return-void
.end method

.method public setTransferStatus(Ljava/lang/String;)V
    .locals 0

    .line 101
    iput-object p1, p0, Lcom/huawei/nfc/carrera/server/card/response/QueryCardTransferAbilityResponse;->transferStatus:Ljava/lang/String;

    .line 102
    return-void
.end method
