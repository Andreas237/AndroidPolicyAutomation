.class Lcom/huawei/bone/social/ui/RankingFragment$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/bone/social/ui/RankingFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private final c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/bone/social/ui/RankingFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 1

    .line 473
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 474
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$e;->c:Ljava/lang/ref/WeakReference;

    .line 475
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 480
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$e;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/bone/social/ui/RankingFragment;

    .line 481
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 482
    invoke-static {v1}, Lcom/huawei/bone/social/ui/RankingFragment;->l(Lcom/huawei/bone/social/ui/RankingFragment;)V

    .line 484
    :cond_0
    return-void
.end method
