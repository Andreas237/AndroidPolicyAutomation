.class public final Lcom/ibotta/android/retailer/RetailerSummaryReducer;
.super Ljava/lang/Object;
.source "RetailerSummaryReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRetailerSummaryReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetailerSummaryReducer.kt\ncom/ibotta/android/retailer/RetailerSummaryReducer\n*L\n1#1,40:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0018\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\u00060\u00062\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR \u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00060\u0006*\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/retailer/RetailerSummaryReducer;",
        "",
        "resources",
        "Landroid/content/res/Resources;",
        "(Landroid/content/res/Resources;)V",
        "summary",
        "",
        "Lcom/ibotta/api/model/RetailerModel;",
        "getSummary",
        "(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;",
        "typeText",
        "kotlin.jvm.PlatformType",
        "getTypeText",
        "create",
        "Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "retailerModel",
        "getBottomSubText",
        "getBottomText",
        "getBottomTextMaxLines",
        "",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final resources:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "resources"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->resources:Landroid/content/res/Resources;

    return-void
.end method

.method private final getBottomSubText(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 1

    .line 38
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getPercentCashBack()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    const-string p1, ""

    goto :goto_2

    :cond_2
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->getSummary(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private final getBottomText(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 1

    .line 35
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getPercentCashBack()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->getSummary(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getPercentCashBack()Ljava/lang/String;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method private final getBottomTextMaxLines(Lcom/ibotta/api/model/RetailerModel;)I
    .locals 1

    .line 32
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getPercentCashBack()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    const/4 v0, 0x1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    if-eqz p1, :cond_2

    const/4 v0, 0x2

    :cond_2
    return v0
.end method

.method private final getSummary(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 0
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 23
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getShortDescription()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    return-object p1
.end method

.method private final getTypeText(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;
    .locals 2
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 25
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getVerificationTypeEnum()Lcom/ibotta/api/model/common/VerificationType;

    move-result-object p1

    sget-object v0, Lcom/ibotta/api/model/common/VerificationType;->APP:Lcom/ibotta/api/model/common/VerificationType;

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne p1, v1, :cond_1

    .line 26
    iget-object p1, p0, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->common_online:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    .line 27
    iget-object p1, p0, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->offer_card_in_store:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/RetailerModel;)Lcom/ibotta/android/views/content/SummaryContentViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "retailerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Lcom/ibotta/android/views/content/SummaryContentViewState;

    .line 15
    invoke-interface {p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v1, "retailerModel.name"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->getBottomText(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object v5

    const-string v1, "getBottomText(retailerModel)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->getTypeText(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object v2

    const-string v1, "retailerModel.typeText"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    .line 18
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 19
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->getBottomTextMaxLines(Lcom/ibotta/api/model/RetailerModel;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/retailer/RetailerSummaryReducer;->getBottomSubText(Lcom/ibotta/api/model/RetailerModel;)Ljava/lang/String;

    move-result-object v8

    const/4 v3, 0x0

    const/4 v9, 0x2

    const/4 v10, 0x0

    move-object v1, v0

    .line 14
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/content/SummaryContentViewState;-><init>(Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
