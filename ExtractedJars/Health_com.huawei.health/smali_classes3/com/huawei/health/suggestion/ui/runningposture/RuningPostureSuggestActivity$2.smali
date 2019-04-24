.class Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V
    .locals 0

    .line 167
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$2;->c:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 170
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$2;->c:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->d(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bwp;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$2;->c:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v1}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->a(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Lo/bvl;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bwp;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 171
    return-void
.end method
