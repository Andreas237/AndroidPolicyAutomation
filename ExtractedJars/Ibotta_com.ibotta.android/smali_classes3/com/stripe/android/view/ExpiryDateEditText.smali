.class public Lcom/stripe/android/view/ExpiryDateEditText;
.super Lcom/stripe/android/view/StripeEditText;
.source "ExpiryDateEditText.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;
    }
.end annotation


# instance fields
.field private mExpiryDateEditListener:Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;

.field private mIsDateValid:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1, p2}, Lcom/stripe/android/view/StripeEditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 31
    invoke-direct {p0}, Lcom/stripe/android/view/ExpiryDateEditText;->listenForTextChanges()V

    return-void
.end method

.method static synthetic access$000(Lcom/stripe/android/view/ExpiryDateEditText;)Z
    .locals 0

    .line 16
    iget-boolean p0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->mIsDateValid:Z

    return p0
.end method

.method static synthetic access$002(Lcom/stripe/android/view/ExpiryDateEditText;Z)Z
    .locals 0

    .line 16
    iput-boolean p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->mIsDateValid:Z

    return p1
.end method

.method static synthetic access$100(Lcom/stripe/android/view/ExpiryDateEditText;[Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lcom/stripe/android/view/ExpiryDateEditText;->updateInputValues([Ljava/lang/String;)V

    return-void
.end method

.method static synthetic access$200(Lcom/stripe/android/view/ExpiryDateEditText;)Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->mExpiryDateEditListener:Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;

    return-object p0
.end method

.method private listenForTextChanges()V
    .locals 1

    .line 86
    new-instance v0, Lcom/stripe/android/view/ExpiryDateEditText$1;

    invoke-direct {v0, p0}, Lcom/stripe/android/view/ExpiryDateEditText$1;-><init>(Lcom/stripe/android/view/ExpiryDateEditText;)V

    invoke-virtual {p0, v0}, Lcom/stripe/android/view/ExpiryDateEditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method private updateInputValues([Ljava/lang/String;)V
    .locals 5
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation

        .annotation build Landroid/support/annotation/Size;
            value = 0x2L
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 234
    aget-object v1, p1, v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, -0x1

    if-eq v1, v2, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 238
    :cond_0
    :try_start_0
    aget-object v0, p1, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, -0x1

    :goto_0
    const/4 v1, 0x1

    .line 244
    aget-object v4, p1, v1

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    if-eq v4, v2, :cond_1

    goto :goto_1

    .line 248
    :cond_1
    :try_start_1
    aget-object p1, p1, v1

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lcom/stripe/android/view/DateUtils;->convertTwoDigitYearToFour(I)I

    move-result v3
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 254
    :catch_1
    :goto_1
    invoke-static {v0, v3}, Lcom/stripe/android/view/DateUtils;->isExpiryDataValid(II)Z

    move-result p1

    iput-boolean p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->mIsDateValid:Z

    return-void
.end method


# virtual methods
.method public getValidDateFields()[I
    .locals 5
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation build Landroid/support/annotation/Size;
        value = 0x2L
    .end annotation

    .line 61
    iget-boolean v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->mIsDateValid:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x2

    .line 65
    new-array v0, v0, [I

    .line 66
    invoke-virtual {p0}, Lcom/stripe/android/view/ExpiryDateEditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "/"

    const-string v4, ""

    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 67
    invoke-static {v2}, Lcom/stripe/android/view/DateUtils;->separateDateStringParts(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 70
    :try_start_0
    aget-object v4, v2, v3

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    aput v4, v0, v3

    const/4 v3, 0x1

    .line 71
    aget-object v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    invoke-static {v2}, Lcom/stripe/android/view/DateUtils;->convertTwoDigitYearToFour(I)I

    move-result v2

    aput v2, v0, v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    return-object v1
.end method

.method public isDateValid()Z
    .locals 1

    .line 47
    iget-boolean v0, p0, Lcom/stripe/android/view/ExpiryDateEditText;->mIsDateValid:Z

    return v0
.end method

.method public setExpiryDateEditListener(Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lcom/stripe/android/view/ExpiryDateEditText;->mExpiryDateEditListener:Lcom/stripe/android/view/ExpiryDateEditText$ExpiryDateEditListener;

    return-void
.end method

.method updateSelectionIndex(III)I
    .locals 4
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-gt p2, v1, :cond_0

    add-int v3, p2, p3

    if-lt v3, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez p3, :cond_1

    const/4 v3, 0x3

    if-ne p2, v3, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    add-int/2addr p2, p3

    add-int/2addr p2, v1

    if-eqz v0, :cond_2

    if-lez p2, :cond_2

    add-int/lit8 p2, p2, -0x1

    :cond_2
    if-gt p2, p1, :cond_3

    move p1, p2

    :cond_3
    return p1
.end method
