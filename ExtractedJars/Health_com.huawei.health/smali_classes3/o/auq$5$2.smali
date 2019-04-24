.class Lo/auq$5$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/auq$5;->a()V
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
.field final synthetic c:Lo/auq$5;


# direct methods
.method constructor <init>(Lo/auq$5;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lo/auq$5$2;->c:Lo/auq$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 129
    invoke-virtual {p0, p1}, Lo/auq$5$2;->d(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d(Lo/bra;)Ljava/lang/Boolean;
    .locals 3

    .line 133
    iget-object v0, p0, Lo/auq$5$2;->c:Lo/auq$5;

    iget-object v0, v0, Lo/auq$5;->e:Lo/auq;

    iget-object v1, p0, Lo/auq$5$2;->c:Lo/auq$5;

    iget-object v1, v1, Lo/auq$5;->d:Lcom/huawei/health/sns/model/chat/MessageItem;

    iget-object v2, p0, Lo/auq$5$2;->c:Lo/auq$5;

    iget-boolean v2, v2, Lo/auq$5;->c:Z

    invoke-static {v0, v1, v2}, Lo/auq;->e(Lo/auq;Lcom/huawei/health/sns/model/chat/MessageItem;Z)V

    .line 134
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
