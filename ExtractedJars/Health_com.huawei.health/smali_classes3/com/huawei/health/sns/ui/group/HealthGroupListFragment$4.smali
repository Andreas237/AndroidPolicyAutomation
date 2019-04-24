.class Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)V
    .locals 0

    .line 356
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 359
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->l(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Lo/asz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment$4;->c:Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;->o(Lcom/huawei/health/sns/ui/group/HealthGroupListFragment;)Landroid/os/Handler;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Lo/asz;->b(ZLandroid/os/Handler;)V

    .line 360
    return-void
.end method
