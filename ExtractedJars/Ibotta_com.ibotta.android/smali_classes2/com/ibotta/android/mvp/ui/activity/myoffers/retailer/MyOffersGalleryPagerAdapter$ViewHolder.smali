.class public Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "MyOffersGalleryPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/myoffers/retailer/MyOffersGalleryPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ViewHolder"
.end annotation


# instance fields
.field protected moglvOffers:Lcom/ibotta/android/mvp/ui/view/myoffers/gallery/MyOffersGalleryListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090363
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 229
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 230
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method
