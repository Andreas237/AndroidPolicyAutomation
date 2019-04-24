.class public final enum Lcom/newrelic/agent/android/instrumentation/MetricCategory;
.super Ljava/lang/Enum;
.source "MetricCategory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/instrumentation/MetricCategory;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/instrumentation/MetricCategory;

.field public static final enum DATABASE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

.field public static final enum IMAGE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

.field public static final enum JSON:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

.field public static final enum NETWORK:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

.field public static final enum NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

.field public static final enum VIEW_LAYOUT:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

.field public static final enum VIEW_LOADING:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

.field private static final methodMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/newrelic/agent/android/instrumentation/MetricCategory;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private categoryName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 7
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    const-string v1, "NONE"

    const-string v2, "None"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    .line 8
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    const-string v1, "VIEW_LOADING"

    const-string v2, "View Loading"

    const/4 v4, 0x1

    invoke-direct {v0, v1, v4, v2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->VIEW_LOADING:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    .line 9
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    const-string v1, "VIEW_LAYOUT"

    const-string v2, "Layout"

    const/4 v5, 0x2

    invoke-direct {v0, v1, v5, v2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->VIEW_LAYOUT:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    .line 10
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    const-string v1, "DATABASE"

    const-string v2, "Database"

    const/4 v6, 0x3

    invoke-direct {v0, v1, v6, v2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->DATABASE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    .line 11
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    const-string v1, "IMAGE"

    const-string v2, "Images"

    const/4 v7, 0x4

    invoke-direct {v0, v1, v7, v2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->IMAGE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    .line 12
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    const-string v1, "JSON"

    const-string v2, "JSON"

    const/4 v8, 0x5

    invoke-direct {v0, v1, v8, v2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->JSON:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    .line 13
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    const-string v1, "NETWORK"

    const-string v2, "Network"

    const/4 v9, 0x6

    invoke-direct {v0, v1, v9, v2}, Lcom/newrelic/agent/android/instrumentation/MetricCategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NETWORK:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    const/4 v0, 0x7

    .line 6
    new-array v0, v0, [Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->VIEW_LOADING:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    aput-object v1, v0, v4

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->VIEW_LAYOUT:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    aput-object v1, v0, v5

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->DATABASE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    aput-object v1, v0, v6

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->IMAGE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    aput-object v1, v0, v7

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->JSON:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    aput-object v1, v0, v8

    sget-object v1, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NETWORK:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    aput-object v1, v0, v9

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->$VALUES:[Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    .line 16
    new-instance v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory$1;

    invoke-direct {v0}, Lcom/newrelic/agent/android/instrumentation/MetricCategory$1;-><init>()V

    sput-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->methodMap:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 21
    iput-object p3, p0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->categoryName:Ljava/lang/String;

    return-void
.end method

.method public static categoryForMethod(Ljava/lang/String;)Lcom/newrelic/agent/android/instrumentation/MetricCategory;
    .locals 2

    if-nez p0, :cond_0

    .line 30
    sget-object p0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    const-string v1, "#"

    .line 33
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-ltz v1, :cond_1

    add-int/lit8 v1, v1, 0x1

    .line 35
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 37
    :cond_1
    sget-object p0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->methodMap:Ljava/util/Map;

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    if-nez p0, :cond_2

    .line 39
    sget-object p0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->NONE:Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    :cond_2
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/instrumentation/MetricCategory;
    .locals 1

    .line 6
    const-class v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/instrumentation/MetricCategory;
    .locals 1

    .line 6
    sget-object v0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->$VALUES:[Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/instrumentation/MetricCategory;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/instrumentation/MetricCategory;

    return-object v0
.end method


# virtual methods
.method public getCategoryName()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/newrelic/agent/android/instrumentation/MetricCategory;->categoryName:Ljava/lang/String;

    return-object v0
.end method
