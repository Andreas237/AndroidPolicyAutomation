.class public Lo/dll;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile d:Lo/dll;


# instance fields
.field private a:Lcom/huawei/hihealth/HiUserPreference;

.field private c:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lo/dll;->c:Landroid/content/Context;

    .line 47
    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/dll;
    .locals 3

    .line 35
    sget-object v0, Lo/dll;->d:Lo/dll;

    if-nez v0, :cond_1

    .line 36
    const-class v1, Lo/dll;

    monitor-enter v1

    .line 37
    :try_start_0
    sget-object v0, Lo/dll;->d:Lo/dll;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lo/dll;

    invoke-direct {v0, p0}, Lo/dll;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dll;->d:Lo/dll;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2

    .line 42
    :cond_1
    :goto_0
    sget-object v0, Lo/dll;->d:Lo/dll;

    return-object v0
.end method

.method private e(C)Z
    .locals 1

    .line 54
    const/16 v0, 0x31

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 50
    iget-object v0, p0, Lo/dll;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    const-string v1, "custom.onboarding_concern_status"

    invoke-interface {v0, v1}, Lo/clt;->b(Ljava/lang/String;)Lcom/huawei/hihealth/HiUserPreference;

    move-result-object v0

    iput-object v0, p0, Lo/dll;->a:Lcom/huawei/hihealth/HiUserPreference;

    .line 51
    return-void
.end method

.method public a(I)Z
    .locals 2

    .line 59
    const/4 v1, 0x0

    .line 60
    iget-object v0, p0, Lo/dll;->a:Lcom/huawei/hihealth/HiUserPreference;

    if-nez v0, :cond_0

    .line 61
    invoke-virtual {p0}, Lo/dll;->a()V

    .line 63
    :cond_0
    iget-object v0, p0, Lo/dll;->a:Lcom/huawei/hihealth/HiUserPreference;

    if-eqz v0, :cond_1

    .line 64
    iget-object v0, p0, Lo/dll;->a:Lcom/huawei/hihealth/HiUserPreference;

    invoke-virtual {v0}, Lcom/huawei/hihealth/HiUserPreference;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-direct {p0, v0}, Lo/dll;->e(C)Z

    move-result v1

    .line 66
    :cond_1
    return v1
.end method
