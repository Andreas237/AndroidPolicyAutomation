.class public final enum Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;
.super Ljava/lang/Enum;
.source "ReceiptCaptureButtonsView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ReceiptCaptureButton"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

.field public static final enum ADD:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

.field public static final enum CANCEL:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

.field public static final enum CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

.field public static final enum FINISH:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

.field public static final enum RETAKE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 51
    new-instance v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    const-string v1, "CANCEL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->CANCEL:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    .line 52
    new-instance v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    const-string v1, "RETAKE"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->RETAKE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    .line 53
    new-instance v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    const-string v1, "CAPTURE"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    .line 54
    new-instance v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    const-string v1, "ADD"

    const/4 v5, 0x3

    invoke-direct {v0, v1, v5}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ADD:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    .line 55
    new-instance v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    const-string v1, "FINISH"

    const/4 v6, 0x4

    invoke-direct {v0, v1, v6}, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->FINISH:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    const/4 v0, 0x5

    .line 50
    new-array v0, v0, [Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->CANCEL:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    aput-object v1, v0, v2

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->RETAKE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    aput-object v1, v0, v3

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->CAPTURE:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    aput-object v1, v0, v4

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->ADD:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    aput-object v1, v0, v5

    sget-object v1, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->FINISH:Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    aput-object v1, v0, v6

    sput-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->$VALUES:[Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 50
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;
    .locals 1

    .line 50
    const-class v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    return-object p0
.end method

.method public static values()[Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;
    .locals 1

    .line 50
    sget-object v0, Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->$VALUES:[Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    invoke-virtual {v0}, [Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/ibotta/android/view/camera/ReceiptCaptureButtonsView$ReceiptCaptureButton;

    return-object v0
.end method
