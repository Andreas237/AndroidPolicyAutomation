.class public Lcom/shopkick/app/bnc/BCProgramsListUtil;
.super Ljava/lang/Object;
.source "BCProgramsListUtil.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static canEnrollAnotherCardForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 87
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->buyAndCollectPrograms:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v2, v0

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    .line 88
    iget-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, p1, :cond_1

    .line 89
    iget-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->maxCards:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    goto :goto_0

    .line 92
    :cond_2
    invoke-static {p0, p1}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->numCardsForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)I

    move-result p0

    if-ge p0, v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    return v0
.end method

.method public static canEnrollAnotherMastercardCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z
    .locals 1

    const/16 v0, 0xa

    .line 23
    invoke-static {p0, v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollAnotherCardForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Z

    move-result p0

    return p0
.end method

.method public static canEnrollAnotherVisaCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z
    .locals 1

    const/16 v0, 0x8

    .line 19
    invoke-static {p0, v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollAnotherCardForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Z

    move-result p0

    return p0
.end method

.method public static canEnrollInMastercardProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z
    .locals 1

    const/16 v0, 0xa

    .line 15
    invoke-static {p0, v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollInProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Z

    move-result p0

    return p0
.end method

.method private static canEnrollInProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Z
    .locals 2

    const/4 v0, 0x0

    if-eqz p0, :cond_3

    .line 69
    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->buyAndCollectPrograms:Ljava/util/List;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->buyAndCollectPrograms:Ljava/util/List;

    .line 70
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 73
    :cond_0
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->buyAndCollectPrograms:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    .line 74
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v0
.end method

.method public static canEnrollInVisaProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Z
    .locals 1

    const/16 v0, 0x8

    .line 11
    invoke-static {p0, v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->canEnrollInProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Z

    move-result p0

    return p0
.end method

.method public static getCardholderConsent(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 59
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->buyAndCollectPrograms:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    .line 60
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    .line 61
    iget-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->cardholderConsentString:Ljava/lang/String;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getTermsAndConditionsUrlForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_1

    .line 48
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->buyAndCollectPrograms:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    .line 49
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_0

    .line 50
    iget-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->termsAndConditionsWebviewSkUrl:Ljava/lang/String;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static getVisaWebViewUrl(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)Ljava/lang/String;
    .locals 3

    if-eqz p0, :cond_1

    .line 36
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->buyAndCollectPrograms:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;

    .line 37
    iget-object v1, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    .line 38
    iget-object p0, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgram;->enrollWebview:Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;

    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/WebviewActionData;->url:Ljava/lang/String;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private static numCardsForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)I
    .locals 2

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    .line 100
    :cond_0
    iget-object p0, p0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;->enrolledCards:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    .line 101
    iget-object v1, v1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, p1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public static numMastercardCards(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)I
    .locals 1

    const/16 v0, 0xa

    .line 31
    invoke-static {p0, v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->numCardsForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)I

    move-result p0

    return p0
.end method

.method public static numVisaCards(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;)I
    .locals 1

    const/16 v0, 0x8

    .line 27
    invoke-static {p0, v0}, Lcom/shopkick/app/bnc/BCProgramsListUtil;->numCardsForProgram(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectProgramsListV4Response;I)I

    move-result p0

    return p0
.end method
