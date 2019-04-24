.class public Lo/cai;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[I

.field private static final e:[I


# instance fields
.field private a:F

.field private b:F

.field private c:[I

.field private f:I

.field private h:I

.field private i:I

.field private k:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/cai;->e:[I

    .line 17
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/cai;->d:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x28
        -0x1
    .end array-data

    :array_1
    .array-data 4
        0x28
        0x3c
        0x78
        0xb4
    .end array-data
.end method

.method public constructor <init>(FF[I)V
    .locals 1

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x4

    iput v0, p0, Lo/cai;->f:I

    .line 42
    invoke-direct {p0, p1, p2, p3}, Lo/cai;->c(FF[I)V

    .line 43
    return-void
.end method

.method public static final a()[I
    .locals 1

    .line 50
    sget-object v0, Lo/cai;->e:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method private c(FF[I)V
    .locals 1

    .line 58
    iput p1, p0, Lo/cai;->b:F

    .line 59
    iput p2, p0, Lo/cai;->a:F

    .line 60
    iput-object p3, p0, Lo/cai;->c:[I

    .line 61
    const/4 v0, 0x4

    iput v0, p0, Lo/cai;->f:I

    .line 62
    const/4 v0, 0x0

    iput v0, p0, Lo/cai;->k:I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lo/cai;->h:I

    .line 64
    iget v0, p0, Lo/cai;->h:I

    aget v0, p3, v0

    iput v0, p0, Lo/cai;->i:I

    .line 65
    return-void
.end method

.method public static final d()[I
    .locals 1

    .line 54
    sget-object v0, Lo/cai;->d:[I

    invoke-virtual {v0}, [I->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    return-object v0
.end method

.method private e(F)I
    .locals 1

    .line 94
    iget v0, p0, Lo/cai;->a:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    .line 95
    const/4 v0, 0x2

    return v0

    .line 96
    :cond_0
    iget v0, p0, Lo/cai;->b:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    .line 97
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_1
    iget v0, p0, Lo/cai;->b:F

    cmpg-float v0, v0, p1

    if-gtz v0, :cond_2

    iget v0, p0, Lo/cai;->a:F

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_2

    .line 99
    const/4 v0, 0x3

    return v0

    .line 101
    :cond_2
    const/4 v0, 0x4

    return v0
.end method


# virtual methods
.method public b(F)V
    .locals 5

    .line 72
    const-string v0, "StatusUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate current:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-direct {p0, p1}, Lo/cai;->e(F)I

    move-result v4

    .line 74
    const-string v0, "StatusUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate type:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const-string v0, "StatusUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate mLowerLimit:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cai;->b:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const-string v0, "StatusUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate mUpperLimit:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cai;->a:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    const-string v0, "StatusUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate mUpperLimit:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cai;->a:F

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const-string v0, "StatusUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate mTime:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cai;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const-string v0, "StatusUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate mTimeIndex:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cai;->h:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 80
    iget v0, p0, Lo/cai;->f:I

    if-ne v0, v4, :cond_0

    const/4 v0, 0x4

    if-eq v0, v4, :cond_0

    const/4 v0, 0x3

    if-eq v0, v4, :cond_0

    .line 81
    iget v0, p0, Lo/cai;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cai;->k:I

    goto :goto_0

    .line 83
    :cond_0
    iget v0, p0, Lo/cai;->b:F

    iget v1, p0, Lo/cai;->a:F

    iget-object v2, p0, Lo/cai;->c:[I

    invoke-direct {p0, v0, v1, v2}, Lo/cai;->c(FF[I)V

    .line 84
    const/4 v0, 0x4

    if-eq v0, v4, :cond_1

    const/4 v0, 0x3

    if-eq v0, v4, :cond_1

    .line 85
    iget v0, p0, Lo/cai;->k:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cai;->k:I

    .line 88
    :cond_1
    :goto_0
    const-string v0, "StatusUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onUpdate mTypeCount:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/cai;->k:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    iput v4, p0, Lo/cai;->f:I

    .line 91
    return-void
.end method

.method public d(FF[I)V
    .locals 0

    .line 46
    invoke-direct {p0, p1, p2, p3}, Lo/cai;->c(FF[I)V

    .line 47
    return-void
.end method

.method public e()I
    .locals 2

    .line 107
    iget v0, p0, Lo/cai;->k:I

    iget v1, p0, Lo/cai;->i:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/cai;->i:I

    const/4 v1, -0x1

    if-eq v1, v0, :cond_1

    .line 108
    const/4 v0, 0x0

    iput v0, p0, Lo/cai;->k:I

    .line 109
    iget v0, p0, Lo/cai;->h:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cai;->h:I

    .line 110
    iget v0, p0, Lo/cai;->h:I

    iget-object v1, p0, Lo/cai;->c:[I

    array-length v1, v1

    if-lt v0, v1, :cond_0

    .line 111
    iget-object v0, p0, Lo/cai;->c:[I

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/cai;->h:I

    .line 113
    :cond_0
    iget-object v0, p0, Lo/cai;->c:[I

    iget v1, p0, Lo/cai;->h:I

    aget v0, v0, v1

    iput v0, p0, Lo/cai;->i:I

    .line 114
    iget v0, p0, Lo/cai;->f:I

    return v0

    .line 116
    :cond_1
    const/4 v0, 0x4

    return v0
.end method
