.class Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator$StoreCellOnClickListener;
.super Ljava/lang/Object;
.source "ReceiptStoreCellTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "StoreCellOnClickListener"
.end annotation


# instance fields
.field private link:Ljava/lang/String;

.field final synthetic this$0:Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;Ljava/lang/String;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator$StoreCellOnClickListener;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput-object p2, p0, Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator$StoreCellOnClickListener;->link:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 89
    iget-object p1, p0, Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator$StoreCellOnClickListener;->this$0:Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;

    invoke-static {p1}, Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;->access$000(Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator;)Lcom/shopkick/app/url/URLDispatcher;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/receipts/ReceiptStoreCellTileConfigurator$StoreCellOnClickListener;->link:Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/url/URLDispatcher;->dispatchURL(Ljava/lang/String;)Z

    return-void
.end method
