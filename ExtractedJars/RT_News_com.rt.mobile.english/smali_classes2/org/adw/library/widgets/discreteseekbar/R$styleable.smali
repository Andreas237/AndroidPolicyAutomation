.class public final Lorg/adw/library/widgets/discreteseekbar/R$styleable;
.super Ljava/lang/Object;
.source "R.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/adw/library/widgets/discreteseekbar/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final DiscreteSeekBar:[I

.field public static final DiscreteSeekBar_dsb_allowTrackClickToDrag:I = 0x0

.field public static final DiscreteSeekBar_dsb_indicatorColor:I = 0x1

.field public static final DiscreteSeekBar_dsb_indicatorElevation:I = 0x2

.field public static final DiscreteSeekBar_dsb_indicatorFormatter:I = 0x3

.field public static final DiscreteSeekBar_dsb_indicatorPopupEnabled:I = 0x4

.field public static final DiscreteSeekBar_dsb_indicatorSeparation:I = 0x5

.field public static final DiscreteSeekBar_dsb_indicatorTextAppearance:I = 0x6

.field public static final DiscreteSeekBar_dsb_max:I = 0x7

.field public static final DiscreteSeekBar_dsb_min:I = 0x8

.field public static final DiscreteSeekBar_dsb_mirrorForRtl:I = 0x9

.field public static final DiscreteSeekBar_dsb_progressColor:I = 0xa

.field public static final DiscreteSeekBar_dsb_rippleColor:I = 0xb

.field public static final DiscreteSeekBar_dsb_scrubberHeight:I = 0xc

.field public static final DiscreteSeekBar_dsb_thumbSize:I = 0xd

.field public static final DiscreteSeekBar_dsb_trackColor:I = 0xe

.field public static final DiscreteSeekBar_dsb_trackHeight:I = 0xf

.field public static final DiscreteSeekBar_dsb_value:I = 0x10

.field public static final Theme:[I

.field public static final Theme_discreteSeekBarStyle:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x11

    .line 45
    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->DiscreteSeekBar:[I

    const/4 v0, 0x1

    .line 63
    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x7f040098

    aput v2, v0, v1

    sput-object v0, Lorg/adw/library/widgets/discreteseekbar/R$styleable;->Theme:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f0400a3
        0x7f0400a4
        0x7f0400a5
        0x7f0400a6
        0x7f0400a7
        0x7f0400a8
        0x7f0400a9
        0x7f0400aa
        0x7f0400ab
        0x7f0400ac
        0x7f0400ad
        0x7f0400ae
        0x7f0400af
        0x7f0400b0
        0x7f0400b1
        0x7f0400b2
        0x7f0400b3
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
