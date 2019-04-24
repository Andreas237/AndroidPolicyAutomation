.class Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData$WorkKeyCallable;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "WorkKeyCallable"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/util/concurrent/Callable<[B>;"
    }
.end annotation


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData$WorkKeyCallable;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData$WorkKeyCallable;->call()[B

    move-result-object v0

    return-object v0
.end method

.method public call()[B
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/inter/data/AdLandingPageData$WorkKeyCallable;->context:Landroid/content/Context;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/y;->b(Landroid/content/Context;)[B

    move-result-object v0

    return-object v0
.end method
