.class public final Lo/dtf;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:[B

.field private static e:Lo/dtf;


# instance fields
.field private d:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const/4 v0, 0x0

    sput-object v0, Lo/dtf;->e:Lo/dtf;

    .line 34
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/dtf;->c:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dtf;->d:Landroid/content/SharedPreferences;

    .line 51
    const-string v0, "payInitParams"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lo/dtf;->d:Landroid/content/SharedPreferences;

    .line 52
    invoke-direct {p0, p1}, Lo/dtf;->d(Landroid/content/Context;)V

    .line 53
    return-void
.end method

.method public static a(Landroid/content/Context;)Lo/dtf;
    .locals 4

    .line 86
    if-nez p0, :cond_0

    .line 87
    invoke-static {}, Lo/dte;->c()Lo/dte;

    move-result-object v0

    invoke-virtual {v0}, Lo/dte;->b()Landroid/content/Context;

    move-result-object p0

    .line 89
    :cond_0
    sget-object v2, Lo/dtf;->c:[B

    monitor-enter v2

    .line 90
    :try_start_0
    sget-object v0, Lo/dtf;->e:Lo/dtf;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 91
    new-instance v0, Lo/dtf;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/dtf;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dtf;->e:Lo/dtf;

    .line 93
    :cond_1
    sget-object v0, Lo/dtf;->e:Lo/dtf;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 94
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method

.method private d(Landroid/content/Context;)V
    .locals 5

    .line 63
    invoke-static {p1}, Lcom/huawei/wallet/utils/PackageUtil;->e(Landroid/content/Context;)I

    move-result v3

    .line 64
    iget-object v0, p0, Lo/dtf;->d:Landroid/content/SharedPreferences;

    const-string v1, "apk_version"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v4

    .line 65
    if-nez v4, :cond_0

    .line 67
    const-string v0, "apk_version"

    invoke-virtual {p0, v0, v3}, Lo/dtf;->a(Ljava/lang/String;I)V

    goto :goto_0

    .line 69
    :cond_0
    if-le v3, v4, :cond_1

    .line 71
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "updateApkVerison. lastVersion = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", currentVersion = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/wallet/utils/log/LogC;->a(Ljava/lang/String;Z)V

    .line 72
    const-string v0, "apk_version"

    invoke-virtual {p0, v0, v3}, Lo/dtf;->a(Ljava/lang/String;I)V

    .line 75
    const-string v0, "is_know_alipay_withhold_agreement"

    invoke-virtual {p0, v0}, Lo/dtf;->e(Ljava/lang/String;)V

    .line 76
    const-string v0, "is_first_remind_alipay_withhold_agreement"

    invoke-virtual {p0, v0}, Lo/dtf;->e(Ljava/lang/String;)V

    .line 78
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 1

    .line 187
    iget-object v0, p0, Lo/dtf;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 188
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 174
    iget-object v0, p0, Lo/dtf;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 175
    return-void
.end method

.method public d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 119
    iget-object v0, p0, Lo/dtf;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 277
    iget-object v0, p0, Lo/dtf;->d:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 278
    return-void
.end method
