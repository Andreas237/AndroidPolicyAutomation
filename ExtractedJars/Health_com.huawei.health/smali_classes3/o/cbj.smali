.class public final Lo/cbj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ebe;


# static fields
.field private static volatile d:Lo/cbj;


# instance fields
.field private b:Ljava/util/concurrent/CountDownLatch;

.field private e:I


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    const/4 v0, 0x0

    iput v0, p0, Lo/cbj;->e:I

    .line 47
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/ebm;->c(Z)V

    .line 50
    :cond_0
    return-void
.end method

.method public static d()Lo/cbj;
    .locals 4

    .line 34
    sget-object v0, Lo/cbj;->d:Lo/cbj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 35
    const-class v2, Lo/cbj;

    monitor-enter v2

    .line 36
    :try_start_0
    sget-object v0, Lo/cbj;->d:Lo/cbj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 37
    new-instance v0, Lo/cbj;

    invoke-direct {v0}, Lo/cbj;-><init>()V

    sput-object v0, Lo/cbj;->d:Lo/cbj;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 42
    :cond_1
    :goto_0
    sget-object v0, Lo/cbj;->d:Lo/cbj;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 174
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    return-void

    .line 178
    :cond_0
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebm;->d()V

    .line 179
    return-void
.end method

.method public a(II)V
    .locals 4

    .line 205
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopDownloadProgress taskNo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", reason="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    return-void
.end method

.method public a(Landroid/content/Context;Landroid/os/Handler;)V
    .locals 8

    .line 138
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 139
    return-void

    .line 142
    :cond_0
    iget v4, p0, Lo/cbj;->e:I

    .line 143
    const/4 v0, 0x0

    iput v0, p0, Lo/cbj;->e:I

    .line 146
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 147
    return-void

    .line 150
    :cond_1
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkUpdateStatus="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/16 v1, 0x96

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, 0x7f02023f

    invoke-virtual {p1, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    .line 153
    new-instance v0, Lo/egy$b;

    invoke-direct {v0, p1}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v5, v1, v2

    .line 154
    const v2, 0x7f020259

    invoke-virtual {p1, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lo/cbj$2;

    invoke-direct {v1, p0, p2}, Lo/cbj$2;-><init>(Lo/cbj;Landroid/os/Handler;)V

    .line 155
    const v2, 0x7f020258

    invoke-virtual {v0, v2, v1}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    new-instance v1, Lo/cbj$5;

    invoke-direct {v1, p0}, Lo/cbj$5;-><init>(Lo/cbj;)V

    .line 162
    const v2, 0x7f020202

    invoke-virtual {v0, v2, v1}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v6

    .line 167
    invoke-virtual {v6}, Lo/egy$b;->a()Lo/egy;

    move-result-object v7

    .line 168
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/egy;->setCancelable(Z)V

    .line 169
    invoke-virtual {v7}, Lo/egy;->show()V

    .line 170
    return-void
.end method

.method public b(II)V
    .locals 4

    .line 200
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showDownloadProgress taskNo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", progress="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 201
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 195
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startDownloadProgress taskNo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 196
    return-void
.end method

.method public c(ILjava/lang/String;I)V
    .locals 5

    .line 183
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDownloadPluginResult taskNo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, ", uuid="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object p2, v1, v2

    const-string v2, ", result="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 185
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0, p2}, Lo/ebm;->d(Ljava/lang/String;)V

    .line 187
    iget-object v4, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    .line 188
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 189
    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 191
    :cond_0
    return-void
.end method

.method public c()Z
    .locals 1

    .line 92
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    const/4 v0, 0x1

    return v0

    .line 96
    :cond_0
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebm;->e()Z

    move-result v0

    return v0
.end method

.method public d(I)V
    .locals 7

    .line 101
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 102
    return-void

    .line 105
    :cond_0
    iget-object v4, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    .line 106
    const/4 v0, 0x0

    if-ne v0, v4, :cond_3

    .line 108
    iget v0, p0, Lo/cbj;->e:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 109
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebm;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/4 v0, -0x2

    :goto_0
    iput v0, p0, Lo/cbj;->e:I

    .line 111
    :cond_2
    return-void

    .line 115
    :cond_3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_4

    .line 116
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "this is mainthread, waitUpdate thread error."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 117
    new-instance v0, Ljava/lang/IllegalThreadStateException;

    const-string v1, "waitUpdate not allow InMainThread, please use this in new thread!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalThreadStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 121
    :cond_4
    const/4 v5, 0x1

    .line 123
    :try_start_0
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebm;->e()Z

    move-result v0

    if-nez v0, :cond_6

    .line 124
    if-gez p1, :cond_5

    const/16 v0, 0x2710

    goto :goto_1

    :cond_5
    move v0, p1

    :goto_1
    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v4, v0, v1, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    move-result v5

    .line 126
    :cond_6
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wait language package update complete. bTimeout="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    if-nez v5, :cond_7

    const/4 v2, 0x1

    goto :goto_2

    :cond_7
    const/4 v2, 0x0

    :goto_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    .line 131
    goto :goto_3

    .line 127
    :catch_0
    move-exception v5

    .line 128
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 130
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    .line 131
    goto :goto_3

    .line 130
    :catchall_0
    move-exception v6

    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    .line 131
    throw v6

    .line 133
    :goto_3
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebm;->e()Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x0

    goto :goto_4

    :cond_8
    const/4 v0, -0x2

    :goto_4
    iput v0, p0, Lo/cbj;->e:I

    .line 134
    return-void
.end method

.method public e(Landroid/content/Context;Z)V
    .locals 6

    .line 54
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 55
    return-void

    .line 59
    :cond_0
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    invoke-virtual {v0}, Lo/ebm;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 60
    return-void

    .line 64
    :cond_1
    iget-object v0, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 65
    return-void

    .line 69
    :cond_2
    invoke-static {p1}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 70
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNetworkConnected=false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    const/4 v0, -0x1

    iput v0, p0, Lo/cbj;->e:I

    .line 72
    return-void

    .line 75
    :cond_3
    if-eqz p2, :cond_4

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    .line 77
    invoke-static {}, Lo/ebm;->a()Lo/ebm;

    move-result-object v0

    const/16 v1, 0x2710

    invoke-virtual {v0, v1, p0}, Lo/ebm;->c(ILo/ebe;)I

    move-result v4

    .line 78
    const-string v0, "Login_LanguageUpdate"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "start updateLanguagePackage taskNo="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    if-gtz v4, :cond_5

    .line 82
    iget-object v5, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    .line 83
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cbj;->b:Ljava/util/concurrent/CountDownLatch;

    .line 84
    const/4 v0, 0x0

    if-eq v0, v5, :cond_5

    .line 85
    invoke-virtual {v5}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 88
    :cond_5
    return-void
.end method
