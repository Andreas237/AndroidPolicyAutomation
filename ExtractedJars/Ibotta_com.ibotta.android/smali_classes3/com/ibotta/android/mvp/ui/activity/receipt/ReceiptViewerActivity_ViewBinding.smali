.class public Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;
.super Ljava/lang/Object;
.source "ReceiptViewerActivity_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

.field private view7f090235:Landroid/view/View;

.field private view7f090236:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;Landroid/view/View;)V
    .locals 4
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

    const-string v0, "field \'rlReceiptViewerHeader\'"

    .line 34
    const-class v1, Landroid/widget/RelativeLayout;

    const v2, 0x7f0903ce

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->rlReceiptViewerHeader:Landroid/widget/RelativeLayout;

    const-string v0, "field \'ibLeft\' and method \'onLeftClicked\'"

    const v1, 0x7f090235

    .line 35
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ibLeft\'"

    .line 36
    const-class v3, Landroid/widget/ImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->ibLeft:Landroid/widget/ImageButton;

    .line 37
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->view7f090235:Landroid/view/View;

    .line 38
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding$1;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const-string v0, "field \'ibRight\' and method \'onRightClicked\'"

    const v1, 0x7f090236

    .line 44
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object v0

    const-string v2, "field \'ibRight\'"

    .line 45
    const-class v3, Landroid/widget/ImageButton;

    invoke-static {v0, v1, v2, v3}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageButton;

    iput-object v1, p1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->ibRight:Landroid/widget/ImageButton;

    .line 46
    iput-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->view7f090236:Landroid/view/View;

    .line 47
    new-instance v1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding$2;-><init>(Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f0905f6

    const-string v1, "field \'wvReceipt\'"

    .line 53
    const-class v2, Landroid/webkit/WebView;

    invoke-static {p2, v0, v1, v2}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/webkit/WebView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->wvReceipt:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 3
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

    if-eqz v0, :cond_2

    const/4 v1, 0x0

    .line 61
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;

    .line 63
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->rlReceiptViewerHeader:Landroid/widget/RelativeLayout;

    .line 64
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->ibLeft:Landroid/widget/ImageButton;

    .line 65
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->ibRight:Landroid/widget/ImageButton;

    .line 66
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity;->wvReceipt:Landroid/webkit/WebView;

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->view7f090235:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 69
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->view7f090235:Landroid/view/View;

    .line 70
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->view7f090236:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 71
    :goto_1
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/receipt/ReceiptViewerActivity_ViewBinding;->view7f090236:Landroid/view/View;

    return-void

    .line 60
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
