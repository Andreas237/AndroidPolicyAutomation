.class public final synthetic Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;

.field private final synthetic f$1:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

.field private final synthetic f$2:I

.field private final synthetic f$3:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;ILcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;->f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;

    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;->f$1:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    iput p3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;->f$2:I

    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;->f$3:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;->f$0:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;->f$1:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    iget v2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;->f$2:I

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/-$$Lambda$PwiBarcodeActivity$em_aSBveTgGlWgAEnvRFpcPoFs0;->f$3:Lcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;

    move-object v4, p1

    move v5, p2

    invoke-static/range {v0 .. v5}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;->lambda$showEditUpdateBalanceDialog$1(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/barcode/PwiBarcodeActivity;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;ILcom/ibotta/android/views/pwi/barcode/CurrencyInputEditText;Landroid/content/DialogInterface;I)V

    return-void
.end method
