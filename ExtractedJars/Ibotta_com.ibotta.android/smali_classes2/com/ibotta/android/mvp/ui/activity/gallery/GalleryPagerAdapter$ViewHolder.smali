.class public Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "GalleryPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ViewHolder"
.end annotation


# instance fields
.field protected glvGalleryList:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090211
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;)V
    .locals 0

    .line 194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 195
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    .line 196
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/gallery/GalleryPagerAdapter$ViewHolder;->glvGalleryList:Lcom/ibotta/android/mvp/ui/view/gallery/GalleryListView;

    invoke-virtual {p2, p1}, Lcom/ibotta/android/mvp/ui/view/ScrollingBottomSpace;->setBottomPadding(Landroid/view/View;)V

    return-void
.end method
