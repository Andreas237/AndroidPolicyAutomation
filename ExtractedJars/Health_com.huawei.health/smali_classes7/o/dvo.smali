.class public Lo/dvo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private d:J

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JIIJ)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-wide p1, p0, Lo/dvo;->e:J

    .line 32
    iput p4, p0, Lo/dvo;->a:I

    .line 33
    iput p3, p0, Lo/dvo;->b:I

    .line 34
    iput-wide p5, p0, Lo/dvo;->d:J

    .line 35
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 66
    iget-wide v0, p0, Lo/dvo;->d:J

    return-wide v0
.end method

.method public a(I)V
    .locals 0

    .line 50
    iput p1, p0, Lo/dvo;->b:I

    .line 51
    return-void
.end method

.method public b()I
    .locals 1

    .line 54
    iget v0, p0, Lo/dvo;->a:I

    return v0
.end method

.method public c()J
    .locals 2

    .line 38
    iget-wide v0, p0, Lo/dvo;->e:J

    return-wide v0
.end method

.method public d(I)V
    .locals 0

    .line 58
    iput p1, p0, Lo/dvo;->a:I

    .line 59
    return-void
.end method

.method public d(J)V
    .locals 0

    .line 42
    iput-wide p1, p0, Lo/dvo;->e:J

    .line 43
    return-void
.end method

.method public e()I
    .locals 1

    .line 46
    iget v0, p0, Lo/dvo;->b:I

    return v0
.end method

.method public e(J)V
    .locals 0

    .line 62
    iput-wide p1, p0, Lo/dvo;->d:J

    .line 63
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CacaRecord{date="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dvo;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvo;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", kakaNum="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/dvo;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", occurDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/dvo;->d:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
