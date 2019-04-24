.class Lcom/launchdarkly/android/FeatureRequestEvent;
.super Lcom/launchdarkly/android/GenericEvent;
.source "Event.java"


# instance fields
.field defaultVal:Lcom/google/gson/JsonElement;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "default"
    .end annotation
.end field

.field value:Lcom/google/gson/JsonElement;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field variation:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field

.field version:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V
    .locals 1
    .param p5    # I
        .annotation build Landroid/support/annotation/IntRange;
            from = 0x0L
            to = 0x7fffffffL
        .end annotation
    .end param
    .param p6    # I
        .annotation build Landroid/support/annotation/IntRange;
            from = 0x0L
            to = 0x7fffffffL
        .end annotation
    .end param

    const-string v0, "feature"

    .line 91
    invoke-direct {p0, v0, p1, p2}, Lcom/launchdarkly/android/GenericEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/launchdarkly/android/LDUser;)V

    .line 92
    iput-object p3, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->value:Lcom/google/gson/JsonElement;

    .line 93
    iput-object p4, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->defaultVal:Lcom/google/gson/JsonElement;

    .line 94
    invoke-direct {p0, p5, p6}, Lcom/launchdarkly/android/FeatureRequestEvent;->setOptionalValues(II)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V
    .locals 2
    .param p5    # I
        .annotation build Landroid/support/annotation/IntRange;
            from = 0x0L
            to = 0x7fffffffL
        .end annotation
    .end param
    .param p6    # I
        .annotation build Landroid/support/annotation/IntRange;
            from = 0x0L
            to = 0x7fffffffL
        .end annotation
    .end param

    const-string v0, "feature"

    const/4 v1, 0x0

    .line 111
    invoke-direct {p0, v0, p1, v1}, Lcom/launchdarkly/android/GenericEvent;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/launchdarkly/android/LDUser;)V

    .line 112
    iput-object p3, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->value:Lcom/google/gson/JsonElement;

    .line 113
    iput-object p4, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->defaultVal:Lcom/google/gson/JsonElement;

    .line 114
    iput-object p2, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->userKey:Ljava/lang/String;

    .line 115
    invoke-direct {p0, p5, p6}, Lcom/launchdarkly/android/FeatureRequestEvent;->setOptionalValues(II)V

    return-void
.end method

.method private setOptionalValues(II)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, -0x1

    if-eq p1, v2, :cond_0

    .line 120
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->version:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const-string p1, "Feature Event: Ignoring version for flag: %s"

    .line 122
    new-array v3, v1, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->key:Ljava/lang/String;

    aput-object v4, v3, v0

    invoke-static {p1, v3}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    if-eq p2, v2, :cond_1

    .line 126
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->variation:Ljava/lang/Integer;

    goto :goto_1

    :cond_1
    const-string p1, "Feature Event: Ignoring variation for flag: %s"

    .line 128
    new-array p2, v1, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/launchdarkly/android/FeatureRequestEvent;->key:Ljava/lang/String;

    aput-object v1, p2, v0

    invoke-static {p1, p2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
