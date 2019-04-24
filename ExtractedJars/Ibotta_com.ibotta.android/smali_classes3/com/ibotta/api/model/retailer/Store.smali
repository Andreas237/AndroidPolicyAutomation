.class public Lcom/ibotta/api/model/retailer/Store;
.super Ljava/lang/Object;
.source "Store.java"


# instance fields
.field private address:Ljava/lang/String;

.field private city:Ljava/lang/String;

.field private id:I

.field private latitude:F
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "lat"
    .end annotation
.end field

.field private longitude:F
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "long"
    .end annotation
.end field

.field private phone:Ljava/lang/String;

.field private retailerId:I

.field private state:Ljava/lang/String;

.field private zip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getAddress()Ljava/lang/String;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Store;->address:Ljava/lang/String;

    return-object v0
.end method

.method public getCity()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Store;->city:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 21
    iget v0, p0, Lcom/ibotta/api/model/retailer/Store;->id:I

    return v0
.end method

.method public getLatitude()D
    .locals 2

    .line 69
    iget v0, p0, Lcom/ibotta/api/model/retailer/Store;->latitude:F

    float-to-double v0, v0

    return-wide v0
.end method

.method public getLongitude()D
    .locals 2

    .line 77
    iget v0, p0, Lcom/ibotta/api/model/retailer/Store;->longitude:F

    float-to-double v0, v0

    return-wide v0
.end method

.method public getPhone()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Store;->phone:Ljava/lang/String;

    return-object v0
.end method

.method public getRetailerId()I
    .locals 1

    .line 85
    iget v0, p0, Lcom/ibotta/api/model/retailer/Store;->retailerId:I

    return v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Store;->state:Ljava/lang/String;

    return-object v0
.end method

.method public getZip()Ljava/lang/String;
    .locals 1

    .line 53
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/Store;->zip:Ljava/lang/String;

    return-object v0
.end method

.method public setAddress(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Store;->address:Ljava/lang/String;

    return-void
.end method

.method public setCity(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Store;->city:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 25
    iput p1, p0, Lcom/ibotta/api/model/retailer/Store;->id:I

    return-void
.end method

.method public setLatitude(F)V
    .locals 0

    .line 73
    iput p1, p0, Lcom/ibotta/api/model/retailer/Store;->latitude:F

    return-void
.end method

.method public setLongitude(F)V
    .locals 0

    .line 81
    iput p1, p0, Lcom/ibotta/api/model/retailer/Store;->longitude:F

    return-void
.end method

.method public setPhone(Ljava/lang/String;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Store;->phone:Ljava/lang/String;

    return-void
.end method

.method public setRetailerId(I)V
    .locals 0

    .line 89
    iput p1, p0, Lcom/ibotta/api/model/retailer/Store;->retailerId:I

    return-void
.end method

.method public setState(Ljava/lang/String;)V
    .locals 0

    .line 49
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Store;->state:Ljava/lang/String;

    return-void
.end method

.method public setZip(Ljava/lang/String;)V
    .locals 0

    .line 57
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/Store;->zip:Ljava/lang/String;

    return-void
.end method
