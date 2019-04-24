.class public Lo/dwg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:J

.field private c:J

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private e:I

.field private f:I

.field private g:I

.field private h:D

.field private i:I

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation
.end field

.field private n:D

.field private o:I

.field private p:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dwg;->d:Ljava/util/Map;

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/dwg;->k:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 98
    iget-wide v0, p0, Lo/dwg;->c:J

    return-wide v0
.end method

.method public a(D)V
    .locals 0

    .line 182
    iput-wide p1, p0, Lo/dwg;->n:D

    .line 183
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 142
    iput p1, p0, Lo/dwg;->f:I

    .line 143
    return-void
.end method

.method public b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 79
    iget-object v0, p0, Lo/dwg;->d:Ljava/util/Map;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 150
    iput p1, p0, Lo/dwg;->i:I

    .line 151
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 110
    iput-wide p1, p0, Lo/dwg;->b:J

    .line 111
    return-void
.end method

.method public b(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 84
    iput-object p1, p0, Lo/dwg;->d:Ljava/util/Map;

    .line 85
    return-void
.end method

.method public c()I
    .locals 1

    .line 114
    iget v0, p0, Lo/dwg;->a:I

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 94
    iput p1, p0, Lo/dwg;->e:I

    .line 95
    return-void
.end method

.method public c(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 134
    iput-object p1, p0, Lo/dwg;->k:Ljava/util/Map;

    .line 135
    return-void
.end method

.method public d()I
    .locals 1

    .line 89
    iget v0, p0, Lo/dwg;->e:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 118
    iput p1, p0, Lo/dwg;->a:I

    .line 119
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 102
    iput-wide p1, p0, Lo/dwg;->c:J

    .line 103
    return-void
.end method

.method public e()J
    .locals 2

    .line 106
    iget-wide v0, p0, Lo/dwg;->b:J

    return-wide v0
.end method

.method public e(D)V
    .locals 0

    .line 174
    iput-wide p1, p0, Lo/dwg;->h:D

    .line 175
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 126
    iput p1, p0, Lo/dwg;->g:I

    .line 127
    return-void
.end method

.method public f()I
    .locals 1

    .line 146
    iget v0, p0, Lo/dwg;->i:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 138
    iget v0, p0, Lo/dwg;->f:I

    return v0
.end method

.method public g(I)V
    .locals 0

    .line 158
    iput p1, p0, Lo/dwg;->p:I

    .line 159
    return-void
.end method

.method public h()I
    .locals 1

    .line 122
    iget v0, p0, Lo/dwg;->g:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 154
    iget v0, p0, Lo/dwg;->p:I

    return v0
.end method

.method public k()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/Long;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 130
    iget-object v0, p0, Lo/dwg;->k:Ljava/util/Map;

    return-object v0
.end method

.method public m()D
    .locals 2

    .line 170
    iget-wide v0, p0, Lo/dwg;->h:D

    return-wide v0
.end method

.method public n()D
    .locals 2

    .line 178
    iget-wide v0, p0, Lo/dwg;->n:D

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 187
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecentWeekRecordFromDB{monday="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwg;->c:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sunDay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwg;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sevenDayDis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwg;->d:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwg;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumDis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwg;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwg;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", disBeatPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwg;->h:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sevenDaySteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwg;->k:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", avgSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwg;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwg;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sumSteps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwg;->p:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", stepBeatPercent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dwg;->n:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataResouce="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwg;->o:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
