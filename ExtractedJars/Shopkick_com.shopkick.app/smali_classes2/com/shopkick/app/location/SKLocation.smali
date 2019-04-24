.class public Lcom/shopkick/app/location/SKLocation;
.super Ljava/lang/Object;
.source "SKLocation.java"


# static fields
.field public static final coordMultiplicationFactor:I = 0x2710


# instance fields
.field public accuracy:I

.field public lat:D

.field public lng:D

.field public timestamp:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 18
    iput-wide v0, p0, Lcom/shopkick/app/location/SKLocation;->lat:D

    .line 19
    iput-wide v0, p0, Lcom/shopkick/app/location/SKLocation;->lng:D

    const/4 v0, 0x0

    .line 20
    iput v0, p0, Lcom/shopkick/app/location/SKLocation;->accuracy:I

    const-wide/16 v0, 0x0

    .line 21
    iput-wide v0, p0, Lcom/shopkick/app/location/SKLocation;->timestamp:J

    return-void
.end method

.method public constructor <init>(DDIJ)V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-wide p1, p0, Lcom/shopkick/app/location/SKLocation;->lat:D

    .line 26
    iput-wide p3, p0, Lcom/shopkick/app/location/SKLocation;->lng:D

    .line 27
    iput p5, p0, Lcom/shopkick/app/location/SKLocation;->accuracy:I

    .line 28
    iput-wide p6, p0, Lcom/shopkick/app/location/SKLocation;->timestamp:J

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    .line 37
    check-cast p1, Lcom/shopkick/app/location/SKLocation;

    .line 38
    iget-wide v0, p1, Lcom/shopkick/app/location/SKLocation;->lat:D

    const-wide v2, 0x40c3880000000000L    # 10000.0

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iget-wide v4, p0, Lcom/shopkick/app/location/SKLocation;->lat:D

    mul-double/2addr v4, v2

    double-to-int v1, v4

    if-ne v0, v1, :cond_0

    iget-wide v0, p1, Lcom/shopkick/app/location/SKLocation;->lng:D

    mul-double/2addr v0, v2

    double-to-int v0, v0

    iget-wide v4, p0, Lcom/shopkick/app/location/SKLocation;->lng:D

    mul-double/2addr v4, v2

    double-to-int v1, v4

    if-ne v0, v1, :cond_0

    iget p1, p1, Lcom/shopkick/app/location/SKLocation;->accuracy:I

    iget v0, p0, Lcom/shopkick/app/location/SKLocation;->accuracy:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public hashCode()I
    .locals 3

    .line 50
    iget-wide v0, p0, Lcom/shopkick/app/location/SKLocation;->lat:D

    double-to-int v0, v0

    iget-wide v1, p0, Lcom/shopkick/app/location/SKLocation;->lng:D

    double-to-int v1, v1

    add-int/2addr v0, v1

    iget v1, p0, Lcom/shopkick/app/location/SKLocation;->accuracy:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "((%.6f,%.6f), %d)"

    const/4 v1, 0x3

    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v2, p0, Lcom/shopkick/app/location/SKLocation;->lat:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-wide v2, p0, Lcom/shopkick/app/location/SKLocation;->lng:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, Lcom/shopkick/app/location/SKLocation;->accuracy:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
