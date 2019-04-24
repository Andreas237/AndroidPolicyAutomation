.class public Lcom/stripe/android/view/CardNumberEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "CardNumberEditText.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;,
        Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;
    }
.end annotation


# static fields
.field private static final SPACES_ARRAY_AMEX:[Ljava/lang/Integer;

.field private static final SPACES_ARRAY_COMMON:[Ljava/lang/Integer;

.field private static final SPACE_SET_AMEX:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final SPACE_SET_COMMON:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field mCardBrand:Ljava/lang/String;
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end field

.field private mCardBrandChangeListener:Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;

.field private mCardNumberCompleteListener:Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;

.field private mIgnoreChanges:Z

.field private mIsCardNumberValid:Z

.field private mLengthMax:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/4 v0, 0x3

    .line 31
    new-array v0, v0, [Ljava/lang/Integer;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/16 v2, 0x9

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v4, 0x1

    aput-object v2, v0, v4

    const/16 v2, 0xe

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v5, 0x2

    aput-object v2, v0, v5

    sput-object v0, Lcom/stripe/android/view/CardNumberEditText;->SPACES_ARRAY_COMMON:[Ljava/lang/Integer;

    .line 32
    new-instance v0, Ljava/util/HashSet;

    sget-object v2, Lcom/stripe/android/view/CardNumberEditText;->SPACES_ARRAY_COMMON:[Ljava/lang/Integer;

    .line 33
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/stripe/android/view/CardNumberEditText;->SPACE_SET_COMMON:Ljava/util/Set;

    .line 35
    new-array v0, v5, [Ljava/lang/Integer;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v3

    const/16 v1, 0xb

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v4

    sput-object v0, Lcom/stripe/android/view/CardNumberEditText;->SPACES_ARRAY_AMEX:[Ljava/lang/Integer;

    .line 36
    new-instance v0, Ljava/util/HashSet;

    sget-object v1, Lcom/stripe/android/view/CardNumberEditText;->SPACES_ARRAY_AMEX:[Ljava/lang/Integer;

    .line 37
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/stripe/android/view/CardNumberEditText;->SPACE_SET_AMEX:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 52
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const-string p1, "Unknown"

    .line 39
    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    const/16 p1, 0x13

    .line 42
    iput p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mLengthMax:I

    const/4 p1, 0x0

    .line 43
    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mIgnoreChanges:Z

    .line 44
    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mIsCardNumberValid:Z

    .line 53
    invoke-direct {p0}, Lcom/stripe/android/view/CardNumberEditText;->listenForTextChanges()V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/CardNumberEditText;)Z
    .locals 0

    .line 24
    iget-boolean p0, p0, Lcom/stripe/android/view/CardNumberEditText;->mIgnoreChanges:Z

    return p0
.end method

.method static synthetic access$002(Lcom/stripe/android/view/CardNumberEditText;Z)Z
    .locals 0

    .line 24
    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mIgnoreChanges:Z

    return p1
.end method

.method static synthetic access$100(Lcom/stripe/android/view/CardNumberEditText;Ljava/lang/String;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardNumberEditText;->updateCardBrandFromNumber(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/stripe/android/view/CardNumberEditText;)I
    .locals 0

    .line 24
    iget p0, p0, Lcom/stripe/android/view/CardNumberEditText;->mLengthMax:I

    return p0
.end method

.method static synthetic access$300(Lcom/stripe/android/view/CardNumberEditText;)Z
    .locals 0

    .line 24
    iget-boolean p0, p0, Lcom/stripe/android/view/CardNumberEditText;->mIsCardNumberValid:Z

    return p0
.end method

.method static synthetic access$302(Lcom/stripe/android/view/CardNumberEditText;Z)Z
    .locals 0

    .line 24
    iput-boolean p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mIsCardNumberValid:Z

    return p1
.end method

.method static synthetic access$400(Lcom/stripe/android/view/CardNumberEditText;)Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;
    .locals 0

    .line 24
    iget-object p0, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardNumberCompleteListener:Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;

    return-object p0
.end method

.method private static getLengthForBrand(Ljava/lang/String;)I
    .locals 1

    const-string v0, "American Express"

    .line 252
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "Diners Club"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/16 p0, 0x13

    return p0

    :cond_1
    :goto_0
    const/16 p0, 0x11

    return p0
.end method

.method private listenForTextChanges()V
    .locals 1

    .line 150
    new-instance v0, Lcom/stripe/android/view/CardNumberEditText$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/CardNumberEditText$1;-><init>(Lcom/stripe/android/view/CardNumberEditText;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardNumberEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private updateCardBrand(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 228
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 232
    :cond_0
    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    .line 234
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrandChangeListener:Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;

    if-eqz p1, :cond_1

    .line 235
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;->onCardBrandChanged(Ljava/lang/String;)V

    .line 238
    :cond_1
    iget p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mLengthMax:I

    .line 239
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    invoke-static {v0}, Lcom/stripe/android/view/CardNumberEditText;->getLengthForBrand(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mLengthMax:I

    .line 240
    iget v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mLengthMax:I

    if-ne p1, v0, :cond_2

    return-void

    .line 244
    :cond_2
    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->updateLengthFilter()V

    return-void
.end method

.method private updateCardBrandFromNumber(Ljava/lang/String;)V
    .locals 0

    .line 248
    invoke-static {p1}, Lcom/stripe/android/CardUtils;->getPossibleCardType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/stripe/android/view/CardNumberEditText;->updateCardBrand(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public getCardBrand()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    return-object v0
.end method

.method public getCardNumber()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 76
    iget-boolean v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mIsCardNumberValid:Z

    if-eqz v0, :cond_0

    .line 77
    invoke-virtual {p0}, Lcom/stripe/android/view/CardNumberEditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/stripe/android/StripeTextUtils;->removeSpacesAndHyphens(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getLengthMax()I
    .locals 1

    .line 82
    iget v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mLengthMax:I

    return v0
.end method

.method public isCardNumberValid()Z
    .locals 1

    .line 91
    iget-boolean v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mIsCardNumberValid:Z

    return v0
.end method

.method setCardBrandChangeListener(Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;)V
    .locals 1
    .param p1    # Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 99
    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrandChangeListener:Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;

    .line 102
    iget-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrandChangeListener:Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;

    iget-object v0, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/stripe/android/view/CardNumberEditText$CardBrandChangeListener;->onCardBrandChanged(Ljava/lang/String;)V

    return-void
.end method

.method setCardNumberCompleteListener(Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;)V
    .locals 0
    .param p1    # Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 95
    iput-object p1, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardNumberCompleteListener:Lcom/stripe/android/view/CardNumberEditText$CardNumberCompleteListener;

    return-void
.end method

.method updateLengthFilter()V
    .locals 3

    const/4 v0, 0x1

    .line 106
    new-array v0, v0, [Landroid/text/InputFilter;

    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    iget v2, p0, Lcom/stripe/android/view/CardNumberEditText;->mLengthMax:I

    invoke-direct {v1, v2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/CardNumberEditText;->setFilters([Landroid/text/InputFilter;)V

    return-void
.end method

.method updateSelectionIndex(III)I
    .locals 6
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const-string v0, "American Express"

    .line 125
    iget-object v1, p0, Lcom/stripe/android/view/CardNumberEditText;->mCardBrand:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/stripe/android/view/CardNumberEditText;->SPACE_SET_AMEX:Ljava/util/Set;

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/stripe/android/view/CardNumberEditText;->SPACE_SET_COMMON:Ljava/util/Set;

    .line 129
    :goto_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :cond_1
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    .line 130
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-gt p2, v4, :cond_2

    add-int v4, p2, p3

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v4, v5, :cond_2

    add-int/lit8 v1, v1, 0x1

    :cond_2
    const/4 v4, 0x1

    if-nez p3, :cond_1

    .line 136
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/2addr v3, v4

    if-ne p2, v3, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_3
    add-int/2addr p2, p3

    add-int/2addr p2, v1

    if-eqz v2, :cond_4

    if-lez p2, :cond_4

    add-int/lit8 p2, p2, -0x1

    :cond_4
    if-gt p2, p1, :cond_5

    move p1, p2

    :cond_5
    return p1
.end method
