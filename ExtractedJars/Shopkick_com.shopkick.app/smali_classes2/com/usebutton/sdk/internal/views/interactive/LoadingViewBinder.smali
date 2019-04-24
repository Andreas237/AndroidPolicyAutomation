.class public Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;
.super Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;
.source "LoadingViewBinder.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder$LoadingAdapter;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/InteractiveButton;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;-><init>(Lcom/usebutton/sdk/InteractiveButton;)V

    return-void
.end method

.method private getContext()Landroid/content/Context;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public applyStyling(Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;)V
    .locals 0

    .line 41
    invoke-super {p0, p1}, Lcom/usebutton/sdk/internal/views/interactive/BaseBinder;->applyStyling(Lcom/usebutton/sdk/InteractiveButton$InteractiveStyle;)V

    return-void
.end method

.method public bind(Lcom/usebutton/sdk/internal/models/AppAction;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/internal/models/Configuration;)V
    .locals 2
    .param p1    # Lcom/usebutton/sdk/internal/models/AppAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;",
            "Lcom/usebutton/sdk/internal/models/Configuration;",
            ")V"
        }
    .end annotation

    .line 29
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    invoke-virtual {p1}, Lcom/usebutton/sdk/InteractiveButton;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "Lorem ipsum doler sit amet"

    .line 30
    invoke-static {p1}, Lcom/usebutton/sdk/internal/models/Text;->white(Ljava/lang/String;)Lcom/usebutton/sdk/internal/models/Text;

    move-result-object p1

    .line 31
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

    const/4 p3, 0x0

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lcom/usebutton/sdk/R$drawable;->btn_ic_app_button:I

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/CompatHelpers;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p2, p3, p1, v0}, Lcom/usebutton/sdk/internal/views/PreviewView;->bind(Lcom/usebutton/sdk/internal/models/Text;Lcom/usebutton/sdk/internal/models/Text;Landroid/graphics/drawable/Drawable;)V

    .line 33
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    new-instance p2, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder$LoadingAdapter;

    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->getContext()Landroid/content/Context;

    move-result-object p3

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->mRoot:Lcom/usebutton/sdk/InteractiveButton;

    invoke-direct {p2, p3, v0}, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder$LoadingAdapter;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/InteractiveButton;)V

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 34
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->mPager:Lcom/usebutton/sdk/internal/views/HumbleViewPager;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/views/HumbleViewPager;->setCanScroll(Z)V

    .line 35
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->mPreviewView:Lcom/usebutton/sdk/internal/views/PreviewView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/views/PreviewView;->setIsLoading(Z)V

    .line 36
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/interactive/LoadingViewBinder;->mLoadingDots:Lcom/usebutton/sdk/internal/views/LoadingDots;

    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ViewUtils;->show(Landroid/view/View;)V

    return-void
.end method
