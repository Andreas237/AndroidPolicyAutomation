.class public Lo/fdo;
.super Lo/elb;
.source "SourceFile"


# instance fields
.field public z:Lo/eic;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/eic;)V"
        }
    .end annotation

    .line 17
    invoke-direct/range {p0 .. p5}, Lo/elb;-><init>(Landroid/content/Context;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    iput-object p6, p0, Lo/fdo;->z:Lo/eic;

    .line 19
    return-void
.end method

.method private b(FLcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Z
    .locals 3

    .line 93
    invoke-virtual {p2}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-direct {p0, v0}, Lo/fdo;->n(I)I

    move-result v1

    .line 94
    invoke-virtual {p2}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-direct {p0, v0}, Lo/fdo;->m(I)I

    move-result v2

    .line 95
    int-to-float v0, v1

    cmpl-float v0, p1, v0

    if-ltz v0, :cond_0

    int-to-float v0, v2

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 96
    const/4 v0, 0x1

    return v0

    .line 98
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private m(I)I
    .locals 1

    .line 117
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 118
    invoke-direct {p0, p1}, Lo/fdo;->q(I)I

    move-result v0

    return v0

    .line 119
    :cond_0
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    invoke-direct {p0, p1}, Lo/fdo;->s(I)I

    move-result v0

    return v0

    .line 121
    :cond_1
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 122
    invoke-direct {p0, p1}, Lo/fdo;->s(I)I

    move-result v0

    return v0

    .line 123
    :cond_2
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 124
    invoke-direct {p0, p1}, Lo/fdo;->u(I)I

    move-result v0

    return v0

    .line 125
    :cond_3
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 126
    invoke-direct {p0, p1}, Lo/fdo;->z(I)I

    move-result v0

    return v0

    .line 128
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method private n(I)I
    .locals 1

    .line 102
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 103
    invoke-direct {p0, p1}, Lo/fdo;->o(I)I

    move-result v0

    return v0

    .line 104
    :cond_0
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 105
    invoke-direct {p0, p1}, Lo/fdo;->t(I)I

    move-result v0

    return v0

    .line 106
    :cond_1
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 107
    invoke-direct {p0, p1}, Lo/fdo;->t(I)I

    move-result v0

    return v0

    .line 108
    :cond_2
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 109
    invoke-direct {p0, p1}, Lo/fdo;->r(I)I

    move-result v0

    return v0

    .line 110
    :cond_3
    iget-object v0, p0, Lo/fdo;->z:Lo/eic;

    invoke-virtual {v0}, Lo/eic;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 111
    invoke-direct {p0, p1}, Lo/fdo;->y(I)I

    move-result v0

    return v0

    .line 113
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method private o(I)I
    .locals 7

    .line 132
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 135
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 137
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 139
    const/4 v6, 0x1

    .line 140
    const/16 v0, 0x1e

    if-lt v5, v0, :cond_0

    .line 141
    const/4 v6, 0x0

    .line 143
    :cond_0
    if-eqz v6, :cond_1

    .line 144
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 146
    :cond_1
    const/16 v0, 0xc

    const/16 v1, 0x1d

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 148
    :goto_0
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private q(I)I
    .locals 7

    .line 152
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 155
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 156
    const/16 v0, 0xc

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 158
    const/4 v6, 0x1

    .line 159
    const/16 v0, 0x1e

    if-lt v5, v0, :cond_0

    .line 160
    const/4 v6, 0x0

    .line 162
    :cond_0
    if-eqz v6, :cond_1

    .line 163
    const/16 v0, 0xc

    const/16 v1, 0x1e

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    goto :goto_0

    .line 165
    :cond_1
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 167
    :goto_0
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private r(I)I
    .locals 5

    .line 195
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 198
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 200
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 201
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 202
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 203
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 204
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 205
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private s(I)I
    .locals 5

    .line 183
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 186
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 187
    const/16 v0, 0xb

    const/16 v1, 0x17

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 188
    const/16 v0, 0xc

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 189
    const/16 v0, 0xd

    const/16 v1, 0x3b

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 190
    const/16 v0, 0xe

    const/16 v1, 0x3e7

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 191
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private t(I)I
    .locals 5

    .line 171
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 174
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 175
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 176
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 177
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 178
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 179
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private u(I)I
    .locals 5

    .line 209
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 212
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 214
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 215
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 216
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 217
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 218
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 220
    const/4 v0, 0x2

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 221
    const/16 v0, 0xe

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 222
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private y(I)I
    .locals 5

    .line 226
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 229
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 230
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 232
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 233
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 234
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 235
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 236
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 237
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method

.method private z(I)I
    .locals 5

    .line 241
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 244
    int-to-long v0, p1

    const-wide/16 v2, 0x3c

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    mul-long/2addr v0, v2

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 245
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 247
    const/4 v0, 0x5

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 248
    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 249
    const/16 v0, 0xc

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 250
    const/16 v0, 0xd

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 251
    const/16 v0, 0xe

    const/4 v1, 0x0

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->set(II)V

    .line 253
    const/4 v0, 0x1

    const/4 v1, 0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 254
    const/16 v0, 0xe

    const/4 v1, -0x1

    invoke-virtual {v4, v0, v1}, Ljava/util/Calendar;->add(II)V

    .line 255
    invoke-virtual {v4}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    const-wide/32 v2, 0xea60

    div-long/2addr v0, v2

    long-to-int v0, v0

    return v0
.end method


# virtual methods
.method public e(F)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)Ljava/util/List<Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;>;"
        }
    .end annotation

    .line 23
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 25
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    .line 26
    return-object v3

    .line 29
    :cond_0
    const/4 v4, 0x0

    .line 30
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v5, v0, -0x1

    .line 32
    :goto_0
    if-gt v4, v5, :cond_4

    .line 33
    add-int v0, v5, v4

    div-int/lit8 v6, v0, 0x2

    .line 34
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 37
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_2

    .line 38
    :goto_1
    if-lez v6, :cond_1

    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    add-int/lit8 v1, v6, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, p1

    if-nez v0, :cond_1

    .line 39
    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    .line 41
    :cond_1
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    .line 44
    :goto_2
    if-ge v6, v5, :cond_4

    .line 45
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 46
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, v0, p1

    if-nez v0, :cond_4

    .line 47
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 44
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 55
    :cond_2
    invoke-virtual {v7}, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;->getX()F

    move-result v0

    cmpl-float v0, p1, v0

    if-lez v0, :cond_3

    .line 56
    add-int/lit8 v4, v6, 0x1

    goto :goto_3

    .line 58
    :cond_3
    add-int/lit8 v5, v6, -0x1

    .line 60
    :goto_3
    goto/16 :goto_0

    .line 62
    :cond_4
    if-le v4, v5, :cond_7

    .line 65
    if-ltz v4, :cond_5

    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-gt v4, v0, :cond_5

    if-ltz v5, :cond_5

    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-le v5, v0, :cond_6

    .line 66
    :cond_5
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    iget-object v1, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 69
    :cond_6
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 70
    iget-object v0, p0, Lo/fdo;->l:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 71
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    :cond_7
    :goto_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_8

    .line 78
    return-object v3

    .line 81
    :cond_8
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 83
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;

    .line 84
    invoke-direct {p0, p1, v8}, Lo/fdo;->b(FLcom/huawei/ui/commonui/linechart/common/HwHealthBaseEntry;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 85
    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    :cond_9
    goto :goto_5

    .line 89
    :cond_a
    return-object v6
.end method

.method public p(I)I
    .locals 5

    .line 259
    invoke-direct {p0, p1}, Lo/fdo;->n(I)I

    move-result v2

    .line 260
    invoke-direct {p0, p1}, Lo/fdo;->m(I)I

    move-result v3

    .line 261
    int-to-float v0, v3

    int-to-float v1, v2

    add-float/2addr v0, v1

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    float-to-int v4, v0

    .line 263
    return v4
.end method
