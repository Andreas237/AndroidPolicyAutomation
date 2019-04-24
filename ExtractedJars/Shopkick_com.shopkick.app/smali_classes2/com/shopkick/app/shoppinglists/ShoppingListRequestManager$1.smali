.class Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager$1;
.super Ljava/util/TimerTask;
.source "ShoppingListRequestManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->startRequestCycle()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;)V
    .locals 0

    .line 434
    iput-object p1, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 438
    iget-object v0, p0, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager$1;->this$0:Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;

    invoke-static {v0}, Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;->access$000(Lcom/shopkick/app/shoppinglists/ShoppingListRequestManager;)V

    return-void
.end method
