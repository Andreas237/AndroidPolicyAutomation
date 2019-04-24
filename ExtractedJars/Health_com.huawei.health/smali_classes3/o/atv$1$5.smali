.class Lo/atv$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/atv$1;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Lo/brd<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic c:Lo/atv$1;


# direct methods
.method constructor <init>(Lo/atv$1;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lo/atv$1$5;->c:Lo/atv$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 88
    invoke-virtual {p0, p1}, Lo/atv$1$5;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 92
    iget-object v0, p0, Lo/atv$1$5;->c:Lo/atv$1;

    iget-object v0, v0, Lo/atv$1;->d:Lo/atv;

    iget-object v1, p0, Lo/atv$1$5;->c:Lo/atv$1;

    iget-object v1, v1, Lo/atv$1;->c:Lcom/huawei/health/sns/model/group/Group;

    iget-object v2, p0, Lo/atv$1$5;->c:Lo/atv$1;

    iget-object v2, v2, Lo/atv$1;->a:Lcom/huawei/health/sns/model/chat/MessageItem;

    invoke-virtual {v0, v1, v2}, Lo/atv;->b(Lcom/huawei/health/sns/model/group/Group;Lcom/huawei/health/sns/model/chat/MessageItem;)V

    .line 93
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
