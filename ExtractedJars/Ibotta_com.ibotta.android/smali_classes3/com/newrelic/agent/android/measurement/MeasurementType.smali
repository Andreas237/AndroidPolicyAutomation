.class public final enum Lcom/newrelic/agent/android/measurement/MeasurementType;
.super Ljava/lang/Enum;
.source "MeasurementType.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/measurement/MeasurementType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/measurement/MeasurementType;

.field public static final enum Activity:Lcom/newrelic/agent/android/measurement/MeasurementType;

.field public static final enum Any:Lcom/newrelic/agent/android/measurement/MeasurementType;

.field public static final enum Custom:Lcom/newrelic/agent/android/measurement/MeasurementType;

.field public static final enum HttpError:Lcom/newrelic/agent/android/measurement/MeasurementType;

.field public static final enum Machine:Lcom/newrelic/agent/android/measurement/MeasurementType;

.field public static final enum Method:Lcom/newrelic/agent/android/measurement/MeasurementType;

.field public static final enum Network:Lcom/newrelic/agent/android/measurement/MeasurementType;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 7
    new-instance v0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    const-string v1, "Network"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/measurement/MeasurementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Network:Lcom/newrelic/agent/android/measurement/MeasurementType;

    .line 8
    new-instance v0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    const-string v1, "HttpError"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/measurement/MeasurementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->HttpError:Lcom/newrelic/agent/android/measurement/MeasurementType;

    .line 9
    new-instance v0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    const-string v1, "Method"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/newrelic/agent/android/measurement/MeasurementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Method:Lcom/newrelic/agent/android/measurement/MeasurementType;

    .line 10
    new-instance v0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    const-string v1, "Activity"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/newrelic/agent/android/measurement/MeasurementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Activity:Lcom/newrelic/agent/android/measurement/MeasurementType;

    .line 11
    new-instance v0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    const-string v1, "Custom"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/newrelic/agent/android/measurement/MeasurementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Custom:Lcom/newrelic/agent/android/measurement/MeasurementType;

    .line 12
    new-instance v0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    const-string v1, "Any"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/newrelic/agent/android/measurement/MeasurementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Any:Lcom/newrelic/agent/android/measurement/MeasurementType;

    .line 13
    new-instance v0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    const-string v1, "Machine"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/newrelic/agent/android/measurement/MeasurementType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->Machine:Lcom/newrelic/agent/android/measurement/MeasurementType;

    const/4 v0, 0x7

    .line 6
    new-array v0, v0, [Lcom/newrelic/agent/android/measurement/MeasurementType;

    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementType;->Network:Lcom/newrelic/agent/android/measurement/MeasurementType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementType;->HttpError:Lcom/newrelic/agent/android/measurement/MeasurementType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementType;->Method:Lcom/newrelic/agent/android/measurement/MeasurementType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementType;->Activity:Lcom/newrelic/agent/android/measurement/MeasurementType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementType;->Custom:Lcom/newrelic/agent/android/measurement/MeasurementType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementType;->Any:Lcom/newrelic/agent/android/measurement/MeasurementType;

    aput-object v1, v0, v7

    sget-object v1, Lcom/newrelic/agent/android/measurement/MeasurementType;->Machine:Lcom/newrelic/agent/android/measurement/MeasurementType;

    aput-object v1, v0, v8

    sput-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->$VALUES:[Lcom/newrelic/agent/android/measurement/MeasurementType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/measurement/MeasurementType;
    .locals 1

    .line 6
    const-class v0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/measurement/MeasurementType;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/measurement/MeasurementType;
    .locals 1

    .line 6
    sget-object v0, Lcom/newrelic/agent/android/measurement/MeasurementType;->$VALUES:[Lcom/newrelic/agent/android/measurement/MeasurementType;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/measurement/MeasurementType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/measurement/MeasurementType;

    return-object v0
.end method
