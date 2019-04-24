.class Lcom/shopkick/app/receipts/ReceiptScanScreen$2;
.super Ljava/lang/Object;
.source "ReceiptScanScreen.java"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/receipts/ReceiptScanScreen;->setupAlignHereOnLayoutListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/receipts/ReceiptScanScreen;)V
    .locals 0

    .line 204
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 216
    iget-object p2, p0, Lcom/shopkick/app/receipts/ReceiptScanScreen$2;->this$0:Lcom/shopkick/app/receipts/ReceiptScanScreen;

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p2, Lcom/shopkick/app/receipts/ReceiptScanScreen;->alignHereHeight:I

    return-void
.end method
