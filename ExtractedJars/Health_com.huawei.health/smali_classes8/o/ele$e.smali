.class public Lo/ele$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ele;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lo/ele;

.field private d:Lo/ele$c;


# direct methods
.method protected constructor <init>(Lo/ele;)V
    .locals 2

    .line 185
    iput-object p1, p0, Lo/ele$e;->b:Lo/ele;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 187
    new-instance v0, Lo/ele$c;

    iget-object v1, p0, Lo/ele$e;->b:Lo/ele;

    invoke-direct {v0, v1}, Lo/ele$c;-><init>(Lo/ele;)V

    iput-object v0, p0, Lo/ele$e;->d:Lo/ele$c;

    return-void
.end method

.method private a(Landroid/graphics/Path;)V
    .locals 1

    .line 207
    iget-object v0, p0, Lo/ele$e;->b:Lo/ele;

    invoke-static {v0}, Lo/ele;->c(Lo/ele;)Lo/nv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/nv;->a(Landroid/graphics/Path;)V

    .line 208
    return-void
.end method

.method private e(Lo/elg;)Lo/elg;
    .locals 1

    .line 211
    iget-object v0, p0, Lo/ele$e;->b:Lo/ele;

    invoke-static {v0}, Lo/ele;->c(Lo/ele;)Lo/nv;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo/elg;->a(Lo/nv;)Lo/elg;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c(Landroid/graphics/Canvas;Lo/elg;Lo/elh;)V
    .locals 2

    .line 191
    invoke-virtual {p3}, Lo/elh;->b()Lo/elh$c;

    move-result-object v1

    .line 192
    invoke-direct {p0, p2}, Lo/ele$e;->e(Lo/elg;)Lo/elg;

    move-result-object p2

    .line 193
    iget-object v0, p0, Lo/ele$e;->d:Lo/ele$c;

    invoke-interface {v1, p1, p2, v0}, Lo/elh$c;->c(Landroid/graphics/Canvas;Lo/elg;Lo/ele$c;)V

    .line 194
    return-void
.end method

.method public e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;Lo/elh;)V
    .locals 7

    .line 199
    invoke-virtual {p5}, Lo/elh;->b()Lo/elh$c;

    move-result-object v6

    .line 200
    invoke-direct {p0, p2}, Lo/ele$e;->e(Lo/elg;)Lo/elg;

    move-result-object p2

    .line 201
    invoke-direct {p0, p3}, Lo/ele$e;->a(Landroid/graphics/Path;)V

    .line 202
    invoke-direct {p0, p4}, Lo/ele$e;->e(Lo/elg;)Lo/elg;

    move-result-object p4

    .line 203
    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    iget-object v5, p0, Lo/ele$e;->d:Lo/ele$c;

    invoke-interface/range {v0 .. v5}, Lo/elh$c;->e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;Lo/ele$c;)V

    .line 204
    return-void
.end method
