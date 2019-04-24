.class public final Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static a(Ljava/lang/String;Ljava/lang/String;I)I
    .locals 4

    .line 207
    const/4 v2, 0x0

    .line 209
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 212
    goto :goto_0

    .line 210
    :catch_0
    move-exception v3

    .line 211
    const-string v0, "MemberSDk_Utils[getIntFiled]"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 214
    :goto_0
    if-eqz v2, :cond_0

    .line 216
    :try_start_1
    invoke-virtual {v2, p1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_3

    move-result v0

    return v0

    .line 217
    :catch_1
    move-exception v3

    .line 218
    const-string v0, "MemberSDk_Utils[getIntFiled]"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 223
    goto :goto_1

    .line 219
    :catch_2
    move-exception v3

    .line 220
    const-string v0, "MemberSDk_Utils[getIntFiled]"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 223
    goto :goto_1

    .line 221
    :catch_3
    move-exception v3

    .line 222
    const-string v0, "MemberSDk_Utils[getIntFiled]"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 225
    :cond_0
    :goto_1
    return p2
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/Class<*>;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 336
    const/4 v1, 0x0

    .line 339
    :try_start_0
    invoke-virtual {p0, p2, p3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 342
    goto :goto_0

    .line 340
    :catch_0
    move-exception v2

    .line 341
    const-string v0, "MemberSDk_Utils[invokeFun]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 344
    :goto_0
    if-eqz v1, :cond_0

    .line 346
    :try_start_1
    invoke-virtual {v1, p1, p4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3

    move-result-object v0

    return-object v0

    .line 347
    :catch_1
    move-exception v2

    .line 348
    const-string v0, "MemberSDk_Utils[invokeFun]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 353
    goto :goto_1

    .line 349
    :catch_2
    move-exception v2

    .line 350
    const-string v0, "MemberSDk_Utils[invokeFun]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 353
    goto :goto_1

    .line 351
    :catch_3
    move-exception v2

    .line 352
    const-string v0, "MemberSDk_Utils[invokeFun]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 355
    :cond_0
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 286
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    array-length v0, p2

    array-length v1, p3

    if-eq v0, v1, :cond_1

    .line 287
    :cond_0
    const-string v0, "MemberSDk_Utils"

    const-string v1, "invokeStaticFun \u53c2\u6570\u6709\u8bef"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 288
    const/4 v0, 0x0

    return-object v0

    .line 291
    :cond_1
    const/4 v2, 0x0

    .line 293
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 296
    goto :goto_0

    .line 294
    :catch_0
    move-exception v3

    .line 295
    const-string v0, "MemberSDk_Utils[invokeStaticFun]"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 297
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v2, :cond_2

    .line 298
    const/4 v3, 0x0

    .line 300
    :try_start_1
    invoke-virtual {v2, p1, p2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object v3, v0

    .line 303
    goto :goto_1

    .line 301
    :catch_1
    move-exception v4

    .line 302
    const-string v0, "MemberSDk_Utils[invokeStaticFun]"

    invoke-static {v4, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 305
    :goto_1
    if-eqz v3, :cond_2

    .line 307
    :try_start_2
    invoke-virtual {v3, v2, p3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_4

    move-result-object v0

    return-object v0

    .line 308
    :catch_2
    move-exception v4

    .line 309
    const-string v0, "MemberSDk_Utils[invokeStaticFun]"

    invoke-static {v4, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 314
    goto :goto_2

    .line 310
    :catch_3
    move-exception v4

    .line 311
    const-string v0, "MemberSDk_Utils[invokeStaticFun]"

    invoke-static {v4, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 314
    goto :goto_2

    .line 312
    :catch_4
    move-exception v4

    .line 313
    const-string v0, "MemberSDk_Utils[invokeStaticFun]"

    invoke-static {v4, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 317
    :cond_2
    :goto_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static a()Ljava/lang/String;
    .locals 8

    .line 517
    new-instance v3, Ljava/lang/StringBuffer;

    invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V

    .line 519
    const-string v0, "yyyyMMddHHmmssSSS"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;

    move-result-object v4

    .line 521
    new-instance v5, Ljava/security/SecureRandom;

    invoke-direct {v5}, Ljava/security/SecureRandom;-><init>()V

    .line 522
    const/16 v0, 0x2710

    invoke-virtual {v5, v0}, Ljava/security/SecureRandom;->nextInt(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x2710

    rem-int/lit16 v6, v0, 0x2710

    .line 523
    const/16 v0, 0x3e8

    if-ge v6, v0, :cond_0

    .line 524
    add-int/lit16 v6, v6, 0x3e8

    .line 527
    :cond_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    .line 528
    invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v7

    .line 529
    const-string v0, "MemberSDk_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "creatSalt salt"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 530
    return-object v7
.end method

.method public static a(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 8

    .line 387
    const/4 v2, 0x0

    .line 389
    if-nez p0, :cond_0

    .line 390
    return-object v2

    .line 392
    :cond_0
    new-instance v3, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v3}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 393
    const/16 v0, 0x400

    new-array v4, v0, [B

    .line 394
    const/4 v5, -0x1

    .line 396
    :goto_0
    :try_start_0
    invoke-virtual {p0, v4}, Ljava/io/InputStream;->read([B)I

    move-result v0

    move v5, v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 397
    const/4 v0, 0x0

    invoke-virtual {v3, v4, v0, v5}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    .line 400
    :cond_1
    const-string v0, "UTF-8"

    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    move-object v2, v0

    .line 404
    const-string v0, "MemberSDk_Utils"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 405
    goto :goto_1

    .line 401
    :catch_0
    move-exception v6

    .line 402
    const-string v0, "MemberSDk_Utils[readStream]"

    :try_start_1
    invoke-static {v6, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 404
    const-string v0, "MemberSDk_Utils"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 405
    goto :goto_1

    .line 404
    :catchall_0
    move-exception v7

    const-string v0, "MemberSDk_Utils"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/io/OutputStream;Ljava/lang/String;)V

    throw v7

    .line 407
    :goto_1
    return-object v2
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 658
    const/4 v3, 0x0

    .line 660
    const/4 v4, 0x0

    .line 661
    const/4 v5, 0x0

    :goto_0
    const/4 v0, 0x3

    if-ge v5, v0, :cond_2

    .line 662
    const-string v0, "TDID"

    invoke-static {v0, p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->b(Ljava/lang/String;Ljava/lang/String;)[B

    move-result-object v4

    .line 663
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    array-length v0, v4

    if-nez v0, :cond_1

    .line 664
    :cond_0
    const-string v0, "MemberSDk_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Fail to get sign at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "times"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 665
    goto :goto_1

    .line 667
    :cond_1
    const-string v0, "MemberSDk_Utils"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Succeed to get sign at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "times"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 668
    goto :goto_2

    .line 661
    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 672
    :cond_2
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    array-length v0, v4

    if-lez v0, :cond_3

    .line 673
    const/16 v0, 0xa

    invoke-static {v4, v0}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v3

    .line 676
    :cond_3
    return-object v3
.end method

.method private static a(Ljava/lang/String;Ljava/lang/Long;)Ljava/lang/String;
    .locals 5

    .line 475
    const/4 v3, 0x0

    .line 477
    :try_start_0
    new-instance v4, Ljava/text/SimpleDateFormat;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-direct {v4, p0, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 478
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v3, v0

    .line 481
    goto :goto_0

    .line 479
    :catch_0
    move-exception v4

    .line 480
    const-string v0, "MemberSDk_Utils"

    const-string v1, "getFormatTimeString IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 482
    :goto_0
    return-object v3
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 127
    move-object v4, p1

    .line 129
    const/4 v5, 0x0

    .line 130
    const/4 v6, 0x0

    .line 133
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    move-object v5, v0

    .line 134
    const-string v0, "get"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 139
    goto :goto_0

    .line 135
    :catch_0
    move-exception v7

    .line 136
    const-string v0, "MemberSDk_Utils[systemPropertiesGet2]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 139
    goto :goto_0

    .line 137
    :catch_1
    move-exception v7

    .line 138
    const-string v0, "MemberSDk_Utils[systemPropertiesGet2]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 141
    :goto_0
    if-eqz v6, :cond_0

    .line 143
    const/4 v0, 0x2

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    move-object v4, v0

    .line 150
    goto :goto_1

    .line 144
    :catch_2
    move-exception v7

    .line 145
    const-string v0, "MemberSDk_Utils[systemPropertiesGet2]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 150
    goto :goto_1

    .line 146
    :catch_3
    move-exception v7

    .line 147
    const-string v0, "MemberSDk_Utils[systemPropertiesGet2]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 150
    goto :goto_1

    .line 148
    :catch_4
    move-exception v7

    .line 149
    const-string v0, "MemberSDk_Utils[systemPropertiesGet2]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 153
    :cond_0
    :goto_1
    return-object v4
.end method

.method public static a(Ljava/io/InputStream;Ljava/lang/String;)V
    .locals 3

    .line 437
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 439
    :try_start_0
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 442
    goto :goto_0

    .line 440
    :catch_0
    move-exception v2

    .line 441
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "[closeStream]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 444
    :cond_0
    :goto_0
    return-void
.end method

.method public static a(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 3

    .line 419
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 421
    :try_start_0
    invoke-virtual {p0}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 424
    goto :goto_0

    .line 422
    :catch_0
    move-exception v2

    .line 423
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "[closeStream]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 426
    :cond_0
    :goto_0
    return-void
.end method

.method public static a(Ljava/lang/Exception;Ljava/lang/String;)V
    .locals 1

    .line 75
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 78
    :cond_0
    return-void
.end method

.method private static a(Ljava/lang/reflect/AccessibleObject;)V
    .locals 1

    .line 1403
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 1404
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 1406
    :cond_0
    return-void
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 1

    .line 1416
    invoke-static {p0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Z)Z
    .locals 3

    .line 1378
    const/4 v1, 0x0

    .line 1380
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v1, v0

    .line 1383
    goto :goto_0

    .line 1381
    :catch_0
    move-exception v2

    .line 1382
    const-string v0, "MemberSDk_Utils[getBooleanFiled]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 1385
    :goto_0
    if-eqz v1, :cond_0

    .line 1387
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 1389
    invoke-static {v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/reflect/AccessibleObject;)V

    .line 1390
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getBoolean(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_3

    move-result v0

    return v0

    .line 1391
    :catch_1
    move-exception v2

    .line 1392
    const-string v0, "MemberSDk_Utils[getBooleanFiled]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 1397
    goto :goto_1

    .line 1393
    :catch_2
    move-exception v2

    .line 1394
    const-string v0, "MemberSDk_Utils[getBooleanFiled]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 1397
    goto :goto_1

    .line 1395
    :catch_3
    move-exception v2

    .line 1396
    const-string v0, "MemberSDk_Utils[getBooleanFiled]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 1399
    :cond_0
    :goto_1
    return p2
.end method

.method public static a(Ljava/lang/String;Z)Z
    .locals 8

    .line 166
    move v4, p1

    .line 168
    const/4 v5, 0x0

    .line 169
    const/4 v6, 0x0

    .line 172
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    move-object v5, v0

    .line 173
    const-string v0, "getBoolean"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 178
    goto :goto_0

    .line 174
    :catch_0
    move-exception v7

    .line 175
    const-string v0, "MemberSDk_Utils[systemPropertiesGetBoolean]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 178
    goto :goto_0

    .line 176
    :catch_1
    move-exception v7

    .line 177
    const-string v0, "MemberSDk_Utils[systemPropertiesGetBoolean]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 180
    :goto_0
    if-eqz v6, :cond_0

    .line 182
    const/4 v0, 0x2

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    move-result v0

    move v4, v0

    .line 189
    goto :goto_1

    .line 183
    :catch_2
    move-exception v7

    .line 184
    const-string v0, "MemberSDk_Utils[systemPropertiesGetBoolean]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 189
    goto :goto_1

    .line 185
    :catch_3
    move-exception v7

    .line 186
    const-string v0, "MemberSDk_Utils[systemPropertiesGetBoolean]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 189
    goto :goto_1

    .line 187
    :catch_4
    move-exception v7

    .line 188
    const-string v0, "MemberSDk_Utils[systemPropertiesGetBoolean]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 192
    :cond_0
    :goto_1
    return v4
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class<*>;[Ljava/lang/Object;)Ljava/lang/Object;"
        }
    .end annotation

    .line 243
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const/4 v0, 0x0

    if-eq v0, p3, :cond_0

    array-length v0, p2

    array-length v1, p3

    if-eq v0, v1, :cond_1

    .line 244
    :cond_0
    const-string v0, "MemberSDk_Utils"

    const-string v1, "invokeFun \u53c2\u6570\u6709\u8bef"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 245
    const/4 v0, 0x0

    return-object v0

    .line 248
    :cond_1
    const/4 v2, 0x0

    .line 251
    :try_start_0
    invoke-static {p0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v2, v0

    .line 254
    goto :goto_0

    .line 252
    :catch_0
    move-exception v3

    .line 253
    const-string v0, "MemberSDk_Utils[invokeFun]"

    invoke-static {v3, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 256
    :goto_0
    if-eqz v2, :cond_2

    .line 257
    const/4 v3, 0x0

    .line 259
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2

    move-result-object v0

    move-object v3, v0

    .line 264
    goto :goto_1

    .line 260
    :catch_1
    move-exception v4

    .line 261
    const-string v0, "MemberSDk_Utils[invokeFun]"

    invoke-static {v4, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 264
    goto :goto_1

    .line 262
    :catch_2
    move-exception v4

    .line 263
    const-string v0, "MemberSDk_Utils[invokeFun]"

    invoke-static {v4, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 265
    :goto_1
    invoke-static {v2, v3, p1, p2, p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Class;Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 268
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 939
    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    return-object v0
.end method

.method private static b(Landroid/content/Context;)Z
    .locals 4

    .line 1426
    if-nez p0, :cond_0

    .line 1427
    const-string v0, "MemberSDk_Utils"

    const-string v1, "isSystemApp context is null"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1428
    const/4 v0, 0x0

    return v0

    .line 1431
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 1432
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    .line 1434
    if-eqz v3, :cond_1

    iget v0, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_1

    .line 1435
    const-string v0, "MemberSDk_Utils"

    const-string v1, "is System App"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1436
    const/4 v0, 0x1

    return v0

    .line 1440
    :cond_1
    goto :goto_0

    .line 1438
    :catch_0
    move-exception v2

    .line 1439
    const-string v0, "MemberSDk_Utils"

    const-string v1, "isSystemApp: NameNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1441
    :goto_0
    const-string v0, "MemberSDk_Utils"

    const-string v1, "not System App"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1442
    const/4 v0, 0x0

    return v0
.end method

.method public static b(Ljava/lang/String;)Z
    .locals 6

    .line 1482
    sget-object v2, Lcom/huawei/membercenter/sdk/membersdklibrary/a/a/a;->a:[Ljava/lang/String;

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    .line 1483
    invoke-virtual {v5, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1484
    const-string v0, "MemberSDk_Utils"

    const-string v1, "is watch app "

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1485
    const/4 v0, 0x1

    return v0

    .line 1482
    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 1492
    :cond_1
    const-string v0, "MemberSDk_Utils"

    const-string v1, "not watch app "

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 1493
    const/4 v0, 0x0

    return v0
.end method

.method private static b(Ljava/lang/String;Ljava/lang/String;)[B
    .locals 11

    .line 691
    const/4 v6, 0x0

    .line 693
    const-string v0, "com.huawei.attestation.HwAttestationManager"

    const-string v1, "KEY_INDEX_HWCLOUD"

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v7

    .line 694
    const/4 v0, -0x1

    if-ne v0, v7, :cond_0

    .line 695
    const-string v0, "MemberSDk_Utils"

    const-string v1, "getSign keyIndexHwcloud == -1"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 696
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 699
    :cond_0
    const-string v0, "com.huawei.attestation.HwAttestationManager"

    const-string v1, "DEVICE_ID_TYPE_EMMC"

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/String;Ljava/lang/String;I)I

    move-result v8

    .line 700
    const/4 v0, -0x1

    if-ne v0, v8, :cond_1

    .line 701
    const-string v0, "MemberSDk_Utils"

    const-string v1, "getSign deviceIdTypeEmmc == -1"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 702
    const/4 v0, 0x0

    new-array v0, v0, [B

    return-object v0

    .line 705
    :cond_1
    const/4 v9, 0x0

    .line 708
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v9, v0

    .line 711
    goto :goto_0

    .line 709
    :catch_0
    move-exception v10

    .line 710
    const-string v0, "MemberSDk_Utils"

    const-string v1, "getSign UnsupportedEncodingException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 713
    :goto_0
    const-string v0, "com.huawei.attestation.HwAttestationManager"

    const-string v1, "getAttestationSignature"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-class v3, Ljava/lang/String;

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const-class v3, [B

    const/4 v4, 0x3

    aput-object v3, v2, v4

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    .line 714
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    const/4 v4, 0x2

    aput-object p0, v3, v4

    const/4 v4, 0x3

    aput-object v9, v3, v4

    .line 713
    invoke-static {v0, v1, v2, v3}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->b(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    .line 717
    const/4 v0, 0x0

    if-eq v0, v10, :cond_2

    .line 718
    move-object v0, v10

    check-cast v0, [B

    move-object v6, v0

    check-cast v6, [B

    .line 722
    :cond_2
    const/4 v0, 0x0

    if-eq v0, v6, :cond_3

    array-length v0, v6

    if-nez v0, :cond_4

    .line 723
    :cond_3
    const-string v0, "MemberSDk_Utils"

    const-string v1, "getSign fail"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 726
    :cond_4
    return-object v6
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .line 949
    const-string v0, "ro.product.brand"

    invoke-static {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 88
    const/4 v4, 0x0

    .line 90
    const/4 v5, 0x0

    .line 91
    const/4 v6, 0x0

    .line 94
    const-string v0, "android.os.SystemProperties"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    move-object v5, v0

    .line 95
    const-string v0, "get"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Class;

    const-class v2, Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5, v0, v1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    move-object v6, v0

    .line 100
    goto :goto_0

    .line 96
    :catch_0
    move-exception v7

    .line 97
    const-string v0, "MemberSDk_Utils[systemPropertiesGet]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 100
    goto :goto_0

    .line 98
    :catch_1
    move-exception v7

    .line 99
    const-string v0, "MemberSDk_Utils[systemPropertiesGet]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 102
    :goto_0
    if-eqz v6, :cond_0

    .line 104
    const/4 v0, 0x1

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    invoke-virtual {v6, v5, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    move-object v4, v0

    .line 111
    goto :goto_1

    .line 105
    :catch_2
    move-exception v7

    .line 106
    const-string v0, "MemberSDk_Utils[systemPropertiesGet]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 111
    goto :goto_1

    .line 107
    :catch_3
    move-exception v7

    .line 108
    const-string v0, "MemberSDk_Utils[systemPropertiesGet]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 111
    goto :goto_1

    .line 109
    :catch_4
    move-exception v7

    .line 110
    const-string v0, "MemberSDk_Utils[systemPropertiesGet]"

    invoke-static {v7, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 114
    :cond_0
    :goto_1
    return-object v4
.end method

.method public static d()Ljava/lang/String;
    .locals 4

    .line 986
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->f()Ljava/lang/String;

    move-result-object v2

    .line 987
    invoke-static {}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->e()Ljava/lang/String;

    move-result-object v3

    .line 988
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e()Ljava/lang/String;
    .locals 2

    .line 958
    const/4 v1, 0x0

    .line 959
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    .line 960
    if-eqz v1, :cond_0

    .line 961
    return-object v1

    .line 963
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method private static f()Ljava/lang/String;
    .locals 2

    .line 972
    const/4 v1, 0x0

    .line 973
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    .line 974
    if-eqz v1, :cond_0

    .line 975
    return-object v1

    .line 977
    :cond_0
    const-string v0, ""

    return-object v0
.end method

.method private static g()Z
    .locals 5

    .line 1452
    const-string v0, "android.telephony.HwTelephonyManager"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4

    move-result-object v2

    .line 1453
    if-nez v2, :cond_0

    .line 1454
    const/4 v0, 0x0

    return v0

    .line 1456
    :cond_0
    const-string v0, "SUPPORT_SYSTEMAPP_GET_DEVICEID"

    :try_start_1
    invoke-virtual {v2, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    .line 1457
    invoke-static {v3}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/reflect/AccessibleObject;)V

    .line 1458
    invoke-virtual {v3, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4

    move-result v4

    .line 1459
    const/4 v0, 0x1

    if-ne v4, v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 1460
    :catch_0
    move-exception v2

    .line 1461
    const-string v0, "MemberSDk_Utils"

    const-string v1, "supportNewPermissionCheck: ClassNotFoundException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1470
    goto :goto_1

    .line 1462
    :catch_1
    move-exception v2

    .line 1463
    const-string v0, "MemberSDk_Utils"

    const-string v1, "supportNewPermissionCheck: NoSuchFieldException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1470
    goto :goto_1

    .line 1464
    :catch_2
    move-exception v2

    .line 1465
    const-string v0, "MemberSDk_Utils"

    const-string v1, "supportNewPermissionCheck: IllegalAccessException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1470
    goto :goto_1

    .line 1466
    :catch_3
    move-exception v2

    .line 1467
    const-string v0, "MemberSDk_Utils"

    const-string v1, "supportNewPermissionCheck: IllegalArgumentException"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 1470
    goto :goto_1

    .line 1468
    :catch_4
    move-exception v2

    .line 1469
    const-string v0, "MemberSDk_Utils[supportNewPermissionCheck]"

    invoke-static {v2, v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/h;->a(Ljava/lang/Exception;Ljava/lang/String;)V

    .line 1471
    :goto_1
    const-string v0, "MemberSDk_Utils"

    const-string v1, "not support New Permission"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1472
    const/4 v0, 0x0

    return v0
.end method
