.class public Lcom/ibotta/api/rules/ScanRulesImpl;
.super Ljava/lang/Object;
.source "ScanRulesImpl.java"

# interfaces
.implements Lcom/ibotta/api/rules/ScanRules;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isAutoCheckAllowed(Lcom/ibotta/api/model/OfferModel;Ljava/lang/Boolean;Z)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 47
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isStandard()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    .line 49
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0, p1, p3}, Lcom/ibotta/api/rules/ScanRulesImpl;->isCheckProductSupported(Lcom/ibotta/api/model/OfferModel;Z)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    .line 51
    :cond_2
    invoke-virtual {p0, p1, p3}, Lcom/ibotta/api/rules/ScanRulesImpl;->isCheckProductSupported(Lcom/ibotta/api/model/OfferModel;Z)Z

    move-result p1

    xor-int/lit8 v0, p1, 0x1

    :cond_3
    :goto_0
    return v0
.end method

.method public isCheckProductSupported(Lcom/ibotta/api/model/OfferModel;Z)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 16
    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isNonItem()Z

    move-result v1

    .line 17
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->getPurchaseTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/ibotta/api/model/common/VerificationType;->isOnline()Z

    move-result v2

    .line 18
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isIgnoreBarcode()Z

    move-result p1

    if-nez v1, :cond_1

    if-nez v2, :cond_1

    if-nez p1, :cond_1

    if-nez p2, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public isScanRequired(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/Boolean;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-eqz p2, :cond_1

    .line 31
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->isIgnoreBarcode()Z

    move-result p1

    if-nez p1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    .line 33
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->isIgnoreBarcode()Z

    move-result p1

    xor-int/lit8 v0, p1, 0x1

    :cond_2
    :goto_0
    return v0
.end method
