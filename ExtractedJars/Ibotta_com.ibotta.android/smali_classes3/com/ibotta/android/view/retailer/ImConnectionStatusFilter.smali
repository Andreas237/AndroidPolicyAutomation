.class public Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;
.super Ljava/lang/Object;
.source "ImConnectionStatusFilter.java"

# interfaces
.implements Lcom/ibotta/android/view/retailer/RetailerModelFilter;


# instance fields
.field private final customer:Lcom/ibotta/api/model/customer/Customer;

.field private final imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

.field private final statusesToFilter:[Lcom/ibotta/api/model/im/ImConnectionStatus;


# direct methods
.method public varargs constructor <init>(Lcom/ibotta/api/model/customer/Customer;Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;[Lcom/ibotta/api/model/im/ImConnectionStatus;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 18
    iput-object p2, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    .line 19
    iput-object p3, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->statusesToFilter:[Lcom/ibotta/api/model/im/ImConnectionStatus;

    return-void
.end method


# virtual methods
.method public filter(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/RetailerModel;",
            ">;)V"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->customer:Lcom/ibotta/api/model/customer/Customer;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->statusesToFilter:[Lcom/ibotta/api/model/im/ImConnectionStatus;

    array-length v0, v0

    if-nez v0, :cond_0

    goto :goto_2

    .line 28
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 30
    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/api/model/RetailerModel;

    .line 34
    invoke-interface {v0}, Lcom/ibotta/api/model/RetailerModel;->isAuxiliaryLoyaltyEnabled()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 38
    :cond_2
    iget-object v1, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->imUtil:Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;

    iget-object v2, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->customer:Lcom/ibotta/api/model/customer/Customer;

    .line 39
    invoke-virtual {v2}, Lcom/ibotta/api/model/customer/Customer;->getCredentialIntegrations()Ljava/util/List;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/ibotta/android/mvp/ui/activity/im/ImUtil;->getImConnectionStatusForRetailer(Lcom/ibotta/api/model/RetailerModel;Ljava/util/List;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v0

    .line 41
    iget-object v1, p0, Lcom/ibotta/android/view/retailer/ImConnectionStatusFilter;->statusesToFilter:[Lcom/ibotta/api/model/im/ImConnectionStatus;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    if-ne v4, v0, :cond_3

    .line 44
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    return-void

    :cond_5
    :goto_2
    return-void
.end method
