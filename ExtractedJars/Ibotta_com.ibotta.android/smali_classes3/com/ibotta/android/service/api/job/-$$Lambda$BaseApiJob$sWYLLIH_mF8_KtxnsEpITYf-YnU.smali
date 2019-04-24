.class public final synthetic Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$sWYLLIH_mF8_KtxnsEpITYf-YnU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/service/api/job/BaseApiJob;

.field private final synthetic f$1:Ljava/util/Set;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/service/api/job/BaseApiJob;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$sWYLLIH_mF8_KtxnsEpITYf-YnU;->f$0:Lcom/ibotta/android/service/api/job/BaseApiJob;

    iput-object p2, p0, Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$sWYLLIH_mF8_KtxnsEpITYf-YnU;->f$1:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$sWYLLIH_mF8_KtxnsEpITYf-YnU;->f$0:Lcom/ibotta/android/service/api/job/BaseApiJob;

    iget-object v1, p0, Lcom/ibotta/android/service/api/job/-$$Lambda$BaseApiJob$sWYLLIH_mF8_KtxnsEpITYf-YnU;->f$1:Ljava/util/Set;

    invoke-static {v0, v1}, Lcom/ibotta/android/service/api/job/BaseApiJob;->lambda$notifyLongTask$0(Lcom/ibotta/android/service/api/job/BaseApiJob;Ljava/util/Set;)V

    return-void
.end method
