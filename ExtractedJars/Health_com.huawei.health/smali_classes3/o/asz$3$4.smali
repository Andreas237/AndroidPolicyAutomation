.class Lo/asz$3$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/brd;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/asz$3;->e(II)V
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

.field final synthetic b:I

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/asz$3;II)V
    .locals 0

    .line 462
    iput-object p1, p0, Lo/asz$3$4;->a:Lo/asz$3;

    iput p2, p0, Lo/asz$3$4;->e:I

    iput p3, p0, Lo/asz$3$4;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lo/bra;)Ljava/lang/Object;
    .locals 1

    .line 462
    invoke-virtual {p0, p1}, Lo/asz$3$4;->c(Lo/bra;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/bra;)Ljava/lang/Boolean;
    .locals 4

    .line 466
    iget-object v0, p0, Lo/asz$3$4;->a:Lo/asz$3;

    iget-object v0, v0, Lo/asz$3;->b:Lo/asz;

    iget v1, p0, Lo/asz$3$4;->e:I

    iget v2, p0, Lo/asz$3$4;->b:I

    iget-object v3, p0, Lo/asz$3$4;->a:Lo/asz$3;

    iget-boolean v3, v3, Lo/asz$3;->c:Z

    invoke-static {v0, v1, v2, v3}, Lo/asz;->a(Lo/asz;IIZ)V

    .line 467
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
