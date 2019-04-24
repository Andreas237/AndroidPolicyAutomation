.class Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;
.super Lcom/ibotta/android/view/common/OnGlobalLayoutListener;
.source "SpotlightLocateStoreView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;Landroid/view/View;)V
    .locals 0

    .line 145
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    invoke-direct {p0, p2}, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;-><init>(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 2

    .line 148
    invoke-super {p0}, Lcom/ibotta/android/view/common/OnGlobalLayoutListener;->onGlobalLayout()V

    .line 149
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getWidth()I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    iget-object v0, v0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->rlmvLocations:Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->getHeight()I

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;->detach()V

    .line 151
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->access$002(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;Z)Z

    .line 152
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView$1;->this$0:Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;

    invoke-static {v0}, Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;->access$100(Lcom/ibotta/android/mvp/ui/view/spotlight/SpotlightLocateStoreView;)V

    :cond_0
    return-void
.end method
