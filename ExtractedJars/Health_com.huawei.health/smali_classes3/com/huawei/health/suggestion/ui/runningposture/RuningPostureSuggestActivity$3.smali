.class Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$3;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 213
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$3;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$3;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 214
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity$3;->b:Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;->b(Lcom/huawei/health/suggestion/ui/runningposture/RuningPostureSuggestActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 216
    :cond_0
    return-void
.end method
