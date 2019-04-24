.class Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$3;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .line 155
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 163
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 158
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity$3;->c:Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;->c(Lcom/huawei/health/sns/ui/group/HealthEventShareActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method
