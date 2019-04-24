.class public Lo/ffh;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Z

.field private d:Lo/ffd;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/fff;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ffh;->a:Z

    .line 34
    new-instance v0, Lo/ffd;

    invoke-direct {v0}, Lo/ffd;-><init>()V

    iput-object v0, p0, Lo/ffh;->d:Lo/ffd;

    .line 35
    invoke-direct {p0}, Lo/ffh;->m()V

    .line 36
    return-void
.end method

.method public constructor <init>(Lo/ffd;)V
    .locals 1

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ffh;->a:Z

    .line 49
    iput-object p1, p0, Lo/ffh;->d:Lo/ffd;

    .line 50
    invoke-direct {p0}, Lo/ffh;->m()V

    .line 51
    return-void
.end method

.method private m()V
    .locals 1

    .line 56
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    .line 57
    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    .line 149
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->c:D

    return-wide v0
.end method

.method public a(Lo/fff;)V
    .locals 4

    .line 86
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    if-nez v0, :cond_0

    .line 87
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    .line 89
    :cond_0
    if-nez p1, :cond_1

    .line 90
    const-string v0, "Track_SportHistoryExpandableGroupData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSingleTrackData trackData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    return-void

    .line 93
    :cond_1
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 94
    return-void
.end method

.method public b()I
    .locals 1

    .line 114
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    if-nez v0, :cond_0

    .line 115
    const/4 v0, 0x0

    return v0

    .line 117
    :cond_0
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public b(I)I
    .locals 7

    .line 181
    const-string v0, "Track_SportHistoryExpandableGroupData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteChildAt i = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    invoke-virtual {p0}, Lo/ffh;->b()I

    move-result v0

    if-lt p1, v0, :cond_0

    .line 183
    const-string v0, "Track_SportHistoryExpandableGroupData"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OutOfIndex delete failed childCount = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lo/ffh;->b()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 184
    invoke-virtual {p0}, Lo/ffh;->b()I

    move-result v0

    return v0

    .line 190
    :cond_0
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget v0, v0, Lo/ffd;->k:I

    invoke-virtual {p0}, Lo/ffh;->b()I

    move-result v1

    if-eq v0, v1, :cond_1

    .line 191
    const-string v0, "Track_SportHistoryExpandableGroupData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mMonthData.mSportTimes != childCount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    invoke-virtual {p0}, Lo/ffh;->b()I

    move-result v1

    iput v1, v0, Lo/ffd;->k:I

    .line 195
    :cond_1
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/fff;

    .line 196
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget v1, v0, Lo/ffd;->k:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lo/ffd;->k:I

    .line 199
    invoke-virtual {v5}, Lo/fff;->g()I

    move-result v6

    .line 200
    invoke-virtual {v5}, Lo/fff;->f()I

    move-result v0

    if-nez v0, :cond_6

    .line 201
    invoke-virtual {v5}, Lo/fff;->p()I

    move-result v0

    if-nez v0, :cond_6

    .line 202
    const/16 v0, 0x102

    if-eq v6, v0, :cond_2

    const/16 v0, 0x108

    if-ne v6, v0, :cond_3

    .line 203
    :cond_2
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->c:D

    invoke-virtual {v5}, Lo/fff;->b()F

    move-result v3

    float-to-double v3, v3

    sub-double/2addr v1, v3

    iput-wide v1, v0, Lo/ffd;->c:D

    goto :goto_0

    .line 204
    :cond_3
    const/16 v0, 0x101

    if-ne v6, v0, :cond_4

    .line 205
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->e:D

    invoke-virtual {v5}, Lo/fff;->b()F

    move-result v3

    float-to-double v3, v3

    sub-double/2addr v1, v3

    iput-wide v1, v0, Lo/ffd;->e:D

    goto :goto_0

    .line 206
    :cond_4
    const/16 v0, 0x103

    if-ne v6, v0, :cond_5

    .line 207
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->d:D

    invoke-virtual {v5}, Lo/fff;->b()F

    move-result v3

    float-to-double v3, v3

    sub-double/2addr v1, v3

    iput-wide v1, v0, Lo/ffd;->d:D

    .line 209
    :cond_5
    :goto_0
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->b:D

    invoke-virtual {v5}, Lo/fff;->l()F

    move-result v3

    float-to-double v3, v3

    sub-double/2addr v1, v3

    iput-wide v1, v0, Lo/ffd;->b:D

    goto :goto_1

    .line 210
    :cond_6
    invoke-virtual {v5}, Lo/fff;->f()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_7

    .line 211
    const/16 v0, 0x2711

    if-ne v6, v0, :cond_7

    .line 212
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->b:D

    invoke-virtual {v5}, Lo/fff;->b()F

    move-result v3

    float-to-double v3, v3

    sub-double/2addr v1, v3

    iput-wide v1, v0, Lo/ffd;->b:D

    .line 213
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->a:J

    invoke-virtual {v5}, Lo/fff;->h()J

    move-result-wide v3

    sub-long/2addr v1, v3

    iput-wide v1, v0, Lo/ffd;->a:J

    .line 216
    :cond_7
    :goto_1
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->c:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_8

    .line 217
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lo/ffd;->c:D

    .line 219
    :cond_8
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->e:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_9

    .line 220
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lo/ffd;->e:D

    .line 222
    :cond_9
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->d:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gez v0, :cond_a

    .line 223
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lo/ffd;->d:D

    .line 225
    :cond_a
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 226
    invoke-virtual {p0}, Lo/ffh;->b()I

    move-result v0

    return v0
.end method

.method public c()I
    .locals 1

    .line 129
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget v0, v0, Lo/ffd;->k:I

    return v0
.end method

.method public c(I)Lo/fff;
    .locals 1

    .line 121
    invoke-virtual {p0}, Lo/ffh;->b()I

    move-result v0

    if-gt v0, p1, :cond_0

    .line 122
    const/4 v0, 0x0

    return-object v0

    .line 124
    :cond_0
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/fff;

    return-object v0
.end method

.method public c(DJDI)V
    .locals 20

    .line 61
    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    .line 63
    move/from16 v0, p7

    const/16 v1, 0x102

    if-eq v0, v1, :cond_0

    move/from16 v0, p7

    const/16 v1, 0x108

    if-ne v0, v1, :cond_1

    .line 64
    :cond_0
    move-wide/from16 v16, p1

    goto :goto_0

    .line 65
    :cond_1
    move/from16 v0, p7

    const/16 v1, 0x101

    if-ne v0, v1, :cond_2

    .line 66
    move-wide/from16 v14, p1

    goto :goto_0

    .line 67
    :cond_2
    move/from16 v0, p7

    const/16 v1, 0x103

    if-ne v0, v1, :cond_3

    .line 68
    move-wide/from16 v18, p1

    .line 71
    :cond_3
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffh;->d:Lo/ffd;

    if-nez v0, :cond_4

    .line 72
    new-instance v0, Lo/ffd;

    move-wide v1, v14

    move-wide/from16 v3, v16

    move-wide/from16 v5, v18

    const-wide/16 v7, 0x0

    const/4 v9, 0x1

    move-wide/from16 v10, p3

    move-wide/from16 v12, p5

    invoke-direct/range {v0 .. v13}, Lo/ffd;-><init>(DDDJIJD)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/ffh;->d:Lo/ffd;

    goto :goto_1

    .line 74
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->c:D

    add-double v1, v1, v16

    iput-wide v1, v0, Lo/ffd;->c:D

    .line 75
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->e:D

    add-double/2addr v1, v14

    iput-wide v1, v0, Lo/ffd;->e:D

    .line 76
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->d:D

    add-double v1, v1, v18

    iput-wide v1, v0, Lo/ffd;->d:D

    .line 77
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffh;->d:Lo/ffd;

    iget-wide v1, v0, Lo/ffd;->b:D

    add-double v1, v1, p5

    iput-wide v1, v0, Lo/ffd;->b:D

    .line 78
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffh;->d:Lo/ffd;

    move-wide/from16 v1, p3

    iput-wide v1, v0, Lo/ffd;->i:J

    .line 81
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/ffh;->d:Lo/ffd;

    iget v1, v0, Lo/ffd;->k:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lo/ffd;->k:I

    .line 83
    :goto_1
    return-void
.end method

.method public c(Z)V
    .locals 0

    .line 233
    iput-boolean p1, p0, Lo/ffh;->a:Z

    .line 234
    return-void
.end method

.method public d()J
    .locals 2

    .line 139
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->i:J

    return-wide v0
.end method

.method public d(ILo/fff;)V
    .locals 4

    .line 97
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    if-nez v0, :cond_0

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    .line 100
    :cond_0
    if-nez p2, :cond_1

    .line 101
    const-string v0, "Track_SportHistoryExpandableGroupData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSingleTrackData trackData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    return-void

    .line 104
    :cond_1
    invoke-virtual {p0}, Lo/ffh;->b()I

    move-result v0

    if-lt p1, v0, :cond_2

    .line 105
    const-string v0, "Track_SportHistoryExpandableGroupData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSingleTrackData index of"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    return-void

    .line 109
    :cond_2
    iget-object v0, p0, Lo/ffh;->e:Ljava/util/List;

    invoke-interface {v0, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 111
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 133
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    invoke-virtual {v0}, Lo/ffd;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f()D
    .locals 2

    .line 161
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->b:D

    return-wide v0
.end method

.method public g()D
    .locals 2

    .line 153
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->e:D

    return-wide v0
.end method

.method public h()D
    .locals 2

    .line 157
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->d:D

    return-wide v0
.end method

.method public i()I
    .locals 1

    .line 165
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget v0, v0, Lo/ffd;->k:I

    return v0
.end method

.method public k()J
    .locals 2

    .line 169
    iget-object v0, p0, Lo/ffh;->d:Lo/ffd;

    iget-wide v0, v0, Lo/ffd;->a:J

    return-wide v0
.end method

.method public o()Z
    .locals 1

    .line 230
    iget-boolean v0, p0, Lo/ffh;->a:Z

    return v0
.end method
