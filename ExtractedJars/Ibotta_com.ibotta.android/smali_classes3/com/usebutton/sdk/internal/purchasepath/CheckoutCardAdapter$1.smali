.class Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$1;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "CheckoutCardAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;


# direct methods
.method constructor <init>(Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;Landroid/view/View;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter$1;->this$0:Lcom/usebutton/sdk/internal/purchasepath/CheckoutCardAdapter;

    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    .line 87
    invoke-super {p0}, Landroid/support/v7/widget/RecyclerView$ViewHolder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
