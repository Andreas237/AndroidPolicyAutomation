.class public final synthetic Ljava9/util/stream/-$$Lambda$WhileOps$kMHt3tkf2k1CAxLOS3yqYC4pb9I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/IntFunction;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$WhileOps$kMHt3tkf2k1CAxLOS3yqYC4pb9I;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$WhileOps$kMHt3tkf2k1CAxLOS3yqYC4pb9I;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$WhileOps$kMHt3tkf2k1CAxLOS3yqYC4pb9I;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$WhileOps$kMHt3tkf2k1CAxLOS3yqYC4pb9I;->INSTANCE:Ljava9/util/stream/-$$Lambda$WhileOps$kMHt3tkf2k1CAxLOS3yqYC4pb9I;

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

    invoke-static {p1}, Ljava9/util/stream/WhileOps;->lambda$static$161(I)[Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
