.class Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$1;
.super Ljava/lang/Object;
.source "BarcodePickerInternal.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;->onFrameCompleted(Lcom/scandit/barcodepicker/ScanSession;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;

.field final synthetic val$picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)V
    .locals 0

    .line 448
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$1;->this$0:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate;

    iput-object p2, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$1;->val$picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 451
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$1;->val$picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$800(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/gui/ErrorIndicator;->setVisibility(I)V

    .line 452
    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal$ScanStateUpdate$1;->val$picker:Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;

    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;->access$900(Lcom/scandit/barcodepicker/internal/BarcodePickerInternal;)Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/scandit/barcodepicker/internal/ScanOverlayInternal;->setVisibility(I)V

    return-void
.end method
