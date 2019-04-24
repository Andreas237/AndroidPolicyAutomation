.class public Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;
.super Landroid/widget/FrameLayout;
.source "BottomSheetLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;,
        Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;,
        Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$IdentityViewTransformer;,
        Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$CancelDetectionAnimationListener;
    }
.end annotation


# static fields
.field public static final ANIMATION_DURATION:J = 0x12cL

.field private static final SHEET_TRANSLATION:Landroid/util/Property;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Property<",
            "Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private alwaysPeekSheet:Z

.field private animationInterpolator:Landroid/animation/TimeInterpolator;

.field public bottomSheetOwnsTouch:Z

.field private contentClipRect:Landroid/graphics/Rect;

.field private currentAnimator:Landroid/animation/Animator;

.field private currentSheetViewHeight:I

.field private final defaultSheetWidth:I

.field private defaultViewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

.field private dimView:Landroid/view/View;

.field private downSheetTranslation:F

.field private downState:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

.field private downX:F

.field private downY:F

.field private hasIntercepted:Z

.field private initialized:Z

.field private interceptContentTouch:Z

.field private isKeyboardShown:Z

.field private final isTablet:Z

.field private maxTranslationOffset:F

.field private minFlingVelocity:F

.field private onSheetDismissedListeners:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/OnSheetDismissedListener;",
            ">;"
        }
    .end annotation
.end field

.field private onSheetStateChangeListeners:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;",
            ">;"
        }
    .end annotation
.end field

.field private peek:F

.field private peekKeyline:F

.field private peekOnDismiss:Z

.field private runAfterDismiss:Ljava/lang/Runnable;

.field private screenHeight:I

.field private screenWidth:I

.field private sheetEndX:I

.field private sheetStartX:I

.field private sheetTranslation:F

.field private sheetViewOnLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

.field private sheetViewOwnsTouch:Z

.field private shouldDimContentView:Z

.field private state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

.field private touchSlop:F

.field private useHardwareLayerWhileAnimating:Z

.field private velocityTracker:Landroid/view/VelocityTracker;

.field private viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 63
    new-instance v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$1;

    const-class v1, Ljava/lang/Float;

    const-string/jumbo v2, "sheetTranslation"

    invoke-direct {v0, v1, v2}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$1;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    sput-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->SHEET_TRANSLATION:Landroid/util/Property;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 166
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 76
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->initialized:Z

    .line 114
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->contentClipRect:Landroid/graphics/Rect;

    .line 115
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    .line 116
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOnDismiss:Z

    .line 117
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const v1, 0x3fcccccd    # 1.6f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->animationInterpolator:Landroid/animation/TimeInterpolator;

    .line 124
    new-instance v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$IdentityViewTransformer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$IdentityViewTransformer;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$1;)V

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->defaultViewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    const/4 v0, 0x1

    .line 126
    iput-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->shouldDimContentView:Z

    .line 127
    iput-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->useHardwareLayerWhileAnimating:Z

    .line 129
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetDismissedListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 131
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetStateChangeListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 134
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isKeyboardShown:Z

    .line 136
    iput-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->interceptContentTouch:Z

    const/4 v0, 0x0

    .line 141
    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->maxTranslationOffset:F

    .line 142
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->alwaysPeekSheet:Z

    .line 145
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenHeight:I

    .line 146
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenWidth:I

    .line 147
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$bool;->bottomsheet_is_tablet:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    iput-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isTablet:Z

    .line 149
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$dimen;->bottomsheet_default_sheet_width:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->defaultSheetWidth:I

    .line 150
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetStartX:I

    .line 151
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetEndX:I

    .line 167
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->init()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 171
    invoke-direct {p0, p1, p2, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 175
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 76
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->initialized:Z

    .line 114
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->contentClipRect:Landroid/graphics/Rect;

    .line 115
    sget-object p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    .line 116
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOnDismiss:Z

    .line 117
    new-instance p2, Landroid/view/animation/DecelerateInterpolator;

    const p3, 0x3fcccccd    # 1.6f

    invoke-direct {p2, p3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->animationInterpolator:Landroid/animation/TimeInterpolator;

    .line 124
    new-instance p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$IdentityViewTransformer;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$IdentityViewTransformer;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$1;)V

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->defaultViewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    const/4 p2, 0x1

    .line 126
    iput-boolean p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->shouldDimContentView:Z

    .line 127
    iput-boolean p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->useHardwareLayerWhileAnimating:Z

    .line 129
    new-instance p3, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetDismissedListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 131
    new-instance p3, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p3}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetStateChangeListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 134
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isKeyboardShown:Z

    .line 136
    iput-boolean p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->interceptContentTouch:Z

    const/4 p2, 0x0

    .line 141
    iput p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->maxTranslationOffset:F

    .line 142
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->alwaysPeekSheet:Z

    .line 145
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenHeight:I

    .line 146
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenWidth:I

    .line 147
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lcom/usebutton/sdk/R$bool;->bottomsheet_is_tablet:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p2

    iput-boolean p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isTablet:Z

    .line 149
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    sget p3, Lcom/usebutton/sdk/R$dimen;->bottomsheet_default_sheet_width:I

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p2

    iput p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->defaultSheetWidth:I

    .line 150
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetStartX:I

    .line 151
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetEndX:I

    .line 176
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->init()V

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)F
    .locals 0

    .line 61
    iget p0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    return p0
.end method

.method static synthetic access$002(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;F)F
    .locals 0

    .line 61
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    return p1
.end method

.method static synthetic access$100(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;F)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setSheetTranslation(F)V

    return-void
.end method

.method static synthetic access$1002(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    return-object p1
.end method

.method static synthetic access$1100(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Ljava/lang/Runnable;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->runAfterDismiss:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic access$1102(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->runAfterDismiss:Ljava/lang/Runnable;

    return-object p1
.end method

.method static synthetic access$402(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/animation/Animator;)Landroid/animation/Animator;
    .locals 0

    .line 61
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentAnimator:Landroid/animation/Animator;

    return-object p1
.end method

.method static synthetic access$500(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    return-object p0
.end method

.method static synthetic access$600(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)I
    .locals 0

    .line 61
    iget p0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentSheetViewHeight:I

    return p0
.end method

.method static synthetic access$602(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;I)I
    .locals 0

    .line 61
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentSheetViewHeight:I

    return p1
.end method

.method static synthetic access$700(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setState(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    return-void
.end method

.method static synthetic access$800(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;I)V
    .locals 0

    .line 61
    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setSheetLayerTypeIfEnabled(I)V

    return-void
.end method

.method static synthetic access$900(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 0

    .line 61
    iget-object p0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetDismissedListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object p0
.end method

.method private canScrollUp(Landroid/view/View;FF)Z
    .locals 10

    .line 538
    instance-of v0, p1, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    .line 539
    move-object v0, p1

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v1, 0x0

    move v2, v1

    .line 540
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 541
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 542
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v4

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v5

    sub-int/2addr v4, v5

    .line 543
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v6

    sub-int/2addr v5, v6

    .line 544
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v6

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v7

    sub-int/2addr v6, v7

    .line 545
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v7

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v8

    sub-int/2addr v7, v8

    int-to-float v4, v4

    cmpl-float v8, p2, v4

    const/4 v9, 0x1

    if-lez v8, :cond_0

    int-to-float v6, v6

    cmpg-float v6, p2, v6

    if-gez v6, :cond_0

    int-to-float v6, v5

    cmpl-float v6, p3, v6

    if-lez v6, :cond_0

    int-to-float v6, v7

    cmpg-float v6, p3, v6

    if-gez v6, :cond_0

    move v6, v9

    goto :goto_1

    :cond_0
    move v6, v1

    :goto_1
    if-eqz v6, :cond_1

    sub-float v4, p2, v4

    int-to-float v5, v5

    sub-float v5, p3, v5

    .line 548
    invoke-direct {p0, v3, v4, v5}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->canScrollUp(Landroid/view/View;FF)Z

    move-result v3

    if-eqz v3, :cond_1

    return v9

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p2, -0x1

    .line 553
    invoke-virtual {p1, p2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    return p1
.end method

.method private cancelCurrentAnimation()V
    .locals 1

    .line 532
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentAnimator:Landroid/animation/Animator;

    if-eqz v0, :cond_0

    .line 533
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    return-void
.end method

.method private static checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    .line 1053
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private dismissSheet(Ljava/lang/Runnable;)V
    .locals 4

    .line 813
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne v0, v1, :cond_0

    const/4 p1, 0x0

    .line 814
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->runAfterDismiss:Ljava/lang/Runnable;

    return-void

    .line 818
    :cond_0
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setState(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 823
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->runAfterDismiss:Ljava/lang/Runnable;

    .line 824
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object p1

    .line 825
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetViewOnLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, v0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 826
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->cancelCurrentAnimation()V

    .line 827
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->SHEET_TRANSLATION:Landroid/util/Property;

    const/4 v1, 0x1

    new-array v1, v1, [F

    const/4 v2, 0x0

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    .line 828
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 829
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->animationInterpolator:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 830
    new-instance v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;

    invoke-direct {v1, p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$6;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 853
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 854
    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentAnimator:Landroid/animation/Animator;

    .line 855
    iput v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetStartX:I

    .line 856
    iget p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenWidth:I

    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetEndX:I

    return-void
.end method

.method private getDefaultPeekTranslation()F
    .locals 1

    .line 646
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->hasTallerKeylineHeightSheet()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekKeyline:F

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    :goto_0
    return v0
.end method

.method private getDimAlpha(F)F
    .locals 6

    .line 333
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    if-eqz v0, :cond_0

    .line 334
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getMaxSheetTranslation()F

    move-result v2

    .line 335
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getPeekSheetTranslation()F

    move-result v3

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContentView()Landroid/view/View;

    move-result-object v5

    move v1, p1

    move-object v4, p0

    .line 334
    invoke-interface/range {v0 .. v5}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;->getDimAlpha(FFFLcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)F

    move-result p1

    return p1

    .line 336
    :cond_0
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->defaultViewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    if-eqz v0, :cond_1

    .line 337
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getMaxSheetTranslation()F

    move-result v2

    .line 338
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getPeekSheetTranslation()F

    move-result v3

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContentView()Landroid/view/View;

    move-result-object v5

    move v1, p1

    move-object v4, p0

    .line 337
    invoke-interface/range {v0 .. v5}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;->getDimAlpha(FFFLcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)F

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private hasFullHeightSheet()Z
    .locals 2

    .line 577
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private hasTallerKeylineHeightSheet()Z
    .locals 2

    .line 573
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekKeyline:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private init()V
    .locals 4

    .line 180
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 181
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v1

    int-to-float v1, v1

    iput v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->minFlingVelocity:F

    .line 182
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->touchSlop:F

    .line 184
    new-instance v0, Landroid/view/View;

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    .line 185
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    const/high16 v1, -0x1000000

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 186
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 187
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    const/4 v2, 0x4

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    .line 189
    invoke-virtual {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setFocusableInTouchMode(Z)V

    .line 191
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 192
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "window"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/WindowManager;

    invoke-interface {v2}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v2

    .line 193
    invoke-virtual {v2, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 194
    iget v2, v0, Landroid/graphics/Point;->y:I

    iput v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenHeight:I

    .line 195
    iget v2, v0, Landroid/graphics/Point;->x:I

    iput v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenWidth:I

    .line 196
    iget v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenWidth:I

    iput v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetEndX:I

    .line 198
    iput v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peek:F

    .line 199
    iget v0, v0, Landroid/graphics/Point;->y:I

    int-to-float v0, v0

    iget v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenWidth:I

    int-to-float v1, v1

    const v2, 0x3fe38e39

    div-float/2addr v1, v2

    sub-float/2addr v0, v1

    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekKeyline:F

    return-void
.end method

.method private initSheetView(Landroid/view/View;)V
    .locals 5

    .line 772
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->initialized:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 773
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 777
    iput-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->initialized:Z

    .line 779
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v2, -0x2

    const/4 v3, -0x1

    if-nez v1, :cond_2

    .line 781
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-boolean v4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isTablet:Z

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    move v4, v3

    :goto_0
    invoke-direct {v1, v4, v2, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 786
    :cond_2
    iget-boolean v4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isTablet:Z

    if-eqz v4, :cond_4

    iget v4, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    if-ne v4, v2, :cond_4

    .line 789
    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    if-ne v2, v3, :cond_3

    .line 790
    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 793
    :cond_3
    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->defaultSheetWidth:I

    iput v0, v1, Landroid/widget/FrameLayout$LayoutParams;->width:I

    .line 796
    iget v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenWidth:I

    sub-int v0, v2, v0

    .line 797
    div-int/lit8 v0, v0, 0x2

    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetStartX:I

    .line 798
    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetStartX:I

    sub-int/2addr v2, v0

    iput v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetEndX:I

    .line 801
    :cond_4
    invoke-super {p0, p1, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 802
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->initializeSheetValues()V

    return-void
.end method

.method private initializeSheetValues()V
    .locals 5

    const/4 v0, 0x0

    .line 584
    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    .line 585
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->contentClipRect:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v3

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v4, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    .line 586
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 587
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 588
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private isAnimating()Z
    .locals 1

    .line 528
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentAnimator:Landroid/animation/Animator;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static isTablet(Landroid/content/Context;)Z
    .locals 1

    .line 1033
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lcom/usebutton/sdk/R$bool;->bottomsheet_is_tablet:I

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result p0

    return p0
.end method

.method private isXInSheet(F)Z
    .locals 1

    .line 524
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isTablet:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetStartX:I

    int-to-float v0, v0

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetEndX:I

    int-to-float v0, v0

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public static predictedDefaultWidth(Landroid/content/Context;)I
    .locals 1

    .line 1043
    invoke-static {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isTablet(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1044
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget v0, Lcom/usebutton/sdk/R$dimen;->bottomsheet_default_sheet_width:I

    .line 1045
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p0

    return p0

    .line 1047
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p0

    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    return p0
.end method

.method private setSheetLayerTypeIfEnabled(I)V
    .locals 2

    .line 557
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->useHardwareLayerWhileAnimating:Z

    if-eqz v0, :cond_0

    .line 558
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method private setSheetTranslation(F)V
    .locals 4

    .line 310
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getMaxSheetTranslation()F

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    .line 311
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result p1

    int-to-double v0, p1

    iget p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    float-to-double v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    sub-double/2addr v0, v2

    double-to-int p1, v0

    .line 312
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->contentClipRect:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getWidth()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;->set(IIII)V

    .line 313
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v0

    int-to-float v0, v0

    iget v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    sub-float/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 314
    iget p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->transformView(F)V

    .line 315
    iget-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->shouldDimContentView:Z

    if-eqz p1, :cond_1

    .line 316
    iget p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getDimAlpha(F)F

    move-result p1

    .line 317
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 318
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    const/4 v1, 0x0

    cmpl-float p1, p1, v1

    if-lez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private setState(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
    .locals 2

    .line 563
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-eq p1, v0, :cond_0

    .line 564
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    .line 566
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetStateChangeListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;

    .line 567
    invoke-interface {v1, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;->onSheetStateChanged(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private transformView(F)V
    .locals 12

    .line 323
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    if-eqz v0, :cond_0

    .line 324
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getMaxSheetTranslation()F

    move-result v2

    .line 325
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getPeekSheetTranslation()F

    move-result v3

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContentView()Landroid/view/View;

    move-result-object v5

    move v1, p1

    move-object v4, p0

    .line 324
    invoke-interface/range {v0 .. v5}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;->transformView(FFFLcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)V

    goto :goto_0

    .line 326
    :cond_0
    iget-object v6, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->defaultViewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    if-eqz v6, :cond_1

    .line 327
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getMaxSheetTranslation()F

    move-result v8

    .line 328
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getPeekSheetTranslation()F

    move-result v9

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContentView()Landroid/view/View;

    move-result-object v11

    move v7, p1

    move-object v10, p0

    .line 327
    invoke-interface/range {v6 .. v11}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;->transformView(FFFLcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public addOnSheetDismissedListener(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/OnSheetDismissedListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/OnSheetDismissedListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "onSheetDismissedListener == null"

    .line 1000
    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1001
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetDismissedListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addOnSheetStateChangeListener(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "onSheetStateChangeListener == null"

    .line 987
    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 988
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetStateChangeListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public addView(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 207
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 212
    invoke-virtual {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setContentView(Landroid/view/View;)V

    return-void

    .line 208
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "You may not declare more then one child of bottom sheet. The sheet view must be added dynamically with showWithSheetView()"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addView(Landroid/view/View;I)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 217
    invoke-virtual {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;II)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 232
    invoke-virtual {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 222
    invoke-virtual {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup$LayoutParams;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 227
    invoke-virtual {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->addView(Landroid/view/View;)V

    return-void
.end method

.method public dismissSheet()V
    .locals 1

    const/4 v0, 0x0

    .line 809
    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet(Ljava/lang/Runnable;)V

    return-void
.end method

.method public expandSheet()V
    .locals 4

    .line 595
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->cancelCurrentAnimation()V

    const/4 v0, 0x0

    .line 596
    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setSheetLayerTypeIfEnabled(I)V

    .line 597
    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->SHEET_TRANSLATION:Landroid/util/Property;

    const/4 v2, 0x1

    new-array v2, v2, [F

    .line 598
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getMaxSheetTranslation()F

    move-result v3

    aput v3, v2, v0

    invoke-static {p0, v1, v2}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    .line 599
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 600
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->animationInterpolator:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 601
    new-instance v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$2;

    invoke-direct {v1, p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$2;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 609
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 610
    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentAnimator:Landroid/animation/Animator;

    .line 611
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setState(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    return-void
.end method

.method public getContentView()Landroid/view/View;
    .locals 1

    .line 678
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getInterceptContentTouch()Z
    .locals 1

    .line 905
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->interceptContentTouch:Z

    return v0
.end method

.method public getMaxSheetTranslation()F
    .locals 3

    .line 663
    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->maxTranslationOffset:F

    .line 665
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    .line 666
    iput v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->maxTranslationOffset:F

    .line 669
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->hasFullHeightSheet()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    :goto_0
    int-to-float v1, v1

    add-float/2addr v1, v0

    return v1
.end method

.method public getPeekOnDismiss()Z
    .locals 1

    .line 887
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOnDismiss:Z

    return v0
.end method

.method public getPeekSheetTranslation()F
    .locals 2

    .line 642
    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peek:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getDefaultPeekTranslation()F

    move-result v0

    :cond_0
    return v0
.end method

.method public getSheetView()Landroid/view/View;
    .locals 2

    .line 686
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getState()Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;
    .locals 1

    .line 912
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    return-object v0
.end method

.method public isSheetShowing()Z
    .locals 2

    .line 919
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 237
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 238
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->velocityTracker:Landroid/view/VelocityTracker;

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 243
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 244
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->velocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 245
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->cancelCurrentAnimation()V

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 344
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    .line 346
    iput-boolean v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->hasIntercepted:Z

    .line 349
    :cond_1
    iget-boolean v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->interceptContentTouch:Z

    if-nez v3, :cond_2

    .line 350
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v4

    int-to-float v4, v4

    iget v5, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    sub-float/2addr v4, v5

    cmpl-float v3, v3, v4

    if-lez v3, :cond_3

    .line 351
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    .line 350
    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isXInSheet(F)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    if-eqz v0, :cond_3

    .line 351
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isSheetShowing()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    move v1, v2

    :goto_1
    iput-boolean v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->hasIntercepted:Z

    .line 352
    iget-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->hasIntercepted:Z

    return p1
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 2
    .param p2    # Landroid/view/KeyEvent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x4

    if-ne p1, v0, :cond_4

    .line 257
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isSheetShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 258
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_1

    .line 259
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 261
    invoke-virtual {p1, p2, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    :cond_0
    return v1

    .line 264
    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-ne v0, v1, :cond_4

    .line 265
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 267
    invoke-virtual {v0, p2}, Landroid/view/KeyEvent$DispatcherState;->handleUpEvent(Landroid/view/KeyEvent;)V

    .line 269
    :cond_2
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isSheetShowing()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_4

    .line 270
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, p2, :cond_3

    iget-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOnDismiss:Z

    if-eqz p1, :cond_3

    .line 271
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekSheet()V

    goto :goto_0

    .line 273
    :cond_3
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    :goto_0
    return v1

    .line 279
    :cond_4
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 250
    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    .line 251
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result p1

    int-to-double p1, p1

    iget p3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    float-to-double p3, p3

    invoke-static {p3, p4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p3

    sub-double/2addr p1, p3

    double-to-int p1, p1

    .line 252
    iget-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->contentClipRect:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getWidth()I

    move-result p3

    const/4 p4, 0x0

    invoke-virtual {p2, p4, p4, p3, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method protected onMeasure(II)V
    .locals 3

    .line 284
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->initialized:Z

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isSheetShowing()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 289
    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 290
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Landroid/app/Activity;

    .line 291
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 292
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 293
    iget v1, v2, Landroid/graphics/Rect;->top:I

    .line 294
    iget v2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->screenHeight:I

    sub-int/2addr v2, v1

    sub-int/2addr v2, v0

    .line 296
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$dimen;->btn_keyboard_height:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    .line 299
    iget-boolean v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isKeyboardShown:Z

    if-eqz v1, :cond_1

    if-ge v2, v0, :cond_1

    const/4 v0, 0x0

    .line 300
    iput-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isKeyboardShown:Z

    .line 301
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekSheet()V

    goto :goto_0

    .line 302
    :cond_1
    iget-boolean v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isKeyboardShown:Z

    if-nez v1, :cond_2

    if-le v2, v0, :cond_2

    const/4 v0, 0x1

    .line 303
    iput-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isKeyboardShown:Z

    .line 304
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekSheet()V

    .line 306
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void

    .line 285
    :cond_3
    :goto_1
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    .line 358
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isSheetShowing()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 361
    :cond_0
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isAnimating()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    .line 364
    :cond_1
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->hasIntercepted:Z

    if-nez v0, :cond_2

    .line 365
    invoke-virtual {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    .line 367
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    .line 371
    iput-boolean v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->bottomSheetOwnsTouch:Z

    .line 372
    iput-boolean v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetViewOwnsTouch:Z

    .line 373
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downY:F

    .line 374
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downX:F

    .line 375
    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    iput v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downSheetTranslation:F

    .line 376
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downState:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    .line 377
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->velocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 379
    :cond_3
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->velocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 383
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getMaxSheetTranslation()F

    move-result v0

    .line 384
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getPeekSheetTranslation()F

    move-result v2

    .line 386
    iget v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downY:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    sub-float/2addr v3, v4

    .line 387
    iget v4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downX:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    sub-float/2addr v4, v5

    .line 389
    iget-boolean v5, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->bottomSheetOwnsTouch:Z

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-nez v5, :cond_7

    iget-boolean v5, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetViewOwnsTouch:Z

    if-nez v5, :cond_7

    .line 390
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v5

    iget v9, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->touchSlop:F

    cmpl-float v5, v5, v9

    if-lez v5, :cond_4

    move v5, v8

    goto :goto_0

    :cond_4
    move v5, v1

    :goto_0
    iput-boolean v5, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->bottomSheetOwnsTouch:Z

    .line 391
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v5, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->touchSlop:F

    cmpl-float v4, v4, v5

    if-lez v4, :cond_5

    move v4, v8

    goto :goto_1

    :cond_5
    move v4, v1

    :goto_1
    iput-boolean v4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetViewOwnsTouch:Z

    .line 393
    iget-boolean v4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->bottomSheetOwnsTouch:Z

    if-eqz v4, :cond_7

    .line 394
    iget-object v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v4, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne v3, v4, :cond_6

    .line 395
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v3

    .line 396
    iget v4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v5

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-virtual {v3, v7, v4}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 397
    invoke-virtual {v3, v6}, Landroid/view/MotionEvent;->setAction(I)V

    .line 398
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 399
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 402
    :cond_6
    iput-boolean v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetViewOwnsTouch:Z

    .line 403
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downY:F

    .line 404
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    iput v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downX:F

    move v3, v7

    .line 412
    :cond_7
    iget v4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downSheetTranslation:F

    add-float/2addr v4, v3

    .line 414
    iget-boolean v5, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->bottomSheetOwnsTouch:Z

    if-eqz v5, :cond_13

    cmpg-float v3, v3, v7

    if-gez v3, :cond_8

    move v3, v8

    goto :goto_2

    :cond_8
    move v3, v1

    .line 418
    :goto_2
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    .line 419
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    iget v11, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v12

    int-to-float v12, v12

    sub-float/2addr v11, v12

    add-float/2addr v10, v11

    .line 418
    invoke-direct {p0, v5, v9, v10}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->canScrollUp(Landroid/view/View;FF)Z

    move-result v5

    .line 420
    iget-object v9, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v10, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    const/4 v11, 0x2

    if-ne v9, v10, :cond_9

    if-eqz v3, :cond_9

    if-nez v5, :cond_9

    .line 423
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    iput v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downY:F

    .line 424
    iget v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    iput v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downSheetTranslation:F

    .line 425
    iget-object v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->velocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v3}, Landroid/view/VelocityTracker;->clear()V

    .line 426
    sget-object v3, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-direct {p0, v3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setState(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 427
    invoke-direct {p0, v11}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setSheetLayerTypeIfEnabled(I)V

    .line 428
    iget v4, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    .line 432
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v3

    .line 433
    invoke-virtual {v3, v6}, Landroid/view/MotionEvent;->setAction(I)V

    .line 434
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5, v3}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 435
    invoke-virtual {v3}, Landroid/view/MotionEvent;->recycle()V

    .line 439
    :cond_9
    iget-object v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v5, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne v3, v5, :cond_a

    cmpl-float v3, v4, v0

    if-lez v3, :cond_a

    .line 440
    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setSheetTranslation(F)V

    .line 444
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 445
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v0

    .line 446
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->setAction(I)V

    .line 447
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 448
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 449
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOrExpand()V

    .line 450
    invoke-direct {p0, v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setSheetLayerTypeIfEnabled(I)V

    .line 453
    :cond_a
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne v0, v1, :cond_b

    .line 456
    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    invoke-virtual {p1, v7, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 457
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    goto/16 :goto_4

    :cond_b
    cmpg-float v0, v4, v2

    if-gez v0, :cond_c

    sub-float v0, v2, v4

    const/high16 v1, 0x40800000    # 4.0f

    div-float/2addr v0, v1

    sub-float v4, v2, v0

    .line 467
    :cond_c
    invoke-direct {p0, v4}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setSheetTranslation(F)V

    .line 469
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v6, :cond_e

    .line 472
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->downState:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne v0, v1, :cond_d

    .line 473
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOrExpand()V

    goto :goto_3

    .line 475
    :cond_d
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekSheet()V

    .line 479
    :cond_e
    :goto_3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-ne p1, v8, :cond_18

    cmpg-float p1, v4, v2

    if-gez p1, :cond_f

    .line 481
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    goto/16 :goto_4

    .line 486
    :cond_f
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->velocityTracker:Landroid/view/VelocityTracker;

    const/16 v0, 0x3e8

    invoke-virtual {p1, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 487
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->velocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result p1

    .line 488
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    iget v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->minFlingVelocity:F

    cmpg-float v0, v0, v1

    if-gez v0, :cond_11

    .line 489
    iget p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v0

    div-int/2addr v0, v11

    int-to-float v0, v0

    cmpl-float p1, p1, v0

    if-lez p1, :cond_10

    .line 490
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOrExpand()V

    goto :goto_4

    .line 492
    :cond_10
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    goto :goto_4

    :cond_11
    cmpg-float p1, p1, v7

    if-gez p1, :cond_12

    .line 496
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOrExpand()V

    goto :goto_4

    .line 498
    :cond_12
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    goto :goto_4

    .line 508
    :cond_13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v2

    int-to-float v2, v2

    iget v3, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    sub-float/2addr v2, v3

    cmpg-float v0, v0, v2

    if-ltz v0, :cond_14

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isXInSheet(F)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    move v1, v8

    .line 509
    :cond_15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    if-ne v0, v8, :cond_16

    if-eqz v1, :cond_16

    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->interceptContentTouch:Z

    if-eqz v0, :cond_16

    .line 512
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet()V

    return v8

    .line 516
    :cond_16
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->isTablet:Z

    if-eqz v0, :cond_17

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getX()F

    move-result v0

    iget v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetStartX:I

    int-to-float v1, v1

    sub-float v7, v0, v1

    :cond_17
    iget v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetTranslation:F

    .line 517
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getHeight()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v0, v1

    .line 516
    invoke-virtual {p1, v7, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 518
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    :cond_18
    :goto_4
    return v8
.end method

.method public peekOrExpand()V
    .locals 1

    .line 863
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->alwaysPeekSheet:Z

    if-eqz v0, :cond_0

    .line 864
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekSheet()V

    goto :goto_0

    .line 866
    :cond_0
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->expandSheet()V

    :goto_0
    return-void
.end method

.method public peekSheet()V
    .locals 4

    .line 618
    invoke-direct {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->cancelCurrentAnimation()V

    const/4 v0, 0x2

    .line 619
    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setSheetLayerTypeIfEnabled(I)V

    .line 620
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->SHEET_TRANSLATION:Landroid/util/Property;

    const/4 v1, 0x1

    new-array v1, v1, [F

    .line 621
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getPeekSheetTranslation()F

    move-result v2

    const/4 v3, 0x0

    aput v2, v1, v3

    invoke-static {p0, v0, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    .line 622
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 623
    iget-object v1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->animationInterpolator:Landroid/animation/TimeInterpolator;

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 624
    new-instance v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$3;

    invoke-direct {v1, p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$3;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)V

    invoke-virtual {v0, v1}, Landroid/animation/ObjectAnimator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 632
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    .line 633
    iput-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentAnimator:Landroid/animation/Animator;

    .line 634
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setState(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    return-void
.end method

.method public removeOnSheetDismissedListener(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/OnSheetDismissedListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/OnSheetDismissedListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "onSheetDismissedListener == null"

    .line 1022
    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1023
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetDismissedListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public removeOnSheetStateChangeListener(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;)V
    .locals 1
    .param p1    # Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "onSheetStateChangeListener == null"

    .line 1011
    invoke-static {p1, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 1012
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetStateChangeListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public setAlwaysPeekSheet(Z)V
    .locals 0

    .line 975
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->alwaysPeekSheet:Z

    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 2

    .line 696
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->generateDefaultLayoutParams()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v0

    const/4 v1, -0x1

    invoke-super {p0, p1, v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 697
    iget-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dimView:Landroid/view/View;

    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->generateDefaultLayoutParams()Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v0

    invoke-super {p0, p1, v1, v0}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public setDefaultViewTransformer(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;)V
    .locals 0

    .line 931
    iput-object p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->defaultViewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    return-void
.end method

.method public setInterceptContentTouch(Z)V
    .locals 0

    .line 897
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->interceptContentTouch:Z

    return-void
.end method

.method public setMaxTranslationOffset(F)V
    .locals 0

    .line 954
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->maxTranslationOffset:F

    return-void
.end method

.method public setPeekOnDismiss(Z)V
    .locals 0

    .line 877
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peekOnDismiss:Z

    return-void
.end method

.method public setPeekSheetTranslation(F)V
    .locals 0

    .line 655
    iput p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->peek:F

    return-void
.end method

.method public setShouldDimContentView(Z)V
    .locals 0

    .line 943
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->shouldDimContentView:Z

    return-void
.end method

.method public setUseHardwareLayerWhileAnimating(Z)V
    .locals 0

    .line 966
    iput-boolean p1, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->useHardwareLayerWhileAnimating:Z

    return-void
.end method

.method public shouldDimContentView()Z
    .locals 1

    .line 950
    iget-boolean v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->shouldDimContentView:Z

    return v0
.end method

.method public showWithSheetView(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 706
    invoke-virtual {p0, p1, v0, v1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->showWithSheetView(Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V

    return-void
.end method

.method public showWithSheetView(Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V
    .locals 2

    .line 719
    iget-object v0, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->state:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-eq v0, v1, :cond_0

    .line 720
    new-instance v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;

    invoke-direct {v0, p0, p1, p2, p3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$4;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;Landroid/view/View;Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;Z)V

    .line 726
    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->dismissSheet(Ljava/lang/Runnable;)V

    return-void

    .line 729
    :cond_0
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PREPARING:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    invoke-direct {p0, v0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->setState(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    .line 731
    invoke-direct {p0, p1}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->initSheetView(Landroid/view/View;)V

    .line 732
    iput-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->viewTransformer:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/ViewTransformer;

    .line 735
    invoke-virtual {p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->getSheetView()Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 736
    iget-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->onSheetStateChangeListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;

    .line 737
    invoke-interface {v0, p3}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$OnSheetStateChangeListener;->onSheetReady(Z)V

    goto :goto_0

    .line 742
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    iput p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->currentSheetViewHeight:I

    .line 743
    new-instance p2, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;

    invoke-direct {p2, p0}, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$5;-><init>(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;)V

    iput-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetViewOnLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

    .line 768
    iget-object p2, p0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout;->sheetViewOnLayoutChangeListener:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method
