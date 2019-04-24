.class Lcom/shopkick/app/receipts/AbstractCameraController$1;
.super Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;
.source "AbstractCameraController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/AbstractCameraController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/AbstractCameraController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/AbstractCameraController;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$1;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-direct {p0}, Lcom/shopkick/app/fetchers/api/skapi/ImageDimension;-><init>()V

    const/16 p1, 0x400

    .line 34
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$1;->width:Ljava/lang/Integer;

    const/16 p1, 0x300

    .line 35
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$1;->height:Ljava/lang/Integer;

    return-void
.end method
