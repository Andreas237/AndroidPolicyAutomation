.class public abstract Lo/elh$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/elh$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/elh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "h"
.end annotation


# instance fields
.field private b:F

.field public h:I

.field public k:Z

.field public m:F

.field public n:Lo/elh$f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 212
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 213
    const/4 v0, 0x0

    iput v0, p0, Lo/elh$h;->h:I

    .line 215
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elh$h;->k:Z

    return-void
.end method


# virtual methods
.method public a(Lo/elh$f;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/elh$h;->n:Lo/elh$f;

    .line 245
    return-void
.end method

.method public b()Z
    .locals 1

    .line 236
    iget-boolean v0, p0, Lo/elh$h;->k:Z

    return v0
.end method

.method public c(Lo/nv;)F
    .locals 3

    .line 226
    const/4 v0, 0x4

    new-array v2, v0, [F

    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    iget v0, p0, Lo/elh$h;->b:F

    const/4 v1, 0x2

    aput v0, v2, v1

    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 227
    invoke-virtual {p1, v2}, Lo/nv;->e([F)V

    .line 228
    const/4 v0, 0x2

    aget v0, v2, v0

    const/4 v1, 0x0

    aget v1, v2, v1

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    return v0
.end method

.method public c(F)V
    .locals 1

    .line 221
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/elh$h;->k:Z

    .line 222
    iput p1, p0, Lo/elh$h;->b:F

    .line 223
    return-void
.end method

.method public d()V
    .locals 1

    .line 232
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/elh$h;->k:Z

    .line 233
    return-void
.end method

.method public e(F)V
    .locals 0

    .line 240
    iput p1, p0, Lo/elh$h;->m:F

    .line 241
    return-void
.end method

.method public g()F
    .locals 1

    .line 248
    iget v0, p0, Lo/elh$h;->m:F

    return v0
.end method

.method public i()I
    .locals 1

    .line 256
    iget v0, p0, Lo/elh$h;->h:I

    return v0
.end method

.method public k()Lo/elh$f;
    .locals 1

    .line 252
    iget-object v0, p0, Lo/elh$h;->n:Lo/elh$f;

    return-object v0
.end method
