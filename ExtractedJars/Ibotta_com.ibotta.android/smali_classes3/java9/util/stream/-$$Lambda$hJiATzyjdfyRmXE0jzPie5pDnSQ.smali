.class public final synthetic Ljava9/util/stream/-$$Lambda$hJiATzyjdfyRmXE0jzPie5pDnSQ;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Supplier;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$hJiATzyjdfyRmXE0jzPie5pDnSQ;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$hJiATzyjdfyRmXE0jzPie5pDnSQ;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$hJiATzyjdfyRmXE0jzPie5pDnSQ;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$hJiATzyjdfyRmXE0jzPie5pDnSQ;->INSTANCE:Ljava9/util/stream/-$$Lambda$hJiATzyjdfyRmXE0jzPie5pDnSQ;

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

    new-instance v0, Ljava9/util/stream/FindOps$FindSink$OfRef;

    invoke-direct {v0}, Ljava9/util/stream/FindOps$FindSink$OfRef;-><init>()V

    check-cast v0, Ljava9/util/stream/TerminalSink;

    return-object v0
.end method
