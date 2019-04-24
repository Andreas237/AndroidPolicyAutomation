.class Lo/eii$4;
.super Lo/ekh$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eii;->c(Landroid/content/Context;IIIILo/eih;Lo/eic;Lo/ehe$a;Lo/eih$g;Lo/ejk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lo/eii;

.field final synthetic c:Lo/ekh;

.field final synthetic d:Lo/eih;


# direct methods
.method constructor <init>(Lo/eii;Lo/eih;Lo/ekh;Ljava/util/List;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/eii$4;->b:Lo/eii;

    iput-object p2, p0, Lo/eii$4;->d:Lo/eih;

    iput-object p3, p0, Lo/eii$4;->c:Lo/ekh;

    iput-object p4, p0, Lo/eii$4;->a:Ljava/util/List;

    invoke-direct {p0}, Lo/ekh$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 9

    .line 193
    if-nez p1, :cond_1

    .line 195
    iget-object v0, p0, Lo/eii$4;->d:Lo/eih;

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/eii$4;->d:Lo/eih;

    iget-object v1, p0, Lo/eii$4;->d:Lo/eih;

    invoke-virtual {v1}, Lo/eih;->getViewPortHandler()Lo/oa;

    move-result-object v1

    invoke-virtual {v1}, Lo/oa;->f()F

    move-result v1

    iget-object v2, p0, Lo/eii$4;->d:Lo/eih;

    .line 198
    invoke-virtual {v2}, Lo/eih;->getViewPortHandler()Lo/oa;

    move-result-object v2

    invoke-virtual {v2}, Lo/oa;->h()F

    move-result v2

    add-float/2addr v1, v2

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    .line 197
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/eih;->e(FZ)V

    .line 199
    iget-object v0, p0, Lo/eii$4;->d:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->c()V

    .line 202
    :cond_0
    iget-object v0, p0, Lo/eii$4;->c:Lo/ekh;

    invoke-virtual {v0}, Lo/ekh;->b()V

    .line 203
    return-void

    .line 206
    :cond_1
    const-string v0, "stepDayData"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Map;

    .line 208
    const-string v0, "timeStampShowStart"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 210
    const-string v0, "timeStampShowEnd"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 212
    iget-object v0, p0, Lo/eii$4;->b:Lo/eii;

    iget-object v1, p0, Lo/eii$4;->a:Ljava/util/List;

    move-object v2, v6

    move v3, v7

    move v4, v8

    iget-object v5, p0, Lo/eii$4;->d:Lo/eih;

    invoke-virtual/range {v0 .. v5}, Lo/eii;->e(Ljava/util/List;Ljava/util/Map;IILo/eih;)V

    .line 214
    iget-object v0, p0, Lo/eii$4;->c:Lo/ekh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 215
    return-void
.end method
