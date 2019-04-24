.class Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->h()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V
    .locals 0

    .line 301
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 304
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->g(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Lo/dvr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v0, v0, 0xa

    add-int/lit8 v3, v0, 0x1

    .line 305
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->g(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Lo/dvr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    rem-int/lit8 v0, v0, 0xa

    if-nez v0, :cond_0

    .line 306
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->g(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Lo/dvr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    div-int/lit8 v3, v0, 0xa

    .line 309
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 310
    const-string v0, "page"

    add-int/lit8 v1, v3, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    const-string v0, "pageSize"

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    const/4 v5, 0x0

    .line 313
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->k(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Lo/dwr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 314
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->k(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Lo/dwr;

    move-result-object v0

    const/4 v1, 0x6

    invoke-virtual {v0, v1, v4}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v5

    .line 316
    :cond_1
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 317
    move-object v6, v5

    check-cast v6, Lo/dvr;

    .line 318
    invoke-virtual {v6}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 319
    invoke-virtual {v6}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v1, 0xa

    if-ge v0, v1, :cond_2

    .line 321
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;Z)Z

    .line 323
    :cond_2
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->g(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)Lo/dvr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v6}, Lo/dvr;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 325
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    const/16 v1, 0x44e

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->c(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;ILjava/lang/Object;)V

    .line 327
    :cond_3
    goto :goto_0

    .line 328
    :cond_4
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$5;->e:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    const/16 v1, 0x44f

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->c(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;ILjava/lang/Object;)V

    .line 330
    :goto_0
    return-void
.end method
