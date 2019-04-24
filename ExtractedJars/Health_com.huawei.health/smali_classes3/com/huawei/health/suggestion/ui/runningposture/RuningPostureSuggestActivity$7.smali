.class Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bvl$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V
    .locals 0

    .line 383
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$7;->e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 3

    .line 386
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$7;->e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$7;->e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->g(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$7;->e:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    iget v2, v2, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->e:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;

    invoke-virtual {v1}, Lcom/huawei/health/suggestion/ui/fitness/module/Motion;->acquireMotionPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;Ljava/lang/String;)V

    .line 387
    return-void
.end method
