.class public Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;
.super Landroid/widget/FrameLayout;
.source "SpotlightUnlockView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;
    }
.end annotation


# instance fields
.field protected bShop:Landroid/widget/Button;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900a7
    .end annotation
.end field

.field protected ibUnlock:Landroid/widget/ImageButton;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090237
    .end annotation
.end field

.field private listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;

.field private shopRetailerName:Ljava/lang/String;

.field private state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 42
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 32
    sget-object p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->LOCKED:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->initLayout()V

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

    .line 47
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 32
    sget-object p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->LOCKED:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    .line 48
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->initLayout()V

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

    .line 52
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    sget-object p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->LOCKED:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    .line 53
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->initLayout()V

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

    .line 60
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 32
    sget-object p1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->LOCKED:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    .line 61
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 76
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f0c01d2

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 78
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->onSetup()V

    return-void
.end method

.method private initShop()V
    .locals 6

    .line 113
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->SHOP:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    if-ne v0, v1, :cond_1

    .line 114
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->shopRetailerName:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->bShop:Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1105e2

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->shopRetailerName:Ljava/lang/String;

    aput-object v5, v4, v1

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->bShop:Landroid/widget/Button;

    const v2, 0x7f1101ea

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setText(I)V

    .line 119
    :goto_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->bShop:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_1

    .line 121
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->bShop:Landroid/widget/Button;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    :goto_1
    return-void
.end method

.method private initUnlock()V
    .locals 3

    .line 93
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->SHOP:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    if-ne v0, v1, :cond_0

    .line 94
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    return-void

    .line 98
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 100
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    sget-object v2, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->UNLOCKED:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    if-ne v0, v2, :cond_1

    .line 101
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    const v2, 0x7f080103

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 102
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    const v2, 0x7f080204

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 103
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    goto :goto_0

    .line 104
    :cond_1
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    sget-object v1, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->LOCKED:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    if-ne v0, v1, :cond_2

    .line 105
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    const v1, 0x7f080110

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 106
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    const v1, 0x7f0801fc

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 107
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setClickable(Z)V

    .line 108
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->ibUnlock:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setFocusable(Z)V

    :cond_2
    :goto_0
    return-void
.end method

.method private onSetup()V
    .locals 1

    .line 84
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;->UNLOCKED:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    .line 88
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->initUnlock()V

    .line 89
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->initShop()V

    return-void
.end method


# virtual methods
.method protected onShopClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f0900a7
        }
    .end annotation

    .line 134
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;

    if-eqz v0, :cond_0

    .line 135
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;->onShopClicked()V

    :cond_0
    return-void
.end method

.method protected onUnlockClicked()V
    .locals 1
    .annotation runtime Lbutterknife/OnClick;
        value = {
            0x7f090237
        }
    .end annotation

    .line 127
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;

    if-eqz v0, :cond_0

    .line 128
    invoke-interface {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;->onUnlockClicked()V

    :cond_0
    return-void
.end method

.method public setListener(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->listener:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockListener;

    return-void
.end method

.method public setup(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;Ljava/lang/String;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->state:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView$State;

    .line 70
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->shopRetailerName:Ljava/lang/String;

    .line 72
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightUnlockView;->onSetup()V

    return-void
.end method
