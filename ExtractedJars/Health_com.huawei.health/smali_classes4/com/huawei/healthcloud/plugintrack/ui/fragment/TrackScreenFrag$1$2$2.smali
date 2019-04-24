.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 217
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->c(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 218
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 219
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;->d()V

    .line 222
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->g(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/AnimatorSet;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 224
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 225
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/chc;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/chc;->k(Z)V

    goto :goto_0

    .line 227
    :cond_1
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/chc;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/chc;->k(Z)V

    .line 229
    :goto_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v0, v0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    iget-object v1, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2$2;->a:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1$2;->e:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;

    iget-object v1, v1, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;->d:Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    invoke-static {v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/chc;

    move-result-object v1

    invoke-interface {v1}, Lo/chc;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Ljava/util/List;)Ljava/util/List;

    .line 230
    return-void
.end method
