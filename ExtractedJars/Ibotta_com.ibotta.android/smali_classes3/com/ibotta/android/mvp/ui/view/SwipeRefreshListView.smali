.class public Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;
.super Landroid/widget/ListView;
.source "SwipeRefreshListView.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 19
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 23
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public setRefreshScroll(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 1

    .line 36
    new-instance v0, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView$1;-><init>(Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;Landroid/support/v4/widget/SwipeRefreshLayout;)V

    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/SwipeRefreshListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    return-void
.end method
