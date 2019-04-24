.class Lcom/huawei/health/sns/ui/group/GroupFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/GroupFragment;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/group/GroupFragment;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/GroupFragment;I)V
    .locals 0

    .line 989
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$4;->d:Lcom/huawei/health/sns/ui/group/GroupFragment;

    iput p2, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$4;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 993
    iget v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$4;->e:I

    const/16 v1, 0x3f0

    if-ne v0, v1, :cond_0

    .line 995
    new-instance v0, Lo/atb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$4;->d:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/GroupFragment;->d(Lcom/huawei/health/sns/ui/group/GroupFragment;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atb;->b(J)V

    .line 997
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/GroupFragment$4;->d:Lcom/huawei/health/sns/ui/group/GroupFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/GroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 998
    return-void
.end method
