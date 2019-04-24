.class Lcom/launchdarkly/android/SummaryEvent;
.super Lcom/launchdarkly/android/Event;
.source "Event.java"


# instance fields
.field endDate:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "endDate"
    .end annotation
.end field

.field features:Lcom/google/gson/JsonObject;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "features"
    .end annotation
.end field

.field startDate:Ljava/lang/Long;
    .annotation runtime Lcom/google/gson/annotations/Expose;
    .end annotation

    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "startDate"
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Long;Ljava/lang/Long;Lcom/google/gson/JsonObject;)V
    .locals 1

    const-string v0, "summary"

    .line 156
    invoke-direct {p0, v0}, Lcom/launchdarkly/android/Event;-><init>(Ljava/lang/String;)V

    .line 157
    iput-object p1, p0, Lcom/launchdarkly/android/SummaryEvent;->startDate:Ljava/lang/Long;

    .line 158
    iput-object p2, p0, Lcom/launchdarkly/android/SummaryEvent;->endDate:Ljava/lang/Long;

    .line 159
    iput-object p3, p0, Lcom/launchdarkly/android/SummaryEvent;->features:Lcom/google/gson/JsonObject;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4

    .line 164
    new-instance v0, Lcom/google/gson/JsonObject;

    invoke-direct {v0}, Lcom/google/gson/JsonObject;-><init>()V

    .line 165
    iget-object v1, p0, Lcom/launchdarkly/android/SummaryEvent;->startDate:Ljava/lang/Long;

    if-eqz v1, :cond_0

    const-string v2, "startDate"

    .line 166
    new-instance v3, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v3, v1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v2, v3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    .line 168
    :cond_0
    iget-object v1, p0, Lcom/launchdarkly/android/SummaryEvent;->endDate:Ljava/lang/Long;

    if-eqz v1, :cond_1

    const-string v2, "endDate"

    .line 169
    new-instance v3, Lcom/google/gson/JsonPrimitive;

    invoke-direct {v3, v1}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    invoke-virtual {v0, v2, v3}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    .line 171
    :cond_1
    iget-object v1, p0, Lcom/launchdarkly/android/SummaryEvent;->kind:Ljava/lang/String;

    if-eqz v1, :cond_2

    const-string v1, "kind"

    .line 172
    new-instance v2, Lcom/google/gson/JsonPrimitive;

    iget-object v3, p0, Lcom/launchdarkly/android/SummaryEvent;->kind:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    :cond_2
    const-string v1, "features"

    .line 174
    iget-object v2, p0, Lcom/launchdarkly/android/SummaryEvent;->features:Lcom/google/gson/JsonObject;

    invoke-virtual {v0, v1, v2}, Lcom/google/gson/JsonObject;->add(Ljava/lang/String;Lcom/google/gson/JsonElement;)V

    .line 175
    invoke-virtual {v0}, Lcom/google/gson/JsonObject;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
