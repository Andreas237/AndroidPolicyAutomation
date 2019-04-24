.class final enum Lcom/launchdarkly/android/UserAttribute$8;
.super Lcom/launchdarkly/android/UserAttribute;
.source "UserAttribute.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/launchdarkly/android/UserAttribute;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4008
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, p1, p2, v0}, Lcom/launchdarkly/android/UserAttribute;-><init>(Ljava/lang/String;ILcom/launchdarkly/android/UserAttribute$1;)V

    return-void
.end method


# virtual methods
.method get(Lcom/launchdarkly/android/LDUser;)Lcom/google/gson/JsonElement;
    .locals 0

    .line 44
    invoke-virtual {p1}, Lcom/launchdarkly/android/LDUser;->getName()Lcom/google/gson/JsonPrimitive;

    move-result-object p1

    return-object p1
.end method
