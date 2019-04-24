.class public Lo/azy;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:D

.field private b:D

.field private c:J

.field private d:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lo/azy;->c:J

    return-void
.end method


# virtual methods
.method public b(J)V
    .locals 6

    .line 58
    iget-wide v0, p0, Lo/azy;->b:D

    long-to-double v2, p1

    iget-wide v4, p0, Lo/azy;->b:D

    sub-double/2addr v2, v4

    const-wide/high16 v4, 0x3fc0000000000000L    # 0.125

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    iput-wide v0, p0, Lo/azy;->b:D

    .line 60
    iget-wide v0, p0, Lo/azy;->a:D

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    mul-double/2addr v0, v2

    long-to-double v2, p1

    iget-wide v4, p0, Lo/azy;->b:D

    sub-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    const-wide/high16 v4, 0x3fd0000000000000L    # 0.25

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    iput-wide v0, p0, Lo/azy;->a:D

    .line 62
    iget-wide v0, p0, Lo/azy;->b:D

    iget-wide v2, p0, Lo/azy;->a:D

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    mul-double/2addr v2, v4

    add-double/2addr v0, v2

    double-to-long v0, v0

    iput-wide v0, p0, Lo/azy;->c:J

    .line 64
    iget-wide v0, p0, Lo/azy;->d:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/azy;->d:J

    .line 65
    const-string v0, "PingPolicy"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RTO:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/azy;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",RTT:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",count:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-wide v2, p0, Lo/azy;->d:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    return-void
.end method

.method public c()V
    .locals 2

    .line 39
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/azy;->d:J

    .line 40
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/azy;->a:D

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/azy;->b:D

    .line 42
    const-wide/16 v0, 0x2710

    invoke-virtual {p0, v0, v1}, Lo/azy;->b(J)V

    .line 43
    return-void
.end method

.method public e()J
    .locals 2

    .line 52
    iget-wide v0, p0, Lo/azy;->c:J

    return-wide v0
.end method
