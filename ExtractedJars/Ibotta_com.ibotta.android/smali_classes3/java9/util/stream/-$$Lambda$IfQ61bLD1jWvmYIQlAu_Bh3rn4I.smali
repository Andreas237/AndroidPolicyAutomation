.class public final synthetic Ljava9/util/stream/-$$Lambda$IfQ61bLD1jWvmYIQlAu_Bh3rn4I;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/LongFunction;


# static fields
.field public static final synthetic INSTANCE:Ljava9/util/stream/-$$Lambda$IfQ61bLD1jWvmYIQlAu_Bh3rn4I;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava9/util/stream/-$$Lambda$IfQ61bLD1jWvmYIQlAu_Bh3rn4I;

    invoke-direct {v0}, Ljava9/util/stream/-$$Lambda$IfQ61bLD1jWvmYIQlAu_Bh3rn4I;-><init>()V

    sput-object v0, Ljava9/util/stream/-$$Lambda$IfQ61bLD1jWvmYIQlAu_Bh3rn4I;->INSTANCE:Ljava9/util/stream/-$$Lambda$IfQ61bLD1jWvmYIQlAu_Bh3rn4I;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(J)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
