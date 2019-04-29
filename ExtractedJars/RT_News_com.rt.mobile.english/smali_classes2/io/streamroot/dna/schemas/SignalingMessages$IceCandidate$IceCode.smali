.class public final enum Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
.super Ljava/lang/Enum;
.source "SignalingMessages.java"

# interfaces
.implements Lcom/google/protobuf/Internal$EnumLite;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "IceCode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;",
        ">;",
        "Lcom/google/protobuf/Internal$EnumLite;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

.field public static final enum HOST:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

.field public static final HOST_VALUE:I = 0x0

.field public static final enum SRFLX:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

.field public static final SRFLX_VALUE:I = 0x1

.field public static final enum UNRECOGNIZED:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

.field private static final internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/Internal$EnumLiteMap<",
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final value:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 54
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    const-string v1, "HOST"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->HOST:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    .line 58
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    const-string v1, "SRFLX"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v3}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->SRFLX:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    .line 59
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    const-string v1, "UNRECOGNIZED"

    const/4 v4, 0x2

    const/4 v5, -0x1

    invoke-direct {v0, v1, v4, v5}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->UNRECOGNIZED:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    const/4 v0, 0x3

    .line 49
    new-array v0, v0, [Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    sget-object v1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->HOST:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    aput-object v1, v0, v2

    sget-object v1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->SRFLX:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    aput-object v1, v0, v3

    sget-object v1, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->UNRECOGNIZED:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    aput-object v1, v0, v4

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->$VALUES:[Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    .line 97
    new-instance v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode$1;

    invoke-direct {v0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode$1;-><init>()V

    sput-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 106
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 107
    iput p3, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->value:I

    return-void
.end method

.method public static forNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    .line 87
    :pswitch_0
    sget-object p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->SRFLX:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    return-object p0

    .line 86
    :pswitch_1
    sget-object p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->HOST:Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

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
            "Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;",
            ">;"
        }
    .end annotation

    .line 94
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->internalValueMap:Lcom/google/protobuf/Internal$EnumLiteMap;

    return-object v0
.end method

.method public static valueOf(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 81
    invoke-static {p0}, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->forNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    move-result-object p0

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
    .locals 1

    .line 49
    const-class v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;
    .locals 1

    .line 49
    sget-object v0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->$VALUES:[Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    invoke-virtual {v0}, [Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;

    return-object v0
.end method


# virtual methods
.method public final getNumber()I
    .locals 1

    .line 73
    iget v0, p0, Lio/streamroot/dna/schemas/SignalingMessages$IceCandidate$IceCode;->value:I

    return v0
.end method
