.class public Lcom/ibotta/android/activity/browser/WebViewBrowserActivity_ViewBinding;
.super Ljava/lang/Object;
.source "WebViewBrowserActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-virtual {p1}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity_ViewBinding;-><init>(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity_ViewBinding;->target:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    const-string v0, "field \'iwvLinkContent\'"

    .line 28
    const-class v1, Lcom/ibotta/android/views/browser/IbottaWebView;

    const v2, 0x7f0902d5

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/browser/IbottaWebView;

    iput-object v0, p1, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->iwvLinkContent:Lcom/ibotta/android/views/browser/IbottaWebView;

    const-string v0, "field \'flLoading\'"

    .line 29
    const-class v1, Landroid/widget/FrameLayout;

    const v2, 0x7f0901f3

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    iput-object v0, p1, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->flLoading:Landroid/widget/FrameLayout;

    const-string v0, "field \'toolbar\'"

    .line 30
    const-class v1, Landroid/support/v7/widget/Toolbar;

    const v2, 0x7f09043a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/support/v7/widget/Toolbar;

    iput-object p2, p1, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 36
    iget-object v0, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity_ViewBinding;->target:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 38
    iput-object v1, p0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity_ViewBinding;->target:Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;

    .line 40
    iput-object v1, v0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->iwvLinkContent:Lcom/ibotta/android/views/browser/IbottaWebView;

    .line 41
    iput-object v1, v0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->flLoading:Landroid/widget/FrameLayout;

    .line 42
    iput-object v1, v0, Lcom/ibotta/android/activity/browser/WebViewBrowserActivity;->toolbar:Landroid/support/v7/widget/Toolbar;

    return-void

    .line 37
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
