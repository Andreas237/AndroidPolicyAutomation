.class public Lcom/huawei/hwid/core/d/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;Ljava/lang/String;)I
    .locals 2

    .line 403
    invoke-static {p0}, Lcom/huawei/hwid/c/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/c/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/hwid/c/a;->b()Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v1

    .line 404
    if-eqz v1, :cond_0

    .line 405
    invoke-virtual {v1}, Lcom/huawei/hwid/core/datatype/HwAccount;->e()I

    move-result v0

    return v0

    .line 408
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static a()Ljava/lang/String;
    .locals 1

    .line 316
    const-string v0, "yyyyMMddHHmmssSSS"

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 429
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 430
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 432
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 434
    invoke-virtual {v2, p0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 435
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x14

    if-lt v0, v1, :cond_1

    .line 436
    const/4 v0, 0x0

    const/16 v1, 0x14

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 437
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/encrypt/h;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 438
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 441
    :cond_1
    :goto_0
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SimpleDateFormat"
        }
    .end annotation

    .line 324
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 325
    :cond_0
    const-string v0, ""

    return-object v0

    .line 327
    :cond_1
    const/4 v2, 0x0

    .line 329
    :try_start_0
    new-instance v3, Ljava/text/SimpleDateFormat;

    invoke-direct {v3, p1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 330
    invoke-virtual {v3, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v2

    .line 332
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-direct {v4, p2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 333
    invoke-virtual {v4, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 334
    :catch_0
    move-exception v3

    .line 335
    const-string v0, "BaseUtil"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 337
    const-string v0, ""

    return-object v0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 7

    .line 120
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 121
    const/4 v0, 0x0

    return-object v0

    .line 124
    :cond_0
    array-length v0, p0

    if-nez v0, :cond_1

    .line 125
    const-string v0, ""

    return-object v0

    .line 128
    :cond_1
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v3, v0, [C

    .line 130
    const/16 v4, 0x10

    new-array v4, v4, [C

    fill-array-data v4, :array_0

    .line 131
    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v5, v0, :cond_2

    .line 132
    aget-byte v6, p0, v5

    .line 133
    mul-int/lit8 v0, v5, 0x2

    and-int/lit16 v1, v6, 0xf0

    shr-int/lit8 v1, v1, 0x4

    aget-char v1, v4, v1

    aput-char v1, v3, v0

    .line 134
    mul-int/lit8 v0, v5, 0x2

    add-int/lit8 v0, v0, 0x1

    and-int/lit8 v1, v6, 0xf

    aget-char v1, v4, v1

    aput-char v1, v3, v0

    .line 131
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 137
    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>([C)V

    return-object v0

    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data
.end method

.method public static a(Landroid/app/Activity;Z)V
    .locals 5

    .line 1146
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-le v0, v1, :cond_1

    .line 1147
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    .line 1148
    invoke-virtual {v2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    .line 1149
    const/high16 v4, 0x4000000

    .line 1150
    if-eqz p1, :cond_0

    .line 1151
    iget v0, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/high16 v1, 0x4000000

    or-int/2addr v0, v1

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    goto :goto_0

    .line 1153
    :cond_0
    iget v0, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    const v1, -0x4000001

    and-int/2addr v0, v1

    iput v0, v3, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 1155
    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    .line 1157
    :cond_1
    return-void
.end method

.method public static a(Landroid/content/Context;Landroid/content/Intent;I)V
    .locals 3

    .line 665
    if-eqz p0, :cond_0

    if-nez p1, :cond_1

    .line 666
    :cond_0
    const-string v0, "BaseUtil"

    const-string v1, "context or intent is null."

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 667
    return-void

    .line 669
    :cond_1
    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_2

    .line 670
    const/high16 v0, 0x10000000

    or-int/2addr v0, p2

    const/high16 v1, 0x4000000

    or-int/2addr v0, v1

    invoke-virtual {p1, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 671
    const-string v0, "BaseUtil"

    const-string v1, "not send Activity"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 672
    :cond_2
    if-eqz p2, :cond_3

    .line 673
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 676
    :cond_3
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 679
    goto :goto_1

    .line 677
    :catch_0
    move-exception v2

    .line 678
    const-string v0, "BaseUtil"

    const-string v1, "can not start activity Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 680
    :goto_1
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/cloudservice/CloudRequestHandler;)V
    .locals 8

    .line 810
    const-string v0, "BaseUtil"

    const-string v1, "do getUserInfoReq in BaseUtil"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 811
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p3, :cond_1

    .line 812
    :cond_0
    const-string v0, "BaseUtil"

    const-string v1, "context or requestHandler is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 813
    return-void

    .line 816
    :cond_1
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 817
    :cond_2
    const/16 v4, 0x3ea

    .line 818
    const-string v5, "userId  or queryRangeFlag is null"

    .line 819
    new-instance v6, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v6, v4, v5}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 820
    invoke-interface {p3, v6}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 821
    return-void

    .line 824
    :cond_3
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/b;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hwid/core/datatype/HwAccount;

    move-result-object v4

    .line 825
    const/4 v0, 0x0

    if-ne v0, v4, :cond_4

    .line 826
    const/16 v5, 0xd

    .line 827
    const-string v6, "no account by userId"

    .line 828
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v7, v5, v6}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 829
    invoke-interface {p3, v7}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 830
    return-void

    .line 833
    :cond_4
    const-string v0, "getUserInfo"

    const/16 v1, 0x7530

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 838
    new-instance v0, Lcom/huawei/hwid/b;

    invoke-static {}, Lcom/huawei/hwid/d;->a()Lcom/huawei/hwid/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/huawei/hwid/b;-><init>(Lcom/huawei/hwid/c;)V

    new-instance v1, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;

    invoke-direct {v1, p0, v4, p3}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase;-><init>(Landroid/content/Context;Lcom/huawei/hwid/core/datatype/HwAccount;Lcom/huawei/cloudservice/CloudRequestHandler;)V

    new-instance v2, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;

    invoke-direct {v2, p2}, Lcom/huawei/hwid/usecase/GetUserInfoUseCase$RequestValues;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lcom/huawei/hwid/b;->a(Lcom/huawei/hwid/UseCase;Lcom/huawei/hwid/UseCase$RequestValues;Lcom/huawei/hwid/UseCase$a;)V

    goto :goto_0

    .line 841
    :cond_5
    const/16 v5, 0x19

    .line 842
    const-string v6, "Too many recent requests have been made and last request hasn\'t callback"

    .line 843
    new-instance v7, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;

    invoke-direct {v7, v5, v6}, Lcom/huawei/hwid/core/helper/handler/ErrorStatus;-><init>(ILjava/lang/String;)V

    .line 844
    invoke-interface {p3, v7}, Lcom/huawei/cloudservice/CloudRequestHandler;->onError(Lcom/huawei/hwid/core/helper/handler/ErrorStatus;)V

    .line 846
    :goto_0
    return-void
.end method

.method private static a(Ljava/lang/String;JI)V
    .locals 2

    .line 882
    const-wide/16 v0, 0x0

    cmp-long v0, v0, p1

    if-eqz v0, :cond_0

    .line 883
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Lcom/huawei/hwid/a;->a(Ljava/lang/String;J)V

    .line 885
    :cond_0
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lcom/huawei/hwid/a;->a(Ljava/lang/String;Z)V

    .line 886
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    add-int/lit8 v1, p3, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/huawei/hwid/a;->a(Ljava/lang/String;I)V

    .line 887
    return-void
.end method

.method public static a(Landroid/app/Activity;Ljava/lang/Boolean;)Z
    .locals 6

    .line 1170
    :try_start_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v5

    .line 1171
    const-string v0, "BaseUtil"

    const-string v1, "setHwFloating"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1172
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "setHwFloating"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {v0, v5, v1, v2, v3}, Lcom/huawei/hwid/core/d/g;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1173
    const/4 v0, 0x1

    return v0

    .line 1174
    :catch_0
    move-exception v5

    .line 1175
    const-string v0, "BaseUtil"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1177
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 7

    .line 214
    const-string v0, "BaseUtil"

    const-string v1, "enter networkIsAvaiable"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 215
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 216
    const/4 v0, 0x0

    return v0

    .line 218
    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 219
    const/4 v0, 0x0

    if-ne v0, v2, :cond_1

    .line 220
    const-string v0, "BaseUtil"

    const-string v1, "connectivity is null,so networkIsAvaiable is unaviable"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 221
    const/4 v0, 0x0

    return v0

    .line 223
    :cond_1
    move-object v3, v2

    check-cast v3, Landroid/net/ConnectivityManager;

    .line 225
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;

    move-result-object v4

    .line 226
    const/4 v0, 0x0

    if-eq v0, v4, :cond_2

    array-length v0, v4

    if-nez v0, :cond_3

    .line 227
    :cond_2
    const-string v0, "BaseUtil"

    const-string v1, "NetworkInfo is null,so networkIsAvaiable is unaviable"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    const/4 v0, 0x0

    return v0

    .line 230
    :cond_3
    const/4 v5, 0x0

    :goto_0
    array-length v0, v4

    if-ge v5, v0, :cond_5

    .line 231
    aget-object v0, v4, v5

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 232
    aget-object v0, v4, v5

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v6

    .line 234
    sget-object v0, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v6, v0, :cond_4

    .line 235
    const/4 v0, 0x1

    return v0

    .line 230
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 239
    :cond_5
    const-string v0, "BaseUtil"

    const-string v1, "NetworkInfo  state is unaviable"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 240
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;I)Z
    .locals 4

    .line 167
    const-string v0, "phone"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 168
    const/4 v2, -0x1

    .line 169
    invoke-static {}, Lcom/huawei/hwid/core/d/c/b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 170
    invoke-static {}, Lcom/huawei/hwid/core/d/c/b;->a()Lcom/huawei/hwid/core/d/c/a;

    move-result-object v3

    .line 171
    const/16 v0, -0x3e7

    if-ne p1, v0, :cond_0

    .line 172
    invoke-interface {v3}, Lcom/huawei/hwid/core/d/c/a;->a()I

    move-result p1

    .line 174
    :cond_0
    invoke-interface {v3, p1}, Lcom/huawei/hwid/core/d/c/a;->a(I)I

    move-result v2

    .line 175
    goto :goto_0

    .line 176
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v1, :cond_2

    .line 177
    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v2

    .line 180
    :cond_2
    :goto_0
    const/4 v0, 0x5

    if-ne v2, v0, :cond_3

    .line 181
    const/4 v0, 0x1

    return v0

    .line 183
    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;I)Z
    .locals 10

    .line 851
    const-string v0, "com.huawei.hwid"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 852
    const/4 v0, 0x1

    return v0

    .line 854
    :cond_0
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwid/a;->a(Ljava/lang/String;)J

    move-result-wide v4

    .line 855
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    .line 856
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwid/a;->b(Ljava/lang/String;)Z

    move-result v8

    .line 857
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/huawei/hwid/a;->c(Ljava/lang/String;)I

    move-result v9

    .line 858
    const-wide/16 v0, 0x0

    cmp-long v0, v0, v4

    if-eqz v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, v0, v6

    if-eqz v0, :cond_1

    int-to-long v0, p2

    sub-long v2, v6, v4

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 859
    :cond_1
    invoke-static {p1, v6, v7, v9}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;JI)V

    .line 860
    const-string v0, "BaseUtil"

    const-string v1, "last time or current time is zero, interval time is enough"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 861
    const/4 v0, 0x1

    return v0

    .line 862
    :cond_2
    if-eqz v8, :cond_3

    .line 863
    invoke-static {p1, v6, v7, v9}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;JI)V

    .line 864
    const-string v0, "BaseUtil"

    const-string v1, "request has call back"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 865
    const/4 v0, 0x1

    return v0

    .line 866
    :cond_3
    const/4 v0, 0x5

    if-ge v9, v0, :cond_4

    .line 867
    invoke-static {p1, v6, v7, v9}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;JI)V

    .line 868
    const-string v0, "BaseUtil"

    const-string v1, "request number "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    const/4 v0, 0x1

    return v0

    .line 871
    :cond_4
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 523
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 524
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 525
    invoke-virtual {v2, p2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 526
    const/4 v3, 0x0

    .line 527
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 528
    const/4 v0, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    .line 530
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 531
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 533
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Z)Z
    .locals 3

    .line 499
    invoke-static {p0, p1}, Lcom/huawei/hwid/core/d/f;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 500
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 501
    return p2

    .line 504
    :cond_0
    :try_start_0
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    return v0

    .line 505
    :catch_0
    move-exception v2

    .line 506
    return p2
.end method

.method public static a(Landroid/content/pm/PackageManager;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 690
    invoke-virtual {p0, p1, p2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static a(Lcom/huawei/hwid/core/datatype/HwAccount;)Z
    .locals 2

    .line 445
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 446
    const/4 v0, 0x0

    return v0

    .line 449
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 450
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/HwAccount;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 451
    :cond_1
    const-string v0, "BaseUtil"

    const-string v1, "addHwAccount is invalid"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 452
    const/4 v0, 0x0

    return v0

    .line 454
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static a(Ljava/lang/String;)Z
    .locals 6

    .line 95
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    const/4 v0, 0x0

    return v0

    .line 99
    :cond_0
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v2

    .line 100
    const/4 v3, 0x0

    :goto_0
    array-length v0, v2

    if-ge v3, v0, :cond_3

    .line 101
    aget-byte v4, v2, v3

    .line 102
    and-int/lit16 v5, v4, 0xff

    .line 103
    const/16 v0, 0x1f

    if-le v5, v0, :cond_1

    const/16 v0, 0x7f

    if-lt v5, v0, :cond_2

    .line 104
    :cond_1
    const-string v0, "BaseUtil"

    const-string v1, "byte not printable"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 105
    const/4 v0, 0x0

    return v0

    .line 100
    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 110
    :cond_3
    goto :goto_1

    .line 108
    :catch_0
    move-exception v2

    .line 109
    const-string v0, "BaseUtil"

    const-string v1, "UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    :goto_1
    const/4 v0, 0x1

    return v0
.end method

.method public static b()Ljava/lang/String;
    .locals 8

    .line 963
    const-string v6, ""

    .line 965
    const-string v0, "android.os.SystemProperties"

    const-string v1, "get"

    const/4 v2, 0x2

    :try_start_0
    new-array v2, v2, [Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "ro.build.version.emui"

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, ""

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/core/d/g;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    .line 967
    const/4 v0, 0x0

    if-eq v0, v7, :cond_0

    .line 968
    move-object v0, v7

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v6, v0

    .line 972
    :cond_0
    goto :goto_0

    .line 970
    :catch_0
    move-exception v7

    .line 971
    const-string v0, "BaseUtil"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 973
    :goto_0
    return-object v6
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 289
    const/4 v0, 0x2

    new-array v2, v0, [Ljava/lang/String;

    const-string v0, "Unknown"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    const-string v0, "Unknown"

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 290
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 291
    const-string v0, "android.permission.ACCESS_NETWORK_STATE"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    const-string v0, "Unknown"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 293
    const/4 v0, 0x0

    aget-object v0, v2, v0

    return-object v0

    .line 296
    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/ConnectivityManager;

    .line 297
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 298
    const-string v0, "Unknown"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 299
    const/4 v0, 0x0

    aget-object v0, v2, v0

    return-object v0

    .line 301
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v5

    .line 302
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v0, v1, :cond_2

    .line 303
    const-string v0, "Wi-Fi"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 304
    const/4 v0, 0x0

    aget-object v0, v2, v0

    return-object v0

    .line 306
    :cond_2
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v5

    .line 307
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;

    move-result-object v0

    sget-object v1, Landroid/net/NetworkInfo$State;->CONNECTED:Landroid/net/NetworkInfo$State;

    if-ne v0, v1, :cond_3

    .line 308
    const-string v0, "2G/3G/4G"

    const/4 v1, 0x0

    aput-object v0, v2, v1

    .line 309
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v2, v1

    .line 310
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/4 v1, 0x1

    aget-object v1, v2, v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 312
    :cond_3
    const/4 v0, 0x0

    aget-object v0, v2, v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 1

    .line 519
    const-string v0, "com.huawei.hwid"

    invoke-static {p0, p1, v0}, Lcom/huawei/hwid/core/d/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static b(Lcom/huawei/hwid/core/datatype/HwAccount;)Z
    .locals 1

    .line 752
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 753
    const/4 v0, 0x0

    return v0

    .line 755
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/hwid/core/datatype/HwAccount;->g()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 756
    const/4 v0, 0x0

    return v0

    .line 758
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 11

    .line 146
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v5, v0, 0x2

    .line 148
    new-array v6, v5, [B

    .line 151
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v7

    .line 152
    const/4 v8, 0x0

    :goto_0
    array-length v0, v6

    if-ge v8, v0, :cond_0

    .line 153
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [B

    mul-int/lit8 v3, v8, 0x2

    aget-byte v3, v7, v3

    const/4 v4, 0x0

    aput-byte v3, v2, v4

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Byte;->decode(Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v9

    .line 154
    shl-int/lit8 v0, v9, 0x4

    int-to-byte v9, v0

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x1

    new-array v2, v2, [B

    mul-int/lit8 v3, v8, 0x2

    add-int/lit8 v3, v3, 0x1

    aget-byte v3, v7, v3

    const/4 v4, 0x0

    aput-byte v3, v2, v4

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Byte;->decode(Ljava/lang/String;)Ljava/lang/Byte;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v10

    .line 156
    xor-int v0, v9, v10

    int-to-byte v0, v0

    aput-byte v0, v6, v8
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 152
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 161
    :cond_0
    goto :goto_1

    .line 159
    :catch_0
    move-exception v8

    .line 160
    const-string v0, "BaseUtil"

    const-string v1, "hexString2ByteArray UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 163
    :goto_1
    return-object v6
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 1076
    const-string v0, "B778D57C1D7C80E09C1FFDD68A2BCF74"

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 341
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 342
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 344
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 373
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 374
    const-string v0, "0"

    return-object v0

    .line 377
    :cond_0
    const-string v0, "+"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 378
    const-string v0, "+"

    const-string v1, "00"

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0

    .line 381
    :cond_1
    const-string v2, "0"

    .line 383
    const-string v0, "@"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 384
    const-string v2, "1"

    .line 386
    :cond_2
    invoke-static {p0}, Lcom/huawei/hwid/core/d/j;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 387
    const-string v2, "2"

    .line 389
    :cond_3
    return-object v2
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 4

    .line 538
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 539
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 540
    const-string v0, "com.huawei.hwid"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 541
    const/4 v3, 0x0

    .line 542
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 543
    const/4 v0, 0x0

    invoke-virtual {v1, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v3

    .line 545
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 546
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 548
    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public static d()I
    .locals 6

    .line 1086
    const/4 v4, -0x1

    .line 1088
    const-string v0, "android.os.UserHandle"

    const-string v1, "myUserId"

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    invoke-static {v0, v1, v2, v3}, Lcom/huawei/hwid/core/d/g;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 1089
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 1090
    move-object v0, v5

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 1095
    :cond_0
    goto :goto_0

    .line 1093
    :catch_0
    move-exception v5

    .line 1094
    const-string v0, "BaseUtil"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 1096
    :goto_0
    return v4
.end method

.method public static d(Landroid/content/Context;Ljava/lang/String;)Lcom/huawei/hwid/core/datatype/HwAccount;
    .locals 5

    .line 726
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 727
    const-string v0, "BaseUtil"

    const-string v1, "context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 728
    const/4 v0, 0x0

    return-object v0

    .line 730
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 731
    const-string v0, "BaseUtil"

    const-string v1, "get account by userID failed, the userID is null!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 732
    const/4 v0, 0x0

    return-object v0

    .line 734
    :cond_1
    invoke-static {p0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    .line 736
    const/4 v0, 0x0

    if-eq v0, v2, :cond_4

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 737
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 738
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    invoke-virtual {v4}, Lcom/huawei/hwid/core/datatype/HwAccount;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 739
    invoke-static {v4}, Lcom/huawei/hwid/core/d/b;->b(Lcom/huawei/hwid/core/datatype/HwAccount;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 740
    const/4 v0, 0x0

    return-object v0

    .line 742
    :cond_2
    const-string v0, "BaseUtil"

    const-string v1, "get account by userID success!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 743
    return-object v4

    .line 745
    :cond_3
    goto :goto_0

    .line 747
    :cond_4
    const-string v0, "BaseUtil"

    const-string v1, "get account by userID failed, there is no matching account!"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 748
    const/4 v0, 0x0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 348
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 349
    iget-object v0, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v2

    .line 350
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 351
    return-object v3
.end method

.method public static d(Ljava/lang/String;)[B
    .locals 3

    .line 556
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 557
    const-string v0, "BaseUtil"

    const-string v1, "getUTF8Bytes, str is empty"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 558
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 561
    :cond_0
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 562
    :catch_0
    move-exception v2

    .line 564
    const-string v0, "BaseUtil"

    const-string v1, "getBytes error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 565
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 355
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    .line 356
    iget-object v0, v1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v2

    .line 357
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    .line 358
    return-object v3
.end method

.method public static e()Z
    .locals 2

    .line 1105
    invoke-static {}, Lcom/huawei/hwid/core/d/b;->d()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static e(Ljava/lang/String;)Z
    .locals 1

    .line 704
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 705
    const/4 v0, 0x0

    return v0

    .line 708
    :cond_0
    const-string v0, "0"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "1"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "2"

    .line 709
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 710
    :cond_1
    const/4 v0, 0x0

    return v0

    .line 713
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static f(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 368
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static f(Ljava/lang/String;)V
    .locals 3

    .line 895
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/huawei/hwid/a;->c(Ljava/lang/String;)I

    move-result v2

    .line 896
    if-lez v2, :cond_0

    .line 897
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    add-int/lit8 v1, v2, -0x1

    invoke-virtual {v0, p0, v1}, Lcom/huawei/hwid/a;->a(Ljava/lang/String;I)V

    .line 899
    :cond_0
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p0, v1}, Lcom/huawei/hwid/a;->a(Ljava/lang/String;Z)V

    .line 900
    return-void
.end method

.method public static f()Z
    .locals 2

    .line 1114
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x16

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1051
    new-instance v2, Ljava/text/SimpleDateFormat;

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v2, p0, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1052
    new-instance v3, Ljava/util/Date;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 1053
    invoke-virtual {v2, v3}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v4

    .line 1054
    return-object v4
.end method

.method public static g()Z
    .locals 2

    .line 1123
    const-string v0, "com.huawei.android.os.BuildEx"

    invoke-static {v0}, Lcom/huawei/hwid/core/d/b;->h(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Lcom/huawei/android/os/BuildEx$VERSION;->EMUI_SDK_INT:I

    const/16 v1, 0x9

    if-lt v0, v1, :cond_0

    .line 1124
    const/4 v0, 0x1

    return v0

    .line 1126
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static g(Landroid/content/Context;)Z
    .locals 2

    .line 476
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "com.huawei.hwid"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public static h(Landroid/content/Context;)Z
    .locals 5

    .line 576
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 577
    const/4 v0, 0x1

    return v0

    .line 579
    :cond_0
    const/4 v2, 0x0

    .line 580
    invoke-static {}, Lcom/huawei/hwid/a;->a()Lcom/huawei/hwid/a;

    move-result-object v3

    .line 581
    invoke-virtual {v3}, Lcom/huawei/hwid/a;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 583
    :try_start_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->i(Landroid/content/Context;)Ljava/util/List;

    move-result-object v0

    move-object v2, v0

    .line 584
    invoke-virtual {v3, v2}, Lcom/huawei/hwid/a;->a(Ljava/util/List;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 587
    goto :goto_0

    .line 585
    :catch_0
    move-exception v4

    .line 586
    const-string v0, "BaseUtil"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    goto :goto_0

    .line 589
    :cond_1
    invoke-virtual {v3}, Lcom/huawei/hwid/a;->b()Ljava/util/List;

    move-result-object v2

    .line 592
    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 594
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 595
    const/4 v0, 0x0

    return v0

    .line 597
    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public static h(Ljava/lang/String;)Z
    .locals 4

    .line 1065
    const/4 v2, 0x1

    .line 1067
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1071
    goto :goto_0

    .line 1068
    :catch_0
    move-exception v3

    .line 1069
    const-string v0, "isExsit"

    const-string v1, "The class is not existing: "

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1070
    const/4 v2, 0x0

    .line 1072
    :goto_0
    return v2
.end method

.method public static i(Landroid/content/Context;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;)Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 601
    const-string v2, "package"

    .line 602
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 603
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "usesdk_packagename"

    invoke-static {p0, v1}, Lcom/huawei/hwid/core/d/i;->b(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v4

    .line 604
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 605
    return-object v3

    .line 608
    :cond_0
    :try_start_0
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getEventType()I

    move-result v5

    .line 609
    :goto_0
    const/4 v0, 0x1

    if-eq v0, v5, :cond_2

    .line 610
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->getName()Ljava/lang/String;

    move-result-object v6

    .line 620
    const/4 v0, 0x2

    if-ne v5, v0, :cond_1

    .line 621
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 622
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->nextText()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 625
    :cond_1
    invoke-interface {v4}, Landroid/content/res/XmlResourceParser;->next()I
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v5

    .line 626
    goto :goto_0

    .line 631
    :cond_2
    goto :goto_1

    .line 627
    :catch_0
    move-exception v5

    .line 628
    const-string v0, "BaseUtil"

    const-string v1, "Parser xml exception: XmlPullParserException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 631
    goto :goto_1

    .line 629
    :catch_1
    move-exception v5

    .line 630
    const-string v0, "BaseUtil"

    const-string v1, "Parser xml exception: IOException"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 633
    :goto_1
    return-object v3
.end method

.method public static j(Landroid/content/Context;)Z
    .locals 4

    .line 637
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 639
    const-string v0, "com.huawei.hwid"

    const/16 v1, 0x80

    :try_start_0
    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 640
    :catch_0
    move-exception v3

    .line 641
    const/4 v0, 0x0

    return v0
.end method

.method public static k(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 646
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 648
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v3

    .line 649
    iget-object v4, v3, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 650
    return-object v4

    .line 652
    :catch_0
    move-exception v3

    .line 653
    const-string v0, "BaseUtil"

    const-string v1, "NameNotFoundException getVersionTag error"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 655
    const-string v0, ""

    return-object v0
.end method

.method public static l(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 768
    const-string v0, "tokenType"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/f;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 769
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 770
    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 772
    const-string v0, "tokenType"

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/f;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 774
    :cond_0
    return-object v1
.end method

.method public static m(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 784
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 785
    const-string v0, ""

    return-object v0

    .line 787
    :cond_0
    const/4 v2, 0x0

    .line 789
    invoke-static {p0}, Lcom/huawei/hwid/b/a;->a(Landroid/content/Context;)Lcom/huawei/hwid/b/b;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lcom/huawei/hwid/b/b;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    .line 790
    const/4 v0, 0x0

    if-eq v0, v3, :cond_1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 791
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/hwid/core/datatype/HwAccount;

    .line 794
    :cond_1
    const/4 v4, 0x0

    .line 795
    if-eqz v2, :cond_2

    .line 796
    invoke-virtual {v2}, Lcom/huawei/hwid/core/datatype/HwAccount;->b()Ljava/lang/String;

    move-result-object v4

    .line 798
    :cond_2
    return-object v4
.end method

.method public static n(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1261
    const-string v2, ""

    .line 1262
    const-string v0, "com.huawei.hwid"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1263
    const-string v3, "HwID_"

    .line 1264
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p0}, Lcom/huawei/hwid/core/d/b;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1265
    goto :goto_0

    .line 1266
    :cond_0
    const-string v3, "HwID_SDK_"

    .line 1267
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "2.6.1.301"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 1269
    :goto_0
    return-object v2
.end method
