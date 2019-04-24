.class Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/efj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/InputStream;

.field final synthetic b:Landroid/graphics/Bitmap;

.field final synthetic c:Ljava/io/InputStream;

.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

.field final synthetic e:Ljava/io/InputStream;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Landroid/graphics/Bitmap;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V
    .locals 0

    .line 451
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->b:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->a:Ljava/io/InputStream;

    iput-object p4, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->c:Ljava/io/InputStream;

    iput-object p5, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->e:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/efj$d;)V
    .locals 4

    .line 455
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onLoadOK result="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1}, Lo/efj$d;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8$1;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;Lo/efj$d;)V

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 483
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->a:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->c:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->e:Ljava/io/InputStream;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 484
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    .line 488
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->n(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 489
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->a:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->c:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$8;->e:Ljava/io/InputStream;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->e(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 491
    const-string v0, "PLGACHIEVE_AchieveMedalDetailActivity"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, " onLoadFailed msg="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    return-void
.end method
