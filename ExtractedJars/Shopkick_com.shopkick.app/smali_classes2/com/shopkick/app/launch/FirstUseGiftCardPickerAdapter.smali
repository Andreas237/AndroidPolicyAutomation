.class public Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;
.super Lcom/shopkick/app/adapter/SKAdapter;
.source "FirstUseGiftCardPickerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;,
        Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;
    }
.end annotation


# static fields
.field private static final CHECK_MARK_OVERHANG_BALANCE_DP:I = 0x16

.field private static final IMAGE_HEIGHT_TO_WIDTH_RATIO:F = 0.62666667f

.field private static final MARGIN_WIDTH_DP:I = 0x40

.field private static final UNSELECTED_IMAGE_RATIO:D = 0.8500000238418579


# instance fields
.field private final CHECK_MARK_OVERHANG_BALANCE_PX:I

.field private final HEIGHT_GIFT_CARD_IMAGE_NOT_SELECTED_PX:I

.field private final HEIGHT_GIFT_CARD_IMAGE_SELECTED_PX:I

.field private final WIDTH_GIFT_CARD_IMAGE_NOT_SELECTED_PX:I

.field private final WIDTH_GIFT_CARD_IMAGE_SELECTED_PX:I

.field private context:Landroid/content/Context;

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private firstUseGiftCardPickerDetails:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;",
            ">;"
        }
    .end annotation
.end field

.field private firstUseGiftCardPickerScreen:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

.field private glideRequestListener:Lcom/bumptech/glide/request/RequestListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/request/RequestListener<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field private loggedScrolledToBottom:Z

.field private previouslySelectedGiftCardView:Landroid/view/View;

.field private selectGiftCardIndex:I

.field private selectedGiftCardView:Landroid/view/View;

.field private selectionAnimationHappening:Z

.field private targets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/drawable/Drawable;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/shopkick/app/logging/UserEventLogger;",
            "Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;",
            ">;)V"
        }
    .end annotation

    .line 68
    invoke-direct {p0}, Lcom/shopkick/app/adapter/SKAdapter;-><init>()V

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->targets:Ljava/util/List;

    const/4 v0, -0x1

    .line 61
    iput v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectGiftCardIndex:I

    .line 69
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->context:Landroid/content/Context;

    .line 70
    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 71
    iput-object p3, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->firstUseGiftCardPickerScreen:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    .line 72
    iput-object p4, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->firstUseGiftCardPickerDetails:Ljava/util/List;

    .line 75
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 76
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    iget p2, p2, Landroid/util/DisplayMetrics;->widthPixels:I

    const/high16 p3, 0x42800000    # 64.0f

    mul-float/2addr p3, p1

    int-to-float p2, p2

    sub-float/2addr p2, p3

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    float-to-int p2, p2

    .line 79
    iput p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->WIDTH_GIFT_CARD_IMAGE_SELECTED_PX:I

    .line 80
    iget p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->WIDTH_GIFT_CARD_IMAGE_SELECTED_PX:I

    int-to-float p3, p2

    const p4, 0x3f206d3a

    mul-float/2addr p3, p4

    float-to-int p3, p3

    iput p3, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->HEIGHT_GIFT_CARD_IMAGE_SELECTED_PX:I

    int-to-double p2, p2

    const-wide v0, 0x3feb333340000000L    # 0.8500000238418579

    mul-double/2addr p2, v0

    double-to-int p2, p2

    .line 82
    iput p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->WIDTH_GIFT_CARD_IMAGE_NOT_SELECTED_PX:I

    .line 83
    iget p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->HEIGHT_GIFT_CARD_IMAGE_SELECTED_PX:I

    int-to-double p2, p2

    mul-double/2addr p2, v0

    double-to-int p2, p2

    iput p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->HEIGHT_GIFT_CARD_IMAGE_NOT_SELECTED_PX:I

    const/high16 p2, 0x41b00000    # 22.0f

    mul-float/2addr p1, p2

    float-to-int p1, p1

    .line 85
    iput p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->CHECK_MARK_OVERHANG_BALANCE_PX:I

    .line 87
    new-instance p1, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$1;

    invoke-direct {p1, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$1;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->glideRequestListener:Lcom/bumptech/glide/request/RequestListener;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Ljava/util/List;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->targets:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->triggerGiftCardSelectedAnimation()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Z
    .locals 0

    .line 39
    iget-boolean p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectionAnimationHappening:Z

    return p0
.end method

.method static synthetic access$202(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectionAnimationHappening:Z

    return p1
.end method

.method static synthetic access$300(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Landroid/view/View;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectedGiftCardView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$302(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectedGiftCardView:Landroid/view/View;

    return-object p1
.end method

.method static synthetic access$402(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;Landroid/view/View;)Landroid/view/View;
    .locals 0

    .line 39
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->previouslySelectedGiftCardView:Landroid/view/View;

    return-object p1
.end method

.method static synthetic access$502(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;I)I
    .locals 0

    .line 39
    iput p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectGiftCardIndex:I

    return p1
.end method

.method static synthetic access$600(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Ljava/util/List;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->firstUseGiftCardPickerDetails:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$700(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)Lcom/shopkick/app/logging/UserEventLogger;
    .locals 0

    .line 39
    iget-object p0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    return-object p0
.end method

.method static synthetic access$800(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->triggerShowNextButton()V

    return-void
.end method

.method private maybeTriggerUpdate(I)V
    .locals 1

    .line 223
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 224
    new-instance v0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$2;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private populateCell(Landroid/view/View;III)V
    .locals 8

    .line 160
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->firstUseGiftCardPickerDetails:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;

    const v1, 0x7f0902aa

    .line 163
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const v3, 0x7f0902a8

    .line 164
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    .line 167
    iget-object v5, v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;->imageUrl:Ljava/lang/String;

    .line 168
    iget-object v6, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->targets:Ljava/util/List;

    iget-object v7, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->context:Landroid/content/Context;

    invoke-static {v7}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v7

    invoke-virtual {v7, v5}, Lcom/shopkick/app/util/GlideRequests;->load(Ljava/lang/String;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    invoke-virtual {v5}, Lcom/shopkick/app/util/GlideRequest;->centerCrop()Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    iget-object v7, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->glideRequestListener:Lcom/bumptech/glide/request/RequestListener;

    invoke-virtual {v5, v7}, Lcom/shopkick/app/util/GlideRequest;->addListener(Lcom/bumptech/glide/request/RequestListener;)Lcom/shopkick/app/util/GlideRequest;

    move-result-object v5

    invoke-virtual {v5, v4}, Lcom/shopkick/app/util/GlideRequest;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    move-result-object v4

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 171
    check-cast v2, Landroid/support/constraint/ConstraintLayout;

    const v4, 0x7f09028c

    .line 172
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/support/constraint/ConstraintLayout;

    .line 175
    new-instance v5, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v5}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 176
    invoke-virtual {v5, v2}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    .line 178
    iget v6, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectGiftCardIndex:I

    const v7, 0x7f090102

    if-ne p2, v6, :cond_0

    .line 179
    invoke-direct {p0, v5, v3}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->setSelectedGiftCardWidthAndHeight(Landroid/support/constraint/ConstraintSet;I)V

    const/4 v3, 0x0

    .line 180
    invoke-virtual {v5, v7, v3}, Landroid/support/constraint/ConstraintSet;->setVisibility(II)V

    goto :goto_0

    .line 182
    :cond_0
    invoke-direct {p0, v5, v3}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->setUnselectedGiftCardWidthAndHeight(Landroid/support/constraint/ConstraintSet;I)V

    const/4 v3, 0x4

    .line 183
    invoke-virtual {v5, v7, v3}, Landroid/support/constraint/ConstraintSet;->setVisibility(II)V

    :goto_0
    const v3, 0x7f0902ea

    .line 186
    iget v6, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->WIDTH_GIFT_CARD_IMAGE_SELECTED_PX:I

    iget v7, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->CHECK_MARK_OVERHANG_BALANCE_PX:I

    sub-int/2addr v6, v7

    invoke-virtual {v5, v3, v6}, Landroid/support/constraint/ConstraintSet;->constrainWidth(II)V

    const v3, 0x7f0907fa

    .line 188
    iget v6, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->HEIGHT_GIFT_CARD_IMAGE_SELECTED_PX:I

    iget v7, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->CHECK_MARK_OVERHANG_BALANCE_PX:I

    sub-int/2addr v6, v7

    invoke-virtual {v5, v3, v6}, Landroid/support/constraint/ConstraintSet;->constrainHeight(II)V

    .line 191
    invoke-virtual {v5, v2}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    .line 193
    new-instance v2, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v2}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 194
    invoke-virtual {v2, v4}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    .line 195
    invoke-direct {p0, v2, v1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->setSelectedGiftCardWidthAndHeight(Landroid/support/constraint/ConstraintSet;I)V

    .line 196
    invoke-virtual {v2, v4}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    const v1, 0x7f0906ef

    .line 199
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/widget/SKTextView;

    .line 200
    iget-object v2, v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;->displayName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 203
    new-instance v1, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;

    invoke-direct {v1, p0, p2, p3, p4}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$GiftCardClickListener;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;III)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 206
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0x3f

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/16 p3, 0x58

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 207
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;->rewardId:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRewardId(Ljava/lang/String;)V

    .line 208
    iget-object p2, v0, Lcom/shopkick/app/fetchers/api/skapi/FirstUseGiftCardPickerDetail;->displayName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setRewardName(Ljava/lang/String;)V

    .line 209
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private setSelectedGiftCardWidthAndHeight(Landroid/support/constraint/ConstraintSet;I)V
    .locals 1

    .line 213
    iget v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->WIDTH_GIFT_CARD_IMAGE_SELECTED_PX:I

    invoke-virtual {p1, p2, v0}, Landroid/support/constraint/ConstraintSet;->constrainWidth(II)V

    .line 214
    iget v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->HEIGHT_GIFT_CARD_IMAGE_SELECTED_PX:I

    invoke-virtual {p1, p2, v0}, Landroid/support/constraint/ConstraintSet;->constrainHeight(II)V

    return-void
.end method

.method private setUnselectedGiftCardWidthAndHeight(Landroid/support/constraint/ConstraintSet;I)V
    .locals 1

    .line 218
    iget v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->WIDTH_GIFT_CARD_IMAGE_NOT_SELECTED_PX:I

    invoke-virtual {p1, p2, v0}, Landroid/support/constraint/ConstraintSet;->constrainWidth(II)V

    .line 219
    iget v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->HEIGHT_GIFT_CARD_IMAGE_NOT_SELECTED_PX:I

    invoke-virtual {p1, p2, v0}, Landroid/support/constraint/ConstraintSet;->constrainHeight(II)V

    return-void
.end method

.method private triggerGiftCardSelectedAnimation()V
    .locals 11

    .line 246
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->previouslySelectedGiftCardView:Landroid/view/View;

    const v1, 0x7f09028c

    const v2, 0x7f0902a8

    const v3, 0x7f0902aa

    const v4, 0x7f090102

    if-eqz v0, :cond_0

    .line 247
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    .line 248
    new-instance v5, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v5}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 249
    invoke-virtual {v5, v0}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    .line 250
    invoke-direct {p0, v5, v2}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->setUnselectedGiftCardWidthAndHeight(Landroid/support/constraint/ConstraintSet;I)V

    const/4 v6, 0x4

    .line 251
    invoke-virtual {v5, v4, v6}, Landroid/support/constraint/ConstraintSet;->setVisibility(II)V

    .line 252
    invoke-virtual {v5, v0}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    .line 254
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->previouslySelectedGiftCardView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    .line 265
    new-instance v5, Landroid/transition/Fade;

    invoke-direct {v5}, Landroid/transition/Fade;-><init>()V

    .line 267
    new-instance v6, Landroid/transition/Scene;

    invoke-direct {v6, v0}, Landroid/transition/Scene;-><init>(Landroid/view/ViewGroup;)V

    .line 268
    invoke-static {v6, v5}, Landroid/transition/TransitionManager;->go(Landroid/transition/Scene;Landroid/transition/Transition;)V

    .line 272
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectedGiftCardView:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    .line 274
    new-instance v3, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v3}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 275
    invoke-virtual {v3, v0}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    .line 276
    invoke-direct {p0, v3, v2}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->setSelectedGiftCardWidthAndHeight(Landroid/support/constraint/ConstraintSet;I)V

    const/4 v2, 0x0

    .line 277
    invoke-virtual {v3, v4, v2}, Landroid/support/constraint/ConstraintSet;->setVisibility(II)V

    .line 278
    invoke-virtual {v3, v0}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    .line 280
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectedGiftCardView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    .line 283
    new-instance v1, Landroid/transition/ChangeBounds;

    invoke-direct {v1}, Landroid/transition/ChangeBounds;-><init>()V

    const-wide/16 v2, 0x190

    .line 284
    invoke-virtual {v1, v2, v3}, Landroid/transition/ChangeBounds;->setDuration(J)Landroid/transition/Transition;

    .line 285
    new-instance v2, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    const-wide/high16 v9, 0x4024000000000000L    # 10.0

    move-object v5, v2

    move-object v6, p0

    invoke-direct/range {v5 .. v10}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;DD)V

    .line 286
    invoke-virtual {v1, v2}, Landroid/transition/ChangeBounds;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/transition/Transition;

    .line 287
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectedGiftCardView:Landroid/view/View;

    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/transition/ChangeBounds;->excludeChildren(Landroid/view/View;Z)Landroid/transition/Transition;

    .line 289
    new-instance v2, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$4;

    invoke-direct {v2, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$4;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V

    invoke-virtual {v1, v2}, Landroid/transition/ChangeBounds;->addListener(Landroid/transition/Transition$TransitionListener;)Landroid/transition/Transition;

    .line 316
    new-instance v2, Landroid/transition/Scene;

    invoke-direct {v2, v0}, Landroid/transition/Scene;-><init>(Landroid/view/ViewGroup;)V

    .line 317
    invoke-static {v2, v1}, Landroid/transition/TransitionManager;->go(Landroid/transition/Scene;Landroid/transition/Transition;)V

    return-void
.end method

.method private triggerShowNextButton()V
    .locals 2

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->firstUseGiftCardPickerScreen:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    iget v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->selectGiftCardIndex:I

    invoke-virtual {v0, v1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;->showNextButton(I)V

    .line 234
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 235
    new-instance v1, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$3;

    invoke-direct {v1, p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$3;-><init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public destroyAdapter()V
    .locals 3

    .line 104
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->targets:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/bumptech/glide/request/target/Target;

    .line 105
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->context:Landroid/content/Context;

    invoke-static {v2}, Lcom/shopkick/app/util/GlideApp;->with(Landroid/content/Context;)Lcom/shopkick/app/util/GlideRequests;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/shopkick/app/util/GlideRequests;->clear(Lcom/bumptech/glide/request/target/Target;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    .line 111
    iput-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->firstUseGiftCardPickerScreen:Lcom/shopkick/app/launch/FirstUseGiftCardPickerScreen;

    return-void
.end method

.method public getCount()I
    .locals 4

    .line 116
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->firstUseGiftCardPickerDetails:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    int-to-double v0, v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    div-double/2addr v0, v2

    .line 117
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3

    .line 132
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->context:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    if-nez p2, :cond_0

    const p2, 0x7f0c00bd

    .line 134
    invoke-virtual {v0, p2, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    const p3, 0x7f0902ab

    .line 137
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    mul-int/lit8 v0, p1, 0x2

    .line 139
    invoke-direct {p0, p3, v0, p1, v1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->populateCell(Landroid/view/View;III)V

    const p3, 0x7f0902ac

    .line 141
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    const/4 v1, 0x1

    add-int/2addr v0, v1

    .line 143
    iget-object v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->firstUseGiftCardPickerDetails:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-le v2, v0, :cond_1

    .line 144
    invoke-direct {p0, p3, v0, p1, v1}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->populateCell(Landroid/view/View;III)V

    .line 147
    :cond_1
    iget-boolean p3, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->loggedScrolledToBottom:Z

    if-nez p3, :cond_2

    invoke-virtual {p0}, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->getCount()I

    move-result p3

    sub-int/2addr p3, v1

    if-ne p1, p3, :cond_2

    .line 149
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/16 p3, 0x59

    .line 150
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 151
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p3, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 153
    iput-boolean v1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;->loggedScrolledToBottom:Z

    :cond_2
    return-object p2
.end method
