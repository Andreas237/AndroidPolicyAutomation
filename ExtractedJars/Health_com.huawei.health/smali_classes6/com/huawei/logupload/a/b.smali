.class public final Lcom/huawei/logupload/a/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lcom/huawei/logupload/a/b;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/logupload/a/b;->e:Lcom/huawei/logupload/a/b;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    const-string v0, "sys_setting"

    iput-object v0, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 19
    const-string v0, "feedback"

    iput-object v0, p0, Lcom/huawei/logupload/a/b;->b:Ljava/lang/String;

    .line 21
    const-string v0, "autocheck_policy"

    iput-object v0, p0, Lcom/huawei/logupload/a/b;->c:Ljava/lang/String;

    .line 23
    const-string v0, "autocheck_starttime"

    iput-object v0, p0, Lcom/huawei/logupload/a/b;->d:Ljava/lang/String;

    .line 43
    return-void
.end method

.method public static declared-synchronized a()Lcom/huawei/logupload/a/b;
    .locals 3

    const-class v1, Lcom/huawei/logupload/a/b;

    monitor-enter v1

    .line 33
    :try_start_0
    sget-object v0, Lcom/huawei/logupload/a/b;->e:Lcom/huawei/logupload/a/b;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Lcom/huawei/logupload/a/b;

    invoke-direct {v0}, Lcom/huawei/logupload/a/b;-><init>()V

    sput-object v0, Lcom/huawei/logupload/a/b;->e:Lcom/huawei/logupload/a/b;

    .line 37
    :cond_0
    sget-object v0, Lcom/huawei/logupload/a/b;->e:Lcom/huawei/logupload/a/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a(I)V
    .locals 4

    .line 161
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 162
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/logupload/a/b;->b:Ljava/lang/String;

    .line 162
    .line 163
    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 161
    .line 164
    if-eqz v3, :cond_0

    .line 165
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/logupload/a/b;->c:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 167
    :cond_0
    return-void
.end method

.method public a(J)V
    .locals 4

    .line 174
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 175
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/logupload/a/b;->b:Ljava/lang/String;

    .line 175
    .line 176
    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 174
    .line 177
    if-eqz v3, :cond_0

    .line 178
    const-string v0, "AppLogApi"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setAutoCheckTime\u65e5\u5fd7\u5206setAutoCheckTime"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->c(Ljava/lang/String;Ljava/lang/String;)I

    .line 179
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/logupload/a/b;->d:Ljava/lang/String;

    invoke-interface {v0, v1, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 181
    :cond_0
    return-void
.end method

.method public declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    monitor-enter p0

    .line 134
    .line 135
    :try_start_0
    iget-object v0, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 135
    .line 136
    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 134
    .line 137
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "policy_time"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 138
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setPolicyPauseTime = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Landroid/content/Context;Z)V
    .locals 4

    monitor-enter p0

    .line 102
    .line 103
    :try_start_0
    iget-object v0, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 103
    .line 104
    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 102
    .line 105
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "policy_status"

    invoke-interface {v0, v1, p2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 106
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setPolicyPauseUploadStatus = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 107
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 4

    monitor-enter p0

    .line 125
    :try_start_0
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 126
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    .line 127
    iget-object v1, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 127
    .line 128
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 125
    .line 129
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "policy_time"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 130
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setPolicyPauseTime = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Z)V
    .locals 4

    monitor-enter p0

    .line 93
    :try_start_0
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 94
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    .line 95
    iget-object v1, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 95
    .line 96
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 93
    .line 97
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "policy_status"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 98
    const-string v0, "LogUpload Service"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "setPolicyPauseUploadStatus = "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/logupload/c/g;->b(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Landroid/content/Context;)Z
    .locals 3

    monitor-enter p0

    .line 118
    .line 119
    :try_start_0
    iget-object v0, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 119
    .line 120
    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 118
    .line 121
    const-string v0, "policy_status"

    const/4 v1, 0x0

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
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

.method public declared-synchronized b(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    monitor-enter p0

    .line 150
    .line 151
    :try_start_0
    iget-object v0, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 151
    .line 152
    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    .line 150
    .line 153
    const-string v0, "policy_time"

    const-string v1, ""

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b()Z
    .locals 4

    monitor-enter p0

    .line 110
    :try_start_0
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 111
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    .line 112
    iget-object v1, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 112
    .line 113
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 110
    .line 114
    const-string v0, "policy_status"

    const/4 v1, 0x0

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    monitor-exit p0

    return v0

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method

.method public declared-synchronized c()Ljava/lang/String;
    .locals 4

    monitor-enter p0

    .line 142
    :try_start_0
    invoke-static {}, Lcom/huawei/logupload/c/b;->a()Lcom/huawei/logupload/c/b;

    move-result-object v0

    .line 143
    invoke-virtual {v0}, Lcom/huawei/logupload/c/b;->b()Landroid/app/Application;

    move-result-object v0

    .line 144
    iget-object v1, p0, Lcom/huawei/logupload/a/b;->a:Ljava/lang/String;

    .line 144
    .line 145
    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/Application;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v3

    .line 142
    .line 146
    const-string v0, "policy_time"

    const-string v1, ""

    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v3

    monitor-exit p0

    throw v3
.end method
