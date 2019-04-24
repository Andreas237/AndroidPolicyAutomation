.class Lcom/stripe/android/view/ShippingMethodAdapter;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "ShippingMethodAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<",
        "Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private mSelectedIndex:I
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mShippingMethods:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 21
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mShippingMethods:Ljava/util/List;

    const/4 v0, 0x0

    .line 19
    iput v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mSelectedIndex:I

    return-void
.end method


# virtual methods
.method public getItemCount()I
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mShippingMethods:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 30
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$Adapter;->getItemId(I)J

    move-result-wide v0

    return-wide v0
.end method

.method getSelectedShippingMethod()Lcom/stripe/android/model/ShippingMethod;
    .locals 2

    .line 47
    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mShippingMethods:Ljava/util/List;

    iget v1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mSelectedIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ShippingMethod;

    return-object v0
.end method

.method public bridge synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 0

    .line 16
    check-cast p1, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter;->onBindViewHolder(Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;I)V

    return-void
.end method

.method public onBindViewHolder(Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;I)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mShippingMethods:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/model/ShippingMethod;

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->setShippingMethod(Lcom/stripe/android/model/ShippingMethod;)V

    .line 42
    invoke-virtual {p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->setIndex(I)V

    .line 43
    iget v0, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mSelectedIndex:I

    if-ne p2, v0, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;->setUIAsSelected(Z)V

    return-void
.end method

.method public bridge synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/view/ShippingMethodAdapter;->onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;

    move-result-object p1

    return-object p1
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;
    .locals 0

    .line 35
    new-instance p2, Lcom/stripe/android/view/ShippingMethodView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/stripe/android/view/ShippingMethodView;-><init>(Landroid/content/Context;)V

    .line 36
    new-instance p1, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;

    invoke-direct {p1, p0, p2}, Lcom/stripe/android/view/ShippingMethodAdapter$ViewHolder;-><init>(Lcom/stripe/android/view/ShippingMethodAdapter;Lcom/stripe/android/view/ShippingMethodView;)V

    return-object p1
.end method

.method setSelectedIndex(I)V
    .locals 0

    .line 64
    iput p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mSelectedIndex:I

    .line 65
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method setShippingMethods(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;",
            "Lcom/stripe/android/model/ShippingMethod;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    .line 53
    iput-object p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mShippingMethods:Ljava/util/List;

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    .line 56
    iput p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mSelectedIndex:I

    goto :goto_0

    .line 58
    :cond_1
    iget-object p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mShippingMethods:Ljava/util/List;

    invoke-interface {p1, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lcom/stripe/android/view/ShippingMethodAdapter;->mSelectedIndex:I

    .line 60
    :goto_0
    invoke-virtual {p0}, Lcom/stripe/android/view/ShippingMethodAdapter;->notifyDataSetChanged()V

    return-void
.end method
