.class Lcom/shopkick/app/products/CategoryJumperController$1$1;
.super Ljava/lang/Object;
.source "CategoryJumperController.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/CategoryJumperController$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/shopkick/app/products/CategoryJumperController$1;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/CategoryJumperController$1;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$1$1;->this$1:Lcom/shopkick/app/products/CategoryJumperController$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 167
    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController$1$1;->this$1:Lcom/shopkick/app/products/CategoryJumperController$1;

    iget-object v0, v0, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {v0}, Lcom/shopkick/app/products/CategoryJumperController;->access$300(Lcom/shopkick/app/products/CategoryJumperController;)Lcom/shopkick/app/screens/AppScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/screens/AppScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    .line 169
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 170
    iget-object v1, p0, Lcom/shopkick/app/products/CategoryJumperController$1$1;->this$1:Lcom/shopkick/app/products/CategoryJumperController$1;

    iget-object v1, v1, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {v1, v0}, Lcom/shopkick/app/products/CategoryJumperController;->access$400(Lcom/shopkick/app/products/CategoryJumperController;Landroid/view/LayoutInflater;)V

    return-void
.end method
