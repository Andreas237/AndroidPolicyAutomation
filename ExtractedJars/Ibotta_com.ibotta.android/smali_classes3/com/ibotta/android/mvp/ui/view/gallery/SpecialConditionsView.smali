.class public Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;
.super Landroid/widget/LinearLayout;
.source "SpecialConditionsView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;
    }
.end annotation


# instance fields
.field private listener:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;

.field private message:Ljava/lang/String;

.field private retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 38
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 47
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 53
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 54
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x1

    .line 69
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->setOrientation(I)V

    const v1, 0x7f0600fc

    .line 70
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->setBackgroundResource(I)V

    .line 72
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    const v2, 0x7f0c01c8

    invoke-virtual {v1, v2, p0, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 73
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initMessage()V
    .locals 3

    .line 77
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 78
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->tvMessage:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->message:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 80
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->tvMessage:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->message:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method


# virtual methods
.method protected onLearnMoreClicked()V
    .locals 2
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f09008f
        }
    .end annotation

    .line 86
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;

    if-eqz v0, :cond_0

    .line 87
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-interface {v0, v1}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;->onLearnMoreClicked(Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->listener:Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView$SpecialConditionsListener;

    return-void
.end method

.method public setup(Lcom/ibotta/android/fragment/retailer/RetailerParcel;Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->retailerParcel:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    .line 63
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->message:Ljava/lang/String;

    .line 65
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/SpecialConditionsView;->initMessage()V

    return-void
.end method
