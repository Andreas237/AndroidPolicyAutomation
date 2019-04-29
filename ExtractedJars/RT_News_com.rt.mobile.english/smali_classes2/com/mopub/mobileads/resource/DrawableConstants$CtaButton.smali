.class public Lcom/mopub/mobileads/resource/DrawableConstants$CtaButton;
.super Ljava/lang/Object;
.source "DrawableConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/resource/DrawableConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CtaButton"
.end annotation


# static fields
.field public static final BACKGROUND_ALPHA:I = 0x33

.field public static final BACKGROUND_COLOR:I = -0x1000000

.field public static final BACKGROUND_STYLE:Landroid/graphics/Paint$Style;

.field public static final CORNER_RADIUS_DIPS:I = 0x6

.field public static final DEFAULT_CTA_TEXT:Ljava/lang/String; = "Learn More"

.field public static final HEIGHT_DIPS:I = 0x26

.field public static final MARGIN_DIPS:I = 0x10

.field public static final OUTLINE_ALPHA:I = 0x33

.field public static final OUTLINE_COLOR:I = -0x1

.field public static final OUTLINE_STROKE_WIDTH_DIPS:I = 0x2

.field public static final OUTLINE_STYLE:Landroid/graphics/Paint$Style;

.field public static final TEXT_ALIGN:Landroid/graphics/Paint$Align;

.field public static final TEXT_COLOR:I = -0x1

.field public static final TEXT_SIZE_SP:F = 15.0f

.field public static final TEXT_TYPEFACE:Landroid/graphics/Typeface;

.field public static final WIDTH_DIPS:I = 0x96


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 56
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$CtaButton;->BACKGROUND_STYLE:Landroid/graphics/Paint$Style;

    .line 60
    sget-object v0, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$CtaButton;->OUTLINE_STYLE:Landroid/graphics/Paint$Style;

    const-string v0, "Helvetica"

    const/4 v1, 0x0

    .line 63
    invoke-static {v0, v1}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object v0

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$CtaButton;->TEXT_TYPEFACE:Landroid/graphics/Typeface;

    .line 65
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    sput-object v0, Lcom/mopub/mobileads/resource/DrawableConstants$CtaButton;->TEXT_ALIGN:Landroid/graphics/Paint$Align;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
