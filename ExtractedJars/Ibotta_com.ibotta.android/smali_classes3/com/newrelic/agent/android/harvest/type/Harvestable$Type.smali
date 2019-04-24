.class public final enum Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;
.super Ljava/lang/Enum;
.source "Harvestable.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/harvest/type/Harvestable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

.field public static final enum ARRAY:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

.field public static final enum OBJECT:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

.field public static final enum VALUE:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 19
    new-instance v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    const-string v1, "OBJECT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->OBJECT:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    .line 20
    new-instance v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    const-string v1, "ARRAY"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->ARRAY:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    .line 21
    new-instance v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    const-string v1, "VALUE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->VALUE:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    const/4 v0, 0x3

    .line 18
    new-array v0, v0, [Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    sget-object v1, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->OBJECT:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    aput-object v1, v0, v2

    sget-object v1, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->ARRAY:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->VALUE:Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    aput-object v1, v0, v4

    sput-object v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->$VALUES:[Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;
    .locals 1

    .line 18
    const-class v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    return-object p0
.end method

.method public static values()[Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;
    .locals 1

    .line 18
    sget-object v0, Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->$VALUES:[Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    invoke-virtual {v0}, [Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/newrelic/agent/android/harvest/type/Harvestable$Type;

    return-object v0
.end method
