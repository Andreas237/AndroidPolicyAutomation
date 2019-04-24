.class public Lo/elh$a;
.super Lo/elh$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/elh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/graphics/drawable/Drawable;

.field public b:I

.field public c:Z

.field public d:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 260
    invoke-direct {p0}, Lo/elh$h;-><init>()V

    .line 265
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elh$a;->c:Z

    return-void
.end method


# virtual methods
.method public c()V
    .locals 0

    .line 275
    return-void
.end method

.method public c(Landroid/graphics/Canvas;Lo/elg;Lo/ele$c;)V
    .locals 3

    .line 279
    iget v0, p0, Lo/elh$a;->b:I

    invoke-virtual {p3, p1, p2, v0}, Lo/ele$c;->c(Landroid/graphics/Canvas;Lo/elg;I)V

    .line 280
    iget-boolean v0, p0, Lo/elh$a;->c:Z

    if-eqz v0, :cond_0

    .line 281
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lo/elh$a;->d:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lo/elh$a;->a:Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {p3, p1, p2, v0}, Lo/ele$c;->b(Landroid/graphics/Canvas;Lo/elg;[Landroid/graphics/drawable/Drawable;)V

    .line 284
    :cond_0
    return-void
.end method

.method public e()V
    .locals 0

    .line 270
    return-void
.end method

.method public e(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;Lo/ele$c;)V
    .locals 8

    .line 288
    move-object v0, p5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    iget v5, p0, Lo/elh$a;->b:I

    invoke-virtual/range {v0 .. v5}, Lo/ele$c;->d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;I)V

    .line 289
    iget-boolean v0, p0, Lo/elh$a;->c:Z

    if-eqz v0, :cond_0

    .line 290
    move-object v0, p5

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    const/4 v5, 0x2

    new-array v5, v5, [Landroid/graphics/drawable/Drawable;

    iget-object v6, p0, Lo/elh$a;->d:Landroid/graphics/drawable/Drawable;

    const/4 v7, 0x0

    aput-object v6, v5, v7

    iget-object v6, p0, Lo/elh$a;->a:Landroid/graphics/drawable/Drawable;

    const/4 v7, 0x1

    aput-object v6, v5, v7

    invoke-virtual/range {v0 .. v5}, Lo/ele$c;->d(Landroid/graphics/Canvas;Lo/elg;Landroid/graphics/Path;Lo/elg;[Landroid/graphics/drawable/Drawable;)V

    .line 293
    :cond_0
    return-void
.end method
