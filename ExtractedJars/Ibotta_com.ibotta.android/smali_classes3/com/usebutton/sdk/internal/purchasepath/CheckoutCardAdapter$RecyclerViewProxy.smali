.class Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;
.super Ljava/lang/Object;
.source "CheckoutCardAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RecyclerViewProxy"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;->this$0:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method notifyDataSetChanged()V
    .locals 1

    .line 218
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;->this$0:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method notifyItemInserted(I)V
    .locals 1

    .line 222
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;->this$0:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->notifyItemInserted(I)V

    return-void
.end method

.method notifyItemRemoved(I)V
    .locals 1

    .line 226
    iget-object v0, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$RecyclerViewProxy;->this$0:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-virtual {v0, p1}, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->notifyItemRemoved(I)V

    return-void
.end method
