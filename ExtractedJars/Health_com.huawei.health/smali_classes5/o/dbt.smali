.class public Lo/dbt;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(I)I
    .locals 4

    .line 50
    int-to-double v0, p0

    const-wide v2, 0x400451eb851eb852L    # 2.54

    mul-double/2addr v0, v2

    double-to-int v0, v0

    return v0
.end method

.method public static b(DII)Ljava/lang/String;
    .locals 5

    .line 89
    const-string v2, ""

    .line 91
    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    .line 93
    :sswitch_0
    invoke-static {}, Ljava/text/NumberFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v3

    .line 94
    invoke-virtual {v3, p3}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 95
    invoke-virtual {v3, p3}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 96
    invoke-virtual {v3, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    .line 97
    goto :goto_0

    .line 99
    :sswitch_1
    invoke-static {}, Ljava/text/NumberFormat;->getPercentInstance()Ljava/text/NumberFormat;

    move-result-object v4

    .line 100
    invoke-virtual {v4, p3}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    .line 101
    invoke-virtual {v4, p3}, Ljava/text/NumberFormat;->setMinimumFractionDigits(I)V

    .line 102
    const-wide/high16 v0, 0x4059000000000000L    # 100.0

    div-double/2addr p0, v0

    .line 103
    invoke-virtual {v4, p0, p1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v2

    .line 104
    .line 108
    :goto_0
    return-object v2

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public static c(F)F
    .locals 4

    .line 63
    float-to-double v0, p0

    const-wide v2, 0x3fdd079e59f2ba9dL    # 0.45359

    mul-double/2addr v0, v2

    double-to-float v0, v0

    return v0
.end method

.method public static c(I)I
    .locals 6

    .line 54
    int-to-double v0, p0

    const-wide v2, 0x400451eb851eb852L    # 2.54

    div-double v4, v0, v2

    .line 55
    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method

.method public static e(F)I
    .locals 4

    .line 67
    float-to-double v0, p0

    const-wide v2, 0x3fdd079e59f2ba9dL    # 0.45359

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    return v0
.end method
