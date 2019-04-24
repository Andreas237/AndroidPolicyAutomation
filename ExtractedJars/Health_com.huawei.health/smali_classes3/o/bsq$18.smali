.class Lo/bsq$18;
.super Lo/bui;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->a(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/bui<Ljava/lang/Boolean;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lo/bsq;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lo/bui;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;Ljava/lang/String;)V
    .locals 0

    .line 2093
    iput-object p1, p0, Lo/bsq$18;->a:Lo/bsq;

    iput-object p2, p0, Lo/bsq$18;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/bsq$18;->d:Ljava/lang/String;

    iput-object p4, p0, Lo/bsq$18;->c:Lo/bui;

    iput-object p5, p0, Lo/bsq$18;->b:Ljava/lang/String;

    invoke-direct {p0}, Lo/bui;-><init>()V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 5

    .line 2096
    iget-object v0, p0, Lo/bsq$18;->e:Ljava/lang/String;

    invoke-static {v0}, Lcom/huawei/pluginFitnessAdvice/FitWorkout;->acquireComeFrom(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/bsw;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2097
    iget-object v0, p0, Lo/bsq$18;->a:Lo/bsq;

    iget-object v1, p0, Lo/bsq$18;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$18;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bsq$18;->c:Lo/bui;

    iget-object v4, p0, Lo/bsq$18;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lo/bsq;->e(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;Ljava/lang/String;)V

    goto :goto_0

    .line 2099
    :cond_0
    iget-object v0, p0, Lo/bsq$18;->c:Lo/bui;

    iget-object v1, p0, Lo/bsq$18;->a:Lo/bsq;

    invoke-static {v1}, Lo/bsq;->d(Lo/bsq;)Landroid/os/Handler;

    move-result-object v1

    invoke-virtual {v0, v1, p1, p2}, Lo/bui;->c(Landroid/os/Handler;ILjava/lang/String;)V

    .line 2101
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Boolean;)V
    .locals 5

    .line 2105
    iget-object v0, p0, Lo/bsq$18;->a:Lo/bsq;

    iget-object v1, p0, Lo/bsq$18;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/bsq$18;->d:Ljava/lang/String;

    iget-object v3, p0, Lo/bsq$18;->c:Lo/bui;

    iget-object v4, p0, Lo/bsq$18;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3, v4}, Lo/bsq;->e(Lo/bsq;Ljava/lang/String;Ljava/lang/String;Lo/bui;Ljava/lang/String;)V

    .line 2106
    return-void
.end method

.method public synthetic d(Ljava/lang/Object;)V
    .locals 1

    .line 2093
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {p0, v0}, Lo/bsq$18;->c(Ljava/lang/Boolean;)V

    return-void
.end method
