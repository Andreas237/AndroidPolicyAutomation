.class public Lo/cfi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cdi;


# instance fields
.field private a:J

.field private b:I

.field private c:I

.field protected e:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const/4 v0, 0x0

    iput v0, p0, Lo/cfi;->c:I

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lo/cfi;->b:I

    .line 15
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cfi;->e:Z

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lo/cfi;->a:J

    return-void
.end method

.method private c(J)V
    .locals 1

    .line 71
    const/4 v0, 0x0

    iput v0, p0, Lo/cfi;->b:I

    .line 72
    const/4 v0, 0x0

    iput v0, p0, Lo/cfi;->c:I

    .line 73
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cfi;->e:Z

    .line 74
    iput-wide p1, p0, Lo/cfi;->a:J

    .line 76
    return-void
.end method

.method private d(IJ)V
    .locals 7

    .line 46
    iget v0, p0, Lo/cfi;->b:I

    if-nez v0, :cond_0

    .line 47
    iput-wide p2, p0, Lo/cfi;->a:J

    .line 50
    :cond_0
    iget v0, p0, Lo/cfi;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cfi;->b:I

    .line 53
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    .line 54
    iget v0, p0, Lo/cfi;->c:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/cfi;->c:I

    .line 57
    :cond_1
    iget-wide v0, p0, Lo/cfi;->a:J

    sub-long v0, p2, v0

    const-wide/16 v2, 0x4e20

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 58
    iget v0, p0, Lo/cfi;->c:I

    int-to-double v0, v0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v0, v2

    iget v2, p0, Lo/cfi;->b:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    const-wide v2, 0x3fe6666666666666L    # 0.7

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lo/cfi;->e:Z

    .line 60
    :cond_3
    iget-boolean v0, p0, Lo/cfi;->e:Z

    if-eqz v0, :cond_4

    .line 61
    const-string v0, "Track_TrackOverSpeedFilterListener"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-wide v3, p0, Lo/cfi;->a:J

    sub-long v3, p2, v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cfi;->b:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cfi;->c:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cfi;->c:I

    int-to-double v3, v3

    const-wide/high16 v5, 0x3ff0000000000000L    # 1.0

    mul-double/2addr v3, v5

    iget v5, p0, Lo/cfi;->b:I

    int-to-double v5, v5

    div-double/2addr v3, v5

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    :cond_4
    return-void
.end method


# virtual methods
.method public b()V
    .locals 0

    .line 83
    return-void
.end method

.method public e(IJ)V
    .locals 0

    .line 27
    if-nez p1, :cond_0

    .line 29
    invoke-direct {p0, p2, p3}, Lo/cfi;->c(J)V

    goto :goto_0

    .line 32
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lo/cfi;->d(IJ)V

    .line 36
    :goto_0
    invoke-virtual {p0}, Lo/cfi;->b()V

    .line 37
    return-void
.end method
