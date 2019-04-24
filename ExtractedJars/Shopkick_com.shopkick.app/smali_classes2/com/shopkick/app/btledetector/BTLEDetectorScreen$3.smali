.class Lcom/shopkick/app/btledetector/BTLEDetectorScreen$3;
.super Ljava/lang/Object;
.source "BTLEDetectorScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/StatusListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/btledetector/BTLEDetectorScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$3;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onErrorReceived(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/SensorStatusError;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Status;)V
    .locals 0

    .line 210
    sget-object p1, Lcom/shopkick/sdk/sensor/Status;->BLUETOOTH_TURNED_OFF:Lcom/shopkick/sdk/sensor/Status;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/sensor/Status;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 211
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$3;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$600(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Landroid/view/View;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$700(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;Landroid/view/View;)V

    goto :goto_0

    .line 212
    :cond_0
    sget-object p1, Lcom/shopkick/sdk/sensor/Status;->BLUETOOTH_TURNED_ON:Lcom/shopkick/sdk/sensor/Status;

    invoke-virtual {p1, p2}, Lcom/shopkick/sdk/sensor/Status;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 213
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$3;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$800(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Landroid/view/View;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$700(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;Landroid/view/View;)V

    :cond_1
    :goto_0
    return-void
.end method
