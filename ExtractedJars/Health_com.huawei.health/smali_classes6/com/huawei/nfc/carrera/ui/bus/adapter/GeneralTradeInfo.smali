.class public Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;
    }
.end annotation


# instance fields
.field private mAmount:Ljava/lang/String;

.field private mDate:Ljava/lang/String;

.field private mStatusDesc:Ljava/lang/String;

.field private mTypeDesc:Ljava/lang/String;

.field private unitText:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mDate:Ljava/lang/String;

    .line 21
    iput-object p2, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->unitText:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mAmount:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mTypeDesc:Ljava/lang/String;

    .line 24
    iput-object p5, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mStatusDesc:Ljava/lang/String;

    .line 25
    return-void
.end method

.method public static changeRecordListToTradeList(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/nfc/carrera/logic/cardoperate/bus/model/RecordInfo;>;)Ljava/util/List<Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;>;"
        }
    .end annotation

    .line 108
    new-instance v1, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;

    invoke-direct {v1, p0}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;-><init>(Landroid/content/Context;)V

    .line 109
    invoke-virtual {v1, p1}, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo$TradeRecordUIConverter;->changeRecordListToTradeList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public generalTradeInfoSAI1()V
    .locals 0

    .line 188
    return-void
.end method

.method public generalTradeInfoSAI2()V
    .locals 0

    .line 189
    return-void
.end method

.method public generalTradeInfoSAI3()V
    .locals 0

    .line 190
    return-void
.end method

.method public generalTradeInfoSAI4()V
    .locals 0

    .line 191
    return-void
.end method

.method public generalTradeInfoSAI5()V
    .locals 0

    .line 192
    return-void
.end method

.method public getUnitText()Ljava/lang/String;
    .locals 1

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->unitText:Ljava/lang/String;

    return-object v0
.end method

.method public getmAmount()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mAmount:Ljava/lang/String;

    return-object v0
.end method

.method public getmDate()Ljava/lang/String;
    .locals 1

    .line 49
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mDate:Ljava/lang/String;

    return-object v0
.end method

.method public getmStatusDesc()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mStatusDesc:Ljava/lang/String;

    return-object v0
.end method

.method public getmTypeDesc()Ljava/lang/String;
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mTypeDesc:Ljava/lang/String;

    return-object v0
.end method

.method public setUnitText(Ljava/lang/String;)V
    .locals 0

    .line 44
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->unitText:Ljava/lang/String;

    .line 45
    return-void
.end method

.method public setmAmount(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mAmount:Ljava/lang/String;

    .line 33
    return-void
.end method

.method public setmDate(Ljava/lang/String;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mDate:Ljava/lang/String;

    .line 29
    return-void
.end method

.method public setmStatusDesc(Ljava/lang/String;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mStatusDesc:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setmTypeDesc(Ljava/lang/String;)V
    .locals 0

    .line 36
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mTypeDesc:Ljava/lang/String;

    .line 37
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mDate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->unitText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mAmount:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mTypeDesc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/bus/adapter/GeneralTradeInfo;->mStatusDesc:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
