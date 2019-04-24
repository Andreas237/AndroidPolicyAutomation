.class public final Lo/eel;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static e:Lo/eel;


# instance fields
.field private a:Lo/eek;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/String;

.field private d:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Lo/eel;

    invoke-direct {v0}, Lo/eel;-><init>()V

    sput-object v0, Lo/eel;->e:Lo/eel;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lo/eel;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 61
    return-void
.end method

.method static a(Landroid/content/Context;)Landroid/content/pm/PackageInfo;
    .locals 5

    .line 192
    const/4 v3, 0x0

    .line 193
    if-nez p0, :cond_0

    .line 195
    return-object v3

    .line 200
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "com.huawei.hwid"

    const/16 v2, 0x40

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 206
    goto :goto_0

    .line 203
    :catch_0
    move-exception v4

    .line 205
    const-string v0, "SNS_API"

    const-string v1, "checkHWIDInstalled() meet exception."

    invoke-static {v0, v1, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 208
    :goto_0
    return-object v3
.end method

.method public static b()Lo/eel;
    .locals 1

    .line 80
    sget-object v0, Lo/eel;->e:Lo/eel;

    return-object v0
.end method

.method static e(Landroid/content/Context;)Z
    .locals 4

    .line 175
    const/4 v2, 0x0

    .line 176
    invoke-static {p0}, Lo/eel;->a(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 177
    if-eqz v3, :cond_0

    iget v0, v3, Landroid/content/pm/PackageInfo;->versionCode:I

    const v1, 0x132b468

    if-lt v0, v1, :cond_0

    .line 179
    const/4 v2, 0x1

    .line 181
    :cond_0
    return v2
.end method


# virtual methods
.method public b(Landroid/content/Context;)I
    .locals 4

    .line 90
    if-nez p1, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Null argument context."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 95
    :cond_0
    invoke-static {p1}, Lo/eel;->e(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 97
    const/4 v0, 0x4

    return v0

    .line 100
    :cond_1
    iget-object v0, p0, Lo/eel;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 102
    const/4 v0, 0x0

    return v0

    .line 105
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/eel;->b:Landroid/content/Context;

    .line 107
    iget-object v0, p0, Lo/eel;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/eel;->c:Ljava/lang/String;

    .line 109
    new-instance v0, Lo/eek;

    iget-object v1, p0, Lo/eel;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/eel;->c:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Lo/eek;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lo/eel;->a:Lo/eek;

    .line 112
    :try_start_0
    iget-object v0, p0, Lo/eel;->a:Lo/eek;

    invoke-virtual {v0}, Lo/eek;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    goto :goto_0

    .line 114
    :catch_0
    move-exception v3

    .line 116
    const-string v0, "SNS_API"

    const-string v1, "SNSAPIFactory.init bind aidl meet exception!"

    invoke-static {v0, v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 117
    instance-of v0, v3, Ljava/lang/SecurityException;

    if-eqz v0, :cond_3

    .line 119
    iget-object v0, p0, Lo/eel;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 120
    const/4 v0, 0x0

    iput-object v0, p0, Lo/eel;->a:Lo/eek;

    .line 122
    const/16 v0, 0xe

    return v0

    .line 125
    :cond_3
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public e(Landroid/content/Context;I)Lo/eej;
    .locals 3

    .line 137
    if-eqz p1, :cond_0

    iget-object v0, p0, Lo/eel;->a:Lo/eek;

    if-eqz v0, :cond_0

    if-gez p2, :cond_1

    .line 139
    :cond_0
    const/4 v0, 0x0

    return-object v0

    .line 141
    :cond_1
    new-instance v0, Lo/eem;

    iget-object v1, p0, Lo/eel;->a:Lo/eek;

    iget-object v2, p0, Lo/eel;->c:Ljava/lang/String;

    invoke-direct {v0, p1, v1, p2, v2}, Lo/eem;-><init>(Landroid/content/Context;Lo/eek;ILjava/lang/String;)V

    return-object v0
.end method

.method e()Z
    .locals 1

    .line 70
    iget-object v0, p0, Lo/eel;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
