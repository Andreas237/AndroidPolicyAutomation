.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$2;
.super Ljava/lang/Object;
.source "ScanningControllerV2.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->startBCScanning()V
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

    .line 102
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$2;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 105
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$2;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->access$202(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Z)Z

    .line 106
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$2;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->scanInitListener:Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;

    if-eqz v0, :cond_0

    .line 107
    iget-object v0, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$2;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    iget-object v0, v0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->scanInitListener:Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;

    invoke-interface {v0}, Lcom/shopkick/app/products/scanning/interfaces/ScanInitListener;->tryInitializeCamera()V

    :cond_0
    return-void
.end method
