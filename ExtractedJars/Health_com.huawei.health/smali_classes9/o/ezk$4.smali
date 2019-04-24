.class Lo/ezk$4;
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
.field final synthetic b:Lo/ezk;

.field final synthetic c:Lo/ekh;


# direct methods
.method constructor <init>(Lo/ezk;Lo/ekh;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lo/ezk$4;->b:Lo/ezk;

    iput-object p2, p0, Lo/ezk$4;->c:Lo/ekh;

    invoke-direct {p0}, Lo/ekh$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 5

    .line 125
    if-nez p1, :cond_0

    .line 126
    iget-object v0, p0, Lo/ezk$4;->c:Lo/ekh;

    invoke-virtual {v0}, Lo/ekh;->b()V

    .line 127
    return-void

    .line 130
    :cond_0
    iget-object v0, p0, Lo/ezk$4;->b:Lo/ezk;

    invoke-static {v0}, Lo/ezk;->d(Lo/ezk;)Lo/ekh;

    move-result-object v0

    iget-object v1, p0, Lo/ezk$4;->c:Lo/ekh;

    if-eq v0, v1, :cond_1

    .line 131
    iget-object v0, p0, Lo/ezk$4;->c:Lo/ekh;

    invoke-virtual {v0}, Lo/ekh;->b()V

    .line 132
    return-void

    .line 134
    :cond_1
    const-string v0, "value"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v4

    .line 135
    const-string v0, "ScrollChartObserverTotalDataView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mValueCapture  total"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    iget-object v0, p0, Lo/ezk$4;->b:Lo/ezk;

    invoke-virtual {v0, v4}, Lo/ezk;->b(F)V

    .line 137
    iget-object v0, p0, Lo/ezk$4;->c:Lo/ekh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 138
    return-void
.end method
