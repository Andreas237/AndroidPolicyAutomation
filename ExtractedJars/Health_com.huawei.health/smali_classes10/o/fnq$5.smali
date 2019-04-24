.class Lo/fnq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fnq;->b(Lo/fnp;Lo/fob;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fob;

.field final synthetic c:Lo/fnq;

.field final synthetic e:Lo/fnp;


# direct methods
.method constructor <init>(Lo/fnq;Lo/fnp;Lo/fob;)V
    .locals 0

    .line 1167
    iput-object p1, p0, Lo/fnq$5;->c:Lo/fnq;

    iput-object p2, p0, Lo/fnq$5;->e:Lo/fnp;

    iput-object p3, p0, Lo/fnq$5;->a:Lo/fob;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1172
    :try_start_0
    iget-object v0, p0, Lo/fnq$5;->e:Lo/fnp;

    invoke-virtual {v0}, Lo/fnp;->i()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1173
    invoke-static {}, Lo/fnq;->d()Lo/fty;

    move-result-object v0

    const-string v1, "block2 transfer timed out: {}"

    iget-object v2, p0, Lo/fnq$5;->a:Lo/fob;

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1174
    iget-object v0, p0, Lo/fnq$5;->e:Lo/fnp;

    invoke-virtual {v0}, Lo/fnp;->m()V

    .line 1176
    :cond_0
    iget-object v0, p0, Lo/fnq$5;->c:Lo/fnq;

    iget-object v1, p0, Lo/fnq$5;->a:Lo/fob;

    invoke-static {v0, v1}, Lo/fnq;->c(Lo/fnq;Lo/fob;)Lo/fnp;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1179
    goto :goto_0

    .line 1177
    :catch_0
    move-exception v3

    .line 1178
    invoke-static {}, Lo/fnq;->d()Lo/fty;

    move-result-object v0

    const-string v1, "Unexcepted error while block2 cleaning"

    invoke-interface {v0, v1, v3}, Lo/fty;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1180
    :goto_0
    return-void
.end method
