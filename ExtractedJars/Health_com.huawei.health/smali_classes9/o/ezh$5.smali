.class Lo/ezh$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eih$m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezh;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ezh;

.field final synthetic d:Lo/eih;


# direct methods
.method constructor <init>(Lo/ezh;Lo/eih;)V
    .locals 0

    .line 109
    iput-object p1, p0, Lo/ezh$5;->a:Lo/ezh;

    iput-object p2, p0, Lo/ezh$5;->d:Lo/eih;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(II)V
    .locals 3

    .line 111
    iget-object v0, p0, Lo/ezh$5;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->b(Lo/ezh;)Lo/ezj;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 112
    iget-object v0, p0, Lo/ezh$5;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->b(Lo/ezh;)Lo/ezj;

    move-result-object v0

    iget-object v1, p0, Lo/ezh$5;->d:Lo/eih;

    invoke-virtual {v0, v1, p1, p2}, Lo/ezj;->a(Lo/eih;II)V

    .line 114
    :cond_0
    iget-object v0, p0, Lo/ezh$5;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->e(Lo/ezh;)Lo/ezv;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 115
    iget-object v0, p0, Lo/ezh$5;->a:Lo/ezh;

    invoke-static {v0}, Lo/ezh;->e(Lo/ezh;)Lo/ezv;

    move-result-object v0

    iget-object v1, p0, Lo/ezh$5;->a:Lo/ezh;

    invoke-virtual {v1}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v1

    iget-object v2, p0, Lo/ezh$5;->a:Lo/ezh;

    invoke-static {v2}, Lo/ezh;->d(Lo/ezh;)Lo/eyy;

    move-result-object v2

    invoke-virtual {v2}, Lo/eyy;->e()Lo/eih;

    move-result-object v2

    invoke-interface {v0, v1, p1, p2, v2}, Lo/ezv;->d(Lo/eic;IILo/eie;)V

    .line 117
    :cond_1
    return-void
.end method
