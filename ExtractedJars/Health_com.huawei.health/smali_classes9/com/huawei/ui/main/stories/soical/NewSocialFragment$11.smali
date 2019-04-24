.class Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/soical/NewSocialFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V
    .locals 0

    .line 1273
    iput-object p1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 1276
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1277
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_1

    .line 1279
    :sswitch_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    if-eqz v0, :cond_0

    .line 1280
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Ljava/util/List;)V

    .line 1282
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->notifyDataSetChanged()V

    .line 1283
    goto/16 :goto_1

    .line 1285
    :sswitch_1
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lo/fid$d;

    .line 1286
    const/4 v0, 0x0

    if-eq v0, v4, :cond_3

    .line 1287
    iget-object v5, v4, Lo/fid$d;->c:Landroid/widget/ImageView;

    .line 1288
    iget-object v6, v4, Lo/fid$d;->e:Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 1289
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0, v5, v6}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Landroid/widget/ImageView;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 1290
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->notifyDataSetChanged()V

    .line 1291
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->c:Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$e;->getCount()I

    move-result v0

    const/4 v1, 0x4

    if-le v0, v1, :cond_1

    .line 1292
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->r(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/support/v4/view/ViewPager;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 1295
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->o(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    .line 1296
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->B(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    .line 1297
    goto/16 :goto_1

    .line 1302
    :sswitch_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1303
    goto/16 :goto_1

    .line 1306
    :sswitch_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->b:Lorg/json/JSONArray;

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Lorg/json/JSONArray;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->j(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1307
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Z)Z

    .line 1308
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "To display the red dot!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1310
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 1312
    :cond_2
    const-string v0, "UIDV_SocialFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not display the red dot!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->D(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1317
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->A(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    .line 1318
    goto :goto_1

    .line 1320
    :sswitch_4
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    move-object v5, v0

    check-cast v5, [Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 1321
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    const/4 v1, 0x0

    aget-object v1, v5, v1

    const/4 v2, 0x1

    aget-object v2, v5, v2

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->a(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    .line 1322
    goto :goto_1

    .line 1324
    :sswitch_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->C(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    .line 1325
    goto :goto_1

    .line 1327
    :sswitch_6
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->F(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;)V

    .line 1328
    goto :goto_1

    .line 1330
    :sswitch_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/soical/NewSocialFragment$11;->a:Lcom/huawei/ui/main/stories/soical/NewSocialFragment;

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/soical/NewSocialFragment;->d(Lcom/huawei/ui/main/stories/soical/NewSocialFragment;I)V

    .line 1331
    .line 1335
    :cond_3
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_0
        0x17 -> :sswitch_1
        0x18 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1b -> :sswitch_4
        0x1c -> :sswitch_7
        0x1e -> :sswitch_5
        0x3001 -> :sswitch_6
    .end sparse-switch
.end method
