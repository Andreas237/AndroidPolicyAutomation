.class Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 108
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->a(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v4

    .line 109
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->a(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->a(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Landroid/support/v4/view/ViewPager;

    move-result-object v1

    invoke-virtual {v0, v1, v4}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/support/v4/app/Fragment;

    .line 110
    invoke-virtual {v5}, Landroid/support/v4/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lo/cdz;->c(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 111
    if-eqz v6, :cond_1

    .line 112
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->d:Lo/dav;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/dav;->d(Z)V

    .line 113
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->d:Lo/dav;

    invoke-virtual {v0, v6}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 114
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->d:Lo/dav;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lo/dav;->a(I)V

    .line 115
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 118
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->b(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Landroid/app/Activity;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$2;->e:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    iget-object v1, v1, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->d:Lo/dav;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 121
    :cond_1
    :goto_0
    return-void
.end method
