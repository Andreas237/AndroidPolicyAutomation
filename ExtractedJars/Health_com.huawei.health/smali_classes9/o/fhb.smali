.class public Lo/fhb;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/List;
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

    .line 17
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 18
    iput-object p1, p0, Lo/fhb;->a:Ljava/util/List;

    .line 19
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/View;ILjava/lang/Object;)V
    .locals 2

    .line 24
    instance-of v0, p1, Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 25
    if-ltz p2, :cond_0

    iget-object v0, p0, Lo/fhb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 26
    move-object v0, p1

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lo/fhb;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->removeView(Landroid/view/View;)V

    .line 29
    :cond_0
    return-void
.end method

.method public finishUpdate(Landroid/view/View;)V
    .locals 0

    .line 33
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 38
    iget-object v0, p0, Lo/fhb;->a:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 39
    iget-object v0, p0, Lo/fhb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 41
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public instantiateItem(Landroid/view/View;I)Ljava/lang/Object;
    .locals 4

    .line 47
    instance-of v0, p1, Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 48
    move-object v0, p1

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lo/fhb;->a:Ljava/util/List;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->addView(Landroid/view/View;I)V

    .line 50
    :cond_0
    iget-object v0, p0, Lo/fhb;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 51
    iget-object v0, p0, Lo/fhb;->a:Ljava/util/List;

    iget-object v1, p0, Lo/fhb;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    .line 52
    new-instance v0, Lo/fhb$5;

    invoke-direct {v0, p0}, Lo/fhb$5;-><init>(Lo/fhb;)V

    invoke-virtual {v3, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 62
    :cond_1
    iget-object v0, p0, Lo/fhb;->a:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 72
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 67
    return-void
.end method

.method public saveState()Landroid/os/Parcelable;
    .locals 1

    .line 82
    const/4 v0, 0x0

    return-object v0
.end method

.method public startUpdate(Landroid/view/View;)V
    .locals 0

    .line 77
    return-void
.end method
