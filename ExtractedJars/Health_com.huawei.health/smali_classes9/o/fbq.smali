.class public abstract Lo/fbq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fbm;


# instance fields
.field protected b:J


# direct methods
.method public constructor <init>(J)V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-wide p1, p0, Lo/fbq;->b:J

    .line 15
    return-void
.end method


# virtual methods
.method public a(Lo/fbh;)J
    .locals 5

    .line 32
    invoke-virtual {p0}, Lo/fbq;->d()J

    move-result-wide v2

    .line 34
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 35
    invoke-virtual {v4, v2, v3}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 37
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 38
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 39
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 40
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 42
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 44
    sget-object v0, Lo/fbh;->d:Lo/fbh;

    if-ne p1, v0, :cond_0

    .line 45
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0

    .line 48
    :cond_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 50
    sget-object v0, Lo/fbh;->a:Lo/fbh;

    if-ne p1, v0, :cond_1

    .line 51
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0

    .line 54
    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 56
    sget-object v0, Lo/fbh;->e:Lo/fbh;

    if-ne p1, v0, :cond_2

    .line 57
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0

    .line 60
    :cond_2
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "generateViewFlag not compat"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public a(Lo/fbp;)Z
    .locals 5

    .line 72
    invoke-interface {p1}, Lo/fbp;->e_()Lo/fbh;

    move-result-object v0

    invoke-interface {p1, v0}, Lo/fbp;->a(Lo/fbh;)J

    move-result-wide v1

    .line 73
    invoke-interface {p1}, Lo/fbp;->e_()Lo/fbh;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/fbq;->a(Lo/fbh;)J

    move-result-wide v3

    .line 74
    cmp-long v0, v3, v1

    if-nez v0, :cond_0

    .line 75
    const/4 v0, 0x1

    return v0

    .line 77
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract b()J
.end method

.method public abstract d()J
.end method

.method public e(Lo/fbm;)Z
    .locals 6

    .line 18
    invoke-interface {p1}, Lo/fbm;->e_()Lo/fbh;

    move-result-object v4

    .line 19
    invoke-virtual {p0}, Lo/fbq;->e_()Lo/fbh;

    move-result-object v0

    if-eq v4, v0, :cond_0

    .line 20
    const/4 v0, 0x0

    return v0

    .line 22
    :cond_0
    invoke-virtual {v4}, Lo/fbh;->a()Lo/fbh;

    move-result-object v5

    .line 24
    invoke-interface {p1, v5}, Lo/fbm;->a(Lo/fbh;)J

    move-result-wide v0

    invoke-virtual {p0, v5}, Lo/fbq;->a(Lo/fbh;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 25
    const/4 v0, 0x0

    return v0

    .line 27
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 91
    instance-of v0, p1, Lo/fbm;

    if-eqz v0, :cond_1

    .line 92
    invoke-virtual {p0}, Lo/fbq;->d()J

    move-result-wide v0

    move-object v2, p1

    check-cast v2, Lo/fbm;

    invoke-interface {v2}, Lo/fbm;->d()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 93
    invoke-virtual {p0}, Lo/fbq;->b()J

    move-result-wide v0

    move-object v2, p1

    check-cast v2, Lo/fbm;

    invoke-interface {v2}, Lo/fbm;->b()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 94
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 86
    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
