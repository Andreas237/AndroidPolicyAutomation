.class Lo/ees;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(I)Ljava/lang/String;
    .locals 2

    .line 80
    const/4 v1, 0x0

    .line 81
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 84
    :pswitch_0
    const-string v1, "IErrCode.ERR_APPVER_LOW"

    .line 85
    goto :goto_1

    .line 87
    :pswitch_1
    const-string v1, "IErrCode.ERR_SDKVER_LOW"

    .line 88
    goto :goto_1

    .line 90
    :pswitch_2
    const-string v1, "IErrCode.ERR_USER_CANCEL"

    .line 91
    goto :goto_1

    .line 93
    :pswitch_3
    const-string v1, "IErrCode.ERR_PARAM"

    .line 94
    goto :goto_1

    .line 96
    :pswitch_4
    const-string v1, "IErrCode.ERR_NETWORK"

    .line 97
    goto :goto_1

    .line 99
    :pswitch_5
    const-string v1, "IErrCode.ERR_NO_INIT"

    .line 100
    goto :goto_1

    .line 102
    :pswitch_6
    const-string v1, "IErrCode.ERR_SYNC"

    .line 103
    goto :goto_1

    .line 105
    :pswitch_7
    const-string v1, "IErrCode.ERR_ACTIVITY"

    .line 106
    goto :goto_1

    .line 108
    :goto_0
    const-string v1, "UnKnow IErrCode"

    .line 111
    :goto_1
    return-object v1

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method

.method private static b(I)Ljava/lang/String;
    .locals 2

    .line 44
    const/4 v1, 0x0

    .line 45
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 48
    :pswitch_0
    const-string v1, "IErrCode.ERR_OK"

    .line 49
    goto :goto_0

    .line 51
    :pswitch_1
    const-string v1, "IErrCode.ERR_AUTH_DENIED"

    .line 52
    goto :goto_0

    .line 54
    :pswitch_2
    const-string v1, "IErrCode.ERR_COMM"

    .line 55
    goto :goto_0

    .line 57
    :pswitch_3
    const-string v1, "IErrCode.ERR_UNSUPPORT"

    .line 58
    goto :goto_0

    .line 60
    :pswitch_4
    const-string v1, "IErrCode.ERR_NO_APP"

    .line 61
    goto :goto_0

    .line 63
    :pswitch_5
    const-string v1, "IErrCode.ERR_FORBIDDEN"

    .line 64
    .line 68
    :goto_0
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method static e(I)Ljava/lang/String;
    .locals 3

    .line 26
    invoke-static {p0}, Lo/ees;->b(I)Ljava/lang/String;

    move-result-object v2

    .line 27
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 29
    :cond_0
    invoke-static {p0}, Lo/ees;->a(I)Ljava/lang/String;

    move-result-object v2

    .line 31
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 32
    return-object v2
.end method

.method static e(Ljava/lang/String;)Z
    .locals 1

    .line 123
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    .line 125
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 128
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
