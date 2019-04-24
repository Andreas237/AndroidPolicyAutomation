.class public Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;
.super Ljava/lang/Object;
.source "NetworkConnectionErrorView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;

.field private view7f090083:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 27
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;

    const-string v0, "field \'tToolbar\'"

    .line 36
    const-class v1, Landroid/support/v7/widget/Toolbar;

    const v2, 0x7f09043a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->tToolbar:Landroid/support/v7/widget/Toolbar;

    const-string v0, "field \'ablAppBarLayout\'"

    .line 37
    const-class v1, Landroid/support/design/widget/AppBarLayout;

    const v2, 0x7f090029

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/design/widget/AppBarLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    const-string v0, "field \'vTopSpacing\'"

    const v1, 0x7f0905bd

    .line 38
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->vTopSpacing:Landroid/view/View;

    const-string v0, "field \'llContentContainer\'"

    .line 39
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090304

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->llContentContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'bConnectionErrorCta\' and method \'onConnectionErrorCtaClicked\'"

    const v1, 0x7f090083

    .line 40
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'bConnectionErrorCta\'"

    .line 41
    const-class v3, Landroid/widget/Button;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->bConnectionErrorCta:Landroid/widget/Button;

    .line 42
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;->view7f090083:Landroid/view/View;

    .line 43
    new-instance v1, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const v0, 0x7f090375

    const-string v1, "field \'nbvOfflineNavBarView\'"

    .line 49
    const-class v2, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->nbvOfflineNavBarView:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    const v0, 0x7f090548

    const-string v1, "field \'tvMessage\'"

    .line 50
    const-class v2, Landroid/widget/TextView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->tvMessage:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 58
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;

    .line 60
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->tToolbar:Landroid/support/v7/widget/Toolbar;

    .line 61
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->ablAppBarLayout:Landroid/support/design/widget/AppBarLayout;

    .line 62
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->vTopSpacing:Landroid/view/View;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->llContentContainer:Landroid/widget/LinearLayout;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->bConnectionErrorCta:Landroid/widget/Button;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->nbvOfflineNavBarView:Lcom/ibotta/android/mvp/ui/view/nav/NavBarView;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView;->tvMessage:Landroid/widget/TextView;

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;->view7f090083:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 69
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/error/NetworkConnectionErrorView_ViewBinding;->view7f090083:Landroid/view/View;

    return-void

    .line 57
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
