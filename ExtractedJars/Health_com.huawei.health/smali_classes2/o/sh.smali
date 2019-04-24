.class public Lo/sh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final d:I

.field private final e:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput p1, p0, Lo/sh;->d:I

    .line 26
    iput p2, p0, Lo/sh;->e:I

    .line 27
    return-void
.end method


# virtual methods
.method public final b()I
    .locals 1

    .line 30
    iget v0, p0, Lo/sh;->d:I

    return v0
.end method

.method public final d()I
    .locals 1

    .line 34
    iget v0, p0, Lo/sh;->e:I

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 44
    instance-of v0, p1, Lo/sh;

    if-nez v0, :cond_0

    .line 45
    const/4 v0, 0x0

    return v0

    .line 47
    :cond_0
    move-object v2, p1

    check-cast v2, Lo/sh;

    .line 48
    iget v0, p0, Lo/sh;->d:I

    iget v1, v2, Lo/sh;->d:I

    if-ne v0, v1, :cond_1

    iget v0, p0, Lo/sh;->e:I

    iget v1, v2, Lo/sh;->e:I

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 53
    iget v0, p0, Lo/sh;->d:I

    iget v1, p0, Lo/sh;->e:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 39
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lo/sh;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/sh;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
