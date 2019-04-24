.class public final Lhuawei/widget/hwcommon/R$styleable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhuawei/widget/hwcommon/R;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "styleable"
.end annotation


# static fields
.field public static final TranslateAnimation:[I

.field public static final TranslateAnimation_fromXDelta:I = 0x0

.field public static final TranslateAnimation_fromYDelta:I = 0x2

.field public static final TranslateAnimation_toXDelta:I = 0x1

.field public static final TranslateAnimation_toYDelta:I = 0x3


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    const/4 v0, 0x4

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lhuawei/widget/hwcommon/R$styleable;->TranslateAnimation:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x7f010240
        0x7f010241
        0x7f010242
        0x7f010243
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
