.class public Lo/dyv;
.super Lo/dyy;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:D

.field private c:J

.field private d:J

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lo/dyy;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 53
    iget v0, p0, Lo/dyv;->e:I

    return v0
.end method

.method public a(J)V
    .locals 0

    .line 73
    iput-wide p1, p0, Lo/dyv;->d:J

    .line 74
    return-void
.end method

.method public b()J
    .locals 2

    .line 61
    iget-wide v0, p0, Lo/dyv;->a:J

    return-wide v0
.end method

.method public b(J)V
    .locals 0

    .line 49
    iput-wide p1, p0, Lo/dyv;->c:J

    .line 50
    return-void
.end method

.method public c()D
    .locals 2

    .line 37
    iget-wide v0, p0, Lo/dyv;->b:D

    return-wide v0
.end method

.method public c(I)V
    .locals 0

    .line 57
    iput p1, p0, Lo/dyv;->e:I

    .line 58
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 65
    iput-wide p1, p0, Lo/dyv;->a:J

    .line 66
    return-void
.end method

.method public d()J
    .locals 2

    .line 45
    iget-wide v0, p0, Lo/dyv;->c:J

    return-wide v0
.end method

.method public d(D)V
    .locals 0

    .line 41
    iput-wide p1, p0, Lo/dyv;->b:D

    .line 42
    return-void
.end method

.method public e()J
    .locals 2

    .line 69
    iget-wide v0, p0, Lo/dyv;->d:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BestMotionPace{value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dyv;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dyv;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", source="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dyv;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", deviceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dyv;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
