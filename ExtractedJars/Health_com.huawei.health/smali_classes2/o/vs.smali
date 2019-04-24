.class public Lo/vs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Lo/vs;

.field private static c:Z

.field private static e:Z

.field private static final k:Ljava/lang/Object;


# instance fields
.field private d:Lo/eej;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lo/vs;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/vs;->a:Ljava/lang/String;

    .line 34
    const/4 v0, 0x1

    sput-boolean v0, Lo/vs;->c:Z

    .line 35
    const/4 v0, 0x1

    sput-boolean v0, Lo/vs;->e:Z

    .line 36
    const/4 v0, 0x0

    sput-object v0, Lo/vs;->b:Lo/vs;

    .line 51
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/vs;->k:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput-object v0, p0, Lo/vs;->d:Lo/eej;

    .line 55
    return-void
.end method

.method public static a()Lo/vs;
    .locals 3

    .line 58
    const-class v1, Lo/vs;

    monitor-enter v1

    .line 59
    :try_start_0
    sget-object v0, Lo/vs;->b:Lo/vs;

    if-nez v0, :cond_0

    .line 60
    new-instance v0, Lo/vs;

    invoke-direct {v0}, Lo/vs;-><init>()V

    sput-object v0, Lo/vs;->b:Lo/vs;

    .line 64
    :cond_0
    sget-object v0, Lo/vs;->b:Lo/vs;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 65
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method public static c(Z)V
    .locals 2

    .line 234
    sget-object v0, Lo/vs;->k:Ljava/lang/Object;

    monitor-enter v0

    .line 235
    :try_start_0
    sput-boolean p0, Lo/vs;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 236
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 237
    :goto_0
    return-void
.end method

.method private d(Landroid/content/Context;)V
    .locals 5

    .line 82
    invoke-static {}, Lo/eel;->b()Lo/eel;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eel;->b(Landroid/content/Context;)I

    move-result v4

    .line 83
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "initSocialApi code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 84
    invoke-static {}, Lo/eel;->b()Lo/eel;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x16

    invoke-virtual {v0, v1, v2}, Lo/eel;->e(Landroid/content/Context;I)Lo/eej;

    move-result-object v0

    iput-object v0, p0, Lo/vs;->d:Lo/eej;

    .line 85
    return-void
.end method

.method public static e(Z)V
    .locals 2

    .line 214
    sget-object v0, Lo/vs;->k:Ljava/lang/Object;

    monitor-enter v0

    .line 215
    :try_start_0
    sput-boolean p0, Lo/vs;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 216
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    .line 217
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Landroid/content/Context;)I
    .locals 6

    .line 93
    const/4 v4, -0x1

    .line 94
    invoke-virtual {p0}, Lo/vs;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 95
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter queryUnreadMsgCount remote"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 98
    :try_start_0
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    invoke-interface {v0, p1}, Lo/eej;->b(Lcom/huawei/sns/sdk/modelmsg/CommonReq;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 101
    goto :goto_0

    .line 99
    :catch_0
    move-exception v5

    .line 100
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryUnreadMsgCount1 error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 104
    :cond_0
    :goto_0
    return v4
.end method

.method public a(Landroid/content/Context;)Z
    .locals 7

    .line 240
    const/4 v4, 0x0

    .line 241
    const/4 v5, 0x0

    .line 242
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 243
    return v4

    .line 246
    :cond_0
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.huawei.hwid"

    const/16 v2, 0x40

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5

    .line 248
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 249
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "localPackageInfo.versionCode:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, v5, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 251
    :cond_1
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "localPackageInfo.versionCode null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 254
    :goto_0
    if-eqz v5, :cond_2

    iget v0, v5, Landroid/content/pm/PackageInfo;->versionCode:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const v1, 0x135c52e

    if-lt v0, v1, :cond_2

    .line 255
    const/4 v4, 0x1

    .line 259
    :cond_2
    goto :goto_1

    .line 257
    :catch_0
    move-exception v6

    .line 258
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkHWIDInstalled() meet exception."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Landroid/content/pm/PackageManager$NameNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 260
    :goto_1
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAppInstalled:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 261
    return v4
.end method

.method public b(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Context;)I
    .locals 6

    .line 161
    const/4 v4, -0x1

    .line 162
    invoke-virtual {p0}, Lo/vs;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 163
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter queryUnreadMsgCount remote"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 166
    :try_start_0
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    invoke-interface {v0, p1}, Lo/eej;->d(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 169
    goto :goto_0

    .line 167
    :catch_0
    move-exception v5

    .line 168
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryUnreadMsgCount1 error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    :cond_0
    :goto_0
    return v4
.end method

.method protected b()Ljava/lang/Integer;
    .locals 1

    .line 230
    const/16 v0, 0x3ef

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public c()V
    .locals 1

    .line 192
    const/4 v0, 0x1

    invoke-static {v0}, Lo/vs;->e(Z)V

    .line 193
    const/4 v0, 0x1

    invoke-static {v0}, Lo/vs;->c(Z)V

    .line 194
    return-void
.end method

.method public c(Landroid/content/Context;)V
    .locals 1

    .line 75
    invoke-virtual {p0, p1}, Lo/vs;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 76
    invoke-direct {p0, p1}, Lo/vs;->d(Landroid/content/Context;)V

    .line 79
    :cond_0
    return-void
.end method

.method public d(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Landroid/content/Context;)I
    .locals 3

    .line 141
    const/4 v2, -0x1

    .line 142
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 143
    return v2

    .line 146
    :cond_0
    invoke-virtual {p0}, Lo/vs;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 147
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p1, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->handler:Lo/eeh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 148
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    invoke-interface {v0, p1}, Lo/eej;->d(Lcom/huawei/sns/sdk/modelmsg/CommonReq;)I

    move-result v2

    .line 151
    :cond_1
    return v2
.end method

.method public d()Z
    .locals 5

    .line 223
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lo/vs;->b()Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "need_relogin"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 224
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getNeedNoteRelogin:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    invoke-static {v4}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public e(Lcom/huawei/sns/sdk/modelmsg/CommonReq;Landroid/content/Context;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;
    .locals 6

    .line 113
    new-instance v4, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;

    invoke-direct {v4}, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;-><init>()V

    .line 114
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    invoke-virtual {p1}, Lcom/huawei/sns/sdk/modelmsg/CommonReq;->checkArgs()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 115
    :cond_0
    const/16 v0, 0x9

    iput v0, v4, Lcom/huawei/sns/sdk/modelmsg/FriendListResp;->errorCode:I

    .line 116
    return-object v4

    .line 118
    :cond_1
    invoke-virtual {p0}, Lo/vs;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 119
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 121
    :try_start_0
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    invoke-interface {v0, p1}, Lo/eej;->e(Lcom/huawei/sns/sdk/modelmsg/CommonReq;)Lcom/huawei/sns/sdk/modelmsg/FriendListResp;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 124
    goto :goto_0

    .line 122
    :catch_0
    move-exception v5

    .line 123
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "queryUnreadMsgCount1 error:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 130
    :cond_2
    :goto_0
    return-object v4
.end method

.method public e(Landroid/content/Context;)V
    .locals 5

    .line 180
    invoke-virtual {p0}, Lo/vs;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 181
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter hwid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 182
    new-instance v4, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;

    invoke-direct {v4}, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;-><init>()V

    .line 183
    const/4 v0, 0x1

    iput v0, v4, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->ui:I

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, v4, Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;->transaction:Ljava/lang/String;

    .line 185
    invoke-virtual {p0, v4, p1}, Lo/vs;->b(Lcom/huawei/sns/sdk/modelmsg/ShowUIReq;Landroid/content/Context;)I

    .line 188
    :cond_0
    return-void
.end method

.method public e()Z
    .locals 7

    .line 201
    const/4 v4, 0x0

    .line 202
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 203
    iget-object v0, p0, Lo/vs;->d:Lo/eej;

    invoke-interface {v0}, Lo/eej;->e()Z

    move-result v4

    .line 204
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remoteSdkApi not null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 206
    :cond_0
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "remoteSdkApi is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 208
    :goto_0
    invoke-virtual {p0}, Lo/vs;->d()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    .line 209
    :goto_1
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo/vs;->a(Landroid/content/Context;)Z

    move-result v6

    .line 210
    sget-object v0, Lo/vs;->a:Ljava/lang/String;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isSupported -->res:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " resLocal:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "  needlogin:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 211
    and-int v0, v4, v6

    and-int/2addr v0, v5

    return v0
.end method
