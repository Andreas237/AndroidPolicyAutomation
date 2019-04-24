.class public Lo/dwf;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:I

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:J

.field private f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private g:I

.field private h:I

.field private i:I

.field private k:D

.field private l:I

.field private n:I

.field private o:D


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dwf;->c:Ljava/util/Map;

    .line 49
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dwf;->f:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 96
    iget-wide v0, p0, Lo/dwf;->e:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    .line 116
    iput p1, p0, Lo/dwf;->b:I

    .line 117
    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 132
    iput-object p1, p0, Lo/dwf;->f:Ljava/util/Map;

    .line 133
    return-void
.end method

.method public b()J
    .locals 2

    .line 104
    iget-wide v0, p0, Lo/dwf;->a:J

    return-wide v0
.end method

.method public b(I)V
    .locals 0

    .line 124
    iput p1, p0, Lo/dwf;->h:I

    .line 125
    return-void
.end method

.method public c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 77
    iget-object v0, p0, Lo/dwf;->c:Ljava/util/Map;

    return-object v0
.end method

.method public c(D)V
    .locals 0

    .line 180
    iput-wide p1, p0, Lo/dwf;->o:D

    .line 181
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 148
    iput p1, p0, Lo/dwf;->i:I

    .line 149
    return-void
.end method

.method public d()I
    .locals 1

    .line 87
    iget v0, p0, Lo/dwf;->d:I

    return v0
.end method

.method public d(D)V
    .locals 0

    .line 172
    iput-wide p1, p0, Lo/dwf;->k:D

    .line 173
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 92
    iput p1, p0, Lo/dwf;->d:I

    .line 93
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 100
    iput-wide p1, p0, Lo/dwf;->e:J

    .line 101
    return-void
.end method

.method public d(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 82
    iput-object p1, p0, Lo/dwf;->c:Ljava/util/Map;

    .line 83
    return-void
.end method

.method public e()I
    .locals 1

    .line 112
    iget v0, p0, Lo/dwf;->b:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 140
    iput p1, p0, Lo/dwf;->g:I

    .line 141
    return-void
.end method

.method public e(J)V
    .locals 0

    .line 108
    iput-wide p1, p0, Lo/dwf;->a:J

    .line 109
    return-void
.end method

.method public f()I
    .locals 1

    .line 144
    iget v0, p0, Lo/dwf;->i:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 120
    iget v0, p0, Lo/dwf;->h:I

    return v0
.end method

.method public h()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 128
    iget-object v0, p0, Lo/dwf;->f:Ljava/util/Map;

    return-object v0
.end method

.method public i()I
    .locals 1

    .line 152
    iget v0, p0, Lo/dwf;->n:I

    return v0
.end method

.method public i(I)V
    .locals 0

    .line 156
    iput p1, p0, Lo/dwf;->n:I

    .line 157
    return-void
.end method

.method public k()I
    .locals 1

    .line 136
    iget v0, p0, Lo/dwf;->g:I

    return v0
.end method

.method public n()D
    .locals 2

    .line 176
    iget-wide v0, p0, Lo/dwf;->o:D

    return-wide v0
.end method

.method public p()D
    .locals 2

    .line 168
    iget-wide v0, p0, Lo/dwf;->k:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecentMonthRecordFromDB{firstDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwf;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwf;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oneMonthDis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwf;->c:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwf;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumDis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwf;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwf;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", disBeatPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwf;->k:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", oneMonthSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwf;->f:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", avgSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwf;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwf;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwf;->n:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepBeatPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwf;->o:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataResouce="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwf;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
