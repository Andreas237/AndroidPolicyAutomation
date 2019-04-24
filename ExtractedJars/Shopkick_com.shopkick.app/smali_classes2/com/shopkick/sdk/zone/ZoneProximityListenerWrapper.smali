.class public Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;
.super Ljava/lang/Object;
.source "ZoneProximityListenerWrapper.java"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;",
        ">;"
    }
.end annotation


# instance fields
.field private enterTime:J

.field private final id:Ljava/lang/String;

.field private lastCalled:J

.field private lastDwelled:J

.field private final listener:Lcom/shopkick/sdk/zone/ZoneProximityListener;

.field private final proximity:I

.field private withinZone:Z

.field private final zone:Lcom/shopkick/sdk/zone/ZoneParcelable;


# direct methods
.method public constructor <init>(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILcom/shopkick/sdk/zone/ZoneParcelable;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->listener:Lcom/shopkick/sdk/zone/ZoneProximityListener;

    .line 28
    iput p2, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->proximity:I

    .line 29
    iput-object p3, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->zone:Lcom/shopkick/sdk/zone/ZoneParcelable;

    const/4 p1, 0x0

    .line 30
    iput-boolean p1, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->withinZone:Z

    .line 31
    iget-object p1, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->listener:Lcom/shopkick/sdk/zone/ZoneProximityListener;

    iget p2, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->proximity:I

    iget-object p3, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->zone:Lcom/shopkick/sdk/zone/ZoneParcelable;

    invoke-static {p1, p2, p3}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getId(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILcom/shopkick/sdk/zone/ZoneParcelable;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->id:Ljava/lang/String;

    return-void
.end method

.method private static getId(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILcom/shopkick/sdk/zone/ZoneParcelable;)Ljava/lang/String;
    .locals 4

    .line 132
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "%1$d %2$d %3$d"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v3, 0x0

    aput-object p0, v2, v3

    .line 136
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x1

    aput-object p0, v2, p1

    .line 137
    invoke-virtual {p2}, Lcom/shopkick/sdk/zone/ZoneParcelable;->hashCode()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p1, 0x2

    aput-object p0, v2, p1

    .line 132
    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static hashCode(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILcom/shopkick/sdk/zone/ZoneParcelable;)I
    .locals 0

    .line 145
    invoke-static {p0, p1, p2}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->getId(Lcom/shopkick/sdk/zone/ZoneProximityListener;ILcom/shopkick/sdk/zone/ZoneParcelable;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result p0

    return p0
.end method


# virtual methods
.method public compareTo(Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)I
    .locals 1

    .line 127
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->hashCode()I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 6
    check-cast p1, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;

    invoke-virtual {p0, p1}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->compareTo(Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 113
    :cond_0
    invoke-virtual {p0}, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->hashCode()I

    move-result v1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    if-ne v1, p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method public getEnterTime()J
    .locals 2

    .line 36
    iget-wide v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->enterTime:J

    return-wide v0
.end method

.method public getLastCalled()J
    .locals 2

    .line 46
    iget-wide v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->lastCalled:J

    return-wide v0
.end method

.method public getLastDwelled()J
    .locals 2

    .line 41
    iget-wide v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->lastDwelled:J

    return-wide v0
.end method

.method public getListener()Lcom/shopkick/sdk/zone/ZoneProximityListener;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->listener:Lcom/shopkick/sdk/zone/ZoneProximityListener;

    return-object v0
.end method

.method public getProximity()I
    .locals 1

    .line 51
    iget v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->proximity:I

    return v0
.end method

.method public getZone()Lcom/shopkick/sdk/zone/Zone;
    .locals 1

    .line 66
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->zone:Lcom/shopkick/sdk/zone/ZoneParcelable;

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 118
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isWithinZone()Z
    .locals 1

    .line 56
    iget-boolean v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->withinZone:Z

    return v0
.end method

.method public setEnterTime(J)V
    .locals 0

    .line 76
    iput-wide p1, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->enterTime:J

    return-void
.end method

.method public setLastCalled(J)V
    .locals 0

    .line 96
    iput-wide p1, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->lastCalled:J

    return-void
.end method

.method public setLastDwelled(J)V
    .locals 0

    .line 86
    iput-wide p1, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->lastDwelled:J

    return-void
.end method

.method public setWithinZone(Z)V
    .locals 0

    .line 106
    iput-boolean p1, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->withinZone:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 122
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ZoneProximityListenerWrapper;->id:Ljava/lang/String;

    return-object v0
.end method
