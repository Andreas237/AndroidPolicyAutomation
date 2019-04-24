.class public Lo/cpr;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cpr$a;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# instance fields
.field private c:Lo/cod;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    sget-object v0, Lo/cpr;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cod;->b(Landroid/content/Context;)Lo/cod;

    move-result-object v0

    iput-object v0, p0, Lo/cpr;->c:Lo/cod;

    .line 30
    return-void
.end method

.method synthetic constructor <init>(Lo/cpr$1;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lo/cpr;-><init>()V

    return-void
.end method

.method private a(Lcom/huawei/hihealth/HiAccountInfo;)J
    .locals 5

    .line 113
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertAccountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 114
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 115
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertAccountInfo accountInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const-wide/16 v0, 0x0

    return-wide v0

    .line 118
    :cond_0
    invoke-static {p1}, Lo/cpi;->b(Lcom/huawei/hihealth/HiAccountInfo;)Landroid/content/ContentValues;

    move-result-object v4

    .line 119
    iget-object v0, p0, Lo/cpr;->c:Lo/cod;

    invoke-virtual {v0, v4}, Lo/cod;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static b(Landroid/content/Context;)Lo/cpr;
    .locals 1

    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cpr;->d:Landroid/content/Context;

    .line 42
    sget-object v0, Lo/cpr$a;->d:Lo/cpr;

    return-object v0
.end method

.method private declared-synchronized c(Lcom/huawei/hihealth/HiAccountInfo;)Z
    .locals 6

    monitor-enter p0

    .line 54
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertAccountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAccountInfo;->getAppId()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/cpr;->b(ILjava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-direct {p0, p1}, Lo/cpr;->e(Lcom/huawei/hihealth/HiAccountInfo;)I

    move-result v0

    int-to-long v4, v0

    goto :goto_0

    .line 59
    :cond_0
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertAccountInfo insert new accountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    invoke-direct {p0, p1}, Lo/cpr;->a(Lcom/huawei/hihealth/HiAccountInfo;)J

    move-result-wide v4

    .line 62
    :goto_0
    invoke-static {v4, v5}, Lo/cpn;->c(J)Z
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

.method private declared-synchronized d(I)I
    .locals 5

    monitor-enter p0

    .line 165
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logoutByAppId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 166
    invoke-virtual {p0, p1}, Lo/cpr;->c(I)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v4

    .line 167
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 168
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logoutByAppId the account is not exist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    monitor-exit p0

    const/4 v0, -0x1

    return v0

    .line 171
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 172
    invoke-direct {p0, v4}, Lo/cpr;->e(Lcom/huawei/hihealth/HiAccountInfo;)I
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

.method private d(ILjava/lang/String;)Landroid/database/Cursor;
    .locals 8

    .line 82
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryAccountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    invoke-static {p2}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    if-gtz p1, :cond_1

    .line 84
    :cond_0
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryAccountInfo parameter is wrong!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    const/4 v0, 0x0

    return-object v0

    .line 87
    :cond_1
    const-string v6, "app_id =? and huid =?"

    .line 88
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x1

    aput-object p2, v7, v0

    .line 89
    iget-object v0, p0, Lo/cpr;->c:Lo/cod;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cod;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    return-object v0
.end method

.method private e(Lcom/huawei/hihealth/HiAccountInfo;)I
    .locals 8

    .line 96
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateAccountInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    :cond_0
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateAccountInfo accountInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 99
    const/4 v0, 0x0

    return v0

    .line 101
    :cond_1
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAccountInfo;->getAppId()I

    move-result v4

    .line 102
    invoke-static {p1}, Lo/cpi;->b(Lcom/huawei/hihealth/HiAccountInfo;)Landroid/content/ContentValues;

    move-result-object v5

    .line 103
    const-string v0, "create_time"

    invoke-virtual {v5, v0}, Landroid/content/ContentValues;->remove(Ljava/lang/String;)V

    .line 104
    const-string v6, "app_id =? and huid =?"

    .line 105
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 106
    iget-object v0, p0, Lo/cpr;->c:Lo/cod;

    invoke-virtual {v0, v5, v6, v7}, Lo/cod;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method


# virtual methods
.method public b(I)Ljava/lang/String;
    .locals 9

    .line 146
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHuidByAppId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 147
    if-gtz p1, :cond_0

    .line 148
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHuidByAppId appId is not right!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    const/4 v0, 0x0

    return-object v0

    .line 151
    :cond_0
    const-string v6, "app_id =? and is_login =? "

    .line 152
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 153
    iget-object v0, p0, Lo/cpr;->c:Lo/cod;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cod;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 154
    const-string v0, "huid"

    invoke-static {v8, v0}, Lo/cph;->h(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b(ILjava/lang/String;)Z
    .locals 5

    .line 69
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryAccountInfoExist"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    invoke-static {p2}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    if-gtz p1, :cond_1

    .line 71
    :cond_0
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryAccountInfoExist parameter is wrong"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 72
    const/4 v0, 0x0

    return v0

    .line 74
    :cond_1
    invoke-direct {p0, p1, p2}, Lo/cpr;->d(ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    .line 75
    invoke-static {v4}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method

.method public c(I)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 9

    .line 126
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccountInfoByAppId"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 127
    if-gez p1, :cond_0

    .line 128
    const-string v0, "Debug_AccountInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAccountInfoByAppId appId is not right!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 129
    const/4 v0, 0x0

    return-object v0

    .line 131
    :cond_0
    const-string v6, "app_id =? and is_login =? "

    .line 132
    const/4 v0, 0x2

    new-array v7, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v7, v1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v7, v1

    .line 133
    iget-object v0, p0, Lo/cpr;->c:Lo/cod;

    move-object v1, v6

    move-object v2, v7

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cod;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    .line 134
    invoke-static {v8}, Lo/cph;->t(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v0

    return-object v0
.end method

.method public c(ILjava/lang/String;)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 1

    .line 138
    invoke-direct {p0, p1, p2}, Lo/cpr;->d(ILjava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    invoke-static {v0}, Lo/cph;->t(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/huawei/hihealth/HiAccountInfo;)Z
    .locals 1

    .line 47
    invoke-direct {p0, p1}, Lo/cpr;->c(Lcom/huawei/hihealth/HiAccountInfo;)Z

    move-result v0

    return v0
.end method

.method public e(I)I
    .locals 1

    .line 158
    invoke-direct {p0, p1}, Lo/cpr;->d(I)I

    move-result v0

    return v0
.end method
