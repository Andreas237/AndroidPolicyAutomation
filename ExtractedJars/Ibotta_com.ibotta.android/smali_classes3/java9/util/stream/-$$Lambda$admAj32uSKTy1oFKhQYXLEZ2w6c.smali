.class public final synthetic Ljava9/util/stream/-$$Lambda$admAj32uSKTy1oFKhQYXLEZ2w6c;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongBinaryOperator;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$admAj32uSKTy1oFKhQYXLEZ2w6c;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$admAj32uSKTy1oFKhQYXLEZ2w6c;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$admAj32uSKTy1oFKhQYXLEZ2w6c;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$admAj32uSKTy1oFKhQYXLEZ2w6c;->INSTANCE:Ljava9/util/stream/-$$Lambda$admAj32uSKTy1oFKhQYXLEZ2w6c;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final applyAsLong(JJ)J
    .locals 0

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    return-wide p1
.end method
