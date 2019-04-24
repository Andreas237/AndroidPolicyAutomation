.class public final Lo/tx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Lo/tx;


# instance fields
.field private final a:Lo/ud;

.field private final b:Lo/ud;

.field private final c:[I

.field private final d:[I

.field private final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 29
    new-instance v0, Lo/tx;

    const/16 v1, 0x3a1

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lo/tx;-><init>(II)V

    sput-object v0, Lo/tx;->e:Lo/tx;

    return-void
.end method

.method private constructor <init>(II)V
    .locals 4

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput p1, p0, Lo/tx;->f:I

    .line 39
    new-array v0, p1, [I

    iput-object v0, p0, Lo/tx;->d:[I

    .line 40
    new-array v0, p1, [I

    iput-object v0, p0, Lo/tx;->c:[I

    .line 41
    const/4 v2, 0x1

    .line 42
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p1, :cond_0

    .line 43
    iget-object v0, p0, Lo/tx;->d:[I

    aput v2, v0, v3

    .line 44
    mul-int v0, v2, p2

    rem-int v2, v0, p1

    .line 42
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 46
    :cond_0
    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v0, p1, -0x1

    if-ge v3, v0, :cond_1

    .line 47
    iget-object v0, p0, Lo/tx;->c:[I

    iget-object v1, p0, Lo/tx;->d:[I

    aget v1, v1, v3

    aput v3, v0, v1

    .line 46
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 50
    :cond_1
    new-instance v0, Lo/ud;

    const/4 v1, 0x1

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-direct {v0, p0, v1}, Lo/ud;-><init>(Lo/tx;[I)V

    iput-object v0, p0, Lo/tx;->b:Lo/ud;

    .line 51
    new-instance v0, Lo/ud;

    const/4 v1, 0x1

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    invoke-direct {v0, p0, v1}, Lo/ud;-><init>(Lo/tx;[I)V

    iput-object v0, p0, Lo/tx;->a:Lo/ud;

    .line 52
    return-void

    nop

    :array_0
    .array-data 4
        0x0
    .end array-data

    :array_1
    .array-data 4
        0x1
    .end array-data
.end method


# virtual methods
.method a(I)I
    .locals 3

    .line 95
    if-nez p1, :cond_0

    .line 96
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 98
    :cond_0
    iget-object v0, p0, Lo/tx;->d:[I

    iget v1, p0, Lo/tx;->f:I

    iget-object v2, p0, Lo/tx;->c:[I

    aget v2, v2, p1

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    return v0
.end method

.method b()Lo/ud;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/tx;->b:Lo/ud;

    return-object v0
.end method

.method b(II)Lo/ud;
    .locals 2

    .line 64
    if-gez p1, :cond_0

    .line 65
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 67
    :cond_0
    if-nez p2, :cond_1

    .line 68
    iget-object v0, p0, Lo/tx;->b:Lo/ud;

    return-object v0

    .line 70
    :cond_1
    add-int/lit8 v0, p1, 0x1

    new-array v1, v0, [I

    .line 71
    const/4 v0, 0x0

    aput p2, v1, v0

    .line 72
    new-instance v0, Lo/ud;

    invoke-direct {v0, p0, v1}, Lo/ud;-><init>(Lo/tx;[I)V

    return-object v0
.end method

.method c(II)I
    .locals 2

    .line 80
    iget v0, p0, Lo/tx;->f:I

    add-int/2addr v0, p1

    sub-int/2addr v0, p2

    iget v1, p0, Lo/tx;->f:I

    rem-int/2addr v0, v1

    return v0
.end method

.method d(I)I
    .locals 1

    .line 84
    iget-object v0, p0, Lo/tx;->d:[I

    aget v0, v0, p1

    return v0
.end method

.method d(II)I
    .locals 2

    .line 76
    add-int v0, p1, p2

    iget v1, p0, Lo/tx;->f:I

    rem-int/2addr v0, v1

    return v0
.end method

.method d()Lo/ud;
    .locals 1

    .line 60
    iget-object v0, p0, Lo/tx;->a:Lo/ud;

    return-object v0
.end method

.method e()I
    .locals 1

    .line 109
    iget v0, p0, Lo/tx;->f:I

    return v0
.end method

.method e(I)I
    .locals 1

    .line 88
    if-nez p1, :cond_0

    .line 89
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 91
    :cond_0
    iget-object v0, p0, Lo/tx;->c:[I

    aget v0, v0, p1

    return v0
.end method

.method e(II)I
    .locals 4

    .line 102
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 103
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 105
    :cond_1
    iget-object v0, p0, Lo/tx;->d:[I

    iget-object v1, p0, Lo/tx;->c:[I

    aget v1, v1, p1

    iget-object v2, p0, Lo/tx;->c:[I

    aget v2, v2, p2

    add-int/2addr v1, v2

    iget v2, p0, Lo/tx;->f:I

    add-int/lit8 v2, v2, -0x1

    rem-int/2addr v1, v2

    aget v0, v0, v1

    return v0
.end method
