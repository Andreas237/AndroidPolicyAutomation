.class public Lo/dve;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;

.field private d:J

.field private e:I

.field private f:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    const/16 v0, 0x10

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 15
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/dve;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()I
    .locals 1

    .line 60
    iget v0, p0, Lo/dve;->a:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 64
    iput p1, p0, Lo/dve;->a:I

    .line 65
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 72
    iput-wide p1, p0, Lo/dve;->d:J

    .line 73
    return-void
.end method

.method public c()I
    .locals 1

    .line 52
    iget v0, p0, Lo/dve;->e:I

    return v0
.end method

.method public d()I
    .locals 1

    .line 76
    iget v0, p0, Lo/dve;->b:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 80
    iput p1, p0, Lo/dve;->b:I

    .line 81
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lo/dve;->c:Ljava/lang/String;

    .line 49
    return-void
.end method

.method public e()J
    .locals 2

    .line 68
    iget-wide v0, p0, Lo/dve;->d:J

    return-wide v0
.end method

.method public e(I)V
    .locals 0

    .line 56
    iput p1, p0, Lo/dve;->e:I

    .line 57
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 88
    iput-wide p1, p0, Lo/dve;->f:J

    .line 89
    return-void
.end method

.method public i()J
    .locals 2

    .line 84
    iget-wide v0, p0, Lo/dve;->f:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 92
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AchieveLevelEventInfo{taskId=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dve;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", rewardExperience="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dve;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", taskCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dve;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastModifyTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dve;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", taskSumCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dve;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", SyncTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dve;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
