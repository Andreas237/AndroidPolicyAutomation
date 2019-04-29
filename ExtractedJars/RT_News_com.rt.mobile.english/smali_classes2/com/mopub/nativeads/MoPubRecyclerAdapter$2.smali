.class Lcom/mopub/nativeads/MoPubRecyclerAdapter$2;
.super Ljava/lang/Object;
.source "MoPubRecyclerAdapter.java"

# interfaces
.implements Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;


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

    .line 79
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$2;->this$0:Lcom/mopub/nativeads/MoPubRecyclerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoaded(I)V
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$2;->this$0:Lcom/mopub/nativeads/MoPubRecyclerAdapter;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubRecyclerAdapter;->handleAdLoaded(I)V

    return-void
.end method

.method public onAdRemoved(I)V
    .locals 1

    .line 87
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubRecyclerAdapter$2;->this$0:Lcom/mopub/nativeads/MoPubRecyclerAdapter;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubRecyclerAdapter;->handleAdRemoved(I)V

    return-void
.end method
