.class public Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;
.super Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;
.source "ReceiptAdapter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter<",
        "Lcom/ibotta/api/model/offer/Offer;",
        ">;"
    }
.end annotation


# instance fields
.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/offer/Offer;",
            ">;",
            "Lcom/ibotta/android/util/Formatting;",
            "Lcom/ibotta/android/images/ImageCache;",
            ")V"
        }
    .end annotation

    const v0, 0x7f0c012d

    .line 26
    invoke-direct {p0, p1, v0, p2}, Lcom/ibotta/android/commons/view/list/SimplifiedArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    .line 27
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 28
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    return-void
.end method


# virtual methods
.method public isEnabled(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public makeViewHolder(ILandroid/view/View;)Lcom/ibotta/android/commons/view/list/ViewHolder;
    .locals 1

    .line 33
    new-instance p1, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;-><init>(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$1;)V

    const v0, 0x7f0902af

    .line 34
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$102(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    const v0, 0x7f09055e

    .line 35
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p1, v0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$202(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    const v0, 0x7f09051b

    .line 36
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    invoke-static {p1, p2}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$302(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    return-object p1
.end method

.method public updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/api/model/offer/Offer;)V
    .locals 4

    .line 42
    check-cast p3, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;

    .line 44
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p4}, Lcom/ibotta/api/model/offer/Offer;->getUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {p3}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$100(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;)Landroid/widget/ImageView;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->PRODUCT_SMALL:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {p1, p2, v0, v1, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 46
    invoke-static {p3}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$200(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p4}, Lcom/ibotta/api/model/offer/Offer;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    invoke-static {p3}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$200(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const/4 p2, 0x1

    new-array v0, p2, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 48
    invoke-virtual {p4}, Lcom/ibotta/api/model/offer/Offer;->getEarnedAmount()F

    move-result v2

    float-to-double v2, v2

    invoke-interface {v1, v2, v3}, Lcom/ibotta/android/util/Formatting;->currency(D)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0x7f1101c3

    .line 47
    invoke-virtual {p1, v1, v0}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 50
    invoke-virtual {p4}, Lcom/ibotta/api/model/offer/Offer;->isVerified()Z

    move-result p4

    if-eqz p4, :cond_0

    .line 51
    invoke-static {p3}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$200(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;)Landroid/widget/TextView;

    move-result-object p4

    invoke-virtual {p4}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const v0, 0x7f110477

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p1, p2, v2

    invoke-virtual {p4, v0, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 53
    :cond_0
    invoke-static {p3}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$200(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;)Landroid/widget/TextView;

    move-result-object p4

    invoke-virtual {p4}, Landroid/widget/TextView;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    const v0, 0x7f11047b

    new-array p2, p2, [Ljava/lang/Object;

    aput-object p1, p2, v2

    invoke-virtual {p4, v0, p2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 57
    :goto_0
    invoke-static {p3}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;->access$300(Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter$ReceiptViewHolder;)Landroid/widget/TextView;

    move-result-object p2

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Ljava/lang/Object;)V
    .locals 0

    .line 21
    check-cast p4, Lcom/ibotta/api/model/offer/Offer;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/ibotta/android/fragment/activity/detail/ReceiptAdapter;->updateView(IILcom/ibotta/android/commons/view/list/ViewHolder;Lcom/ibotta/api/model/offer/Offer;)V

    return-void
.end method
