.class public Lo/ejz;
.super Lo/ejw;
.source "SourceFile"


# instance fields
.field private a:Lo/eih$i;

.field private b:Z


# direct methods
.method public constructor <init>(Lo/eih;Lo/ekd;)V
    .locals 2

    .line 21
    invoke-direct {p0, p1, p2}, Lo/ejw;-><init>(Lo/eih;Lo/ekd;)V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/ejz;->a:Lo/eih$i;

    .line 18
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ejz;->b:Z

    .line 22
    new-instance v0, Lo/eih$q;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p1}, Lo/eih$q;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/ejz;->a:Lo/eih$i;

    .line 23
    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 27
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ekg;->b(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected a(I)I
    .locals 5

    .line 56
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 59
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 60
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 61
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 62
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 63
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 64
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public b()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lo/ejz;->b:Z

    return v0
.end method

.method public c(I)I
    .locals 1

    .line 47
    invoke-virtual {p0, p1}, Lo/ejz;->a(I)I

    move-result v0

    return v0
.end method

.method public c()Lo/eih$i;
    .locals 1

    .line 37
    iget-object v0, p0, Lo/ejz;->a:Lo/eih$i;

    return-object v0
.end method

.method public d()I
    .locals 4

    .line 32
    invoke-static {}, Lo/ekg;->c()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public d(I)I
    .locals 1

    .line 52
    invoke-virtual {p0, p1}, Lo/ejz;->g(I)I

    move-result v0

    return v0
.end method

.method protected g(I)I
    .locals 5

    .line 68
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 71
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 72
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 73
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 74
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 75
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 76
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
