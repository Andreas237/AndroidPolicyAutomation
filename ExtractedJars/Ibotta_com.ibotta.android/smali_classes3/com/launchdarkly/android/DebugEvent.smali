.class Lcom/launchdarkly/android/DebugEvent;
.super Lcom/launchdarkly/android/FeatureRequestEvent;
.source "Event.java"


# direct methods
.method constructor <init>(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V
    .locals 0
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

    .line 136
    invoke-direct/range {p0 .. p6}, Lcom/launchdarkly/android/FeatureRequestEvent;-><init>(Ljava/lang/String;Lcom/launchdarkly/android/LDUser;Lcom/google/gson/JsonElement;Lcom/google/gson/JsonElement;II)V

    const-string p1, "debug"

    .line 137
    iput-object p1, p0, Lcom/launchdarkly/android/DebugEvent;->kind:Ljava/lang/String;

    return-void
.end method
