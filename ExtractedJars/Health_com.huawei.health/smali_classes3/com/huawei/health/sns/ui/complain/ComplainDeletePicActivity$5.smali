.class Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$5;->c:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 155
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 150
    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    .line 143
    iget-object v0, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$5;->c:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    iget-object v1, p0, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity$5;->c:Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;)Lo/bns;

    move-result-object v1

    invoke-virtual {v1}, Lo/bns;->getCurrentItem()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;->c(Lcom/huawei/health/sns/ui/complain/ComplainDeletePicActivity;I)I

    .line 144
    return-void
.end method
