.class public Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;
.super Landroid/widget/LinearLayout;
.source "SponsoredVideoNoticeView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 25
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 26
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 30
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 31
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 36
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 37
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    const/4 v0, 0x0

    .line 41
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->setOrientation(I)V

    const/16 v0, 0x10

    .line 42
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->setGravity(I)V

    const/high16 v0, 0x42c80000    # 100.0f

    .line 43
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->setWeightSum(F)V

    .line 45
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/engagement/row/SponsoredVideoNoticeView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01ca

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method
