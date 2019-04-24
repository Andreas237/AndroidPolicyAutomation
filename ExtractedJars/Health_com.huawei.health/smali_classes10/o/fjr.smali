.class public Lo/fjr;
.super Lo/cwz;
.source "SourceFile"


# static fields
.field private static volatile e:Lo/fjr;


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    const/4 v0, 0x0

    sput-object v0, Lo/fjr;->e:Lo/fjr;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 42
    iput-object p1, p0, Lo/fjr;->a:Landroid/content/Context;

    .line 43
    return-void
.end method

.method public static a()Lo/fjr;
    .locals 4

    .line 56
    sget-object v0, Lo/fjr;->e:Lo/fjr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 57
    const-class v2, Lo/fjr;

    monitor-enter v2

    .line 58
    :try_start_0
    sget-object v0, Lo/fjr;->e:Lo/fjr;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 59
    new-instance v0, Lo/fjr;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/fjr;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/fjr;->e:Lo/fjr;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 63
    :cond_1
    :goto_0
    sget-object v0, Lo/fjr;->e:Lo/fjr;

    return-object v0
.end method


# virtual methods
.method public c()Z
    .locals 3

    .line 84
    iget-object v0, p0, Lo/fjr;->a:Landroid/content/Context;

    const/16 v1, 0x2717

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_google_fit_connect_status"

    invoke-static {v0, v1, v2}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "true"

    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 86
    const/4 v0, 0x1

    return v0

    .line 88
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public d(Z)V
    .locals 5

    .line 72
    const-string v0, "UpToGoogleFitMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "setConnectGoogleStatus,isLogin-----------"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iget-object v0, p0, Lo/fjr;->a:Landroid/content/Context;

    const/16 v1, 0x2717

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "key_google_fit_connect_status"

    .line 75
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v3

    .line 74
    const/4 v4, 0x0

    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 76
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 47
    const/16 v0, 0x2717

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
