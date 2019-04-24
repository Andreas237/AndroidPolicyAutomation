.class public Lo/eua;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile c:Lo/eua;


# instance fields
.field private d:Lo/etu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const/4 v0, 0x0

    sput-object v0, Lo/eua;->c:Lo/eua;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    invoke-static {}, Lo/etu;->b()Lo/etu;

    move-result-object v0

    iput-object v0, p0, Lo/eua;->d:Lo/etu;

    .line 26
    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/eua;
    .locals 4

    .line 35
    sget-object v0, Lo/eua;->c:Lo/eua;

    if-nez v0, :cond_1

    .line 36
    const-class v2, Lo/eua;

    monitor-enter v2

    .line 37
    :try_start_0
    sget-object v0, Lo/eua;->c:Lo/eua;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Lo/eua;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lo/eua;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/eua;->c:Lo/eua;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3

    .line 42
    :cond_1
    :goto_0
    sget-object v0, Lo/eua;->c:Lo/eua;

    return-object v0
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 7

    .line 51
    const-string v4, "https://club.huawei.com/forum-339-1.html"

    .line 52
    iget-object v0, p0, Lo/eua;->d:Lo/etu;

    invoke-virtual {v0}, Lo/etu;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 53
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 54
    const-string v0, "HuaFenClubInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getHuaFenClubUrl() -> null == deviceInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    return-object v4

    .line 57
    :cond_0
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v6

    .line 58
    const-string v0, "HuaFenClubInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DeviceType ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    packed-switch v6, :pswitch_data_0

    goto/16 :goto_0

    .line 61
    :pswitch_0
    const-string v4, "https://cn.club.vmall.com/forum-1270-1.html"

    .line 62
    goto :goto_1

    .line 64
    :pswitch_1
    const-string v4, "https://club.huawei.com/forum-339-1.html"

    .line 65
    goto :goto_1

    .line 67
    :pswitch_2
    const-string v4, "https://cn.club.vmall.com/forum-854-1.html"

    .line 68
    goto :goto_1

    .line 70
    :pswitch_3
    const-string v4, "https://cn.club.vmall.com/forum-2243-1.html"

    .line 71
    goto :goto_1

    .line 73
    :pswitch_4
    const-string v4, "https://cn.club.vmall.com/forum-2849-1.html"

    .line 74
    goto :goto_1

    .line 77
    :pswitch_5
    const-string v4, "https://club.huawei.com/forum-2847-1.html"

    .line 78
    goto :goto_1

    .line 80
    :pswitch_6
    const-string v4, "https://club.huawei.com/forum-2848-1.html"

    .line 81
    goto :goto_1

    .line 83
    :pswitch_7
    const-string v4, "https://club.huawei.com/forum-2666-1.html"

    .line 84
    goto :goto_1

    .line 86
    :pswitch_8
    const-string v4, "https://club.huawei.com/forum-2343-1.html"

    .line 87
    goto :goto_1

    .line 89
    :pswitch_9
    const-string v4, "https://club.huawei.com/forum-2788-1.html"

    .line 90
    goto :goto_1

    .line 92
    :pswitch_a
    const-string v4, "https://club.huawei.com/forum-1776-1.html"

    .line 93
    goto :goto_1

    .line 95
    :pswitch_b
    const-string v4, "https://club.huawei.com/forum-917-1.html"

    .line 96
    goto :goto_1

    .line 98
    :pswitch_c
    const-string v4, "https://club.huawei.com/forum-3359-1.html"

    .line 99
    goto :goto_1

    .line 101
    :pswitch_d
    const-string v4, "https://club.huawei.com/forum-3927-1.html"

    .line 102
    goto :goto_1

    .line 104
    :pswitch_e
    const-string v4, "https://club.huawei.com/forum-3928-1.html"

    .line 105
    goto :goto_1

    .line 107
    :pswitch_f
    const-string v4, "https://club.huawei.com/forum-4004-1.html"

    .line 108
    goto :goto_1

    .line 110
    :pswitch_10
    const-string v4, "https://club.huawei.com/forum-4003-1.html"

    .line 111
    goto :goto_1

    .line 113
    :goto_0
    :pswitch_11
    const-string v4, "https://cn.club.vmall.com/forum-530-1.html"

    .line 116
    :goto_1
    return-object v4

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_11
        :pswitch_a
        :pswitch_11
        :pswitch_0
        :pswitch_11
        :pswitch_3
        :pswitch_7
        :pswitch_11
        :pswitch_9
        :pswitch_b
        :pswitch_8
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_c
        :pswitch_11
        :pswitch_d
        :pswitch_e
        :pswitch_f
        :pswitch_10
    .end packed-switch
.end method
