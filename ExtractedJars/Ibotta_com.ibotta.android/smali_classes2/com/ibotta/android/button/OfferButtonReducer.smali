.class public final Lcom/ibotta/android/button/OfferButtonReducer;
.super Ljava/lang/Object;
.source "OfferButtonReducer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000cJ.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/button/OfferButtonReducer;",
        "",
        "shopButtonReducer",
        "Lcom/ibotta/android/button/ShopButtonReducer;",
        "unlockButtonReducer",
        "Lcom/ibotta/android/button/UnlockButtonReducer;",
        "offerHelper",
        "Lcom/ibotta/api/helper/offer/OfferHelper;",
        "(Lcom/ibotta/android/button/ShopButtonReducer;Lcom/ibotta/android/button/UnlockButtonReducer;Lcom/ibotta/api/helper/offer/OfferHelper;)V",
        "create",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "offerModel",
        "Lcom/ibotta/api/model/OfferModel;",
        "customer",
        "Lcom/ibotta/api/model/customer/Customer;",
        "isEditing",
        "",
        "isSelected",
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
.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final shopButtonReducer:Lcom/ibotta/android/button/ShopButtonReducer;

.field private final unlockButtonReducer:Lcom/ibotta/android/button/UnlockButtonReducer;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/button/ShopButtonReducer;Lcom/ibotta/android/button/UnlockButtonReducer;Lcom/ibotta/api/helper/offer/OfferHelper;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/button/ShopButtonReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/button/UnlockButtonReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/api/helper/offer/OfferHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "shopButtonReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unlockButtonReducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "offerHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/button/OfferButtonReducer;->shopButtonReducer:Lcom/ibotta/android/button/ShopButtonReducer;

    iput-object p2, p0, Lcom/ibotta/android/button/OfferButtonReducer;->unlockButtonReducer:Lcom/ibotta/android/button/UnlockButtonReducer;

    iput-object p3, p0, Lcom/ibotta/android/button/OfferButtonReducer;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    return-void
.end method

.method public static synthetic create$default(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/customer/Customer;ZZILjava/lang/Object;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    .line 17
    check-cast p2, Lcom/ibotta/api/model/customer/Customer;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 19
    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/button/OfferButtonReducer;->create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/customer/Customer;ZZ)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final create(Lcom/ibotta/api/model/OfferModel;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 8
    .param p1    # Lcom/ibotta/api/model/OfferModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "offerModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 13
    invoke-static/range {v1 .. v7}, Lcom/ibotta/android/button/OfferButtonReducer;->create$default(Lcom/ibotta/android/button/OfferButtonReducer;Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/customer/Customer;ZZILjava/lang/Object;)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object p1

    return-object p1
.end method

.method public final create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/customer/Customer;ZZ)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;
    .locals 2
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

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/button/OfferButtonReducer;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    invoke-interface {v0, p1}, Lcom/ibotta/api/helper/offer/OfferHelper;->isShopNow(Lcom/ibotta/api/model/OfferModel;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 20
    iget-object p1, p0, Lcom/ibotta/android/button/OfferButtonReducer;->shopButtonReducer:Lcom/ibotta/android/button/ShopButtonReducer;

    invoke-virtual {p1}, Lcom/ibotta/android/button/ShopButtonReducer;->create()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    .line 21
    iget-object v0, p0, Lcom/ibotta/android/button/OfferButtonReducer;->unlockButtonReducer:Lcom/ibotta/android/button/UnlockButtonReducer;

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/ibotta/android/button/UnlockButtonReducer;->create(Lcom/ibotta/api/model/OfferModel;Lcom/ibotta/api/model/customer/Customer;ZZ)Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
