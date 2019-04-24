.class Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    .line 206
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 207
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->h(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/dwr;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1, v3}, Lo/dwr;->c(ILjava/util/Map;)Ljava/util/List;

    move-result-object v4

    .line 208
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->h(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/dwr;

    move-result-object v0

    const/16 v1, 0xe

    invoke-virtual {v0, v1, v3}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v5

    .line 209
    new-instance v6, Lo/dze;

    invoke-direct {v6, v4, v5}, Lo/dze;-><init>(Ljava/util/List;Lo/dvf;)V

    .line 210
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    if-eqz v5, :cond_0

    .line 211
    const-string v0, "PLGACHIEVE_AchieveLevelMainActivity"

    const-string v1, "Get user level is not null"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 212
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    const/16 v1, 0xd

    invoke-static {v0, v1, v6}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;ILjava/lang/Object;)V

    goto :goto_0

    .line 214
    :cond_0
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    .line 215
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->h(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)Lo/dwr;

    move-result-object v0

    const/4 v1, 0x5

    invoke-virtual {v0, v1, v7}, Lo/dwr;->a(ILjava/util/Map;)Lo/dvf;

    move-result-object v8

    .line 216
    if-eqz v8, :cond_1

    .line 217
    move-object v9, v8

    check-cast v9, Lo/dvh;

    .line 218
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-virtual {v9}, Lo/dvh;->a()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;ILjava/lang/Object;)V

    .line 219
    goto :goto_0

    .line 221
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;ILjava/lang/Object;)V

    .line 224
    :goto_0
    return-void
.end method
