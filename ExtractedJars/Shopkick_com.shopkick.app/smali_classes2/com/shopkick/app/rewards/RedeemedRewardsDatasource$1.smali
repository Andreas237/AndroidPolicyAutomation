.class Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$1;
.super Ljava/lang/Object;
.source "RedeemedRewardsDatasource.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$1;->this$0:Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)I
    .locals 5

    .line 98
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionDateMs:Ljava/lang/Long;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionDateMs:Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    .line 99
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionDateMs:Ljava/lang/Long;

    if-eqz v0, :cond_1

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;->redemptionDateMs:Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    .line 100
    invoke-virtual {p2, p1}, Ljava/lang/Long;->compareTo(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 95
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$1;->compare(Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;Lcom/shopkick/app/fetchers/api/skapi/RedeemedRewardInfo;)I

    move-result p1

    return p1
.end method
