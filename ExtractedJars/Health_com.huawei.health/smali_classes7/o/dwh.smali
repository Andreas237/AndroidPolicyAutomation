.class public Lo/dwh;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:D

.field private b:D

.field private c:D

.field private d:I

.field private e:D

.field private f:I

.field private g:I

.field private h:Ljava/lang/String;

.field private i:Ljava/lang/String;

.field private k:Ljava/lang/String;

.field private l:J

.field private m:J

.field private n:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 74
    const/4 v0, 0x3

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 48
    const-string v0, ""

    iput-object v0, p0, Lo/dwh;->h:Ljava/lang/String;

    .line 53
    const-string v0, ""

    iput-object v0, p0, Lo/dwh;->i:Ljava/lang/String;

    .line 58
    const-string v0, ""

    iput-object v0, p0, Lo/dwh;->k:Ljava/lang/String;

    .line 75
    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 90
    iget-wide v0, p0, Lo/dwh;->e:D

    return-wide v0
.end method

.method public a(D)V
    .locals 0

    .line 122
    iput-wide p1, p0, Lo/dwh;->c:D

    .line 123
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 177
    iput p1, p0, Lo/dwh;->n:I

    .line 178
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lo/dwh;->k:Ljava/lang/String;

    .line 154
    return-void
.end method

.method public b()I
    .locals 1

    .line 78
    iget v0, p0, Lo/dwh;->d:I

    return v0
.end method

.method public b(D)V
    .locals 0

    .line 86
    iput-wide p1, p0, Lo/dwh;->e:D

    .line 87
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 129
    iput p1, p0, Lo/dwh;->g:I

    .line 130
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 137
    iput-object p1, p0, Lo/dwh;->h:Ljava/lang/String;

    .line 138
    return-void
.end method

.method public c()D
    .locals 2

    .line 102
    iget-wide v0, p0, Lo/dwh;->a:D

    return-wide v0
.end method

.method public c(D)V
    .locals 0

    .line 106
    iput-wide p1, p0, Lo/dwh;->a:D

    .line 107
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 82
    iput p1, p0, Lo/dwh;->d:I

    .line 83
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 161
    iput-wide p1, p0, Lo/dwh;->l:J

    .line 162
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lo/dwh;->i:Ljava/lang/String;

    .line 150
    return-void
.end method

.method public d()D
    .locals 2

    .line 94
    iget-wide v0, p0, Lo/dwh;->b:D

    return-wide v0
.end method

.method public d(I)V
    .locals 0

    .line 114
    iput p1, p0, Lo/dwh;->f:I

    .line 115
    return-void
.end method

.method public e()I
    .locals 1

    .line 110
    iget v0, p0, Lo/dwh;->f:I

    return v0
.end method

.method public e(D)V
    .locals 0

    .line 98
    iput-wide p1, p0, Lo/dwh;->b:D

    .line 99
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 165
    iput-wide p1, p0, Lo/dwh;->m:J

    .line 166
    return-void
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lo/dwh;->h:Ljava/lang/String;

    return-object v0
.end method

.method public g()Ljava/lang/String;
    .locals 1

    .line 145
    iget-object v0, p0, Lo/dwh;->k:Ljava/lang/String;

    return-object v0
.end method

.method public h()D
    .locals 2

    .line 118
    iget-wide v0, p0, Lo/dwh;->c:D

    return-wide v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    .line 141
    iget-object v0, p0, Lo/dwh;->i:Ljava/lang/String;

    return-object v0
.end method

.method public k()I
    .locals 1

    .line 125
    iget v0, p0, Lo/dwh;->g:I

    return v0
.end method

.method public l()J
    .locals 2

    .line 169
    iget-wide v0, p0, Lo/dwh;->m:J

    return-wide v0
.end method

.method public n()I
    .locals 1

    .line 173
    iget v0, p0, Lo/dwh;->n:I

    return v0
.end method

.method public o()J
    .locals 2

    .line 157
    iget-wide v0, p0, Lo/dwh;->l:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 182
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecentWeekRecord{huid=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 183
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

    iget-wide v1, p0, Lo/dwh;->l:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwh;->m:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", steps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwh;->c:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwh;->e:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reportNo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwh;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", distanceRanking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwh;->a:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepsRanking="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwh;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", cacaNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwh;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minReportNo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwh;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", price="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwh;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userMedals=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwh;->h:Ljava/lang/String;

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

    .line 182
    return-object v0
.end method
