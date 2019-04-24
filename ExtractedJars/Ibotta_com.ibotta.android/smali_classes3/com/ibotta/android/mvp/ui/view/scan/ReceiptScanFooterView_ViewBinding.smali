.class public Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;
.super Ljava/lang/Object;
.source "ReceiptScanFooterView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;

.field private view7f0900ac:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 25
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;

    const-string v0, "field \'ivBarcodeIcon\'"

    .line 33
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f090296

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->ivBarcodeIcon:Landroid/widget/ImageView;

    const-string v0, "field \'tbvInstructionsTitle\'"

    .line 34
    const-class v1, Lcom/ibotta/android/views/base/title/TitleBarView;

    const v2, 0x7f090448

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/title/TitleBarView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->tbvInstructionsTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    const-string v0, "field \'tvInstructionsDetails\'"

    .line 35
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f090535

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->tvInstructionsDetails:Landroid/widget/TextView;

    const-string v0, "field \'bTakePhotoInstead\' and method \'onTakePhotoInsteadClicked\'"

    const v1, 0x7f0900ac

    .line 36
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    const-string v0, "field \'bTakePhotoInstead\'"

    .line 37
    const-class v2, Landroid/widget/Button;

    invoke-static {p2, v1, v0, v2}, Lbutterknife/internal/Utils;->castView(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->bTakePhotoInstead:Landroid/widget/Button;

    .line 38
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;->view7f0900ac:Landroid/view/View;

    .line 39
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding$1;-><init>(Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;)V

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

    .line 50
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 52
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;

    .line 54
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->ivBarcodeIcon:Landroid/widget/ImageView;

    .line 55
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->tbvInstructionsTitle:Lcom/ibotta/android/views/base/title/TitleBarView;

    .line 56
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->tvInstructionsDetails:Landroid/widget/TextView;

    .line 57
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView;->bTakePhotoInstead:Landroid/widget/Button;

    .line 59
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;->view7f0900ac:Landroid/view/View;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 60
    :goto_0
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/scan/ReceiptScanFooterView_ViewBinding;->view7f0900ac:Landroid/view/View;

    return-void

    .line 51
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
