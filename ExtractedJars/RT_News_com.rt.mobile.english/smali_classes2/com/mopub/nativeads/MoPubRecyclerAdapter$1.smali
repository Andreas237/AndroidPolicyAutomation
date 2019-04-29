.class Lcom/mopub/nativeads/MoPubRecyclerAdapter$1;
.super Ljava/lang/Object;
.source "MoPubRecyclerAdapter.java"

# interfaces
.implements Lcom/mopub/nativeads/VisibilityTracker$VisibilityTrackerListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/MoPubRecyclerAdapter;-><init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;Landroid/support/v7/widget/RecyclerView$Adapter;Lcom/mopub/nativeads/VisibilityTracker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/nativeads/MoPubRecyclerAdapter;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubRecyclerAdapter;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$1;->this$0:Lcom/mopub/nativeads/MoPubRecyclerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onVisibilityChanged(Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/List<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .line 72
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$1;->this$0:Lcom/mopub/nativeads/MoPubRecyclerAdapter;

    invoke-static {v0, p1, p2}, Lcom/mopub/nativeads/MoPubRecyclerAdapter;->access$000(Lcom/mopub/nativeads/MoPubRecyclerAdapter;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
