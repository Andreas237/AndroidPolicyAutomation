.class public Lo/bai;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private d:Ljava/lang/String;

.field private e:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-wide p1, p0, Lo/bai;->a:J

    .line 33
    iput-wide p3, p0, Lo/bai;->e:J

    .line 34
    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;)V
    .locals 0

    .line 38
    invoke-direct {p0, p1, p2, p3, p4}, Lo/bai;-><init>(JJ)V

    .line 39
    iput-object p5, p0, Lo/bai;->d:Ljava/lang/String;

    .line 40
    return-void
.end method


# virtual methods
.method public c()J
    .locals 2

    .line 59
    iget-wide v0, p0, Lo/bai;->e:J

    return-wide v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 64
    iget-object v0, p0, Lo/bai;->d:Ljava/lang/String;

    .line 65
    return-object v0
.end method

.method public e()J
    .locals 2

    .line 49
    iget-wide v0, p0, Lo/bai;->a:J

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "{["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/bai;->a:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/bai;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "],channel:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/bai;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
