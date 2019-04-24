.class public Lo/dwj;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:D

.field private b:I

.field private c:D

.field private d:J

.field private e:J

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:D

.field private k:Ljava/lang/String;

.field private m:D


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 67
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 68
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 72
    iget-wide v0, p0, Lo/dwj;->d:J

    return-wide v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lo/dwj;->k:Ljava/lang/String;

    .line 158
    return-void
.end method

.method public b()J
    .locals 2

    .line 80
    iget-wide v0, p0, Lo/dwj;->e:J

    return-wide v0
.end method

.method public b(D)V
    .locals 0

    .line 100
    iput-wide p1, p0, Lo/dwj;->c:D

    .line 101
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 92
    iput p1, p0, Lo/dwj;->b:I

    .line 93
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 84
    iput-wide p1, p0, Lo/dwj;->e:J

    .line 85
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lo/dwj;->f:Ljava/lang/String;

    .line 150
    return-void
.end method

.method public c()I
    .locals 1

    .line 88
    iget v0, p0, Lo/dwj;->b:I

    return v0
.end method

.method public c(D)V
    .locals 0

    .line 124
    iput-wide p1, p0, Lo/dwj;->m:D

    .line 125
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 76
    iput-wide p1, p0, Lo/dwj;->d:J

    .line 77
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 141
    iput-object p1, p0, Lo/dwj;->h:Ljava/lang/String;

    .line 142
    return-void
.end method

.method public d()D
    .locals 2

    .line 96
    iget-wide v0, p0, Lo/dwj;->c:D

    return-wide v0
.end method

.method public d(D)V
    .locals 0

    .line 116
    iput-wide p1, p0, Lo/dwj;->i:D

    .line 117
    return-void
.end method

.method public e()D
    .locals 2

    .line 104
    iget-wide v0, p0, Lo/dwj;->a:D

    return-wide v0
.end method

.method public e(D)V
    .locals 0

    .line 108
    iput-wide p1, p0, Lo/dwj;->a:D

    .line 109
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 0

    .line 133
    iput-object p1, p0, Lo/dwj;->g:Ljava/lang/String;

    .line 134
    return-void
.end method

.method public f()D
    .locals 2

    .line 120
    iget-wide v0, p0, Lo/dwj;->m:D

    return-wide v0
.end method

.method public g()D
    .locals 2

    .line 112
    iget-wide v0, p0, Lo/dwj;->i:D

    return-wide v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Lo/dwj;->h:Ljava/lang/String;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lo/dwj;->f:Ljava/lang/String;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 129
    iget-object v0, p0, Lo/dwj;->g:Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/lang/String;
    .locals 1

    .line 153
    iget-object v0, p0, Lo/dwj;->k:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TotalRecord{huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 163
    invoke-super {p0}, Lo/dvf;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", startDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwj;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwj;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", days="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwj;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwj;->c:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwj;->a:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", calorie="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwj;->i:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepsRanking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwj;->m:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 162
    return-object v0
.end method
