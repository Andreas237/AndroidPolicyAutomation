.class public Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;
.super Ljava/lang/Object;
.source "CustomerOffersUpcsPostCall.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CallParams"
.end annotation


# instance fields
.field private barcodeType:Lcom/ibotta/api/model/common/BarcodeType;

.field private customerId:I

.field private offerId:I

.field private productImage:Ljava/io/File;

.field private upc:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBarcodeType()Lcom/ibotta/api/model/common/BarcodeType;
    .locals 1

    .line 98
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->barcodeType:Lcom/ibotta/api/model/common/BarcodeType;

    return-object v0
.end method

.method public getCustomerId()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->customerId:I

    return v0
.end method

.method public getOfferId()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->offerId:I

    return v0
.end method

.method public getProductImage()Ljava/io/File;
    .locals 1

    .line 106
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->productImage:Ljava/io/File;

    return-object v0
.end method

.method public getUpc()Ljava/lang/String;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->upc:Ljava/lang/String;

    return-object v0
.end method

.method public setBarcodeType(Lcom/ibotta/api/model/common/BarcodeType;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->barcodeType:Lcom/ibotta/api/model/common/BarcodeType;

    return-void
.end method

.method public setCustomerId(I)V
    .locals 0

    .line 78
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->customerId:I

    return-void
.end method

.method public setOfferId(I)V
    .locals 0

    .line 86
    iput p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->offerId:I

    return-void
.end method

.method public setProductImage(Ljava/io/File;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->productImage:Ljava/io/File;

    return-void
.end method

.method public setUpc(Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/ibotta/api/call/offer/CustomerOffersUpcsPostCall$CallParams;->upc:Ljava/lang/String;

    return-void
.end method
