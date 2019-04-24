.class public Lcom/huawei/operation/utils/OperationUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final MESSAGE_HW_PHONE:Ljava/lang/String; = "HW"

.field private static MESSAGE_OTHER_PHONE:Ljava/lang/String; = null

.field private static final TAG:Ljava/lang/String; = "Opera_OperationUtils"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 119
    const-string v0, "3RD"

    sput-object v0, Lcom/huawei/operation/utils/OperationUtils;->MESSAGE_OTHER_PHONE:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final fromJson(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:Ljava/lang/Object;>(Ljava/lang/String;Lcom/google/gson/reflect/TypeToken<TT;>;)TT;"
        }
    .end annotation

    .line 222
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 223
    const/4 v5, 0x0

    .line 225
    :try_start_0
    invoke-virtual {p1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    move-result-object v0

    invoke-virtual {v4, p0, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v5, v0

    .line 228
    goto :goto_0

    .line 226
    :catch_0
    move-exception v6

    .line 227
    const-string v0, "Opera_OperationUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Gson to List error"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 229
    :goto_0
    return-object v5
.end method

.method public static getAppId(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 40
    const-string v1, ""

    .line 41
    if-eqz p0, :cond_1

    .line 42
    invoke-static {p0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/login/ui/login/LoginInit;->isLoginedByWear()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    const-string v1, "com.huawei.bone"

    goto :goto_0

    .line 45
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    .line 48
    :cond_1
    :goto_0
    return-object v1
.end method

.method public static getAppType()I
    .locals 2

    .line 64
    sget-object v0, Lcom/huawei/hwcommonmodel/application/BaseApplication$e;->e:Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->d()Lcom/huawei/hwcommonmodel/application/BaseApplication$e;

    move-result-object v1

    if-ne v0, v1, :cond_0

    .line 65
    const/4 v0, 0x2

    return v0

    .line 67
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static getDeviceModel()Ljava/lang/String;
    .locals 1

    .line 106
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    return-object v0
.end method

.method public static getDeviceSn()Ljava/lang/String;
    .locals 1

    .line 115
    sget-object v0, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    return-object v0
.end method

.method public static getIVersion()I
    .locals 1

    .line 98
    const/4 v0, 0x2

    return v0
.end method

.method public static getPhoneType()Ljava/lang/String;
    .locals 2

    .line 126
    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v1, "huawei"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    const-string v0, "HW"

    return-object v0

    .line 129
    :cond_0
    sget-object v0, Lcom/huawei/operation/utils/OperationUtils;->MESSAGE_OTHER_PHONE:Ljava/lang/String;

    return-object v0
.end method

.method public static getSysVersion()Ljava/lang/String;
    .locals 1

    .line 55
    sget-object v0, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    return-object v0
.end method

.method public static getTokenType()Ljava/lang/String;
    .locals 1

    .line 77
    const-string v0, "1"

    return-object v0
.end method

.method public static getUTC()J
    .locals 5

    .line 84
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    .line 86
    const/16 v0, 0xf

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v3

    .line 88
    const/16 v0, 0x10

    invoke-virtual {v2, v0}, Ljava/util/Calendar;->get(I)I

    move-result v4

    .line 90
    add-int v0, v3, v4

    neg-int v0, v0

    const/16 v1, 0xe

    invoke-virtual {v2, v1, v0}, Ljava/util/Calendar;->add(II)V

    .line 91
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static share(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V
    .locals 3

    .line 140
    new-instance v0, Lcom/huawei/operation/utils/OperationUtils$1;

    invoke-direct {v0, p6}, Lcom/huawei/operation/utils/OperationUtils$1;-><init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 156
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v1

    .line 157
    invoke-virtual {v1, v0}, Lo/ebk;->setAdapter(Lo/eab;)V

    .line 158
    invoke-static {p7}, Lo/ebk;->c(Z)V

    .line 160
    new-instance v2, Lo/dav;

    invoke-direct {v2, p1}, Lo/dav;-><init>(I)V

    .line 161
    invoke-virtual {v2, p3}, Lo/dav;->c(Ljava/lang/String;)V

    .line 162
    invoke-virtual {v2, p4}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 163
    invoke-virtual {v2, p5}, Lo/dav;->a(Ljava/lang/String;)V

    .line 164
    invoke-virtual {v2, p2}, Lo/dav;->e(Ljava/lang/String;)V

    .line 165
    invoke-virtual {v1, v2, p0}, Lo/ebk;->c(Lo/dav;Landroid/content/Context;)V

    .line 166
    return-void
.end method

.method public static share(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;ZLjava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 192
    new-instance v0, Lcom/huawei/operation/utils/OperationUtils$2;

    invoke-direct {v0, p6}, Lcom/huawei/operation/utils/OperationUtils$2;-><init>(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 207
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v1

    .line 208
    invoke-virtual {v1, v0}, Lo/ebk;->setAdapter(Lo/eab;)V

    .line 209
    invoke-static {p7}, Lo/ebk;->c(Z)V

    .line 211
    new-instance v2, Lo/dav;

    invoke-direct {v2, p1}, Lo/dav;-><init>(I)V

    .line 212
    invoke-virtual {v2, p3}, Lo/dav;->c(Ljava/lang/String;)V

    .line 213
    invoke-virtual {v2, p4}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 214
    invoke-virtual {v2, p5}, Lo/dav;->a(Ljava/lang/String;)V

    .line 215
    invoke-virtual {v2, p2}, Lo/dav;->e(Ljava/lang/String;)V

    .line 216
    invoke-virtual {v2, p8}, Lo/dav;->d(Ljava/lang/String;)V

    .line 217
    invoke-virtual {v2, p9}, Lo/dav;->c(Ljava/util/Map;)V

    .line 218
    invoke-virtual {v1, v2, p0}, Lo/ebk;->c(Lo/dav;Landroid/content/Context;)V

    .line 219
    return-void
.end method

.method public static share(Landroid/content/Context;Lo/dav;)V
    .locals 1

    .line 134
    invoke-static {}, Lo/ebk;->d()Lo/ebk;

    move-result-object v0

    .line 135
    invoke-virtual {v0, p1, p0}, Lo/ebk;->c(Lo/dav;Landroid/content/Context;)V

    .line 136
    return-void
.end method
