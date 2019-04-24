.class final Lo/awm$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/awm;->e(Landroid/content/Context;Lo/bfh;Lo/awm$c;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/awm$c;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Landroid/content/Context;

.field final synthetic d:Lo/bfh;

.field final synthetic e:Lo/bio;


# direct methods
.method constructor <init>(Lo/awm$c;Lo/bfh;Ljava/lang/String;Lo/bio;Landroid/content/Context;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lo/awm$4;->a:Lo/awm$c;

    iput-object p2, p0, Lo/awm$4;->d:Lo/bfh;

    iput-object p3, p0, Lo/awm$4;->b:Ljava/lang/String;

    iput-object p4, p0, Lo/awm$4;->e:Lo/bio;

    iput-object p5, p0, Lo/awm$4;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 184
    iget-object v0, p0, Lo/awm$4;->a:Lo/awm$c;

    iget-object v1, p0, Lo/awm$4;->d:Lo/bfh;

    iget-object v2, p0, Lo/awm$4;->b:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lo/awm$c;->d(Lo/bfh;Ljava/lang/String;)Lcom/huawei/health/sns/server/user/AddFriendRequest;

    move-result-object v3

    .line 185
    new-instance v0, Lo/awm$4$2;

    invoke-direct {v0, p0, v3}, Lo/awm$4$2;-><init>(Lo/awm$4;Lcom/huawei/health/sns/server/user/AddFriendRequest;)V

    invoke-static {v3, v0}, Lcom/huawei/health/sns/util/protocol/snsKit/SNSAgent;->c(Lcom/huawei/health/sns/server/SNSRequestBean;Lcom/huawei/health/sns/util/protocol/snsKit/bean/ISNSCallBack;)Lcom/huawei/health/sns/util/protocol/snsKit/SNSTaskEx;

    .line 198
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 203
    iget-object v0, p0, Lo/awm$4;->e:Lo/bio;

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lo/awm$4;->e:Lo/bio;

    invoke-virtual {v0}, Lo/bio;->c()V

    .line 207
    :cond_0
    iget-object v0, p0, Lo/awm$4;->c:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 208
    return-void
.end method
