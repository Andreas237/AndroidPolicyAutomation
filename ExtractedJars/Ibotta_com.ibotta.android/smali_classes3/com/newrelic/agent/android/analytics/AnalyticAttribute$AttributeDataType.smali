.class public final enum Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;
.super Ljava/lang/Enum;
.source "AnalyticAttribute.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/analytics/AnalyticAttribute;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AttributeDataType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

.field public static final enum BOOLEAN:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

.field public static final enum DOUBLE:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

.field public static final enum STRING:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

.field public static final enum VOID:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 16
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    const-string v1, "VOID"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->VOID:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    .line 17
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    const-string v1, "STRING"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->STRING:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    .line 18
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    const-string v1, "DOUBLE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->DOUBLE:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    .line 19
    new-instance v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    const-string v1, "BOOLEAN"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->BOOLEAN:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    const/4 v0, 0x4

    .line 15
    new-array v0, v0, [Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->VOID:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->STRING:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->DOUBLE:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->BOOLEAN:Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    aput-object v1, v0, v5

    sput-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->$VALUES:[Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;
    .locals 1

    .line 15
    const-class v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;
    .locals 1

    .line 15
    sget-object v0, Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->$VALUES:[Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/analytics/AnalyticAttribute$AttributeDataType;

    return-object v0
.end method
