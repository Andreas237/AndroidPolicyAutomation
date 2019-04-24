.class public final synthetic Lcom/shopkick/app/products/-$$Lambda$8IrCGNfMcXL26cGC7RYUBN0-WY4;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/shopkick/app/products/ScanScreen;


# direct methods
.method public synthetic constructor <init>(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/products/-$$Lambda$8IrCGNfMcXL26cGC7RYUBN0-WY4;->f$0:Lcom/shopkick/app/products/ScanScreen;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/shopkick/app/products/-$$Lambda$8IrCGNfMcXL26cGC7RYUBN0-WY4;->f$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->popScreen()V

    return-void
.end method
