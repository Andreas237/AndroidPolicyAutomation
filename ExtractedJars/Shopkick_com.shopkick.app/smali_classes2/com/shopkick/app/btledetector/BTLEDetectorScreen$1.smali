.class Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;
.super Ljava/lang/Object;
.source "BTLEDetectorScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/sensor/ReadingListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/btledetector/BTLEDetectorScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/shopkick/sdk/sensor/ReadingListener<",
        "Lcom/shopkick/sdk/sensor/ShopBeaconReading;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/Reading;)V
    .locals 0

    .line 167
    check-cast p2, Lcom/shopkick/sdk/sensor/ShopBeaconReading;

    invoke-virtual {p0, p1, p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/ShopBeaconReading;)V

    return-void
.end method

.method public onRead(Lcom/shopkick/sdk/sensor/Sensor;Lcom/shopkick/sdk/sensor/ShopBeaconReading;)V
    .locals 3

    .line 173
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$000(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    .line 174
    :try_start_0
    invoke-virtual {p2}, Lcom/shopkick/sdk/sensor/ShopBeaconReading;->getBeacon()Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object p2

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$100(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$100(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 177
    iget-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$100(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Ljava/util/List;

    move-result-object p2

    invoke-static {}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$200()Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 178
    iget-object p2, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$100(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Ljava/util/List;

    move-result-object p2

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/shopkick/sdk/scanner/Beacon;

    .line 179
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_1

    .line 182
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$300(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {p1}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$400(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Landroid/widget/TextView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-eqz p1, :cond_0

    .line 183
    invoke-virtual {p2}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {v0}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$300(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;)Lcom/shopkick/sdk/scanner/Beacon;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 184
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-static {p1, p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$302(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;Lcom/shopkick/sdk/scanner/Beacon;)Lcom/shopkick/sdk/scanner/Beacon;

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/btledetector/BTLEDetectorScreen$1;->this$0:Lcom/shopkick/app/btledetector/BTLEDetectorScreen;

    invoke-virtual {p2}, Lcom/shopkick/sdk/scanner/Beacon;->getHexData()Ljava/lang/String;

    move-result-object v0

    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    invoke-virtual {p2, v1, v2}, Lcom/shopkick/sdk/scanner/Beacon;->getSignalStrength(D)I

    move-result p2

    invoke-static {p1, v0, p2}, Lcom/shopkick/app/btledetector/BTLEDetectorScreen;->access$500(Lcom/shopkick/app/btledetector/BTLEDetectorScreen;Ljava/lang/String;I)V

    :cond_1
    return-void

    :catchall_0
    move-exception p2

    .line 179
    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2
.end method
