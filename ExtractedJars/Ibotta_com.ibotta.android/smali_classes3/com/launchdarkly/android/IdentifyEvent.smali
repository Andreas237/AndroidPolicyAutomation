.class Lcom/launchdarkly/android/IdentifyEvent;
.super Lcom/launchdarkly/android/GenericEvent;
.source "Event.java"


# direct methods
.method constructor <init>(Lcom/launchdarkly/android/LDUser;)V
    .locals 2

    const-string v0, "identify"

    .line 44
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getKeyAsString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1, p1}, Lcom/launchdarkly/android/GenericEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/launchdarkly/android/LDUser;)V

    return-void
.end method
