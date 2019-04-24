.class public Lo/dwl;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Long;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/Long;

.field private f:I

.field private g:I

.field private h:I

.field private i:I

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 27
    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 28
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Long;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/dwl;->a:Ljava/lang/Long;

    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 75
    iput p1, p0, Lo/dwl;->h:I

    .line 76
    return-void
.end method

.method public a(Ljava/lang/Long;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/dwl;->e:Ljava/lang/Long;

    .line 36
    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Lo/dwl;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 67
    iput p1, p0, Lo/dwl;->i:I

    .line 68
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 107
    iput-object p1, p0, Lo/dwl;->b:Ljava/lang/String;

    .line 108
    return-void
.end method

.method public c()Ljava/lang/Long;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/dwl;->e:Ljava/lang/Long;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 91
    iput p1, p0, Lo/dwl;->f:I

    .line 92
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lo/dwl;->d:Ljava/lang/String;

    .line 52
    return-void
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Lo/dwl;->d:Ljava/lang/String;

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 99
    iput p1, p0, Lo/dwl;->k:I

    .line 100
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 0

    .line 59
    iput-object p1, p0, Lo/dwl;->c:Ljava/lang/String;

    .line 60
    return-void
.end method

.method public e()I
    .locals 1

    .line 63
    iget v0, p0, Lo/dwl;->i:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 83
    iput p1, p0, Lo/dwl;->g:I

    .line 84
    return-void
.end method

.method public e(Ljava/lang/Long;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lo/dwl;->a:Ljava/lang/Long;

    .line 44
    return-void
.end method

.method public f()I
    .locals 1

    .line 71
    iget v0, p0, Lo/dwl;->h:I

    return v0
.end method

.method public h()Ljava/lang/String;
    .locals 1

    .line 103
    iget-object v0, p0, Lo/dwl;->b:Ljava/lang/String;

    return-object v0
.end method

.method public i()I
    .locals 1

    .line 87
    iget v0, p0, Lo/dwl;->f:I

    return v0
.end method

.method public k()I
    .locals 1

    .line 95
    iget v0, p0, Lo/dwl;->k:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 112
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "WeekAndMonthRecord{startTimestamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwl;->e:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", endTimeStamp="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwl;->a:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", value=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwl;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", britishValue=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/dwl;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", recentType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwl;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dataSource="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwl;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", maxReportNo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwl;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", minReportNo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwl;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", reportNo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dwl;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
