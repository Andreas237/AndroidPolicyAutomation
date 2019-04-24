.class Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)V
    .locals 0

    .line 544
    iput-object p1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 547
    iget-object v0, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;

    .line 548
    move-object v0, v6

    iget-object v1, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->a(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->i(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)D

    move-result-wide v2

    iget-object v4, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-static {v4}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->k(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)I

    move-result v4

    iget-object v5, p0, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment$4;->b:Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;

    invoke-static {v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;->h(Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailFragment;)Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;

    move-result-object v5

    invoke-virtual {v5}, Lcom/huawei/health/sns/ui/group/healthbeans/HealthGroupActivityBean;->getImgUrl()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/health/sns/ui/groupstoredemo/HealthEventDetailActivity;->b(IDILjava/lang/String;)V

    .line 549
    return-void
.end method
