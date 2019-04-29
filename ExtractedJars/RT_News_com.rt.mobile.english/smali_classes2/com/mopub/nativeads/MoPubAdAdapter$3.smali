.class Lcom/mopub/nativeads/MoPubAdAdapter$3;
.super Ljava/lang/Object;
.source "MoPubAdAdapter.java"

# interfaces
.implements Lcom/mopub/nativeads/MoPubNativeAdLoadedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mopub/nativeads/MoPubAdAdapter;-><init>(Lcom/mopub/nativeads/MoPubStreamAdPlacer;Landroid/widget/Adapter;Lcom/mopub/nativeads/VisibilityTracker;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/mopub/nativeads/MoPubAdAdapter;


# direct methods
.method constructor <init>(Lcom/mopub/nativeads/MoPubAdAdapter;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/mopub/nativeads/MoPubAdAdapter$3;->this$0:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdLoaded(I)V
    .locals 1

    .line 124
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter$3;->this$0:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubAdAdapter;->handleAdLoaded(I)V

    return-void
.end method

.method public onAdRemoved(I)V
    .locals 1

    .line 129
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubAdAdapter$3;->this$0:Lcom/mopub/nativeads/MoPubAdAdapter;

    invoke-virtual {v0, p1}, Lcom/mopub/nativeads/MoPubAdAdapter;->handleAdRemoved(I)V

    return-void
.end method
