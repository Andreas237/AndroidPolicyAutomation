.class public Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "MoreStoresPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/morestores/MoreStoresPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ViewHolder"
.end annotation


# instance fields
.field protected msrlvMoreStores:Lcom/ibotta/android/mvp/ui/view/retailer/morestores/MoreStoresRetailersListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090367
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method
