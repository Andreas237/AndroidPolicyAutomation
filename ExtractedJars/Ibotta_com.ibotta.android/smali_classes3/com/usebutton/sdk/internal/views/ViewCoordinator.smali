.class public Lcom/usebutton/sdk/internal/views/ViewCoordinator;
.super Ljava/lang/Object;
.source "ViewCoordinator.java"


# instance fields
.field private webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;


# direct methods
.method public constructor <init>(Landroid/webkit/WebView;Landroid/view/View;Landroid/view/View;Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-direct {v0, p2, p1, p3, p4}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;-><init>(Landroid/view/View;Landroid/webkit/WebView;Landroid/view/View;Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/views/ViewCoordinator;->webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    .line 19
    check-cast p1, Lcom/usebutton/sdk/internal/views/ObservableWebView;

    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/ViewCoordinator;->webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-virtual {p1, p2}, Lcom/usebutton/sdk/internal/views/ObservableWebView;->setCustomOnScrollChangeListener(Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;)V

    return-void
.end method


# virtual methods
.method public animateMargins(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
    .locals 1

    .line 27
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/ViewCoordinator;->webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->animateMargins(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V

    return-void
.end method

.method public reset()V
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/ViewCoordinator;->webViewScrollManager:Lcom/usebutton/sdk/internal/views/WebViewScrollManager;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->reset()V

    return-void
.end method
