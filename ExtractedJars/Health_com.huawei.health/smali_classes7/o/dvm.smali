.class public Lo/dvm;
.super Lo/dvf;
.source "SourceFile"


# instance fields
.field private a:J

.field private c:I

.field private d:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    const/16 v0, 0xf

    invoke-direct {p0, v0}, Lo/dvf;-><init>(I)V

    .line 30
    return-void
.end method


# virtual methods
.method public b()I
    .locals 1

    .line 41
    iget v0, p0, Lo/dvm;->c:I

    return v0
.end method

.method public c()J
    .locals 2

    .line 49
    iget-wide v0, p0, Lo/dvm;->a:J

    return-wide v0
.end method

.method public c(I)V
    .locals 0

    .line 45
    iput p1, p0, Lo/dvm;->c:I

    .line 46
    return-void
.end method

.method public c(J)V
    .locals 0

    .line 53
    iput-wide p1, p0, Lo/dvm;->a:J

    .line 54
    return-void
.end method

.method public d()I
    .locals 1

    .line 33
    iget v0, p0, Lo/dvm;->d:I

    return v0
.end method

.method public e(I)V
    .locals 0

    .line 37
    iput p1, p0, Lo/dvm;->d:I

    .line 38
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AchieveLevelTotalInfo{level="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvm;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", userNumber="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvm;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", syncTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dvm;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
