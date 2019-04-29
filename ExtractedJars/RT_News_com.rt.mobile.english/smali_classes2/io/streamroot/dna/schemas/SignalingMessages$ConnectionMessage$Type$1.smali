.class final Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type$1;
.super Ljava/lang/Object;
.source "SignalingMessages.java"

# interfaces
.implements Lcom/google/protobuf/Internal$EnumLiteMap;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/protobuf/Internal$EnumLiteMap<",
        "Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1371
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic findValueByNumber(I)Lcom/google/protobuf/Internal$EnumLite;
    .locals 0

    .line 1371
    invoke-virtual {p0, p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type$1;->findValueByNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    move-result-object p1

    return-object p1
.end method

.method public findValueByNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;
    .locals 0

    .line 1373
    invoke-static {p1}, Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;->forNumber(I)Lio/streamroot/dna/schemas/SignalingMessages$ConnectionMessage$Type;

    move-result-object p1

    return-object p1
.end method
