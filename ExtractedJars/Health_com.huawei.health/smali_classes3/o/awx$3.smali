.class final Lo/awx$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awx;->d(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lo/bio;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

.field final synthetic b:Lo/bio;

.field final synthetic c:Lo/awx$c;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lo/awx$a;


# direct methods
.method constructor <init>(Lo/bio;Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lo/awx$3;->b:Lo/bio;

    iput-object p2, p0, Lo/awx$3;->d:Landroid/content/Context;

    iput-object p3, p0, Lo/awx$3;->c:Lo/awx$c;

    iput-object p4, p0, Lo/awx$3;->e:Lo/awx$a;

    iput-object p5, p0, Lo/awx$3;->a:Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public notifyResult(Lcom/huawei/health/sns/util/protocol/snsKit/bean/RequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V
    .locals 4

    .line 126
    iget-object v0, p0, Lo/awx$3;->b:Lo/bio;

    if-eqz v0, :cond_0

    .line 128
    iget-object v0, p0, Lo/awx$3;->b:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 130
    :cond_0
    iget-object v0, p0, Lo/awx$3;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/awx$3;->c:Lo/awx$c;

    iget-object v2, p0, Lo/awx$3;->e:Lo/awx$a;

    iget-object v3, p0, Lo/awx$3;->a:Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    invoke-static {v0, v1, v2, v3, p2}, Lo/awx;->e(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ResponseBean;)V

    .line 131
    return-void
.end method
