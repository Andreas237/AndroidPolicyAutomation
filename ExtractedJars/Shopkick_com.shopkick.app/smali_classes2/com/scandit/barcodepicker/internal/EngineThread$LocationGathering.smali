.class public final enum Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;
.super Ljava/lang/Enum;
.source "EngineThread.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/EngineThread;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LocationGathering"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

.field public static final enum IF_AVAILABLE:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

.field public static final enum NO:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 252
    new-instance v0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    const-string v1, "IF_AVAILABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->IF_AVAILABLE:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    .line 253
    new-instance v0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    const-string v1, "NO"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->NO:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    const/4 v0, 0x2

    .line 251
    new-array v0, v0, [Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    sget-object v1, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->IF_AVAILABLE:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    aput-object v1, v0, v2

    sget-object v1, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->NO:Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    aput-object v1, v0, v3

    sput-object v0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->$VALUES:[Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 251
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;
    .locals 1

    .line 251
    const-class v0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    return-object p0
.end method

.method public static values()[Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;
    .locals 1

    .line 251
    sget-object v0, Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->$VALUES:[Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    invoke-virtual {v0}, [Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/scandit/barcodepicker/internal/EngineThread$LocationGathering;

    return-object v0
.end method
