.class Lcom/shopkick/app/feed/FilterableSearchTileConfigurator$1;
.super Ljava/lang/Object;
.source "FilterableSearchTileConfigurator.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;->onBindViewHolder(Lcom/shopkick/app/view/SKRecyclerView/RecyclerViewHolder;Lcom/shopkick/app/fetchers/api/skapi/TileInfoV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;


# direct methods
.method constructor <init>(Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator$1;->this$0:Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 37
    iget-object p2, p0, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator$1;->this$0:Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/feed/FilterableSearchTileConfigurator;->onClick(Landroid/view/View;)V

    const/4 p1, 0x1

    return p1
.end method
