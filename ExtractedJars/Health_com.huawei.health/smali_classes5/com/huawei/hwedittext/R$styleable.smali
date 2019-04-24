.class public final Lcom/huawei/hwedittext/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwedittext/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final HwErrorTipTextLayout:[I

.field public static final HwErrorTipTextLayout_hweditTextBg:I = 0x5

.field public static final HwErrorTipTextLayout_hwerrorEnabled:I = 0x0

.field public static final HwErrorTipTextLayout_hwerrorResBg:I = 0x7

.field public static final HwErrorTipTextLayout_hwerrorTextAppearance:I = 0x1

.field public static final HwErrorTipTextLayout_hwerrorTipTextLayoutStyle:I = 0x4

.field public static final HwErrorTipTextLayout_hwlinearEditBg:I = 0x6

.field public static final HwErrorTipTextLayout_hwshape_mode:I = 0x3

.field public static final HwErrorTipTextLayout_hwspaceOccupied:I = 0x2


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 124
    const/16 v0, 0x8

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lcom/huawei/hwedittext/R$styleable;->HwErrorTipTextLayout:[I

    return-void

    :array_0
    .array-data 4
        0x7f01013e
        0x7f01013f
        0x7f010140
        0x7f010141
        0x7f010142
        0x7f010143
        0x7f010144
        0x7f010145
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
