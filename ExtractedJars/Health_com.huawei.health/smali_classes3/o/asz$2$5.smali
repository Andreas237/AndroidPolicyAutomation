.class Lo/asz$2$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asz$2;->a()V
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
.field final synthetic c:Lo/asz$2;


# direct methods
.method constructor <init>(Lo/asz$2;)V
    .locals 0

    .line 128
    iput-object p1, p0, Lo/asz$2$5;->c:Lo/asz$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 128
    invoke-virtual {p0, p1}, Lo/asz$2$5;->b(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lo/bra;)Ljava/lang/Boolean;
    .locals 5

    .line 132
    iget-object v0, p0, Lo/asz$2$5;->c:Lo/asz$2;

    iget-object v0, v0, Lo/asz$2;->a:Lo/asz;

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lo/asz;->e(Lo/asz;ZLo/bra;)[I

    move-result-object v4

    .line 133
    iget-object v0, p0, Lo/asz$2$5;->c:Lo/asz$2;

    iget-object v0, v0, Lo/asz$2;->a:Lo/asz;

    const/4 v1, 0x1

    aget v1, v4, v1

    const/4 v2, 0x1

    aget v2, v4, v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/asz;->a(Lo/asz;IIZ)V

    .line 134
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
