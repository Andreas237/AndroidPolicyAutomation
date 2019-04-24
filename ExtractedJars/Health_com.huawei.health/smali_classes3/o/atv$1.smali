.class Lo/atv$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aud;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atv;->d(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/model/chat/MessageItem;

.field final synthetic c:Lcom/huawei/health/sns/model/group/Group;

.field final synthetic d:Lo/atv;


# direct methods
.method constructor <init>(Lo/atv;Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V
    .locals 0

    .line 82
    iput-object p1, p0, Lo/atv$1;->d:Lo/atv;

    iput-object p2, p0, Lo/atv$1;->c:Lcom/huawei/health/sns/model/group/Group;

    iput-object p3, p0, Lo/atv$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 87
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/atv$1$5;

    invoke-direct {v1, p0}, Lo/atv$1$5;-><init>(Lo/atv$1;)V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 97
    return-void
.end method

.method public e(II)V
    .locals 2

    .line 102
    if-eqz p1, :cond_0

    .line 104
    iget-object v0, p0, Lo/atv$1;->d:Lo/atv;

    const/16 v1, 0xaaa

    invoke-static {v0, v1, p1, p2}, Lo/atv;->d(Lo/atv;III)V

    .line 106
    :cond_0
    return-void
.end method
