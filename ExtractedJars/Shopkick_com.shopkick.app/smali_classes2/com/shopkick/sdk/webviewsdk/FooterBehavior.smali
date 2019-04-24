.class public Lcom/shopkick/sdk/webviewsdk/FooterBehavior;
.super Landroid/support/design/widget/CoordinatorLayout$Behavior;
.source "FooterBehavior.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/design/widget/CoordinatorLayout$Behavior<",
        "Landroid/widget/LinearLayout;",
        ">;"
    }
.end annotation


# instance fields
.field private defaultDependencyTop:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/CoordinatorLayout$Behavior;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, -0x1

    .line 13
    iput p1, p0, Lcom/shopkick/sdk/webviewsdk/FooterBehavior;->defaultDependencyTop:I

    return-void
.end method


# virtual methods
.method public bridge synthetic layoutDependsOn(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    .line 10
    check-cast p2, Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/sdk/webviewsdk/FooterBehavior;->layoutDependsOn(Landroid/support/design/widget/CoordinatorLayout;Landroid/widget/LinearLayout;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public layoutDependsOn(Landroid/support/design/widget/CoordinatorLayout;Landroid/widget/LinearLayout;Landroid/view/View;)Z
    .locals 0

    .line 21
    instance-of p1, p3, Landroid/support/design/widget/AppBarLayout;

    return p1
.end method

.method public bridge synthetic onDependentViewChanged(Landroid/support/design/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    .line 10
    check-cast p2, Landroid/widget/LinearLayout;

    invoke-virtual {p0, p1, p2, p3}, Lcom/shopkick/sdk/webviewsdk/FooterBehavior;->onDependentViewChanged(Landroid/support/design/widget/CoordinatorLayout;Landroid/widget/LinearLayout;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public onDependentViewChanged(Landroid/support/design/widget/CoordinatorLayout;Landroid/widget/LinearLayout;Landroid/view/View;)Z
    .locals 1

    .line 27
    iget p1, p0, Lcom/shopkick/sdk/webviewsdk/FooterBehavior;->defaultDependencyTop:I

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    .line 28
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    move-result p1

    iput p1, p0, Lcom/shopkick/sdk/webviewsdk/FooterBehavior;->defaultDependencyTop:I

    .line 30
    :cond_0
    invoke-virtual {p3}, Landroid/view/View;->getTop()I

    move-result p1

    neg-int p1, p1

    iget p3, p0, Lcom/shopkick/sdk/webviewsdk/FooterBehavior;->defaultDependencyTop:I

    add-int/2addr p1, p3

    int-to-float p1, p1

    invoke-virtual {p2, p1}, Landroid/widget/LinearLayout;->setTranslationY(F)V

    const/4 p1, 0x1

    return p1
.end method
