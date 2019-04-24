.class public Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;
.super Ljava/lang/Object;
.source "CategoryRetailerModelFilter.java"

# interfaces
.implements Lcom/ibotta/android/view/retailer/RetailerModelFilter;


# instance fields
.field private final retailerCategoryId:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;->retailerCategoryId:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public filter(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 23
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    .line 25
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->getCategoryIds()Ljava/util/Set;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/view/retailer/CategoryRetailerModelFilter;->retailerCategoryId:Ljava/lang/Integer;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method
