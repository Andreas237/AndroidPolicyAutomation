.class public final Lorg/apmem/tools/layouts/b$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apmem/tools/layouts/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final FlowLayout:[I

.field public static final FlowLayout_LayoutParams:[I

.field public static final FlowLayout_LayoutParams_android_layout_gravity:I = 0x0

.field public static final FlowLayout_LayoutParams_layout_newLine:I = 0x1

.field public static final FlowLayout_LayoutParams_layout_weight:I = 0x2

.field public static final FlowLayout_android_gravity:I = 0x0

.field public static final FlowLayout_android_orientation:I = 0x1

.field public static final FlowLayout_debugDraw:I = 0x2

.field public static final FlowLayout_layoutDirection:I = 0x3

.field public static final FlowLayout_weightDefault:I = 0x4


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x5

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lorg/apmem/tools/layouts/b$a;->FlowLayout:[I

    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lorg/apmem/tools/layouts/b$a;->FlowLayout_LayoutParams:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100af
        0x10100c4
        0x7f040089
        0x7f0400d4
        0x7f040180
    .end array-data

    :array_1
    .array-data 4
        0x10100b3
        0x7f0400de
        0x7f0400e1
    .end array-data
.end method
