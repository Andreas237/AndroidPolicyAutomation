.class public Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;
.super Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;
.source "SeasonalListView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 23
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method protected initScrollTracking()V
    .locals 2

    .line 28
    invoke-super {p0}, Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;->initScrollTracking()V

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;->scrollListener:Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;

    const-string v1, "Seasonal"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/tracking/scrolltracking/VisibilityScrollListener;->setDebugTrackingLabel(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 30
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/seasonal/SeasonalListView;->onVisibilityChanged(Z)V

    return-void
.end method
