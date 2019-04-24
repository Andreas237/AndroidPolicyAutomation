.class public final Lhuawei/widget/hwbottomnavigationview/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/hwbottomnavigationview/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final HwBottomNavigationView:[I

.field public static final HwBottomNavigationView_android_background:I = 0x0

.field public static final HwBottomNavigationView_bottomNavMenu:I = 0x4

.field public static final HwBottomNavigationView_iconActiveColor:I = 0x2

.field public static final HwBottomNavigationView_iconDefaultColor:I = 0x1

.field public static final HwBottomNavigationView_messageBgColor:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lhuawei/widget/hwbottomnavigationview/R$styleable;->HwBottomNavigationView:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100d4
        0x7f01013a
        0x7f01013b
        0x7f01013c
        0x7f01013d
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
