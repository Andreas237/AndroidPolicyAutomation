.class public Lo/cqi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqi$e;
    }
.end annotation


# static fields
.field private static a:Landroid/content/Context;


# instance fields
.field private final c:Ljava/lang/Object;

.field private d:Lo/col;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 161
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cqi;->c:Ljava/lang/Object;

    .line 31
    sget-object v0, Lo/cqi;->a:Landroid/content/Context;

    invoke-static {v0}, Lo/col;->b(Landroid/content/Context;)Lo/col;

    move-result-object v0

    iput-object v0, p0, Lo/cqi;->d:Lo/col;

    .line 32
    return-void
.end method

.method synthetic constructor <init>(Lo/cqi$2;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/cqi;-><init>()V

    return-void
.end method

.method private b(I)Landroid/database/Cursor;
    .locals 8

    .line 64
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryGoalInfoCursor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    if-gtz p1, :cond_0

    .line 66
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no such userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 67
    const/4 v0, 0x0

    return-object v0

    .line 69
    :cond_0
    const-string v6, "user_id =?"

    .line 70
    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    .line 71
    iget-object v0, p0, Lo/cqi;->d:Lo/col;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/col;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/cqi;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqi;->a:Landroid/content/Context;

    .line 44
    sget-object v0, Lo/cqi$e;->d:Lo/cqi;

    return-object v0
.end method

.method private declared-synchronized c(Lcom/huawei/hihealth/HiGoalInfo;I)Z
    .locals 4

    monitor-enter p0

    .line 186
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 187
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDefaultAccountGoals goalInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 188
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 190
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getOwnerId()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lo/cqi;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 191
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDefaultAccountGoals goalInfo exist, do not need move"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 194
    :cond_1
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertDefaultAccountGoals start move goals"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 195
    invoke-direct {p0, p1, p2}, Lo/cqi;->e(Lcom/huawei/hihealth/HiGoalInfo;I)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cpn;->c(J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private d(Lcom/huawei/hihealth/HiGoalInfo;I)I
    .locals 8

    .line 122
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateGoalInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 124
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateGoalInfo goalInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 125
    const/4 v0, 0x0

    return v0

    .line 127
    :cond_0
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getOwnerId()I

    move-result v4

    .line 128
    invoke-static {p1, p2}, Lo/cpi;->b(Lcom/huawei/hihealth/HiGoalInfo;I)Landroid/content/ContentValues;

    move-result-object v5

    .line 129
    const-string v6, "user_id =? and goal_type = ?"

    .line 130
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 131
    iget-object v0, p0, Lo/cqi;->d:Lo/col;

    invoke-virtual {v0, v5, v6, v7}, Lo/col;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private d(II)Landroid/database/Cursor;
    .locals 8

    .line 53
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryGoalInfoCursor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    if-gtz p1, :cond_0

    .line 55
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no such userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    const/4 v0, 0x0

    return-object v0

    .line 58
    :cond_0
    const-string v6, "user_id =? and goal_type=?"

    .line 59
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

    .line 60
    iget-object v0, p0, Lo/cqi;->d:Lo/col;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/col;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private e(Lcom/huawei/hihealth/HiGoalInfo;I)J
    .locals 5

    .line 149
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertGoalInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 151
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertGoalInfo goalInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const-wide/16 v0, 0x0

    return-wide v0

    .line 154
    :cond_0
    invoke-static {p1, p2}, Lo/cpi;->b(Lcom/huawei/hihealth/HiGoalInfo;I)Landroid/content/ContentValues;

    move-result-object v4

    .line 155
    iget-object v0, p0, Lo/cqi;->d:Lo/col;

    invoke-virtual {v0, v4}, Lo/col;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public a(II)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation

    .line 78
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryGoalInfoCursor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 79
    invoke-direct {p0, p1, p2}, Lo/cqi;->d(II)Landroid/database/Cursor;

    move-result-object v4

    .line 80
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 81
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no such userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const/4 v0, 0x0

    return-object v0

    .line 84
    :cond_0
    invoke-static {v4}, Lo/cph;->v(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/huawei/hihealth/HiGoalInfo;I)Z
    .locals 1

    .line 181
    invoke-direct {p0, p1, p2}, Lo/cqi;->c(Lcom/huawei/hihealth/HiGoalInfo;I)Z

    move-result v0

    return v0
.end method

.method public b(III)I
    .locals 7

    .line 135
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSyncGoalInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    if-gtz p1, :cond_0

    .line 137
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateSyncGoalInfo who is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    const/4 v0, 0x0

    return v0

    .line 140
    :cond_0
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 141
    const-string v0, "sync_status"

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 142
    const-string v5, "user_id =? and goal_type = ?"

    .line 143
    const/4 v0, 0x2

    new-array v6, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v6, v1

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v6, v1

    .line 144
    iget-object v0, p0, Lo/cqi;->d:Lo/col;

    invoke-virtual {v0, v4, v5, v6}, Lo/col;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(II)Z
    .locals 5

    .line 113
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryGoalInfoExist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    invoke-direct {p0, p1, p2}, Lo/cqi;->d(II)Landroid/database/Cursor;

    move-result-object v4

    .line 115
    invoke-static {v4}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/huawei/hihealth/HiGoalInfo;I)Z
    .locals 8

    .line 163
    iget-object v4, p0, Lo/cqi;->c:Ljava/lang/Object;

    monitor-enter v4

    .line 165
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateGoalInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 167
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateGoalInfo goalInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 170
    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getOwnerId()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lo/cqi;->b(II)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 171
    invoke-direct {p0, p1, p2}, Lo/cqi;->d(Lcom/huawei/hihealth/HiGoalInfo;I)I

    move-result v0

    int-to-long v5, v0

    goto :goto_0

    .line 173
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/cqi;->e(Lcom/huawei/hihealth/HiGoalInfo;I)J

    move-result-wide v5

    .line 176
    :goto_0
    invoke-static {v5, v6}, Lo/cpn;->c(J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    monitor-exit v4

    return v0

    .line 177
    :catchall_0
    move-exception v7

    monitor-exit v4

    throw v7
.end method

.method public c(II)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation

    .line 98
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryGoalInfoCursor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    if-gtz p1, :cond_0

    .line 100
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no such userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const/4 v0, 0x0

    return-object v0

    .line 103
    :cond_0
    const-string v6, "user_id =? and sync_status =? "

    .line 104
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

    .line 105
    iget-object v0, p0, Lo/cqi;->d:Lo/col;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/col;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 106
    invoke-static {v8}, Lo/cph;->v(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation

    .line 88
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryGoalInfoCursor"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 89
    invoke-direct {p0, p1}, Lo/cqi;->b(I)Landroid/database/Cursor;

    move-result-object v4

    .line 90
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 91
    const-string v0, "Debug_GoalInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no such userId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    const/4 v0, 0x0

    return-object v0

    .line 94
    :cond_0
    invoke-static {v4}, Lo/cph;->v(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
