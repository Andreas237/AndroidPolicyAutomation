.class public final Lo/cgk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public final b:D

.field public final d:D


# direct methods
.method public constructor <init>(DD)V
    .locals 4

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    const-wide v0, -0x3f99800000000000L    # -180.0

    cmpg-double v0, v0, p3

    if-gtz v0, :cond_0

    const-wide v0, 0x4066800000000000L    # 180.0

    cmpg-double v0, p3, v0

    if-gez v0, :cond_0

    .line 14
    invoke-static {p3, p4}, Lo/cgk;->a(D)D

    move-result-wide v0

    iput-wide v0, p0, Lo/cgk;->b:D

    goto :goto_0

    .line 16
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

    invoke-static {v0, v1}, Lo/cgk;->a(D)D

    move-result-wide v0

    iput-wide v0, p0, Lo/cgk;->b:D

    .line 21
    :goto_0
    const-wide v0, 0x4056800000000000L    # 90.0

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    const-wide v2, -0x3fa9800000000000L    # -90.0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(DD)D

    move-result-wide v0

    invoke-static {v0, v1}, Lo/cgk;->a(D)D

    move-result-wide v0

    iput-wide v0, p0, Lo/cgk;->d:D

    .line 22
    return-void
.end method

.method private static a(D)D
    .locals 4

    .line 27
    new-instance v3, Ljava/text/DecimalFormat;

    const-string v0, "0.000000"

    new-instance v1, Ljava/text/DecimalFormatSymbols;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v1, v2}, Ljava/text/DecimalFormatSymbols;-><init>(Ljava/util/Locale;)V

    invoke-direct {v3, v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;Ljava/text/DecimalFormatSymbols;)V

    .line 28
    invoke-virtual {v3, p0, p1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 7
    invoke-virtual {p0}, Lo/cgk;->e()Lo/cgk;

    move-result-object v0

    return-object v0
.end method

.method public e()Lo/cgk;
    .locals 5

    .line 32
    new-instance v0, Lo/cgk;

    iget-wide v1, p0, Lo/cgk;->d:D

    iget-wide v3, p0, Lo/cgk;->b:D

    invoke-direct {v0, v1, v2, v3, v4}, Lo/cgk;-><init>(DD)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 50
    instance-of v0, p1, Lo/cgk;

    if-nez v0, :cond_0

    .line 51
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_0
    move-object v2, p1

    check-cast v2, Lo/cgk;

    .line 54
    invoke-virtual {p0}, Lo/cgk;->hashCode()I

    move-result v0

    invoke-virtual {v2}, Lo/cgk;->hashCode()I

    move-result v1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 7

    .line 36
    const/16 v3, 0x1f

    .line 37
    const/4 v4, 0x1

    .line 38
    iget-wide v0, p0, Lo/cgk;->d:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    .line 39
    const/16 v0, 0x20

    ushr-long v0, v5, v0

    xor-long/2addr v0, v5

    long-to-int v0, v0

    add-int/lit8 v4, v0, 0x1f

    .line 40
    iget-wide v0, p0, Lo/cgk;->b:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    .line 41
    mul-int/lit8 v0, v4, 0x1f

    const/16 v1, 0x20

    ushr-long v1, v5, v1

    xor-long/2addr v1, v5

    long-to-int v1, v1

    add-int v4, v0, v1

    .line 42
    return v4
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "lat/lng: ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/cgk;->d:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v1, p0, Lo/cgk;->b:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
