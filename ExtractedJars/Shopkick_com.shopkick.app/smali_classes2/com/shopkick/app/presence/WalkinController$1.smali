.class Lcom/shopkick/app/presence/WalkinController$1;
.super Ljava/lang/Object;
.source "WalkinController.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/presence/WalkinController;->onAwardsResponseReceived(Ljava/util/HashMap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/presence/WalkinController;


# direct methods
.method constructor <init>(Lcom/shopkick/app/presence/WalkinController;)V
    .locals 0

    .line 399
    iput-object p1, p0, Lcom/shopkick/app/presence/WalkinController$1;->this$0:Lcom/shopkick/app/presence/WalkinController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;)I
    .locals 6

    .line 403
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    .line 404
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 405
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;

    .line 406
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;->timestamp:Ljava/lang/Long;

    if-eqz v0, :cond_0

    .line 407
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;->timestamp:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    move-wide v4, v1

    .line 411
    :goto_0
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->statusCode:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    if-eqz p1, :cond_1

    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    .line 412
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_1

    .line 413
    iget-object p1, p2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;->checkinStamps:Ljava/util/List;

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;

    .line 414
    iget-object p2, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;->timestamp:Ljava/lang/Long;

    if-eqz p2, :cond_1

    .line 415
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/CheckinStamp;->timestamp:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_1
    cmp-long p1, v4, v1

    if-nez p1, :cond_2

    return v3

    :cond_2
    if-gez p1, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, -0x1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 399
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/presence/WalkinController$1;->compare(Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;Lcom/shopkick/app/fetchers/api/skapi/LocationsCheckinResponse;)I

    move-result p1

    return p1
.end method
