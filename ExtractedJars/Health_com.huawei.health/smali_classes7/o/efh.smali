.class public Lo/efh;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/efh$b;
    }
.end annotation


# static fields
.field private static final b:Ljava/lang/String;


# instance fields
.field private a:[F

.field public c:Ljava/util/Stack;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Stack<[F>;"
        }
    .end annotation
.end field

.field private d:[F

.field private e:[F

.field private g:[F

.field private h:Lo/efh$b;

.field private i:[F

.field private k:[F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 16
    const-class v0, Lo/efh;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/efh;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lo/efh;->d:[F

    .line 18
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lo/efh;->a:[F

    .line 19
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lo/efh;->e:[F

    .line 20
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lo/efh;->i:[F

    .line 21
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lo/efh;->k:[F

    .line 22
    const/16 v0, 0x10

    new-array v0, v0, [F

    iput-object v0, p0, Lo/efh;->g:[F

    .line 23
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    iput-object v0, p0, Lo/efh;->c:Ljava/util/Stack;

    return-void
.end method


# virtual methods
.method public a(FFF)V
    .locals 2

    .line 89
    iget-object v0, p0, Lo/efh;->e:[F

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2, p3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    .line 90
    return-void
.end method

.method public a()[F
    .locals 6

    .line 44
    iget-object v0, p0, Lo/efh;->g:[F

    iget-object v2, p0, Lo/efh;->d:[F

    iget-object v4, p0, Lo/efh;->a:[F

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 45
    iget-object v0, p0, Lo/efh;->g:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public b()V
    .locals 2

    .line 27
    iget-object v0, p0, Lo/efh;->c:Ljava/util/Stack;

    iget-object v1, p0, Lo/efh;->e:[F

    invoke-virtual {v1}, [F->clone()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    return-void
.end method

.method public b(FFFF)V
    .locals 6

    .line 84
    iget-object v0, p0, Lo/efh;->e:[F

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    const/4 v1, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->rotateM([FIFFFF)V

    .line 85
    return-void
.end method

.method public c()V
    .locals 1

    .line 31
    iget-object v0, p0, Lo/efh;->c:Ljava/util/Stack;

    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lo/efh;->e:[F

    .line 32
    return-void
.end method

.method public c(FFFFFF)V
    .locals 8

    .line 97
    iget-object v0, p0, Lo/efh;->d:[F

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    move v7, p6

    const/4 v1, 0x0

    invoke-static/range {v0 .. v7}, Landroid/opengl/Matrix;->frustumM([FIFFFFFF)V

    .line 98
    sget-object v0, Lo/efh$b;->d:Lo/efh$b;

    iput-object v0, p0, Lo/efh;->h:Lo/efh$b;

    .line 99
    return-void
.end method

.method public c(FFFFFFFFF)V
    .locals 11

    .line 93
    iget-object v0, p0, Lo/efh;->a:[F

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    const/4 v1, 0x0

    invoke-static/range {v0 .. v10}, Landroid/opengl/Matrix;->setLookAtM([FIFFFFFFFFF)V

    .line 94
    return-void
.end method

.method public d()V
    .locals 1

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efh;->d:[F

    .line 36
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efh;->a:[F

    .line 37
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efh;->e:[F

    .line 38
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efh;->i:[F

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efh;->k:[F

    .line 40
    const/4 v0, 0x0

    iput-object v0, p0, Lo/efh;->g:[F

    .line 41
    return-void
.end method

.method public e(FFF)V
    .locals 2

    .line 80
    iget-object v0, p0, Lo/efh;->e:[F

    const/4 v1, 0x0

    invoke-static {v0, v1, p1, p2, p3}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    .line 81
    return-void
.end method

.method public e()[F
    .locals 6

    .line 49
    iget-object v0, p0, Lo/efh;->k:[F

    iget-object v2, p0, Lo/efh;->a:[F

    iget-object v4, p0, Lo/efh;->e:[F

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 50
    iget-object v0, p0, Lo/efh;->k:[F

    iget-object v2, p0, Lo/efh;->d:[F

    iget-object v4, p0, Lo/efh;->k:[F

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 51
    iget-object v0, p0, Lo/efh;->k:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public f()V
    .locals 6

    .line 76
    iget-object v0, p0, Lo/efh;->e:[F

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    .line 77
    return-void
.end method

.method public g()[F
    .locals 1

    .line 60
    iget-object v0, p0, Lo/efh;->d:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public h()[F
    .locals 1

    .line 64
    iget-object v0, p0, Lo/efh;->a:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public i()[F
    .locals 1

    .line 68
    iget-object v0, p0, Lo/efh;->e:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method

.method public k()[F
    .locals 6

    .line 55
    iget-object v0, p0, Lo/efh;->i:[F

    iget-object v2, p0, Lo/efh;->a:[F

    iget-object v4, p0, Lo/efh;->e:[F

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    .line 56
    iget-object v0, p0, Lo/efh;->i:[F

    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    return-object v0
.end method
