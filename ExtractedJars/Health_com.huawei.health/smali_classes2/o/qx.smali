.class public final Lo/qx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lo/qx;

.field public static final b:Lo/qx;

.field public static final c:Lo/qx;

.field public static final d:Lo/qx;

.field public static final e:Lo/qx;

.field public static final g:Lo/qx;

.field public static final h:Lo/qx;

.field public static final k:Lo/qx;


# instance fields
.field private final f:[I

.field private final i:[I

.field private final l:Lo/qz;

.field private final m:Lo/qz;

.field private final n:I

.field private final o:I

.field private final p:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 32
    new-instance v0, Lo/qx;

    const/16 v1, 0x1069

    const/16 v2, 0x1000

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/qx;-><init>(III)V

    sput-object v0, Lo/qx;->d:Lo/qx;

    .line 33
    new-instance v0, Lo/qx;

    const/16 v1, 0x409

    const/16 v2, 0x400

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/qx;-><init>(III)V

    sput-object v0, Lo/qx;->e:Lo/qx;

    .line 34
    new-instance v0, Lo/qx;

    const/16 v1, 0x43

    const/16 v2, 0x40

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/qx;-><init>(III)V

    sput-object v0, Lo/qx;->b:Lo/qx;

    .line 35
    new-instance v0, Lo/qx;

    const/16 v1, 0x13

    const/16 v2, 0x10

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/qx;-><init>(III)V

    sput-object v0, Lo/qx;->a:Lo/qx;

    .line 36
    new-instance v0, Lo/qx;

    const/16 v1, 0x11d

    const/16 v2, 0x100

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lo/qx;-><init>(III)V

    sput-object v0, Lo/qx;->c:Lo/qx;

    .line 37
    new-instance v0, Lo/qx;

    const/16 v1, 0x12d

    const/16 v2, 0x100

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lo/qx;-><init>(III)V

    sput-object v0, Lo/qx;->h:Lo/qx;

    .line 38
    sget-object v0, Lo/qx;->h:Lo/qx;

    sput-object v0, Lo/qx;->g:Lo/qx;

    .line 39
    sget-object v0, Lo/qx;->b:Lo/qx;

    sput-object v0, Lo/qx;->k:Lo/qx;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 4

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput p1, p0, Lo/qx;->o:I

    .line 62
    iput p2, p0, Lo/qx;->p:I

    .line 63
    iput p3, p0, Lo/qx;->n:I

    .line 65
    new-array v0, p2, [I

    iput-object v0, p0, Lo/qx;->i:[I

    .line 66
    new-array v0, p2, [I

    iput-object v0, p0, Lo/qx;->f:[I

    .line 67
    const/4 v2, 0x1

    .line 68
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_1

    .line 69
    iget-object v0, p0, Lo/qx;->i:[I

    aput v2, v0, v3

    .line 70
    mul-int/lit8 v2, v2, 0x2

    .line 71
    if-lt v2, p2, :cond_0

    .line 72
    xor-int/2addr v2, p1

    .line 73
    add-int/lit8 v0, p2, -0x1

    and-int/2addr v2, v0

    .line 68
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 76
    :cond_1
    const/4 v3, 0x0

    :goto_1
    add-int/lit8 v0, p2, -0x1

    if-ge v3, v0, :cond_2

    .line 77
    iget-object v0, p0, Lo/qx;->f:[I

    iget-object v1, p0, Lo/qx;->i:[I

    aget v1, v1, v3

    aput v3, v0, v1

    .line 76
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 80
    :cond_2
    new-instance v0, Lo/qz;

    const/4 v1, 0x1

    new-array v1, v1, [I

    fill-array-data v1, :array_0

    invoke-direct {v0, p0, v1}, Lo/qz;-><init>(Lo/qx;[I)V

    iput-object v0, p0, Lo/qx;->m:Lo/qz;

    .line 81
    new-instance v0, Lo/qz;

    const/4 v1, 0x1

    new-array v1, v1, [I

    fill-array-data v1, :array_1

    invoke-direct {v0, p0, v1}, Lo/qz;-><init>(Lo/qx;[I)V

    iput-object v0, p0, Lo/qx;->l:Lo/qz;

    .line 82
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

.method static e(II)I
    .locals 1

    .line 113
    xor-int v0, p0, p1

    return v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 154
    iget v0, p0, Lo/qx;->p:I

    return v0
.end method

.method a(I)I
    .locals 1

    .line 120
    iget-object v0, p0, Lo/qx;->i:[I

    aget v0, v0, p1

    return v0
.end method

.method a(II)I
    .locals 4

    .line 147
    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    .line 148
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 150
    :cond_1
    iget-object v0, p0, Lo/qx;->i:[I

    iget-object v1, p0, Lo/qx;->f:[I

    aget v1, v1, p1

    iget-object v2, p0, Lo/qx;->f:[I

    aget v2, v2, p2

    add-int/2addr v1, v2

    iget v2, p0, Lo/qx;->p:I

    add-int/lit8 v2, v2, -0x1

    rem-int/2addr v1, v2

    aget v0, v0, v1

    return v0
.end method

.method b(I)I
    .locals 3

    .line 137
    if-nez p1, :cond_0

    .line 138
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 140
    :cond_0
    iget-object v0, p0, Lo/qx;->i:[I

    iget v1, p0, Lo/qx;->p:I

    iget-object v2, p0, Lo/qx;->f:[I

    aget v2, v2, p1

    sub-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    return v0
.end method

.method b()Lo/qz;
    .locals 1

    .line 89
    iget-object v0, p0, Lo/qx;->l:Lo/qz;

    return-object v0
.end method

.method public c()I
    .locals 1

    .line 158
    iget v0, p0, Lo/qx;->n:I

    return v0
.end method

.method c(I)I
    .locals 1

    .line 127
    if-nez p1, :cond_0

    .line 128
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 130
    :cond_0
    iget-object v0, p0, Lo/qx;->f:[I

    aget v0, v0, p1

    return v0
.end method

.method d()Lo/qz;
    .locals 1

    .line 85
    iget-object v0, p0, Lo/qx;->m:Lo/qz;

    return-object v0
.end method

.method d(II)Lo/qz;
    .locals 2

    .line 96
    if-gez p1, :cond_0

    .line 97
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 99
    :cond_0
    if-nez p2, :cond_1

    .line 100
    iget-object v0, p0, Lo/qx;->m:Lo/qz;

    return-object v0

    .line 102
    :cond_1
    add-int/lit8 v0, p1, 0x1

    new-array v1, v0, [I

    .line 103
    const/4 v0, 0x0

    aput p2, v1, v0

    .line 104
    new-instance v0, Lo/qz;

    invoke-direct {v0, p0, v1}, Lo/qz;-><init>(Lo/qx;[I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 163
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "GF(0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/qx;->o:I

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x2c

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/qx;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
