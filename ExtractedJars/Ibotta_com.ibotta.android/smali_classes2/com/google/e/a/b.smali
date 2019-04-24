.class public final Lcom/google/e/a/b;
.super Ljava/lang/Object;
.source "IMASDK"


# static fields
.field static final a:I

.field static final b:I

.field static final c:I

.field static final d:I

.field public static final e:[I

.field public static final f:[J

.field public static final g:[F

.field public static final h:[D

.field public static final i:[Z

.field public static final j:[Ljava/lang/String;

.field public static final k:[[B

.field public static final l:[B


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x3

    const/4 v1, 0x1

    .line 64
    invoke-static {v1, v0}, Lcom/google/e/a/b;->a(II)I

    move-result v2

    sput v2, Lcom/google/e/a/b;->a:I

    const/4 v2, 0x4

    .line 66
    invoke-static {v1, v2}, Lcom/google/e/a/b;->a(II)I

    move-result v1

    sput v1, Lcom/google/e/a/b;->b:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    .line 68
    invoke-static {v1, v2}, Lcom/google/e/a/b;->a(II)I

    move-result v3

    sput v3, Lcom/google/e/a/b;->c:I

    .line 70
    invoke-static {v0, v1}, Lcom/google/e/a/b;->a(II)I

    move-result v0

    sput v0, Lcom/google/e/a/b;->d:I

    .line 90
    new-array v0, v2, [I

    sput-object v0, Lcom/google/e/a/b;->e:[I

    .line 91
    new-array v0, v2, [J

    sput-object v0, Lcom/google/e/a/b;->f:[J

    .line 92
    new-array v0, v2, [F

    sput-object v0, Lcom/google/e/a/b;->g:[F

    .line 93
    new-array v0, v2, [D

    sput-object v0, Lcom/google/e/a/b;->h:[D

    .line 94
    new-array v0, v2, [Z

    sput-object v0, Lcom/google/e/a/b;->i:[Z

    .line 95
    new-array v0, v2, [Ljava/lang/String;

    sput-object v0, Lcom/google/e/a/b;->j:[Ljava/lang/String;

    .line 96
    new-array v0, v2, [[B

    sput-object v0, Lcom/google/e/a/b;->k:[[B

    .line 97
    new-array v0, v2, [B

    sput-object v0, Lcom/google/e/a/b;->l:[B

    return-void
.end method

.method public static a(II)I
    .locals 0

    shl-int/lit8 p0, p0, 0x3

    or-int/2addr p0, p1

    return p0
.end method
