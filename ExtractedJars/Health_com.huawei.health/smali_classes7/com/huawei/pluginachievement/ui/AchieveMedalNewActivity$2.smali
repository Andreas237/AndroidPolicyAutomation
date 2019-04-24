.class Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 294
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 16

    .line 297
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/dwr;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/dwr;

    move-result-object v1

    invoke-virtual {v1}, Lo/dwr;->h()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Lo/dwr;->d(ILjava/util/Map;)V

    .line 298
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 300
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/dwr;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 301
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Lo/dwr;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v5

    .line 302
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 303
    :cond_0
    return-void

    .line 305
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 306
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 307
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 308
    new-instance v9, Ljava/util/HashMap;

    invoke-direct {v9}, Ljava/util/HashMap;-><init>()V

    .line 309
    const/4 v10, 0x0

    :goto_0
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v0

    if-ge v10, v0, :cond_4

    .line 310
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lo/dvf;

    .line 311
    instance-of v0, v11, Lo/dvy;

    if-eqz v0, :cond_3

    .line 312
    move-object v12, v11

    check-cast v12, Lo/dvy;

    .line 313
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    invoke-virtual {v12}, Lo/dvy;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 314
    invoke-interface {v6, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 315
    invoke-virtual {v12}, Lo/dvy;->g()I

    move-result v0

    if-lez v0, :cond_2

    .line 316
    invoke-virtual {v12}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 317
    const-wide/16 v13, 0x0

    .line 319
    :try_start_0
    invoke-virtual {v12}, Lo/dvy;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-wide v0

    move-wide v13, v0

    .line 322
    goto :goto_1

    .line 320
    :catch_0
    move-exception v15

    .line 321
    const-string v0, "PLGACHIEVE_AchieveMedalNewActivity"

    const-string v1, "getData() NumberFormatException"

    invoke-static {v0, v1}, Lo/dzu;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 323
    :goto_1
    invoke-virtual {v12}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v9, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 324
    goto :goto_2

    .line 325
    :cond_2
    invoke-virtual {v12}, Lo/dvy;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 309
    :cond_3
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    .line 329
    :cond_4
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 330
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 331
    const/4 v12, 0x0

    :goto_3
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v12, v0, :cond_6

    .line 332
    invoke-interface {v5, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lo/dvf;

    .line 333
    instance-of v0, v13, Lo/dvu;

    if-eqz v0, :cond_5

    .line 334
    move-object v14, v13

    check-cast v14, Lo/dvu;

    .line 336
    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 337
    invoke-virtual {v14}, Lo/dvu;->D()Ljava/lang/String;

    move-result-object v15

    .line 338
    const/4 v0, 0x0

    if-eq v0, v15, :cond_5

    invoke-virtual {v15}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_5

    .line 339
    invoke-virtual {v14}, Lo/dvu;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v11, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 331
    :cond_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_3

    .line 343
    :cond_6
    invoke-static {v7, v9}, Lo/dyh;->a(Ljava/util/ArrayList;Ljava/util/Map;)Ljava/util/ArrayList;

    move-result-object v7

    .line 344
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v7}, Lo/dxj;->c(Landroid/content/Context;Ljava/util/ArrayList;)V

    .line 345
    invoke-static {v8, v11, v6}, Lo/dyh;->c(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v8

    .line 346
    invoke-static {v6}, Lo/dyh;->b(Ljava/util/List;)Lo/dza;

    move-result-object v12

    .line 347
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_have_gained_medals:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v2, v6, v7, v10}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->f(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Ljava/util/Map;

    move-result-object v0

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->g(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/pluginachievement/R$string;->IDS_plugin_achievement_tab_not_gained_medals:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v2, v6, v8, v10}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Ljava/util/List;Ljava/util/ArrayList;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 349
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$2;->c:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0, v12, v6, v10}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;Lo/dza;Ljava/util/List;Ljava/util/List;)V

    .line 351
    return-void
.end method
