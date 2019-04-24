.class public Lcom/newrelic/agent/android/util/SafeJsonPrimitive;
.super Ljava/lang/Object;
.source "SafeJsonPrimitive.java"


# static fields
.field public static final NULL_BOOL:Ljava/lang/Boolean;

.field public static final NULL_CHAR:C = ' '

.field public static final NULL_NUMBER:Ljava/lang/Number;

.field public static final NULL_STRING:Ljava/lang/String; = "null"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 18
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sput-object v0, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->NULL_NUMBER:Ljava/lang/Number;

    .line 19
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object v0, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->NULL_BOOL:Ljava/lang/Boolean;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkNull(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    if-nez p0, :cond_0

    .line 27
    sget-object p0, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->NULL_BOOL:Ljava/lang/Boolean;

    :cond_0
    return-object p0
.end method

.method public static checkNull(Ljava/lang/Character;)Ljava/lang/Character;
    .locals 0

    if-nez p0, :cond_0

    const/16 p0, 0x20

    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Character;->charValue()C

    move-result p0

    :goto_0
    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0
.end method

.method public static checkNull(Ljava/lang/Number;)Ljava/lang/Number;
    .locals 0

    if-nez p0, :cond_0

    .line 31
    sget-object p0, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->NULL_NUMBER:Ljava/lang/Number;

    :cond_0
    return-object p0
.end method

.method public static checkNull(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, "null"

    :cond_0
    return-object p0
.end method

.method public static factory(Ljava/lang/Boolean;)Lcom/newrelic/com/google/gson/JsonPrimitive;
    .locals 1

    .line 39
    new-instance v0, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-static {p0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->checkNull(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static factory(Ljava/lang/Character;)Lcom/newrelic/com/google/gson/JsonPrimitive;
    .locals 1

    .line 51
    new-instance v0, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-static {p0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->checkNull(Ljava/lang/Character;)Ljava/lang/Character;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Character;)V

    return-object v0
.end method

.method public static factory(Ljava/lang/Double;)Lcom/newrelic/com/google/gson/JsonPrimitive;
    .locals 5

    .line 57
    invoke-virtual {p0}, Ljava/lang/Double;->floatValue()F

    move-result v0

    const/high16 v1, 0x4f000000

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Double;->longValue()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    cmpl-double v4, v0, v2

    if-nez v4, :cond_0

    .line 58
    new-instance v0, Lcom/newrelic/com/google/gson/JsonPrimitive;

    new-instance v1, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Double;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v0, v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    return-object v0

    .line 61
    :cond_0
    new-instance v0, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-static {p0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->checkNull(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method

.method public static factory(Ljava/lang/Number;)Lcom/newrelic/com/google/gson/JsonPrimitive;
    .locals 1

    .line 43
    new-instance v0, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-static {p0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->checkNull(Ljava/lang/Number;)Ljava/lang/Number;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/Number;)V

    return-object v0
.end method

.method public static factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;
    .locals 1

    .line 47
    new-instance v0, Lcom/newrelic/com/google/gson/JsonPrimitive;

    invoke-static {p0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->checkNull(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/newrelic/com/google/gson/JsonPrimitive;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
