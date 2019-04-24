.class Lcom/newrelic/agent/android/AndroidAgentImpl$2;
.super Ljava/lang/Object;
.source "AndroidAgentImpl.java"

# interfaces
.implements Landroid/location/LocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/newrelic/agent/android/AndroidAgentImpl;->addLocationListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/newrelic/agent/android/AndroidAgentImpl;


# direct methods
.method constructor <init>(Lcom/newrelic/agent/android/AndroidAgentImpl;)V
    .locals 0

    .line 648
    iput-object p1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl$2;->this$0:Lcom/newrelic/agent/android/AndroidAgentImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationChanged(Landroid/location/Location;)V
    .locals 1

    .line 652
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl$2;->this$0:Lcom/newrelic/agent/android/AndroidAgentImpl;

    invoke-static {v0, p1}, Lcom/newrelic/agent/android/AndroidAgentImpl;->access$000(Lcom/newrelic/agent/android/AndroidAgentImpl;Landroid/location/Location;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 653
    iget-object v0, p0, Lcom/newrelic/agent/android/AndroidAgentImpl$2;->this$0:Lcom/newrelic/agent/android/AndroidAgentImpl;

    invoke-virtual {v0, p1}, Lcom/newrelic/agent/android/AndroidAgentImpl;->setLocation(Landroid/location/Location;)V

    :cond_0
    return-void
.end method

.method public onProviderDisabled(Ljava/lang/String;)V
    .locals 1

    const-string v0, "passive"

    .line 659
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 660
    iget-object p1, p0, Lcom/newrelic/agent/android/AndroidAgentImpl$2;->this$0:Lcom/newrelic/agent/android/AndroidAgentImpl;

    invoke-static {p1}, Lcom/newrelic/agent/android/AndroidAgentImpl;->access$100(Lcom/newrelic/agent/android/AndroidAgentImpl;)V

    :cond_0
    return-void
.end method

.method public onProviderEnabled(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onStatusChanged(Ljava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method
