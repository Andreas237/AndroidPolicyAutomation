.class public Lo/cfg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private a:J

.field private b:F

.field private c:J

.field private d:I

.field private e:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 21
    iget-wide v0, p0, Lo/cfg;->a:J

    return-wide v0
.end method

.method public a(F)V
    .locals 0

    .line 41
    iput p1, p0, Lo/cfg;->b:F

    .line 42
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 33
    iput-wide p1, p0, Lo/cfg;->c:J

    .line 34
    return-void
.end method

.method public b()F
    .locals 1

    .line 45
    iget v0, p0, Lo/cfg;->e:F

    return v0
.end method

.method public c()F
    .locals 1

    .line 37
    iget v0, p0, Lo/cfg;->b:F

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 56
    iput p1, p0, Lo/cfg;->d:I

    .line 57
    return-void
.end method

.method public d()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lo/cfg;->c:J

    return-wide v0
.end method

.method public e()I
    .locals 1

    .line 53
    iget v0, p0, Lo/cfg;->d:I

    return v0
.end method

.method public e(F)V
    .locals 0

    .line 49
    iput p1, p0, Lo/cfg;->e:F

    .line 50
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 25
    iput-wide p1, p0, Lo/cfg;->a:J

    .line 26
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 59
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    iget-wide v0, p0, Lo/cfg;->a:J

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/cfg;->c:J

    .line 61
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfg;->b:F

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfg;->e:F

    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "#"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfg;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
