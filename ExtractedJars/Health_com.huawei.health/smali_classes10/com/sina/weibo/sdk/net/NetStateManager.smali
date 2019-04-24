.class public Lcom/sina/weibo/sdk/net/NetStateManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sina/weibo/sdk/net/NetStateManager$NetStateReceive;,
        Lcom/sina/weibo/sdk/net/NetStateManager$NetState;
    }
.end annotation


# static fields
.field public static CUR_NETSTATE:Lcom/sina/weibo/sdk/net/NetStateManager$NetState;

.field private static mContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 42
    sget-object v0, Lcom/sina/weibo/sdk/net/NetStateManager$NetState;->Mobile:Lcom/sina/weibo/sdk/net/NetStateManager$NetState;

    sput-object v0, Lcom/sina/weibo/sdk/net/NetStateManager;->CUR_NETSTATE:Lcom/sina/weibo/sdk/net/NetStateManager$NetState;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    return-void
.end method

.method static synthetic access$002(Landroid/content/Context;)Landroid/content/Context;
    .locals 0

    .line 39
    sput-object p0, Lcom/sina/weibo/sdk/net/NetStateManager;->mContext:Landroid/content/Context;

    return-object p0
.end method

.method public static getAPN()Landroid/util/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Landroid/util/Pair<Ljava/lang/String;Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 67
    const-string v0, "content://telephony/carriers/preferapn"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    .line 68
    const/4 v7, 0x0

    .line 69
    sget-object v0, Lcom/sina/weibo/sdk/net/NetStateManager;->mContext:Landroid/content/Context;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 70
    sget-object v0, Lcom/sina/weibo/sdk/net/NetStateManager;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v1, v6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 72
    :cond_0
    const/4 v8, 0x0

    .line 73
    if-eqz v7, :cond_2

    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 75
    const-string v0, "proxy"

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v9

    .line 76
    if-eqz v9, :cond_1

    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 77
    new-instance v8, Landroid/util/Pair;

    const/16 v0, 0x50

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v8, v9, v0}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 79
    :cond_1
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 81
    :cond_2
    return-object v8
.end method

.method public static isNetworkConnected(Landroid/content/Context;)Z
    .locals 6

    .line 90
    if-nez p0, :cond_0

    .line 91
    const-string v0, "Weibosdk"

    const-string v1, "unexpected null context in isNetworkConnected"

    invoke-static {v0, v1}, Lcom/sina/weibo/sdk/utils/LogUtil;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 93
    const/4 v0, 0x0

    return v0

    .line 95
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 96
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    .line 97
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 96
    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_1

    .line 98
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_1
    const-string v0, "connectivity"

    .line 101
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/ConnectivityManager;

    .line 102
    const/4 v4, 0x0

    .line 104
    :try_start_0
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 107
    goto :goto_0

    .line 105
    :catch_0
    move-exception v5

    .line 108
    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_3

    .line 109
    :cond_2
    const/4 v0, 0x0

    return v0

    .line 111
    :cond_3
    const/4 v0, 0x1

    return v0
.end method
