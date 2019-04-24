.class Lcom/shopkick/app/products/ScanScreen$1;
.super Ljava/lang/Object;
.source "ScanScreen.java"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/ScanScreen;->onScreenDidShow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ScanScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ScanScreen;)V
    .locals 0

    .line 509
    iput-object p1, p0, Lcom/shopkick/app/products/ScanScreen$1;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .line 512
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$1;->this$0:Lcom/shopkick/app/products/ScanScreen;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/products/ScanScreen;->access$002(Lcom/shopkick/app/products/ScanScreen;Z)Z

    .line 513
    iget-object p1, p0, Lcom/shopkick/app/products/ScanScreen$1;->this$0:Lcom/shopkick/app/products/ScanScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/products/ScanScreen;->popScreen()V

    return-void
.end method
