.class public Lcom/ibotta/api/model/offer/ProductGroup;
.super Ljava/lang/Object;
.source "ProductGroup.java"

# interfaces
.implements Lcom/ibotta/api/model/offer/ScanMetaCriteria;


# instance fields
.field private description:Ljava/lang/String;

.field private id:I

.field private ignoreBarcode:Z

.field private multiples:Ljava/lang/String;

.field private multiplesCount:S

.field private multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

.field private name:Ljava/lang/String;

.field private products:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private randomWeight:Z

.field private randomWeightTotal:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->products:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 22
    iget v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->id:I

    return v0
.end method

.method public getMultiples()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiples:Ljava/lang/String;

    return-object v0
.end method

.method public getMultiplesCount()S
    .locals 1

    .line 126
    iget-short v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiplesCount:S

    return v0
.end method

.method public getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;
    .locals 1

    .line 90
    iget-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    if-eqz v0, :cond_0

    return-object v0

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiples:Ljava/lang/String;

    invoke-static {v0}, Lcom/ibotta/api/model/offer/Multiples;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0

    iput-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    .line 94
    iget-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 31
    iget-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getProducts()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->products:Ljava/util/Set;

    return-object v0
.end method

.method public getRandomWeightTotal()F
    .locals 1

    .line 117
    iget v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->randomWeightTotal:F

    return v0
.end method

.method public getRedemptionMax()S
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public isCombo()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isIgnoreBarcode()Z
    .locals 1

    .line 99
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->ignoreBarcode:Z

    return v0
.end method

.method public isMultipleRedemptions()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public isMultiples()Z
    .locals 2

    .line 66
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/ProductGroup;->getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/offer/Multiples;->NONE:Lcom/ibotta/api/model/offer/Multiples;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isMultiplesUnique()Z
    .locals 2

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/api/model/offer/ProductGroup;->getMultiplesEnum()Lcom/ibotta/api/model/offer/Multiples;

    move-result-object v0

    sget-object v1, Lcom/ibotta/api/model/offer/Multiples;->UNIQUE:Lcom/ibotta/api/model/offer/Multiples;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isRandomWeight()Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lcom/ibotta/api/model/offer/ProductGroup;->randomWeight:Z

    return v0
.end method

.method public isStandard()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->description:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 26
    iput p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->id:I

    return-void
.end method

.method public setIgnoreBarcode(Z)V
    .locals 0

    .line 103
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->ignoreBarcode:Z

    return-void
.end method

.method public setMultiples(Ljava/lang/String;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiples:Ljava/lang/String;

    const/4 p1, 0x0

    .line 61
    iput-object p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiplesEnum:Lcom/ibotta/api/model/offer/Multiples;

    return-void
.end method

.method public setMultiplesCount(S)V
    .locals 0

    .line 135
    iput-short p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->multiplesCount:S

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->name:Ljava/lang/String;

    return-void
.end method

.method public setProducts(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 52
    iput-object p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->products:Ljava/util/Set;

    return-void
.end method

.method public setRandomWeight(Z)V
    .locals 0

    .line 112
    iput-boolean p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->randomWeight:Z

    return-void
.end method

.method public setRandomWeightTotal(F)V
    .locals 0

    .line 121
    iput p1, p0, Lcom/ibotta/api/model/offer/ProductGroup;->randomWeightTotal:F

    return-void
.end method
