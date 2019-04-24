.class public final Lcom/huawei/wallet/storage/sp/AccountPreferences;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Lcom/huawei/wallet/storage/sp/AccountPreferences;

.field private static final c:[B


# instance fields
.field private e:Landroid/content/SharedPreferences;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 27
    const/4 v0, 0x0

    sput-object v0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->b:Lcom/huawei/wallet/storage/sp/AccountPreferences;

    .line 47
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->c:[B

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->e:Landroid/content/SharedPreferences;

    .line 51
    const/4 v0, 0x0

    if-eq v0, p1, :cond_0

    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wallet_account"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->e:Landroid/content/SharedPreferences;

    .line 55
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;)Lcom/huawei/wallet/storage/sp/AccountPreferences;
    .locals 4

    .line 61
    sget-object v2, Lcom/huawei/wallet/storage/sp/AccountPreferences;->c:[B

    monitor-enter v2

    .line 62
    :try_start_0
    sget-object v0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->b:Lcom/huawei/wallet/storage/sp/AccountPreferences;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 63
    new-instance v0, Lcom/huawei/wallet/storage/sp/AccountPreferences;

    invoke-direct {v0, p0}, Lcom/huawei/wallet/storage/sp/AccountPreferences;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->b:Lcom/huawei/wallet/storage/sp/AccountPreferences;

    .line 65
    :cond_0
    sget-object v0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->b:Lcom/huawei/wallet/storage/sp/AccountPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 66
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public d(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result v0

    return v0
.end method

.method public e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 92
    iget-object v0, p0, Lcom/huawei/wallet/storage/sp/AccountPreferences;->e:Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
