.class Lo/eih$n$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eih$n;->e(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/eih$n;


# direct methods
.method constructor <init>(Lo/eih$n;)V
    .locals 0

    .line 250
    iput-object p1, p0, Lo/eih$n$5;->c:Lo/eih$n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 253
    iget-object v0, p0, Lo/eih$n$5;->c:Lo/eih$n;

    iget-object v0, v0, Lo/eih$n;->c:Lo/eih$n$a;

    iget-object v1, p0, Lo/eih$n$5;->c:Lo/eih$n;

    iget-object v1, v1, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-virtual {v1}, Lo/eih$n$a;->d()I

    move-result v1

    iget-object v2, p0, Lo/eih$n$5;->c:Lo/eih$n;

    iget-object v2, v2, Lo/eih$n;->c:Lo/eih$n$a;

    invoke-virtual {v2}, Lo/eih$n$a;->b()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lo/eih$n$a;->e(II)V

    .line 255
    iget-object v0, p0, Lo/eih$n$5;->c:Lo/eih$n;

    iget-object v1, p0, Lo/eih$n$5;->c:Lo/eih$n;

    invoke-virtual {v1}, Lo/eih$n;->e()I

    move-result v1

    or-int/lit8 v1, v1, 0x1

    invoke-virtual {v0, v1}, Lo/eih$n;->b(I)V

    .line 256
    iget-object v0, p0, Lo/eih$n$5;->c:Lo/eih$n;

    invoke-static {v0}, Lo/eih$n;->b(Lo/eih$n;)Lo/eih;

    move-result-object v0

    invoke-virtual {v0}, Lo/eih;->c()V

    .line 257
    iget-object v0, p0, Lo/eih$n$5;->c:Lo/eih$n;

    invoke-static {v0}, Lo/eih$n;->b(Lo/eih$n;)Lo/eih;

    move-result-object v0

    new-instance v1, Lo/eih$k;

    iget-object v2, p0, Lo/eih$n$5;->c:Lo/eih$n;

    invoke-static {v2}, Lo/eih$n;->b(Lo/eih$n;)Lo/eih;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v1, v2}, Lo/eih$k;-><init>(Lo/eih;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/eih;->c(Lo/eih$k;I)V

    .line 258
    return-void
.end method
