.class public Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;
.super Ljava/lang/Object;
.source "KeyboardUpAutoScrollListener.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# static fields
.field public static final BUTTON_KEYBOARD_GAP:I = 0x32


# instance fields
.field private bottomElementWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private mainViewWeakReference:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private screenDensity:F


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;F)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x0

    cmpg-float v0, p3, v0

    if-gtz v0, :cond_1

    :cond_0
    const-string v0, "Params provided are illegal"

    .line 37
    invoke-static {v0}, Lcom/shopkick/app/util/SKAssertion;->throwAssertionError(Ljava/lang/String;)V

    .line 39
    :cond_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->mainViewWeakReference:Ljava/lang/ref/WeakReference;

    .line 40
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->bottomElementWeakReference:Ljava/lang/ref/WeakReference;

    .line 41
    iput p3, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->screenDensity:F

    return-void
.end method

.method private static convertDipToPixels(FF)I
    .locals 0

    mul-float/2addr p0, p1

    const/high16 p1, 0x3f000000    # 0.5f

    add-float/2addr p0, p1

    float-to-int p0, p0

    return p0
.end method

.method public static removeKeyboardUpAutoScrollListenerFromView(Landroid/view/View;Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;)V
    .locals 0

    if-eqz p1, :cond_1

    if-nez p0, :cond_0

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 8

    .line 46
    iget-object v0, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->mainViewWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 47
    iget-object v1, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->bottomElementWeakReference:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 57
    :cond_0
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 58
    invoke-virtual {v0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v3

    .line 60
    iget v4, v2, Landroid/graphics/Rect;->bottom:I

    sub-int v4, v3, v4

    .line 66
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    const/high16 v5, 0x42480000    # 50.0f

    iget v6, p0, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->screenDensity:F

    invoke-static {v5, v6}, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;->convertDipToPixels(FF)I

    move-result v5

    add-int/2addr v1, v5

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v2

    int-to-double v4, v4

    int-to-double v2, v3

    const-wide v6, 0x3fc3333333333333L    # 0.15

    mul-double/2addr v2, v6

    cmpl-double v2, v4, v2

    if-lez v2, :cond_1

    if-lez v1, :cond_1

    .line 69
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener$1;

    invoke-direct {v3, p0, v0, v1}, Lcom/shopkick/app/util/KeyboardUpAutoScrollListener$1;-><init>(Lcom/shopkick/app/util/KeyboardUpAutoScrollListener;Landroid/view/View;I)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method
