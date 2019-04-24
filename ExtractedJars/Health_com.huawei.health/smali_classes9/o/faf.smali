.class public Lo/faf;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lo/fae;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lo/fae;>;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 19
    iput-object p1, p0, Lo/faf;->a:Ljava/util/ArrayList;

    .line 20
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 24
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 28
    iget-object v0, p0, Lo/faf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 4

    .line 38
    iget-object v0, p0, Lo/faf;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/fae;

    .line 39
    invoke-virtual {v1}, Lo/fae;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    .line 40
    if-eqz v2, :cond_0

    .line 41
    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    .line 42
    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 46
    :cond_0
    move-object v0, p1

    check-cast v0, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addView(Landroid/view/View;)V

    .line 47
    new-instance v0, Lo/faf$2;

    invoke-direct {v0, p0}, Lo/faf$2;-><init>(Lo/faf;)V

    invoke-virtual {v1, v0}, Lo/fae;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 55
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
