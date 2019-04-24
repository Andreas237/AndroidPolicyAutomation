.class Lo/fps$e$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fkv;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fps$e;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fps$e;


# direct methods
.method constructor <init>(Lo/fps$e;)V
    .locals 0

    .line 1651
    iput-object p1, p0, Lo/fps$e$5;->e:Lo/fps$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e()Ljava/lang/Object;
    .locals 1

    .line 1655
    iget-object v0, p0, Lo/fps$e$5;->e:Lo/fps$e;

    invoke-static {v0}, Lo/fps$e;->e(Lo/fps$e;)Lo/fqp;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqp;->e()Ljava/net/InetSocketAddress;

    move-result-object v0

    return-object v0
.end method

.method public run()V
    .locals 2

    .line 1660
    iget-object v0, p0, Lo/fps$e$5;->e:Lo/fps$e;

    invoke-static {v0}, Lo/fps$e;->e(Lo/fps$e;)Lo/fqp;

    move-result-object v0

    invoke-virtual {v0}, Lo/fqp;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1661
    iget-object v0, p0, Lo/fps$e$5;->e:Lo/fps$e;

    iget-object v0, v0, Lo/fps$e;->d:Lo/fps;

    iget-object v1, p0, Lo/fps$e$5;->e:Lo/fps$e;

    invoke-static {v1}, Lo/fps$e;->e(Lo/fps$e;)Lo/fqp;

    move-result-object v1

    invoke-static {v0, v1}, Lo/fps;->c(Lo/fps;Lo/fqp;)V

    .line 1663
    :cond_0
    return-void
.end method
