.class Lcom/shopkick/app/products/CategoryJumperController$2;
.super Ljava/lang/Object;
.source "CategoryJumperController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/CategoryJumperController;->updateContainerLayout()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/CategoryJumperController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/CategoryJumperController;)V
    .locals 0

    .line 585
    iput-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$2;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 588
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController$2;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {v0}, Lcom/shopkick/app/products/CategoryJumperController;->access$600(Lcom/shopkick/app/products/CategoryJumperController;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Lcom/shopkick/app/products/CategoryJumperController;->access$502(Lcom/shopkick/app/products/CategoryJumperController;I)I

    .line 589
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController$2;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {v0}, Lcom/shopkick/app/products/CategoryJumperController;->access$800(Lcom/shopkick/app/products/CategoryJumperController;)Landroid/view/ViewGroup;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v1

    invoke-static {v0, v1}, Lcom/shopkick/app/products/CategoryJumperController;->access$702(Lcom/shopkick/app/products/CategoryJumperController;I)I

    return-void
.end method
