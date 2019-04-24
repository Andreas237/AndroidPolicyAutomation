.class Lcom/huawei/health/sns/ui/group/GroupListFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/GroupListFragment;->n()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/sns/ui/group/GroupListFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/GroupListFragment;)V
    .locals 0

    .line 640
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment$2;->e:Lcom/huawei/health/sns/ui/group/GroupListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 644
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment$2;->e:Lcom/huawei/health/sns/ui/group/GroupListFragment;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->f(Lcom/huawei/health/sns/ui/group/GroupListFragment;)Lo/asz;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment$2;->e:Lcom/huawei/health/sns/ui/group/GroupListFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->e(Lcom/huawei/health/sns/ui/group/GroupListFragment;)Z

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/sns/ui/group/GroupListFragment$2;->e:Lcom/huawei/health/sns/ui/group/GroupListFragment;

    invoke-static {v2}, Lcom/huawei/health/sns/ui/group/GroupListFragment;->k(Lcom/huawei/health/sns/ui/group/GroupListFragment;)Landroid/os/Handler;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/asz;->b(ZLandroid/os/Handler;)V

    .line 645
    return-void
.end method
