.class Lo/axd$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/axd;->b(ILandroid/app/Activity;Lcom/huawei/health/sns/server/user/DeleteFriendRequest;Lcom/huawei/health/sns/model/user/User;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/server/user/DeleteFriendRequest;

.field final synthetic b:I

.field final synthetic c:Lcom/huawei/health/sns/model/user/User;

.field final synthetic d:Lo/axd;

.field final synthetic e:Landroid/app/Activity;


# direct methods
.method constructor <init>(Lo/axd;Lcom/huawei/health/sns/server/user/DeleteFriendRequest;ILcom/huawei/health/sns/model/user/User;Landroid/app/Activity;)V
    .locals 0

    .line 536
    iput-object p1, p0, Lo/axd$6;->d:Lo/axd;

    iput-object p2, p0, Lo/axd$6;->a:Lcom/huawei/health/sns/server/user/DeleteFriendRequest;

    iput p3, p0, Lo/axd$6;->b:I

    iput-object p4, p0, Lo/axd$6;->c:Lcom/huawei/health/sns/model/user/User;

    iput-object p5, p0, Lo/axd$6;->e:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 540
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/axd$6$2;

    invoke-direct {v1, p0}, Lo/axd$6$2;-><init>(Lo/axd$6;)V

    new-instance v2, Lo/axd$6$3;

    invoke-direct {v2, p0}, Lo/axd$6$3;-><init>(Lo/axd$6;)V

    invoke-virtual {v0, v1, v2}, Lo/brb;->b(Lo/brd;Lo/brc;)Lo/bqy;

    .line 561
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 566
    iget-object v0, p0, Lo/axd$6;->e:Landroid/app/Activity;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/app/Activity;I)V

    .line 567
    return-void
.end method
