.class public Lcom/mopub/mobileads/resource/DrawableConstants$GradientStrip;
.super Ljava/lang/Object;
.source "DrawableConstants.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/mobileads/resource/DrawableConstants;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "GradientStrip"
.end annotation


# static fields
.field public static final END_COLOR:I

.field public static final GRADIENT_STRIP_HEIGHT_DIPS:I = 0x48

.field public static final START_COLOR:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x66

    .line 86
    invoke-static {v1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    sput v1, Lcom/mopub/mobileads/resource/DrawableConstants$GradientStrip;->START_COLOR:I

    .line 87
    invoke-static {v0, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v0

    sput v0, Lcom/mopub/mobileads/resource/DrawableConstants$GradientStrip;->END_COLOR:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 84
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
