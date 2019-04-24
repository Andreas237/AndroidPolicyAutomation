.class Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 132
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$5;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 135
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 136
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$5;->e:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V

    .line 138
    :cond_0
    return-void
.end method
