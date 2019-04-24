.class public final Lo/cuk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final c:D

.field public final d:D


# direct methods
.method public constructor <init>(DD)V
    .locals 4

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    const-wide v0, -0x3f99800000000000L    # -180.0

    cmpg-double v0, v0, p3

    if-gtz v0, :cond_0

    const-wide v0, 0x4066800000000000L    # 180.0

    cmpg-double v0, p3, v0

    if-gez v0, :cond_0

    .line 13
    invoke-static {p3, p4}, Lo/cuk;->c(D)D

    move-result-wide v0

    iput-wide v0, p0, Lo/cuk;->d:D

    goto :goto_0

    .line 15
    :cond_0
    const-wide v0, 0x4066800000000000L    # 180.0

    sub-double v0, p3, v0

    const-wide v2, 0x4076800000000000L    # 360.0

    rem-double/2addr v0, v2

    const-wide v2, 0x4076800000000000L    # 360.0

    add-double/2addr v0, v2

    const-wide v2, 0x4076800000000000L    # 360.0

    rem-double/2addr v0, v2

    const-wide v2, 0x4066800000000000L    # 180.0

    sub-double/2addr v0, v2

    invoke-static {v0, v1}, Lo/cuk;->c(D)D

    move-result-wide v0

    iput-wide v0, p0, Lo/cuk;->d:D

    .line 17
    :goto_0
    const-wide v0, 0x4056800000000000L    # 90.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    const-wide v2, -0x3fa9800000000000L    # -90.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cuk;->c(D)D

    move-result-wide v0

    iput-wide v0, p0, Lo/cuk;->c:D

    .line 18
    return-void
.end method

.method private static c(D)D
    .locals 4

    .line 21
    new-instance v3, Ljava/text/DecimalFormat;

    const-string v0, "0.000000"

    new-instance v1, Ljava/text/DecimalFormatSymbols;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    invoke-direct {v3, v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 22
    invoke-virtual {v3, p0, p1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method
