.class public Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;
.super Ljava/lang/Object;
.source "CustomerReceiptsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfferData"
.end annotation


# instance fields
.field private offerId:I

.field private productGroupDataList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;",
            ">;"
        }
    .end annotation
.end field

.field private submittedCount:I

.field private upcs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private verified:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 245
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->upcs:Ljava/util/List;

    .line 246
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->productGroupDataList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public getOfferId()I
    .locals 1

    .line 249
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->offerId:I

    return v0
.end method

.method public getProductGroupDataList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;",
            ">;"
        }
    .end annotation

    .line 284
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->productGroupDataList:Ljava/util/List;

    return-object v0
.end method

.method public getSubmittedCount()I
    .locals 1

    .line 257
    iget v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->submittedCount:I

    return v0
.end method

.method public getUpcs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 273
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->upcs:Ljava/util/List;

    return-object v0
.end method

.method public isVerified()Z
    .locals 1

    .line 265
    iget-boolean v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->verified:Z

    return v0
.end method

.method public setOfferId(I)V
    .locals 0

    .line 253
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->offerId:I

    return-void
.end method

.method public setProductGroupDataList(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$ProductGroupData;",
            ">;)V"
        }
    .end annotation

    .line 288
    iput-object p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->productGroupDataList:Ljava/util/List;

    return-void
.end method

.method public setSubmittedCount(I)V
    .locals 0

    .line 261
    iput p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->submittedCount:I

    return-void
.end method

.method public setUpcs(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 277
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->upcs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    if-eqz p1, :cond_0

    .line 279
    iget-object v0, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->upcs:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    :cond_0
    return-void
.end method

.method public setVerified(Z)V
    .locals 0

    .line 269
    iput-boolean p1, p0, Lcom/ibotta/api/call/customer/receipt/CustomerReceiptsPostCall$OfferData;->verified:Z

    return-void
.end method
