.class public final enum Lcom/newrelic/agent/android/tracing/Sample$SampleType;
.super Ljava/lang/Enum;
.source "Sample.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/tracing/Sample;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SampleType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/tracing/Sample$SampleType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/tracing/Sample$SampleType;

.field public static final enum CPU:Lcom/newrelic/agent/android/tracing/Sample$SampleType;

.field public static final enum MEMORY:Lcom/newrelic/agent/android/tracing/Sample$SampleType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 14
    new-instance v0, Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    const-string v1, "MEMORY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/tracing/Sample$SampleType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/tracing/Sample$SampleType;->MEMORY:Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    .line 15
    new-instance v0, Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    const-string v1, "CPU"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/tracing/Sample$SampleType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/tracing/Sample$SampleType;->CPU:Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    const/4 v0, 0x2

    .line 13
    new-array v0, v0, [Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    sget-object v1, Lcom/newrelic/agent/android/tracing/Sample$SampleType;->MEMORY:Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/tracing/Sample$SampleType;->CPU:Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/newrelic/agent/android/tracing/Sample$SampleType;->$VALUES:[Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/tracing/Sample$SampleType;
    .locals 1

    .line 13
    const-class v0, Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/tracing/Sample$SampleType;
    .locals 1

    .line 13
    sget-object v0, Lcom/newrelic/agent/android/tracing/Sample$SampleType;->$VALUES:[Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/tracing/Sample$SampleType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/tracing/Sample$SampleType;

    return-object v0
.end method
