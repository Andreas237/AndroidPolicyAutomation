.class public final synthetic Ljava9/util/stream/-$$Lambda$Yovcvk_NL-yqu-3bCw8RMJNtVPU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/ObjLongConsumer;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$Yovcvk_NL-yqu-3bCw8RMJNtVPU;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$Yovcvk_NL-yqu-3bCw8RMJNtVPU;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$Yovcvk_NL-yqu-3bCw8RMJNtVPU;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$Yovcvk_NL-yqu-3bCw8RMJNtVPU;->INSTANCE:Ljava9/util/stream/-$$Lambda$Yovcvk_NL-yqu-3bCw8RMJNtVPU;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;J)V
    .locals 0

    check-cast p1, Ljava9/util/LongSummaryStatistics;

    invoke-virtual {p1, p2, p3}, Ljava9/util/LongSummaryStatistics;->accept(J)V

    return-void
.end method
