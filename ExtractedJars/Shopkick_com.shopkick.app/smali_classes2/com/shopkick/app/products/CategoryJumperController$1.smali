.class Lcom/shopkick/app/products/CategoryJumperController$1;
.super Ljava/lang/Object;
.source "CategoryJumperController.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/products/CategoryJumperController;-><init>(Lcom/shopkick/app/screens/AppScreen;Lcom/shopkick/app/url/URLDispatcher;Landroid/view/View;Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
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

    .line 156
    iput-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {p1}, Lcom/shopkick/app/products/CategoryJumperController;->access$000(Lcom/shopkick/app/products/CategoryJumperController;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {p1, v0}, Lcom/shopkick/app/products/CategoryJumperController;->access$002(Lcom/shopkick/app/products/CategoryJumperController;Z)Z

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {p1}, Lcom/shopkick/app/products/CategoryJumperController;->access$100(Lcom/shopkick/app/products/CategoryJumperController;)Landroid/widget/ListView;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {v0}, Lcom/shopkick/app/products/CategoryJumperController;->access$000(Lcom/shopkick/app/products/CategoryJumperController;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    invoke-virtual {p1, v0}, Landroid/widget/ListView;->setVisibility(I)V

    .line 161
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {p1}, Lcom/shopkick/app/products/CategoryJumperController;->access$200(Lcom/shopkick/app/products/CategoryJumperController;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 164
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {p1}, Lcom/shopkick/app/products/CategoryJumperController;->access$100(Lcom/shopkick/app/products/CategoryJumperController;)Landroid/widget/ListView;

    move-result-object p1

    new-instance v0, Lcom/shopkick/app/products/CategoryJumperController$1$1;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/CategoryJumperController$1$1;-><init>(Lcom/shopkick/app/products/CategoryJumperController$1;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListView;->post(Ljava/lang/Runnable;)Z

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/products/CategoryJumperController$1;->this$0:Lcom/shopkick/app/products/CategoryJumperController;

    invoke-static {p1, v1}, Lcom/shopkick/app/products/CategoryJumperController;->access$202(Lcom/shopkick/app/products/CategoryJumperController;Z)Z

    :cond_1
    return-void
.end method
