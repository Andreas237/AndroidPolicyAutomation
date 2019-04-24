.class Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/efj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->e(Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;Landroid/graphics/Bitmap;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/InputStream;

.field final synthetic b:Ljava/io/InputStream;

.field final synthetic c:Landroid/graphics/Bitmap;

.field final synthetic d:Ljava/io/InputStream;

.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Landroid/graphics/Bitmap;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V
    .locals 0

    .line 504
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->c:Landroid/graphics/Bitmap;

    iput-object p3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->a:Ljava/io/InputStream;

    iput-object p4, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->b:Ljava/io/InputStream;

    iput-object p5, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->d:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/efj$d;)V
    .locals 4

    .line 508
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

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

    .line 509
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    new-instance v1, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;

    invoke-direct {v1, p0, p1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6$2;-><init>(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;Lo/efj$d;)V

    invoke-virtual {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 536
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->a:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->b:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->d:Ljava/io/InputStream;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 537
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 4

    .line 541
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->s(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 543
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->a:Ljava/io/InputStream;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->b:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog$6;->d:Ljava/io/InputStream;

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;->a(Lcom/huawei/pluginachievement/ui/AchieveMedalMessageDialog;Ljava/io/InputStream;Ljava/io/InputStream;Ljava/io/InputStream;)V

    .line 545
    const-string v0, "PLGACHIEVE_AchieveMedalMessageDialog"

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

    .line 546
    return-void
.end method
