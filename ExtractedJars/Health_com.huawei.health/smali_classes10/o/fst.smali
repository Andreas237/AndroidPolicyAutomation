.class public Lo/fst;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fst$d;
    }
.end annotation


# instance fields
.field private final c:[B

.field private final e:Lo/fst$d;


# direct methods
.method private constructor <init>(Lo/fst$d;[B)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lo/fst;->e:Lo/fst$d;

    .line 32
    iput-object p2, p0, Lo/fst;->c:[B

    .line 33
    return-void
.end method

.method public static a(Lo/fst$d;[B)Lo/fst;
    .locals 2

    .line 44
    if-nez p0, :cond_0

    .line 45
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "type must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 46
    :cond_0
    if-nez p1, :cond_1

    .line 47
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "name must not be null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 49
    :cond_1
    new-instance v0, Lo/fst;

    invoke-direct {v0, p0, p1}, Lo/fst;-><init>(Lo/fst$d;[B)V

    return-object v0
.end method


# virtual methods
.method public a()Lo/fst$d;
    .locals 1

    .line 84
    iget-object v0, p0, Lo/fst;->e:Lo/fst$d;

    return-object v0
.end method

.method public b()[B
    .locals 1

    .line 75
    iget-object v0, p0, Lo/fst;->c:[B

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 105
    if-ne p0, p1, :cond_0

    .line 106
    const/4 v0, 0x1

    return v0

    .line 108
    :cond_0
    if-nez p1, :cond_1

    .line 109
    const/4 v0, 0x0

    return v0

    .line 111
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    .line 112
    const/4 v0, 0x0

    return v0

    .line 114
    :cond_2
    move-object v2, p1

    check-cast v2, Lo/fst;

    .line 115
    iget-object v0, p0, Lo/fst;->c:[B

    iget-object v1, v2, Lo/fst;->c:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_3

    .line 116
    const/4 v0, 0x0

    return v0

    .line 118
    :cond_3
    iget-object v0, p0, Lo/fst;->e:Lo/fst$d;

    iget-object v1, v2, Lo/fst;->e:Lo/fst$d;

    if-eq v0, v1, :cond_4

    .line 119
    const/4 v0, 0x0

    return v0

    .line 121
    :cond_4
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 4

    .line 89
    const/16 v2, 0x1f

    .line 90
    const/4 v3, 0x1

    .line 91
    iget-object v0, p0, Lo/fst;->c:[B

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([B)I

    move-result v0

    add-int/lit8 v3, v0, 0x1f

    .line 92
    mul-int/lit8 v0, v3, 0x1f

    iget-object v1, p0, Lo/fst;->e:Lo/fst$d;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lo/fst;->e:Lo/fst$d;

    invoke-virtual {v1}, Lo/fst$d;->hashCode()I

    move-result v1

    :goto_0
    add-int v3, v0, v1

    .line 93
    return v3
.end method
