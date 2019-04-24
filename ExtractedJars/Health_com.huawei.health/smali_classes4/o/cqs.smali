.class public Lo/cqs;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqs$d;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# instance fields
.field private a:Lo/cpk;

.field private final b:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 118
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cqs;->b:Ljava/lang/Object;

    .line 33
    sget-object v0, Lo/cqs;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/cpk;->d(Landroid/content/Context;)Lo/cpk;

    move-result-object v0

    iput-object v0, p0, Lo/cqs;->a:Lo/cpk;

    .line 34
    return-void
.end method

.method synthetic constructor <init>(Lo/cqs$1;)V
    .locals 0

    .line 24
    invoke-direct {p0}, Lo/cqs;-><init>()V

    return-void
.end method

.method private b(Lcom/huawei/hihealth/HiUserInfo;IIZ)I
    .locals 7

    .line 75
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    if-gtz p2, :cond_1

    .line 77
    :cond_0
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfo values is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x0

    return v0

    .line 80
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getCreateTime()J

    move-result-wide v0

    invoke-virtual {p0, p2}, Lo/cqs;->c(I)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 81
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfo do not need update userInfo , createTime is not new"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const/4 v0, 0x0

    return v0

    .line 84
    :cond_2
    const/4 v4, 0x0

    .line 85
    if-eqz p4, :cond_3

    .line 86
    invoke-static {p1, p3}, Lo/cpi;->e(Lcom/huawei/hihealth/HiUserInfo;I)Landroid/content/ContentValues;

    move-result-object v4

    goto :goto_0

    .line 88
    :cond_3
    invoke-static {p1}, Lo/cpi;->c(Lcom/huawei/hihealth/HiUserInfo;)Landroid/content/ContentValues;

    move-result-object v4

    .line 90
    :goto_0
    const-string v5, "_id =? "

    .line 91
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 92
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    invoke-virtual {v0, v4, v5, v6}, Lo/cpk;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public static b(Landroid/content/Context;)Lo/cqs;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqs;->c:Landroid/content/Context;

    .line 46
    sget-object v0, Lo/cqs$d;->a:Lo/cqs;

    return-object v0
.end method

.method private declared-synchronized e(Lcom/huawei/hihealth/HiUserInfo;I)J
    .locals 6

    monitor-enter p0

    .line 54
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertUserInfo()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 56
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertUserInfo() userInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    monitor-exit p0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 59
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getRelateType()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v4

    .line 60
    if-lez v4, :cond_1

    int-to-long v0, v4

    monitor-exit p0

    return-wide v0

    .line 61
    :cond_1
    invoke-static {p1, p2}, Lo/cpi;->e(Lcom/huawei/hihealth/HiUserInfo;I)Landroid/content/ContentValues;

    move-result-object v5

    .line 62
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    invoke-virtual {v0, v5}, Lo/cpk;->c(Landroid/content/ContentValues;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-wide v0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public a(Lcom/huawei/hihealth/HiUserInfo;II)I
    .locals 7

    .line 99
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 100
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    if-gtz p2, :cond_1

    .line 101
    :cond_0
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfo values is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x0

    return v0

    .line 104
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getCreateTime()J

    move-result-wide v0

    invoke-virtual {p0, p2}, Lo/cqs;->c(I)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 105
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserInfo do not need update userInfo , createTime is not new"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v0, 0x0

    return v0

    .line 108
    :cond_2
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userInfo cloud sync:download height:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " weight:"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " UnitType:"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "UNIT_CM_KG"

    goto :goto_0

    :cond_3
    const-string v2, "UNIT_FT_LB"

    :goto_0
    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    const/high16 v0, 0x30000000

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiUserInfo;->setModifiedIntent(I)V

    .line 110
    invoke-static {p1, p3}, Lo/cpi;->e(Lcom/huawei/hihealth/HiUserInfo;I)Landroid/content/ContentValues;

    move-result-object v4

    .line 111
    const-string v0, "huid"

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 112
    const-string v0, "relate_type"

    invoke-virtual {v4, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 113
    const-string v5, "_id =? "

    .line 114
    const/4 v0, 0x1

    new-array v6, v0, [Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    .line 115
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    invoke-virtual {v0, v4, v5, v6}, Lo/cpk;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public a(I)Ljava/lang/String;
    .locals 9

    .line 201
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryHuidById"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    if-gtz p1, :cond_0

    .line 203
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryHuidById id <=0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 204
    const/4 v0, 0x0

    return-object v0

    .line 206
    :cond_0
    const-string v6, "_id =? "

    .line 207
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 208
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpk;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 209
    const-string v0, "huid"

    invoke-static {v8, v0}, Lo/cph;->h(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/String;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiUserInfo;>;"
        }
    .end annotation

    .line 158
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 160
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryUserInfo() huid = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 161
    const/4 v0, 0x0

    return-object v0

    .line 163
    :cond_0
    const-string v6, "huid =? "

    .line 164
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    .line 165
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpk;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 166
    invoke-static {v8}, Lo/cph;->u(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/huawei/hihealth/HiUserInfo;I)J
    .locals 2

    .line 50
    invoke-direct {p0, p1, p2}, Lo/cqs;->e(Lcom/huawei/hihealth/HiUserInfo;I)J

    move-result-wide v0

    return-wide v0
.end method

.method public b(Lcom/huawei/hihealth/HiUserInfo;Ljava/lang/String;I)Z
    .locals 9

    .line 120
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 121
    iget-object v4, p0, Lo/cqs;->b:Ljava/lang/Object;

    monitor-enter v4

    .line 123
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    :try_start_0
    invoke-static {p2}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 124
    :cond_0
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateUserInfo values is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 125
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 127
    :cond_1
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {p0, p2, v0}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v7

    .line 128
    if-lez v7, :cond_2

    .line 129
    invoke-virtual {p0, p1, v7, p3}, Lo/cqs;->e(Lcom/huawei/hihealth/HiUserInfo;II)I

    move-result v0

    int-to-long v5, v0

    goto :goto_0

    .line 131
    :cond_2
    invoke-direct {p0, p1, p3}, Lo/cqs;->e(Lcom/huawei/hihealth/HiUserInfo;I)J

    move-result-wide v5

    .line 133
    :goto_0
    invoke-static {v5, v6}, Lo/cpn;->c(J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    monitor-exit v4

    return v0

    .line 134
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public c(Lcom/huawei/hihealth/HiUserInfo;I)I
    .locals 2

    .line 69
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;IIZ)I

    move-result v0

    return v0
.end method

.method public c(I)J
    .locals 9

    .line 213
    if-gtz p1, :cond_0

    .line 214
    const-wide/16 v0, 0x0

    return-wide v0

    .line 216
    :cond_0
    const-string v6, "_id =? "

    .line 217
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 218
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpk;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 219
    const-string v0, "create_time"

    invoke-static {v8, v0}, Lo/cph;->i(Landroid/database/Cursor;Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Ljava/lang/String;I)Lcom/huawei/hihealth/HiUserInfo;
    .locals 9

    .line 143
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryUserInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryUserInfo() huid = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    const/4 v0, 0x0

    return-object v0

    .line 148
    :cond_0
    const-string v6, "huid =? and relate_type =?"

    .line 149
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 150
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpk;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 151
    invoke-static {v8}, Lo/cph;->q(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    return-object v0
.end method

.method public d(I)Lcom/huawei/hihealth/HiUserInfo;
    .locals 9

    .line 173
    if-gtz p1, :cond_0

    .line 174
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryUserInfo id <=0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    const/4 v0, 0x0

    return-object v0

    .line 177
    :cond_0
    const-string v6, "_id =? "

    .line 178
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 179
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpk;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 180
    invoke-static {v8}, Lo/cph;->q(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    return-object v0
.end method

.method public d(II)Lcom/huawei/hihealth/HiUserInfo;
    .locals 9

    .line 187
    if-gtz p1, :cond_0

    .line 188
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryUserInfo id <=0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const/4 v0, 0x0

    return-object v0

    .line 191
    :cond_0
    const-string v6, "_id =? and sync_status =? "

    .line 192
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 193
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpk;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 194
    invoke-static {v8}, Lo/cph;->q(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/huawei/hihealth/HiUserInfo;II)I
    .locals 1

    .line 65
    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, p3, v0}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;IIZ)I

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;I)I
    .locals 9

    .line 226
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryUserInfoForUserId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 227
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 228
    const-string v0, "HiH_userInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryUserInfoForUserId() huid = null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    const/4 v0, 0x0

    return v0

    .line 231
    :cond_0
    const-string v6, "huid =? and relate_type =?"

    .line 232
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    const/4 v0, 0x0

    aput-object p1, v7, v0

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 233
    iget-object v0, p0, Lo/cqs;->a:Lo/cpk;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpk;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 235
    const-string v0, "_id"

    invoke-static {v8, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    return v0
.end method
