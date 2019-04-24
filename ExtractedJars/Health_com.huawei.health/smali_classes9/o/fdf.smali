.class public Lo/fdf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:J

.field public b:D

.field public c:J

.field public d:D

.field public e:D

.field private f:D

.field private g:D

.field private h:D

.field private i:D

.field private k:D

.field private l:D

.field private m:D

.field private n:I

.field private o:D

.field private p:D


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fdf;->a:J

    .line 14
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fdf;->c:J

    .line 16
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fdf;->e:D

    .line 17
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fdf;->d:D

    .line 18
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/fdf;->b:D

    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 67
    iget-wide v0, p0, Lo/fdf;->b:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public a(D)V
    .locals 0

    .line 104
    iput-wide p1, p0, Lo/fdf;->g:D

    .line 105
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 184
    iput p1, p0, Lo/fdf;->n:I

    .line 185
    return-void
.end method

.method public b()J
    .locals 2

    .line 56
    iget-wide v0, p0, Lo/fdf;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public b(D)V
    .locals 0

    .line 128
    iput-wide p1, p0, Lo/fdf;->h:D

    .line 129
    return-void
.end method

.method public c()D
    .locals 2

    .line 59
    iget-wide v0, p0, Lo/fdf;->e:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public c(D)V
    .locals 0

    .line 112
    iput-wide p1, p0, Lo/fdf;->f:D

    .line 113
    return-void
.end method

.method public d()D
    .locals 2

    .line 63
    iget-wide v0, p0, Lo/fdf;->d:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lo/fed;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method public d(D)V
    .locals 0

    .line 136
    iput-wide p1, p0, Lo/fdf;->k:D

    .line 137
    return-void
.end method

.method public e(D)V
    .locals 0

    .line 120
    iput-wide p1, p0, Lo/fdf;->i:D

    .line 121
    return-void
.end method

.method public f(D)V
    .locals 0

    .line 144
    iput-wide p1, p0, Lo/fdf;->l:D

    .line 145
    return-void
.end method

.method public h(D)V
    .locals 0

    .line 168
    iput-wide p1, p0, Lo/fdf;->o:D

    .line 169
    return-void
.end method

.method public i(D)V
    .locals 0

    .line 152
    iput-wide p1, p0, Lo/fdf;->p:D

    .line 153
    return-void
.end method

.method public k(D)V
    .locals 0

    .line 160
    iput-wide p1, p0, Lo/fdf;->m:D

    .line 161
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HealthData-->[time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/fdf;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; temeextra="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/fdf;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; value1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/fdf;->e:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; value2="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/fdf;->d:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "; value3="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/fdf;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
