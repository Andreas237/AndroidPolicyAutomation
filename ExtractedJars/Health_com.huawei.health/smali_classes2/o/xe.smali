.class public Lo/xe;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljava/lang/Object;

.field private static b:Lo/xe;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/xe;->a:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e()Lo/xe;
    .locals 4

    .line 28
    sget-object v2, Lo/xe;->a:Ljava/lang/Object;

    monitor-enter v2

    .line 29
    :try_start_0
    sget-object v0, Lo/xe;->b:Lo/xe;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    new-instance v0, Lo/xe;

    invoke-direct {v0}, Lo/xe;-><init>()V

    sput-object v0, Lo/xe;->b:Lo/xe;

    .line 32
    :cond_0
    sget-object v0, Lo/xe;->b:Lo/xe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 33
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public d(Lo/wr;Ljava/util/ArrayList;J)J
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lo/wr;Ljava/util/ArrayList<Lo/xf;>;J)J"
        }
    .end annotation

    .line 42
    const-wide/16 v8, 0x0

    .line 48
    const/4 v10, 0x0

    .line 49
    const/4 v11, 0x0

    :goto_0
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v11, v0, :cond_18

    .line 51
    move-object/from16 v0, p2

    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lo/xf;

    .line 53
    new-instance v13, Landroid/content/ContentValues;

    invoke-direct {v13}, Landroid/content/ContentValues;-><init>()V

    .line 54
    invoke-virtual {v12}, Lo/xf;->f()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    .line 55
    const-wide/16 v0, -0x1

    cmp-long v0, v0, p3

    if-eqz v0, :cond_0

    invoke-virtual {v12}, Lo/xf;->f()J

    move-result-wide v0

    cmp-long v0, p3, v0

    if-nez v0, :cond_0

    .line 56
    const/4 v10, 0x1

    .line 58
    :cond_0
    const-string v0, "huid"

    invoke-virtual {v12}, Lo/xf;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 62
    :cond_1
    const-string v0, "gender"

    invoke-virtual {v12}, Lo/xf;->k()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    .line 64
    invoke-virtual {v12}, Lo/xf;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 65
    const-string v0, "status"

    invoke-virtual {v12}, Lo/xf;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    :cond_2
    invoke-virtual {v12}, Lo/xf;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 68
    const-string v0, "need_verify"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v12}, Lo/xf;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    :cond_3
    invoke-virtual {v12}, Lo/xf;->h()S

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 71
    if-eqz v10, :cond_4

    .line 72
    sget-object v0, Lo/xx$b;->b:Lo/xx$b;

    invoke-virtual {v0}, Lo/xx$b;->ordinal()I

    move-result v0

    int-to-short v0, v0

    invoke-virtual {v12, v0}, Lo/xf;->d(S)V

    .line 73
    const/4 v10, 0x0

    .line 75
    :cond_4
    const-string v0, "userType"

    invoke-virtual {v12}, Lo/xf;->h()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    .line 77
    :cond_5
    invoke-virtual {v12}, Lo/xf;->i()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_6

    .line 78
    const-string v0, "hobbies"

    invoke-virtual {v12}, Lo/xf;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 80
    :cond_6
    invoke-virtual {v12}, Lo/xf;->m()[B

    move-result-object v0

    if-eqz v0, :cond_7

    .line 81
    const-string v0, "image"

    invoke-virtual {v12}, Lo/xf;->m()[B

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 84
    :cond_7
    invoke-virtual {v12}, Lo/xf;->n()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 85
    const-string v0, "inviteMessage"

    invoke-virtual {v12}, Lo/xf;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    :cond_8
    invoke-virtual {v12}, Lo/xf;->p()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_9

    .line 88
    const-string v0, "settings"

    invoke-virtual {v12}, Lo/xf;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 90
    :cond_9
    invoke-virtual {v12}, Lo/xf;->o()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_a

    .line 91
    const-string v0, "age"

    invoke-virtual {v12}, Lo/xf;->o()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 93
    :cond_a
    invoke-virtual {v12}, Lo/xf;->l()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 94
    const-string v0, "tokenId"

    invoke-virtual {v12}, Lo/xf;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 96
    :cond_b
    invoke-virtual {v12}, Lo/xf;->u()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_c

    .line 97
    const-string v0, "height"

    invoke-virtual {v12}, Lo/xf;->u()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 99
    :cond_c
    invoke-virtual {v12}, Lo/xf;->r()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_d

    .line 100
    const-string v0, "weight"

    invoke-virtual {v12}, Lo/xf;->r()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 102
    :cond_d
    invoke-virtual {v12}, Lo/xf;->t()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_e

    .line 103
    const-string v0, "stepLength"

    invoke-virtual {v12}, Lo/xf;->t()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 105
    :cond_e
    invoke-virtual {v12}, Lo/xf;->s()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_f

    .line 106
    const-string v0, "runLength"

    invoke-virtual {v12}, Lo/xf;->s()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 108
    :cond_f
    invoke-virtual {v12}, Lo/xf;->q()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_10

    .line 109
    const-string v0, "likeCount"

    invoke-virtual {v12}, Lo/xf;->q()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 111
    :cond_10
    invoke-virtual {v12}, Lo/xf;->w()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_11

    .line 112
    const-string v0, "isLiked"

    invoke-virtual {v12}, Lo/xf;->w()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 115
    :cond_11
    invoke-virtual {v12}, Lo/xf;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 116
    const-string v0, "bg_wall"

    invoke-virtual {v12}, Lo/xf;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :cond_12
    invoke-virtual {v12}, Lo/xf;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_13

    .line 120
    const-string v0, "imageURLDownload"

    invoke-virtual {v12}, Lo/xf;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    :cond_13
    invoke-virtual {v12}, Lo/xf;->d()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_14

    .line 123
    const-string v0, "notified_side"

    invoke-virtual {v12}, Lo/xf;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 125
    :cond_14
    invoke-virtual {v12}, Lo/xf;->c()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_15

    .line 127
    const-string v0, "type"

    invoke-virtual {v12}, Lo/xf;->x()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 130
    :cond_15
    invoke-virtual {v12}, Lo/xf;->v()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_16

    .line 131
    const-string v0, "note"

    invoke-virtual {v12}, Lo/xf;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v13, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    :cond_16
    move-object v0, p1

    const-string v1, "socialuser"

    move-object v3, v13

    const-string v4, "huid = ?"

    const/4 v2, 0x1

    new-array v5, v2, [Ljava/lang/String;

    .line 139
    invoke-virtual {v12}, Lo/xf;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v5, v6

    .line 138
    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/wr;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v8, v0

    .line 140
    const-string v0, "PSocial_SocialUserDBInsertAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insertAll count:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 141
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v8

    if-ltz v0, :cond_17

    .line 144
    const-string v0, "socialuser"

    const/4 v1, 0x1

    const/4 v2, 0x5

    invoke-virtual {p1, v0, v1, v13, v2}, Lo/wr;->insertStorageDataWithOnConfict(Ljava/lang/String;ILandroid/content/ContentValues;I)J
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v8

    .line 49
    :cond_17
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_0

    .line 149
    :cond_18
    return-wide v8

    .line 150
    :catch_0
    move-exception v10

    .line 151
    const-string v0, "PSocial_SocialUserDBInsertAllHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insert() Exception="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const-wide/16 v0, -0x1

    return-wide v0
.end method
