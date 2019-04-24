.class Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "MaskedCardAdapter.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/view/MaskedCardAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ViewHolder"
.end annotation


# instance fields
.field index:I

.field maskedCardView:Lcom/stripe/android/view/MaskedCardView;

.field final synthetic this$0:Lcom/stripe/android/view/MaskedCardAdapter;


# direct methods
.method constructor <init>(Lcom/stripe/android/view/MaskedCardAdapter;Landroid/widget/FrameLayout;)V
    .locals 1

    .line 129
    iput-object p1, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->this$0:Lcom/stripe/android/view/MaskedCardAdapter;

    .line 130
    invoke-direct {p0, p2}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 131
    sget v0, Lcom/stripe/android/R$id;->masked_card_item:I

    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/view/MaskedCardView;

    iput-object v0, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->maskedCardView:Lcom/stripe/android/view/MaskedCardView;

    .line 132
    new-instance v0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;

    invoke-direct {v0, p0, p1}, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder$1;-><init>(Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;Lcom/stripe/android/view/MaskedCardAdapter;)V

    instance-of p1, p2, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p2, v0}, Landroid/widget/FrameLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

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

    .line 148
    iput p1, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->index:I

    return-void
.end method

.method setMaskedCardData(Lcom/stripe/android/model/CustomerSource;)V
    .locals 1
    .param p1    # Lcom/stripe/android/model/CustomerSource;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 144
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->maskedCardView:Lcom/stripe/android/view/MaskedCardView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/MaskedCardView;->setCustomerSource(Lcom/stripe/android/model/CustomerSource;)V

    return-void
.end method

.method setSelected(Z)V
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/stripe/android/view/MaskedCardAdapter$ViewHolder;->maskedCardView:Lcom/stripe/android/view/MaskedCardView;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/MaskedCardView;->setSelected(Z)V

    return-void
.end method
