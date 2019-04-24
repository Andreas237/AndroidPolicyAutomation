.class public Lo/bss$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/bss;
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

    .line 51
    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lo/bss$a;->e:[I

    .line 53
    const/4 v0, 0x1

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lo/bss$a;->c:[I

    .line 56
    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lo/bss$a;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x1
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()[I
    .locals 1

    .line 48
    sget-object v0, Lo/bss$a;->e:[I

    return-object v0
.end method

.method static synthetic b()[I
    .locals 1

    .line 48
    sget-object v0, Lo/bss$a;->c:[I

    return-object v0
.end method

.method static synthetic e()[I
    .locals 1

    .line 48
    sget-object v0, Lo/bss$a;->a:[I

    return-object v0
.end method
