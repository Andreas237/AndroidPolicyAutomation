.class public Lcom/mopub/mobileads/resource/DrawableConstants$RadialCountdown;
.super Ljava/lang/Object;
.source "DrawableConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/resource/DrawableConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RadialCountdown"
.end annotation


# static fields
.field public static final BACKGROUND_ALPHA:I = 0x80

.field public static final BACKGROUND_COLOR:I = -0x1

.field public static final BACKGROUND_STYLE:Landroid/graphics/Paint$Style;

.field public static final CIRCLE_STROKE_WIDTH_DIPS:I = 0x3

.field public static final PADDING_DIPS:I = 0x5

.field public static final PROGRESS_ALPHA:I = 0xff

.field public static final PROGRESS_COLOR:I = -0x1

.field public static final PROGRESS_STYLE:Landroid/graphics/Paint$Style;

.field public static final RIGHT_MARGIN_DIPS:I = 0x10

.field public static final SIDE_LENGTH_DIPS:I = 0x2d

.field public static final START_ANGLE:F = -90.0f

.field public static final TEXT_ALIGN:Landroid/graphics/Paint$Align;

.field public static final TEXT_COLOR:I = -0x1

.field public static final TEXT_SIZE_SP:F = 18.0f

.field public static final TOP_MARGIN_DIPS:I = 0x10


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 36
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$RadialCountdown;->BACKGROUND_STYLE:Landroid/graphics/Paint$Style;

    .line 40
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$RadialCountdown;->PROGRESS_STYLE:Landroid/graphics/Paint$Style;

    .line 43
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$RadialCountdown;->TEXT_ALIGN:Landroid/graphics/Paint$Align;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
