.class Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V
    .locals 0

    .line 1232
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 1235
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1236
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 1238
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1239
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Ljava/util/List;)V

    .line 1241
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;->notifyDataSetChanged()V

    .line 1242
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    .line 1243
    goto/16 :goto_1

    .line 1245
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/fid$d;

    .line 1246
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 1247
    iget-object v5, v4, Lo/fid$d;->c:Landroid/widget/ImageView;

    .line 1248
    iget-object v6, v4, Lo/fid$d;->e:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 1249
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0, v5, v6}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->a(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 1250
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;->notifyDataSetChanged()V

    .line 1251
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$d;->getCount()I

    move-result v0

    const/4 v1, 0x2

    if-le v0, v1, :cond_1

    .line 1252
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->f(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 1255
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->k(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    .line 1256
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->q(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    .line 1257
    goto/16 :goto_1

    .line 1262
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1263
    goto/16 :goto_1

    .line 1266
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->d:Lorg/json/JSONArray;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b(Lorg/json/JSONArray;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->t(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1267
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Z)Z

    .line 1268
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "To display the red dot!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1270
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 1272
    :cond_2
    const-string v0, "UIDV_StoreDemoNewSocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not display the red dot!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1274
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1277
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->z(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    .line 1278
    goto :goto_1

    .line 1280
    :sswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-object v5, v0

    check-cast v5, [Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 1281
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    const/4 v1, 0x0

    aget-object v1, v5, v1

    const/4 v2, 0x1

    aget-object v2, v5, v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->e(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 1282
    goto :goto_1

    .line 1284
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment$10;->e:Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;->x(Lcom/huawei/ui/main/stories/soical/StoreDemoViews/StoreDemoNewSocialFragment;)V

    .line 1285
    nop

    .line 1288
    .line 1292
    :cond_3
    :goto_1
    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_0
        0x17 -> :sswitch_1
        0x18 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_4
        0x1e -> :sswitch_5
        0x3001 -> :sswitch_6
    .end sparse-switch
.end method
