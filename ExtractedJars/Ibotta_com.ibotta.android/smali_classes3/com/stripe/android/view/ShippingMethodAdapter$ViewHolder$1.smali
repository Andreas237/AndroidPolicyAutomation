.class Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder$1;
.super Ljava/lang/Object;
.source "ShippingMethodAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;-><init>(Lcom/stripe/android/view/ShippingMethodAdapter;Lcom/stripe/android/view/ShippingMethodView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;

.field final synthetic val$this$0:Lcom/stripe/android/view/ShippingMethodAdapter;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;Lcom/stripe/android/view/ShippingMethodAdapter;)V
    .locals 0

    .line 76
    iput-object p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder$1;->this$1:Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;

    iput-object p2, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder$1;->val$this$0:Lcom/stripe/android/view/ShippingMethodAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 79
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder$1;->this$1:Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;

    iget-object p1, p1, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->this$0:Lcom/stripe/android/view/ShippingMethodAdapter;

    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder$1;->this$1:Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;

    iget v0, v0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->index:I

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/ShippingMethodAdapter;->setSelectedIndex(I)V

    return-void
.end method
