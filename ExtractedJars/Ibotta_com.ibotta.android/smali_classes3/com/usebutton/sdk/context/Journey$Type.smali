.class public final enum Lcom/usebutton/sdk/context/Journey$Type;
.super Ljava/lang/Enum;
.source "Journey.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/usebutton/sdk/context/Journey;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/usebutton/sdk/context/Journey$Type;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/usebutton/sdk/context/Journey$Type;

.field public static final enum BOAT:Lcom/usebutton/sdk/context/Journey$Type;

.field public static final enum BUS:Lcom/usebutton/sdk/context/Journey$Type;

.field public static final enum CAR:Lcom/usebutton/sdk/context/Journey$Type;

.field public static final enum FLIGHT:Lcom/usebutton/sdk/context/Journey$Type;

.field public static final enum SPACESHIP:Lcom/usebutton/sdk/context/Journey$Type;

.field public static final enum SUBWAY:Lcom/usebutton/sdk/context/Journey$Type;

.field public static final enum TRAIN:Lcom/usebutton/sdk/context/Journey$Type;

.field public static final enum WALKING:Lcom/usebutton/sdk/context/Journey$Type;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 17
    new-instance v0, Lcom/usebutton/sdk/context/Journey$Type;

    const-string v1, "FLIGHT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/context/Journey$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->FLIGHT:Lcom/usebutton/sdk/context/Journey$Type;

    .line 18
    new-instance v0, Lcom/usebutton/sdk/context/Journey$Type;

    const-string v1, "TRAIN"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/usebutton/sdk/context/Journey$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->TRAIN:Lcom/usebutton/sdk/context/Journey$Type;

    .line 19
    new-instance v0, Lcom/usebutton/sdk/context/Journey$Type;

    const-string v1, "BUS"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/usebutton/sdk/context/Journey$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->BUS:Lcom/usebutton/sdk/context/Journey$Type;

    .line 20
    new-instance v0, Lcom/usebutton/sdk/context/Journey$Type;

    const-string v1, "CAR"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/usebutton/sdk/context/Journey$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->CAR:Lcom/usebutton/sdk/context/Journey$Type;

    .line 21
    new-instance v0, Lcom/usebutton/sdk/context/Journey$Type;

    const-string v1, "WALKING"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/usebutton/sdk/context/Journey$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->WALKING:Lcom/usebutton/sdk/context/Journey$Type;

    .line 22
    new-instance v0, Lcom/usebutton/sdk/context/Journey$Type;

    const-string v1, "SUBWAY"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/usebutton/sdk/context/Journey$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->SUBWAY:Lcom/usebutton/sdk/context/Journey$Type;

    .line 23
    new-instance v0, Lcom/usebutton/sdk/context/Journey$Type;

    const-string v1, "BOAT"

    const/4 v8, 0x6

    invoke-direct {v0, v1, v8}, Lcom/usebutton/sdk/context/Journey$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->BOAT:Lcom/usebutton/sdk/context/Journey$Type;

    .line 24
    new-instance v0, Lcom/usebutton/sdk/context/Journey$Type;

    const-string v1, "SPACESHIP"

    const/4 v9, 0x7

    invoke-direct {v0, v1, v9}, Lcom/usebutton/sdk/context/Journey$Type;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->SPACESHIP:Lcom/usebutton/sdk/context/Journey$Type;

    const/16 v0, 0x8

    .line 16
    new-array v0, v0, [Lcom/usebutton/sdk/context/Journey$Type;

    sget-object v1, Lcom/usebutton/sdk/context/Journey$Type;->FLIGHT:Lcom/usebutton/sdk/context/Journey$Type;

    aput-object v1, v0, v2

    sget-object v1, Lcom/usebutton/sdk/context/Journey$Type;->TRAIN:Lcom/usebutton/sdk/context/Journey$Type;

    aput-object v1, v0, v3

    sget-object v1, Lcom/usebutton/sdk/context/Journey$Type;->BUS:Lcom/usebutton/sdk/context/Journey$Type;

    aput-object v1, v0, v4

    sget-object v1, Lcom/usebutton/sdk/context/Journey$Type;->CAR:Lcom/usebutton/sdk/context/Journey$Type;

    aput-object v1, v0, v5

    sget-object v1, Lcom/usebutton/sdk/context/Journey$Type;->WALKING:Lcom/usebutton/sdk/context/Journey$Type;

    aput-object v1, v0, v6

    sget-object v1, Lcom/usebutton/sdk/context/Journey$Type;->SUBWAY:Lcom/usebutton/sdk/context/Journey$Type;

    aput-object v1, v0, v7

    sget-object v1, Lcom/usebutton/sdk/context/Journey$Type;->BOAT:Lcom/usebutton/sdk/context/Journey$Type;

    aput-object v1, v0, v8

    sget-object v1, Lcom/usebutton/sdk/context/Journey$Type;->SPACESHIP:Lcom/usebutton/sdk/context/Journey$Type;

    aput-object v1, v0, v9

    sput-object v0, Lcom/usebutton/sdk/context/Journey$Type;->$VALUES:[Lcom/usebutton/sdk/context/Journey$Type;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/usebutton/sdk/context/Journey$Type;
    .locals 1

    .line 16
    const-class v0, Lcom/usebutton/sdk/context/Journey$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/usebutton/sdk/context/Journey$Type;

    return-object p0
.end method

.method public static values()[Lcom/usebutton/sdk/context/Journey$Type;
    .locals 1

    .line 16
    sget-object v0, Lcom/usebutton/sdk/context/Journey$Type;->$VALUES:[Lcom/usebutton/sdk/context/Journey$Type;

    invoke-virtual {v0}, [Lcom/usebutton/sdk/context/Journey$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/usebutton/sdk/context/Journey$Type;

    return-object v0
.end method
