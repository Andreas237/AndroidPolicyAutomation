.class public Lo/cde;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Z

.field private c:F

.field private d:F

.field private e:I

.field private f:[F

.field private g:F

.field private h:F

.field private i:I

.field private k:Z

.field private o:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cde;->b:Z

    .line 9
    const/4 v0, 0x3

    iput v0, p0, Lo/cde;->e:I

    .line 14
    const/16 v0, 0x64

    iput v0, p0, Lo/cde;->a:I

    .line 17
    const/high16 v0, 0x3fc00000    # 1.5f

    iput v0, p0, Lo/cde;->c:F

    .line 21
    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lo/cde;->d:F

    .line 24
    const/4 v0, 0x3

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/cde;->f:[F

    .line 28
    const v0, 0x3e99999a    # 0.3f

    iput v0, p0, Lo/cde;->h:F

    .line 29
    const v0, 0x40333333    # 2.8f

    iput v0, p0, Lo/cde;->g:F

    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/cde;->k:Z

    .line 35
    const/4 v0, 0x3

    iput v0, p0, Lo/cde;->i:I

    .line 38
    const/16 v0, 0x4e20

    iput v0, p0, Lo/cde;->o:I

    return-void

    :array_0
    .array-data 4
        0x41400000    # 12.0f
        0x41400000    # 12.0f
        0x42053333    # 33.3f
    .end array-data
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 66
    iget v0, p0, Lo/cde;->c:F

    return v0
.end method

.method public a(Z)V
    .locals 0

    .line 112
    iput-boolean p1, p0, Lo/cde;->k:Z

    .line 113
    return-void
.end method

.method public b(I)F
    .locals 1

    .line 82
    iget-object v0, p0, Lo/cde;->f:[F

    aget v0, v0, p1

    return v0
.end method

.method public b()I
    .locals 1

    .line 50
    iget v0, p0, Lo/cde;->e:I

    return v0
.end method

.method public b(F)V
    .locals 0

    .line 70
    iput p1, p0, Lo/cde;->c:F

    .line 71
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 46
    iput-boolean p1, p0, Lo/cde;->b:Z

    .line 47
    return-void
.end method

.method public c(F)V
    .locals 0

    .line 78
    iput p1, p0, Lo/cde;->d:F

    .line 79
    return-void
.end method

.method public c()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lo/cde;->b:Z

    return v0
.end method

.method public d()I
    .locals 1

    .line 58
    iget v0, p0, Lo/cde;->a:I

    return v0
.end method

.method public d(F)V
    .locals 0

    .line 104
    iput p1, p0, Lo/cde;->g:F

    .line 105
    return-void
.end method

.method public e()F
    .locals 1

    .line 74
    iget v0, p0, Lo/cde;->d:F

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 96
    iput p1, p0, Lo/cde;->h:F

    .line 97
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 62
    iput p1, p0, Lo/cde;->a:I

    .line 63
    return-void
.end method

.method public e([F)V
    .locals 1

    .line 86
    if-eqz p1, :cond_0

    .line 87
    invoke-virtual {p1}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iput-object v0, p0, Lo/cde;->f:[F

    .line 89
    :cond_0
    return-void
.end method

.method public f()Z
    .locals 1

    .line 108
    iget-boolean v0, p0, Lo/cde;->k:Z

    return v0
.end method

.method public g()I
    .locals 1

    .line 116
    iget v0, p0, Lo/cde;->i:I

    return v0
.end method

.method public h()I
    .locals 1

    .line 124
    iget v0, p0, Lo/cde;->o:I

    return v0
.end method

.method public i()F
    .locals 1

    .line 100
    iget v0, p0, Lo/cde;->g:F

    return v0
.end method

.method public k()F
    .locals 1

    .line 92
    iget v0, p0, Lo/cde;->h:F

    return v0
.end method
