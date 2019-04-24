.class Lo/eii$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ekh$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eii;->c(Landroid/content/Context;IIIILo/eih;Lo/eic;Lo/ehe$a;Lo/eih$g;Lo/ejk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eii;

.field final synthetic b:I

.field final synthetic c:I

.field final synthetic d:Lo/eih;

.field final synthetic e:Lo/ekh;


# direct methods
.method constructor <init>(Lo/eii;Lo/ekh;Lo/eih;II)V
    .locals 0

    .line 147
    iput-object p1, p0, Lo/eii$2;->a:Lo/eii;

    iput-object p2, p0, Lo/eii$2;->e:Lo/ekh;

    iput-object p3, p0, Lo/eii$2;->d:Lo/eih;

    iput p4, p0, Lo/eii$2;->c:I

    iput p5, p0, Lo/eii$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 150
    const/4 v0, 0x0

    return v0
.end method

.method public a(Ljava/util/Map;)V
    .locals 8

    .line 156
    if-nez p1, :cond_0

    .line 158
    iget-object v0, p0, Lo/eii$2;->e:Lo/ekh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 159
    return-void

    .line 162
    :cond_0
    const-string v0, "err_code"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    .line 163
    const-string v0, "stepDayData"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Map;

    .line 164
    const-string v0, "queryId"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 167
    iget-object v0, p0, Lo/eii$2;->a:Lo/eii;

    invoke-static {v0}, Lo/eii;->e(Lo/eii;)Lo/eii$e;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/eii$e;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 168
    return-void

    .line 171
    :cond_1
    iget-object v0, p0, Lo/eii$2;->d:Lo/eih;

    if-eqz v0, :cond_2

    .line 172
    iget-object v0, p0, Lo/eii$2;->d:Lo/eih;

    invoke-virtual {v0}, Lo/eih;->T()Lo/eiz;

    move-result-object v0

    invoke-virtual {v0}, Lo/eiz;->a()V

    .line 175
    :cond_2
    if-nez v4, :cond_3

    if-nez v5, :cond_4

    .line 176
    :cond_3
    const-string v0, "HwHealthBaseBarLineDataSet"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryStepDayData failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    iget-object v0, p0, Lo/eii$2;->e:Lo/ekh;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 178
    return-void

    .line 180
    :cond_4
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 181
    const-string v0, "stepDayData"

    invoke-interface {v7, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    const-string v0, "timeStampShowStart"

    iget v1, p0, Lo/eii$2;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    const-string v0, "timeStampShowEnd"

    iget v1, p0, Lo/eii$2;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    iget-object v0, p0, Lo/eii$2;->e:Lo/ekh;

    invoke-virtual {v0, v7}, Lo/ekh;->e(Ljava/util/Map;)V

    .line 185
    return-void
.end method
