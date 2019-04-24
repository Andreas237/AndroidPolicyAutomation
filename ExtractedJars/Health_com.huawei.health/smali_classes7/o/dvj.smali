.class public Lo/dvj;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private b:J

.field private c:I

.field private d:I

.field private e:D


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    const/16 v0, 0xe

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 30
    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 49
    iget-wide v0, p0, Lo/dvj;->e:D

    return-wide v0
.end method

.method public b()I
    .locals 1

    .line 41
    iget v0, p0, Lo/dvj;->d:I

    return v0
.end method

.method public b(D)V
    .locals 0

    .line 53
    iput-wide p1, p0, Lo/dvj;->e:D

    .line 54
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 45
    iput p1, p0, Lo/dvj;->d:I

    .line 46
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/dvj;->c:I

    .line 38
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 61
    iput-wide p1, p0, Lo/dvj;->b:J

    .line 62
    return-void
.end method

.method public d()I
    .locals 1

    .line 33
    iget v0, p0, Lo/dvj;->c:I

    return v0
.end method

.method public e()J
    .locals 2

    .line 57
    iget-wide v0, p0, Lo/dvj;->b:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 65
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AchieveUserLevelInfo{userLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvj;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userExperience="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvj;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userReachDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dvj;->e:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", syncTimeStamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dvj;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
