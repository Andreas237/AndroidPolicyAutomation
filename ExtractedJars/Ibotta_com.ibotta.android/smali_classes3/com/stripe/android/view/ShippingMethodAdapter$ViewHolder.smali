.class Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "ShippingMethodAdapter.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/ShippingMethodAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ViewHolder"
.end annotation


# instance fields
.field index:I

.field shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;

.field final synthetic this$0:Lcom/stripe/android/view/ShippingMethodAdapter;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/ShippingMethodAdapter;Lcom/stripe/android/view/ShippingMethodView;)V
    .locals 1

    .line 73
    iput-object p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->this$0:Lcom/stripe/android/view/ShippingMethodAdapter;

    .line 74
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 75
    iput-object p2, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;

    .line 76
    new-instance v0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder$1;-><init>(Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;Lcom/stripe/android/view/ShippingMethodAdapter;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Lcom/stripe/android/view/ShippingMethodView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p2, Landroid/view/View;

    invoke-static {p2, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method


# virtual methods
.method setIndex(I)V
    .locals 0

    .line 93
    iput p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->index:I

    return-void
.end method

.method setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V
    .locals 1

    .line 85
    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ShippingMethodView;->setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V

    return-void
.end method

.method setUIAsSelected(Z)V
    .locals 1

    .line 89
    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->shippingMethodView:Lcom/stripe/android/view/ShippingMethodView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/ShippingMethodView;->setSelected(Z)V

    return-void
.end method
