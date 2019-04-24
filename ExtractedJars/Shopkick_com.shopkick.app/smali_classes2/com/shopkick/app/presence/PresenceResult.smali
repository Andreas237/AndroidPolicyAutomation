.class public Lcom/shopkick/app/presence/PresenceResult;
.super Ljava/lang/Object;
.source "PresenceResult.java"


# static fields
.field public static final PDLocEventBestLocationChanged:I = 0x2b

.field public static final PDLocEventLocationListUpdated:I = 0x15

.field public static final PDLocEventLocationUpdateFailed:I = 0x2c

.field public static final PDLocEventLocationUpdateReceived:I = 0x2a

.field public static final PDLocEventLocationUpdateRequested:I = 0x29

.field public static final PDLocEventLocationUpdated:I = 0x17

.field public static final PDLocEventSendServerData:I = 0x18

.field public static final PDLocEventUserUpdated:I = 0x16

.field public static final PDLocResultAlreadyWalkedIn:I = 0x3

.field public static final PDLocResultBadAccuracy:I = 0x7

.field public static final PDLocResultFileReadFailure:I = 0x6

.field public static final PDLocResultFileWriteFailure:I = 0x5

.field public static final PDLocResultMemoryFailure:I = 0x4

.field public static final PDLocResultNoCodeProvided:I = 0x8

.field public static final PDLocResultNoLocation:I = 0x1

.field public static final PDLocResultNoNearbyLocation:I = 0x2

.field public static final PDLocResultSuccess:I = 0x1f


# instance fields
.field public chainId:J

.field public departmentName:Ljava/lang/String;

.field public distance:J

.field public lastStoreWalkinTime:J

.field public lastWalkinTime:J

.field public latitude:D

.field public locationImageURL:Ljava/lang/String;

.field public locationName:Ljava/lang/String;

.field public longitude:D

.field public presenceCode:Ljava/lang/String;

.field public resultCode:I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 57
    iput v0, p0, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    const/4 v0, 0x0

    .line 58
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceResult;->locationName:Ljava/lang/String;

    .line 59
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceResult;->departmentName:Ljava/lang/String;

    .line 60
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceResult;->locationImageURL:Ljava/lang/String;

    const-wide/16 v1, 0x0

    .line 61
    iput-wide v1, p0, Lcom/shopkick/app/presence/PresenceResult;->lastWalkinTime:J

    .line 62
    iput-wide v1, p0, Lcom/shopkick/app/presence/PresenceResult;->lastStoreWalkinTime:J

    .line 63
    iput-object v0, p0, Lcom/shopkick/app/presence/PresenceResult;->presenceCode:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 64
    iput-wide v0, p0, Lcom/shopkick/app/presence/PresenceResult;->latitude:D

    .line 65
    iput-wide v0, p0, Lcom/shopkick/app/presence/PresenceResult;->longitude:D

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJ)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput p1, p0, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    .line 78
    iput-object p2, p0, Lcom/shopkick/app/presence/PresenceResult;->locationName:Ljava/lang/String;

    .line 79
    iput-object p3, p0, Lcom/shopkick/app/presence/PresenceResult;->departmentName:Ljava/lang/String;

    .line 80
    iput-object p4, p0, Lcom/shopkick/app/presence/PresenceResult;->locationImageURL:Ljava/lang/String;

    .line 81
    iput-wide p5, p0, Lcom/shopkick/app/presence/PresenceResult;->lastWalkinTime:J

    .line 82
    iput-wide p7, p0, Lcom/shopkick/app/presence/PresenceResult;->lastStoreWalkinTime:J

    .line 83
    iput-object p9, p0, Lcom/shopkick/app/presence/PresenceResult;->presenceCode:Ljava/lang/String;

    .line 84
    iput-wide p10, p0, Lcom/shopkick/app/presence/PresenceResult;->distance:J

    .line 85
    iput-wide p12, p0, Lcom/shopkick/app/presence/PresenceResult;->chainId:J

    const-wide/16 p1, 0x0

    .line 86
    iput-wide p1, p0, Lcom/shopkick/app/presence/PresenceResult;->latitude:D

    .line 87
    iput-wide p1, p0, Lcom/shopkick/app/presence/PresenceResult;->longitude:D

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JJDD)V
    .locals 8

    move-object v0, p0

    move-wide/from16 v1, p14

    move-wide/from16 v3, p16

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move v5, p1

    .line 101
    iput v5, v0, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    move-object v5, p2

    .line 102
    iput-object v5, v0, Lcom/shopkick/app/presence/PresenceResult;->locationName:Ljava/lang/String;

    move-object v5, p3

    .line 103
    iput-object v5, v0, Lcom/shopkick/app/presence/PresenceResult;->departmentName:Ljava/lang/String;

    move-object v5, p4

    .line 104
    iput-object v5, v0, Lcom/shopkick/app/presence/PresenceResult;->locationImageURL:Ljava/lang/String;

    move-wide v5, p5

    .line 105
    iput-wide v5, v0, Lcom/shopkick/app/presence/PresenceResult;->lastWalkinTime:J

    move-wide v5, p7

    .line 106
    iput-wide v5, v0, Lcom/shopkick/app/presence/PresenceResult;->lastStoreWalkinTime:J

    move-object/from16 v5, p9

    .line 107
    iput-object v5, v0, Lcom/shopkick/app/presence/PresenceResult;->presenceCode:Ljava/lang/String;

    move-wide/from16 v5, p10

    .line 108
    iput-wide v5, v0, Lcom/shopkick/app/presence/PresenceResult;->distance:J

    move-wide/from16 v5, p12

    .line 109
    iput-wide v5, v0, Lcom/shopkick/app/presence/PresenceResult;->chainId:J

    .line 110
    iput-wide v1, v0, Lcom/shopkick/app/presence/PresenceResult;->latitude:D

    .line 111
    iput-wide v3, v0, Lcom/shopkick/app/presence/PresenceResult;->longitude:D

    const-string v5, "Geofencing"

    .line 112
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "In PresenceResult constructor, Lat: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, " : lng: "

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 117
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PresenceResult [resultCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/shopkick/app/presence/PresenceResult;->resultCode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", locationName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceResult;->locationName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", departmentName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceResult;->departmentName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", locationImageURL="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceResult;->locationImageURL:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", lastWalkinTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/shopkick/app/presence/PresenceResult;->lastWalkinTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", lastStoreWalkinTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/shopkick/app/presence/PresenceResult;->lastStoreWalkinTime:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", presenceCode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/shopkick/app/presence/PresenceResult;->presenceCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", distance="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/shopkick/app/presence/PresenceResult;->distance:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", chainId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/shopkick/app/presence/PresenceResult;->chainId:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", latitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/shopkick/app/presence/PresenceResult;->latitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", longitude="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/shopkick/app/presence/PresenceResult;->longitude:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
