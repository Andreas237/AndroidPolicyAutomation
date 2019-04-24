.class public Lo/fbk;
.super Lo/fbq;
.source "SourceFile"


# instance fields
.field private c:J

.field private d:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 2

    .line 14
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lo/fbq;-><init>(J)V

    .line 15
    iput-wide p1, p0, Lo/fbk;->d:J

    .line 16
    iput-wide p3, p0, Lo/fbk;->c:J

    .line 17
    return-void
.end method


# virtual methods
.method public b()J
    .locals 2

    .line 33
    iget-wide v0, p0, Lo/fbk;->c:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    .line 29
    iget-wide v0, p0, Lo/fbk;->d:J

    return-wide v0
.end method

.method public e_()Lo/fbh;
    .locals 1

    .line 38
    sget-object v0, Lo/fbh;->b:Lo/fbh;

    return-object v0
.end method
