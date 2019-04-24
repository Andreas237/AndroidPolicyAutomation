.class public final synthetic Lcom/ibotta/android/api/auth/-$$Lambda$PostAuthTask$BTCMRfFC6r1OwcHQmoSTL42eGvs;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava9/util/function/Consumer;


# static fields
.field public static final synthetic INSTANCE:Lcom/ibotta/android/api/auth/-$$Lambda$PostAuthTask$BTCMRfFC6r1OwcHQmoSTL42eGvs;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/ibotta/android/api/auth/-$$Lambda$PostAuthTask$BTCMRfFC6r1OwcHQmoSTL42eGvs;

    invoke-direct {v0}, Lcom/ibotta/android/api/auth/-$$Lambda$PostAuthTask$BTCMRfFC6r1OwcHQmoSTL42eGvs;-><init>()V

    sput-object v0, Lcom/ibotta/android/api/auth/-$$Lambda$PostAuthTask$BTCMRfFC6r1OwcHQmoSTL42eGvs;->INSTANCE:Lcom/ibotta/android/api/auth/-$$Lambda$PostAuthTask$BTCMRfFC6r1OwcHQmoSTL42eGvs;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-static {p1}, Lcom/ibotta/android/api/auth/PostAuthTask;->lambda$run$0(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method

.method public synthetic andThen(Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava9/util/function/Consumer<",
            "-TT;>;)",
            "Ljava9/util/function/Consumer<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava9/util/function/Consumer$-CC;->$default$andThen(Ljava9/util/function/Consumer;Ljava9/util/function/Consumer;)Ljava9/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
