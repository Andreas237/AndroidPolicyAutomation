.class public final synthetic Ljava9/util/stream/-$$Lambda$KE2B7nQsvPwODd-wfH4mrXzcBAc;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$KE2B7nQsvPwODd-wfH4mrXzcBAc;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$KE2B7nQsvPwODd-wfH4mrXzcBAc;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$KE2B7nQsvPwODd-wfH4mrXzcBAc;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$KE2B7nQsvPwODd-wfH4mrXzcBAc;->INSTANCE:Ljava9/util/stream/-$$Lambda$KE2B7nQsvPwODd-wfH4mrXzcBAc;

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

    new-instance v0, Ljava9/util/DoubleSummaryStatistics;

    invoke-direct {v0}, Ljava9/util/DoubleSummaryStatistics;-><init>()V

    return-object v0
.end method
