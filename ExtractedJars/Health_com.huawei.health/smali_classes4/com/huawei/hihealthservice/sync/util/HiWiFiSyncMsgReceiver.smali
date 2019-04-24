.class public Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwcloudmodel/callback/IPushBase;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "Debug_HiWiFiSyncMsgReceiver"

.field private static final WIFI_SYNC_PUSH_TYPE:Ljava/lang/String; = "9"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    return-void
.end method


# virtual methods
.method public processPushMsg(Landroid/content/Context;Ljava/lang/String;)V
    .locals 7

    .line 36
    const-string v0, "Debug_HiWiFiSyncMsgReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get WIFI_SYNC_PUSH_TYPE push msg time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-static {v3}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    .line 38
    :cond_0
    const-string v0, "Debug_HiWiFiSyncMsgReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processPushMsg  Error PushMsg is Empty"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    return-void

    .line 41
    :cond_1
    const-string v0, "Debug_HiWiFiSyncMsgReceiver"

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

    .line 44
    :try_start_0
    new-instance v4, Lcom/google/gson/Gson;

    invoke-direct {v4}, Lcom/google/gson/Gson;-><init>()V

    .line 45
    const-class v0, Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;

    invoke-virtual {v4, p2, v0}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;

    .line 46
    const-string v0, "9"

    iget-object v1, v5, Lcom/huawei/hihealthservice/sync/util/HiWiFiSyncMsgReceiver$HiWiFiSyncMsgPushBean;->pushType:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 47
    const-string v0, "Debug_HiWiFiSyncMsgReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processPushMsg, pushType = WIFI_SYNC_PUSH_TYPE"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 48
    new-instance v6, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v6}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 49
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 50
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 51
    const/16 v0, 0x4e20

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 52
    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 53
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 54
    const/4 v0, 0x2

    invoke-virtual {v6, v0}, Lcom/huawei/hihealth/HiSyncOption;->setPushAction(I)V

    .line 55
    const-string v0, "Debug_HiWiFiSyncMsgReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processPushMsg, startSync,time:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    new-instance v3, Ljava/util/Date;

    invoke-direct {v3}, Ljava/util/Date;-><init>()V

    invoke-static {v3}, Lo/dbu;->n(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    invoke-static {p1}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v6, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V
    :try_end_0
    .catch Lcom/google/gson/JsonSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    :cond_2
    goto :goto_0

    .line 59
    :catch_0
    move-exception v4

    .line 60
    const-string v0, "Debug_HiWiFiSyncMsgReceiver"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "processPushMsg JsonSyntaxException:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v4}, Lcom/google/gson/JsonSyntaxException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    :goto_0
    return-void
.end method
