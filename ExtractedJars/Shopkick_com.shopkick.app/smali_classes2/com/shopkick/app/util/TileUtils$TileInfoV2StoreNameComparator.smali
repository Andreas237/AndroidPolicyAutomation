.class public Lcom/shopkick/app/util/TileUtils$TileInfoV2StoreNameComparator;
.super Ljava/lang/Object;
.source "TileUtils.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/util/TileUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TileInfoV2StoreNameComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 241
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I
    .locals 1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 244
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    .line 245
    :cond_0
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->chainName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 241
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/util/TileUtils$TileInfoV2StoreNameComparator;->compare(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result p1

    return p1
.end method
