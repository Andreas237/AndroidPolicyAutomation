.class public Lo/dlq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:I

.field private static final b:I


# instance fields
.field private c:Lo/cwr;

.field private d:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 32
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    sput v0, Lo/dlq;->a:I

    .line 33
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    sput v0, Lo/dlq;->b:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlq;->d:Landroid/content/Context;

    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dlq;->c:Lo/cwr;

    .line 38
    iput-object p1, p0, Lo/dlq;->d:Landroid/content/Context;

    .line 39
    new-instance v0, Lo/cwr;

    invoke-direct {v0, p1}, Lo/cwr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/dlq;->c:Lo/cwr;

    .line 40
    return-void
.end method

.method private d()Z
    .locals 4

    .line 43
    sget v0, Lo/dlq;->b:I

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 44
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MY_PID == Binder.getCallingPid()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 48
    :cond_0
    sget v0, Lo/dlq;->a:I

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 49
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MY_UID == Binder.getCallingUid()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 50
    const/4 v0, 0x1

    return v0

    .line 52
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public e()Z
    .locals 8

    .line 56
    invoke-direct {p0}, Lo/dlq;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 58
    :cond_0
    iget-object v0, p0, Lo/dlq;->d:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 59
    if-nez v4, :cond_1

    .line 60
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "packageManager null not check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    const/4 v0, 0x0

    return v0

    .line 64
    :cond_1
    invoke-static {}, Lo/dbf;->p()Z

    move-result v5

    .line 65
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v6

    .line 66
    if-nez v6, :cond_2

    .line 67
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "packages null not check "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 68
    const/4 v0, 0x0

    return v0

    .line 70
    :cond_2
    const/4 v7, 0x0

    :goto_0
    array-length v0, v6

    if-ge v7, v0, :cond_9

    .line 71
    const-string v0, "com.huawei.health"

    aget-object v1, v6, v7

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 73
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the process belongs to mime,uid recognized failed,force ret true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_3
    if-eqz v5, :cond_7

    .line 79
    aget-object v0, v6, v7

    const-string v1, "com.android.keyguard"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    aget-object v0, v6, v7

    const-string v1, "com.android.systemui"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 80
    :cond_4
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the process belongs to mime,uid true "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    aget-object v2, v6, v7

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 81
    const/4 v0, 0x1

    return v0

    .line 89
    :cond_5
    const-string v0, "com.huawei.intelligent"

    aget-object v1, v6, v7

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "com.huawei.android.launcher"

    aget-object v1, v6, v7

    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "com.huawei.hiboard"

    aget-object v1, v6, v7

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "com.huawei.bone"

    aget-object v1, v6, v7

    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "com.android.gallery3d"

    aget-object v1, v6, v7

    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "com.huawei.camera"

    aget-object v1, v6, v7

    .line 94
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 95
    :cond_6
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the INTELLIGENT_PACKAGE belongs to mime,uid true "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    aget-object v2, v6, v7

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 96
    const/4 v0, 0x1

    return v0

    .line 100
    :cond_7
    iget-object v0, p0, Lo/dlq;->c:Lo/cwr;

    aget-object v1, v6, v7

    invoke-virtual {v0, v1}, Lo/cwr;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 101
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling check true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x1

    return v0

    .line 70
    :cond_8
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 105
    :cond_9
    const-string v0, "SMART_SmartRemoteFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling check false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    const/4 v0, 0x0

    return v0
.end method
