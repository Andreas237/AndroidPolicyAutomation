.class public Lo/xd;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/Object;

.field private static e:Lo/xd;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 24
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/xd;->d:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Lo/xd;
    .locals 4

    .line 29
    sget-object v2, Lo/xd;->d:Ljava/lang/Object;

    monitor-enter v2

    .line 30
    :try_start_0
    sget-object v0, Lo/xd;->e:Lo/xd;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 31
    new-instance v0, Lo/xd;

    invoke-direct {v0}, Lo/xd;-><init>()V

    sput-object v0, Lo/xd;->e:Lo/xd;

    .line 33
    :cond_0
    sget-object v0, Lo/xd;->e:Lo/xd;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 34
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public b(Lo/wr;Lo/xf;)J
    .locals 11

    .line 46
    :try_start_0
    new-instance v8, Landroid/content/ContentValues;

    invoke-direct {v8}, Landroid/content/ContentValues;-><init>()V

    .line 48
    invoke-virtual {p2}, Lo/xf;->f()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    .line 49
    const-string v0, "huid"

    invoke-virtual {p2}, Lo/xf;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 52
    :cond_0
    invoke-virtual {p2}, Lo/xf;->k()S

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 53
    const-string v0, "gender"

    invoke-virtual {p2}, Lo/xf;->k()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    .line 55
    :cond_1
    invoke-virtual {p2}, Lo/xf;->g()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 56
    const-string v0, "status"

    invoke-virtual {p2}, Lo/xf;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    :cond_2
    invoke-virtual {p2}, Lo/xf;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    .line 59
    const-string v0, "need_verify"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2}, Lo/xf;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    :cond_3
    invoke-virtual {p2}, Lo/xf;->h()S

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 62
    invoke-virtual {p2}, Lo/xf;->f()J

    move-result-wide v0

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lo/vu;->a(Landroid/content/Context;)Lo/vu;

    move-result-object v2

    invoke-virtual {v2}, Lo/vu;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/xl;->e(Ljava/lang/String;)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_4

    .line 63
    const-string v0, "userType"

    invoke-virtual {p2}, Lo/xf;->h()S

    move-result v1

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    goto :goto_0

    .line 65
    :cond_4
    const-string v0, "userType"

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Short;)V

    .line 68
    :cond_5
    :goto_0
    invoke-virtual {p2}, Lo/xf;->i()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_6

    .line 69
    const-string v0, "hobbies"

    invoke-virtual {p2}, Lo/xf;->i()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 71
    :cond_6
    invoke-virtual {p2}, Lo/xf;->m()[B

    move-result-object v0

    if-eqz v0, :cond_7

    .line 72
    const-string v0, "image"

    invoke-virtual {p2}, Lo/xf;->m()[B

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    .line 75
    :cond_7
    const-string v0, "PSocial_SocialUserDBInsertHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert()  one"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-virtual {p2}, Lo/xf;->n()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    .line 77
    const-string v0, "inviteMessage"

    invoke-virtual {p2}, Lo/xf;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    :cond_8
    invoke-virtual {p2}, Lo/xf;->p()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_9

    .line 80
    const-string v0, "settings"

    invoke-virtual {p2}, Lo/xf;->p()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 82
    :cond_9
    invoke-virtual {p2}, Lo/xf;->o()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_a

    .line 83
    const-string v0, "age"

    invoke-virtual {p2}, Lo/xf;->o()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 85
    :cond_a
    const-string v0, "PSocial_SocialUserDBInsertHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert()  two"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    invoke-virtual {p2}, Lo/xf;->l()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 88
    const-string v0, "tokenId"

    invoke-virtual {p2}, Lo/xf;->l()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    :cond_b
    invoke-virtual {p2}, Lo/xf;->u()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_c

    .line 91
    const-string v0, "height"

    invoke-virtual {p2}, Lo/xf;->u()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 94
    :cond_c
    invoke-virtual {p2}, Lo/xf;->r()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_d

    .line 95
    const-string v0, "weight"

    invoke-virtual {p2}, Lo/xf;->r()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 97
    :cond_d
    const-string v0, "PSocial_SocialUserDBInsertHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert()  three"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    invoke-virtual {p2}, Lo/xf;->t()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_e

    .line 99
    const-string v0, "stepLength"

    invoke-virtual {p2}, Lo/xf;->t()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 101
    :cond_e
    invoke-virtual {p2}, Lo/xf;->s()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_f

    .line 102
    const-string v0, "runLength"

    invoke-virtual {p2}, Lo/xf;->s()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 104
    :cond_f
    invoke-virtual {p2}, Lo/xf;->q()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_10

    .line 105
    const-string v0, "likeCount"

    invoke-virtual {p2}, Lo/xf;->q()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 107
    :cond_10
    const-string v0, "PSocial_SocialUserDBInsertHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert()  four"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    invoke-virtual {p2}, Lo/xf;->w()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_11

    .line 109
    const-string v0, "isLiked"

    invoke-virtual {p2}, Lo/xf;->w()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 113
    :cond_11
    invoke-virtual {p2}, Lo/xf;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_12

    .line 115
    const-string v0, "bg_wall"

    invoke-virtual {p2}, Lo/xf;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    :cond_12
    invoke-virtual {p2}, Lo/xf;->b()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_13

    .line 119
    const-string v0, "need_verify"

    invoke-virtual {p2}, Lo/xf;->b()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 121
    :cond_13
    const-string v0, "PSocial_SocialUserDBInsertHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert()  five"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    invoke-virtual {p2}, Lo/xf;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 123
    const-string v0, "imageURLDownload"

    invoke-virtual {p2}, Lo/xf;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    :cond_14
    invoke-virtual {p2}, Lo/xf;->d()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_15

    .line 126
    const-string v0, "notified_side"

    invoke-virtual {p2}, Lo/xf;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 128
    :cond_15
    invoke-virtual {p2}, Lo/xf;->c()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_16

    .line 129
    const-string v0, "notified_side"

    invoke-virtual {p2}, Lo/xf;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 131
    :cond_16
    const-string v0, "PSocial_SocialUserDBInsertHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert()  six"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    invoke-virtual {p2}, Lo/xf;->v()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 133
    const-string v0, "note"

    invoke-virtual {p2}, Lo/xf;->v()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 138
    :cond_17
    move-object v0, p1

    const-string v1, "socialuser"

    move-object v3, v8

    const-string v4, "huid = ?"

    const/4 v2, 0x1

    new-array v5, v2, [Ljava/lang/String;

    invoke-virtual {p2}, Lo/xf;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    aput-object v2, v5, v6

    const/4 v2, 0x1

    invoke-virtual/range {v0 .. v5}, Lo/wr;->updateStorageData(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    int-to-long v9, v0

    .line 139
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v9

    if-ltz v0, :cond_18

    .line 143
    const-string v0, "socialuser"

    const/4 v1, 0x1

    const/4 v2, 0x5

    invoke-virtual {p1, v0, v1, v8, v2}, Lo/wr;->insertStorageDataWithOnConfict(Ljava/lang/String;ILandroid/content/ContentValues;I)J
    :try_end_0
    .catch Lnet/sqlcipher/database/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v9

    .line 149
    :cond_18
    return-wide v9

    .line 150
    :catch_0
    move-exception v8

    .line 152
    const-string v0, "PSocial_SocialUserDBInsertHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insert -->ERROR:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Lnet/sqlcipher/database/SQLiteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 155
    const-wide/16 v0, -0x1

    return-wide v0
.end method
