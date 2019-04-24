.class Lo/fnq$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fnq;->c(Lo/fns;Lo/fob;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/fns;

.field final synthetic d:Lo/fob;

.field final synthetic e:Lo/fnq;


# direct methods
.method constructor <init>(Lo/fnq;Lo/fns;Lo/fob;)V
    .locals 0

    .line 1104
    iput-object p1, p0, Lo/fnq$2;->e:Lo/fnq;

    iput-object p2, p0, Lo/fnq$2;->c:Lo/fns;

    iput-object p3, p0, Lo/fnq$2;->d:Lo/fob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1109
    :try_start_0
    iget-object v0, p0, Lo/fnq$2;->c:Lo/fns;

    invoke-virtual {v0}, Lo/fns;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1110
    invoke-static {}, Lo/fnq;->d()Lo/fty;

    move-result-object v0

    const-string v1, "block1 transfer timed out: {}"

    iget-object v2, p0, Lo/fnq$2;->d:Lo/fob;

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1111
    iget-object v0, p0, Lo/fnq$2;->c:Lo/fns;

    invoke-virtual {v0}, Lo/fns;->m()V

    .line 1113
    :cond_0
    iget-object v0, p0, Lo/fnq$2;->e:Lo/fnq;

    iget-object v1, p0, Lo/fnq$2;->d:Lo/fob;

    invoke-static {v0, v1}, Lo/fnq;->d(Lo/fnq;Lo/fob;)Lo/fns;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1116
    goto :goto_0

    .line 1114
    :catch_0
    move-exception v3

    .line 1115
    invoke-static {}, Lo/fnq;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Unexcepted error while block1 cleaning"

    invoke-interface {v0, v1, v3}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1117
    :goto_0
    return-void
.end method
