.class public Lcom/tencent/open/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field protected static final a:Ljava/lang/String;

.field protected static final b:Landroid/net/Uri;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 18
    const-class v0, Lcom/tencent/open/b/a;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/b/a;->a:Ljava/lang/String;

    .line 91
    const-string v0, "content://telephony/carriers/preferapn"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    sput-object v0, Lcom/tencent/open/b/a;->b:Landroid/net/Uri;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 134
    invoke-static {p0}, Lcom/tencent/open/b/a;->d(Landroid/content/Context;)I

    move-result v1

    .line 136
    const/4 v0, 0x2

    if-ne v1, v0, :cond_0

    .line 137
    const-string v0, "wifi"

    return-object v0

    .line 138
    :cond_0
    const/4 v0, 0x1

    if-ne v1, v0, :cond_1

    .line 139
    const-string v0, "cmwap"

    return-object v0

    .line 140
    :cond_1
    const/4 v0, 0x4

    if-ne v1, v0, :cond_2

    .line 141
    const-string v0, "cmnet"

    return-object v0

    .line 142
    :cond_2
    const/16 v0, 0x10

    if-ne v1, v0, :cond_3

    .line 143
    const-string v0, "uniwap"

    return-object v0

    .line 144
    :cond_3
    const/16 v0, 0x8

    if-ne v1, v0, :cond_4

    .line 145
    const-string v0, "uninet"

    return-object v0

    .line 146
    :cond_4
    const/16 v0, 0x40

    if-ne v1, v0, :cond_5

    .line 147
    const-string v0, "wap"

    return-object v0

    .line 148
    :cond_5
    const/16 v0, 0x20

    if-ne v1, v0, :cond_6

    .line 149
    const-string v0, "net"

    return-object v0

    .line 150
    :cond_6
    const/16 v0, 0x200

    if-ne v1, v0, :cond_7

    .line 151
    const-string v0, "ctwap"

    return-object v0

    .line 152
    :cond_7
    const/16 v0, 0x100

    if-ne v1, v0, :cond_8

    .line 153
    const-string v0, "ctnet"

    return-object v0

    .line 154
    :cond_8
    const/16 v0, 0x800

    if-ne v1, v0, :cond_9

    .line 155
    const-string v0, "3gnet"

    return-object v0

    .line 156
    :cond_9
    const/16 v0, 0x400

    if-ne v1, v0, :cond_a

    .line 157
    const-string v0, "3gwap"

    return-object v0

    .line 160
    :cond_a
    invoke-static {p0}, Lcom/tencent/open/b/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 161
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_c

    .line 162
    :cond_b
    const-string v0, "none"

    return-object v0

    .line 164
    :cond_c
    return-object v2
.end method

.method public static b(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 252
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/tencent/open/b/a;->b:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 254
    if-nez v6, :cond_0

    .line 255
    const/4 v0, 0x0

    return-object v0

    .line 257
    :cond_0
    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 258
    invoke-interface {v6}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 259
    if-eqz v6, :cond_1

    .line 260
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 262
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 265
    :cond_2
    const-string v0, "apn"

    :try_start_2
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 266
    if-eqz v6, :cond_3

    .line 267
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0

    .line 269
    :cond_3
    return-object v7

    .line 270
    :catch_0
    move-exception v6

    .line 272
    sget-object v0, Lcom/tencent/open/b/a;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getApn has exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 274
    const-string v0, ""

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 8

    .line 285
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    sget-object v1, Lcom/tencent/open/b/a;->b:Landroid/net/Uri;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 287
    if-nez v6, :cond_0

    .line 288
    const/4 v0, 0x0

    return-object v0

    .line 290
    :cond_0
    :try_start_1
    invoke-interface {v6}, Landroid/database/Cursor;->moveToFirst()Z

    .line 291
    invoke-interface {v6}, Landroid/database/Cursor;->isAfterLast()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 292
    if-eqz v6, :cond_1

    .line 293
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_1
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_0

    .line 295
    :cond_1
    const/4 v0, 0x0

    return-object v0

    .line 297
    :cond_2
    const-string v0, "proxy"

    :try_start_2
    invoke-interface {v6, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    invoke-interface {v6, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v7

    .line 298
    if-eqz v6, :cond_3

    .line 299
    invoke-interface {v6}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_0

    .line 301
    :cond_3
    return-object v7

    .line 302
    :catch_0
    move-exception v6

    .line 303
    sget-object v0, Lcom/tencent/open/b/a;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getApnProxy has exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v6}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 305
    const-string v0, ""

    return-object v0
.end method

.method public static d(Landroid/content/Context;)I
    .locals 8

    .line 390
    const-string v0, "connectivity"

    :try_start_0
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/net/ConnectivityManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 391
    if-nez v3, :cond_0

    .line 392
    const/16 v0, 0x80

    return v0

    .line 395
    :cond_0
    :try_start_1
    invoke-virtual {v3}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v4

    .line 396
    if-nez v4, :cond_1

    .line 397
    const/16 v0, 0x80

    return v0

    .line 399
    :cond_1
    :try_start_2
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v5

    .line 400
    invoke-virtual {v5}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, "WIFI"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-result v0

    if-eqz v0, :cond_2

    .line 401
    const/4 v0, 0x2

    return v0

    .line 403
    :cond_2
    :try_start_3
    invoke-virtual {v4}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    .line 404
    const-string v0, "cmwap"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-result v0

    if-eqz v0, :cond_3

    .line 405
    const/4 v0, 0x1

    return v0

    .line 406
    :cond_3
    const-string v0, "cmnet"

    :try_start_4
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "epc.tmobile.com"

    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-result v0

    if-eqz v0, :cond_5

    .line 408
    :cond_4
    const/4 v0, 0x4

    return v0

    .line 409
    :cond_5
    const-string v0, "uniwap"

    :try_start_5
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-result v0

    if-eqz v0, :cond_6

    .line 410
    const/16 v0, 0x10

    return v0

    .line 411
    :cond_6
    const-string v0, "uninet"

    :try_start_6
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    move-result v0

    if-eqz v0, :cond_7

    .line 412
    const/16 v0, 0x8

    return v0

    .line 413
    :cond_7
    const-string v0, "wap"

    :try_start_7
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    move-result v0

    if-eqz v0, :cond_8

    .line 414
    const/16 v0, 0x40

    return v0

    .line 415
    :cond_8
    const-string v0, "net"

    :try_start_8
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-result v0

    if-eqz v0, :cond_9

    .line 416
    const/16 v0, 0x20

    return v0

    .line 417
    :cond_9
    const-string v0, "ctwap"

    :try_start_9
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-result v0

    if-eqz v0, :cond_a

    .line 418
    const/16 v0, 0x200

    return v0

    .line 419
    :cond_a
    const-string v0, "ctnet"

    :try_start_a
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    move-result v0

    if-eqz v0, :cond_b

    .line 420
    const/16 v0, 0x100

    return v0

    .line 421
    :cond_b
    const-string v0, "3gwap"

    :try_start_b
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_0

    move-result v0

    if-eqz v0, :cond_c

    .line 422
    const/16 v0, 0x400

    return v0

    .line 423
    :cond_c
    const-string v0, "3gnet"

    :try_start_c
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_0

    move-result v0

    if-eqz v0, :cond_d

    .line 424
    const/16 v0, 0x800

    return v0

    .line 426
    :cond_d
    const-string v0, "#777"

    :try_start_d
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 427
    invoke-static {p0}, Lcom/tencent/open/b/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    .line 428
    if-eqz v7, :cond_e

    invoke-virtual {v7}, Ljava/lang/String;->length()I
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_0

    move-result v0

    if-lez v0, :cond_e

    .line 429
    const/16 v0, 0x200

    return v0

    .line 431
    :cond_e
    const/16 v0, 0x100

    return v0

    .line 437
    :cond_f
    goto :goto_0

    .line 435
    :catch_0
    move-exception v3

    .line 436
    sget-object v0, Lcom/tencent/open/b/a;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getMProxyType has exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 438
    :goto_0
    const/16 v0, 0x80

    return v0
.end method

.method public static e(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .line 446
    const-string v0, "connectivity"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 447
    if-nez v1, :cond_0

    .line 448
    const-string v0, "MOBILE"

    return-object v0

    .line 450
    :cond_0
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 451
    if-eqz v2, :cond_1

    .line 452
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getTypeName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 454
    :cond_1
    const-string v0, "MOBILE"

    return-object v0
.end method
