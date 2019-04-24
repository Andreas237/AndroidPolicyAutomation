.class public Lcom/shopkick/app/location/ActivityDetectionBroadcastReceiver;
.super Landroid/content/BroadcastReceiver;
.source "ActivityDetectionBroadcastReceiver.java"


# static fields
.field public static final ACTIVITY_EXTRA:Ljava/lang/String; = "shopkick.ActivityDetection.Extra"

.field public static final BROADCAST_ACTION:Ljava/lang/String; = "shopkick.ActivityDetection"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method private getNameFromType(I)Ljava/lang/String;
    .locals 0

    packed-switch p1, :pswitch_data_0

    const-string/jumbo p1, "unknown"

    return-object p1

    :pswitch_0
    const-string/jumbo p1, "tilting"

    return-object p1

    :pswitch_1
    const-string/jumbo p1, "unknown"

    return-object p1

    :pswitch_2
    const-string/jumbo p1, "still"

    return-object p1

    :pswitch_3
    const-string p1, "on_foot"

    return-object p1

    :pswitch_4
    const-string p1, "on_bicycle"

    return-object p1

    :pswitch_5
    const-string p1, "in_vehicle"

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    .line 19
    invoke-static {p2}, Lcom/google/android/gms/location/ActivityRecognitionResult;->hasResult(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 21
    invoke-static {p2}, Lcom/google/android/gms/location/ActivityRecognitionResult;->extractResult(Landroid/content/Intent;)Lcom/google/android/gms/location/ActivityRecognitionResult;

    move-result-object p2

    .line 23
    invoke-virtual {p2}, Lcom/google/android/gms/location/ActivityRecognitionResult;->getMostProbableActivity()Lcom/google/android/gms/location/DetectedActivity;

    move-result-object p2

    .line 25
    invoke-virtual {p2}, Lcom/google/android/gms/location/DetectedActivity;->getConfidence()I

    move-result v0

    .line 26
    invoke-virtual {p2}, Lcom/google/android/gms/location/DetectedActivity;->getType()I

    move-result v1

    .line 27
    invoke-direct {p0, v1}, Lcom/shopkick/app/location/ActivityDetectionBroadcastReceiver;->getNameFromType(I)Ljava/lang/String;

    move-result-object v1

    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 30
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    instance-of v1, v1, Lcom/shopkick/app/application/SKApp;

    if-eqz v1, :cond_0

    .line 31
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    check-cast v1, Lcom/shopkick/app/application/SKApp;

    iget-object v1, v1, Lcom/shopkick/app/application/SKApp;->debugLogManager:Lcom/shopkick/app/debug/DebugLogManager;

    const-string v2, "activity"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/debug/DebugLogManager;->logWithTimeStamp(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v1, "activity"

    .line 34
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 37
    :goto_0
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "shopkick.ActivityDetection"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "shopkick.ActivityDetection.Extra"

    .line 38
    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 39
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    :cond_1
    return-void
.end method
