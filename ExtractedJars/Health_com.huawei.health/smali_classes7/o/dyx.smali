.class public Lo/dyx;
.super Lo/dyy;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:J

.field private c:I

.field private d:J

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lo/dyy;-><init>()V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 44
    iget-wide v0, p0, Lo/dyx;->d:J

    return-wide v0
.end method

.method public a(J)V
    .locals 0

    .line 72
    iput-wide p1, p0, Lo/dyx;->e:J

    .line 73
    return-void
.end method

.method public b()I
    .locals 1

    .line 52
    iget v0, p0, Lo/dyx;->c:I

    return v0
.end method

.method public b(J)V
    .locals 0

    .line 48
    iput-wide p1, p0, Lo/dyx;->d:J

    .line 49
    return-void
.end method

.method public c()J
    .locals 2

    .line 36
    iget-wide v0, p0, Lo/dyx;->a:J

    return-wide v0
.end method

.method public c(J)V
    .locals 0

    .line 40
    iput-wide p1, p0, Lo/dyx;->a:J

    .line 41
    return-void
.end method

.method public d()J
    .locals 2

    .line 60
    iget-wide v0, p0, Lo/dyx;->b:J

    return-wide v0
.end method

.method public d(I)V
    .locals 0

    .line 56
    iput p1, p0, Lo/dyx;->c:I

    .line 57
    return-void
.end method

.method public e()J
    .locals 2

    .line 68
    iget-wide v0, p0, Lo/dyx;->e:J

    return-wide v0
.end method

.method public e(J)V
    .locals 0

    .line 64
    iput-wide p1, p0, Lo/dyx;->b:J

    .line 65
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 77
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BestMotion{value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dyx;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dyx;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dyx;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dyx;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
