.class final Lcom/huawei/hidatamanager/DataListenerService$MyHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hidatamanager/DataListenerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "MyHandler"
.end annotation


# static fields
.field public static final MSG_ON_FEATURE_DATA_CHANGED:I = 0x1


# instance fields
.field final synthetic this$0:Lcom/huawei/hidatamanager/DataListenerService;


# direct methods
.method public constructor <init>(Lcom/huawei/hidatamanager/DataListenerService;Landroid/os/Looper;)V
    .locals 1

    .line 69
    iput-object p1, p0, Lcom/huawei/hidatamanager/DataListenerService$MyHandler;->this$0:Lcom/huawei/hidatamanager/DataListenerService;

    .line 70
    const/4 v0, 0x0

    invoke-direct {p0, p2, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 71
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 12

    .line 75
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 77
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    .line 78
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 80
    :try_start_0
    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 81
    const-string v0, "dataType"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    .line 82
    const-string v0, "timestamp"

    invoke-virtual {v7, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v10

    .line 83
    iget-object v0, p0, Lcom/huawei/hidatamanager/DataListenerService$MyHandler;->this$0:Lcom/huawei/hidatamanager/DataListenerService;

    move-wide v1, v8

    move-wide v3, v10

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lcom/huawei/hidatamanager/DataListenerService;->onFeatureDataAdded(JJLjava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    goto :goto_0

    .line 84
    :catch_0
    move-exception v7

    .line 85
    const-string v0, "DataListenerService"

    const-string v1, " json data exception!"

    invoke-static {v0, v1}, Lcom/huawei/hidatamanager/util/LogUtils;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 86
    .line 94
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
