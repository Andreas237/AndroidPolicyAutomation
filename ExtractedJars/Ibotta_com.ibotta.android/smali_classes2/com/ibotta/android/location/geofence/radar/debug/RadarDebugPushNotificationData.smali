.class public final Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;
.super Ljava/lang/Object;
.source "RadarDebugPushNotificationData.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0008\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0003\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;",
        "",
        "smallIconResId",
        "",
        "message",
        "",
        "notificationId",
        "(ILjava/lang/String;I)V",
        "getMessage",
        "()Ljava/lang/String;",
        "getNotificationId",
        "()I",
        "getSmallIconResId",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "ibotta-location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final message:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final notificationId:I

.field private final smallIconResId:I


# direct methods
.method public constructor <init>(ILjava/lang/String;I)V
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->smallIconResId:I

    iput-object p2, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->message:Ljava/lang/String;

    iput p3, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->notificationId:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;ILjava/lang/String;IILjava/lang/Object;)Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;
    .locals 0
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget p1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->smallIconResId:I

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->message:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->notificationId:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->copy(ILjava/lang/String;I)Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->smallIconResId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->notificationId:I

    return v0
.end method

.method public final copy(ILjava/lang/String;I)Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;
    .locals 1
    .param p1    # I
        .annotation build Landroid/support/annotation/DrawableRes;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "message"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;

    invoke-direct {v0, p1, p2, p3}, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;-><init>(ILjava/lang/String;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-eq p0, p1, :cond_3

    instance-of v1, p1, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;

    iget v1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->smallIconResId:I

    iget v3, p1, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->smallIconResId:I

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->message:Ljava/lang/String;

    iget-object v3, p1, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->message:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->notificationId:I

    iget p1, p1, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->notificationId:I

    if-ne v1, p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    return v2

    :cond_3
    :goto_2
    return v0
.end method

.method public final getMessage()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 7
    iget-object v0, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->message:Ljava/lang/String;

    return-object v0
.end method

.method public final getNotificationId()I
    .locals 1

    .line 8
    iget v0, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->notificationId:I

    return v0
.end method

.method public final getSmallIconResId()I
    .locals 1

    .line 6
    iget v0, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->smallIconResId:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->smallIconResId:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->message:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->notificationId:I

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RadarDebugPushNotificationData(smallIconResId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->smallIconResId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->message:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", notificationId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/ibotta/android/location/geofence/radar/debug/RadarDebugPushNotificationData;->notificationId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
