.class Lcom/huawei/health/sns/ui/photo/PhotoListActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$1;->c:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 232
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 227
    return-void
.end method

.method public onPageSelected(I)V
    .locals 3

    .line 219
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$1;->c:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$1;->c:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->a(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)Lo/bns;

    move-result-object v1

    invoke-virtual {v1}, Lo/bns;->getCurrentItem()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->d(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;I)I

    .line 220
    iget-object v0, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$1;->c:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/photo/PhotoListActivity$1;->c:Lcom/huawei/health/sns/ui/photo/PhotoListActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->c(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/photo/PhotoListActivity;->a(Lcom/huawei/health/sns/ui/photo/PhotoListActivity;I)V

    .line 221
    return-void
.end method
