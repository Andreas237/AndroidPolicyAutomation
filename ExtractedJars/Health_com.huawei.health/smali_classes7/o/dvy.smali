.class public Lo/dvy;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 27
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/dvy;->e:Ljava/lang/String;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 106
    iput p1, p0, Lo/dvy;->g:I

    .line 107
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 90
    iput-wide p1, p0, Lo/dvy;->k:J

    .line 91
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lo/dvy;->i:Ljava/lang/String;

    .line 75
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/dvy;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 66
    iput p1, p0, Lo/dvy;->b:I

    .line 67
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 42
    iput-object p1, p0, Lo/dvy;->c:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public c()I
    .locals 1

    .line 62
    iget v0, p0, Lo/dvy;->b:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 50
    iput p1, p0, Lo/dvy;->a:I

    .line 51
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 34
    iput-object p1, p0, Lo/dvy;->e:Ljava/lang/String;

    .line 35
    return-void
.end method

.method public d()I
    .locals 1

    .line 46
    iget v0, p0, Lo/dvy;->a:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 82
    iput p1, p0, Lo/dvy;->f:I

    .line 83
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lo/dvy;->h:Ljava/lang/String;

    .line 99
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 54
    iget-object v0, p0, Lo/dvy;->d:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/dvy;->d:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public f()I
    .locals 1

    .line 78
    iget v0, p0, Lo/dvy;->f:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 102
    iget v0, p0, Lo/dvy;->g:I

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 94
    iget-object v0, p0, Lo/dvy;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/dvy;->i:Ljava/lang/String;

    return-object v0
.end method

.method public k()J
    .locals 2

    .line 86
    iget-wide v0, p0, Lo/dvy;->k:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 110
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MedalLocation{medalName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dvy;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", medalID=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dvy;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firstTabPriority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvy;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firstTabDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dvy;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", secondTabPriority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvy;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", secondTabDesc=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dvy;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", medalWeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvy;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", medalGainedTime=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dvy;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", gainedCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvy;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dvy;->k:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
