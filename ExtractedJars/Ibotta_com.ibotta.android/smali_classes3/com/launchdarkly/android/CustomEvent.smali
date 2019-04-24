.class Lcom/launchdarkly/android/CustomEvent;
.super Lcom/launchdarkly/android/GenericEvent;
.source "Event.java"


# instance fields
.field private final data:Lcom/google/gson/JsonElement;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Lcom/google/gson/JsonElement;)V
    .locals 1

    const-string v0, "custom"

    .line 53
    invoke-direct {p0, v0, p1, p2}, Lcom/launchdarkly/android/GenericEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/launchdarkly/android/LDUser;)V

    .line 54
    iput-object p3, p0, Lcom/launchdarkly/android/CustomEvent;->data:Lcom/google/gson/JsonElement;

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;)V
    .locals 2

    const-string v0, "custom"

    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, v0, p1, v1}, Lcom/launchdarkly/android/GenericEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/launchdarkly/android/LDUser;)V

    .line 59
    iput-object p3, p0, Lcom/launchdarkly/android/CustomEvent;->data:Lcom/google/gson/JsonElement;

    .line 60
    iput-object p2, p0, Lcom/launchdarkly/android/CustomEvent;->userKey:Ljava/lang/String;

    return-void
.end method
