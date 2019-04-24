.class public Lcom/huawei/ui/main/stories/messagecenter/interactors/AdvertisePushReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwcloudmodel/callback/IPushBase;
.implements Lo/cyz;


# static fields
.field private static final TAG:Ljava/lang/String; = "AdvertisePushReceiver"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public processPushMsg(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    .line 29
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    const-string v0, ""

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 30
    :cond_0
    const-string v0, "AdvertisePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processPushMsg  Error PushMsg is Empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    return-void

    .line 33
    :cond_1
    const-string v0, "AdvertisePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processPushMsg():msg="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const/4 v4, 0x0

    .line 36
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v4, v0

    .line 39
    goto :goto_0

    .line 37
    :catch_0
    move-exception v5

    .line 38
    const-string v0, "AdvertisePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v5}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 41
    :goto_0
    const/4 v0, 0x0

    if-ne v0, v4, :cond_2

    .line 42
    return-void

    .line 44
    :cond_2
    new-instance v5, Lcom/huawei/hwcloudmodel/model/push/PushMessage;

    invoke-direct {v5}, Lcom/huawei/hwcloudmodel/model/push/PushMessage;-><init>()V

    .line 45
    invoke-virtual {v5, v4}, Lcom/huawei/hwcloudmodel/model/push/PushMessage;->fillMessage(Lorg/json/JSONObject;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 47
    invoke-static {p1, v5}, Lcom/huawei/ui/main/stories/messagecenter/interactors/PushNotificationReceiver;->b(Landroid/content/Context;Lcom/huawei/hwcloudmodel/model/push/PushMessage;)V

    goto :goto_1

    .line 50
    :cond_3
    const-string v0, "AdvertisePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "not PushMessage!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    :goto_1
    return-void
.end method

.method public pushTokenHandle(Landroid/content/Context;Ljava/lang/String;)V
    .locals 4

    .line 59
    const-string v0, "AdvertisePushReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "token = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    return-void
.end method
