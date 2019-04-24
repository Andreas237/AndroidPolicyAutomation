.class Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V
    .locals 1

    .line 124
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 125
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$b;->c:Ljava/lang/ref/WeakReference;

    .line 126
    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$4;)V
    .locals 0

    .line 121
    invoke-direct {p0, p1}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$b;-><init>(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 130
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;

    .line 132
    if-nez v4, :cond_0

    .line 133
    return-void

    .line 135
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 137
    :sswitch_0
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->d(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 138
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 139
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->p:Z

    .line 141
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V

    .line 142
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a()V

    goto :goto_1

    .line 144
    :cond_1
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Z)Z

    .line 146
    goto :goto_1

    .line 148
    :sswitch_1
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Z)Z

    .line 149
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->J:Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;

    iget-object v1, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->M:Ljava/util/ArrayList;

    iget v2, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->L:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/commonui/scrollview/ScrollBarChartView;->c(Ljava/util/List;I)V

    .line 150
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->c(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 151
    const/4 v0, 0x0

    invoke-static {v4, v0}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;Z)Z

    .line 152
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->h:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 153
    iget-object v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->l:Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 154
    const/4 v0, 0x0

    iput-boolean v0, v4, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->p:Z

    .line 155
    invoke-static {v4}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->b(Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;)V

    .line 156
    invoke-virtual {v4}, Lcom/huawei/ui/main/stories/history/fragment/BaseSportDataFragment;->a()V

    goto :goto_1

    .line 160
    :goto_0
    const-string v0, "Track_BaseSportDataFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "wrong handler msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    :cond_2
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x65 -> :sswitch_0
        0x66 -> :sswitch_1
    .end sparse-switch
.end method
