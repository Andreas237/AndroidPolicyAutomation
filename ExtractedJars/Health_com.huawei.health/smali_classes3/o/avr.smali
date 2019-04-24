.class public final Lo/avr;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 2

    .line 96
    const/4 v1, 0x0

    .line 97
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 100
    :pswitch_0
    const/4 v1, 0x1

    .line 101
    goto :goto_0

    .line 103
    :pswitch_1
    const/4 v1, 0x2

    .line 104
    goto :goto_0

    .line 106
    :pswitch_2
    const/4 v1, 0x3

    .line 107
    .line 111
    :goto_0
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static a([ILjava/lang/String;Ljava/lang/String;)Z
    .locals 9

    .line 27
    if-eqz p0, :cond_0

    array-length v0, p0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 29
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 31
    :cond_1
    const/4 v2, 0x0

    .line 32
    const-string v0, ","

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 33
    move-object v4, p1

    .line 35
    const/4 v5, -0x1

    .line 36
    const/4 v6, 0x0

    .line 39
    const/4 v8, 0x0

    :goto_0
    array-length v0, v3

    if-ge v8, v0, :cond_7

    .line 41
    aget-object v7, v3, v8

    .line 44
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 46
    goto :goto_2

    .line 49
    :cond_2
    invoke-virtual {v4, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 52
    if-nez v2, :cond_3

    .line 54
    move v5, v8

    .line 56
    :cond_3
    const/4 v2, 0x1

    .line 57
    add-int/lit8 v6, v6, 0x1

    .line 58
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    .line 63
    :cond_4
    invoke-virtual {v7, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 66
    if-nez v2, :cond_5

    .line 68
    move v5, v8

    .line 69
    const/4 v2, 0x1

    .line 71
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 72
    goto :goto_2

    .line 39
    :cond_6
    :goto_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 77
    :cond_7
    :goto_2
    if-nez v2, :cond_8

    .line 79
    return v2

    .line 82
    :cond_8
    const/4 v0, 0x0

    aput v5, p0, v0

    .line 84
    const/4 v0, 0x1

    aput v6, p0, v0

    .line 85
    return v2
.end method
