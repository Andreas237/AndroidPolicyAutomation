.class public Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;
.super Landroid/widget/FrameLayout;
.source "LegalFooterView.java"

# interfaces
.implements Lcom/ibotta/android/mvp/text/URLSpanNoUnderline$SpanClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;
    }
.end annotation


# instance fields
.field private legalUrlClickListener:Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;

.field protected tvLegalAgreement:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09053c
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 36
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 41
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param

    .line 46
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 47
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroid/support/annotation/AttrRes;
        .end annotation
    .end param
    .param p4    # I
        .annotation build Landroid/support/annotation/StyleRes;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 54
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 55
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 6

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    const v2, 0x7f0c016c

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 69
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 71
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->tvLegalAgreement:Landroid/widget/TextView;

    new-instance v2, Lcom/ibotta/android/mvp/text/NoSelectionLinkMovementMethod;

    invoke-direct {v2}, Lcom/ibotta/android/mvp/text/NoSelectionLinkMovementMethod;-><init>()V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 73
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v2, 0x7f1101fc

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 74
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1101d4

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 75
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    aput-object v2, v4, v1

    const v0, 0x7f1101a2

    invoke-virtual {v3, v0, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 77
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_0

    .line 78
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->tvLegalAgreement:Landroid/widget/TextView;

    invoke-static {v0, v5}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 80
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->tvLegalAgreement:Landroid/widget/TextView;

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->tvLegalAgreement:Landroid/widget/TextView;

    invoke-direct {p0, v0}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->stripUnderlines(Landroid/widget/TextView;)V

    .line 84
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->tvLegalAgreement:Landroid/widget/TextView;

    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private stripUnderlines(Landroid/widget/TextView;)V
    .locals 9

    .line 88
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Landroid/text/Spanned;

    .line 89
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 90
    invoke-interface {v1}, Landroid/text/Spannable;->length()I

    move-result v0

    const-class v2, Landroid/text/style/URLSpan;

    const/4 v3, 0x0

    invoke-interface {v1, v3, v0, v2}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/text/style/URLSpan;

    .line 92
    array-length v2, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_0

    aget-object v5, v0, v4

    .line 93
    invoke-interface {v1, v5}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    .line 94
    invoke-interface {v1, v5}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v7

    .line 96
    invoke-interface {v1, v5}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 98
    new-instance v8, Lcom/ibotta/android/mvp/text/URLSpanNoUnderline;

    invoke-virtual {v5}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v8, v5, p0}, Lcom/ibotta/android/mvp/text/URLSpanNoUnderline;-><init>(Ljava/lang/String;Lcom/ibotta/android/mvp/text/URLSpanNoUnderline$SpanClickListener;)V

    .line 99
    invoke-interface {v1, v8, v6, v7, v3}, Landroid/text/Spannable;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 102
    :cond_0
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public onSpanClicked(Ljava/lang/String;)V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->legalUrlClickListener:Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;

    if-eqz v0, :cond_0

    .line 108
    invoke-interface {v0, p1}, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;->onLegalUrlClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setLegalUrlClickListener(Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView;->legalUrlClickListener:Lcom/ibotta/android/mvp/ui/view/legal/LegalFooterView$LegalUrlClickListener;

    return-void
.end method
