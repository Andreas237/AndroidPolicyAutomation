.class public Lcom/ibotta/android/verification/OfferVerification;
.super Ljava/lang/Object;
.source "OfferVerification.java"


# instance fields
.field private offerModel:Lcom/ibotta/api/model/OfferModel;

.field private quantity:I

.field private scanProgress:Lcom/ibotta/android/verification/ScanProgress;

.field private final scanRules:Lcom/ibotta/api/rules/ScanRules;

.field private verifications:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/api/rules/ScanRules;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    .line 28
    new-instance v0, Lcom/ibotta/android/verification/ScanProgress;

    invoke-direct {v0}, Lcom/ibotta/android/verification/ScanProgress;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->scanProgress:Lcom/ibotta/android/verification/ScanProgress;

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/verification/OfferVerification;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    return-void
.end method

.method private getProductGroupsVerified(Ljava/util/List;Z)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/ProductGroup;",
            ">;Z)I"
        }
    .end annotation

    .line 193
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/ibotta/api/model/offer/ProductGroup;

    .line 194
    invoke-virtual {v1}, Lcom/ibotta/api/model/offer/ProductGroup;->getId()I

    move-result v2

    .line 195
    iget-object v3, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    invoke-static {v3, v2}, Lcom/ibotta/android/verification/Verification;->findByProductGroupId(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    .line 197
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {p0, v1, v3, v2}, Lcom/ibotta/android/verification/OfferVerification;->isScanMetaCriteriaMet(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/Boolean;Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method private isScanMetaCriteriaMet(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/Boolean;Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/api/model/offer/ScanMetaCriteria;",
            "Ljava/lang/Boolean;",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;)Z"
        }
    .end annotation

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    invoke-interface {v0, p1, p2}, Lcom/ibotta/api/rules/ScanRules;->isScanRequired(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/Boolean;)Z

    move-result p2

    const/4 v0, 0x1

    if-nez p2, :cond_0

    .line 153
    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    return v0

    .line 157
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->isMultiples()Z

    move-result p2

    .line 158
    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->isMultiplesUnique()Z

    move-result v1

    if-eqz p2, :cond_1

    .line 162
    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->getMultiplesCount()S

    move-result p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 167
    :goto_0
    invoke-virtual {p0, v1, p3}, Lcom/ibotta/android/verification/OfferVerification;->getScannedDataSize(ZLjava/util/List;)I

    move-result p2

    if-lt p2, p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method

.method private isScanMetaCriteriaMet(Ljava/lang/Boolean;)Z
    .locals 2

    .line 130
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->isCombo()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 131
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getProductGroups()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {p0, v0, p1}, Lcom/ibotta/android/verification/OfferVerification;->getProductGroupsVerified(Ljava/util/List;Z)I

    move-result p1

    .line 133
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0}, Lcom/ibotta/api/model/OfferModel;->getProductGroups()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    .line 136
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->offerModel:Lcom/ibotta/api/model/OfferModel;

    iget-object v1, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    invoke-direct {p0, v0, p1, v1}, Lcom/ibotta/android/verification/OfferVerification;->isScanMetaCriteriaMet(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/Boolean;Ljava/util/List;)Z

    move-result p1

    :goto_0
    return p1
.end method


# virtual methods
.method public getOcrVerifiedCount()I
    .locals 3

    .line 208
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/android/verification/Verification;

    .line 209
    invoke-virtual {v2}, Lcom/ibotta/android/verification/Verification;->isPreverified()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public getOfferModel()Lcom/ibotta/api/model/OfferModel;
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-object v0
.end method

.method public getQuantity()I
    .locals 1

    .line 70
    iget v0, p0, Lcom/ibotta/android/verification/OfferVerification;->quantity:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0
.end method

.method public getScanProgress()Lcom/ibotta/android/verification/ScanProgress;
    .locals 1

    .line 58
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->scanProgress:Lcom/ibotta/android/verification/ScanProgress;

    return-object v0
.end method

.method protected getScannedDataSize(ZLjava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;)I"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 175
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    goto :goto_0

    .line 177
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 180
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/verification/Verification;

    .line 181
    invoke-virtual {v0}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_1

    .line 182
    invoke-virtual {v0}, Lcom/ibotta/android/verification/Verification;->getScannedData()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 186
    :cond_2
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p1

    return p1
.end method

.method public getVerifications()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    return-object v0
.end method

.method public isPreverified()Z
    .locals 4

    .line 80
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 82
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/ibotta/android/verification/Verification;

    .line 83
    invoke-virtual {v3}, Lcom/ibotta/android/verification/Verification;->isPreverified()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 88
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lt v2, v0, :cond_2

    const/4 v0, 0x1

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public isVerified(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)Z
    .locals 3

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->offerModel:Lcom/ibotta/api/model/OfferModel;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    if-eqz p1, :cond_1

    .line 105
    invoke-virtual {p1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->isBarcode()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 106
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/verification/OfferVerification;->scanRules:Lcom/ibotta/api/rules/ScanRules;

    iget-object v1, p0, Lcom/ibotta/android/verification/OfferVerification;->offerModel:Lcom/ibotta/api/model/OfferModel;

    invoke-interface {v0, v1, p1}, Lcom/ibotta/api/rules/ScanRules;->isScanRequired(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/Boolean;)Z

    move-result v0

    .line 109
    invoke-virtual {p0}, Lcom/ibotta/android/verification/OfferVerification;->isPreverified()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    .line 112
    invoke-direct {p0, p1}, Lcom/ibotta/android/verification/OfferVerification;->isScanMetaCriteriaMet(Ljava/lang/Boolean;)Z

    move-result v2

    goto :goto_1

    .line 114
    :cond_3
    iget-object p1, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    xor-int/2addr v2, p1

    :goto_1
    return v2
.end method

.method public setOfferModel(Lcom/ibotta/api/model/OfferModel;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/verification/OfferVerification;->offerModel:Lcom/ibotta/api/model/OfferModel;

    return-void
.end method

.method public setQuantity(I)V
    .locals 0

    .line 74
    iput p1, p0, Lcom/ibotta/android/verification/OfferVerification;->quantity:I

    return-void
.end method

.method public setScanProgress(Lcom/ibotta/android/verification/ScanProgress;)V
    .locals 0

    if-nez p1, :cond_0

    .line 63
    new-instance p1, Lcom/ibotta/android/verification/ScanProgress;

    invoke-direct {p1}, Lcom/ibotta/android/verification/ScanProgress;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/verification/OfferVerification;->scanProgress:Lcom/ibotta/android/verification/ScanProgress;

    goto :goto_0

    .line 65
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/verification/OfferVerification;->scanProgress:Lcom/ibotta/android/verification/ScanProgress;

    :goto_0
    return-void
.end method

.method public setVerifications(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/android/verification/Verification;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    .line 51
    iget-object p1, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    goto :goto_0

    .line 53
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/verification/OfferVerification;->verifications:Ljava/util/List;

    :goto_0
    return-void
.end method
