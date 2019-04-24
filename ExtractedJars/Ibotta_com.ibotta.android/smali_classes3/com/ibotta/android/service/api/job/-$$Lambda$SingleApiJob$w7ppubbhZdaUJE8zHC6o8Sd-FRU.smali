.class public final synthetic Lcom/ibotta/android/service/api/job/-$$Lambda$SingleApiJob$w7ppubbhZdaUJE8zHC6o8Sd-FRU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/service/api/job/SingleApiJob;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/service/api/job/SingleApiJob;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/service/api/job/-$$Lambda$SingleApiJob$w7ppubbhZdaUJE8zHC6o8Sd-FRU;->f$0:Lcom/ibotta/android/service/api/job/SingleApiJob;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/service/api/job/-$$Lambda$SingleApiJob$w7ppubbhZdaUJE8zHC6o8Sd-FRU;->f$0:Lcom/ibotta/android/service/api/job/SingleApiJob;

    invoke-static {v0}, Lcom/ibotta/android/service/api/job/SingleApiJob;->lambda$onCheckCache$0(Lcom/ibotta/android/service/api/job/SingleApiJob;)V

    return-void
.end method
