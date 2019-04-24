.class public Lo/bsj$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bsj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static final a:[I

.field private static final c:[I

.field private static final e:[I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 55
    const/4 v0, 0x6

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/bsj$a;->e:[I

    .line 63
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lo/bsj$a;->a:[I

    .line 68
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    sput-object v0, Lo/bsj$a;->c:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x4
        0x0
        0x1
        0x2
        0x3
        0x7
    .end array-data

    :array_1
    .array-data 4
        0x6
        0x8
        0xb
    .end array-data

    :array_2
    .array-data 4
        0x5
        0x9
        0xa
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()[I
    .locals 1

    .line 40
    sget-object v0, Lo/bsj$a;->a:[I

    return-object v0
.end method

.method static synthetic d()[I
    .locals 1

    .line 40
    sget-object v0, Lo/bsj$a;->e:[I

    return-object v0
.end method

.method static synthetic e()[I
    .locals 1

    .line 40
    sget-object v0, Lo/bsj$a;->c:[I

    return-object v0
.end method
