.class Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 854
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 857
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v4

    .line 858
    const/4 v5, 0x0

    .line 859
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_0

    .line 860
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->h(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x2

    goto :goto_0

    .line 862
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->i(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    .line 863
    return-void

    .line 865
    :goto_0
    const/4 v0, 0x1

    if-le v5, v0, :cond_2

    .line 866
    add-int/lit8 v0, v5, 0x1

    rem-int v0, v4, v0

    add-int/lit8 v4, v0, 0x1

    .line 867
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 868
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 869
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 871
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 872
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->o(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->p(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$6;->d:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->m(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 875
    :cond_2
    :goto_1
    return-void
.end method
