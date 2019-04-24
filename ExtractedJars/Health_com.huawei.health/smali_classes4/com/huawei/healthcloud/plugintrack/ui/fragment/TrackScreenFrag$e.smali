.class Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V
    .locals 1

    .line 879
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 877
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$e;->e:Ljava/lang/ref/WeakReference;

    .line 880
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$e;->e:Ljava/lang/ref/WeakReference;

    .line 881
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$1;)V
    .locals 0

    .line 876
    invoke-direct {p0, p1}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$e;-><init>(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 885
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 886
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag$e;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;

    .line 887
    const/4 v0, 0x0

    if-ne v0, v2, :cond_0

    .line 888
    return-void

    .line 890
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_1

    .line 892
    :pswitch_0
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->p(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 893
    goto :goto_1

    .line 895
    :pswitch_1
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->p(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 896
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 897
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 898
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->a(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/healthcloud/plugintrack/ui/activity/TrackDetailActivity$e;->d()V

    goto :goto_1

    .line 902
    :pswitch_2
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cha;

    move-result-object v0

    invoke-interface {v0}, Lo/cha;->e()V

    .line 903
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->v(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)V

    .line 905
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 906
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cha;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/cha;->e(Z)V

    goto :goto_0

    .line 908
    :cond_1
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cha;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lo/cha;->e(Z)V

    .line 910
    :goto_0
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->t(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Lo/cha;

    move-result-object v0

    invoke-interface {v0}, Lo/cha;->k()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->b(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Ljava/util/List;)Ljava/util/List;

    .line 911
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 912
    const/4 v0, 0x1

    invoke-static {v2, v0}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->d(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;Z)Z

    .line 913
    invoke-static {v2}, Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;->m(Lcom/huawei/healthcloud/plugintrack/ui/fragment/TrackScreenFrag;)Landroid/animation/AnimatorSet;

    move-result-object v0

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 914
    .line 919
    :cond_2
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
