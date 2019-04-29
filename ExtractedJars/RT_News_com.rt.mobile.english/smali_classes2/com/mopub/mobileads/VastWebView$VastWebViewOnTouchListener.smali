.class Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;
.super Ljava/lang/Object;
.source "VastWebView.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/VastWebView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "VastWebViewOnTouchListener"
.end annotation


# instance fields
.field private mClickStarted:Z

.field final synthetic this$0:Lcom/mopub/mobileads/VastWebView;


# direct methods
.method constructor <init>(Lcom/mopub/mobileads/VastWebView;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;->this$0:Lcom/mopub/mobileads/VastWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 89
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x0

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 94
    :pswitch_0
    iget-boolean p1, p0, Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;->mClickStarted:Z

    if-nez p1, :cond_0

    return p2

    .line 97
    :cond_0
    iput-boolean p2, p0, Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;->mClickStarted:Z

    .line 98
    iget-object p1, p0, Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;->this$0:Lcom/mopub/mobileads/VastWebView;

    iget-object p1, p1, Lcom/mopub/mobileads/VastWebView;->mVastWebViewClickListener:Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;

    if-eqz p1, :cond_1

    .line 99
    iget-object p1, p0, Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;->this$0:Lcom/mopub/mobileads/VastWebView;

    iget-object p1, p1, Lcom/mopub/mobileads/VastWebView;->mVastWebViewClickListener:Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;

    invoke-interface {p1}, Lcom/mopub/mobileads/VastWebView$VastWebViewClickListener;->onVastWebViewClick()V

    goto :goto_0

    :pswitch_1
    const/4 p1, 0x1

    .line 91
    iput-boolean p1, p0, Lcom/mopub/mobileads/VastWebView$VastWebViewOnTouchListener;->mClickStarted:Z

    :cond_1
    :goto_0
    return p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
