.class public Lcom/newrelic/agent/android/analytics/AnalyticAttribute;
.super Ljava/lang/Object;
.source "AnalyticAttribute.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;
    }
.end annotation


# static fields
.field public static final ACCOUNT_ID_ATTRIBUTE:Ljava/lang/String; = "accountId"

.field public static final ACTION_TYPE_ATTRIBUTE:Ljava/lang/String; = "actionType"

.field public static final APPLICATION_PLATFORM_ATTRIBUTE:Ljava/lang/String; = "platform"

.field public static final APPLICATION_PLATFORM_VERSION_ATTRIBUTE:Ljava/lang/String; = "platformVersion"

.field public static final APP_BUILD_ATTRIBUTE:Ljava/lang/String; = "appBuild"

.field public static final APP_DATA_ATTRIBUTE:Ljava/lang/String; = "nr.X-NewRelic-App-Data"

.field public static final APP_ID_ATTRIBUTE:Ljava/lang/String; = "appId"

.field public static final APP_INSTALL_ATTRIBUTE:Ljava/lang/String; = "install"

.field public static final APP_NAME_ATTRIBUTE:Ljava/lang/String; = "appName"

.field public static final APP_UPGRADE_ATTRIBUTE:Ljava/lang/String; = "upgradeFrom"

.field public static final ARCHITECTURE_ATTRIBUTE:Ljava/lang/String; = "architecture"

.field public static final ATTRIBUTE_NAME_MAX_LENGTH:I = 0x100

.field public static final ATTRIBUTE_VALUE_MAX_LENGTH:I = 0x1000

.field public static final BYTES_RECEIVED_ATTRIBUTE:Ljava/lang/String; = "bytesReceived"

.field public static final BYTES_SENT_ATTRIBUTE:Ljava/lang/String; = "bytesSent"

.field public static final CARRIER_ATTRIBUTE:Ljava/lang/String; = "carrier"

.field public static final CONNECTION_TYPE_ATTRIBUTE:Ljava/lang/String; = "connectionType"

.field public static final CONTENT_TYPE_ATTRIBUTE:Ljava/lang/String; = "contentType"

.field public static final DEVICE_MANUFACTURER_ATTRIBUTE:Ljava/lang/String; = "deviceManufacturer"

.field public static final DEVICE_MODEL_ATTRIBUTE:Ljava/lang/String; = "deviceModel"

.field public static final EVENT_CATEGORY_ATTRIBUTE:Ljava/lang/String; = "category"

.field public static final EVENT_NAME_ATTRIBUTE:Ljava/lang/String; = "name"

.field public static final EVENT_TIMESTAMP_ATTRIBUTE:Ljava/lang/String; = "timestamp"

.field public static final EVENT_TYPE_ATTRIBUTE:Ljava/lang/String; = "eventType"

.field public static final EVENT_TYPE_ATTRIBUTE_MOBILE:Ljava/lang/String; = "Mobile"

.field public static final EVENT_TYPE_ATTRIBUTE_MOBILE_BREADCRUMB:Ljava/lang/String; = "MobileBreadcrumb"

.field public static final EVENT_TYPE_ATTRIBUTE_MOBILE_CRASH:Ljava/lang/String; = "MobileCrash"

.field public static final EVENT_TYPE_ATTRIBUTE_MOBILE_REQUEST:Ljava/lang/String; = "MobileRequest"

.field public static final EVENT_TYPE_ATTRIBUTE_MOBILE_REQUEST_ERROR:Ljava/lang/String; = "MobileRequestError"

.field public static final EVENT_TYPE_ATTRIBUTE_MOBILE_USER_ACTION:Ljava/lang/String; = "MobileUserAction"

.field public static final GESTURE_BACK_PRESSED_ATTRIBUTE:Ljava/lang/String; = "backPressed"

.field public static final GESTURE_CONTENT_DESCRIPTION_ATTRIBUTE:Ljava/lang/String; = "contentDescription"

.field public static final GESTURE_CONTROL_CLASS_ATTRIBUTE:Ljava/lang/String; = "controlClass"

.field public static final GESTURE_CONTROL_ID_ATTRIBUTE:Ljava/lang/String; = "controlId"

.field public static final GESTURE_CONTROL_RECT_ATTRIBUTE:Ljava/lang/String; = "controlRect"

.field public static final GESTURE_COORDINATES_ATTRIBUTE:Ljava/lang/String; = "touchCoordinates"

.field public static final GESTURE_LABEL_ATTRIBUTE:Ljava/lang/String; = "label"

.field public static final GESTURE_METHOD_EXECUTED_ATTRIBUTE:Ljava/lang/String; = "methodExecuted"

.field public static final GESTURE_ORIENTATION_ATTRIBUTE:Ljava/lang/String; = "orientation"

.field public static final GESTURE_TARGET_OBJECT_ATTRIBUTE:Ljava/lang/String; = "targetObject"

.field public static final INSTANT_APP_ATTRIBUTE:Ljava/lang/String; = "instantApp"

.field public static final INTERACTION_DURATION_ATTRIBUTE:Ljava/lang/String; = "interactionDuration"

.field public static final LAST_INTERACTION_ATTRIBUTE:Ljava/lang/String; = "lastInteraction"

.field public static final MEM_USAGE_MB_ATTRIBUTE:Ljava/lang/String; = "memUsageMb"

.field public static final NETWORK_ERROR_CODE_ATTRIBUTE:Ljava/lang/String; = "networkErrorCode"

.field public static final NEW_RELIC_VERSION_ATTRIBUTE:Ljava/lang/String; = "newRelicVersion"

.field public static final NR_GUID_ATTRIBUTE:Ljava/lang/String; = "guid"

.field public static final NR_PARENTID_ATTRIBUTE:Ljava/lang/String; = "parentId"

.field public static final NR_TRACEID_ATTRIBUTE:Ljava/lang/String; = "traceId"

.field public static final OS_BUILD_ATTRIBUTE:Ljava/lang/String; = "osBuild"

.field public static final OS_MAJOR_VERSION_ATTRIBUTE:Ljava/lang/String; = "osMajorVersion"

.field public static final OS_NAME_ATTRIBUTE:Ljava/lang/String; = "osName"

.field public static final OS_VERSION_ATTRIBUTE:Ljava/lang/String; = "osVersion"

.field public static final REQUEST_DOMAIN_ATTRIBUTE:Ljava/lang/String; = "requestDomain"

.field public static final REQUEST_METHOD_ATTRIBUTE:Ljava/lang/String; = "requestMethod"

.field public static final REQUEST_PATH_ATTRIBUTE:Ljava/lang/String; = "requestPath"

.field public static final REQUEST_URL_ATTRIBUTE:Ljava/lang/String; = "requestUrl"

.field public static final RESPONSE_BODY_ATTRIBUTE:Ljava/lang/String; = "nr.responseBody"

.field public static final RESPONSE_TIME_ATTRIBUTE:Ljava/lang/String; = "responseTime"

.field public static final RUNTIME_ATTRIBUTE:Ljava/lang/String; = "runTime"

.field public static final SESSION_DURATION_ATTRIBUTE:Ljava/lang/String; = "sessionDuration"

.field public static final SESSION_ID_ATTRIBUTE:Ljava/lang/String; = "sessionId"

.field public static final SESSION_TIME_SINCE_LOAD_ATTRIBUTE:Ljava/lang/String; = "timeSinceLoad"

.field public static final STATUS_CODE_ATTRIBUTE:Ljava/lang/String; = "statusCode"

.field public static final TYPE_ATTRIBUTE:Ljava/lang/String; = "type"

.field public static final USER_ID_ATTRIBUTE:Ljava/lang/String; = "userId"

.field public static final UUID_ATTRIBUTE:Ljava/lang/String; = "uuid"

.field protected static blackList:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

.field private doubleValue:D

.field private isPersistent:Z

.field private name:Ljava/lang/String;

.field private stringValue:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 111
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$1;

    invoke-direct {v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$1;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->blackList:Ljava/util/Set;

    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 118
    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 119
    iput-wide v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    const/4 v0, 0x0

    .line 120
    iput-boolean v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    .line 121
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->VOID:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-void
.end method

.method public constructor <init>(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)V
    .locals 2

    .line 157
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 158
    iget-object v0, p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    .line 159
    iget-wide v0, p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    iput-wide v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    .line 160
    iget-object v0, p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    iput-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    .line 161
    iget-boolean v0, p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    iput-boolean v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    .line 162
    iget-object p1, p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;D)V
    .locals 1

    const/4 v0, 0x1

    .line 136
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;DZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DZ)V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    .line 142
    invoke-virtual {p0, p2, p3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setDoubleValue(D)V

    .line 143
    iput-boolean p4, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    .line 125
    invoke-direct {p0, p1, p2, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 129
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 130
    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    .line 131
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setStringValue(Ljava/lang/String;)V

    .line 132
    iput-boolean p3, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    const/4 v0, 0x1

    .line 147
    invoke-direct {p0, p1, p2, v0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;ZZ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZZ)V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 152
    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    .line 153
    invoke-virtual {p0, p2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->setBooleanValue(Z)V

    .line 154
    iput-boolean p3, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    return-void
.end method

.method public static isAttributeBlacklisted(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z
    .locals 1

    .line 264
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->blackList:Ljava/util/Set;

    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static newFromJson(Lcom/newrelic/com/google/gson/JsonObject;)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/newrelic/com/google/gson/JsonObject;",
            ")",
            "Ljava/util/Set<",
            "Lcom/newrelic/agent/android/analytics/AnalyticAttribute;",
            ">;"
        }
    .end annotation

    .line 320
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 321
    invoke-virtual {p0}, Lcom/newrelic/com/google/gson/JsonObject;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 323
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 324
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 325
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 326
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-virtual {v3}, Lcom/newrelic/com/google/gson/JsonElement;->isJsonPrimitive()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    .line 327
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsJsonPrimitive()Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v1

    .line 328
    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isString()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 329
    new-instance v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v2, v1, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 330
    :cond_1
    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isBoolean()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 331
    new-instance v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsBoolean()Z

    move-result v1

    invoke-direct {v3, v2, v1, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;ZZ)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 332
    :cond_2
    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->isNumber()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 333
    new-instance v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonPrimitive;->getAsDouble()D

    move-result-wide v5

    invoke-direct {v3, v2, v5, v6, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;DZ)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 336
    :cond_3
    new-instance v3, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/newrelic/com/google/gson/JsonElement;

    invoke-virtual {v1}, Lcom/newrelic/com/google/gson/JsonElement;->getAsString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v2, v1, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    return-object v0
.end method


# virtual methods
.method public asJsonElement()Lcom/newrelic/com/google/gson/JsonElement;
    .locals 2

    .line 298
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$2;->$SwitchMap$com$newrelic$agent$android$analytics$AnalyticAttribute$AttributeDataType:[I

    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    .line 308
    :pswitch_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getBooleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Boolean;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v0

    goto :goto_0

    .line 304
    :pswitch_1
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getDoubleValue()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/Double;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v0

    goto :goto_0

    .line 300
    :pswitch_2
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getStringValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/newrelic/agent/android/util/SafeJsonPrimitive;->factory(Ljava/lang/String;)Lcom/newrelic/com/google/gson/JsonPrimitive;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    .line 223
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 225
    :cond_1
    check-cast p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;

    .line 227
    iget-object v2, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    iget-object p1, p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    return v0

    :cond_3
    :goto_0
    return v1
.end method

.method public getAttributeDataType()Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;
    .locals 1

    .line 268
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-object v0
.end method

.method public getBooleanValue()Z
    .locals 2

    .line 202
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->BOOLEAN:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getDoubleValue()D
    .locals 2

    .line 192
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->DOUBLE:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    goto :goto_0

    :cond_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    :goto_0
    return-wide v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 166
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getStringValue()Ljava/lang/String;
    .locals 2

    .line 182
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->STRING:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 234
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public isBooleanAttribute()Z
    .locals 2

    .line 178
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->BOOLEAN:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isDoubleAttribute()Z
    .locals 2

    .line 174
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->DOUBLE:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isPersistent()Z
    .locals 1

    .line 213
    iget-boolean v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isAttributeBlacklisted(Lcom/newrelic/agent/android/analytics/AnalyticAttribute;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public isStringAttribute()Z
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->STRING:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public setBooleanValue(Z)V
    .locals 2

    .line 206
    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 207
    iput-wide v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    .line 208
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->BOOLEAN:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-void
.end method

.method public setDoubleValue(D)V
    .locals 0

    .line 196
    iput-wide p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    const/4 p1, 0x0

    .line 197
    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    .line 198
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->DOUBLE:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-void
.end method

.method public setPersistent(Z)V
    .locals 0

    .line 217
    iput-boolean p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    return-void
.end method

.method public setStringValue(Ljava/lang/String;)V
    .locals 2

    .line 186
    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 187
    iput-wide v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    .line 188
    sget-object p1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->STRING:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    iput-object p1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnalyticAttribute{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 241
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "name=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->name:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 243
    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$2;->$SwitchMap$com$newrelic$agent$android$analytics$AnalyticAttribute$AttributeDataType:[I

    iget-object v2, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    invoke-virtual {v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 253
    :pswitch_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ",booleanValue="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 250
    :pswitch_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ",doubleValue=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 247
    :pswitch_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ",stringValue=\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 257
    :goto_0
    :pswitch_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ",isPersistent="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->isPersistent:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    .line 258
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public valueAsString()Ljava/lang/String;
    .locals 2

    .line 274
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$2;->$SwitchMap$com$newrelic$agent$android$analytics$AnalyticAttribute$AttributeDataType:[I

    iget-object v1, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->attributeDataType:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    invoke-virtual {v1}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    goto :goto_0

    .line 284
    :pswitch_0
    invoke-virtual {p0}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->getBooleanValue()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 280
    :pswitch_1
    iget-wide v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->doubleValue:D

    invoke-static {v0, v1}, Ljava/lang/Double;->toString(D)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 276
    :pswitch_2
    iget-object v0, p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute;->stringValue:Ljava/lang/String;

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
