.class public Lo/fbj;
.super Lo/fbo;
.source "SourceFile"


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 12
    invoke-direct {p0, p1, p2}, Lo/fbo;-><init>(J)V

    .line 13
    return-void
.end method


# virtual methods
.method public a(J)Lo/fbp;
    .locals 1

    .line 44
    const/4 v0, 0x0

    return-object v0
.end method

.method public b()J
    .locals 2

    .line 34
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public d()J
    .locals 3

    .line 17
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 19
    iget-wide v0, p0, Lo/fbj;->b:J

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 21
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 22
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 23
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 24
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 26
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 27
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 28
    const/4 v0, 0x1

    const/16 v1, 0x7de

    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 30
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public e_()Lo/fbh;
    .locals 1

    .line 39
    sget-object v0, Lo/fbh;->e:Lo/fbh;

    return-object v0
.end method
