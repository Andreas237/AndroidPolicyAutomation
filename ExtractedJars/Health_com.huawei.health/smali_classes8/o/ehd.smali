.class public abstract Lo/ehd;
.super Lo/ehl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/ehl<Lo/ehn;Lo/eho;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lo/ehl;-><init>(Landroid/content/Context;)V

    .line 26
    return-void
.end method


# virtual methods
.method protected a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;
    .locals 9

    .line 30
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 31
    new-instance v0, Lo/eht;

    move-object v1, v6

    invoke-virtual {p0, p2}, Lo/ehd;->d(Lo/eic;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p2}, Lo/ehd;->c(Lo/eic;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, p2}, Lo/ehd;->e(Lo/eic;)Ljava/lang/String;

    move-result-object v4

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lo/eht;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V

    move-object v7, v0

    .line 34
    const/16 v0, 0xff

    const/16 v1, 0xfd

    const/16 v2, 0xb2

    const/16 v3, 0x90

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/ehn;->c(I)V

    .line 37
    const/16 v0, 0xff

    const/16 v1, 0xfa

    const/16 v2, 0x65

    const/16 v3, 0x21

    invoke-static {v0, v1, v2, v3}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    invoke-virtual {v7, v0}, Lo/ehn;->g(I)V

    .line 39
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Lo/ehn;->d(IZ)V

    .line 41
    invoke-virtual {p1}, Lo/eho;->getData()Lo/ma;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/ehq;

    .line 42
    invoke-virtual {v8, p2}, Lo/ehq;->c(Lo/eic;)V

    .line 44
    return-object v7
.end method

.method protected b(Lo/eho;)V
    .locals 2

    .line 49
    invoke-virtual {p1}, Lo/eho;->getData()Lo/ma;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lo/ehq;

    .line 50
    if-nez v1, :cond_0

    .line 51
    new-instance v1, Lo/ehq;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v1, v0}, Lo/ehq;-><init>(Ljava/util/List;)V

    .line 52
    invoke-virtual {p1, v1}, Lo/eho;->setData(Lo/ma;)V

    .line 54
    :cond_0
    return-void
.end method

.method protected synthetic c(Lo/eih;)V
    .locals 1

    .line 22
    move-object v0, p1

    check-cast v0, Lo/eho;

    invoke-virtual {p0, v0}, Lo/ehd;->b(Lo/eho;)V

    return-void
.end method

.method protected synthetic e(Lo/eih;Lo/eic;Lo/ehe$a;)Lo/eii;
    .locals 1

    .line 22
    move-object v0, p1

    check-cast v0, Lo/eho;

    invoke-virtual {p0, v0, p2, p3}, Lo/ehd;->a(Lo/eho;Lo/eic;Lo/ehe$a;)Lo/ehn;

    move-result-object v0

    return-object v0
.end method
