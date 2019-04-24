.class Lo/atv$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atv;->a(Lcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/atv;

.field final synthetic c:Lcom/huawei/health/sns/model/group/Group;


# direct methods
.method constructor <init>(Lo/atv;Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 178
    iput-object p1, p0, Lo/atv$5;->a:Lo/atv;

    iput-object p2, p0, Lo/atv$5;->c:Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 183
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/atv$5$4;

    invoke-direct {v1, p0}, Lo/atv$5$4;-><init>(Lo/atv$5;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 199
    return-void
.end method

.method public e(II)V
    .locals 3

    .line 204
    if-eqz p1, :cond_0

    .line 206
    iget-object v0, p0, Lo/atv$5;->a:Lo/atv;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/atv;->d(Lo/atv;III)V

    .line 207
    const/4 v0, 0x5

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/apf;->d(IILjava/lang/Object;)V

    .line 209
    :cond_0
    return-void
.end method
