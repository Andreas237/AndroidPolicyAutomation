.class public Lcom/shopkick/app/util/TileUtils$TileInfoV2ScanKicksComparator;
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
    name = "TileInfoV2ScanKicksComparator"
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

    .line 249
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I
    .locals 2

    .line 255
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_5

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    goto :goto_2

    .line 258
    :cond_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-nez v0, :cond_2

    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    move p1, v1

    move p2, p1

    goto :goto_4

    .line 259
    :cond_2
    :goto_0
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_3
    move p1, v1

    .line 260
    :goto_1
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    if-eqz v0, :cond_4

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->kickAmount:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_4

    :cond_4
    move p2, v1

    goto :goto_4

    .line 256
    :cond_5
    :goto_2
    iget-object v0, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    if-eqz v0, :cond_6

    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_6
    move p1, v1

    .line 257
    :goto_3
    iget-object v0, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    if-eqz v0, :cond_7

    iget-object p2, p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;->scanKickAmount:Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_4

    :cond_7
    move p2, v1

    :goto_4
    if-le p1, p2, :cond_8

    const/4 p1, 0x1

    return p1

    :cond_8
    if-ge p1, p2, :cond_9

    const/4 p1, -0x1

    return p1

    :cond_9
    return v1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 249
    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    check-cast p2, Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/util/TileUtils$TileInfoV2ScanKicksComparator;->compare(Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)I

    move-result p1

    return p1
.end method
