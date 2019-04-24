.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final CYCLE_NONE:Ljava/lang/String; = "0"

.field public static final CYCLE_ONE_YEAR:Ljava/lang/String; = "1"

.field public static final PAY_TIME_POINT_IN:Ljava/lang/String; = "2"

.field public static final PAY_TIME_POINT_OUT:Ljava/lang/String; = "1"

.field private static final serialVersionUID:J = 0x73da2621857675acL


# instance fields
.field private currentCardmoveTimes:I

.field private cycle:Ljava/lang/String;

.field private eventId:Ljava/lang/String;

.field private expireDaysIn:I

.field private expireDaysOut:I

.field private fee:Ljava/lang/String;

.field private feeCardmoveNum:I

.field private maxCardmoveNum:I

.field private payTimePoint:Ljava/lang/String;

.field private transferAbility:Ljava/lang/String;

.field private transferStatus:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCurrentCardmoveTimes()I
    .locals 1

    .line 150
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->currentCardmoveTimes:I

    return v0
.end method

.method public getCycle()Ljava/lang/String;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->cycle:Ljava/lang/String;

    return-object v0
.end method

.method public getEventId()Ljava/lang/String;
    .locals 1

    .line 109
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->eventId:Ljava/lang/String;

    return-object v0
.end method

.method public getExpireDaysIn()I
    .locals 1

    .line 142
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->expireDaysIn:I

    return v0
.end method

.method public getExpireDaysOut()I
    .locals 1

    .line 134
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->expireDaysOut:I

    return v0
.end method

.method public getFee()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->fee:Ljava/lang/String;

    return-object v0
.end method

.method public getFeeCardmoveNum()I
    .locals 1

    .line 126
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->feeCardmoveNum:I

    return v0
.end method

.method public getMaxCardmoveNum()I
    .locals 1

    .line 118
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->maxCardmoveNum:I

    return v0
.end method

.method public getPayTimePoint()Ljava/lang/String;
    .locals 1

    .line 174
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->payTimePoint:Ljava/lang/String;

    return-object v0
.end method

.method public getTransferAbility()Ljava/lang/String;
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->transferAbility:Ljava/lang/String;

    return-object v0
.end method

.method public getTransferStatus()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->transferStatus:Ljava/lang/String;

    return-object v0
.end method

.method public setCurrentCardmoveTimes(I)V
    .locals 0

    .line 154
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->currentCardmoveTimes:I

    .line 155
    return-void
.end method

.method public setCycle(Ljava/lang/String;)V
    .locals 0

    .line 162
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->cycle:Ljava/lang/String;

    .line 163
    return-void
.end method

.method public setEventId(Ljava/lang/String;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->eventId:Ljava/lang/String;

    .line 115
    return-void
.end method

.method public setExpireDaysIn(I)V
    .locals 0

    .line 146
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->expireDaysIn:I

    .line 147
    return-void
.end method

.method public setExpireDaysOut(I)V
    .locals 0

    .line 138
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->expireDaysOut:I

    .line 139
    return-void
.end method

.method public setFee(Ljava/lang/String;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->fee:Ljava/lang/String;

    .line 171
    return-void
.end method

.method public setFeeCardmoveNum(I)V
    .locals 0

    .line 130
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->feeCardmoveNum:I

    .line 131
    return-void
.end method

.method public setMaxCardmoveNum(I)V
    .locals 0

    .line 122
    iput p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->maxCardmoveNum:I

    .line 123
    return-void
.end method

.method public setPayTimePoint(Ljava/lang/String;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->payTimePoint:Ljava/lang/String;

    .line 179
    return-void
.end method

.method public setTransferAbility(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->transferAbility:Ljava/lang/String;

    .line 95
    return-void
.end method

.method public setTransferStatus(Ljava/lang/String;)V
    .locals 0

    .line 104
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->transferStatus:Ljava/lang/String;

    .line 105
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "transferAbility="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->transferAbility:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",transferStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->transferStatus:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",eventId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->eventId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",maxCardmoveNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->maxCardmoveNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",feeCardmoveNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->feeCardmoveNum:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",expireDaysOut="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->expireDaysOut:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",expireDaysIn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->expireDaysIn:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",currentCardmoveTimes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->currentCardmoveTimes:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",cycle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->cycle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",fee="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->fee:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",payTimePoint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/CardTransferAbilityInfo;->payTimePoint:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
