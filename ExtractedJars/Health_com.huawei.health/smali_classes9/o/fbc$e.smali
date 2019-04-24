.class Lo/fbc$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fbc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:I

.field private c:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 311
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 312
    iput p1, p0, Lo/fbc$e;->e:I

    .line 313
    iput p2, p0, Lo/fbc$e;->c:I

    .line 314
    iput p3, p0, Lo/fbc$e;->d:I

    .line 316
    iget v0, p0, Lo/fbc$e;->e:I

    iput v0, p0, Lo/fbc$e;->b:I

    .line 317
    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    .line 343
    iget v0, p0, Lo/fbc$e;->b:I

    iget v1, p0, Lo/fbc$e;->d:I

    add-int/2addr v0, v1

    return v0
.end method

.method public b()Z
    .locals 5

    .line 320
    iget v0, p0, Lo/fbc$e;->b:I

    iget v1, p0, Lo/fbc$e;->d:I

    add-int v3, v0, v1

    .line 321
    iget v0, p0, Lo/fbc$e;->b:I

    iget v1, p0, Lo/fbc$e;->d:I

    mul-int/lit8 v1, v1, 0x2

    add-int v4, v0, v1

    .line 322
    iget v0, p0, Lo/fbc$e;->c:I

    if-le v3, v0, :cond_0

    iget v0, p0, Lo/fbc$e;->c:I

    if-le v4, v0, :cond_0

    .line 323
    const/4 v0, 0x0

    return v0

    .line 325
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public d()Z
    .locals 2

    .line 329
    invoke-virtual {p0}, Lo/fbc$e;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 330
    const/4 v0, 0x0

    return v0

    .line 332
    :cond_0
    iget v0, p0, Lo/fbc$e;->b:I

    iget v1, p0, Lo/fbc$e;->d:I

    add-int/2addr v0, v1

    iput v0, p0, Lo/fbc$e;->b:I

    .line 333
    const/4 v0, 0x1

    return v0
.end method

.method public e()I
    .locals 1

    .line 338
    iget v0, p0, Lo/fbc$e;->b:I

    return v0
.end method
