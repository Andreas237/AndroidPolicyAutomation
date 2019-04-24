.class public final synthetic Ljava9/util/stream/-$$Lambda$WhileOps$36411vDsL83077DP6w9_mjgVnbs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntFunction;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$WhileOps$36411vDsL83077DP6w9_mjgVnbs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$WhileOps$36411vDsL83077DP6w9_mjgVnbs;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$WhileOps$36411vDsL83077DP6w9_mjgVnbs;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$WhileOps$36411vDsL83077DP6w9_mjgVnbs;->INSTANCE:Ljava9/util/stream/-$$Lambda$WhileOps$36411vDsL83077DP6w9_mjgVnbs;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(I)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Ljava9/util/stream/WhileOps;->lambda$static$159(I)[Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method
