.class Lo/cmt$1;
.super Lo/cmu;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cmt;->e(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/cmu<Lo/aba;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Lo/cmt;


# direct methods
.method constructor <init>(Lo/cmt;Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 105
    iput-object p1, p0, Lo/cmt$1;->d:Lo/cmt;

    invoke-direct {p0, p2, p3}, Lo/cmu;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/IBinder;)Lo/aba;
    .locals 1

    .line 108
    invoke-static {p1}, Lo/aba$e;->a(Landroid/os/IBinder;)Lo/aba;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 2

    .line 126
    invoke-static {}, Lo/cmt;->a()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 127
    invoke-static {}, Lo/cmt;->a()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->e(Ljava/lang/Object;)V

    .line 129
    :cond_0
    return-void
.end method

.method public synthetic b(Landroid/os/IBinder;)Ljava/lang/Object;
    .locals 1

    .line 105
    invoke-virtual {p0, p1}, Lo/cmt$1;->a(Landroid/os/IBinder;)Lo/aba;

    move-result-object v0

    return-object v0
.end method

.method public b()V
    .locals 2

    .line 118
    iget-object v0, p0, Lo/cmt$1;->d:Lo/cmt;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cmt;->c(Lo/cmt;Z)Z

    .line 119
    invoke-static {}, Lo/cmt;->a()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 120
    invoke-static {}, Lo/cmt;->a()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->b(Ljava/lang/Object;)V

    .line 122
    :cond_0
    return-void
.end method

.method public c()V
    .locals 0

    .line 114
    return-void
.end method

.method public d()V
    .locals 2

    .line 133
    iget-object v0, p0, Lo/cmt$1;->d:Lo/cmt;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cmt;->c(Lo/cmt;Z)Z

    .line 134
    invoke-static {}, Lo/cmt;->a()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 135
    invoke-static {}, Lo/cmt;->a()Lo/cmo;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cmo;->a(Ljava/lang/Object;)V

    .line 137
    :cond_0
    return-void
.end method
