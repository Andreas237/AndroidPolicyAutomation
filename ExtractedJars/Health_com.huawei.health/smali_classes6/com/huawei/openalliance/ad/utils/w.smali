.class public Lcom/huawei/openalliance/ad/utils/w;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/huawei/openalliance/ad/utils/w;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(I)I
    .locals 2

    packed-switch p0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const/4 v1, 0x4

    goto :goto_1

    :pswitch_1
    const/4 v1, 0x5

    goto :goto_1

    :pswitch_2
    const/4 v1, 0x6

    goto :goto_1

    :goto_0
    const/4 v1, 0x0

    :goto_1
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method private static a(Ljava/lang/String;Ljava/lang/String;I)Landroid/util/Pair;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;I)Landroid/util/Pair<Ljava/lang/Integer;Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation

    new-instance v2, Landroid/util/Pair;

    invoke-direct {v2, p0, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/util/Pair;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    const-string v0, "android.permission.ACCESS_WIFI_STATE"

    invoke-static {p0, v0}, Lcom/huawei/openalliance/ad/utils/m;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/wifi/WifiManager;

    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    const-string v0, ""

    return-object v0

    :cond_0
    :try_start_0
    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, ""

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    return-object v0

    :cond_2
    const-string v0, ""

    return-object v0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "fail to get wifi info"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, ""

    return-object v0

    :cond_3
    const-string v0, ""

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Z
    .locals 2

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/w;->c(Landroid/content/Context;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_1

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/w;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c(Landroid/content/Context;)I
    .locals 5

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    :try_start_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    const/4 v0, 0x0

    if-eq v0, v3, :cond_4

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getType()I

    move-result v4

    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/w;->a(I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    :cond_2
    const/16 v0, 0x9

    if-ne v0, v4, :cond_3

    const/4 v0, 0x1

    return v0

    :cond_3
    const/4 v0, 0x1

    if-ne v0, v4, :cond_4

    const/4 v0, 0x2

    return v0

    :cond_4
    goto :goto_0

    :catch_0
    move-exception v3

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "fail to get network info"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 5

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    const/4 v3, 0x0

    :try_start_0
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    const/4 v3, 0x1

    :cond_2
    goto :goto_0

    :catch_0
    move-exception v4

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "fail to check network connection"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return v3
.end method

.method public static e(Landroid/content/Context;)Landroid/util/Pair;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Landroid/util/Pair<Ljava/lang/Integer;Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/t;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "multicard device"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/huawei/openalliance/ad/utils/t;->a()Lcom/huawei/openalliance/ad/utils/s;

    move-result-object v3

    invoke-interface {v3}, Lcom/huawei/openalliance/ad/utils/s;->a()I

    move-result v0

    invoke-interface {v3, v0}, Lcom/huawei/openalliance/ad/utils/s;->b(I)Landroid/util/Pair;

    move-result-object v2

    :cond_0
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    invoke-static {p0}, Lcom/huawei/openalliance/ad/utils/w;->g(Landroid/content/Context;)Landroid/util/Pair;

    move-result-object v2

    :cond_1
    return-object v2
.end method

.method public static f(Landroid/content/Context;)Z
    .locals 7

    const/4 v4, 0x0

    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const-string v0, "com.huawei.android.net.wifi.WifiManagerCommonEx"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const-string v0, "getHwMeteredHint"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Landroid/content/Context;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v5}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    invoke-virtual {v6, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_7

    move-result v0

    move v4, v0

    :cond_0
    goto :goto_0

    :catch_0
    move-exception v5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "isMeteredWifi ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_1
    move-exception v5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "isMeteredWifi NoSuchMethodException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_2
    move-exception v5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "isMeteredWifi InvocationTargetException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_3
    move-exception v5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "isMeteredWifi InstantiationException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_4
    move-exception v5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "isMeteredWifi IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_5
    move-exception v5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "isMeteredWifi IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_6
    move-exception v5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "isMeteredWifi SecurityException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :catch_7
    move-exception v5

    sget-object v0, Lcom/huawei/openalliance/ad/utils/w;->a:Ljava/lang/String;

    const-string v1, "isMeteredWifi ClassCastException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    return v4
.end method

.method private static g(Landroid/content/Context;)Landroid/util/Pair;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Landroid/util/Pair<Ljava/lang/Integer;Landroid/util/Pair<Ljava/lang/String;Ljava/lang/String;>;>;"
        }
    .end annotation

    if-nez p0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/telephony/TelephonyManager;

    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const-string v0, "null"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_1

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const/4 v0, 0x3

    invoke-virtual {v5, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    :cond_1
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkType()I

    move-result v0

    invoke-static {v2, v3, v0}, Lcom/huawei/openalliance/ad/utils/w;->a(Ljava/lang/String;Ljava/lang/String;I)Landroid/util/Pair;

    move-result-object v0

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method
