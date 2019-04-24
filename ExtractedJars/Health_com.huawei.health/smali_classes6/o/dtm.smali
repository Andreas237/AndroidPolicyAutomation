.class public Lo/dtm;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    const-class v0, Lo/dtm;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/dtm;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    .line 23
    sget-object v0, Lo/dtm;->e:Ljava/lang/String;

    return-object v0
.end method

.method public static a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;)V
    .locals 12

    .line 112
    invoke-static {p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v11

    .line 113
    if-eqz v11, :cond_0

    .line 114
    move-object v0, v11

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    new-instance v8, Lo/dtm$1;

    invoke-direct {v8}, Lo/dtm$1;-><init>()V

    move-object/from16 v9, p7

    const/4 v7, 0x1

    const/4 v10, 0x0

    invoke-interface/range {v0 .. v10}, Lo/dti;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V

    .line 121
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 148
    sget-object v0, Lo/dtm;->e:Ljava/lang/String;

    const-string v1, "enter ShareContent "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 149
    new-instance v2, Lo/dav;

    invoke-direct {v2, p1}, Lo/dav;-><init>(I)V

    .line 150
    invoke-virtual {v2, p2}, Lo/dav;->e(Ljava/lang/String;)V

    .line 151
    invoke-virtual {v2, p3}, Lo/dav;->c(Ljava/lang/String;)V

    .line 152
    invoke-virtual {v2, p4}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 153
    invoke-virtual {v2, p5}, Lo/dav;->a(Ljava/lang/String;)V

    .line 154
    invoke-virtual {v2, p8}, Lo/dav;->d(Ljava/lang/String;)V

    .line 155
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/dav;->d(Z)V

    .line 156
    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lo/dav;->e(I)V

    .line 157
    sget-object v0, Lo/dae;->W:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 158
    const/4 v0, 0x5

    invoke-virtual {v2, v0}, Lo/dav;->a(I)V

    .line 160
    :cond_0
    invoke-virtual {v2, p9}, Lo/dav;->c(Ljava/util/Map;)V

    .line 161
    invoke-static {p0, v2, p6, p7}, Lo/djl;->b(Landroid/content/Context;Lo/dav;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 162
    return-void
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 75
    invoke-static {p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "getUserInfo"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 78
    invoke-interface {v2, v3}, Lo/dti;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 79
    const-string v0, "name"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 81
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 60
    invoke-static {p0}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v2

    .line 61
    if-eqz v2, :cond_0

    .line 62
    const/4 v0, 0x1

    new-array v3, v0, [Ljava/lang/String;

    const-string v0, "getUserInfo"

    const/4 v1, 0x0

    aput-object v0, v3, v1

    .line 63
    invoke-interface {v2, v3}, Lo/dti;->c([Ljava/lang/String;)Ljava/util/Map;

    move-result-object v4

    .line 64
    const-string v0, "picPath"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    .line 66
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;)V
    .locals 10

    .line 136
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move/from16 v6, p7

    new-instance v7, Lo/dtm$3;

    invoke-direct {v7}, Lo/dtm$3;-><init>()V

    move-object/from16 v8, p8

    const/4 v9, 0x0

    invoke-static/range {v0 .. v9}, Lo/dtm;->a(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;Ljava/util/Map;)V

    .line 143
    return-void
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 3

    .line 45
    const-string v0, "connectivity"

    .line 46
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 47
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 48
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    const/4 v0, 0x1

    return v0

    .line 51
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
