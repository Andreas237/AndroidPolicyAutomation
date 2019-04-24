.class synthetic Lcom/newrelic/agent/android/FeatureFlag$1;
.super Ljava/lang/Object;
.source "FeatureFlag.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/FeatureFlag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$newrelic$agent$android$FeatureFlag:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 29
    invoke-static {}, Lcom/newrelic/agent/android/FeatureFlag;->values()[Lcom/newrelic/agent/android/FeatureFlag;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/newrelic/agent/android/FeatureFlag$1;->$SwitchMap$com$newrelic$agent$android$FeatureFlag:[I

    :try_start_0
    sget-object v0, Lcom/newrelic/agent/android/FeatureFlag$1;->$SwitchMap$com$newrelic$agent$android$FeatureFlag:[I

    sget-object v1, Lcom/newrelic/agent/android/FeatureFlag;->GestureInstrumentation:Lcom/newrelic/agent/android/FeatureFlag;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/FeatureFlag;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
