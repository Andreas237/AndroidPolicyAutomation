.class public Lcom/ibotta/android/view/common/OnGlobalLayoutListener;
.super Ljava/lang/Object;
.source "OnGlobalLayoutListener.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field protected view:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;->view:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public attach()V
    .locals 1

    .line 19
    iget-object v0, p0, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;->view:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 22
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 27
    :cond_1
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method public detach()V
    .locals 3

    .line 31
    iget-object v0, p0, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;->view:Landroid/view/View;

    if-nez v0, :cond_0

    return-void

    .line 34
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    .line 39
    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x10

    if-lt v1, v2, :cond_2

    .line 40
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 42
    :cond_2
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    :goto_0
    const/4 v0, 0x0

    .line 45
    iput-object v0, p0, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;->view:Landroid/view/View;

    return-void
.end method

.method public onGlobalLayout()V
    .locals 0

    return-void
.end method
