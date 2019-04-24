.class Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding$1;
.super Lbutterknife/internal/DebouncingOnClickListener;
.source "ReceiptBarcodeHelpFlyUpCreator_ViewBinding.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;-><init>(Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;

.field final synthetic val$target:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;


# direct methods
.method constructor <init>(Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;)V
    .locals 0

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding$1;->this$0:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding;

    iput-object p2, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding$1;->val$target:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;

    invoke-direct {p0}, Lbutterknife/internal/DebouncingOnClickListener;-><init>()V

    return-void
.end method


# virtual methods
.method public doClick(Landroid/view/View;)V
    .locals 0

    .line 30
    iget-object p1, p0, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator_ViewBinding$1;->val$target:Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;

    invoke-virtual {p1}, Lcom/ibotta/android/activity/barcode/ReceiptBarcodeHelpFlyUpCreator;->onContinue()V

    return-void
.end method
