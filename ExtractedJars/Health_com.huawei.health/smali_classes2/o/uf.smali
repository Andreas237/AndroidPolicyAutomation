.class abstract Lo/uf;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/uf$g;,
        Lo/uf$f;,
        Lo/uf$h;,
        Lo/uf$d;,
        Lo/uf$c;,
        Lo/uf$b;,
        Lo/uf$a;,
        Lo/uf$e;
    }
.end annotation


# static fields
.field private static final a:[Lo/uf;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 37
    const/16 v0, 0x8

    new-array v0, v0, [Lo/uf;

    new-instance v1, Lo/uf$e;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/uf$e;-><init>(Lo/uf$2;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    new-instance v1, Lo/uf$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/uf$a;-><init>(Lo/uf$2;)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-instance v1, Lo/uf$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/uf$b;-><init>(Lo/uf$2;)V

    const/4 v2, 0x2

    aput-object v1, v0, v2

    new-instance v1, Lo/uf$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/uf$c;-><init>(Lo/uf$2;)V

    const/4 v2, 0x3

    aput-object v1, v0, v2

    new-instance v1, Lo/uf$d;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/uf$d;-><init>(Lo/uf$2;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    new-instance v1, Lo/uf$h;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/uf$h;-><init>(Lo/uf$2;)V

    const/4 v2, 0x5

    aput-object v1, v0, v2

    new-instance v1, Lo/uf$f;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/uf$f;-><init>(Lo/uf$2;)V

    const/4 v2, 0x6

    aput-object v1, v0, v2

    new-instance v1, Lo/uf$g;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lo/uf$g;-><init>(Lo/uf$2;)V

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lo/uf;->a:[Lo/uf;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    return-void
.end method

.method synthetic constructor <init>(Lo/uf$2;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Lo/uf;-><init>()V

    return-void
.end method

.method static e(I)Lo/uf;
    .locals 1

    .line 76
    if-ltz p0, :cond_0

    const/4 v0, 0x7

    if-le p0, v0, :cond_1

    .line 77
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    .line 79
    :cond_1
    sget-object v0, Lo/uf;->a:[Lo/uf;

    aget-object v0, v0, p0

    return-object v0
.end method


# virtual methods
.method final b(Lo/qr;I)V
    .locals 3

    .line 59
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    .line 60
    const/4 v2, 0x0

    :goto_1
    if-ge v2, p2, :cond_1

    .line 61
    invoke-virtual {p0, v1, v2}, Lo/uf;->c(II)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 62
    invoke-virtual {p1, v2, v1}, Lo/qr;->d(II)V

    .line 60
    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 59
    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 66
    :cond_2
    return-void
.end method

.method abstract c(II)Z
.end method
