.class public Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# instance fields
.field public listviews:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/view/View;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Landroid/view/View;>;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;->listviews:Ljava/util/List;

    .line 24
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/View;ILjava/lang/Object;)V
    .locals 2

    .line 29
    if-ltz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;->listviews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 30
    move-object v0, p1

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;->listviews:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    .line 32
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 54
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;->listviews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/View;I)Ljava/lang/Object;
    .locals 3

    .line 37
    if-ltz p2, :cond_0

    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;->listviews:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 38
    move-object v0, p1

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;->listviews:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->addView(Landroid/view/View;I)V

    .line 39
    iget-object v0, p0, Lcom/huawei/nfc/carrera/ui/carddetail/MyPagerAdapter;->listviews:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 41
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 1

    .line 48
    invoke-super {p0, p1, p2}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 60
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
