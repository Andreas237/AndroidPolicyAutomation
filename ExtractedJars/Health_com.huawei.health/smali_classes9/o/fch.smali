.class public Lo/fch;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# instance fields
.field private c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/view/View;>;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 23
    iput-object p1, p0, Lo/fch;->c:Ljava/util/ArrayList;

    .line 24
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 38
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 28
    iget-object v0, p0, Lo/fch;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    .line 42
    iget-object v0, p0, Lo/fch;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    .line 43
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    .line 46
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 50
    :cond_0
    move-object v0, p1

    check-cast v0, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addView(Landroid/view/View;)V

    .line 51
    new-instance v0, Lo/fch$1;

    invoke-direct {v0, p0}, Lo/fch$1;-><init>(Lo/fch;)V

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    return-object v1
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 33
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
