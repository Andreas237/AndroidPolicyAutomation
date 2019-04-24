.class public Lcom/microblink/internal/Location;
.super Ljava/lang/Object;


# instance fields
.field private lat:D

.field private lon:D


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public latitude()D
    .locals 2

    iget-wide v0, p0, Lcom/microblink/internal/Location;->lat:D

    return-wide v0
.end method

.method public latitude(D)Lcom/microblink/internal/Location;
    .locals 0

    iput-wide p1, p0, Lcom/microblink/internal/Location;->lat:D

    return-object p0
.end method

.method public longitude()D
    .locals 2

    iget-wide v0, p0, Lcom/microblink/internal/Location;->lon:D

    return-wide v0
.end method

.method public longitude(D)Lcom/microblink/internal/Location;
    .locals 0

    iput-wide p1, p0, Lcom/microblink/internal/Location;->lon:D

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Location{lat="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/microblink/internal/Location;->lat:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", lon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/microblink/internal/Location;->lon:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
