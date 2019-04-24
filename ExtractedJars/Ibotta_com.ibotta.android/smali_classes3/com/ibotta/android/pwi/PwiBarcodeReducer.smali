.class public final Lcom/ibotta/android/pwi/PwiBarcodeReducer;
.super Ljava/lang/Object;
.source "PwiBarcodeReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiBarcodeReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiBarcodeReducer.kt\ncom/ibotta/android/pwi/PwiBarcodeReducer\n*L\n1#1,72:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u000cX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000cX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/ibotta/android/pwi/PwiBarcodeReducer;",
        "",
        "formatting",
        "Lcom/ibotta/android/util/Formatting;",
        "resources",
        "Landroid/content/res/Resources;",
        "(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)V",
        "getFormatting",
        "()Lcom/ibotta/android/util/Formatting;",
        "getResources",
        "()Landroid/content/res/Resources;",
        "spentAlpha",
        "",
        "spentDrawableAlpha",
        "",
        "unspentAlpha",
        "unspentDrawableAlpha",
        "createPwiBarcodeViewState",
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;",
        "retailerModel",
        "Lcom/ibotta/api/model/RetailerModel;",
        "transaction",
        "Lcom/ibotta/api/model/pwi/BgcTransaction;",
        "createTermsSemiModalViewState",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewState;",
        "getGiftCardAmount",
        "",
        "getPin",
        "getPurchaseDate",
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
.field private final formatting:Lcom/ibotta/android/util/Formatting;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final resources:Landroid/content/res/Resources;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final spentAlpha:F

.field private final spentDrawableAlpha:I

.field private final unspentAlpha:F

.field private final unspentDrawableAlpha:I


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/util/Formatting;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "formatting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    iput-object p2, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->resources:Landroid/content/res/Resources;

    const/high16 p1, 0x3e800000    # 0.25f

    .line 15
    iput p1, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->spentAlpha:F

    const/high16 p1, 0x3f800000    # 1.0f

    .line 16
    iput p1, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->unspentAlpha:F

    const/16 p1, 0x40

    .line 17
    iput p1, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->spentDrawableAlpha:I

    const/16 p1, 0xff

    .line 18
    iput p1, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->unspentDrawableAlpha:I

    return-void
.end method

.method private final getGiftCardAmount(Lcom/ibotta/api/model/pwi/BgcTransaction;)Ljava/lang/String;
    .locals 3

    .line 65
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->isUpdatedBalance()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 66
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUpdatedBalance()D

    move-result-wide v1

    invoke-interface {v0, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object p1

    const-string v0, "formatting.currencyLeadZ\u2026ansaction.updatedBalance)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 68
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getFaceValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide v0

    .line 69
    iget-object p1, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1, v0, v1}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object p1

    const-string v0, "formatting.currencyLeadZero(initialAmount)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method private final getPin(Lcom/ibotta/api/model/pwi/BgcTransaction;)Ljava/lang/String;
    .locals 4

    .line 55
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getPin()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, ""

    .line 56
    :goto_1
    move-object v0, p1

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->resources:Landroid/content/res/Resources;

    sget v3, Lcom/ibotta/android/reducers/R$string;->pwi_card_pin:I

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p1, v1, v2

    invoke-virtual {v0, v3, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "resources.getString(R.string.pwi_card_pin, pin)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_3
    const-string p1, ""

    :goto_3
    return-object p1
.end method

.method private final getPurchaseDate(Lcom/ibotta/api/model/pwi/BgcTransaction;)Ljava/lang/String;
    .locals 4

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    new-instance v1, Ljava/util/Date;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getCreatedTime()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_amount_added_s:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "resources.getString(R.st\u2026mount_added_s, addedDate)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final createPwiBarcodeViewState(Lcom/ibotta/api/model/RetailerModel;Lcom/ibotta/api/model/pwi/BgcTransaction;)Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
    .locals 33
    .param p1    # Lcom/ibotta/api/model/RetailerModel;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/pwi/BgcTransaction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "transaction"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUuid()Ljava/lang/String;

    move-result-object v4

    const-string v2, "transaction.uuid"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardId()Ljava/lang/Long;

    move-result-object v2

    const/4 v3, -0x1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    long-to-int v2, v5

    move v5, v2

    goto :goto_0

    :cond_0
    const/4 v5, -0x1

    :goto_0
    if-eqz p1, :cond_1

    .line 23
    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    :goto_1
    if-eqz v6, :cond_2

    goto :goto_2

    :cond_2
    const-string v6, ""

    :goto_2
    if-eqz p1, :cond_3

    .line 24
    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/RetailerModel;->getId()I

    move-result v3

    move v8, v3

    goto :goto_3

    :cond_3
    const/4 v8, -0x1

    :goto_3
    if-eqz p1, :cond_4

    .line 25
    invoke-interface/range {p1 .. p1}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerName()Ljava/lang/String;

    move-result-object v3

    const-string v9, "transaction.retailerName"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    move-object v9, v3

    .line 26
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v10, "transaction.spent"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_5

    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_cbc:I

    goto :goto_5

    :cond_5
    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    :goto_5
    move v10, v3

    .line 27
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v11, "transaction.spent"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_6

    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_cbc:I

    goto :goto_6

    :cond_6
    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    :goto_6
    move v11, v3

    .line 28
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getBarcodeUrl()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_7

    :cond_7
    const/4 v3, 0x0

    :goto_7
    if-eqz v3, :cond_8

    goto :goto_8

    :cond_8
    const-string v3, ""

    :goto_8
    move-object v12, v3

    .line 29
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v14, "transaction.spent"

    invoke-static {v3, v14}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_9

    iget v3, v0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->spentAlpha:F

    goto :goto_9

    :cond_9
    iget v3, v0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->unspentAlpha:F

    :goto_9
    move v14, v3

    .line 30
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getCardNumber()Ljava/lang/String;

    move-result-object v3

    goto :goto_a

    :cond_a
    const/4 v3, 0x0

    :goto_a
    if-eqz v3, :cond_b

    goto :goto_b

    :cond_b
    const-string v3, ""

    :goto_b
    move-object v15, v3

    .line 31
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v2, "transaction.spent"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_c

    sget v2, Lcom/ibotta/android/reducers/R$color;->gray_cbc:I

    goto :goto_c

    :cond_c
    sget v2, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    .line 32
    :goto_c
    iget-object v3, v0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->resources:Landroid/content/res/Resources;

    sget v13, Lcom/ibotta/android/reducers/R$string;->pwi_copy_label:I

    invoke-virtual {v3, v13}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v13

    const-string v3, "resources.getString(R.string.pwi_copy_label)"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v7, "transaction.spent"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_d

    iget v3, v0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->spentDrawableAlpha:I

    goto :goto_d

    :cond_d
    iget v3, v0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->unspentDrawableAlpha:I

    :goto_d
    move/from16 v18, v3

    .line 34
    invoke-direct {v0, v1}, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->getPin(Lcom/ibotta/api/model/pwi/BgcTransaction;)Ljava/lang/String;

    move-result-object v20

    .line 35
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v7, "transaction.spent"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_e

    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_cbc:I

    goto :goto_e

    :cond_e
    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    :goto_e
    move/from16 v21, v3

    .line 36
    invoke-direct {v0, v1}, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->getGiftCardAmount(Lcom/ibotta/api/model/pwi/BgcTransaction;)Ljava/lang/String;

    move-result-object v24

    .line 37
    iget-object v3, v0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getFaceValue()Ljava/lang/String;

    move-result-object v7

    move/from16 v19, v2

    invoke-interface {v3, v7}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float v2, v2

    .line 38
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v7, "transaction.spent"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_f

    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_cbc:I

    goto :goto_f

    :cond_f
    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    :goto_f
    move/from16 v26, v3

    .line 39
    iget-object v3, v0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRewardAmount()Ljava/lang/String;

    move-result-object v7

    move/from16 v25, v2

    invoke-interface {v3, v7}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float v2, v2

    .line 40
    invoke-direct {v0, v1}, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->getPurchaseDate(Lcom/ibotta/api/model/pwi/BgcTransaction;)Ljava/lang/String;

    move-result-object v22

    .line 41
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v7, "transaction.spent"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_10

    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_cbc:I

    goto :goto_10

    :cond_10
    sget v3, Lcom/ibotta/android/reducers/R$color;->gray_94:I

    :goto_10
    move/from16 v23, v3

    .line 42
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    move-result-object v3

    if-eqz v3, :cond_11

    invoke-virtual {v3}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getTermsAndConditions()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v16, v3

    goto :goto_11

    :cond_11
    const/16 v16, 0x0

    :goto_11
    if-eqz v16, :cond_12

    move-object/from16 v28, v16

    goto :goto_12

    :cond_12
    const-string v3, ""

    move-object/from16 v28, v3

    .line 43
    :goto_12
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v7, "transaction.spent"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_13

    sget v3, Lcom/ibotta/android/reducers/R$color;->lightest_green:I

    goto :goto_13

    :cond_13
    sget v3, Lcom/ibotta/android/reducers/R$color;->blowhole_green:I

    :goto_13
    move/from16 v27, v3

    .line 44
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v7, "transaction.spent"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v29

    .line 45
    invoke-virtual/range {p2 .. p2}, Lcom/ibotta/api/model/pwi/BgcTransaction;->isUpdatedBalance()Z

    move-result v1

    if-eqz v1, :cond_14

    sget-object v1, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_14

    :cond_14
    sget-object v1, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    :goto_14
    move-object/from16 v30, v1

    const/16 v31, 0x208

    const/16 v32, 0x0

    .line 20
    new-instance v1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    move-object v3, v1

    const/4 v7, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v16, v19

    move/from16 v19, v27

    move/from16 v27, v2

    invoke-direct/range {v3 .. v32}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;-><init>(Ljava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/images/Sizes;ILjava/lang/String;IILjava/lang/String;Lcom/ibotta/android/views/images/Sizes;FLjava/lang/String;ILjava/lang/String;IILjava/lang/String;ILjava/lang/String;ILjava/lang/String;FIFLjava/lang/String;ZLcom/ibotta/android/views/components/Visibility;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final createTermsSemiModalViewState(Lcom/ibotta/api/model/pwi/BgcTransaction;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
    .locals 12
    .param p1    # Lcom/ibotta/api/model/pwi/BgcTransaction;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "transaction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_terms_of_use:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 50
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardMetaData()Lcom/ibotta/api/model/pwi/GiftCardMetaData;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/GiftCardMetaData;->getTermsAndConditions()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, ""

    :goto_1
    move-object v6, p1

    .line 51
    iget-object p1, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->common_close:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x65

    const/4 v11, 0x0

    .line 48
    new-instance p1, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v2 .. v11}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final getFormatting()Lcom/ibotta/android/util/Formatting;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 13
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiBarcodeReducer;->resources:Landroid/content/res/Resources;

    return-object v0
.end method
