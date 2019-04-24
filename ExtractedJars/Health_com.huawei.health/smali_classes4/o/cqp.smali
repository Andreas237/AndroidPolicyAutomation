.class public Lo/cqp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqp$b;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private c:Lo/cpg;

.field private final d:Ljava/lang/Object;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cqp;->d:Ljava/lang/Object;

    .line 33
    sget-object v0, Lo/cqp;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cpg;->d(Landroid/content/Context;)Lo/cpg;

    move-result-object v0

    iput-object v0, p0, Lo/cqp;->c:Lo/cpg;

    .line 34
    return-void
.end method

.method synthetic constructor <init>(Lo/cqp$1;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/cqp;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiUserPreference;)J
    .locals 5

    .line 75
    const-string v0, "Debug_UserPreferenceManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertUserPreference()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    invoke-static {p1}, Lo/cpi;->e(Lcom/huawei/hihealth/HiUserPreference;)Landroid/content/ContentValues;

    move-result-object v4

    .line 77
    iget-object v0, p0, Lo/cqp;->c:Lo/cpg;

    invoke-virtual {v0, v4}, Lo/cpg;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method private b(Lcom/huawei/hihealth/HiUserPreference;)I
    .locals 6

    .line 81
    invoke-static {p1}, Lo/cpi;->c(Lcom/huawei/hihealth/HiUserPreference;)Landroid/content/ContentValues;

    move-result-object v4

    .line 82
    iget-object v0, p0, Lo/cqp;->c:Lo/cpg;

    invoke-direct {p0}, Lo/cqp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getUserId()I

    move-result v2

    .line 83
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getKey()Ljava/lang/String;

    move-result-object v3

    .line 82
    invoke-direct {p0, v2, v3}, Lo/cqp;->d(ILjava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v1, v2}, Lo/cpg;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 84
    const-string v0, "Debug_UserPreferenceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserPreference() update  update = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    return v5
.end method

.method private b()Ljava/lang/String;
    .locals 1

    .line 126
    const-string v0, "user_id =? "

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/cqp;
    .locals 1

    .line 45
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqp;->e:Landroid/content/Context;

    .line 46
    sget-object v0, Lo/cqp$b;->d:Lo/cqp;

    return-object v0
.end method

.method private b(II)[Ljava/lang/String;
    .locals 3

    .line 134
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method private c()Ljava/lang/String;
    .locals 1

    .line 122
    const-string v0, "user_id =? and sync_status =? "

    return-object v0
.end method

.method private c(I)[Ljava/lang/String;
    .locals 3

    .line 142
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private d(ILjava/lang/String;)[Ljava/lang/String;
    .locals 3

    .line 130
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const/4 v1, 0x1

    aput-object p2, v0, v1

    return-object v0
.end method

.method private e()Ljava/lang/String;
    .locals 1

    .line 118
    const-string v0, "user_id =? and key =? "

    return-object v0
.end method


# virtual methods
.method public a(ILjava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;
    .locals 7

    .line 60
    iget-object v0, p0, Lo/cqp;->c:Lo/cpg;

    invoke-direct {p0}, Lo/cqp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p2}, Lo/cqp;->d(ILjava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpg;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 61
    invoke-static {v6}, Lo/cph;->B(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v0

    return-object v0
.end method

.method public a(II)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)Ljava/util/List<Lcom/huawei/hihealth/HiUserPreference;>;"
        }
    .end annotation

    .line 65
    iget-object v0, p0, Lo/cqp;->c:Lo/cpg;

    invoke-direct {p0}, Lo/cqp;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p2}, Lo/cqp;->b(II)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpg;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 66
    invoke-static {v6}, Lo/cph;->x(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a()V
    .locals 1

    .line 138
    iget-object v0, p0, Lo/cqp;->c:Lo/cpg;

    invoke-virtual {v0}, Lo/cpg;->a()V

    .line 139
    return-void
.end method

.method public d(I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiUserPreference;>;"
        }
    .end annotation

    .line 70
    iget-object v0, p0, Lo/cqp;->c:Lo/cpg;

    invoke-direct {p0}, Lo/cqp;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lo/cqp;->c(I)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cpg;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 71
    invoke-static {v6}, Lo/cph;->x(Landroid/database/Cursor;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/hihealth/HiUserPreference;)Z
    .locals 9

    .line 100
    iget-object v4, p0, Lo/cqp;->d:Ljava/lang/Object;

    monitor-enter v4

    .line 101
    const-string v0, "Debug_UserPreferenceManager"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertOrUpdateUserPreference userPreference is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 103
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    .line 102
    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 104
    :cond_0
    monitor-exit v4

    const/4 v0, 0x0

    return v0

    .line 106
    :cond_1
    const-wide/16 v5, 0x0

    .line 107
    :try_start_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getUserId()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/cqp;->a(ILjava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v7

    .line 108
    if-nez v7, :cond_2

    .line 109
    invoke-direct {p0, p1}, Lo/cqp;->a(Lcom/huawei/hihealth/HiUserPreference;)J

    move-result-wide v5

    goto :goto_0

    .line 111
    :cond_2
    invoke-direct {p0, p1}, Lo/cqp;->b(Lcom/huawei/hihealth/HiUserPreference;)I

    move-result v0

    int-to-long v5, v0

    .line 113
    :goto_0
    invoke-static {v5, v6}, Lo/cpn;->c(J)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    monitor-exit v4

    return v0

    .line 114
    :catchall_0
    move-exception v8

    monitor-exit v4

    throw v8
.end method

.method public e(Lcom/huawei/hihealth/HiUserPreference;I)I
    .locals 6

    .line 89
    new-instance v4, Landroid/content/ContentValues;

    invoke-direct {v4}, Landroid/content/ContentValues;-><init>()V

    .line 90
    const-string v0, "sync_status"

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 91
    iget-object v0, p0, Lo/cqp;->c:Lo/cpg;

    invoke-direct {p0}, Lo/cqp;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getUserId()I

    move-result v2

    .line 92
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserPreference;->getKey()Ljava/lang/String;

    move-result-object v3

    .line 91
    invoke-direct {p0, v2, v3}, Lo/cqp;->d(ILjava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v1, v2}, Lo/cpg;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v5

    .line 93
    const-string v0, "Debug_UserPreferenceManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateUserPreference() update  update = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 94
    return v5
.end method
