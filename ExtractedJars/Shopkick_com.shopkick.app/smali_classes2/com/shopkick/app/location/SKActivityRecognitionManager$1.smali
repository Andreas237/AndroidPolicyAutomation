.class Lcom/shopkick/app/location/SKActivityRecognitionManager$1;
.super Landroid/content/BroadcastReceiver;
.source "SKActivityRecognitionManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/location/SKActivityRecognitionManager;-><init>(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/location/SKActivityRecognitionManager;)V
    .locals 0

    .line 43
    iput-object p1, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager$1;->this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    const-string/jumbo p1, "shopkick.ActivityDetection.Extra"

    .line 46
    invoke-virtual {p2, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/location/DetectedActivity;

    .line 48
    iget-object p2, p0, Lcom/shopkick/app/location/SKActivityRecognitionManager$1;->this$0:Lcom/shopkick/app/location/SKActivityRecognitionManager;

    invoke-static {p2}, Lcom/shopkick/app/location/SKActivityRecognitionManager;->access$000(Lcom/shopkick/app/location/SKActivityRecognitionManager;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/location/IActivityRecognitionCallback;

    .line 49
    invoke-interface {v0, p1}, Lcom/shopkick/app/location/IActivityRecognitionCallback;->onActivityDetected(Lcom/google/android/gms/location/DetectedActivity;)V

    goto :goto_0

    :cond_0
    return-void
.end method
