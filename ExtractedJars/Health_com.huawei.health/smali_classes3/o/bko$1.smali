.class Lo/bko$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bko;->b()Landroid/app/AlertDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bko;


# direct methods
.method constructor <init>(Lo/bko;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lo/bko$1;->e:Lo/bko;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 221
    iget-object v0, p0, Lo/bko$1;->e:Lo/bko;

    invoke-static {v0}, Lo/bko;->b(Lo/bko;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 223
    new-instance v4, Lcom/huawei/health/sns/server/user/DeleteFriendRequest;

    invoke-direct {v4}, Lcom/huawei/health/sns/server/user/DeleteFriendRequest;-><init>()V

    .line 224
    iget-object v0, p0, Lo/bko$1;->e:Lo/bko;

    invoke-static {v0}, Lo/bko;->b(Lo/bko;)J

    move-result-wide v0

    iput-wide v0, v4, Lcom/huawei/health/sns/server/user/DeleteFriendRequest;->frdUID_:J

    .line 226
    iget-object v0, p0, Lo/bko$1;->e:Lo/bko;

    invoke-static {v0}, Lo/bko;->d(Lo/bko;)Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/user/UserDetailActivity;->e()Lo/axd;

    move-result-object v0

    iget-object v1, p0, Lo/bko$1;->e:Lo/bko;

    invoke-static {v1}, Lo/bko;->d(Lo/bko;)Lcom/huawei/health/sns/ui/user/UserDetailActivity;

    move-result-object v1

    iget-object v2, p0, Lo/bko$1;->e:Lo/bko;

    invoke-static {v2}, Lo/bko;->e(Lo/bko;)Lcom/huawei/health/sns/model/user/User;

    move-result-object v2

    const/16 v3, 0x24

    invoke-virtual {v0, v3, v1, v4, v2}, Lo/axd;->b(ILandroid/app/Activity;Lcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/model/user/User;)V

    .line 228
    :cond_0
    return-void
.end method

.method public d()V
    .locals 0

    .line 233
    return-void
.end method
