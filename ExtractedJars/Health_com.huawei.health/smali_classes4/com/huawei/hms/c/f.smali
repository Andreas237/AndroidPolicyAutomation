.class public abstract Lcom/huawei/hms/c/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)I
    .locals 1

    .line 53
    invoke-static {p0}, Lcom/huawei/hms/c/f;->b(Landroid/content/Context;)Landroid/net/NetworkInfo;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hms/c/f;->a(Landroid/net/NetworkInfo;)I

    move-result v0

    return v0
.end method

.method private static a(Landroid/net/NetworkInfo;)I
    .locals 4

    .line 77
    const/4 v2, 0x0

    .line 78
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 79
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 80
    const/4 v2, 0x1

    goto :goto_1

    .line 82
    :cond_0
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 83
    invoke-virtual {p0}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v3

    .line 84
    packed-switch v3, :pswitch_data_0

    goto :goto_0

    .line 88
    :pswitch_0
    const/4 v2, 0x2

    .line 89
    goto :goto_1

    .line 101
    :pswitch_1
    const/4 v2, 0x3

    .line 102
    goto :goto_1

    .line 106
    :pswitch_2
    const/4 v2, 0x4

    .line 107
    goto :goto_1

    .line 110
    :goto_0
    const/4 v2, 0x6

    .line 114
    :cond_1
    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method private static b(Landroid/content/Context;)Landroid/net/NetworkInfo;
    .locals 3

    .line 62
    const-string v0, "connectivity"

    .line 63
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 64
    const/4 v2, 0x0

    .line 65
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 66
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 68
    :cond_0
    return-object v2
.end method
