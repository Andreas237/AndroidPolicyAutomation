.class public final synthetic Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$LockE6gcW0vcnQjte9NBR5KdTtU;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobConsumerListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$LockE6gcW0vcnQjte9NBR5KdTtU;->f$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    return-void
.end method


# virtual methods
.method public final onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/social/google/-$$Lambda$GoogleSignInManagerImpl$LockE6gcW0vcnQjte9NBR5KdTtU;->f$0:Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;

    invoke-static {v0, p1}, Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;->lambda$linkGoogleToIbotta$0(Lcom/ibotta/android/social/google/GoogleSignInManagerImpl;Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public synthetic onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobListener$-CC;->$default$onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJobListener;Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method
