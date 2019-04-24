.class public Lcom/huawei/operation/utils/AndroidBug5497Workaround;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private activity:Landroid/app/Activity;

.field private frameLayoutParams:Landroid/widget/FrameLayout$LayoutParams;

.field private mChildOfContent:Landroid/view/View;

.field private usableHeightPrevious:I


# direct methods
.method private constructor <init>(Landroid/app/Activity;)V
    .locals 3

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->activity:Landroid/app/Activity;

    .line 24
    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/FrameLayout;

    .line 25
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->mChildOfContent:Landroid/view/View;

    .line 26
    iget-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->mChildOfContent:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/operation/utils/AndroidBug5497Workaround$1;

    invoke-direct {v1, p0}, Lcom/huawei/operation/utils/AndroidBug5497Workaround$1;-><init>(Lcom/huawei/operation/utils/AndroidBug5497Workaround;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 31
    iget-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->mChildOfContent:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iput-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->frameLayoutParams:Landroid/widget/FrameLayout$LayoutParams;

    .line 32
    return-void
.end method

.method static synthetic access$000(Lcom/huawei/operation/utils/AndroidBug5497Workaround;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->possiblyResizeChildOfContent()V

    return-void
.end method

.method public static assistActivity(Landroid/app/Activity;)V
    .locals 1

    .line 15
    new-instance v0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;

    invoke-direct {v0, p0}, Lcom/huawei/operation/utils/AndroidBug5497Workaround;-><init>(Landroid/app/Activity;)V

    .line 16
    return-void
.end method

.method private computeUsableHeight()I
    .locals 3

    .line 52
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 53
    iget-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->mChildOfContent:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 54
    iget v0, v2, Landroid/graphics/Rect;->bottom:I

    iget v1, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v1

    return v0
.end method

.method private getDisplayFrameHeight()I
    .locals 2

    .line 62
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    .line 63
    iget-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->mChildOfContent:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 64
    iget v0, v1, Landroid/graphics/Rect;->bottom:I

    return v0
.end method

.method private possiblyResizeChildOfContent()V
    .locals 5

    .line 35
    invoke-direct {p0}, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->computeUsableHeight()I

    move-result v2

    .line 36
    iget v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->usableHeightPrevious:I

    if-eq v2, v0, :cond_1

    .line 37
    iget-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->activity:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v3

    .line 38
    sub-int v4, v3, v2

    .line 39
    div-int/lit8 v0, v3, 0x4

    if-le v4, v0, :cond_0

    .line 41
    iget-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->frameLayoutParams:Landroid/widget/FrameLayout$LayoutParams;

    sub-int v1, v3, v4

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    goto :goto_0

    .line 44
    :cond_0
    iget-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->frameLayoutParams:Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p0}, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->getDisplayFrameHeight()I

    move-result v1

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 46
    :goto_0
    iget-object v0, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->mChildOfContent:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 47
    iput v2, p0, Lcom/huawei/operation/utils/AndroidBug5497Workaround;->usableHeightPrevious:I

    .line 49
    :cond_1
    return-void
.end method
