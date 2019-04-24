.class Lo/axd$6$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd$6;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brc<Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/axd$6;


# direct methods
.method constructor <init>(Lo/axd$6;)V
    .locals 0

    .line 549
    iput-object p1, p0, Lo/axd$6$3;->c:Lo/axd$6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/bqy;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/bqy<Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;>;)V"
        }
    .end annotation

    .line 553
    invoke-interface {p1}, Lo/bqy;->e()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;

    .line 554
    if-nez v4, :cond_0

    .line 556
    return-void

    .line 558
    :cond_0
    iget-object v0, p0, Lo/axd$6$3;->c:Lo/axd$6;

    iget-object v0, v0, Lo/axd$6;->d:Lo/axd;

    iget-object v1, p0, Lo/axd$6$3;->c:Lo/axd$6;

    iget v1, v1, Lo/axd$6;->b:I

    iget-object v2, p0, Lo/axd$6$3;->c:Lo/axd$6;

    iget-object v2, v2, Lo/axd$6;->a:Lcom/huawei/health/sns/server/user/DeleteFriendRequest;

    iget-object v3, p0, Lo/axd$6$3;->c:Lo/axd$6;

    iget-object v3, v3, Lo/axd$6;->c:Lcom/huawei/health/sns/model/user/User;

    invoke-static {v0, v1, v2, v4, v3}, Lo/axd;->a(Lo/axd;ILcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;Lcom/huawei/health/sns/model/user/User;)V

    .line 559
    return-void
.end method
