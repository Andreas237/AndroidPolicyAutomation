.class public Lcom/mopub/mobileads/resource/DrawableConstants$CloseButton;
.super Ljava/lang/Object;
.source "DrawableConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/resource/DrawableConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CloseButton"
.end annotation


# static fields
.field public static final DEFAULT_CLOSE_BUTTON_TEXT:Ljava/lang/String; = ""

.field public static final EDGE_PADDING:I = 0x10

.field public static final IMAGE_PADDING_DIPS:I = 0x5

.field public static final STROKE_CAP:Landroid/graphics/Paint$Cap;

.field public static final STROKE_COLOR:I = -0x1

.field public static final STROKE_WIDTH:F = 8.0f

.field public static final TEXT_COLOR:I = -0x1

.field public static final TEXT_RIGHT_MARGIN_DIPS:I = 0x7

.field public static final TEXT_SIZE_SP:F = 20.0f

.field public static final TEXT_TYPEFACE:Landroid/graphics/Typeface;

.field public static final WIDGET_HEIGHT_DIPS:I = 0x2e


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 77
    sget-object v0, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$CloseButton;->STROKE_CAP:Landroid/graphics/Paint$Cap;

    const-string v0, "Helvetica"

    const/4 v1, 0x0

    .line 80
    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$CloseButton;->TEXT_TYPEFACE:Landroid/graphics/Typeface;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
