.class public final enum Lcom/shopkick/sdk/zone/ble/Proximity;
.super Ljava/lang/Enum;
.source "Proximity.java"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/shopkick/sdk/zone/ble/Proximity;",
        ">;",
        "Ljava/io/Serializable;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Combined:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Default:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Everything:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Expired:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Immediate:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Large:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Largest:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Small:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Smallest:Lcom/shopkick/sdk/zone/ble/Proximity;

.field public static final enum Unknown:Lcom/shopkick/sdk/zone/ble/Proximity;


# instance fields
.field private final displayName:Ljava/lang/String;

.field private final minThreshold:I

.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 17
    new-instance v6, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v1, "Expired"

    const-string v3, "Expired"

    const/4 v2, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v6, Lcom/shopkick/sdk/zone/ble/Proximity;->Expired:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 23
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v8, "Unknown"

    const-string v10, "Unknown"

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/16 v12, -0x3e8

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Unknown:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 29
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v2, "Immediate"

    const-string v4, "Immediate"

    const/4 v3, 0x2

    const/4 v5, 0x4

    const/16 v6, -0x41

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Immediate:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 34
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v8, "Smallest"

    const-string v10, "Immediate"

    const/4 v9, 0x3

    const/4 v11, 0x1

    const/16 v12, -0x46

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Smallest:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 38
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v2, "Small"

    const-string v4, "Near"

    const/4 v3, 0x4

    const/4 v5, 0x2

    const/16 v6, -0x4b

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Small:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 42
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v8, "Default"

    const-string v10, "Near"

    const/4 v9, 0x5

    const/4 v11, 0x3

    const/16 v12, -0x50

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Default:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 46
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v2, "Large"

    const-string v4, "Near"

    const/4 v3, 0x6

    const/4 v5, 0x5

    const/16 v6, -0x55

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Large:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 50
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v8, "Largest"

    const-string v10, "Far"

    const/4 v9, 0x7

    const/4 v11, 0x6

    const/16 v12, -0x5a

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Largest:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 56
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v2, "Everything"

    const-string v4, "Far"

    const/16 v3, 0x8

    const/4 v5, 0x7

    const/16 v6, -0x78

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Everything:Lcom/shopkick/sdk/zone/ble/Proximity;

    .line 62
    new-instance v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    const-string v8, "Combined"

    const-string v10, "Combined"

    const/16 v9, 0x9

    const/16 v11, 0x8

    const/high16 v12, -0x80000000

    move-object v7, v0

    invoke-direct/range {v7 .. v12}, Lcom/shopkick/sdk/zone/ble/Proximity;-><init>(Ljava/lang/String;ILjava/lang/String;II)V

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->Combined:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/16 v0, 0xa

    .line 11
    new-array v0, v0, [Lcom/shopkick/sdk/zone/ble/Proximity;

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Expired:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Unknown:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Immediate:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Smallest:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Small:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Default:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Large:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Largest:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Everything:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lcom/shopkick/sdk/zone/ble/Proximity;->Combined:Lcom/shopkick/sdk/zone/ble/Proximity;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sput-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->$VALUES:[Lcom/shopkick/sdk/zone/ble/Proximity;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)V"
        }
    .end annotation

    .line 69
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 70
    iput-object p3, p0, Lcom/shopkick/sdk/zone/ble/Proximity;->displayName:Ljava/lang/String;

    .line 71
    iput p4, p0, Lcom/shopkick/sdk/zone/ble/Proximity;->value:I

    .line 72
    iput p5, p0, Lcom/shopkick/sdk/zone/ble/Proximity;->minThreshold:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/shopkick/sdk/zone/ble/Proximity;
    .locals 1

    .line 11
    const-class v0, Lcom/shopkick/sdk/zone/ble/Proximity;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object p0
.end method

.method public static values()[Lcom/shopkick/sdk/zone/ble/Proximity;
    .locals 1

    .line 11
    sget-object v0, Lcom/shopkick/sdk/zone/ble/Proximity;->$VALUES:[Lcom/shopkick/sdk/zone/ble/Proximity;

    invoke-virtual {v0}, [Lcom/shopkick/sdk/zone/ble/Proximity;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/shopkick/sdk/zone/ble/Proximity;

    return-object v0
.end method


# virtual methods
.method public getDisplayName()Ljava/lang/String;
    .locals 1

    .line 80
    iget-object v0, p0, Lcom/shopkick/sdk/zone/ble/Proximity;->displayName:Ljava/lang/String;

    return-object v0
.end method

.method public getMinThreshold()I
    .locals 1

    .line 98
    iget v0, p0, Lcom/shopkick/sdk/zone/ble/Proximity;->minThreshold:I

    return v0
.end method

.method public getValue()I
    .locals 1

    .line 89
    iget v0, p0, Lcom/shopkick/sdk/zone/ble/Proximity;->value:I

    return v0
.end method
