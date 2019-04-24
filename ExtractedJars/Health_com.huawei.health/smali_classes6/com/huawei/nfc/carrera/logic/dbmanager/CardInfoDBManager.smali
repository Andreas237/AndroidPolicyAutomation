.class public Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private issuerInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;

.field private mContext:Landroid/content/Context;

.field private orderInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

.field private productInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;

.field private rfConfInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    iput-object p1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->mContext:Landroid/content/Context;

    .line 51
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;-><init>(Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->productInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;

    .line 52
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;-><init>(Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->issuerInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;

    .line 53
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;-><init>(Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->orderInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

    .line 54
    new-instance v0, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;-><init>(Landroid/content/ContentResolver;)V

    iput-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->rfConfInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;

    .line 55
    return-void
.end method


# virtual methods
.method public deleteAllCardOrderInfos()V
    .locals 1

    .line 76
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->orderInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->deleteAllCardOrderInfos()V

    .line 77
    return-void
.end method

.method public deleteCardOrderItem(Ljava/lang/String;)V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->orderInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->deleteCardOrderItem(Ljava/lang/String;)V

    .line 89
    return-void
.end method

.method public insertOrUpdateCardOrderInfos(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;)V"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->orderInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->insertOrUpdateCardOrderInfos(Ljava/util/List;)V

    .line 66
    return-void
.end method

.method public insertOrUpdateCardProductInfos(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;)V"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->productInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->insertOrUpdateCardProductInfos(Ljava/util/List;)V

    .line 94
    return-void
.end method

.method public insertOrUpdateIssuerInfos(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;)V"
        }
    .end annotation

    .line 133
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->issuerInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->insertOrUpdateIssuerInfos(Ljava/util/List;)V

    .line 134
    return-void
.end method

.method public insertOrUpdateRFConfInfos(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;>;)V"
        }
    .end annotation

    .line 196
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->rfConfInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;->insertOrUpdateRFConfInfos(Ljava/util/List;)V

    .line 197
    return-void
.end method

.method public queryCardOrderInfo()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;>;"
        }
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->orderInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->queryCardOrderInfo()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public queryCardOrderInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;
    .locals 1

    .line 117
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->orderInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->queryCardOrderInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardOrderInfoItem;

    move-result-object v0

    return-object v0
.end method

.method public queryCardProductInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;>;"
        }
    .end annotation

    .line 168
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->productInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->queryCardProductInfo()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryCardProductInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;
    .locals 1

    .line 180
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->productInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/ProductInfoOperator;->queryCardProductInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/CardProductInfoItem;

    move-result-object v0

    return-object v0
.end method

.method public queryIssuerInfo()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;>;"
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->issuerInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->queryIssuerInfo()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;
    .locals 1

    .line 157
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->issuerInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoOperator;->queryIssuerInfoById(Ljava/lang/String;)Lcom/huawei/nfc/carrera/logic/dbmanager/IssuerInfoItem;

    move-result-object v0

    return-object v0
.end method

.method public queryRFConfInfo()Ljava/util/HashMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/HashMap<Ljava/lang/String;Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoItem;>;"
        }
    .end annotation

    .line 185
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->rfConfInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;

    invoke-virtual {v0}, Lcom/huawei/nfc/carrera/logic/dbmanager/RFConfInfoOperator;->queryRFConfInfo()Ljava/util/HashMap;

    move-result-object v0

    return-object v0
.end method

.method public updateDefalutCardOrderInfo(Ljava/lang/String;)V
    .locals 1

    .line 128
    iget-object v0, p0, Lcom/huawei/nfc/carrera/logic/dbmanager/CardInfoDBManager;->orderInfoOperator:Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;

    invoke-virtual {v0, p1}, Lcom/huawei/nfc/carrera/logic/dbmanager/OrderInfoOperator;->updateDefalutCardOrderInfo(Ljava/lang/String;)V

    .line 129
    return-void
.end method
