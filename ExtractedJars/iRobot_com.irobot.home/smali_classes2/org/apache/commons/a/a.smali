.class public Lorg/apache/commons/a/a;
.super Ljava/lang/Object;


# static fields
.field public static final a:[Ljava/lang/Object;

.field public static final b:[Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static final c:[Ljava/lang/String;

.field public static final d:[J

.field public static final e:[Ljava/lang/Long;

.field public static final f:[I

.field public static final g:[Ljava/lang/Integer;

.field public static final h:[S

.field public static final i:[Ljava/lang/Short;

.field public static final j:[B

.field public static final k:[Ljava/lang/Byte;

.field public static final l:[D

.field public static final m:[Ljava/lang/Double;

.field public static final n:[F

.field public static final o:[Ljava/lang/Float;

.field public static final p:[Z

.field public static final q:[Ljava/lang/Boolean;

.field public static final r:[C

.field public static final s:[Ljava/lang/Character;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Ljava/lang/Object;

    sput-object v1, Lorg/apache/commons/a/a;->a:[Ljava/lang/Object;

    new-array v1, v0, [Ljava/lang/Class;

    sput-object v1, Lorg/apache/commons/a/a;->b:[Ljava/lang/Class;

    new-array v1, v0, [Ljava/lang/String;

    sput-object v1, Lorg/apache/commons/a/a;->c:[Ljava/lang/String;

    new-array v1, v0, [J

    sput-object v1, Lorg/apache/commons/a/a;->d:[J

    new-array v1, v0, [Ljava/lang/Long;

    sput-object v1, Lorg/apache/commons/a/a;->e:[Ljava/lang/Long;

    new-array v1, v0, [I

    sput-object v1, Lorg/apache/commons/a/a;->f:[I

    new-array v1, v0, [Ljava/lang/Integer;

    sput-object v1, Lorg/apache/commons/a/a;->g:[Ljava/lang/Integer;

    new-array v1, v0, [S

    sput-object v1, Lorg/apache/commons/a/a;->h:[S

    new-array v1, v0, [Ljava/lang/Short;

    sput-object v1, Lorg/apache/commons/a/a;->i:[Ljava/lang/Short;

    new-array v1, v0, [B

    sput-object v1, Lorg/apache/commons/a/a;->j:[B

    new-array v1, v0, [Ljava/lang/Byte;

    sput-object v1, Lorg/apache/commons/a/a;->k:[Ljava/lang/Byte;

    new-array v1, v0, [D

    sput-object v1, Lorg/apache/commons/a/a;->l:[D

    new-array v1, v0, [Ljava/lang/Double;

    sput-object v1, Lorg/apache/commons/a/a;->m:[Ljava/lang/Double;

    new-array v1, v0, [F

    sput-object v1, Lorg/apache/commons/a/a;->n:[F

    new-array v1, v0, [Ljava/lang/Float;

    sput-object v1, Lorg/apache/commons/a/a;->o:[Ljava/lang/Float;

    new-array v1, v0, [Z

    sput-object v1, Lorg/apache/commons/a/a;->p:[Z

    new-array v1, v0, [Ljava/lang/Boolean;

    sput-object v1, Lorg/apache/commons/a/a;->q:[Ljava/lang/Boolean;

    new-array v1, v0, [C

    sput-object v1, Lorg/apache/commons/a/a;->r:[C

    new-array v0, v0, [Ljava/lang/Character;

    sput-object v0, Lorg/apache/commons/a/a;->s:[Ljava/lang/Character;

    return-void
.end method

.method public static a([C)Z
    .locals 0

    if-eqz p0, :cond_1

    array-length p0, p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static a([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0
.end method
