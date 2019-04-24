.class public Lo/amo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:J

.field private c:Z

.field private e:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amo;->b:J

    .line 15
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amo;->e:J

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lo/amo;->a:I

    .line 17
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/amo;->c:Z

    .line 20
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amo;->b:J

    .line 21
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amo;->e:J

    .line 22
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 25
    iget-boolean v0, p0, Lo/amo;->c:Z

    return v0
.end method

.method public c()V
    .locals 4

    .line 55
    iget-boolean v0, p0, Lo/amo;->c:Z

    if-eqz v0, :cond_0

    .line 56
    iget-wide v0, p0, Lo/amo;->e:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/amo;->e:J

    .line 58
    :cond_0
    return-void
.end method

.method public d(I)Z
    .locals 5

    .line 30
    const/4 v4, 0x0

    .line 32
    iget v0, p0, Lo/amo;->a:I

    if-eq v0, p1, :cond_0

    .line 33
    iput p1, p0, Lo/amo;->a:I

    goto :goto_0

    .line 35
    :cond_0
    return v4

    .line 37
    :goto_0
    iget-wide v0, p0, Lo/amo;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    .line 38
    iget-wide v0, p0, Lo/amo;->b:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lo/amo;->b:J

    goto :goto_1

    .line 40
    :cond_1
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amo;->e:J

    .line 41
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/amo;->b:J

    .line 44
    :goto_1
    const-string v0, "Step_DeviceClassWatchDog"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enableChangeClass stand : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/amo;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " private: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/amo;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 46
    iget-wide v0, p0, Lo/amo;->b:J

    const-wide/16 v2, 0x14

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 47
    const-string v0, "Step_DeviceClassWatchDog"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enableChangeClass stand : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/amo;->b:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " private: "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-wide v2, p0, Lo/amo;->e:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    const/4 v4, 0x1

    .line 49
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/amo;->c:Z

    .line 51
    :cond_2
    return v4
.end method
