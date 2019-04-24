.class public Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;
.super Landroid/support/v7/widget/RecyclerView$ViewHolder;
.source "RetailerSSCardAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ViewHolder"
.end annotation


# instance fields
.field private final rssItem:Lcom/ibotta/android/views/components/ViewComponent;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/views/components/ViewComponent;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/views/components/ViewComponent<",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
            "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
            ">;)V"
        }
    .end annotation

    .line 73
    move-object v0, p1

    check-cast v0, Landroid/view/View;

    invoke-direct {p0, v0}, Landroid/support/v7/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;->rssItem:Lcom/ibotta/android/views/components/ViewComponent;

    return-void
.end method

.method static synthetic access$000(Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;)Lcom/ibotta/android/views/components/ViewComponent;
    .locals 0

    .line 69
    iget-object p0, p0, Lcom/ibotta/android/mvp/ui/adapter/retailer/RetailerSSCardAdapter$ViewHolder;->rssItem:Lcom/ibotta/android/views/components/ViewComponent;

    return-object p0
.end method
