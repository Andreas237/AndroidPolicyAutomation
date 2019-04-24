.class Lcom/shopkick/app/receipts/AbstractCameraController$2;
.super Ljava/lang/Object;
.source "AbstractCameraController.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/AbstractCameraController;->showConfirmCancelDialog()V
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

    .line 150
    iput-object p1, p0, Lcom/shopkick/app/receipts/AbstractCameraController$2;->this$0:Lcom/shopkick/app/receipts/AbstractCameraController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 153
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
