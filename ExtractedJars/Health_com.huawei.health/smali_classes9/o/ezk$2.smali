.class Lo/ezk$2;
.super Lo/ekh$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezk;->d(Lo/eih;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ezk;

.field final synthetic d:Lo/ekh;

.field final synthetic e:Lo/eih;


# direct methods
.method constructor <init>(Lo/ezk;Lo/eih;Lo/ekh;)V
    .locals 0

    .line 91
    iput-object p1, p0, Lo/ezk$2;->a:Lo/ezk;

    iput-object p2, p0, Lo/ezk$2;->e:Lo/eih;

    iput-object p3, p0, Lo/ezk$2;->d:Lo/ekh;

    invoke-direct {p0}, Lo/ekh$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 5

    .line 95
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 97
    iget-object v0, p0, Lo/ezk$2;->e:Lo/eih;

    iget-object v1, p0, Lo/ezk$2;->a:Lo/ezk;

    invoke-static {v1}, Lo/ezk;->b(Lo/ezk;)Lo/eih$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eih;->a(Lo/eih$e;)F

    move-result v4

    .line 99
    iget-object v0, p0, Lo/ezk$2;->a:Lo/ezk;

    invoke-static {v0}, Lo/ezk;->c(Lo/ezk;)Lo/ezk$b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ezk$2;->a:Lo/ezk;

    invoke-static {v0}, Lo/ezk;->c(Lo/ezk;)Lo/ezk$b;

    move-result-object v0

    iget-object v1, p0, Lo/ezk$2;->e:Lo/eih;

    invoke-interface {v0, v1}, Lo/ezk$b;->a(Lo/eih;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Lo/ezk$2;->a:Lo/ezk;

    invoke-static {v0}, Lo/ezk;->c(Lo/ezk;)Lo/ezk$b;

    move-result-object v0

    iget-object v1, p0, Lo/ezk$2;->e:Lo/eih;

    new-instance v2, Lo/ezk$2$4;

    invoke-direct {v2, p0, v3}, Lo/ezk$2$4;-><init>(Lo/ezk$2;Ljava/util/Map;)V

    invoke-interface {v0, v1, v4, v2}, Lo/ezk$b;->c(Lo/eih;FLo/ezk$b$a;)V

    .line 108
    return-void

    .line 109
    :cond_0
    iget-object v0, p0, Lo/ezk$2;->a:Lo/ezk;

    invoke-static {v0}, Lo/ezk;->e(Lo/ezk;)Lo/eyv;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 110
    iget-object v0, p0, Lo/ezk$2;->a:Lo/ezk;

    invoke-static {v0}, Lo/ezk;->e(Lo/ezk;)Lo/eyv;

    move-result-object v0

    iget-object v1, p0, Lo/ezk$2;->e:Lo/eih;

    iget-object v2, p0, Lo/ezk$2;->a:Lo/ezk;

    iget-object v2, v2, Lo/ezk;->f:Lo/ezh;

    invoke-virtual {v2}, Lo/ezh;->getStepDataType()Lo/eic;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lo/eyv;->a(Lo/eih;Lo/eic;)F

    move-result v4

    .line 111
    const-string v0, "value"

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    iget-object v0, p0, Lo/ezk$2;->d:Lo/ekh;

    invoke-virtual {v0, v3}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 113
    return-void

    .line 115
    :cond_1
    const-string v0, "value"

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {v3, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    iget-object v0, p0, Lo/ezk$2;->d:Lo/ekh;

    invoke-virtual {v0, v3}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 118
    return-void
.end method
