.class Lo/awm$4$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awm$4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/server/user/AddFriendRequest;

.field final synthetic b:Lo/awm$4;


# direct methods
.method constructor <init>(Lo/awm$4;Lcom/huawei/health/sns/server/user/AddFriendRequest;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lo/awm$4$2;->b:Lo/awm$4;

    iput-object p2, p0, Lo/awm$4$2;->a:Lcom/huawei/health/sns/server/user/AddFriendRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyResult(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 3

    .line 190
    iget-object v0, p0, Lo/awm$4$2;->b:Lo/awm$4;

    iget-object v0, v0, Lo/awm$4;->e:Lo/bio;

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lo/awm$4$2;->b:Lo/awm$4;

    iget-object v0, v0, Lo/awm$4;->e:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 194
    :cond_0
    iget-object v0, p0, Lo/awm$4$2;->b:Lo/awm$4;

    iget-object v0, v0, Lo/awm$4;->c:Landroid/content/Context;

    iget-object v1, p0, Lo/awm$4$2;->b:Lo/awm$4;

    iget-object v1, v1, Lo/awm$4;->a:Lo/awm$c;

    iget-object v2, p0, Lo/awm$4$2;->a:Lcom/huawei/health/sns/server/user/AddFriendRequest;

    invoke-static {v0, v1, v2, p2}, Lo/awm;->a(Landroid/content/Context;Lo/awm$c;Lcom/huawei/health/sns/server/user/AddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 195
    return-void
.end method
