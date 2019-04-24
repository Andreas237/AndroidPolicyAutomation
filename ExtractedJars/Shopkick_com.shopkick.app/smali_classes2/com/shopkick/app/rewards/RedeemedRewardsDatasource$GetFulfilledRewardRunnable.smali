.class Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$GetFulfilledRewardRunnable;
.super Ljava/lang/Object;
.source "RedeemedRewardsDatasource.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "GetFulfilledRewardRunnable"
.end annotation


# instance fields
.field private dataSourceRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;",
            ">;"
        }
    .end annotation
.end field

.field private entityKey:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Ljava/lang/String;)V
    .locals 1

    .line 952
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 953
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$GetFulfilledRewardRunnable;->dataSourceRef:Ljava/lang/ref/WeakReference;

    .line 954
    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$GetFulfilledRewardRunnable;->entityKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 960
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$GetFulfilledRewardRunnable;->dataSourceRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;

    if-eqz v0, :cond_0

    .line 962
    iget-object v1, p0, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource$GetFulfilledRewardRunnable;->entityKey:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;->access$300(Lcom/shopkick/app/rewards/RedeemedRewardsDatasource;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
