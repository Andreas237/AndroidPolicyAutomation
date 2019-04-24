.class public Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;
.super Ljava/lang/Object;
.source "FavoriteRetailerModuleView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

.field private view7f0900b1:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 24
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    const-string v0, "field \'tbvTitleBar\'"

    .line 33
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f09044e

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'llRows\'"

    .line 34
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090328

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    const-string v0, "field \'bViewAll\' and method \'onViewAllClicked\'"

    const v1, 0x7f0900b1

    .line 35
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bViewAll\'"

    .line 36
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->bViewAll:Landroid/widget/Button;

    .line 37
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;->view7f0900b1:Landroid/view/View;

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 51
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;

    .line 53
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->tbvTitleBar:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->llRows:Landroid/widget/LinearLayout;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView;->bViewAll:Landroid/widget/Button;

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;->view7f0900b1:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 58
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/retailer/FavoriteRetailerModuleView_ViewBinding;->view7f0900b1:Landroid/view/View;

    return-void

    .line 50
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
