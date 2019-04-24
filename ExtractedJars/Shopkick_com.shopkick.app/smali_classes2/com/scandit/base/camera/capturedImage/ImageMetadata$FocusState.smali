.class public final enum Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;
.super Ljava/lang/Enum;
.source "ImageMetadata.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/capturedImage/ImageMetadata;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "FocusState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

.field public static final enum ACTIVE_SCAN:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

.field public static final enum FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

.field public static final enum FOCUS_DISTANCE_APPLIED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

.field public static final enum INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

.field public static final enum MISSING_CAMERA_SUPPORT:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

.field public static final enum NOT_FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 27
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const-string v1, "INACTIVE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 28
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const-string v1, "ACTIVE_SCAN"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->ACTIVE_SCAN:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 29
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const-string v1, "FOCUSED_LOCKED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 30
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const-string v1, "NOT_FOCUSED_LOCKED"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->NOT_FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 31
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const-string v1, "FOCUS_DISTANCE_APPLIED"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->FOCUS_DISTANCE_APPLIED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    .line 32
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const-string v1, "MISSING_CAMERA_SUPPORT"

    const/4 v7, 0x5

    invoke-direct {v0, v1, v7}, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->MISSING_CAMERA_SUPPORT:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    const/4 v0, 0x6

    .line 26
    new-array v0, v0, [Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->INACTIVE:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    aput-object v1, v0, v2

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->ACTIVE_SCAN:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->NOT_FOCUSED_LOCKED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->FOCUS_DISTANCE_APPLIED:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    aput-object v1, v0, v6

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->MISSING_CAMERA_SUPPORT:Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    aput-object v1, v0, v7

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->$VALUES:[Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;
    .locals 1

    .line 26
    const-class v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object p0
.end method

.method public static values()[Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;
    .locals 1

    .line 26
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->$VALUES:[Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    invoke-virtual {v0}, [Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/scandit/base/camera/capturedImage/ImageMetadata$FocusState;

    return-object v0
.end method
