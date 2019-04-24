.class public Lo/czo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:Ljava/lang/String;

.field private k:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 170
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 171
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 57
    iget v0, p0, Lo/czo;->k:I

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 42
    iput p1, p0, Lo/czo;->g:I

    .line 43
    return-void
.end method

.method public b()I
    .locals 1

    .line 38
    iget v0, p0, Lo/czo;->g:I

    return v0
.end method

.method public b(I)V
    .locals 0

    .line 78
    iput p1, p0, Lo/czo;->b:I

    .line 79
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    .line 156
    iput-object p1, p0, Lo/czo;->i:Ljava/lang/String;

    .line 157
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 50
    iget-object v0, p0, Lo/czo;->i:Ljava/lang/String;

    return-object v0
.end method

.method public c(I)V
    .locals 0

    .line 34
    iput p1, p0, Lo/czo;->h:I

    .line 35
    return-void
.end method

.method public d()I
    .locals 1

    .line 30
    iget v0, p0, Lo/czo;->h:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 64
    iput p1, p0, Lo/czo;->k:I

    .line 65
    return-void
.end method

.method public e()I
    .locals 1

    .line 71
    iget v0, p0, Lo/czo;->b:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 92
    iput p1, p0, Lo/czo;->c:I

    .line 93
    return-void
.end method

.method public f()I
    .locals 1

    .line 134
    iget v0, p0, Lo/czo;->d:I

    return v0
.end method

.method public g()I
    .locals 1

    .line 113
    iget v0, p0, Lo/czo;->a:I

    return v0
.end method

.method public g(I)V
    .locals 0

    .line 120
    iput p1, p0, Lo/czo;->a:I

    .line 121
    return-void
.end method

.method public h()I
    .locals 1

    .line 99
    iget v0, p0, Lo/czo;->f:I

    return v0
.end method

.method public i()I
    .locals 1

    .line 85
    iget v0, p0, Lo/czo;->c:I

    return v0
.end method

.method public i(I)V
    .locals 0

    .line 106
    iput p1, p0, Lo/czo;->f:I

    .line 107
    return-void
.end method

.method public k()I
    .locals 1

    .line 127
    iget v0, p0, Lo/czo;->e:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DataWeather{weather="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wind_direction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", wind_speed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", pm2_5="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lowestTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", highestTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->f:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentTemperature="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", locationName=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/czo;->i:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", tempFlag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", aqi="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/czo;->g:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
