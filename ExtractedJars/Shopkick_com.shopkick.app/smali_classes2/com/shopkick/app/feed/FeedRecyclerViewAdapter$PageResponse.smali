.class public Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageResponse;
.super Ljava/lang/Object;
.source "FeedRecyclerViewAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PageResponse"
.end annotation


# instance fields
.field public nextPageKey:Ljava/lang/String;

.field public noContentMessage:Ljava/lang/String;

.field public pageStatus:Lcom/shopkick/app/feed/FeedRecyclerViewAdapter$PageStatus;

.field public tiles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1752
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
