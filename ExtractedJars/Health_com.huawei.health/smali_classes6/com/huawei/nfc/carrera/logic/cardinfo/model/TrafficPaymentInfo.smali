.class public Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x5fa0448b6a40174fL


# instance fields
.field private isSptonline:Z

.field private preMode:I

.field private preOrderType:I

.field private prePaytypes:Ljava/lang/String;

.field private premount:D

.field private prename:Ljava/lang/String;

.field private promotionInfoList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getPreMode()I
    .locals 1

    .line 77
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->preMode:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPreOrderType()I
    .locals 1

    .line 67
    iget v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->preOrderType:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getPrePaytypes()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->prePaytypes:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPremount()D
    .locals 2

    .line 57
    iget-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->premount:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public getPrename()Ljava/lang/String;
    .locals 1

    .line 97
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->prename:Ljava/lang/String;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getPromotionInfoList()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;>;"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->promotionInfoList:Ljava/util/ArrayList;

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method public isSptonline()Z
    .locals 1

    .line 107
    iget-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->isSptonline:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public setPreMode(I)V
    .locals 1

    .line 82
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->preMode:I

    .line 83
    return-void
.end method

.method public setPreOrderType(I)V
    .locals 1

    .line 72
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->preOrderType:I

    .line 73
    return-void
.end method

.method public setPrePaytypes(Ljava/lang/String;)V
    .locals 1

    .line 92
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->prePaytypes:Ljava/lang/String;

    .line 93
    return-void
.end method

.method public setPremount(D)V
    .locals 2

    .line 62
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    iput-wide v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->premount:D

    .line 63
    return-void
.end method

.method public setPrename(Ljava/lang/String;)V
    .locals 1

    .line 102
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->prename:Ljava/lang/String;

    .line 103
    return-void
.end method

.method public setPromotionInfoList(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/server/card/model/PromotionInfo;>;)V"
        }
    .end annotation

    .line 122
    invoke-static {p1}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->promotionInfoList:Ljava/util/ArrayList;

    .line 123
    return-void
.end method

.method public setSptonline(Z)V
    .locals 1

    .line 112
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/nfc/carrera/logic/cardinfo/model/TrafficPaymentInfo;->isSptonline:Z

    .line 113
    return-void
.end method
