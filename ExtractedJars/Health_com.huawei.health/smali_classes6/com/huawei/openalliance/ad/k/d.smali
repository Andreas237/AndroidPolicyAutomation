.class public Lcom/huawei/openalliance/ad/k/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/k/d$a;
    }
.end annotation


# static fields
.field private static final a:[B

.field private static b:Lcom/huawei/openalliance/ad/k/d;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/openalliance/ad/k/d;->a:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/k/d;->c:Landroid/content/Context;

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/d;)Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d;->c:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Lcom/huawei/openalliance/ad/k/d;
    .locals 3

    sget-object v1, Lcom/huawei/openalliance/ad/k/d;->a:[B

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/huawei/openalliance/ad/k/d;->b:Lcom/huawei/openalliance/ad/k/d;

    if-nez v0, :cond_0

    new-instance v0, Lcom/huawei/openalliance/ad/k/d;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/k/d;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/openalliance/ad/k/d;->b:Lcom/huawei/openalliance/ad/k/d;

    :cond_0
    sget-object v0, Lcom/huawei/openalliance/ad/k/d;->b:Lcom/huawei/openalliance/ad/k/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private a(Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V
    .locals 2

    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/download/app/c;->u()Lcom/huawei/openalliance/ad/k/b/d;

    move-result-object v1

    const/4 v0, 0x0

    if-eq v0, v1, :cond_2

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    if-ne v0, p2, :cond_1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/huawei/openalliance/ad/k/b/d;->g(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLFAIL:Lcom/huawei/openalliance/ad/constant/EventType;

    if-ne v0, p2, :cond_2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/huawei/openalliance/ad/k/b/d;->h(Ljava/lang/Integer;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;ILcom/huawei/openalliance/ad/k/d$a;)V
    .locals 1

    new-instance v0, Lcom/huawei/openalliance/ad/k/d$2;

    invoke-direct {v0, p0, p2, p3}, Lcom/huawei/openalliance/ad/k/d$2;-><init>(Lcom/huawei/openalliance/ad/k/d;ILcom/huawei/openalliance/ad/k/d$a;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V

    return-void
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/huawei/openalliance/ad/k/d;->b(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    return-void
.end method

.method private a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/d$a;)Z
    .locals 5

    invoke-static {p2}, Lcom/huawei/openalliance/ad/utils/i;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "InstallProcessor"

    const-string v1, "installApkViaHiFolder, file not exist"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_file_not_exist:I

    invoke-direct {p0, p1, v0, p3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;ILcom/huawei/openalliance/ad/k/d$a;)V

    const/4 v0, 0x0

    return v0

    :cond_0
    new-instance v4, Ljava/io/File;

    invoke-direct {v4, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getFileSize()J

    move-result-wide v0

    invoke-virtual {v4}, Ljava/io/File;->length()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    const-string v0, "InstallProcessor"

    const-string v1, "installApkViaHiFolder, file size error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_file_corrupted:I

    invoke-direct {p0, p1, v0, p3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;ILcom/huawei/openalliance/ad/k/d$a;)V

    const/4 v0, 0x0

    return v0

    :cond_1
    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getSha256()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/huawei/openalliance/ad/utils/i;->a(Ljava/lang/String;Ljava/io/File;)Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "InstallProcessor"

    const-string v1, "installApkViaHiFolder, file sha256 error"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Lcom/huawei/openalliance/ad/utils/i;->e(Ljava/io/File;)V

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_download_file_corrupted:I

    invoke-direct {p0, p1, v0, p3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;ILcom/huawei/openalliance/ad/k/d$a;)V

    const/4 v0, 0x0

    return v0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method static synthetic a(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/d$a;)Z
    .locals 1

    invoke-direct {p0, p1, p2, p3}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/d$a;)Z

    move-result v0

    return v0
.end method

.method private b(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V
    .locals 2

    if-eqz p4, :cond_0

    invoke-interface {p4}, Lcom/huawei/openalliance/ad/k/d$a;->b()V

    :cond_0
    const/4 v0, 0x0

    if-eq v0, p3, :cond_1

    sget-object v0, Lcom/huawei/openalliance/ad/constant/EventType;->APPINSTALLSTART:Lcom/huawei/openalliance/ad/constant/EventType;

    const/4 v1, 0x2

    invoke-direct {p0, p3, v0, v1}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/constant/EventType;I)V

    const/4 v0, 0x2

    invoke-virtual {p3, v0}, Lcom/huawei/openalliance/ad/download/app/c;->c(I)V

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/k/d;->c:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p2, v1}, Lcom/huawei/openalliance/ad/utils/c;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V
    .locals 6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    const/4 v3, 0x1

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/openalliance/ad/k/d;->a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;ZLcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;ZLcom/huawei/openalliance/ad/download/app/c;Lcom/huawei/openalliance/ad/k/d$a;)V
    .locals 7

    new-instance v0, Lcom/huawei/openalliance/ad/k/d$1;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p5

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/huawei/openalliance/ad/k/d$1;-><init>(Lcom/huawei/openalliance/ad/k/d;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Ljava/lang/String;Lcom/huawei/openalliance/ad/k/d$a;ZLcom/huawei/openalliance/ad/download/app/c;)V

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/d;->d(Ljava/lang/Runnable;)V

    return-void
.end method
