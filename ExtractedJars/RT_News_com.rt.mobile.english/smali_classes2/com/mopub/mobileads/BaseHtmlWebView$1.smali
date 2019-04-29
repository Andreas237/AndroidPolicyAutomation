.class Lcom/mopub/mobileads/BaseHtmlWebView$1;
.super Ljava/lang/Object;
.source "BaseHtmlWebView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/mobileads/BaseHtmlWebView;->initializeOnTouchListener(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/mobileads/BaseHtmlWebView;

.field final synthetic val$isScrollable:Z


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/BaseHtmlWebView;Z)V
    .locals 0

    .line 64
    iput-object p1, p0, Lcom/mopub/mobileads/BaseHtmlWebView$1;->this$0:Lcom/mopub/mobileads/BaseHtmlWebView;

    iput-boolean p2, p0, Lcom/mopub/mobileads/BaseHtmlWebView$1;->val$isScrollable:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 66
    iget-object p1, p0, Lcom/mopub/mobileads/BaseHtmlWebView$1;->this$0:Lcom/mopub/mobileads/BaseHtmlWebView;

    invoke-static {p1}, Lcom/mopub/mobileads/BaseHtmlWebView;->access$000(Lcom/mopub/mobileads/BaseHtmlWebView;)Lcom/mopub/mobileads/ViewGestureDetector;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/mopub/mobileads/ViewGestureDetector;->sendTouchEvent(Landroid/view/MotionEvent;)V

    .line 69
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    iget-boolean p1, p0, Lcom/mopub/mobileads/BaseHtmlWebView$1;->val$isScrollable:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
