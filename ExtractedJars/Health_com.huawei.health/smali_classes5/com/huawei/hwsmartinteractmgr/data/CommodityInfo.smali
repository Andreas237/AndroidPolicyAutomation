.class public Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private dicountStartTime:J

.field private discountEndTime:J

.field private discountPrice:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private originalPrice:Ljava/lang/String;

.field private purchaseUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->name:Ljava/lang/String;

    .line 30
    iput-object p2, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->imageUrl:Ljava/lang/String;

    .line 31
    iput-object p3, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->purchaseUrl:Ljava/lang/String;

    .line 32
    return-void
.end method


# virtual methods
.method public getDicountStartTime()J
    .locals 2

    .line 75
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->dicountStartTime:J

    return-wide v0
.end method

.method public getDiscountEndTime()J
    .locals 2

    .line 83
    iget-wide v0, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->discountEndTime:J

    return-wide v0
.end method

.method public getDiscountPrice()Ljava/lang/String;
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->discountPrice:Ljava/lang/String;

    return-object v0
.end method

.method public getImageUrl()Ljava/lang/String;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->imageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getOriginalPrice()Ljava/lang/String;
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->originalPrice:Ljava/lang/String;

    return-object v0
.end method

.method public getPurchaseUrl()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->purchaseUrl:Ljava/lang/String;

    return-object v0
.end method

.method public setDicountStartTime(J)V
    .locals 0

    .line 79
    iput-wide p1, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->dicountStartTime:J

    .line 80
    return-void
.end method

.method public setDiscountEndTime(J)V
    .locals 0

    .line 87
    iput-wide p1, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->discountEndTime:J

    .line 88
    return-void
.end method

.method public setDiscountPrice(Ljava/lang/String;)V
    .locals 0

    .line 71
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->discountPrice:Ljava/lang/String;

    .line 72
    return-void
.end method

.method public setImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->imageUrl:Ljava/lang/String;

    .line 48
    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->name:Ljava/lang/String;

    .line 40
    return-void
.end method

.method public setOriginalPrice(Ljava/lang/String;)V
    .locals 0

    .line 63
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->originalPrice:Ljava/lang/String;

    .line 64
    return-void
.end method

.method public setPurchaseUrl(Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/hwsmartinteractmgr/data/CommodityInfo;->purchaseUrl:Ljava/lang/String;

    .line 56
    return-void
.end method
