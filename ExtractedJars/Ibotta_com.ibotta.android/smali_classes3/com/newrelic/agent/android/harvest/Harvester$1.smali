.class synthetic Lcom/newrelic/agent/android/harvest/Harvester$1;
.super Ljava/lang/Object;
.source "Harvester.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/harvest/Harvester;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

.field static final synthetic $SwitchMap$com$newrelic$agent$android$harvest$Harvester$State:[I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 295
    invoke-static {}, Lcom/newrelic/agent/android/harvest/Harvester$State;->values()[Lcom/newrelic/agent/android/harvest/Harvester$State;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$Harvester$State:[I

    const/4 v0, 0x1

    :try_start_0
    sget-object v1, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$Harvester$State:[I

    sget-object v2, Lcom/newrelic/agent/android/harvest/Harvester$State;->UNINITIALIZED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/harvest/Harvester$State;->ordinal()I

    move-result v2

    aput v0, v1, v2
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v1, 0x2

    :try_start_1
    sget-object v2, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$Harvester$State:[I

    sget-object v3, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISCONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v3}, Lcom/newrelic/agent/android/harvest/Harvester$State;->ordinal()I

    move-result v3

    aput v1, v2, v3
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    const/4 v2, 0x3

    :try_start_2
    sget-object v3, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$Harvester$State:[I

    sget-object v4, Lcom/newrelic/agent/android/harvest/Harvester$State;->CONNECTED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v4}, Lcom/newrelic/agent/android/harvest/Harvester$State;->ordinal()I

    move-result v4

    aput v2, v3, v4
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    const/4 v3, 0x4

    :try_start_3
    sget-object v4, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$Harvester$State:[I

    sget-object v5, Lcom/newrelic/agent/android/harvest/Harvester$State;->DISABLED:Lcom/newrelic/agent/android/harvest/Harvester$State;

    invoke-virtual {v5}, Lcom/newrelic/agent/android/harvest/Harvester$State;->ordinal()I

    move-result v5

    aput v3, v4, v5
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    .line 155
    :catch_3
    invoke-static {}, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->values()[Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    move-result-object v4

    array-length v4, v4

    new-array v4, v4, [I

    sput-object v4, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

    :try_start_4
    sget-object v4, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

    sget-object v5, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->UNAUTHORIZED:Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    invoke-virtual {v5}, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->ordinal()I

    move-result v5

    aput v0, v4, v5
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    :try_start_5
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

    sget-object v4, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->INVALID_AGENT_ID:Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    invoke-virtual {v4}, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->ordinal()I

    move-result v4

    aput v1, v0, v4
    :try_end_5
    .catch Ljava/lang/NoSuchFieldError; {:try_start_5 .. :try_end_5} :catch_5

    :catch_5
    :try_start_6
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

    sget-object v1, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->FORBIDDEN:Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->ordinal()I

    move-result v1

    aput v2, v0, v1
    :try_end_6
    .catch Ljava/lang/NoSuchFieldError; {:try_start_6 .. :try_end_6} :catch_6

    :catch_6
    :try_start_7
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

    sget-object v1, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->UNSUPPORTED_MEDIA_TYPE:Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->ordinal()I

    move-result v1

    aput v3, v0, v1
    :try_end_7
    .catch Ljava/lang/NoSuchFieldError; {:try_start_7 .. :try_end_7} :catch_7

    :catch_7
    :try_start_8
    sget-object v0, Lcom/newrelic/agent/android/harvest/Harvester$1;->$SwitchMap$com$newrelic$agent$android$harvest$HarvestResponse$Code:[I

    sget-object v1, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->ENTITY_TOO_LARGE:Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/harvest/HarvestResponse$Code;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_8
    .catch Ljava/lang/NoSuchFieldError; {:try_start_8 .. :try_end_8} :catch_8

    :catch_8
    return-void
.end method
