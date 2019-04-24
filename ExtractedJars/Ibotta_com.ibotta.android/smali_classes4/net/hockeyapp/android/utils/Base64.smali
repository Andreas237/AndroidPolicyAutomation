.class public Lnet/hockeyapp/android/utils/Base64;
.super Ljava/lang/Object;
.source "Base64.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/hockeyapp/android/utils/Base64$Encoder;,
        Lnet/hockeyapp/android/utils/Base64$Coder;
    }
.end annotation


# direct methods
.method public static encode([BI)[B
    .locals 2

    .line 480
    array-length v0, p0

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, p1}, Lnet/hockeyapp/android/utils/Base64;->encode([BIII)[B

    move-result-object p0

    return-object p0
.end method

.method public static encode([BIII)[B
    .locals 4

    .line 497
    new-instance v0, Lnet/hockeyapp/android/utils/Base64$Encoder;

    const/4 v1, 0x0

    invoke-direct {v0, p3, v1}, Lnet/hockeyapp/android/utils/Base64$Encoder;-><init>(I[B)V

    .line 500
    div-int/lit8 p3, p2, 0x3

    mul-int/lit8 p3, p3, 0x4

    .line 503
    iget-boolean v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_padding:Z

    if-eqz v1, :cond_0

    .line 504
    rem-int/lit8 v1, p2, 0x3

    if-lez v1, :cond_1

    add-int/lit8 p3, p3, 0x4

    goto :goto_0

    .line 508
    :cond_0
    rem-int/lit8 v1, p2, 0x3

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    add-int/lit8 p3, p3, 0x3

    goto :goto_0

    :pswitch_1
    add-int/lit8 p3, p3, 0x2

    .line 521
    :cond_1
    :goto_0
    :pswitch_2
    iget-boolean v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_newline:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    if-lez p2, :cond_3

    add-int/lit8 v1, p2, -0x1

    .line 522
    div-int/lit8 v1, v1, 0x39

    add-int/2addr v1, v2

    iget-boolean v3, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->do_cr:Z

    if-eqz v3, :cond_2

    const/4 v3, 0x2

    goto :goto_1

    :cond_2
    const/4 v3, 0x1

    :goto_1
    mul-int v1, v1, v3

    add-int/2addr p3, v1

    .line 526
    :cond_3
    new-array v1, p3, [B

    iput-object v1, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->output:[B

    .line 527
    invoke-virtual {v0, p0, p1, p2, v2}, Lnet/hockeyapp/android/utils/Base64$Encoder;->process([BIIZ)Z

    .line 529
    iget p0, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->op:I

    if-ne p0, p3, :cond_4

    .line 533
    iget-object p0, v0, Lnet/hockeyapp/android/utils/Base64$Encoder;->output:[B

    return-object p0

    .line 530
    :cond_4
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static encodeToString([BI)Ljava/lang/String;
    .locals 1

    .line 440
    :try_start_0
    new-instance v0, Ljava/lang/String;

    invoke-static {p0, p1}, Lnet/hockeyapp/android/utils/Base64;->encode([BI)[B

    move-result-object p0

    const-string p1, "US-ASCII"

    invoke-direct {v0, p0, p1}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 443
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
