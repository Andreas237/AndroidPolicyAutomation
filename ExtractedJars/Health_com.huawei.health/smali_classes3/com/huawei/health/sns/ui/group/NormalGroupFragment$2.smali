.class Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->d(Ljava/lang/String;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Z

.field final synthetic c:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;ZZ)V
    .locals 0

    .line 905
    iput-object p1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;->c:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    iput-boolean p2, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;->b:Z

    iput-boolean p3, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;->a:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    .line 909
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;->b:Z

    if-eqz v0, :cond_0

    .line 911
    return-void

    .line 913
    :cond_0
    iget-boolean v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;->a:Z

    if-eqz v0, :cond_1

    .line 915
    new-instance v0, Lo/atb;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lo/atb;-><init>(Landroid/os/Handler;)V

    iget-object v1, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;->c:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-static {v1}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->a(Lcom/huawei/health/sns/ui/group/NormalGroupFragment;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lo/atb;->b(J)V

    .line 917
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/group/NormalGroupFragment$2;->c:Lcom/huawei/health/sns/ui/group/NormalGroupFragment;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/group/NormalGroupFragment;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    .line 918
    return-void
.end method
