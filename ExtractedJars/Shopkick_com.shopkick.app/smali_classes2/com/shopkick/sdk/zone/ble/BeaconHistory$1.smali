.class Lcom/shopkick/sdk/zone/ble/BeaconHistory$1;
.super Ljava/lang/Object;
.source "BeaconHistory.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/sdk/zone/ble/BeaconHistory;->saveToDisk()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/sdk/zone/ble/BeaconHistory;


# direct methods
.method constructor <init>(Lcom/shopkick/sdk/zone/ble/BeaconHistory;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory$1;->this$0:Lcom/shopkick/sdk/zone/ble/BeaconHistory;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 80
    invoke-static {}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->access$000()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Saving beacon history to disk"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 82
    :try_start_0
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory$1;->this$0:Lcom/shopkick/sdk/zone/ble/BeaconHistory;

    invoke-static {v0}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->access$200(Lcom/shopkick/sdk/zone/ble/BeaconHistory;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/sdk/zone/ble/BeaconHistory$1;->this$0:Lcom/shopkick/sdk/zone/ble/BeaconHistory;

    invoke-static {v1}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->access$100(Lcom/shopkick/sdk/zone/ble/BeaconHistory;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v0

    .line 83
    new-instance v1, Ljava/io/ObjectOutputStream;

    invoke-direct {v1, v0}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 84
    invoke-static {}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->access$300()Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 86
    invoke-static {}, Lcom/shopkick/sdk/zone/ble/BeaconHistory;->access$000()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Error saving beacon cache."

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void
.end method
