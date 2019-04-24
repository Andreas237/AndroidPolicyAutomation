.class Lo/ehu$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ehu$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ehu;->d(Landroid/graphics/Canvas;[Lo/mh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/ehu;

.field final synthetic b:[Lo/mh;

.field final synthetic c:Lo/ld;


# direct methods
.method constructor <init>(Lo/ehu;Lo/ld;[Lo/mh;)V
    .locals 0

    .line 182
    iput-object p1, p0, Lo/ehu$4;->a:Lo/ehu;

    iput-object p2, p0, Lo/ehu$4;->c:Lo/ld;

    iput-object p3, p0, Lo/ehu$4;->b:[Lo/mh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lo/nj;Landroid/graphics/Canvas;)V
    .locals 8

    .line 185
    const/4 v2, 0x0

    .line 187
    instance-of v0, p1, Lo/ehp;

    if-eqz v0, :cond_0

    .line 188
    move-object v0, p1

    check-cast v0, Lo/ehp;

    invoke-virtual {v0}, Lo/ehp;->a()Lo/ejj;

    move-result-object v0

    invoke-interface {v0}, Lo/ejj;->getBarData()Lo/ehq;

    move-result-object v2

    goto :goto_0

    .line 189
    :cond_0
    instance-of v0, p1, Lo/ekx;

    if-eqz v0, :cond_1

    .line 190
    move-object v0, p1

    check-cast v0, Lo/ekx;

    invoke-virtual {v0}, Lo/ekx;->a()Lo/ejh;

    move-result-object v0

    invoke-interface {v0}, Lo/ejh;->getLineData()Lo/ela;

    move-result-object v2

    .line 191
    :cond_1
    :goto_0
    if-nez v2, :cond_2

    const/4 v3, -0x1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lo/ehu$4;->c:Lo/ld;

    .line 192
    invoke-virtual {v0}, Lo/ld;->getData()Lo/ma;

    move-result-object v0

    check-cast v0, Lo/eia;

    invoke-virtual {v0}, Lo/eia;->n()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v3

    .line 194
    :goto_1
    iget-object v0, p0, Lo/ehu$4;->a:Lo/ehu;

    iget-object v0, v0, Lo/ehu;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 196
    iget-object v4, p0, Lo/ehu$4;->b:[Lo/mh;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_2
    if-ge v6, v5, :cond_5

    aget-object v7, v4, v6

    .line 197
    invoke-virtual {v7}, Lo/mh;->a()I

    move-result v0

    if-eq v0, v3, :cond_3

    invoke-virtual {v7}, Lo/mh;->a()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_4

    .line 198
    :cond_3
    iget-object v0, p0, Lo/ehu$4;->a:Lo/ehu;

    iget-object v0, v0, Lo/ehu;->e:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    :cond_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 201
    :cond_5
    iget-object v0, p0, Lo/ehu$4;->a:Lo/ehu;

    iget-object v0, v0, Lo/ehu;->e:Ljava/util/List;

    iget-object v1, p0, Lo/ehu$4;->a:Lo/ehu;

    iget-object v1, v1, Lo/ehu;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lo/mh;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo/mh;

    invoke-virtual {p1, p2, v0}, Lo/nj;->d(Landroid/graphics/Canvas;[Lo/mh;)V

    .line 202
    return-void
.end method
