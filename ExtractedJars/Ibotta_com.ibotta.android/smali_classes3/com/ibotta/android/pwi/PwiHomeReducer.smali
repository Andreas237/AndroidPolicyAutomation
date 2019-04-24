.class public final Lcom/ibotta/android/pwi/PwiHomeReducer;
.super Ljava/lang/Object;
.source "PwiHomeReducer.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiHomeReducer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiHomeReducer.kt\ncom/ibotta/android/pwi/PwiHomeReducer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,380:1\n1301#2:381\n1370#2,3:382\n667#2:385\n740#2,2:386\n1574#2,2:388\n1301#2:390\n1370#2,3:391\n1301#2:394\n1370#2,3:395\n*E\n*S KotlinDebug\n*F\n+ 1 PwiHomeReducer.kt\ncom/ibotta/android/pwi/PwiHomeReducer\n*L\n175#1:381\n175#1,3:382\n206#1:385\n206#1,2:386\n211#1,2:388\n229#1:390\n229#1,3:391\n231#1:394\n231#1,3:395\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ6\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eJ\u001e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u0006\u0010(\u001a\u00020!J$\u0010)\u001a\u00020*2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\'0,2\u0006\u0010-\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eJ$\u0010.\u001a\u00020/2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\'0,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001eJ\u0018\u00101\u001a\u00020%2\u0006\u0010&\u001a\u00020\'2\u0006\u00100\u001a\u00020\u001eH\u0002J$\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00160,2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020\'0,2\u0006\u0010-\u001a\u00020\u0016H\u0002J\u0016\u00103\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u0016J\u0006\u00104\u001a\u00020!J\u000e\u00105\u001a\u0002062\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001eH\u0002J,\u0010<\u001a\u00020=2\u000c\u0010>\u001a\u0008\u0012\u0004\u0012\u00020:0,2\u0006\u0010;\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BJ \u0010C\u001a\n E*\u0004\u0018\u00010D0D2\u0006\u0010&\u001a\u00020\'2\u0006\u00100\u001a\u00020\u001eH\u0002J\u0018\u0010F\u001a\n E*\u0004\u0018\u00010D0D2\u0006\u0010A\u001a\u00020BH\u0002J&\u0010G\u001a\u0010\u0012\u000c\u0012\n E*\u0004\u0018\u00010\'0\'0,2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u00100\u001a\u00020\u001eH\u0002J\u0010\u0010H\u001a\u00020I2\u0006\u0010\u001d\u001a\u00020\u001eH\u0003J\u0018\u0010J\u001a\n E*\u0004\u0018\u00010D0D2\u0006\u0010&\u001a\u00020\'H\u0002J \u0010K\u001a\n E*\u0004\u0018\u00010D0D2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001eH\u0002J\u0018\u0010L\u001a\u00020I2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001eH\u0002J \u0010M\u001a\n E*\u0004\u0018\u00010D0D2\u0006\u0010N\u001a\u00020I2\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010O\u001a\u00020@2\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\u001eH\u0002J\u0018\u0010P\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'2\u0006\u00100\u001a\u00020\u001eH\u0002J\u0010\u0010Q\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\'H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\u00a8\u0006R"
    }
    d2 = {
        "Lcom/ibotta/android/pwi/PwiHomeReducer;",
        "",
        "appHelper",
        "Lcom/ibotta/android/util/AppHelper;",
        "formatting",
        "Lcom/ibotta/android/util/Formatting;",
        "resources",
        "Landroid/content/res/Resources;",
        "iblvReducer",
        "Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
        "(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V",
        "getAppHelper",
        "()Lcom/ibotta/android/util/AppHelper;",
        "getFormatting",
        "()Lcom/ibotta/android/util/Formatting;",
        "getIblvReducer",
        "()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;",
        "getResources",
        "()Landroid/content/res/Resources;",
        "createAddMoneyViewState",
        "Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;",
        "paymentOptionViewState",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
        "buyableGiftCardModel",
        "Lcom/ibotta/api/model/BuyableGiftCardModel;",
        "purchaseAmount",
        "",
        "purchaseAmountState",
        "Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;",
        "shouldShowConfirmationDialog",
        "",
        "hasGooglePaySupport",
        "createConfirmationDialogViewState",
        "Lcom/ibotta/android/views/messages/alert/SemiModalViewState;",
        "bgcModel",
        "defaultPaymentOption",
        "createGooglePayOptionRowViewState",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;",
        "paymentMethod",
        "Lcom/ibotta/api/model/pwi/PwiPaymentMethod;",
        "createOrderedButFailedDialogViewState",
        "createPaymentMethodSelectorViewState",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;",
        "paymentMethods",
        "",
        "selectedMethod",
        "createPaymentMethodsViewState",
        "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;",
        "isGooglePayDefault",
        "createPaymentOptionRowViewState",
        "createPaymentOptionRowViewStates",
        "createPaymentOptionViewState",
        "createPendingTxnDialogViewState",
        "createToolbarViewState",
        "Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;",
        "createTransactionViewState",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;",
        "transaction",
        "Lcom/ibotta/api/model/pwi/BgcTransaction;",
        "isWallet",
        "createTransactionsViewState",
        "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;",
        "transactions",
        "manageAllButtonVisibility",
        "Lcom/ibotta/android/views/components/Visibility;",
        "spentFilter",
        "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
        "getCardLabel",
        "",
        "kotlin.jvm.PlatformType",
        "getEmptyTransactionsText",
        "getGooglePayRow",
        "getPayButtonText",
        "",
        "getPaymentOptionName",
        "getRetailerName",
        "getRetailerNameTextColorResId",
        "getSpentFilterText",
        "transactionsSize",
        "getUpdatedTextVisibility",
        "isCardDefault",
        "isExpired",
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
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final formatting:Lcom/ibotta/android/util/Formatting;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final iblvReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final resources:Landroid/content/res/Resources;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/util/Formatting;Landroid/content/res/Resources;Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/util/AppHelper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/util/Formatting;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/res/Resources;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appHelper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "formatting"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "resources"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "iblvReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iput-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    iput-object p3, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    iput-object p4, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->iblvReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    return-void
.end method

.method private final createGooglePayOptionRowViewState(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;)Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
    .locals 10

    .line 257
    new-instance v9, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    .line 258
    sget v1, Lcom/ibotta/views/R$drawable;->svg_icn_google_pay:I

    .line 260
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->isDefaultSource()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_last_four_card_default:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getName()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v0, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    .line 262
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getName()Ljava/lang/String;

    move-result-object v0

    move-object v3, v0

    :goto_0
    const-string v0, "if (paymentMethod.isDefa\u2026  else paymentMethod.name"

    .line 260
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 263
    sget-object v4, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    .line 264
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->isDefaultSource()Z

    move-result v5

    .line 265
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getSourceId()Ljava/lang/String;

    move-result-object v6

    const-string v0, "paymentMethod.sourceId"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, ""

    .line 267
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getCardType()Ljava/lang/String;

    move-result-object p1

    const-string v0, "paymentMethod.cardType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v2, -0x1

    move-object v0, v9

    .line 257
    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;-><init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v9
.end method

.method private final createPaymentOptionRowViewState(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Z)Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
    .locals 10

    .line 237
    new-instance v9, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    .line 238
    sget-object v0, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->INSTANCE:Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getCardBrand()Ljava/lang/String;

    move-result-object v1

    const-string v2, "paymentMethod.cardBrand"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->getBrandResId(Ljava/lang/String;)I

    move-result v1

    .line 240
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getCardLabel(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Z)Ljava/lang/String;

    move-result-object v3

    const-string v0, "getCardLabel(paymentMethod, isGooglePayDefault)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 241
    sget-object v4, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->STRIPE_SOURCE:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    .line 242
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->isCardDefault(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Z)Z

    move-result v5

    .line 243
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getSourceId()Ljava/lang/String;

    move-result-object v6

    const-string p2, "paymentMethod.sourceId"

    invoke-static {v6, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 244
    iget-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getExpiryYear()I

    move-result v0

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getExpiryMonth()I

    move-result v2

    invoke-interface {p2, v0, v2}, Lcom/ibotta/android/util/Formatting;->dateStringFromCardExpiration(II)Ljava/lang/String;

    move-result-object v7

    const-string p2, "formatting.dateStringFro\u2026aymentMethod.expiryMonth)"

    invoke-static {v7, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getCardType()Ljava/lang/String;

    move-result-object p1

    const-string p2, "paymentMethod.cardType"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/text/StringsKt;->capitalize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const/4 v2, -0x1

    move-object v0, v9

    .line 237
    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;-><init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v9
.end method

.method private final createPaymentOptionRowViewStates(Ljava/util/List;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/pwi/PwiPaymentMethod;",
            ">;",
            "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
            ")",
            "Ljava/util/List<",
            "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
            ">;"
        }
    .end annotation

    .line 175
    check-cast p1, Ljava/lang/Iterable;

    .line 381
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v0, Ljava/util/Collection;

    .line 382
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 383
    check-cast v1, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    .line 175
    invoke-virtual {p0, v1, p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createPaymentOptionViewState(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 384
    :cond_0
    check-cast v0, Ljava/util/List;

    return-object v0
.end method

.method private final createTransactionViewState(Lcom/ibotta/api/model/pwi/BgcTransaction;Z)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;
    .locals 33

    move-object/from16 v0, p0

    .line 270
    iget-object v1, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getFaceValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide v1

    .line 271
    iget-object v3, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRewardAmount()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, ""

    :goto_1
    invoke-interface {v3, v4}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide v3

    .line 273
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUuid()Ljava/lang/String;

    move-result-object v7

    const-string v6, "transaction.uuid"

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getGiftCardId()Ljava/lang/Long;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    long-to-int v6, v8

    move v8, v6

    goto :goto_2

    :cond_2
    const/4 v6, -0x1

    const/4 v8, -0x1

    .line 275
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerId()I

    move-result v9

    .line 276
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v6

    const-string v10, "transaction.spent"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    .line 277
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-interface {v6}, Lcom/ibotta/api/model/RetailerModel;->getLargeIconUrl()Ljava/lang/String;

    move-result-object v5

    :cond_3
    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    const-string v5, ""

    :goto_3
    move-object v11, v5

    if-eqz p2, :cond_5

    .line 278
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_5

    sget-object v5, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_4

    :cond_5
    sget-object v5, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    :goto_4
    move-object v13, v5

    if-eqz p2, :cond_6

    .line 279
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "transaction.spent"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_6

    sget-object v5, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_5

    :cond_6
    sget-object v5, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    :goto_5
    move-object v14, v5

    if-nez p2, :cond_7

    .line 280
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "transaction.spent"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_7

    iget-object v5, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v6, Lcom/ibotta/android/reducers/R$string;->pwi_spent:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_6

    :cond_7
    invoke-direct/range {p0 .. p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getRetailerName(Lcom/ibotta/api/model/pwi/BgcTransaction;Z)Ljava/lang/String;

    move-result-object v5

    :goto_6
    move-object v15, v5

    const-string v5, "if (!isWallet && transac\u2026me(transaction, isWallet)"

    invoke-static {v15, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    invoke-direct/range {p0 .. p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getRetailerNameTextColorResId(Lcom/ibotta/api/model/pwi/BgcTransaction;Z)I

    move-result v16

    if-nez p2, :cond_8

    .line 282
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "transaction.spent"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_8

    const/4 v5, 0x1

    const/16 v17, 0x1

    goto :goto_7

    :cond_8
    const/4 v5, 0x0

    const/16 v17, 0x0

    :goto_7
    if-eqz p2, :cond_9

    .line 283
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v5

    const-string v6, "transaction.spent"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-eqz v5, :cond_9

    sget v5, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    goto :goto_8

    :cond_9
    sget v5, Lcom/ibotta/android/reducers/R$color;->gray_94:I

    :goto_8
    move/from16 v18, v5

    .line 284
    iget-object v5, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    new-instance v6, Ljava/util/Date;

    move-object/from16 v20, v13

    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getCreatedTime()J

    move-result-wide v12

    invoke-direct {v6, v12, v13}, Ljava/util/Date;-><init>(J)V

    invoke-interface {v5, v6}, Lcom/ibotta/android/util/Formatting;->date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "formatting.date(Date(transaction.createdTime))"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_a

    .line 285
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v6

    const-string v12, "transaction.spent"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_a

    sget v6, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    goto :goto_9

    :cond_a
    sget v6, Lcom/ibotta/android/reducers/R$color;->gray_94:I

    :goto_9
    move/from16 v21, v6

    .line 286
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->isUpdatedBalance()Z

    move-result v6

    if-eqz v6, :cond_b

    iget-object v1, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getUpdatedBalance()D

    move-result-wide v12

    invoke-interface {v1, v12, v13}, Lcom/ibotta/android/util/Formatting;->currency(D)Ljava/lang/String;

    move-result-object v1

    goto :goto_a

    :cond_b
    iget-object v6, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v6, v1, v2}, Lcom/ibotta/android/util/Formatting;->currency(D)Ljava/lang/String;

    move-result-object v1

    :goto_a
    const-string v2, "if (transaction.isUpdate\u2026.currency(giftCardAmount)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_c

    .line 287
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v2

    const-string v6, "transaction.spent"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_c

    sget v2, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    goto :goto_b

    :cond_c
    sget v2, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    :goto_b
    move/from16 v22, v2

    .line 288
    iget-object v2, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getFaceValue()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v6}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide v12

    double-to-float v2, v12

    if-eqz p2, :cond_d

    .line 289
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v6

    const-string v12, "transaction.spent"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_d

    sget v6, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    goto :goto_c

    :cond_d
    sget v6, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    :goto_c
    move/from16 v24, v6

    .line 290
    iget-object v6, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v6, v3, v4}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v3

    const-string v4, "formatting.currencyLeadZero(earningsAmount)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_e

    .line 291
    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v4

    const-string v6, "transaction.spent"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_e

    sget v4, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    goto :goto_d

    :cond_e
    sget v4, Lcom/ibotta/android/reducers/R$color;->blowhole_green:I

    :goto_d
    move/from16 v26, v4

    .line 292
    iget-object v4, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual/range {p1 .. p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRewardAmount()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Lcom/ibotta/android/util/Formatting;->currencyFromString(Ljava/lang/String;)D

    move-result-wide v12

    double-to-float v4, v12

    if-eqz p2, :cond_f

    .line 293
    sget-object v6, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_e

    :cond_f
    sget-object v6, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    :goto_e
    move-object/from16 v28, v6

    .line 294
    invoke-direct/range {p0 .. p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getUpdatedTextVisibility(Lcom/ibotta/api/model/pwi/BgcTransaction;Z)Lcom/ibotta/android/views/components/Visibility;

    move-result-object v29

    const/16 v30, 0x20

    const/16 v31, 0x0

    .line 272
    new-instance v32, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    move-object/from16 v6, v32

    const/4 v12, 0x0

    move-object/from16 v13, v20

    move-object/from16 v19, v5

    move/from16 v20, v21

    move-object/from16 v21, v1

    move/from16 v23, v2

    move-object/from16 v25, v3

    move/from16 v27, v4

    invoke-direct/range {v6 .. v31}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;-><init>(Ljava/lang/String;IIZLjava/lang/String;Lcom/ibotta/android/views/images/Sizes;Lcom/ibotta/android/views/components/Visibility;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;IZILjava/lang/String;ILjava/lang/String;IFILjava/lang/String;IFLcom/ibotta/android/views/components/Visibility;Lcom/ibotta/android/views/components/Visibility;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v32
.end method

.method private final getCardLabel(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Z)Ljava/lang/String;
    .locals 3

    .line 252
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->isCardDefault(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Z)Z

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    .line 253
    iget-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_last_four_card_default_x:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-virtual {p2, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 255
    :cond_0
    iget-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_last_four_card:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-virtual {p2, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final getEmptyTransactionsText(Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Ljava/lang/String;
    .locals 1

    .line 368
    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$3:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    .line 371
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->pwi_empty_transactions_unspent:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 370
    :pswitch_1
    iget-object p1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->pwi_empty_transactions_spent:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 369
    :pswitch_2
    iget-object p1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->pwi_no_gift_cards:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getGooglePayRow(ZZ)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ)",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/pwi/PwiPaymentMethod;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 350
    invoke-static {}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->builder()Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object p1

    .line 351
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_google_pay:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->name(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 352
    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->expiryMonth(I)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object p1

    .line 353
    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->expiryYear(I)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object p1

    .line 354
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v1, Lcom/ibotta/android/reducers/R$string;->pwi_google_pay:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->sourceType(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object p1

    .line 355
    invoke-virtual {p1, p2}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->defaultSource(Z)Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;

    move-result-object p1

    .line 356
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod$Builder;->build()Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    move-result-object p1

    .line 350
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    .line 358
    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private final getPayButtonText(Z)I
    .locals 1
    .annotation build Landroid/support/annotation/StringRes;
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 377
    sget p1, Lcom/ibotta/android/reducers/R$string;->pwi_review_payment:I

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 378
    sget p1, Lcom/ibotta/android/reducers/R$string;->pwi_pay:I

    :goto_0
    return p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getPaymentOptionName(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;)Ljava/lang/String;
    .locals 4

    .line 164
    invoke-direct {p0, p1}, Lcom/ibotta/android/pwi/PwiHomeReducer;->isExpired(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    .line 165
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v3, Lcom/ibotta/android/reducers/R$string;->pwi_last_four_card_expired:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-virtual {v0, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    .line 166
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v3, Lcom/ibotta/android/reducers/R$string;->pwi_last_four_card:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-virtual {v0, v3, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getRetailerName(Lcom/ibotta/api/model/pwi/BgcTransaction;Z)Ljava/lang/String;
    .locals 3

    .line 328
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->isUpdatedBalance()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-ne p2, v2, :cond_1

    .line 329
    iget-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->pwi_retailer_name_updated_home:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v1

    invoke-virtual {p2, v0, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    .line 330
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getRetailerName()Ljava/lang/String;

    move-result-object p1

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final getRetailerNameTextColorResId(Lcom/ibotta/api/model/pwi/BgcTransaction;Z)I
    .locals 2

    .line 340
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v0

    const-string v1, "transaction.spent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 341
    sget p1, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    goto :goto_0

    .line 342
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object p1

    const-string v0, "transaction.spent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    if-nez p2, :cond_1

    .line 343
    sget p1, Lcom/ibotta/android/reducers/R$color;->blowhole_green:I

    goto :goto_0

    .line 345
    :cond_1
    sget p1, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    :goto_0
    return p1
.end method

.method private final getSpentFilterText(ILcom/ibotta/android/views/pwi/wallet/SpentFilter;)Ljava/lang/String;
    .locals 3

    .line 361
    sget-object v0, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$2:[I

    invoke-virtual {p2}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    packed-switch p2, :pswitch_data_0

    .line 364
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_spent_filter_unspent:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-virtual {p2, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 363
    :pswitch_1
    iget-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_spent_filter_spent:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-virtual {p2, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 362
    :pswitch_2
    iget-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_spent_filter_all:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v1, v0

    invoke-virtual {p2, v2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final getUpdatedTextVisibility(Lcom/ibotta/api/model/pwi/BgcTransaction;Z)Lcom/ibotta/android/views/components/Visibility;
    .locals 1

    .line 334
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/BgcTransaction;->isUpdatedBalance()Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-ne p1, v0, :cond_1

    .line 335
    sget-object p1, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    .line 336
    sget-object p1, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final isCardDefault(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Z)Z
    .locals 0

    .line 249
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->isDefaultSource()Z

    move-result p1

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final isExpired(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;)Z
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getExpiryYear()I

    move-result v1

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getExpiryMonth()I

    move-result p1

    invoke-interface {v0, v1, p1}, Lcom/ibotta/android/util/Formatting;->dateFromCardExpiration(II)Ljava/util/Date;

    move-result-object p1

    .line 171
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1, v0}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final createAddMoneyViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;Lcom/ibotta/api/model/BuyableGiftCardModel;DLcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;ZZ)Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;
    .locals 16
    .param p1    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/api/model/BuyableGiftCardModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-wide/from16 v1, p3

    move/from16 v3, p6

    const-string v4, "paymentOptionViewState"

    move-object/from16 v11, p1

    invoke-static {v11, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "buyableGiftCardModel"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "purchaseAmountState"

    move-object/from16 v6, p5

    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    sget-object v4, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p5 .. p5}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyView$PwiPurchaseAmountState;->ordinal()I

    move-result v6

    aget v4, v4, v6

    const/4 v6, 0x0

    const/4 v7, 0x1

    packed-switch v4, :pswitch_data_0

    .line 138
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :pswitch_0
    new-instance v4, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    .line 140
    iget-object v9, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v9, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v9

    const-string v10, "formatting.currencyLeadZero(purchaseAmount)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    sget v10, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    .line 142
    iget-object v12, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v13, Lcom/ibotta/android/reducers/R$string;->pwi_youll_earn_active:I

    new-array v7, v7, [Ljava/lang/Object;

    iget-object v14, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 143
    invoke-interface/range {p2 .. p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result v5

    move-object v15, v9

    float-to-double v8, v5

    .line 142
    invoke-interface {v14, v1, v2, v8, v9}, Lcom/ibotta/android/util/Formatting;->rewardAmountLeadingZero(DD)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v7, v6

    invoke-virtual {v12, v13, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v1, "resources.getString(R.st\u2026rdPercentage.toDouble()))"

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 144
    sget-object v1, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {v1}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getENABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v1

    const/4 v12, 0x1

    .line 147
    invoke-direct {v0, v3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getPayButtonText(Z)I

    move-result v13

    move-object v5, v4

    const/4 v2, 0x0

    move v6, v2

    move-object v7, v15

    move v8, v10

    move-object v10, v1

    move-object/from16 v11, p1

    move/from16 v14, p7

    .line 138
    invoke-direct/range {v5 .. v14}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;-><init>(ZLjava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;ZIZ)V

    move-object v1, v4

    goto/16 :goto_0

    .line 125
    :pswitch_1
    new-instance v4, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    const/4 v8, 0x0

    .line 127
    iget-object v9, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v9, v1, v2}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v1

    const-string v2, "formatting.currencyLeadZero(purchaseAmount)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 128
    sget v2, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    .line 129
    iget-object v9, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    .line 130
    sget v10, Lcom/ibotta/android/reducers/R$string;->pwi_invalid_amount_message_pink:I

    const/4 v12, 0x2

    new-array v12, v12, [Ljava/lang/Object;

    .line 131
    invoke-interface/range {p2 .. p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getMinPurchaseAmount()F

    move-result v13

    invoke-static {v13}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v13

    aput-object v13, v12, v6

    .line 132
    invoke-interface/range {p2 .. p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getMaxPurchaseAmount()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    aput-object v5, v12, v7

    .line 129
    invoke-virtual {v9, v10, v12}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "resources.getString(\n   \u2026dModel.maxPurchaseAmount)"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    sget-object v5, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {v5}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getENABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v10

    const/4 v12, 0x0

    .line 136
    invoke-direct {v0, v3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getPayButtonText(Z)I

    move-result v13

    move-object v5, v4

    move v6, v8

    move-object v7, v1

    move v8, v2

    move-object/from16 v11, p1

    move/from16 v14, p7

    .line 125
    invoke-direct/range {v5 .. v14}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;-><init>(ZLjava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;ZIZ)V

    move-object v1, v4

    goto/16 :goto_0

    .line 114
    :pswitch_2
    new-instance v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    const/4 v2, 0x0

    const-string v4, "$0.00"

    .line 117
    sget v8, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    .line 118
    iget-object v9, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v10, Lcom/ibotta/android/reducers/R$string;->pwi_youll_earn_active:I

    new-array v7, v7, [Ljava/lang/Object;

    .line 119
    iget-object v12, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface/range {p2 .. p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result v5

    invoke-interface {v12, v5}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v7, v6

    .line 118
    invoke-virtual {v9, v10, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "resources.getString(R.st\u2026dModel.rewardPercentage))"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 120
    sget-object v5, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {v5}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getENABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v10

    const/4 v12, 0x0

    .line 123
    invoke-direct {v0, v3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getPayButtonText(Z)I

    move-result v13

    move-object v5, v1

    move v6, v2

    move-object v7, v4

    move-object/from16 v11, p1

    move/from16 v14, p7

    .line 114
    invoke-direct/range {v5 .. v14}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;-><init>(ZLjava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;ZIZ)V

    goto/16 :goto_0

    .line 103
    :pswitch_3
    new-instance v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    const/4 v2, 0x0

    const-string v4, "$0.00"

    .line 106
    sget v8, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    .line 107
    iget-object v9, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v10, Lcom/ibotta/android/reducers/R$string;->pwi_youll_earn_active:I

    new-array v7, v7, [Ljava/lang/Object;

    .line 108
    iget-object v12, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface/range {p2 .. p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result v5

    invoke-interface {v12, v5}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v7, v6

    .line 107
    invoke-virtual {v9, v10, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "resources.getString(R.st\u2026dModel.rewardPercentage))"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    sget-object v5, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {v5}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getENABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v10

    const/4 v12, 0x0

    .line 112
    invoke-direct {v0, v3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getPayButtonText(Z)I

    move-result v13

    move-object v5, v1

    move v6, v2

    move-object v7, v4

    move-object/from16 v11, p1

    move/from16 v14, p7

    .line 103
    invoke-direct/range {v5 .. v14}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;-><init>(ZLjava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;ZIZ)V

    goto/16 :goto_0

    .line 92
    :pswitch_4
    new-instance v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    const/4 v2, 0x0

    const-string v4, "$0.00"

    .line 95
    sget v8, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    .line 96
    iget-object v9, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v10, Lcom/ibotta/android/reducers/R$string;->pwi_youll_earn_inactive:I

    new-array v7, v7, [Ljava/lang/Object;

    .line 97
    iget-object v12, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface/range {p2 .. p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result v5

    invoke-interface {v12, v5}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v7, v6

    .line 96
    invoke-virtual {v9, v10, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "resources.getString(R.st\u2026dModel.rewardPercentage))"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    sget-object v5, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {v5}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getDISABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v10

    const/4 v12, 0x0

    .line 101
    invoke-direct {v0, v3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getPayButtonText(Z)I

    move-result v13

    move-object v5, v1

    move v6, v2

    move-object v7, v4

    move-object/from16 v11, p1

    move/from16 v14, p7

    .line 92
    invoke-direct/range {v5 .. v14}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;-><init>(ZLjava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;ZIZ)V

    goto/16 :goto_0

    .line 81
    :pswitch_5
    new-instance v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    const/4 v2, 0x0

    const-string v4, "$0.00"

    .line 84
    sget v8, Lcom/ibotta/android/reducers/R$color;->gray_cc:I

    .line 85
    iget-object v9, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v10, Lcom/ibotta/android/reducers/R$string;->pwi_youll_earn_inactive:I

    new-array v7, v7, [Ljava/lang/Object;

    .line 86
    iget-object v12, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface/range {p2 .. p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result v5

    invoke-interface {v12, v5}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v7, v6

    .line 85
    invoke-virtual {v9, v10, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "resources.getString(R.st\u2026dModel.rewardPercentage))"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 87
    sget-object v5, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {v5}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getDISABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v10

    const/4 v12, 0x0

    .line 90
    invoke-direct {v0, v3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getPayButtonText(Z)I

    move-result v13

    move-object v5, v1

    move v6, v2

    move-object v7, v4

    move-object/from16 v11, p1

    move/from16 v14, p7

    .line 81
    invoke-direct/range {v5 .. v14}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;-><init>(ZLjava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;ZIZ)V

    goto :goto_0

    .line 70
    :pswitch_6
    new-instance v1, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;

    const/4 v2, 0x1

    const-string v4, "$0.00"

    .line 73
    sget v8, Lcom/ibotta/android/reducers/R$color;->gray_4a:I

    .line 74
    iget-object v9, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v10, Lcom/ibotta/android/reducers/R$string;->pwi_youll_earn_active:I

    new-array v7, v7, [Ljava/lang/Object;

    .line 75
    iget-object v12, v0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface/range {p2 .. p2}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result v5

    invoke-interface {v12, v5}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object v5

    aput-object v5, v7, v6

    .line 74
    invoke-virtual {v9, v10, v7}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "resources.getString(R.st\u2026dModel.rewardPercentage))"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    sget-object v5, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;->Companion:Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;

    invoke-virtual {v5}, Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState$Companion;->getENABLED()Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;

    move-result-object v10

    const/4 v12, 0x0

    .line 79
    invoke-direct {v0, v3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getPayButtonText(Z)I

    move-result v13

    move-object v5, v1

    move v6, v2

    move-object v7, v4

    move-object/from16 v11, p1

    move/from16 v14, p7

    .line 70
    invoke-direct/range {v5 .. v14}, Lcom/ibotta/android/views/pwi/home/PwiAddMoneyViewState;-><init>(ZLjava/lang/String;ILjava/lang/String;Lcom/ibotta/android/views/pwi/home/numberpad/PwiNumberPadViewState;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;ZIZ)V

    :goto_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final createConfirmationDialogViewState(Lcom/ibotta/api/model/BuyableGiftCardModel;DLcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
    .locals 7
    .param p1    # Lcom/ibotta/api/model/BuyableGiftCardModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "bgcModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultPaymentOption"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;-><init>()V

    .line 320
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_confirm_purchase_prompt_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026rm_purchase_prompt_title)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 321
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_confirm_purchase_prompt:I

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v4, p2, p3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    .line 322
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v3, v4

    invoke-virtual {p4}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getCardType()Ljava/lang/String;

    move-result-object p1

    const/4 v6, 0x2

    aput-object p1, v3, v6

    invoke-virtual {p4}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 p4, 0x3

    aput-object p1, v3, p4

    .line 321
    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p4, "resources.getString(R.st\u2026efaultPaymentOption.name)"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 323
    iget-object p4, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v0, Lcom/ibotta/android/reducers/R$string;->pwi_pay_s:I

    new-array v1, v4, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {v2, p2, p3}, Lcom/ibotta/android/util/Formatting;->currencyLeadZero(D)Ljava/lang/String;

    move-result-object p2

    aput-object p2, v1, v5

    invoke-virtual {p4, v0, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "resources.getString(R.st\u2026LeadZero(purchaseAmount))"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 324
    iget-object p2, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget p3, Lcom/ibotta/android/reducers/R$string;->pwi_do_not_show_this_again:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    const-string p3, "resources.getString(R.st\u2026i_do_not_show_this_again)"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->checkBoxText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object p1

    .line 325
    invoke-virtual {p1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object p1

    return-object p1
.end method

.method public final createOrderedButFailedDialogViewState()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 298
    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;-><init>()V

    .line 299
    sget v1, Lcom/ibotta/android/reducers/R$drawable;->svg_pwi_no_payment_method:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->imageId(I)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 300
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_order_placed_failed_to_fetch_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026ed_failed_to_fetch_title)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 301
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_order_placed_failed_to_fetch_message:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026_failed_to_fetch_message)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 302
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_order_placed_failed_to_fetch_check_status:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026ed_to_fetch_check_status)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 303
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_error_close:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.string.pwi_error_close)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->secondaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 304
    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v0

    return-object v0
.end method

.method public final createPaymentMethodSelectorViewState(Ljava/util/List;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;Z)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/pwi/PwiPaymentMethod;",
            ">;",
            "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;",
            "Z)",
            "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    sget-object v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    .line 183
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createPaymentOptionRowViewStates(Ljava/util/List;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 182
    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    if-eqz p3, :cond_0

    .line 185
    check-cast p1, Ljava/util/Collection;

    sget-object p2, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->GOOGLE_PAY:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 187
    :cond_0
    new-instance p2, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;-><init>(Ljava/util/List;)V

    return-object p2
.end method

.method public final createPaymentMethodsViewState(Ljava/util/List;ZZ)Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;
    .locals 5
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/pwi/PwiPaymentMethod;",
            ">;ZZ)",
            "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->iblvReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    new-instance v1, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    .line 229
    check-cast p1, Ljava/lang/Iterable;

    .line 390
    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    check-cast v2, Ljava/util/Collection;

    .line 391
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 392
    check-cast v4, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    .line 229
    invoke-direct {p0, v4, p3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createPaymentOptionRowViewState(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Z)Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 393
    :cond_0
    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/util/Collection;

    .line 230
    invoke-direct {p0, p2, p3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getGooglePayRow(ZZ)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 394
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result p3

    invoke-direct {p2, p3}, Ljava/util/ArrayList;-><init>(I)V

    check-cast p2, Ljava/util/Collection;

    .line 395
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    .line 396
    check-cast p3, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;

    const-string v3, "it"

    .line 231
    invoke-static {p3, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p3}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createGooglePayOptionRowViewState(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;)Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    move-result-object p3

    invoke-interface {p2, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 397
    :cond_1
    check-cast p2, Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    .line 230
    invoke-static {v2, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    .line 232
    sget-object p2, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->ADD_CARD:Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;

    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p1, p2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    .line 229
    invoke-virtual {v1, p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    .line 233
    sget-object p2, Lcom/ibotta/android/ilv/ListType;->VERTICAL:Lcom/ibotta/android/ilv/ListType;

    .line 228
    invoke-virtual {v0, p1, p2}, Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;->buildWithStyle(Lcom/ibotta/android/views/list/IbottaListViewState$Builder;Lcom/ibotta/android/ilv/ListType;)Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    new-instance p2, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;

    invoke-direct {p2, p1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;-><init>(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    return-object p2
.end method

.method public final createPaymentOptionViewState(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/pwi/PwiPaymentMethod;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedMethod"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    new-instance v0, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;

    .line 153
    sget-object v1, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->INSTANCE:Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;

    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getCardBrand()Ljava/lang/String;

    move-result-object v2

    const-string v3, "paymentMethod.cardBrand"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/ibotta/android/views/pwi/BgcBrandAssetHelper;->getBrandResId(Ljava/lang/String;)I

    move-result v2

    .line 155
    invoke-direct {p0, p1}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getPaymentOptionName(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;)Ljava/lang/String;

    move-result-object v4

    const-string v1, "getPaymentOptionName(paymentMethod)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    sget-object v5, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->STRIPE_SOURCE:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    .line 157
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->isDefaultSource()Z

    move-result v6

    .line 158
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getSourceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;->getSourceId()Ljava/lang/String;

    move-result-object p2

    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    .line 159
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getSourceId()Ljava/lang/String;

    move-result-object v8

    const-string p2, "paymentMethod.sourceId"

    invoke-static {v8, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 160
    invoke-direct {p0, p1}, Lcom/ibotta/android/pwi/PwiHomeReducer;->isExpired(Lcom/ibotta/api/model/pwi/PwiPaymentMethod;)Z

    move-result v9

    .line 161
    invoke-virtual {p1}, Lcom/ibotta/api/model/pwi/PwiPaymentMethod;->getCardType()Ljava/lang/String;

    move-result-object v10

    const-string p1, "paymentMethod.cardType"

    invoke-static {v10, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, -0x1

    move-object v1, v0

    .line 152
    invoke-direct/range {v1 .. v10}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;-><init>(IILjava/lang/String;Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;ZZLjava/lang/String;ZLjava/lang/String;)V

    return-object v0
.end method

.method public final createPendingTxnDialogViewState()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 308
    new-instance v0, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;-><init>()V

    .line 309
    sget v1, Lcom/ibotta/android/reducers/R$drawable;->svg_pwi_no_payment_method:I

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->imageId(I)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 310
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_order_pending_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026.pwi_order_pending_title)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->title(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 311
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_order_pending_sub_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026_order_pending_sub_title)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->subtitle(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 312
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_order_pending_body:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026g.pwi_order_pending_body)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->body(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 313
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_order_pending_check_status_button:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026ding_check_status_button)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->primaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 314
    iget-object v1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget v2, Lcom/ibotta/android/reducers/R$string;->pwi_order_pending_ignore_button:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "resources.getString(R.st\u2026er_pending_ignore_button)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->secondaryButtonText(Ljava/lang/String;)Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;

    move-result-object v0

    .line 315
    invoke-virtual {v0}, Lcom/ibotta/android/views/messages/alert/SemiModalViewState$Builder;->build()Lcom/ibotta/android/views/messages/alert/SemiModalViewState;

    move-result-object v0

    return-object v0
.end method

.method public final createToolbarViewState(Lcom/ibotta/api/model/BuyableGiftCardModel;)Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;
    .locals 11
    .param p1    # Lcom/ibotta/api/model/BuyableGiftCardModel;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "buyableGiftCardModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "buyableGiftCardModel.name"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    move-object v3, v0

    .line 57
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const-string v0, ""

    :goto_2
    move-object v4, v0

    .line 58
    sget-object v5, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO_CIRCULAR:Lcom/ibotta/android/views/images/Sizes;

    .line 59
    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRetailerModel()Lcom/ibotta/api/model/RetailerModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getPwiHomeBannerImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    if-eqz v1, :cond_4

    move-object v6, v1

    goto :goto_3

    :cond_4
    const-string v0, ""

    move-object v6, v0

    :goto_3
    const/4 v7, 0x0

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    invoke-interface {p1}, Lcom/ibotta/api/model/BuyableGiftCardModel;->getRewardPercentage()F

    move-result p1

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->prettifyFloatToStringPercentage(F)Ljava/lang/String;

    move-result-object v8

    const-string p1, "formatting.prettifyFloat\u2026rdModel.rewardPercentage)"

    invoke-static {v8, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v9, 0x10

    const/4 v10, 0x0

    .line 55
    new-instance p1, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;

    move-object v2, p1

    invoke-direct/range {v2 .. v10}, Lcom/ibotta/android/views/pwi/home/PwiHomeToolbarViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/views/images/Sizes;Ljava/lang/String;Lcom/ibotta/android/views/images/Sizes;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public final createTransactionsViewState(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;
    .locals 11
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/views/components/Visibility;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/ibotta/android/views/pwi/wallet/SpentFilter;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/ibotta/api/model/pwi/BgcTransaction;",
            ">;Z",
            "Lcom/ibotta/android/views/components/Visibility;",
            "Lcom/ibotta/android/views/pwi/wallet/SpentFilter;",
            ")",
            "Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "transactions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "manageAllButtonVisibility"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "spentFilter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 198
    sget-object v1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->EMPTY:Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 201
    iget-object p1, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    sget p4, Lcom/ibotta/android/reducers/R$string;->pwi_no_gift_cards:I

    invoke-virtual {p1, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v7

    const-string p1, "resources.getString(R.string.pwi_no_gift_cards)"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/16 v9, 0x59

    const/4 v10, 0x0

    move v3, p2

    move-object v4, p3

    .line 198
    invoke-static/range {v1 .. v10}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;->copy$default(Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;ZILjava/lang/Object;)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    move-result-object p1

    return-object p1

    .line 204
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object v2, v0

    check-cast v2, Ljava/util/List;

    .line 206
    check-cast p1, Ljava/lang/Iterable;

    .line 385
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/Collection;

    .line 386
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 207
    sget-object v6, Lcom/ibotta/android/pwi/PwiHomeReducer$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p4}, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ordinal()I

    move-result v7

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_0

    .line 210
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {v5}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "transaction.spent"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto :goto_1

    .line 209
    :pswitch_1
    invoke-virtual {v5}, Lcom/ibotta/api/model/pwi/BgcTransaction;->getSpent()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :pswitch_2
    const/4 v3, 0x1

    :cond_2
    :goto_1
    if-eqz v3, :cond_1

    .line 211
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 387
    :cond_3
    check-cast v0, Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    .line 388
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/pwi/BgcTransaction;

    .line 212
    invoke-direct {p0, v0, p2}, Lcom/ibotta/android/pwi/PwiHomeReducer;->createTransactionViewState(Lcom/ibotta/api/model/pwi/BgcTransaction;Z)Lcom/ibotta/android/views/pwi/transactions/PwiTransactionRowViewState;

    move-result-object v0

    .line 213
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 216
    :cond_4
    new-instance p1, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;

    .line 220
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    invoke-direct {p0, v0, p4}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getSpentFilterText(ILcom/ibotta/android/views/pwi/wallet/SpentFilter;)Ljava/lang/String;

    move-result-object v5

    const-string v0, "getSpentFilterText(trans\u2026States.size, spentFilter)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_5

    .line 221
    sget-object v0, Lcom/ibotta/android/views/components/Visibility;->VISIBLE:Lcom/ibotta/android/views/components/Visibility;

    goto :goto_3

    :cond_5
    sget-object v0, Lcom/ibotta/android/views/components/Visibility;->GONE:Lcom/ibotta/android/views/components/Visibility;

    :goto_3
    move-object v6, v0

    .line 222
    invoke-direct {p0, p4}, Lcom/ibotta/android/pwi/PwiHomeReducer;->getEmptyTransactionsText(Lcom/ibotta/android/views/pwi/wallet/SpentFilter;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "getEmptyTransactionsText(spentFilter)"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 223
    sget-object v0, Lcom/ibotta/android/views/pwi/wallet/SpentFilter;->ALL:Lcom/ibotta/android/views/pwi/wallet/SpentFilter;

    if-ne p4, v0, :cond_6

    const/4 v8, 0x1

    goto :goto_4

    :cond_6
    const/4 v8, 0x0

    :goto_4
    move-object v1, p1

    move v3, p2

    move-object v4, p3

    .line 216
    invoke-direct/range {v1 .. v8}, Lcom/ibotta/android/views/pwi/transactions/PwiTransactionsViewState;-><init>(Ljava/util/List;ZLcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Lcom/ibotta/android/views/components/Visibility;Ljava/lang/String;Z)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getAppHelper()Lcom/ibotta/android/util/AppHelper;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 48
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-object v0
.end method

.method public final getFormatting()Lcom/ibotta/android/util/Formatting;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->formatting:Lcom/ibotta/android/util/Formatting;

    return-object v0
.end method

.method public final getIblvReducer()Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 51
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->iblvReducer:Lcom/ibotta/android/ilv/IbottaListViewStyleReducer;

    return-object v0
.end method

.method public final getResources()Landroid/content/res/Resources;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/pwi/PwiHomeReducer;->resources:Landroid/content/res/Resources;

    return-object v0
.end method
