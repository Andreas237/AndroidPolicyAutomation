.class Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;
.super Ljava/lang/Object;
.source "FirstUseGiftCardPickerAdapter.java"

# interfaces
.implements Landroid/view/animation/Interpolator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SKBounceInterpolator"
.end annotation


# instance fields
.field private mAmplitude:D

.field private mFrequency:D

.field final synthetic this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;


# direct methods
.method constructor <init>(Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;DD)V
    .locals 2

    .line 367
    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;->this$0:Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 364
    iput-wide v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;->mAmplitude:D

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    .line 365
    iput-wide v0, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;->mFrequency:D

    .line 368
    iput-wide p2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;->mAmplitude:D

    .line 369
    iput-wide p4, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;->mFrequency:D

    return-void
.end method


# virtual methods
.method public getInterpolation(F)F
    .locals 6

    neg-float v0, p1

    float-to-double v0, v0

    .line 373
    iget-wide v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;->mAmplitude:D

    div-double/2addr v0, v2

    const-wide v2, 0x4005bf0a8b145769L    # Math.E

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const-wide/high16 v2, -0x4010000000000000L    # -1.0

    mul-double/2addr v0, v2

    iget-wide v2, p0, Lcom/shopkick/app/launch/FirstUseGiftCardPickerAdapter$SKBounceInterpolator;->mFrequency:D

    float-to-double v4, p1

    mul-double/2addr v2, v4

    .line 374
    invoke-static {v2, v3}, Ljava/lang/Math;->cos(D)D

    move-result-wide v2

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    double-to-float p1, v0

    return p1
.end method
