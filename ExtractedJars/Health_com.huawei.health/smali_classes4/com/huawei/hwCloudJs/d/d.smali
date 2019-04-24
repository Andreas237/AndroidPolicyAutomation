.class public Lcom/huawei/hwCloudJs/d/d;
.super Ljava/lang/Object;


# static fields
.field public static final a:Ljava/lang/String; = "none"

.field public static final b:Ljava/lang/String; = "unknown"

.field public static final c:Ljava/lang/String; = "2g"

.field public static final d:Ljava/lang/String; = "3g"

.field public static final e:Ljava/lang/String; = "4g"

.field public static final f:Ljava/lang/String; = "wifi"

.field public static final g:I = 0x10

.field public static final h:I = 0x11

.field public static final i:I = 0x12

.field private static final j:Ljava/lang/String; = "NetUtils"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 2

    invoke-static {}, Lcom/huawei/hwCloudJs/d/d;->b()Ljava/lang/String;

    move-result-object v1

    const-string v0, "none"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static b()Ljava/lang/String;
    .locals 6

    invoke-static {}, Lcom/huawei/hwCloudJs/b/a;->a()Landroid/content/Context;

    move-result-object v1

    const-string v0, "connectivity"

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v3

    :cond_0
    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    const-string v0, "none"

    return-object v0

    :cond_2
    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v4

    const-string v0, "mobile"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Landroid/net/NetworkInfo;->getSubtype()I

    move-result v5

    packed-switch v5, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "2g"

    return-object v0

    :pswitch_1
    const-string v0, "3g"

    return-object v0

    :pswitch_2
    const-string v0, "4g"

    return-object v0

    :goto_0
    goto :goto_1

    :cond_3
    const-string v0, "wifi"

    return-object v0

    :goto_1
    const-string v0, "unknown"

    return-object v0

    nop

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
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
