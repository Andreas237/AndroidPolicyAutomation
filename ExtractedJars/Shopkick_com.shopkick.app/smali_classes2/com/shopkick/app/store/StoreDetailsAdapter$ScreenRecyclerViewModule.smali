.class Lcom/shopkick/app/store/StoreDetailsAdapter$ScreenRecyclerViewModule;
.super Ljava/lang/Object;
.source "StoreDetailsAdapter.java"

# interfaces
.implements Lcom/shopkick/app/view/SKRecyclerView/ISKRecyclerViewModule;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/StoreDetailsAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ScreenRecyclerViewModule"
.end annotation


# instance fields
.field private StoreDetailsListAdapterRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/store/StoreDetailsAdapter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/store/StoreDetailsAdapter;)V
    .locals 1

    .line 936
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 937
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/store/StoreDetailsAdapter$ScreenRecyclerViewModule;->StoreDetailsListAdapterRef:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onAttach(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemActive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 954
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter$ScreenRecyclerViewModule;->StoreDetailsListAdapterRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/store/StoreDetailsAdapter;

    if-eqz p1, :cond_0

    const/16 p2, -0x1e

    .line 956
    invoke-static {p1, p2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->access$000(Lcom/shopkick/app/store/StoreDetailsAdapter;I)I

    move-result p2

    if-gez p2, :cond_0

    .line 957
    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->access$100(Lcom/shopkick/app/store/StoreDetailsAdapter;)I

    move-result p2

    if-ne p3, p2, :cond_0

    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->access$200(Lcom/shopkick/app/store/StoreDetailsAdapter;)Lcom/shopkick/app/store/CarouselPromoController;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 958
    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->access$200(Lcom/shopkick/app/store/StoreDetailsAdapter;)Lcom/shopkick/app/store/CarouselPromoController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/store/CarouselPromoController;->markVisible()V

    :cond_0
    return-void
.end method

.method public onItemInactive(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;Landroid/view/View;I)V
    .locals 0

    .line 965
    iget-object p1, p0, Lcom/shopkick/app/store/StoreDetailsAdapter$ScreenRecyclerViewModule;->StoreDetailsListAdapterRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/store/StoreDetailsAdapter;

    if-eqz p1, :cond_0

    const/16 p2, -0x1e

    .line 967
    invoke-static {p1, p2}, Lcom/shopkick/app/store/StoreDetailsAdapter;->access$000(Lcom/shopkick/app/store/StoreDetailsAdapter;I)I

    move-result p2

    if-gez p2, :cond_0

    .line 968
    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->access$100(Lcom/shopkick/app/store/StoreDetailsAdapter;)I

    move-result p2

    if-ne p3, p2, :cond_0

    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->access$200(Lcom/shopkick/app/store/StoreDetailsAdapter;)Lcom/shopkick/app/store/CarouselPromoController;

    move-result-object p2

    if-eqz p2, :cond_0

    .line 969
    invoke-static {p1}, Lcom/shopkick/app/store/StoreDetailsAdapter;->access$200(Lcom/shopkick/app/store/StoreDetailsAdapter;)Lcom/shopkick/app/store/CarouselPromoController;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/store/CarouselPromoController;->markNotVisible()V

    :cond_0
    return-void
.end method

.method public onScrollStateChanged(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;I)V
    .locals 0

    return-void
.end method

.method public onScrolled(Lcom/shopkick/app/view/SKRecyclerView/SKRecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onViewRecycled(Landroid/support/v7/widget/RecyclerView$ViewHolder;)V
    .locals 0

    return-void
.end method
