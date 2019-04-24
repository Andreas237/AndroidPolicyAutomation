.class public final Lhuawei/widget/hwseekbar/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/hwseekbar/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final HwSeekBar:[I

.field public static final HwSeekBar_bubbleTipBg:I = 0x1

.field public static final HwSeekBar_showText:I = 0x0

.field public static final HwSeekBar_singleTipBg:I = 0x2

.field public static final HwSeekBar_stepTextColor:I = 0x4

.field public static final HwSeekBar_stepTextSize:I = 0x5

.field public static final HwSeekBar_tipTextColor:I = 0x3

.field public static final HwSeekBar_tipTextSize:I = 0x6


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    const/4 v0, 0x7

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lhuawei/widget/hwseekbar/R$styleable;->HwSeekBar:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f01014e
        0x7f01014f
        0x7f010150
        0x7f010151
        0x7f010152
        0x7f010153
        0x7f010154
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
