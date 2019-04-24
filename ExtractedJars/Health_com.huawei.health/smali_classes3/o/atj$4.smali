.class final Lo/atj$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atj;->d(Lo/atj;Landroid/content/Context;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/aud;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/group/GroupNotify;

.field final synthetic b:Lo/atj;

.field final synthetic d:Z

.field final synthetic e:Landroid/content/Context;


# direct methods
.method constructor <init>(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;ZLandroid/content/Context;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/atj$4;->b:Lo/atj;

    iput-object p2, p0, Lo/atj$4;->a:Lcom/huawei/health/sns/model/group/GroupNotify;

    iput-boolean p3, p0, Lo/atj$4;->d:Z

    iput-object p4, p0, Lo/atj$4;->e:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 111
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    iget-object v1, p0, Lo/atj$4;->b:Lo/atj;

    iget-object v2, p0, Lo/atj$4;->a:Lcom/huawei/health/sns/model/group/GroupNotify;

    iget-boolean v3, p0, Lo/atj$4;->d:Z

    invoke-static {v1, v2, v3}, Lo/atj;->d(Lo/atj;Lcom/huawei/health/sns/model/group/GroupNotify;Z)Lo/brd;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 112
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 117
    iget-object v0, p0, Lo/atj$4;->e:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/huawei/health/sns/util/protocol/snsKit/bean/SNSHttpCode;->getErrResId(II)I

    move-result v1

    invoke-static {v0, v1}, Lo/brh;->c(Landroid/content/Context;I)V

    .line 118
    return-void
.end method
