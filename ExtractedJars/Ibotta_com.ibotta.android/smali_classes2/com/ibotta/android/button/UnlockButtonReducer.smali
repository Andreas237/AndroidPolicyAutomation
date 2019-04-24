.class public final Lcom/ibotta/android/button/UnlockButtonReducer;
.super Ljava/lang/Object;
.source "UnlockButtonReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0004H\u0003J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0003J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0003J\u001a\u0010\u0012\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u0004H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0006\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/button/UnlockButtonReducer;",
        "",
        "()V",
        "isNewUser",
        "",
        "Lcom/ibotta/api/model/customer/Customer;",
        "(Lcom/ibotta/api/model/customer/Customer;)Z",
        "create",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "customer",
        "isEditing",
        "isSelected",
        "getEditModeImageSource",
        "",
        "getImageSource",
        "getUnlockButtonContentDescription",
        "shouldShowMicroNudge",
        "isUnlocked",
        "ibotta-reducers_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getEditModeImageSource(Z)I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 46
    sget p1, Lcom/ibotta/android/reducers/R$drawable;->svg_icon_remove_select_my_offers_retailer_darkest_pink:I

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 47
    sget p1, Lcom/ibotta/android/reducers/R$drawable;->svg_icon_remove_my_offers_retailer_darkest_pink:I

    :goto_0
    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getImageSource(ZZ)I
    .locals 1
    .annotation build Landroid/support/annotation/DrawableRes;
    .end annotation

    if-nez p1, :cond_0

    .line 40
    sget p1, Lcom/ibotta/android/reducers/R$drawable;->new_button_add_plus:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 41
    invoke-direct {p0, p2}, Lcom/ibotta/android/button/UnlockButtonReducer;->getEditModeImageSource(Z)I

    move-result p1

    :goto_0
    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getUnlockButtonContentDescription(Lcom/ibotta/api/model/OfferModel;)I
    .locals 1
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation

    .line 51
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 52
    sget p1, Lcom/ibotta/android/reducers/R$string;->more_info_on_this_added_offer:I

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 53
    sget p1, Lcom/ibotta/android/reducers/R$string;->add_offer:I

    :goto_0
    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final isNewUser(Lcom/ibotta/api/model/customer/Customer;)Z
    .locals 5
    .param p1    # Lcom/ibotta/api/model/customer/Customer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 33
    :cond_0
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    const-string v2, "Calendar.getInstance()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    const-string v2, "Calendar.getInstance().time"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/api/model/customer/Customer;->getJoinDate()Ljava/util/Date;

    move-result-object p1

    const-string v3, "joinDate"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    const-wide/32 v3, 0x48190800

    cmp-long p1, v1, v3

    if-gtz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private final shouldShowMicroNudge(Lcom/ibotta/api/model/customer/Customer;Z)Z
    .locals 0

    if-nez p2, :cond_0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/button/UnlockButtonReducer;->isNewUser(Lcom/ibotta/api/model/customer/Customer;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/customer/Customer;ZZ)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 7
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/customer/Customer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "offerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    new-instance v0, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    .line 18
    invoke-direct {p0, p3, p4}, Lcom/ibotta/android/button/UnlockButtonReducer;->getImageSource(ZZ)I

    move-result v4

    .line 19
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result v2

    .line 20
    invoke-direct {p0, p1}, Lcom/ibotta/android/button/UnlockButtonReducer;->getUnlockButtonContentDescription(Lcom/ibotta/api/model/OfferModel;)I

    move-result v3

    .line 21
    invoke-interface {p1}, Lcom/ibotta/api/model/OfferModel;->isActivated()Z

    move-result p1

    invoke-direct {p0, p2, p1}, Lcom/ibotta/android/button/UnlockButtonReducer;->shouldShowMicroNudge(Lcom/ibotta/api/model/customer/Customer;Z)Z

    move-result v6

    const/4 v5, 0x1

    move-object v1, v0

    .line 16
    invoke-direct/range {v1 .. v6}, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;-><init>(ZIIZZ)V

    return-object v0
.end method
