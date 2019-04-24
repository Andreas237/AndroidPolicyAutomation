.class public Lo/dwd;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:D

.field private b:D

.field private c:D

.field private d:I

.field private e:D

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:I

.field private i:Ljava/lang/String;

.field private k:I

.field private n:J

.field private o:J

.field private p:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 48
    const-string v0, ""

    iput-object v0, p0, Lo/dwd;->f:Ljava/lang/String;

    .line 53
    const-string v0, ""

    iput-object v0, p0, Lo/dwd;->i:Ljava/lang/String;

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lo/dwd;->g:Ljava/lang/String;

    .line 75
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 94
    iget v0, p0, Lo/dwd;->d:I

    return v0
.end method

.method public a(D)V
    .locals 0

    .line 90
    iput-wide p1, p0, Lo/dwd;->c:D

    .line 91
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 178
    iput p1, p0, Lo/dwd;->p:I

    .line 179
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 146
    iput-object p1, p0, Lo/dwd;->i:Ljava/lang/String;

    .line 147
    return-void
.end method

.method public b()D
    .locals 2

    .line 110
    iget-wide v0, p0, Lo/dwd;->a:D

    return-wide v0
.end method

.method public b(D)V
    .locals 0

    .line 82
    iput-wide p1, p0, Lo/dwd;->b:D

    .line 83
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 154
    iput-object p1, p0, Lo/dwd;->g:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public c()D
    .locals 2

    .line 102
    iget-wide v0, p0, Lo/dwd;->e:D

    return-wide v0
.end method

.method public c(I)V
    .locals 0

    .line 130
    iput p1, p0, Lo/dwd;->h:I

    .line 131
    return-void
.end method

.method public d()D
    .locals 2

    .line 86
    iget-wide v0, p0, Lo/dwd;->c:D

    return-wide v0
.end method

.method public d(D)V
    .locals 0

    .line 106
    iput-wide p1, p0, Lo/dwd;->e:D

    .line 107
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 122
    iput p1, p0, Lo/dwd;->k:I

    .line 123
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 162
    iput-wide p1, p0, Lo/dwd;->o:J

    .line 163
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lo/dwd;->f:Ljava/lang/String;

    .line 139
    return-void
.end method

.method public e()D
    .locals 2

    .line 78
    iget-wide v0, p0, Lo/dwd;->b:D

    return-wide v0
.end method

.method public e(D)V
    .locals 0

    .line 114
    iput-wide p1, p0, Lo/dwd;->a:D

    .line 115
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 98
    iput p1, p0, Lo/dwd;->d:I

    .line 99
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 170
    iput-wide p1, p0, Lo/dwd;->n:J

    .line 171
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 150
    iget-object v0, p0, Lo/dwd;->g:Ljava/lang/String;

    return-object v0
.end method

.method public g()I
    .locals 1

    .line 126
    iget v0, p0, Lo/dwd;->h:I

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 142
    iget-object v0, p0, Lo/dwd;->i:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 134
    iget-object v0, p0, Lo/dwd;->f:Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1

    .line 118
    iget v0, p0, Lo/dwd;->k:I

    return v0
.end method

.method public l()I
    .locals 1

    .line 174
    iget v0, p0, Lo/dwd;->p:I

    return v0
.end method

.method public n()J
    .locals 2

    .line 166
    iget-wide v0, p0, Lo/dwd;->n:J

    return-wide v0
.end method

.method public o()J
    .locals 2

    .line 158
    iget-wide v0, p0, Lo/dwd;->o:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecentMonthRecord{huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 184
    invoke-super {p0}, Lo/dvf;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", firstDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwd;->o:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwd;->n:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwd;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwd;->c:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reportNo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwd;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distanceRanking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwd;->e:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepsRanking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwd;->a:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cacaNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwd;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwd;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", comments1=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwd;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", comments2=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwd;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", medals=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwd;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 183
    return-object v0
.end method
