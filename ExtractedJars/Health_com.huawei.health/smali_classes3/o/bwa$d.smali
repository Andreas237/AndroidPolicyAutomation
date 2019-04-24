.class public Lo/bwa$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bwa;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 421
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 426
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa$d;->b:I

    .line 431
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa$d;->c:I

    .line 436
    const/4 v0, 0x0

    iput v0, p0, Lo/bwa$d;->a:I

    .line 441
    const/16 v0, 0xbe

    iput v0, p0, Lo/bwa$d;->e:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 476
    iget v0, p0, Lo/bwa$d;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/bwa$d;->a:I

    .line 477
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 448
    iput p1, p0, Lo/bwa$d;->b:I

    .line 449
    return-void
.end method

.method public b()I
    .locals 1

    .line 468
    iget v0, p0, Lo/bwa$d;->e:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 464
    iput p1, p0, Lo/bwa$d;->a:I

    .line 465
    return-void
.end method

.method public c()I
    .locals 1

    .line 444
    iget v0, p0, Lo/bwa$d;->b:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 460
    iget v0, p0, Lo/bwa$d;->a:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 456
    iput p1, p0, Lo/bwa$d;->c:I

    .line 457
    return-void
.end method

.method public e()I
    .locals 1

    .line 452
    iget v0, p0, Lo/bwa$d;->c:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 472
    iput p1, p0, Lo/bwa$d;->e:I

    .line 473
    return-void
.end method

.method public k()V
    .locals 2

    .line 480
    iget v0, p0, Lo/bwa$d;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bwa$d;->a:I

    .line 481
    return-void
.end method
