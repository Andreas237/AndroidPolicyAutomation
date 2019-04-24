.class public Lcom/ibotta/android/view/ImNoActivatedOffersDialog;
.super Landroid/app/Dialog;
.source "ImNoActivatedOffersDialog.java"


# static fields
.field private static final ICON_TAG:Ljava/lang/String; = "[icon]"


# instance fields
.field ivCloseButton:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090252
    .end annotation
.end field

.field ivOkayButton:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090255
    .end annotation
.end field

.field tvDescription:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090253
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 35
    invoke-direct {p0, p1, p2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 36
    invoke-direct {p0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->init()V

    return-void
.end method

.method private getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f07018d

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 64
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0801b9

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x0

    .line 65
    invoke-virtual {v1, v2, v2, v0, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    return-object v1
.end method

.method private init()V
    .locals 1

    const/4 v0, 0x1

    .line 40
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->requestWindowFeature(I)Z

    const v0, 0x7f0c00d8

    .line 41
    invoke-virtual {p0, v0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->setContentView(I)V

    .line 42
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->setDescription()V

    return-void
.end method

.method private setDescription()V
    .locals 5

    .line 47
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x7f110379

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "[icon]"

    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "[icon]"

    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    const-string v2, "[icon]"

    const-string v3, " "

    .line 50
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    .line 52
    new-instance v2, Landroid/text/SpannableStringBuilder;

    invoke-direct {v2, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 53
    new-instance v0, Landroid/text/style/ImageSpan;

    invoke-direct {p0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;I)V

    add-int/lit8 v3, v1, 0x1

    const/16 v4, 0x11

    .line 54
    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 58
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->tvDescription:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected onClick()V
    .locals 0
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090255,
            0x7f090252
        }
    .end annotation

    .line 71
    invoke-virtual {p0}, Lcom/ibotta/android/view/ImNoActivatedOffersDialog;->dismiss()V

    return-void
.end method
