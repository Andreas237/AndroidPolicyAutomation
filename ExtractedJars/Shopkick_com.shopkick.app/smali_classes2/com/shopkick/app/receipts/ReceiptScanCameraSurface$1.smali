.class Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;
.super Ljava/lang/Object;
.source "ReceiptScanCameraSurface.java"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 2

    .line 50
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-static {p2}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$008(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)I

    .line 51
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-static {p2}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$000(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)I

    move-result p2

    const/4 v0, 0x0

    const/16 v1, 0x32

    if-lt p2, v1, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    goto :goto_1

    .line 65
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$600(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)V

    goto :goto_2

    .line 53
    :cond_2
    :goto_1
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-static {p1, v0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$002(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;I)I

    .line 55
    :try_start_0
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$300(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)Landroid/hardware/Camera;

    move-result-object p1

    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-static {p2}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$100(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)Landroid/hardware/Camera$ShutterCallback;

    move-result-object p2

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    .line 58
    invoke-static {v0}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$200(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)Landroid/hardware/Camera$PictureCallback;

    move-result-object v0

    const/4 v1, 0x0

    .line 55
    invoke-virtual {p1, p2, v1, v1, v0}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 60
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object p2

    invoke-static {}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$400()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "takePicture failed"

    invoke-virtual {p2, v0, v1}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    .line 62
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface$1;->this$0:Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;->access$500(Lcom/shopkick/app/receipts/ReceiptScanCameraSurface;)V

    :goto_2
    return-void
.end method
