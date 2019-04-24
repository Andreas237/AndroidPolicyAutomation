.class public Lcom/huawei/feedback/ui/at;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/view/View;

.field private b:I

.field private c:Landroid/widget/FrameLayout$LayoutParams;


# direct methods
.method private constructor <init>(Landroid/app/Activity;)V
    .locals 3

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/FrameLayout;

    .line 26
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Landroid/widget/FrameLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/feedback/ui/at;->a:Landroid/view/View;

    .line 27
    iget-object v0, p0, Lcom/huawei/feedback/ui/at;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Lcom/huawei/feedback/ui/au;

    invoke-direct {v1, p0}, Lcom/huawei/feedback/ui/au;-><init>(Lcom/huawei/feedback/ui/at;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 32
    iget-object v0, p0, Lcom/huawei/feedback/ui/at;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    iput-object v0, p0, Lcom/huawei/feedback/ui/at;->c:Landroid/widget/FrameLayout$LayoutParams;

    .line 33
    return-void
.end method

.method private a()V
    .locals 5

    .line 36
    invoke-direct {p0}, Lcom/huawei/feedback/ui/at;->b()I

    move-result v2

    .line 37
    iget v0, p0, Lcom/huawei/feedback/ui/at;->b:I

    if-eq v2, v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/huawei/feedback/ui/at;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 39
    sub-int v4, v3, v2

    .line 41
    iget-object v0, p0, Lcom/huawei/feedback/ui/at;->c:Landroid/widget/FrameLayout$LayoutParams;

    sub-int v1, v3, v4

    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 43
    iget-object v0, p0, Lcom/huawei/feedback/ui/at;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 44
    iput v2, p0, Lcom/huawei/feedback/ui/at;->b:I

    .line 46
    :cond_0
    return-void
.end method

.method public static a(Landroid/app/Activity;)V
    .locals 1

    .line 17
    new-instance v0, Lcom/huawei/feedback/ui/at;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/at;-><init>(Landroid/app/Activity;)V

    .line 18
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/at;)V
    .locals 0

    .line 10
    invoke-direct {p0}, Lcom/huawei/feedback/ui/at;->a()V

    return-void
.end method

.method private b()I
    .locals 3

    .line 49
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 50
    iget-object v0, p0, Lcom/huawei/feedback/ui/at;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 51
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 52
    iget v0, v2, Landroid/graphics/Rect;->bottom:I

    iget v1, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr v0, v1

    return v0

    .line 54
    :cond_0
    iget v0, v2, Landroid/graphics/Rect;->bottom:I

    return v0
.end method
