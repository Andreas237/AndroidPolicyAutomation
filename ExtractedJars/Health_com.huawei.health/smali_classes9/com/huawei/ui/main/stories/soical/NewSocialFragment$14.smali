.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 915
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 918
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v4

    .line 919
    const/4 v5, 0x0

    .line 920
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_0

    .line 921
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->l(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x4

    goto :goto_0

    .line 923
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->n(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    .line 924
    return-void

    .line 926
    :goto_0
    const/4 v0, 0x1

    if-le v5, v0, :cond_2

    .line 927
    add-int/lit8 v0, v5, 0x2

    rem-int v0, v4, v0

    add-int/lit8 v4, v0, 0x1

    .line 928
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    .line 929
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    add-int/lit8 v1, v4, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 930
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    .line 932
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 933
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->s(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Ljava/lang/Runnable;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$14;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->q(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 936
    :cond_2
    :goto_1
    return-void
.end method
