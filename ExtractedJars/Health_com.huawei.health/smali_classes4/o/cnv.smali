.class public Lo/cnv;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cnv$d;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# instance fields
.field private b:Lo/cpr;

.field private c:Lo/cqs;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqs;->b(Landroid/content/Context;)Lo/cqs;

    move-result-object v0

    iput-object v0, p0, Lo/cnv;->c:Lo/cqs;

    .line 47
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cpr;->b(Landroid/content/Context;)Lo/cpr;

    move-result-object v0

    iput-object v0, p0, Lo/cnv;->b:Lo/cpr;

    .line 48
    return-void
.end method

.method synthetic constructor <init>(Lo/cnv$5;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Lo/cnv;-><init>()V

    return-void
.end method

.method private declared-synchronized a(Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;)Z
    .locals 11

    monitor-enter p0

    .line 174
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin accountInfo = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 175
    invoke-virtual {p2}, Lo/crd;->d()I

    move-result v4

    .line 176
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {v0, v4}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 177
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v6

    .line 178
    invoke-virtual {p2}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.health"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 179
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cuq;->d(Landroid/content/Context;)Lo/cuq;

    move-result-object v0

    invoke-virtual {v0, v6}, Lo/cuq;->a(Ljava/lang/String;)V

    .line 181
    :cond_0
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 182
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin huid is already login  huid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 183
    monitor-exit p0

    const/4 v0, 0x1

    return v0

    .line 185
    :cond_1
    invoke-virtual {p1, v4}, Lcom/huawei/hihealth/HiAccountInfo;->setAppId(I)V

    .line 186
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 187
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v7

    .line 188
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin oldHuid = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, ",oldUserID = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {v0, v4}, Lo/cpr;->e(I)I

    .line 190
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {v0, p1}, Lo/cpr;->d(Lcom/huawei/hihealth/HiAccountInfo;)Z

    move-result v8

    .line 191
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v9

    .line 192
    if-gtz v9, :cond_2

    .line 193
    new-instance v10, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v10}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 194
    invoke-virtual {v10, v6}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 195
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/hihealth/HiUserInfo;->setRelateType(I)V

    .line 196
    const-wide/16 v0, 0x1

    invoke-virtual {v10, v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 197
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v10, v1}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;I)J

    move-result-wide v0

    long-to-int v9, v0

    .line 199
    :cond_2
    invoke-virtual {p2}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v10

    .line 200
    const-string v0, "HiH_HiUserDataStore"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogin ans = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",newUser = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",oldUser = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",hiHealthContext = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {p2}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x7

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 203
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0, v4, v7, v9}, Lo/cns;->b(Landroid/content/Context;III)V

    .line 206
    :cond_3
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->e(Landroid/content/Context;)V

    .line 207
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 208
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 209
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "hiLogin"

    const/16 v2, 0xc8

    invoke-virtual {v0, v2, v1, p2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 210
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "hiLogin"

    const/16 v2, 0x66

    invoke-virtual {v0, v2, v1, p2}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V

    .line 211
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    const/4 v1, 0x7

    invoke-static {v0, v1}, Lo/cnt;->c(Landroid/content/Context;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    monitor-exit p0

    return v8

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private b(Lcom/huawei/hihealth/HiUserInfo;ILjava/lang/String;Ljava/lang/String;)J
    .locals 6

    .line 133
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getOwerID()I

    move-result v4

    .line 134
    if-ne p2, v4, :cond_0

    .line 135
    const-wide/16 v0, 0x0

    return-wide v0

    .line 137
    :cond_0
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "subUserInfoInsertOrUpdate the default account should not creat userInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 139
    const-wide/16 v0, 0x0

    return-wide v0

    .line 142
    :cond_1
    if-gtz v4, :cond_2

    .line 143
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;I)J

    move-result-wide v0

    return-wide v0

    .line 146
    :cond_2
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    invoke-virtual {v0, v4}, Lo/cqs;->d(I)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object v5

    .line 147
    const/4 v0, 0x0

    if-ne v0, v5, :cond_3

    .line 148
    const-wide/16 v0, 0x0

    return-wide v0

    .line 150
    :cond_3
    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserInfo;->getRelateType()I

    move-result v0

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getRelateType()I

    move-result v1

    if-ne v0, v1, :cond_4

    invoke-virtual {v5}, Lcom/huawei/hihealth/HiUserInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 151
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v4, v1}, Lo/cqs;->e(Lcom/huawei/hihealth/HiUserInfo;II)I

    move-result v0

    int-to-long v0, v0

    return-wide v0

    .line 153
    :cond_4
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method private b(ILcom/huawei/hihealth/HiUserInfo;)V
    .locals 5

    .line 342
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start uploadUserToCloud"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    new-instance v4, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 344
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 345
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 346
    const/16 v0, 0x2715

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 347
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 348
    invoke-virtual {v4, p2}, Lcom/huawei/hihealth/HiSyncOption;->setUserInfo(Lcom/huawei/hihealth/HiUserInfo;)V

    .line 349
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-virtual {v0, v4, p1}, Lo/csk;->d(Lcom/huawei/hihealth/HiSyncOption;I)V

    .line 350
    return-void
.end method

.method private declared-synchronized c(Lcom/huawei/hihealth/HiUserInfo;Lo/crd;)J
    .locals 10

    monitor-enter p0

    .line 68
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 70
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData userInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    monitor-exit p0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 73
    :cond_0
    invoke-virtual {p2}, Lo/crd;->d()I

    move-result v4

    .line 74
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {v0, v4}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v5

    .line 75
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 76
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData huid is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    monitor-exit p0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 81
    :cond_1
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v6

    .line 82
    if-gtz v6, :cond_2

    .line 83
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setUserData the main userInfo is not right"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    monitor-exit p0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 87
    :cond_2
    invoke-virtual {p1, v5}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 90
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getRelateType()I

    move-result v7

    .line 91
    if-gtz v7, :cond_7

    .line 92
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hihealth/HiUserInfo;->setRelateType(I)V

    .line 93
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getModifiedIntent()I

    move-result v0

    const/high16 v1, 0x10000000

    if-eq v0, v1, :cond_3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getCreateTime()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    const/4 v8, 0x1

    goto :goto_0

    :cond_3
    const/4 v8, 0x0

    .line 94
    :goto_0
    if-nez v8, :cond_5

    .line 95
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    invoke-virtual {v0, p1, v6}, Lo/cqs;->c(Lcom/huawei/hihealth/HiUserInfo;I)I

    move-result v9

    .line 96
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData before:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData before:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 98
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cqs;->c(Ljava/lang/String;I)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object p1

    .line 99
    const/4 v0, 0x0

    if-eq v0, p1, :cond_4

    .line 100
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData after:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 101
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData after:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    :cond_4
    int-to-long v0, v9

    monitor-exit p0

    return-wide v0

    .line 105
    :cond_5
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v6, v1}, Lo/cqs;->e(Lcom/huawei/hihealth/HiUserInfo;II)I

    move-result v9

    .line 106
    if-lez v9, :cond_6

    .line 107
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData before:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData before:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 109
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v5, v1}, Lo/cqs;->c(Ljava/lang/String;I)Lcom/huawei/hihealth/HiUserInfo;

    move-result-object p1

    .line 110
    const/4 v0, 0x0

    if-eq v0, p1, :cond_6

    .line 111
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData after:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getBirthday()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getGender()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData after:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getHeight()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getWeight()F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getUnitType()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 113
    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getModifiedIntent()I

    move-result v0

    const/high16 v1, 0x10000000

    if-eq v0, v1, :cond_6

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiUserInfo;->getCreateTime()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_6

    .line 114
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "saveUserData setIfUserFirstSync false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 115
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/csk;->a(Landroid/content/Context;)Lo/csk;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/csk;->d(Ljava/lang/String;Z)V

    .line 116
    invoke-direct {p0, v4, p1}, Lo/cnv;->b(ILcom/huawei/hihealth/HiUserInfo;)V

    .line 120
    :cond_6
    int-to-long v0, v9

    monitor-exit p0

    return-wide v0

    .line 124
    :cond_7
    invoke-virtual {p2}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v6, v5, v0}, Lo/cnv;->b(Lcom/huawei/hihealth/HiUserInfo;ILjava/lang/String;Ljava/lang/String;)J
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

.method public static c(Landroid/content/Context;)Lo/cnv;
    .locals 1

    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cnv;->d:Landroid/content/Context;

    .line 59
    sget-object v0, Lo/cnv$d;->c:Lo/cnv;

    return-object v0
.end method

.method private declared-synchronized d(Lo/crd;)I
    .locals 10

    monitor-enter p0

    .line 225
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x2

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout healthContext = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v4

    .line 227
    invoke-virtual {p1}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v5

    .line 228
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {v0, v4}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v6

    .line 229
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 230
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout old who = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    monitor-exit p0

    const/4 v0, 0x0

    return v0

    .line 233
    :cond_0
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v7

    .line 234
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout oldwho = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {v0, v4}, Lo/cpr;->e(I)I

    move-result v8

    .line 236
    invoke-direct {p0, p1}, Lo/cnv;->e(Lo/crd;)V

    .line 237
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    invoke-virtual {p1}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v9

    .line 238
    const-string v0, "HiH_HiUserDataStore"

    const/16 v1, 0x8

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hiLogout ans = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ",newUser = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, ",oldUser = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, ",packageName = "

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x7

    aput-object v5, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 240
    const-string v0, "com.huawei.health"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0, v4, v7, v9}, Lo/cns;->b(Landroid/content/Context;III)V

    .line 243
    :cond_1
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->e(Landroid/content/Context;)V

    .line 244
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cnt;->a(Landroid/content/Context;I)V

    .line 245
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 246
    invoke-static {}, Lo/cun;->e()Lo/cun;

    move-result-object v0

    const-string v1, "hiLogout"

    const/16 v2, 0xc8

    invoke-virtual {v0, v2, v1, p1}, Lo/cun;->d(ILjava/lang/String;Lo/crd;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 247
    monitor-exit p0

    return v8

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method private e(Lo/crd;)V
    .locals 8

    .line 254
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "loginDefaultAccount"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 255
    invoke-virtual {p1}, Lo/crd;->b()Ljava/lang/String;

    move-result-object v4

    .line 256
    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v5

    .line 257
    if-gtz v5, :cond_0

    .line 258
    return-void

    .line 261
    :cond_0
    new-instance v6, Lcom/huawei/hihealth/HiAccountInfo;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiAccountInfo;-><init>()V

    .line 262
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiAccountInfo;->setLogin(I)V

    .line 263
    invoke-virtual {v6, v5}, Lcom/huawei/hihealth/HiAccountInfo;->setAppId(I)V

    .line 264
    invoke-virtual {v6, v4}, Lcom/huawei/hihealth/HiAccountInfo;->setHuid(Ljava/lang/String;)V

    .line 265
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {v0, v6}, Lo/cpr;->d(Lcom/huawei/hihealth/HiAccountInfo;)Z

    .line 267
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lo/cqs;->e(Ljava/lang/String;I)I

    move-result v0

    if-gtz v0, :cond_1

    .line 268
    new-instance v7, Lcom/huawei/hihealth/HiUserInfo;

    invoke-direct {v7}, Lcom/huawei/hihealth/HiUserInfo;-><init>()V

    .line 269
    invoke-virtual {v6}, Lcom/huawei/hihealth/HiAccountInfo;->getHuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiUserInfo;->setHuid(Ljava/lang/String;)V

    .line 270
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/huawei/hihealth/HiUserInfo;->setRelateType(I)V

    .line 271
    const-wide/16 v0, 0x1

    invoke-virtual {v7, v0, v1}, Lcom/huawei/hihealth/HiUserInfo;->setCreateTime(J)V

    .line 272
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    const/4 v1, 0x0

    invoke-virtual {v0, v7, v1}, Lo/cqs;->b(Lcom/huawei/hihealth/HiUserInfo;I)J

    .line 274
    :cond_1
    return-void
.end method


# virtual methods
.method public b(Lo/crd;)I
    .locals 1

    .line 221
    invoke-direct {p0, p1}, Lo/cnv;->d(Lo/crd;)I

    move-result v0

    return v0
.end method

.method public b(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)Ljava/util/List<Lcom/huawei/hihealth/HiUserInfo;>;"
        }
    .end annotation

    .line 158
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {v0, p1}, Lo/cpr;->b(I)Ljava/lang/String;

    move-result-object v1

    .line 159
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 160
    const/4 v0, 0x0

    return-object v0

    .line 162
    :cond_0
    iget-object v0, p0, Lo/cnv;->c:Lo/cqs;

    invoke-virtual {v0, v1}, Lo/cqs;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c(Lo/crd;)Lcom/huawei/hihealth/HiAccountInfo;
    .locals 5

    .line 281
    iget-object v0, p0, Lo/cnv;->b:Lo/cpr;

    invoke-virtual {p1}, Lo/crd;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lo/cpr;->c(I)Lcom/huawei/hihealth/HiAccountInfo;

    move-result-object v4

    .line 282
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 283
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "fetchAccountInfo accountInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    const/4 v0, 0x0

    return-object v0

    .line 286
    :cond_0
    return-object v4
.end method

.method public c(IILcom/huawei/hihealth/HiGoalInfo;)Z
    .locals 4

    .line 294
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 295
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo goalInfo is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 296
    const/4 v0, 0x0

    return v0

    .line 299
    :cond_0
    invoke-virtual {p3}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalType()I

    move-result v0

    if-nez v0, :cond_1

    .line 300
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo the HiGoalType.GOAL_ALL_READ will not insert or update"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 301
    const/4 v0, 0x0

    return v0

    .line 303
    :cond_1
    if-gtz p1, :cond_3

    .line 304
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0, p2}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result p1

    .line 305
    if-gtz p1, :cond_2

    .line 306
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setGoalInfo userId <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 307
    const/4 v0, 0x0

    return v0

    .line 309
    :cond_2
    invoke-virtual {p3, p1}, Lcom/huawei/hihealth/HiGoalInfo;->setOwnerId(I)V

    .line 310
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p3, v1}, Lo/cqi;->b(Lcom/huawei/hihealth/HiGoalInfo;I)Z

    move-result v0

    return v0

    .line 313
    :cond_3
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {p1, p2, v0}, Lo/cqf;->d(IILandroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 314
    invoke-virtual {p3, p1}, Lcom/huawei/hihealth/HiGoalInfo;->setOwnerId(I)V

    .line 315
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p3, v1}, Lo/cqi;->b(Lcom/huawei/hihealth/HiGoalInfo;I)Z

    move-result v0

    return v0

    .line 317
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public d(Lcom/huawei/hihealth/HiUserInfo;Lo/crd;)J
    .locals 2

    .line 64
    invoke-direct {p0, p1, p2}, Lo/cnv;->c(Lcom/huawei/hihealth/HiUserInfo;Lo/crd;)J

    move-result-wide v0

    return-wide v0
.end method

.method public d(Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;)Z
    .locals 1

    .line 170
    invoke-direct {p0, p1, p2}, Lo/cnv;->a(Lcom/huawei/hihealth/HiAccountInfo;Lo/crd;)Z

    move-result v0

    return v0
.end method

.method public e(III)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III)Ljava/util/List<Lcom/huawei/hihealth/HiGoalInfo;>;"
        }
    .end annotation

    .line 322
    if-gtz p1, :cond_0

    .line 323
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0, p3}, Lo/cqf;->d(Landroid/content/Context;I)I

    move-result p1

    .line 324
    if-gtz p1, :cond_0

    .line 325
    const-string v0, "HiH_HiUserDataStore"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getGoalInfo userId <= 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 326
    const/4 v0, 0x0

    return-object v0

    .line 330
    :cond_0
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {p1, p3, v0}, Lo/cqf;->a(IILandroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 331
    if-nez p2, :cond_1

    .line 332
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v0

    invoke-virtual {v0, p1}, Lo/cqi;->e(I)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 334
    :cond_1
    sget-object v0, Lo/cnv;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cqi;->b(Landroid/content/Context;)Lo/cqi;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lo/cqi;->a(II)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 337
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
