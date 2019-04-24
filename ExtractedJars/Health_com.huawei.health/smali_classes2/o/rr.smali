.class public final Lo/rr;
.super Lo/sf;
.source "SourceFile"


# instance fields
.field private final c:[I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Lo/sf;-><init>()V

    .line 33
    const/4 v0, 0x4

    new-array v0, v0, [I

    iput-object v0, p0, Lo/rr;->c:[I

    .line 34
    return-void
.end method


# virtual methods
.method protected b(Lo/qm;[ILjava/lang/StringBuilder;)I
    .locals 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;
        }
    .end annotation

    .line 40
    iget-object v2, p0, Lo/rr;->c:[I

    .line 41
    const/4 v0, 0x0

    const/4 v1, 0x0

    aput v0, v2, v1

    .line 42
    const/4 v0, 0x0

    const/4 v1, 0x1

    aput v0, v2, v1

    .line 43
    const/4 v0, 0x0

    const/4 v1, 0x2

    aput v0, v2, v1

    .line 44
    const/4 v0, 0x0

    const/4 v1, 0x3

    aput v0, v2, v1

    .line 45
    invoke-virtual {p1}, Lo/qm;->d()I

    move-result v3

    .line 46
    const/4 v0, 0x1

    aget v4, p2, v0

    .line 48
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge v5, v0, :cond_1

    if-ge v4, v3, :cond_1

    .line 49
    sget-object v0, Lo/rr;->e:[[I

    invoke-static {p1, v2, v4, v0}, Lo/rr;->e(Lo/qm;[II[[I)I

    move-result v6

    .line 50
    add-int/lit8 v0, v6, 0x30

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    move-object v7, v2

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_0

    aget v10, v7, v9

    .line 52
    add-int/2addr v4, v10

    .line 51
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 48
    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 56
    :cond_1
    sget-object v0, Lo/rr;->d:[I

    const/4 v1, 0x1

    invoke-static {p1, v4, v1, v0}, Lo/rr;->d(Lo/qm;IZ[I)[I

    move-result-object v5

    .line 57
    const/4 v0, 0x1

    aget v4, v5, v0

    .line 59
    const/4 v6, 0x0

    :goto_2
    const/4 v0, 0x4

    if-ge v6, v0, :cond_3

    if-ge v4, v3, :cond_3

    .line 60
    sget-object v0, Lo/rr;->e:[[I

    invoke-static {p1, v2, v4, v0}, Lo/rr;->e(Lo/qm;[II[[I)I

    move-result v7

    .line 61
    add-int/lit8 v0, v7, 0x30

    int-to-char v0, v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 62
    move-object v8, v2

    array-length v9, v8

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v9, :cond_2

    aget v11, v8, v10

    .line 63
    add-int/2addr v4, v11

    .line 62
    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 59
    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 67
    :cond_3
    return v4
.end method

.method e()Lo/od;
    .locals 1

    .line 72
    sget-object v0, Lo/od;->g:Lo/od;

    return-object v0
.end method
