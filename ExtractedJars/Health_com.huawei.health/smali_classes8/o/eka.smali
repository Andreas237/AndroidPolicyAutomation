.class public Lo/eka;
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

    iput-object v0, p0, Lo/eka;->a:Lo/eih$i;

    .line 18
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eka;->b:Z

    .line 22
    new-instance v0, Lo/eih$r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v0, p1}, Lo/eih$r;-><init>(Lo/eih;)V

    iput-object v0, p0, Lo/eka;->a:Lo/eih$i;

    .line 23
    iget-object v0, p0, Lo/eka;->c:Lo/eih$n$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/eih$n$a;->b(Z)V

    .line 24
    return-void
.end method


# virtual methods
.method public a()I
    .locals 4

    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/ekg;->d(J)J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected a(I)I
    .locals 7

    .line 58
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 61
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 63
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 65
    const/4 v6, 0x1

    .line 66
    const/16 v0, 0x1e

    if-lt v5, v0, :cond_0

    .line 67
    const/4 v6, 0x0

    .line 69
    :cond_0
    if-eqz v6, :cond_1

    .line 70
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 72
    :cond_1
    const/16 v0, 0xc

    const/16 v1, 0x1d

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 74
    :goto_0
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public b()Z
    .locals 1

    .line 43
    iget-boolean v0, p0, Lo/eka;->b:Z

    return v0
.end method

.method public c(I)I
    .locals 1

    .line 49
    invoke-virtual {p0, p1}, Lo/eka;->a(I)I

    move-result v0

    return v0
.end method

.method public c()Lo/eih$i;
    .locals 1

    .line 38
    iget-object v0, p0, Lo/eka;->a:Lo/eih$i;

    return-object v0
.end method

.method public d()I
    .locals 4

    .line 33
    invoke-static {}, Lo/ekg;->b()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method public d(I)I
    .locals 1

    .line 54
    invoke-virtual {p0, p1}, Lo/eka;->f(I)I

    move-result v0

    return v0
.end method

.method protected f(I)I
    .locals 7

    .line 78
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 81
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 83
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 85
    const/4 v6, 0x1

    .line 86
    const/16 v0, 0x1e

    if-lt v5, v0, :cond_0

    .line 87
    const/4 v6, 0x0

    .line 89
    :cond_0
    if-eqz v6, :cond_1

    .line 90
    const/16 v0, 0xc

    const/16 v1, 0x1e

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 92
    :cond_1
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 94
    :goto_0
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
