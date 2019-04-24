.class final Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;
.super Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
.source "AutoValue_BgcTransaction.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private barcodeUrl:Ljava/lang/String;

.field private createdTime:Ljava/lang/Long;

.field private customerId:Ljava/lang/String;

.field private errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

.field private faceValue:Ljava/lang/String;

.field private giftCardId:Ljava/lang/Long;

.field private giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

.field private retailerId:Ljava/lang/Integer;

.field private retailerModel:Lcom/ibotta/api/model/RetailerModel;

.field private retailerName:Ljava/lang/String;

.field private rewardAmount:Ljava/lang/String;

.field private spent:Ljava/lang/Boolean;

.field private status:Ljava/lang/String;

.field private updatedBalance:Ljava/lang/Double;

.field private uuid:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 263
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/ibotta/api/model/pwi/BgcTransaction;)V
    .locals 2

    .line 265
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;-><init>()V

    .line 266
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getBarcodeUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->barcodeUrl:Ljava/lang/String;

    .line 267
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getCreatedTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->createdTime:Ljava/lang/Long;

    .line 268
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getCustomerId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->customerId:Ljava/lang/String;

    .line 269
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getFaceValue()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->faceValue:Ljava/lang/String;

    .line 270
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardId()Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->giftCardId:Ljava/lang/Long;

    .line 271
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    .line 272
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerId:Ljava/lang/Integer;

    .line 273
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerName:Ljava/lang/String;

    .line 274
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRewardAmount()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->rewardAmount:Ljava/lang/String;

    .line 275
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->spent:Ljava/lang/Boolean;

    .line 276
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getStatus()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->status:Ljava/lang/String;

    .line 277
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getErrorMessage()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

    .line 278
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUuid()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->uuid:Ljava/lang/String;

    .line 279
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUpdatedBalance()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->updatedBalance:Ljava/lang/Double;

    .line 280
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/api/model/pwi/BgcTransaction;Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$1;)V
    .locals 0

    .line 247
    invoke-direct {p0, p1}, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;-><init>(Lcom/ibotta/api/model/pwi/BgcTransaction;)V

    return-void
.end method


# virtual methods
.method public barcodeUrl(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 284
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->barcodeUrl:Ljava/lang/String;

    return-object p0
.end method

.method public build()Lcom/ibotta/api/model/pwi/BgcTransaction;
    .locals 22

    move-object/from16 v0, p0

    const-string v1, ""

    .line 378
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->createdTime:Ljava/lang/Long;

    if-nez v2, :cond_0

    .line 379
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " createdTime"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 381
    :cond_0
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->customerId:Ljava/lang/String;

    if-nez v2, :cond_1

    .line 382
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " customerId"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 384
    :cond_1
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->faceValue:Ljava/lang/String;

    if-nez v2, :cond_2

    .line 385
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " faceValue"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 387
    :cond_2
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerId:Ljava/lang/Integer;

    if-nez v2, :cond_3

    .line 388
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " retailerId"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 390
    :cond_3
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerName:Ljava/lang/String;

    if-nez v2, :cond_4

    .line 391
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " retailerName"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 393
    :cond_4
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->spent:Ljava/lang/Boolean;

    if-nez v2, :cond_5

    .line 394
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " spent"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 396
    :cond_5
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->status:Ljava/lang/String;

    if-nez v2, :cond_6

    .line 397
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " status"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 399
    :cond_6
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->uuid:Ljava/lang/String;

    if-nez v2, :cond_7

    .line 400
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " uuid"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 402
    :cond_7
    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->updatedBalance:Ljava/lang/Double;

    if-nez v2, :cond_8

    .line 403
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " updatedBalance"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 405
    :cond_8
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 408
    new-instance v1, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;

    move-object v3, v1

    iget-object v4, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->barcodeUrl:Ljava/lang/String;

    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->createdTime:Ljava/lang/Long;

    .line 410
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v7, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->customerId:Ljava/lang/String;

    iget-object v8, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->faceValue:Ljava/lang/String;

    iget-object v9, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->giftCardId:Ljava/lang/Long;

    iget-object v10, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerId:Ljava/lang/Integer;

    .line 415
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v12, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerName:Ljava/lang/String;

    iget-object v13, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->rewardAmount:Ljava/lang/String;

    iget-object v14, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->spent:Ljava/lang/Boolean;

    iget-object v15, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->status:Ljava/lang/String;

    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

    move-object/from16 v16, v2

    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->uuid:Ljava/lang/String;

    move-object/from16 v17, v2

    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->updatedBalance:Ljava/lang/Double;

    .line 422
    invoke-virtual {v2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    iget-object v2, v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    move-object/from16 v20, v2

    const/16 v21, 0x0

    invoke-direct/range {v3 .. v21}, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction;-><init>(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/ibotta/api/model/pwi/GiftCardMetaData;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;Ljava/lang/String;DLcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$1;)V

    return-object v1

    .line 406
    :cond_9
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Missing required properties:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public createdTime(J)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0

    .line 289
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->createdTime:Ljava/lang/Long;

    return-object p0
.end method

.method public customerId(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 297
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->customerId:Ljava/lang/String;

    return-object p0

    .line 295
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null customerId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public errorMessage(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 354
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->errorMessage:Lcom/ibotta/api/model/pwi/PwiError;

    return-object p0
.end method

.method public faceValue(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 305
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->faceValue:Ljava/lang/String;

    return-object p0

    .line 303
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null faceValue"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public giftCardId(Ljava/lang/Long;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0
    .param p1    # Ljava/lang/Long;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 310
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->giftCardId:Ljava/lang/Long;

    return-object p0
.end method

.method public giftCardMetaData(Lcom/ibotta/api/model/pwi/GiftCardMetaData;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/api/model/pwi/GiftCardMetaData;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 315
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->giftCardMetaData:Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    return-object p0
.end method

.method public retailerId(I)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0

    .line 320
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerId:Ljava/lang/Integer;

    return-object p0
.end method

.method public retailerModel(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 372
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerModel:Lcom/ibotta/api/model/RetailerModel;

    return-object p0
.end method

.method public retailerName(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 328
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->retailerName:Ljava/lang/String;

    return-object p0

    .line 326
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null retailerName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public rewardAmount(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 333
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->rewardAmount:Ljava/lang/String;

    return-object p0
.end method

.method public spent(Ljava/lang/Boolean;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 341
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->spent:Ljava/lang/Boolean;

    return-object p0

    .line 339
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null spent"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public status(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 349
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->status:Ljava/lang/String;

    return-object p0

    .line 347
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null status"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public updatedBalance(D)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 0

    .line 367
    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->updatedBalance:Ljava/lang/Double;

    return-object p0
.end method

.method public uuid(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcTransaction$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 362
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcTransaction$Builder;->uuid:Ljava/lang/String;

    return-object p0

    .line 360
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null uuid"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
