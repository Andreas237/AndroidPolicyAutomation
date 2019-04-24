.class public Lo/ajw;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/lang/String;

.field private static b:Ljava/lang/String;

.field private static c:Ljava/lang/String;

.field private static d:Ljava/lang/String;

.field private static final e:[B

.field private static h:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 35
    const-string v0, "multicast_ip"

    sput-object v0, Lo/ajw;->b:Ljava/lang/String;

    .line 37
    const-string v0, "239.40."

    sput-object v0, Lo/ajw;->a:Ljava/lang/String;

    .line 39
    const-string v0, "239.50."

    sput-object v0, Lo/ajw;->c:Ljava/lang/String;

    .line 41
    const-string v0, "239.60."

    sput-object v0, Lo/ajw;->d:Ljava/lang/String;

    .line 47
    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lo/ajw;->e:[B

    .line 51
    invoke-static {}, Lo/ajw;->b()V

    .line 52
    return-void

    nop

    :array_0
    .array-data 1
        0x5ct
        0x18t
        0x9t
        0x53t
        0x46t
        0x68t
        -0x4t
        0x52t
        0x27t
        -0x21t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 258
    new-instance v1, Lo/aev;

    invoke-direct {v1, p0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 259
    sget-object v0, Lo/ajw;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Lo/aev;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 260
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    const-string v0, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 261
    :cond_0
    sget-object v2, Lo/ajw;->a:Ljava/lang/String;

    .line 263
    :cond_1
    return-object v2
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 8

    .line 167
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 168
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "para is wrong!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 169
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 172
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    new-array v4, v0, [B

    .line 174
    const/4 v5, 0x0

    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    if-ge v5, v0, :cond_1

    .line 175
    mul-int/lit8 v0, v5, 0x2

    mul-int/lit8 v1, v5, 0x2

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v6

    .line 176
    mul-int/lit8 v0, v5, 0x2

    add-int/lit8 v0, v0, 0x1

    mul-int/lit8 v1, v5, 0x2

    add-int/lit8 v1, v1, 0x2

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v7

    .line 177
    mul-int/lit8 v0, v6, 0x10

    add-int/2addr v0, v7

    int-to-byte v0, v0

    aput-byte v0, v4, v5
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 174
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 182
    :cond_1
    goto :goto_1

    .line 179
    :catch_0
    move-exception v5

    .line 180
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 181
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 183
    :goto_1
    return-object v4
.end method

.method public static b()V
    .locals 9

    .line 56
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKeFromSo "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 58
    invoke-static {}, Lo/ajz;->a()Ljava/lang/String;

    move-result-object v4

    .line 59
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 60
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKeFromSo ko is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 61
    return-void

    .line 64
    :cond_0
    const/4 v0, 0x0

    invoke-static {v4, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v5

    .line 65
    invoke-static {v5}, Lo/ajz;->a([B)[B

    move-result-object v6

    .line 67
    :try_start_0
    new-instance v7, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-direct {v7, v6, v0}, Ljava/lang/String;-><init>([BLjava/lang/String;)V

    .line 68
    const/4 v0, 0x0

    invoke-static {v7, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v8

    .line 69
    invoke-static {v8}, Lo/ajt;->e([B)[B

    move-result-object v0

    sput-object v0, Lo/ajw;->h:[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 70
    :catch_0
    move-exception v7

    .line 71
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getKeFromSo UnsupportedEncodingException:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 73
    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V
    .locals 5

    .line 341
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    .line 342
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 343
    invoke-virtual {v4, p1}, Lo/egy$b;->a(Ljava/lang/String;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lo/ajw$5;

    invoke-direct {v2}, Lo/ajw$5;-><init>()V

    .line 344
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_permission_guide_go_set:I

    new-instance v2, Lo/ajw$4;

    invoke-direct {v2, v3}, Lo/ajw$4;-><init>(Landroid/content/Context;)V

    .line 350
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    .line 366
    invoke-virtual {v0}, Lo/egy$b;->a()Lo/egy;

    move-result-object v0

    invoke-virtual {v0}, Lo/egy;->show()V

    .line 367
    return-void
.end method

.method public static b([I)[I
    .locals 4

    .line 210
    if-nez p0, :cond_0

    .line 211
    const/4 v0, 0x0

    new-array v0, v0, [I

    return-object v0

    .line 213
    :cond_0
    array-length v0, p0

    new-array v2, v0, [I

    .line 214
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_1

    .line 215
    aget v0, p0, v3

    and-int/lit16 v0, v0, 0xff

    aput v0, v2, v3

    .line 214
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 217
    :cond_1
    return-object v2
.end method

.method public static c(Landroid/content/Context;)V
    .locals 3

    .line 237
    invoke-static {p0}, Lo/ajw;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 238
    sget-object v0, Lo/ajw;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    sget-object v0, Lo/ajw;->b:Ljava/lang/String;

    sget-object v1, Lo/ajw;->c:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lo/ajw;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 240
    :cond_0
    sget-object v0, Lo/ajw;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 241
    sget-object v0, Lo/ajw;->b:Ljava/lang/String;

    sget-object v1, Lo/ajw;->d:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lo/ajw;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 243
    :cond_1
    sget-object v0, Lo/ajw;->b:Ljava/lang/String;

    sget-object v1, Lo/ajw;->a:Ljava/lang/String;

    invoke-static {p0, v0, v1}, Lo/ajw;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    :goto_0
    return-void
.end method

.method public static c()[B
    .locals 1

    .line 282
    sget-object v0, Lo/ajw;->e:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public static c([I)[B
    .locals 4

    .line 221
    if-nez p0, :cond_0

    .line 222
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 224
    :cond_0
    array-length v0, p0

    new-array v2, v0, [B

    .line 225
    const/4 v3, 0x0

    :goto_0
    array-length v0, p0

    if-ge v3, v0, :cond_1

    .line 226
    aget v0, p0, v3

    and-int/lit16 v0, v0, 0xff

    int-to-byte v0, v0

    aput-byte v0, v2, v3

    .line 225
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 228
    :cond_1
    return-object v2
.end method

.method public static d([B)Ljava/lang/String;
    .locals 7

    .line 143
    if-nez p0, :cond_0

    .line 144
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "para is wrong!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 145
    const-string v0, ""

    return-object v0

    .line 148
    :cond_0
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 149
    const/4 v5, 0x0

    :goto_0
    array-length v0, p0

    if-ge v5, v0, :cond_2

    .line 150
    aget-byte v0, p0, v5

    and-int/lit16 v0, v0, 0xff

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v6

    .line 151
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 152
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v1, 0x30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 154
    :cond_1
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 149
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 156
    :cond_2
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 6

    .line 290
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 291
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNetworkConnected context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 292
    const/4 v0, 0x0

    return v0

    .line 294
    :cond_0
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/net/ConnectivityManager;

    .line 295
    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    .line 296
    if-eqz v5, :cond_1

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 297
    const/4 v0, 0x1

    return v0

    .line 299
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static d(Landroid/content/Context;Landroid/location/LocationManager;)Z
    .locals 6
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 324
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 325
    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object p1, v0

    check-cast p1, Landroid/location/LocationManager;

    .line 328
    :cond_0
    const-string v0, "gps"

    invoke-virtual {p1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v4

    .line 329
    const-string v0, "network"

    invoke-virtual {p1, v0}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v5

    .line 331
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isLocationSwitchOn(): GpsEnable "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " NetworkEnable "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 333
    if-nez v4, :cond_1

    if-eqz v5, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d()[B
    .locals 2

    .line 278
    sget-object v0, Lo/ajw;->h:[B

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    sget-object v0, Lo/ajw;->h:[B

    invoke-virtual {v0}, [B->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    :goto_0
    return-object v0
.end method

.method public static d(I)[B
    .locals 2

    .line 270
    new-instance v0, Ljava/security/SecureRandom;

    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 272
    new-array v1, p0, [B

    .line 273
    invoke-virtual {v0, v1}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 274
    return-object v1
.end method

.method public static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 10

    .line 191
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 192
    return-object p0

    .line 194
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    const-string v0, ":"

    invoke-virtual {p0, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    .line 196
    move-object v6, v5

    array-length v7, v6

    const/4 v8, 0x0

    :goto_0
    if-ge v8, v7, :cond_1

    aget-object v9, v6, v8

    .line 197
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 199
    :cond_1
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "replaceMac:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/aho;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 200
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static e(Landroid/content/Context;)V
    .locals 5

    .line 374
    const/4 v3, 0x0

    .line 375
    new-instance v4, Lo/egy$b;

    invoke-direct {v4, p0}, Lo/egy$b;-><init>(Landroid/content/Context;)V

    .line 376
    sget v0, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_connect_wifi_prompt_msg:I

    invoke-virtual {v4, v0}, Lo/egy$b;->b(I)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_settings_button_cancal:I

    new-instance v2, Lo/ajw$1;

    invoke-direct {v2}, Lo/ajw$1;-><init>()V

    .line 377
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->e(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_device_wifi_go_connect:I

    new-instance v2, Lo/ajw$2;

    invoke-direct {v2, p0}, Lo/ajw$2;-><init>(Landroid/content/Context;)V

    .line 383
    invoke-virtual {v0, v1, v2}, Lo/egy$b;->d(ILandroid/view/View$OnClickListener;)Lo/egy$b;

    .line 389
    invoke-virtual {v4}, Lo/egy$b;->a()Lo/egy;

    move-result-object v3

    .line 390
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/egy;->setCancelable(Z)V

    .line 391
    invoke-virtual {v3}, Lo/egy;->show()V

    .line 392
    return-void
.end method

.method private static e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 248
    new-instance v0, Lo/aev;

    invoke-direct {v0, p0}, Lo/aev;-><init>(Landroid/content/Context;)V

    .line 249
    invoke-virtual {v0, p1, p2}, Lo/aev;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 250
    return-void
.end method

.method public static e()Z
    .locals 8

    .line 307
    sget-object v4, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 308
    const-string v5, "samsung"

    .line 309
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "system ro.build.fingerprint "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 310
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v4, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 311
    invoke-virtual {v6, v5}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    .line 312
    const/4 v0, -0x1

    if-ne v7, v0, :cond_0

    .line 313
    const/4 v0, 0x0

    return v0

    .line 315
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public static e(I[BLjava/lang/String;)[B
    .locals 6

    .line 83
    if-eqz p1, :cond_0

    array-length v0, p1

    if-eqz v0, :cond_0

    if-nez p2, :cond_1

    .line 84
    :cond_0
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "whiteBoxEncrypt para are wrong!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 85
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 88
    :cond_1
    const/4 v4, 0x0

    .line 90
    const/4 v0, 0x0

    :try_start_0
    invoke-static {p2, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 93
    goto :goto_0

    .line 91
    :catch_0
    move-exception v5

    .line 92
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "whiteBoxEncrypt IllegalArgumentException: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/IllegalArgumentException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 95
    :goto_0
    if-eqz v4, :cond_2

    array-length v0, v4

    if-nez v0, :cond_3

    .line 96
    :cond_2
    const-string v0, "CommonLibUtil"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "whiteBoxEncrypt Base64 decode error!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 97
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 99
    :cond_3
    invoke-static {v4}, Lo/ajt;->e([B)[B

    move-result-object v0

    invoke-static {p0, p1, v0}, Lo/ajz;->b(I[B[B)[B

    move-result-object v0

    return-object v0
.end method

.method public static e([BII)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/InvalidKeyException;
        }
    .end annotation

    .line 105
    if-eqz p0, :cond_0

    array-length v0, p0

    if-nez v0, :cond_1

    .line 106
    :cond_0
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 110
    :cond_1
    invoke-static {}, Lo/ajx;->e()[B

    move-result-object v2

    .line 111
    if-eqz v2, :cond_2

    array-length v0, v2

    if-eqz v0, :cond_2

    array-length v0, v2

    const/16 v1, 0x400

    if-le v0, v1, :cond_3

    .line 112
    :cond_2
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 115
    :cond_3
    const/4 v0, 0x0

    aget-byte v3, v2, v0

    .line 116
    new-array v4, v3, [B

    .line 118
    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_4

    .line 119
    add-int v0, v5, v3

    mul-int/lit8 v0, v0, 0x8

    add-int/lit8 v0, v0, -0x2

    aget-byte v0, v2, v0

    aput-byte v0, v4, v5

    .line 118
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 123
    :cond_4
    const/4 v5, 0x0

    :goto_1
    div-int/lit8 v0, v3, 0x2

    if-ge v5, v0, :cond_5

    .line 124
    aget-byte v6, v4, v5

    .line 125
    add-int/lit8 v0, v3, -0x1

    sub-int/2addr v0, v5

    aget-byte v0, v4, v0

    aput-byte v0, v4, v5

    .line 126
    add-int/lit8 v0, v3, -0x1

    sub-int/2addr v0, v5

    aput-byte v6, v4, v0

    .line 123
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 129
    :cond_5
    array-length v0, v4

    if-nez v0, :cond_6

    .line 130
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 133
    :cond_6
    invoke-static {v4, p0, p1, p2}, Lo/akb;->a([B[BII)[B

    move-result-object v0

    return-object v0
.end method
