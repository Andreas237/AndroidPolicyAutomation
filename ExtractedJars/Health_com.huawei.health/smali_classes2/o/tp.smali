.class final Lo/tp;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:I

.field private c:I

.field private final d:I

.field private final e:I


# direct methods
.method constructor <init>(IIII)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, -0x1

    iput v0, p0, Lo/tp;->c:I

    .line 33
    iput p1, p0, Lo/tp;->e:I

    .line 34
    iput p2, p0, Lo/tp;->b:I

    .line 35
    iput p3, p0, Lo/tp;->a:I

    .line 36
    iput p4, p0, Lo/tp;->d:I

    .line 37
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .line 56
    iget v0, p0, Lo/tp;->e:I

    return v0
.end method

.method b()I
    .locals 2

    .line 52
    iget v0, p0, Lo/tp;->b:I

    iget v1, p0, Lo/tp;->e:I

    sub-int/2addr v0, v1

    return v0
.end method

.method b(I)V
    .locals 0

    .line 76
    iput p1, p0, Lo/tp;->c:I

    .line 77
    return-void
.end method

.method c()Z
    .locals 1

    .line 40
    iget v0, p0, Lo/tp;->c:I

    invoke-virtual {p0, v0}, Lo/tp;->e(I)Z

    move-result v0

    return v0
.end method

.method d()I
    .locals 1

    .line 60
    iget v0, p0, Lo/tp;->b:I

    return v0
.end method

.method e()V
    .locals 3

    .line 48
    iget v0, p0, Lo/tp;->d:I

    div-int/lit8 v0, v0, 0x1e

    mul-int/lit8 v0, v0, 0x3

    iget v1, p0, Lo/tp;->a:I

    div-int/lit8 v1, v1, 0x3

    add-int/2addr v0, v1

    iput v0, p0, Lo/tp;->c:I

    .line 49
    return-void
.end method

.method e(I)Z
    .locals 3

    .line 44
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    iget v0, p0, Lo/tp;->a:I

    rem-int/lit8 v1, p1, 0x3

    mul-int/lit8 v1, v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method g()I
    .locals 1

    .line 72
    iget v0, p0, Lo/tp;->c:I

    return v0
.end method

.method h()I
    .locals 1

    .line 68
    iget v0, p0, Lo/tp;->d:I

    return v0
.end method

.method i()I
    .locals 1

    .line 64
    iget v0, p0, Lo/tp;->a:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 81
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lo/tp;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "|"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/tp;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
