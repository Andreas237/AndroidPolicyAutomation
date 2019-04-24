.class Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$3;
.super Ljava/lang/Object;
.source "ScanningControllerV2.java"

# interfaces
.implements Landroid/hardware/Camera$AutoFocusCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->tryFocusOnHotSpot(II)V
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

    .line 241
    iput-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$3;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAutoFocus(ZLandroid/hardware/Camera;)V
    .locals 0

    .line 244
    iget-object p1, p0, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2$3;->this$0:Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;->access$302(Lcom/shopkick/app/products/scanning/controllers/ScanningControllerV2;Z)Z

    return-void
.end method
