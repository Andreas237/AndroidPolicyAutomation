.class public final enum Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
.super Ljava/lang/Enum;
.source "SignalingMessages.java"

# interfaces
.implements Lcom/google/protobuf/Internal$EnumLite;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Type"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;",
        ">;",
        "Lcom/google/protobuf/Internal$EnumLite;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

.field public static final enum ANSWER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

.field public static final ANSWER_VALUE:I = 0x0

.field public static final enum OFFER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

.field public static final OFFER_VALUE:I = 0x1

.field public static final enum UNRECOGNIZED:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

.field private static final internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1327
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    const-string v1, "ANSWER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->ANSWER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    .line 1331
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    const-string v1, "OFFER"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->OFFER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    .line 1332
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    const-string v1, "UNRECOGNIZED"

    const/4 v4, 0x2

    const/4 v5, -0x1

    invoke-direct {v0, v1, v4, v5}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->UNRECOGNIZED:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    const/4 v0, 0x3

    .line 1322
    new-array v0, v0, [Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    sget-object v1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->ANSWER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    aput-object v1, v0, v2

    sget-object v1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->OFFER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    aput-object v1, v0, v3

    sget-object v1, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->UNRECOGNIZED:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    aput-object v1, v0, v4

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->$VALUES:[Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    .line 1370
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type$1;

    invoke-direct {v0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type$1;-><init>()V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1379
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 1380
    iput p3, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->value:I

    return-void
.end method

.method public static forNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 1360
    :pswitch_0
    sget-object p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->OFFER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    return-object p0

    .line 1359
    :pswitch_1
    sget-object p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->ANSWER:Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static internalGetValueMap()Lcom/google/protobuf/Internal$EnumLiteMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;",
            ">;"
        }
    .end annotation

    .line 1367
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    return-object v0
.end method

.method public static valueOf(I)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1354
    invoke-static {p0}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->forNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 1

    .line 1322
    const-class v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 1

    .line 1322
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->$VALUES:[Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    invoke-virtual {v0}, [Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    .line 1346
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->value:I

    return v0
.end method
