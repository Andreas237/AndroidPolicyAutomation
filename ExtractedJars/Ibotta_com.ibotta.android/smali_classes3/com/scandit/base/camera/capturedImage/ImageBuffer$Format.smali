.class public final enum Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;
.super Ljava/lang/Enum;
.source "ImageBuffer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/scandit/base/camera/capturedImage/ImageBuffer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Format"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

.field public static final enum UNKNOWN:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

.field public static final enum YCbCr_420:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

.field public static final enum YCrCb_420:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 18
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    const-string v1, "YCrCb_420"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->YCrCb_420:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    .line 19
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    const-string v1, "YCbCr_420"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->YCbCr_420:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    .line 20
    new-instance v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    const-string v1, "UNKNOWN"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->UNKNOWN:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    const/4 v0, 0x3

    .line 17
    new-array v0, v0, [Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->YCrCb_420:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    aput-object v1, v0, v2

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->YCbCr_420:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    aput-object v1, v0, v3

    sget-object v1, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->UNKNOWN:Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    aput-object v1, v0, v4

    sput-object v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->$VALUES:[Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;
    .locals 1

    .line 17
    const-class v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    return-object p0
.end method

.method public static values()[Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;
    .locals 1

    .line 17
    sget-object v0, Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->$VALUES:[Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    invoke-virtual {v0}, [Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/scandit/base/camera/capturedImage/ImageBuffer$Format;

    return-object v0
.end method
