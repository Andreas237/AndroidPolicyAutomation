.class Lo/asz$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asz$3;->a()V
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
.field final synthetic a:Lo/asz$3;


# direct methods
.method constructor <init>(Lo/asz$3;)V
    .locals 0

    .line 444
    iput-object p1, p0, Lo/asz$3$1;->a:Lo/asz$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 444
    invoke-virtual {p0, p1}, Lo/asz$3$1;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 448
    iget-object v0, p0, Lo/asz$3$1;->a:Lo/asz$3;

    iget-object v0, v0, Lo/asz$3;->b:Lo/asz;

    iget-object v1, p0, Lo/asz$3$1;->a:Lo/asz$3;

    iget-boolean v1, v1, Lo/asz$3;->c:Z

    invoke-static {v0, v1, p1}, Lo/asz;->e(Lo/asz;ZLo/bra;)[I

    move-result-object v4

    .line 449
    new-instance v0, Lo/atn;

    invoke-direct {v0}, Lo/atn;-><init>()V

    iget-object v1, p0, Lo/asz$3$1;->a:Lo/asz$3;

    iget-object v1, v1, Lo/asz$3;->e:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Lo/atn;->d(Landroid/os/Handler;)V

    .line 450
    iget-object v0, p0, Lo/asz$3$1;->a:Lo/asz$3;

    iget-object v0, v0, Lo/asz$3;->b:Lo/asz;

    const/4 v1, 0x0

    aget v1, v4, v1

    const/4 v2, 0x1

    aget v2, v4, v2

    iget-object v3, p0, Lo/asz$3$1;->a:Lo/asz$3;

    iget-boolean v3, v3, Lo/asz$3;->c:Z

    invoke-static {v0, v1, v2, v3}, Lo/asz;->a(Lo/asz;IIZ)V

    .line 451
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
