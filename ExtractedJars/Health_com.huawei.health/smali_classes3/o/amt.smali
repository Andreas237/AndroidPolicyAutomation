.class public Lo/amt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:I

.field private static final e:I


# instance fields
.field private a:Lo/cwr;

.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    sput v0, Lo/amt;->d:I

    .line 30
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v0

    sput v0, Lo/amt;->e:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amt;->b:Landroid/content/Context;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lo/amt;->a:Lo/cwr;

    .line 35
    iput-object p1, p0, Lo/amt;->b:Landroid/content/Context;

    .line 36
    new-instance v0, Lo/cwr;

    invoke-direct {v0, p1}, Lo/cwr;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lo/amt;->a:Lo/cwr;

    .line 37
    return-void
.end method

.method private e()Z
    .locals 4

    .line 86
    sget v0, Lo/amt;->d:I

    invoke-static {}, Landroid/os/Binder;->getCallingPid()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 87
    const-string v0, "Step_RemoteCallerFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MY_PID == Binder.getCallingPid()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 88
    const/4 v0, 0x1

    return v0

    .line 90
    :cond_0
    sget v0, Lo/amt;->e:I

    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v1

    if-ne v0, v1, :cond_1

    .line 92
    const-string v0, "Step_RemoteCallerFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MY_UID == Binder.getCallingUid()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 93
    const/4 v0, 0x1

    return v0

    .line 95
    :cond_1
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public b()Z
    .locals 5

    .line 100
    invoke-direct {p0}, Lo/amt;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 102
    :cond_0
    iget-object v0, p0, Lo/amt;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 103
    if-nez v4, :cond_1

    .line 104
    const-string v0, "Step_RemoteCallerFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "packageManager null not check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const/4 v0, 0x0

    return v0

    .line 108
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 8

    .line 40
    invoke-direct {p0}, Lo/amt;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    .line 42
    :cond_0
    iget-object v0, p0, Lo/amt;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 43
    if-nez v4, :cond_1

    .line 44
    const-string v0, "Step_RemoteCallerFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "packageManager null not check"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    const/4 v0, 0x0

    return v0

    .line 48
    :cond_1
    invoke-static {}, Lo/dbf;->p()Z

    move-result v5

    .line 49
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getPackagesForUid(I)[Ljava/lang/String;

    move-result-object v6

    .line 50
    const/4 v7, 0x0

    :goto_0
    array-length v0, v6

    if-ge v7, v0, :cond_8

    .line 51
    aget-object v0, v6, v7

    const-string v1, "com.huawei.health"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 52
    const-string v0, "Step_RemoteCallerFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "the process belongs to mime,uid recognized failed,force ret true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    const/4 v0, 0x1

    return v0

    .line 55
    :cond_2
    if-eqz v5, :cond_6

    .line 58
    aget-object v0, v6, v7

    const-string v1, "com.android.keyguard"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    aget-object v0, v6, v7

    const-string v1, "com.android.systemui"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 59
    :cond_3
    const/4 v0, 0x1

    return v0

    .line 67
    :cond_4
    aget-object v0, v6, v7

    const-string v1, "com.huawei.intelligent"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    aget-object v0, v6, v7

    const-string v1, "com.huawei.android.launcher"

    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    aget-object v0, v6, v7

    const-string v1, "com.huawei.hiboard"

    .line 69
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    aget-object v0, v6, v7

    const-string v1, "com.huawei.camera"

    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    aget-object v0, v6, v7

    const-string v1, "com.android.gallery3d"

    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    aget-object v0, v6, v7

    const-string v1, "com.huawei.bone"

    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 73
    :cond_5
    const/4 v0, 0x1

    return v0

    .line 76
    :cond_6
    iget-object v0, p0, Lo/amt;->a:Lo/cwr;

    aget-object v1, v6, v7

    invoke-virtual {v0, v1}, Lo/cwr;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 77
    const-string v0, "Step_RemoteCallerFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling check true"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 78
    const/4 v0, 0x1

    return v0

    .line 50
    :cond_7
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 81
    :cond_8
    const-string v0, "Step_RemoteCallerFilter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "calling check false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 82
    const/4 v0, 0x0

    return v0
.end method
