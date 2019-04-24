.class Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;
.super Ljava/lang/Object;
.source "ScanOverlayImpl.java"

# interfaces
.implements Lcom/scandit/barcodepicker/PropertyChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;-><init>(Landroid/content/Context;Lcom/scandit/barcodepicker/internal/EngineThread;Lcom/scandit/base/camera/profiles/DeviceProfile;ZLcom/scandit/barcodepicker/ScanSettings;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;


# direct methods
.method constructor <init>(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)V
    .locals 0

    .line 166
    iput-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPropertyChange(II)V
    .locals 4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    const-string p1, "ScanditSDK"

    const-string v0, "send message OCR state: %d"

    const/4 v1, 0x1

    .line 171
    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 172
    iget-object p1, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    invoke-static {p1}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$1;->this$0:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;

    .line 173
    invoke-static {v0}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;->access$000(Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1, p2, v3}, Landroid/os/Handler;->obtainMessage(III)Landroid/os/Message;

    move-result-object p2

    .line 172
    invoke-virtual {p1, p2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    return-void
.end method
