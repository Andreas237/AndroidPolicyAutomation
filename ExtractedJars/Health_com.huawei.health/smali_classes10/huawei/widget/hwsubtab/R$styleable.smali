.class public final Lhuawei/widget/hwsubtab/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/hwsubtab/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final HwSubTabWidget:[I

.field public static final HwSubTabWidget_hwSubTabIndicatorColor:I = 0x0

.field public static final HwSubTabWidget_hwSubTabIndicatorHeight:I = 0x1

.field public static final HwSubTabWidget_hwSubTabIndicatorPadding:I = 0x4

.field public static final HwSubTabWidget_hwSubTabItemBg:I = 0x5

.field public static final HwSubTabWidget_hwSubTabItemMargin:I = 0x3

.field public static final HwSubTabWidget_hwSubTabItemMinWidth:I = 0x6

.field public static final HwSubTabWidget_hwSubTabItemPadding:I = 0x2

.field public static final HwSubTabWidget_hwSubTabItemTextColor:I = 0x8

.field public static final HwSubTabWidget_hwSubTabItemTextSize:I = 0x7

.field public static final SubTab:[I

.field public static final SubTab_hwSubTabBarStyle:I = 0x0

.field public static final SubTab_hwSubTabViewStyle:I = 0x1

.field public static final SubTab_subTabBarStyle:I = 0x2

.field public static final SubTab_subTabViewStyle:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 62
    const/16 v0, 0x9

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lhuawei/widget/hwsubtab/R$styleable;->HwSubTabWidget:[I

    .line 72
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lhuawei/widget/hwsubtab/R$styleable;->SubTab:[I

    return-void

    :array_0
    .array-data 4
        0x7f010156
        0x7f010157
        0x7f010158
        0x7f010159
        0x7f01015a
        0x7f01015b
        0x7f01015c
        0x7f01015d
        0x7f01015e
    .end array-data

    :array_1
    .array-data 4
        0x7f0101f6
        0x7f0101f7
        0x7f0101f8
        0x7f0101f9
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
