.class Lo/fps$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/frm;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fps;->b(Lo/fqq;)Lo/frm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fqq;

.field final synthetic c:Lo/fps;


# direct methods
.method constructor <init>(Lo/fps;Lo/fqq;)V
    .locals 0

    .line 1619
    iput-object p1, p0, Lo/fps$8;->c:Lo/fps;

    iput-object p2, p0, Lo/fps$8;->a:Lo/fqq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 1

    .line 1634
    iget-object v0, p0, Lo/fps$8;->c:Lo/fps;

    invoke-static {v0}, Lo/fps;->c(Lo/fps;)Lo/fpz;

    move-result-object v0

    invoke-virtual {v0}, Lo/fpz;->c()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1635
    iget-object v0, p0, Lo/fps$8;->a:Lo/fqq;

    invoke-virtual {v0}, Lo/fqq;->i()V

    .line 1637
    :cond_0
    return-void
.end method

.method public d(Lo/fqp;)V
    .locals 2

    .line 1628
    iget-object v0, p0, Lo/fps$8;->c:Lo/fps;

    iget-object v1, p0, Lo/fps$8;->a:Lo/fqq;

    invoke-static {v0, p1, v1}, Lo/fps;->e(Lo/fps;Lo/fqp;Lo/fqq;)V

    .line 1629
    return-void
.end method
