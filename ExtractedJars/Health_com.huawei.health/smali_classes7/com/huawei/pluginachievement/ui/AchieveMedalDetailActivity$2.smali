.class Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V
    .locals 0

    .line 340
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 342
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 343
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity$2;->b:Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveMedalDetailActivity;)V

    .line 345
    :cond_0
    return-void
.end method
