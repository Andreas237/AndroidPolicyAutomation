.class Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;
.super Landroid/os/AsyncTask;
.source "DeviceInfo.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/DeviceInfo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "GetAdvertisingInfoTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/DeviceInfo;


# direct methods
.method private constructor <init>(Lcom/shopkick/app/application/DeviceInfo;)V
    .locals 0

    .line 671
    iput-object p1, p0, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;->this$0:Lcom/shopkick/app/application/DeviceInfo;

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/DeviceInfo$1;)V
    .locals 0

    .line 671
    invoke-direct {p0, p1}, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;-><init>(Lcom/shopkick/app/application/DeviceInfo;)V

    return-void
.end method


# virtual methods
.method protected varargs doInBackground([Ljava/lang/Void;)Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;
    .locals 4

    .line 674
    new-instance p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    invoke-direct {p1}, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;-><init>()V

    .line 676
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;->this$0:Lcom/shopkick/app/application/DeviceInfo;

    invoke-static {v0}, Lcom/shopkick/app/application/DeviceInfo;->access$200(Lcom/shopkick/app/application/DeviceInfo;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient;->getAdvertisingIdInfo(Landroid/content/Context;)Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;

    move-result-object v0

    .line 677
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->getId()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->advertisingId:Ljava/lang/String;

    .line 678
    invoke-virtual {v0}, Lcom/google/android/gms/ads/identifier/AdvertisingIdClient$Info;->isLimitAdTrackingEnabled()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->isLimitAdTrackingEnabled:Ljava/lang/Boolean;

    .line 681
    iget-object v0, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->advertisingId:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 682
    iget-object v0, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->advertisingId:Ljava/lang/String;

    invoke-static {v0}, Lcom/shopkick/app/util/Crypto;->sha1Hash(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->encryptedAdvertisingId:Ljava/lang/String;

    :cond_0
    const-string/jumbo v0, "should_get_ad_id_%s"

    const/4 v1, 0x1

    .line 684
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;->advertisingId:Ljava/lang/String;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/shopkick/app/application/DeviceInfo;->access$300(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "advertising_id_exception"

    .line 686
    invoke-static {v0, v1}, Lcom/shopkick/app/application/DeviceInfo;->access$400(Ljava/lang/Exception;Ljava/lang/String;)V

    :goto_0
    return-object p1
.end method

.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 671
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;->doInBackground([Ljava/lang/Void;)Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    move-result-object p1

    return-object p1
.end method

.method protected onPostExecute(Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;)V
    .locals 1

    .line 696
    iget-object v0, p0, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;->this$0:Lcom/shopkick/app/application/DeviceInfo;

    invoke-static {v0, p1}, Lcom/shopkick/app/application/DeviceInfo;->access$502(Lcom/shopkick/app/application/DeviceInfo;Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;)Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    .line 697
    iget-object p1, p0, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;->this$0:Lcom/shopkick/app/application/DeviceInfo;

    invoke-static {p1}, Lcom/shopkick/app/application/DeviceInfo;->access$600(Lcom/shopkick/app/application/DeviceInfo;)Lcom/shopkick/app/util/NotificationCenter;

    move-result-object p1

    const-string v0, "advertisingIdReady"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    return-void
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 671
    check-cast p1, Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/DeviceInfo$GetAdvertisingInfoTask;->onPostExecute(Lcom/shopkick/app/application/DeviceInfo$AdvertisingInfo;)V

    return-void
.end method
