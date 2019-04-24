.class public Lo/eht;
.super Lo/ehn;
.source "SourceFile"


# instance fields
.field private q:Lo/eic;


# direct methods
.method public constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/ui/commonui/linechart/barchart/HwHealthBarEntry;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2, p3, p4}, Lo/ehn;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    iput-object p5, p0, Lo/eht;->q:Lo/eic;

    .line 20
    return-void
.end method


# virtual methods
.method public h(I)I
    .locals 1

    .line 40
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {p0, p1}, Lo/eht;->l(I)I

    move-result v0

    return v0

    .line 42
    :cond_0
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    invoke-virtual {p0, p1}, Lo/eht;->o(I)I

    move-result v0

    return v0

    .line 44
    :cond_1
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 45
    invoke-virtual {p0, p1}, Lo/eht;->o(I)I

    move-result v0

    return v0

    .line 46
    :cond_2
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 47
    invoke-virtual {p0, p1}, Lo/eht;->q(I)I

    move-result v0

    return v0

    .line 48
    :cond_3
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 49
    invoke-virtual {p0, p1}, Lo/eht;->s(I)I

    move-result v0

    return v0

    .line 51
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public i(I)I
    .locals 5

    .line 185
    invoke-virtual {p0, p1}, Lo/eht;->k(I)I

    move-result v2

    .line 186
    invoke-virtual {p0, p1}, Lo/eht;->h(I)I

    move-result v3

    .line 187
    int-to-float v0, v3

    int-to-float v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v4, v0

    .line 189
    return v4
.end method

.method public k(I)I
    .locals 1

    .line 24
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {p0, p1}, Lo/eht;->n(I)I

    move-result v0

    return v0

    .line 26
    :cond_0
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 27
    invoke-virtual {p0, p1}, Lo/eht;->p(I)I

    move-result v0

    return v0

    .line 28
    :cond_1
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 29
    invoke-virtual {p0, p1}, Lo/eht;->p(I)I

    move-result v0

    return v0

    .line 30
    :cond_2
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 31
    invoke-virtual {p0, p1}, Lo/eht;->m(I)I

    move-result v0

    return v0

    .line 32
    :cond_3
    iget-object v0, p0, Lo/eht;->q:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 33
    invoke-virtual {p0, p1}, Lo/eht;->u(I)I

    move-result v0

    return v0

    .line 35
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method protected l(I)I
    .locals 7

    .line 75
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 78
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 80
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 82
    const/4 v6, 0x1

    .line 83
    const/16 v0, 0x1e

    if-lt v5, v0, :cond_0

    .line 84
    const/4 v6, 0x0

    .line 86
    :cond_0
    if-eqz v6, :cond_1

    .line 87
    const/16 v0, 0xc

    const/16 v1, 0x1e

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 89
    :cond_1
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 91
    :goto_0
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected m(I)I
    .locals 5

    .line 119
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 122
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 124
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 125
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 126
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 127
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 128
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 129
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected n(I)I
    .locals 7

    .line 55
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 58
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 60
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 62
    const/4 v6, 0x1

    .line 63
    const/16 v0, 0x1e

    if-lt v5, v0, :cond_0

    .line 64
    const/4 v6, 0x0

    .line 66
    :cond_0
    if-eqz v6, :cond_1

    .line 67
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 69
    :cond_1
    const/16 v0, 0xc

    const/16 v1, 0x1d

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 71
    :goto_0
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected o(I)I
    .locals 5

    .line 107
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 110
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 111
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 112
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 113
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 114
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 115
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected p(I)I
    .locals 5

    .line 95
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 98
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 99
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 100
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 101
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 102
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 103
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected q(I)I
    .locals 5

    .line 133
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 136
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 138
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 139
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 140
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 141
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 142
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 144
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 145
    const/16 v0, 0xe

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 146
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected s(I)I
    .locals 5

    .line 165
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 168
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 169
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 171
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 172
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 173
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 174
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 175
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 177
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 178
    const/16 v0, 0xe

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 179
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method protected u(I)I
    .locals 5

    .line 150
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 153
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 154
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 156
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 157
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 158
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 159
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 160
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 161
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method
