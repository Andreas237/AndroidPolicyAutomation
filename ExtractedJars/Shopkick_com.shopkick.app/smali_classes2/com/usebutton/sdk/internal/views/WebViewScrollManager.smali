.class public Lcom/usebutton/sdk/internal/views/WebViewScrollManager;
.super Ljava/lang/Object;
.source "WebViewScrollManager.java"

# interfaces
.implements Lcom/usebutton/sdk/internal/views/ObservableWebView$OnScrollChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;,
        Lcom/usebutton/sdk/internal/views/WebViewScrollManager$ReverseInterpolator;
    }
.end annotation


# instance fields
.field private footer:Landroid/view/View;

.field private footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

.field private header:Landroid/view/View;

.field private headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

.field private listener:Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;

.field private previousDeltaY:I

.field private shouldAnimateHeaderAndFooter:Z

.field private webView:Landroid/webkit/WebView;


# direct methods
.method constructor <init>(Landroid/view/View;Landroid/webkit/WebView;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/WebView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, p1, p2, v0, v0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;-><init>(Landroid/view/View;Landroid/webkit/WebView;Landroid/view/View;Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;)V

    return-void
.end method

.method constructor <init>(Landroid/view/View;Landroid/webkit/WebView;Landroid/view/View;Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/webkit/WebView;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Landroid/view/View;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->shouldAnimateHeaderAndFooter:Z

    const/4 v0, 0x0

    .line 33
    iput v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->previousDeltaY:I

    .line 41
    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    .line 42
    iput-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->webView:Landroid/webkit/WebView;

    .line 43
    iput-object p3, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footer:Landroid/view/View;

    .line 44
    iput-object p4, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->listener:Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;

    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz p3, :cond_0

    .line 49
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    :cond_0
    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)Landroid/view/ViewGroup$MarginLayoutParams;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    return-object p0
.end method

.method static synthetic access$100(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)Landroid/view/View;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$200(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)Landroid/view/ViewGroup$MarginLayoutParams;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    return-object p0
.end method

.method static synthetic access$300(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)Landroid/view/View;
    .locals 0

    .line 22
    iget-object p0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footer:Landroid/view/View;

    return-object p0
.end method

.method private adjustMargins(I)V
    .locals 3

    .line 127
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    sub-int/2addr v1, p1

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 128
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 130
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footer:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 131
    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    .line 132
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    neg-int v0, v0

    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr v2, p1

    const/4 p1, 0x0

    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 133
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footer:Landroid/view/View;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 135
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footer:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    if-ne v0, v1, :cond_0

    .line 136
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->shouldAnimateHeaderAndFooter:Z

    .line 137
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->listener:Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;

    invoke-interface {p1}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$WebScrollEventListener;->onFooterReachedBottom()V

    :cond_0
    return-void
.end method

.method private resetMargins()V
    .locals 3

    .line 114
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v1, 0x0

    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 115
    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 117
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footer:Landroid/view/View;

    if-eqz v0, :cond_0

    .line 118
    iget-object v2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iput v1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 119
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    return-void
.end method


# virtual methods
.method animateMargins(Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;)V
    .locals 4

    .line 146
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->shouldAnimateHeaderAndFooter:Z

    if-nez v0, :cond_0

    const/4 p1, 0x1

    .line 147
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->shouldAnimateHeaderAndFooter:Z

    return-void

    .line 152
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-nez v0, :cond_1

    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v0, :cond_2

    :cond_1
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object v1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    .line 153
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    neg-int v1, v1

    if-ne v0, v1, :cond_3

    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v0, :cond_3

    :cond_2
    return-void

    .line 158
    :cond_3
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->PEEKED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v0, :cond_4

    return-void

    .line 162
    :cond_4
    sget-object v0, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->HIDDEN:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-ne p1, v0, :cond_5

    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz v0, :cond_6

    :cond_5
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    .line 163
    invoke-virtual {v0}, Landroid/view/View;->getAnimation()Landroid/view/animation/Animation;

    move-result-object v0

    if-eqz v0, :cond_7

    :cond_6
    return-void

    .line 167
    :cond_7
    new-instance v0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$1;-><init>(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)V

    const-wide/16 v1, 0xc8

    .line 174
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 175
    sget-object v3, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-eq p1, v3, :cond_8

    .line 176
    new-instance v3, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$ReverseInterpolator;

    invoke-direct {v3, p0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$ReverseInterpolator;-><init>(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)V

    invoke-virtual {v0, v3}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 179
    :cond_8
    iget-object v3, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 181
    new-instance v0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$2;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$2;-><init>(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)V

    .line 188
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 189
    sget-object v1, Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;->EXPANDED:Lcom/usebutton/thirdparty/com/flipboard/bottomsheet/BottomSheetLayout$State;

    if-eq p1, v1, :cond_9

    .line 190
    new-instance p1, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$ReverseInterpolator;

    invoke-direct {p1, p0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager$ReverseInterpolator;-><init>(Lcom/usebutton/sdk/internal/views/WebViewScrollManager;)V

    invoke-virtual {v0, p1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 192
    :cond_9
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footer:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method public onScrollChange(Landroid/view/View;IIII)V
    .locals 0

    .line 60
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->webView:Landroid/webkit/WebView;

    invoke-virtual {p1}, Landroid/webkit/WebView;->getHeight()I

    move-result p1

    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, p2

    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footer:Landroid/view/View;

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->footerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    add-int/2addr p1, p2

    .line 63
    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->webView:Landroid/webkit/WebView;

    invoke-virtual {p2}, Landroid/webkit/WebView;->getContentHeight()I

    move-result p2

    if-ge p2, p1, :cond_1

    return-void

    :cond_1
    sub-int/2addr p3, p5

    .line 70
    iget p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->previousDeltaY:I

    if-lez p1, :cond_2

    if-ltz p3, :cond_3

    :cond_2
    iget p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->previousDeltaY:I

    if-gez p1, :cond_4

    if-lez p3, :cond_4

    .line 71
    :cond_3
    iput p3, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->previousDeltaY:I

    return-void

    :cond_4
    if-lez p3, :cond_6

    .line 76
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result p2

    neg-int p2, p2

    if-le p1, p2, :cond_6

    .line 79
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p1, p2

    if-le p3, p1, :cond_5

    .line 80
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget-object p2, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget p2, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int p3, p1, p2

    .line 83
    :cond_5
    invoke-direct {p0, p3}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->adjustMargins(I)V

    goto :goto_1

    :cond_6
    if-gez p3, :cond_8

    .line 87
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-gez p1, :cond_8

    .line 90
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ge p3, p1, :cond_7

    .line 91
    iget-object p1, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->headerParams:Landroid/view/ViewGroup$MarginLayoutParams;

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    move p3, p1

    .line 94
    :cond_7
    invoke-direct {p0, p3}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->adjustMargins(I)V

    .line 97
    :cond_8
    :goto_1
    iput p3, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->previousDeltaY:I

    return-void
.end method

.method reset()V
    .locals 1

    .line 105
    iget-object v0, p0, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->header:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    if-lez v0, :cond_0

    .line 106
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/views/WebViewScrollManager;->resetMargins()V

    :cond_0
    return-void
.end method
