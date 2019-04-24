.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/view/View;>;)V"
        }
    .end annotation

    .line 747
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 748
    iput-object p2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->a:Ljava/util/ArrayList;

    .line 749
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 1

    .line 763
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge p2, v0, :cond_0

    .line 764
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 766
    :cond_0
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 753
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->e:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 1

    .line 848
    const/4 v0, -0x2

    return v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 5

    .line 771
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p2, v0, :cond_1

    .line 772
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 774
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    .line 777
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    .line 778
    if-eqz v3, :cond_2

    .line 779
    move-object v4, v3

    check-cast v4, Landroid/view/ViewGroup;

    .line 780
    invoke-virtual {v4, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 784
    :cond_2
    move-object v0, p1

    check-cast v0, Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->addView(Landroid/view/View;)V

    .line 785
    new-instance v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;

    invoke-direct {v0, p0, p2}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e$4;-><init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;I)V

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 842
    return-object v2
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 758
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
