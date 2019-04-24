.class final Lo/awx$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awx;->d(Landroid/content/Context;Lo/bfh;Lo/awx$c;Lo/awx$a;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/awx$c;

.field final synthetic b:Lo/awx$a;

.field final synthetic c:Lo/bio;

.field final synthetic d:Landroid/content/Context;

.field final synthetic e:Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;


# direct methods
.method constructor <init>(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lo/bio;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lo/awx$1;->d:Landroid/content/Context;

    iput-object p2, p0, Lo/awx$1;->a:Lo/awx$c;

    iput-object p3, p0, Lo/awx$1;->b:Lo/awx$a;

    iput-object p4, p0, Lo/awx$1;->c:Lo/bio;

    iput-object p5, p0, Lo/awx$1;->e:Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 92
    iget-object v0, p0, Lo/awx$1;->d:Landroid/content/Context;

    iget-object v1, p0, Lo/awx$1;->a:Lo/awx$c;

    iget-object v2, p0, Lo/awx$1;->b:Lo/awx$a;

    iget-object v3, p0, Lo/awx$1;->c:Lo/bio;

    iget-object v4, p0, Lo/awx$1;->e:Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;

    invoke-static {v0, v1, v2, v3, v4}, Lo/awx;->a(Landroid/content/Context;Lo/awx$c;Lo/awx$a;Lo/bio;Lcom/huawei/health/sns/server/user/ReplyAddFriendRequest;)V

    .line 94
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 99
    iget-object v0, p0, Lo/awx$1;->c:Lo/bio;

    if-eqz v0, :cond_0

    .line 101
    iget-object v0, p0, Lo/awx$1;->c:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 103
    :cond_0
    iget-object v0, p0, Lo/awx$1;->d:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 104
    return-void
.end method
