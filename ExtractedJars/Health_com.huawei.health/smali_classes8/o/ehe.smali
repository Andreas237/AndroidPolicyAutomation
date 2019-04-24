.class public abstract Lo/ehe;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejf;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ehe$b;,
        Lo/ehe$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:Lo/eii<+Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;ChartT:Lo/eih;>Ljava/lang/Object;Lo/ejf<TT;TChartT;>;"
    }
.end annotation


# instance fields
.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Lo/ejf$b;Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/ehe$b;>;"
        }
    .end annotation
.end field

.field protected e:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 254
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/ehe;->c:Ljava/util/Map;

    .line 343
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ehe;->d:Ljava/util/List;

    .line 116
    iput-object p1, p0, Lo/ehe;->e:Landroid/content/Context;

    .line 117
    invoke-direct {p0}, Lo/ehe;->d()V

    .line 118
    return-void
.end method

.method private d()V
    .locals 2

    .line 121
    iget-object v0, p0, Lo/ehe;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 123
    iget-object v0, p0, Lo/ehe;->d:Ljava/util/List;

    sget-object v1, Lo/ehe$b;->c:Lo/ehe$b;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    iget-object v0, p0, Lo/ehe;->d:Ljava/util/List;

    sget-object v1, Lo/ehe$b;->d:Lo/ehe$b;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    iget-object v0, p0, Lo/ehe;->d:Ljava/util/List;

    sget-object v1, Lo/ehe$b;->a:Lo/ehe$b;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    iget-object v0, p0, Lo/ehe;->d:Ljava/util/List;

    sget-object v1, Lo/ehe$b;->b:Lo/ehe$b;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 127
    return-void
.end method


# virtual methods
.method public a(Lo/eih;Lo/eic;)Lo/eii;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/eic;)TT;"
        }
    .end annotation

    .line 161
    new-instance v0, Lo/ehe$a;

    invoke-direct {v0}, Lo/ehe$a;-><init>()V

    invoke-virtual {v0, p2}, Lo/ehe$a;->c(Lo/eic;)Lo/ehe$a;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lo/ehe;->c(Lo/eih;Lo/ehe$a;)Lo/eii;

    move-result-object v1

    .line 162
    return-object v1
.end method

.method public a(Lo/eih;Lo/eii;Lo/ehe$a;)Lo/eii;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;TT;Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 188
    invoke-virtual {p0, p1, p2}, Lo/ehe;->a(Lo/eih;Lo/eii;)V

    .line 189
    invoke-virtual {p1}, Lo/eih;->c()V

    .line 190
    return-object p2
.end method

.method protected a(Lo/eih;Lo/eii;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;TT;)V"
        }
    .end annotation

    .line 298
    if-nez p1, :cond_0

    .line 299
    return-void

    .line 301
    :cond_0
    invoke-virtual {p1}, Lo/eih;->getData()Lo/ma;

    move-result-object v2

    .line 303
    if-nez v2, :cond_1

    .line 304
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "addDataSet method found data null"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 306
    :cond_1
    invoke-virtual {v2}, Lo/ma;->h()Ljava/util/List;

    move-result-object v3

    .line 308
    invoke-interface {v3, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 310
    return-void
.end method

.method protected abstract b(Lo/ehe$a;)Lo/eii;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehe$a;)TT;"
        }
    .end annotation
.end method

.method public b(Lo/ejf$b;Ljava/lang/String;)V
    .locals 1

    .line 251
    iget-object v0, p0, Lo/ehe;->c:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    return-void
.end method

.method protected c(Lo/eic;)Ljava/lang/String;
    .locals 1

    .line 237
    const-string v0, ""

    return-object v0
.end method

.method public c(Lo/ehe$a;)Lo/eii;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 183
    invoke-virtual {p0, p1}, Lo/ehe;->b(Lo/ehe$a;)Lo/eii;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/eih;Lo/ehe$a;)Lo/eii;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 171
    if-nez p1, :cond_0

    .line 172
    const/4 v0, 0x0

    return-object v0

    .line 176
    :cond_0
    iget-object v0, p2, Lo/ehe$a;->c:Lo/eic;

    invoke-virtual {p0, p1, v0, p2}, Lo/ehe;->d(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;

    move-result-object v1

    .line 177
    invoke-virtual {p1}, Lo/eih;->c()V

    .line 178
    return-object v1
.end method

.method protected abstract c(Lo/eih;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;)V"
        }
    .end annotation
.end method

.method public c(Lo/eih;Lo/eii;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;TT;)V"
        }
    .end annotation

    .line 194
    if-nez p1, :cond_0

    .line 195
    return-void

    .line 197
    :cond_0
    invoke-virtual {p1}, Lo/eih;->getData()Lo/ma;

    move-result-object v1

    .line 198
    if-nez v1, :cond_1

    .line 199
    return-void

    .line 201
    :cond_1
    invoke-virtual {v1}, Lo/ma;->h()Ljava/util/List;

    move-result-object v2

    .line 202
    if-nez v2, :cond_2

    .line 203
    return-void

    .line 205
    :cond_2
    invoke-interface {v2, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 206
    invoke-virtual {p1}, Lo/eih;->c()V

    .line 207
    return-void
.end method

.method protected d(Lo/eic;)Ljava/lang/String;
    .locals 1

    .line 233
    const-string v0, ""

    return-object v0
.end method

.method protected d(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/eic;Lo/ehe$a;)TT;"
        }
    .end annotation

    .line 211
    invoke-virtual {p0, p1}, Lo/ehe;->c(Lo/eih;)V

    .line 213
    invoke-virtual {p0, p1, p2, p3}, Lo/ehe;->e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;

    move-result-object v5

    .line 214
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lo/eih;->b(Z)V

    .line 215
    const/16 v0, 0x1a

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    const/16 v1, 0x1a

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lo/eih;->setGridColor(II)V

    .line 216
    invoke-virtual {p1}, Lo/eih;->getXAxis()Lo/ln;

    move-result-object v0

    const/16 v1, 0x1a

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v0, v1}, Lo/ln;->a(I)V

    .line 219
    invoke-virtual {p0, p1, p2}, Lo/ehe;->e(Lo/eih;Lo/eic;)V

    .line 220
    invoke-virtual {p0, p1, v5}, Lo/ehe;->a(Lo/eih;Lo/eii;)V

    .line 222
    return-object v5
.end method

.method protected e(Lo/eic;)Ljava/lang/String;
    .locals 4

    .line 241
    iget-object v0, p0, Lo/ehe;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/util/Map$Entry;

    .line 242
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/ejf$b;

    .line 243
    invoke-interface {v3, p1}, Lo/ejf$b;->b(Lo/eic;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 244
    iget-object v0, p0, Lo/ehe;->c:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 246
    :cond_0
    goto :goto_0

    .line 247
    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method protected abstract e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/eic;Lo/ehe$a;)TT;"
        }
    .end annotation
.end method

.method protected e(Lo/eih;Lo/eic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TChartT;Lo/eic;)V"
        }
    .end annotation

    .line 225
    return-void
.end method
