.class public final enum Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;
.super Ljava/lang/Enum;
.source "ScanOverlayImpl.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "HighlightingState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

.field public static final enum DEFAULT:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

.field public static final enum RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 114
    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->DEFAULT:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    new-instance v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    const-string v1, "RECOGNIZED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    const/4 v0, 0x2

    .line 113
    new-array v0, v0, [Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    sget-object v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->DEFAULT:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->RECOGNIZED:Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    aput-object v1, v0, v3

    sput-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->$VALUES:[Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 113
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;
    .locals 1

    .line 113
    const-class v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    return-object p0
.end method

.method public static values()[Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;
    .locals 1

    .line 113
    sget-object v0, Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->$VALUES:[Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    invoke-virtual {v0}, [Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/scandit/barcodepicker/internal/gui/ScanOverlayImpl$HighlightingState;

    return-object v0
.end method
