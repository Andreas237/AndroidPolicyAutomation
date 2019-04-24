.class Lo/tr;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final c:[Lo/tp;

.field private final d:Lo/tq;


# direct methods
.method constructor <init>(Lo/tq;)V
    .locals 2

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    new-instance v0, Lo/tq;

    invoke-direct {v0, p1}, Lo/tq;-><init>(Lo/tq;)V

    iput-object v0, p0, Lo/tr;->d:Lo/tq;

    .line 33
    invoke-virtual {p1}, Lo/tq;->c()I

    move-result v0

    invoke-virtual {p1}, Lo/tq;->b()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [Lo/tp;

    iput-object v0, p0, Lo/tr;->c:[Lo/tp;

    .line 34
    return-void
.end method


# virtual methods
.method final a(I)Lo/tp;
    .locals 4

    .line 37
    invoke-virtual {p0, p1}, Lo/tr;->e(I)Lo/tp;

    move-result-object v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    return-object v1

    .line 41
    :cond_0
    const/4 v2, 0x1

    :goto_0
    const/4 v0, 0x5

    if-ge v2, v0, :cond_3

    .line 42
    invoke-virtual {p0, p1}, Lo/tr;->b(I)I

    move-result v0

    sub-int v3, v0, v2

    .line 43
    if-ltz v3, :cond_1

    .line 44
    iget-object v0, p0, Lo/tr;->c:[Lo/tp;

    aget-object v1, v0, v3

    .line 45
    if-eqz v1, :cond_1

    .line 46
    return-object v1

    .line 49
    :cond_1
    invoke-virtual {p0, p1}, Lo/tr;->b(I)I

    move-result v0

    add-int v3, v0, v2

    .line 50
    iget-object v0, p0, Lo/tr;->c:[Lo/tp;

    array-length v0, v0

    if-ge v3, v0, :cond_2

    .line 51
    iget-object v0, p0, Lo/tr;->c:[Lo/tp;

    aget-object v1, v0, v3

    .line 52
    if-eqz v1, :cond_2

    .line 53
    return-object v1

    .line 41
    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 57
    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method final a()Lo/tq;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/tr;->d:Lo/tq;

    return-object v0
.end method

.method final b(I)I
    .locals 1

    .line 61
    iget-object v0, p0, Lo/tr;->d:Lo/tq;

    invoke-virtual {v0}, Lo/tq;->b()I

    move-result v0

    sub-int v0, p1, v0

    return v0
.end method

.method final c(ILo/tp;)V
    .locals 2

    .line 65
    iget-object v0, p0, Lo/tr;->c:[Lo/tp;

    invoke-virtual {p0, p1}, Lo/tr;->b(I)I

    move-result v1

    aput-object p2, v0, v1

    .line 66
    return-void
.end method

.method final e(I)Lo/tp;
    .locals 2

    .line 69
    iget-object v0, p0, Lo/tr;->c:[Lo/tp;

    invoke-virtual {p0, p1}, Lo/tr;->b(I)I

    move-result v1

    aget-object v0, v0, v1

    return-object v0
.end method

.method final e()[Lo/tp;
    .locals 1

    .line 77
    iget-object v0, p0, Lo/tr;->c:[Lo/tp;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    .line 82
    new-instance v4, Ljava/util/Formatter;

    invoke-direct {v4}, Ljava/util/Formatter;-><init>()V

    .line 83
    const/4 v5, 0x0

    .line 84
    iget-object v6, p0, Lo/tr;->c:[Lo/tp;

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 85
    if-nez v9, :cond_0

    .line 86
    const-string v0, "%3d:    |   %n"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    move v2, v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 87
    goto :goto_1

    .line 89
    :cond_0
    const-string v0, "%3d: %3d|%3d%n"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    move v2, v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lo/tp;->g()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v9}, Lo/tp;->h()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v4, v0, v1}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 84
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 91
    :cond_1
    invoke-virtual {v4}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v6

    .line 92
    invoke-virtual {v4}, Ljava/util/Formatter;->close()V

    .line 93
    return-object v6
.end method
