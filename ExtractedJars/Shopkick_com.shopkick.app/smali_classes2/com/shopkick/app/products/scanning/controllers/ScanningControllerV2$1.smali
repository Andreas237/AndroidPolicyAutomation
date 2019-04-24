.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;
.super Ljava/lang/Object;
.source "ScanningControllerV2.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->initAndStartScanning(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/shopkick/app/application/AppPreferences;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;)V
    .locals 0

    .line 67
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 70
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_0

    .line 71
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$1;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    float-to-int p2, p2

    invoke-static {p1, v0, p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->access$000(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;II)V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
