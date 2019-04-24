.class public Lcom/ibotta/api/model/offer/DigitalProduct;
.super Ljava/lang/Object;
.source "DigitalProduct.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/ibotta/api/model/offer/DigitalProduct;",
        ">;"
    }
.end annotation


# instance fields
.field private appId:I

.field private appUriScheme:Ljava/lang/String;

.field private id:I

.field private packageName:Ljava/lang/String;

.field private retailerId:I

.field private uri:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compareTo(Lcom/ibotta/api/model/offer/DigitalProduct;)I
    .locals 2

    const/4 v0, -0x1

    if-nez p1, :cond_0

    return v0

    .line 67
    :cond_0
    iget v1, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->id:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/api/model/offer/DigitalProduct;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Integer;)I

    move-result p1

    mul-int/lit8 p1, p1, -0x1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 6
    check-cast p1, Lcom/ibotta/api/model/offer/DigitalProduct;

    invoke-virtual {p0, p1}, Lcom/ibotta/api/model/offer/DigitalProduct;->compareTo(Lcom/ibotta/api/model/offer/DigitalProduct;)I

    move-result p1

    return p1
.end method

.method public getAppId()I
    .locals 1

    .line 31
    iget v0, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->appId:I

    return v0
.end method

.method public getAppUriScheme()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->appUriScheme:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 15
    iget v0, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->id:I

    return v0
.end method

.method public getPackageName()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->packageName:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 55
    iget v0, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->retailerId:I

    return v0
.end method

.method public getUri()Ljava/lang/String;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->uri:Ljava/lang/String;

    return-object v0
.end method

.method public setAppId(I)V
    .locals 0

    .line 35
    iput p1, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->appId:I

    return-void
.end method

.method public setAppUriScheme(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->appUriScheme:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 19
    iput p1, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->id:I

    return-void
.end method

.method public setPackageName(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->packageName:Ljava/lang/String;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 59
    iput p1, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->retailerId:I

    return-void
.end method

.method public setUri(Ljava/lang/String;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/api/model/offer/DigitalProduct;->uri:Ljava/lang/String;

    return-void
.end method
