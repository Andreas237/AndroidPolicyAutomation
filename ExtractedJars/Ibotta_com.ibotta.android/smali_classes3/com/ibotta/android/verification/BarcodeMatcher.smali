.class public Lcom/ibotta/android/verification/BarcodeMatcher;
.super Ljava/lang/Object;
.source "BarcodeMatcher.java"


# static fields
.field private static final REGEX_PLU:Ljava/lang/String; = "^0*2(\\d{5})\\d(\\d{4,5})\\d$"


# instance fields
.field private matcher:Ljava/util/regex/Matcher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private convertPLUToProductCodes(Ljava/util/Set;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 121
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 123
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 124
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 125
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 126
    invoke-direct {p0, v2}, Lcom/ibotta/android/verification/BarcodeMatcher;->getMatcher(Ljava/lang/String;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 128
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v3

    const/4 v4, 0x1

    if-lt v3, v4, :cond_0

    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 132
    invoke-virtual {v2, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 133
    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 138
    :cond_1
    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private getMatcher(Ljava/lang/String;)Ljava/util/regex/Matcher;
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/ibotta/android/verification/BarcodeMatcher;->matcher:Ljava/util/regex/Matcher;

    if-nez v0, :cond_0

    const-string v0, "^0*2(\\d{5})\\d(\\d{4,5})\\d$"

    .line 202
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/verification/BarcodeMatcher;->matcher:Ljava/util/regex/Matcher;

    goto :goto_0

    .line 204
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/regex/Matcher;->reset(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 207
    :goto_0
    iget-object p1, p0, Lcom/ibotta/android/verification/BarcodeMatcher;->matcher:Ljava/util/regex/Matcher;

    return-object p1
.end method

.method private tryToMatch(ZFLjava/util/Set;Ljava/lang/String;)Lcom/ibotta/android/verification/MatchOutcome;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZF",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/ibotta/android/verification/MatchOutcome;"
        }
    .end annotation

    .line 77
    new-instance v0, Ljava/util/HashSet;

    invoke-interface {p3}, Ljava/util/Set;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    .line 78
    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/16 v2, 0x30

    const/16 v3, 0x20

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    const-string v6, "%14s"

    .line 79
    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v4

    invoke-static {v6, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 84
    :cond_0
    new-instance p3, Lcom/ibotta/android/verification/MatchOutcome;

    invoke-direct {p3}, Lcom/ibotta/android/verification/MatchOutcome;-><init>()V

    if-eqz p1, :cond_1

    .line 88
    invoke-direct {p0, v0}, Lcom/ibotta/android/verification/BarcodeMatcher;->convertPLUToProductCodes(Ljava/util/Set;)V

    :cond_1
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 97
    invoke-direct {p0, p2, p4}, Lcom/ibotta/android/verification/BarcodeMatcher;->validatePLU(FLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    if-nez v1, :cond_3

    const-string p1, "%14s"

    .line 102
    new-array p2, v5, [Ljava/lang/Object;

    aput-object p4, p2, v4

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v3, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p4

    move-object p1, p4

    goto :goto_1

    :cond_3
    move-object p1, p4

    move-object p4, v1

    .line 106
    :goto_1
    invoke-interface {v0, p4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_4

    .line 108
    invoke-virtual {p3, v5}, Lcom/ibotta/android/verification/MatchOutcome;->setMatch(Z)V

    .line 109
    invoke-virtual {p3, p1}, Lcom/ibotta/android/verification/MatchOutcome;->setBarcode(Ljava/lang/String;)V

    :cond_4
    return-object p3
.end method

.method private validatePLU(FLjava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 152
    invoke-direct {p0, p2}, Lcom/ibotta/android/verification/BarcodeMatcher;->getMatcher(Ljava/lang/String;)Ljava/util/regex/Matcher;

    move-result-object p2

    .line 153
    invoke-virtual {p2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Ljava/util/regex/Matcher;->groupCount()I

    move-result v0

    const/4 v2, 0x2

    if-lt v0, v2, :cond_1

    const/4 v0, 0x1

    .line 155
    invoke-virtual {p2, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    .line 156
    invoke-virtual {p2, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p2

    const-string v4, "PLU Item Code: %1$s"

    .line 158
    new-array v5, v0, [Ljava/lang/Object;

    const/4 v6, 0x0

    aput-object v3, v5, v6

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v4, "PLU Price: %1$s"

    .line 159
    new-array v5, v0, [Ljava/lang/Object;

    aput-object p2, v5, v6

    invoke-static {v4, v5}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :try_start_0
    invoke-static {p2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v4

    const-string v5, "Failed to parse PLU price: %1$s"

    .line 167
    new-array v7, v0, [Ljava/lang/Object;

    aput-object p2, v7, v6

    invoke-static {v4, v5, v7}, Ltimber/log/Timber;->e(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move-object p2, v1

    :goto_0
    if-eqz p2, :cond_1

    const/high16 v4, 0x42c80000    # 100.0f

    mul-float p1, p1, v4

    float-to-int p1, p1

    .line 172
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-lt v4, p1, :cond_0

    const-string v1, "PLU Price Meets Criteria: priceScanned=%1$d, priceValidation=%2$d"

    .line 177
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v6

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v0

    .line 177
    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    move-object v1, v3

    goto :goto_1

    :cond_0
    const-string v3, "PLU Price DOES NOT Meet Criteria: priceScanned=%1$d, priceValidation=%2$d"

    .line 183
    new-array v2, v2, [Ljava/lang/Object;

    aput-object p2, v2, v6

    .line 186
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v2, v0

    .line 183
    invoke-static {v3, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1
    :goto_1
    return-object v1
.end method


# virtual methods
.method public tryToMatch(Lcom/ibotta/api/model/offer/ScanMetaCriteria;Ljava/lang/String;)Lcom/ibotta/android/verification/MatchOutcome;
    .locals 4

    .line 37
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 39
    instance-of v1, p1, Lcom/ibotta/api/model/OfferModel;

    if-eqz v1, :cond_1

    .line 41
    move-object v1, p1

    check-cast v1, Lcom/ibotta/api/model/OfferModel;

    .line 42
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getProducts()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 44
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getProductGroups()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 45
    invoke-interface {v1}, Lcom/ibotta/api/model/OfferModel;->getProductGroups()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/offer/ProductGroup;

    .line 46
    invoke-virtual {v2}, Lcom/ibotta/api/model/offer/ProductGroup;->getProducts()Ljava/util/Set;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 47
    invoke-virtual {v2}, Lcom/ibotta/api/model/offer/ProductGroup;->getProducts()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    .line 52
    :cond_1
    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->getProducts()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 56
    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->isRandomWeight()Z

    move-result v1

    .line 57
    invoke-interface {p1}, Lcom/ibotta/api/model/offer/ScanMetaCriteria;->getRandomWeightTotal()F

    move-result p1

    .line 55
    invoke-direct {p0, v1, p1, v0, p2}, Lcom/ibotta/android/verification/BarcodeMatcher;->tryToMatch(ZFLjava/util/Set;Ljava/lang/String;)Lcom/ibotta/android/verification/MatchOutcome;

    move-result-object p1

    return-object p1
.end method
