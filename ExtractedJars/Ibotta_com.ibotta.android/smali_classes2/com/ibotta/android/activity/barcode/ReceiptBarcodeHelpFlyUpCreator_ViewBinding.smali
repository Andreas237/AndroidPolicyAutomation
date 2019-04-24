.class public Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;
.super Ljava/lang/Object;
.source "ReceiptBarcodeHelpFlyUpCreator_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# instance fields
.field private target:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;

.field private view7f090084:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;Landroid/view/View;)V
    .locals 2
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;->target:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;

    const-string v0, "method \'onContinue\'"

    const v1, 0x7f090084

    .line 25
    invoke-static {p2, v1, v0}, Lbutterknife/internal/Utils;->findRequiredView(Landroid/view/View;ILjava/lang/String;)Landroid/view/View;

    move-result-object p2

    .line 26
    iput-object p2, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;->view7f090084:Landroid/view/View;

    .line 27
    new-instance v0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding$1;-><init>(Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;)V

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

    .line 38
    iget-object v0, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;->target:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;->target:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;

    .line 42
    iget-object v1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;->view7f090084:Landroid/view/View;

    instance-of v2, v1, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 43
    :goto_0
    iput-object v0, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;->view7f090084:Landroid/view/View;

    return-void

    .line 38
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
