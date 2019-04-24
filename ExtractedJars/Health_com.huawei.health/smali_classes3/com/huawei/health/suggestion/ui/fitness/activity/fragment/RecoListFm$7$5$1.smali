.class Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;

.field final synthetic e:Ljava/util/List;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;Ljava/util/List;)V
    .locals 0

    .line 355
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5$1;->e:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 358
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7;->b:Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm$7$5$1;->e:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;->d(Lcom/huawei/health/suggestion/ui/fitness/activity/fragment/RecoListFm;Ljava/util/List;)V

    .line 359
    return-void
.end method
