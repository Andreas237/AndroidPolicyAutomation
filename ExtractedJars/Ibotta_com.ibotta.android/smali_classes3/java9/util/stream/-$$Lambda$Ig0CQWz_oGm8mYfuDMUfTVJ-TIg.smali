.class public final synthetic Ljava9/util/stream/-$$Lambda$Ig0CQWz_oGm8mYfuDMUfTVJ-TIg;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$Ig0CQWz_oGm8mYfuDMUfTVJ-TIg;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$Ig0CQWz_oGm8mYfuDMUfTVJ-TIg;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$Ig0CQWz_oGm8mYfuDMUfTVJ-TIg;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$Ig0CQWz_oGm8mYfuDMUfTVJ-TIg;->INSTANCE:Ljava9/util/stream/-$$Lambda$Ig0CQWz_oGm8mYfuDMUfTVJ-TIg;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava9/util/stream/FindOps$FindSink$OfLong;

    invoke-direct {v0}, Ljava9/util/stream/FindOps$FindSink$OfLong;-><init>()V

    check-cast v0, Ljava9/util/stream/TerminalSink;

    return-object v0
.end method
