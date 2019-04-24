.class public Lo/dvh;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Ljava/lang/String;

.field private c:J

.field private d:I

.field private e:D


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 11
    const/4 v0, 0x1

    iput v0, p0, Lo/dvh;->a:I

    .line 21
    const-string v0, ""

    iput-object v0, p0, Lo/dvh;->b:Ljava/lang/String;

    .line 39
    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 66
    iget-wide v0, p0, Lo/dvh;->e:D

    return-wide v0
.end method

.method public b()J
    .locals 2

    .line 74
    iget-wide v0, p0, Lo/dvh;->c:J

    return-wide v0
.end method

.method public b(D)V
    .locals 0

    .line 70
    iput-wide p1, p0, Lo/dvh;->e:D

    .line 71
    return-void
.end method

.method public c()I
    .locals 1

    .line 50
    iget v0, p0, Lo/dvh;->d:I

    return v0
.end method

.method public c(J)V
    .locals 0

    .line 78
    iput-wide p1, p0, Lo/dvh;->c:J

    .line 79
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 62
    iput-object p1, p0, Lo/dvh;->b:Ljava/lang/String;

    .line 63
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 58
    iget-object v0, p0, Lo/dvh;->b:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 54
    iput p1, p0, Lo/dvh;->d:I

    .line 55
    return-void
.end method

.method public e()I
    .locals 1

    .line 42
    iget v0, p0, Lo/dvh;->a:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 46
    iput p1, p0, Lo/dvh;->a:I

    .line 47
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AchieveInfo{huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 84
    invoke-super {p0}, Lo/dvf;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvh;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userPoint="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvh;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", medals=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dvh;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userReachingStandardDays="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dvh;->e:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", syncTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dvh;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 83
    return-object v0
.end method
