.class Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$3;
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
.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;)V
    .locals 0

    .line 140
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$3;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 143
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity$3;->d:Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/ui/AchieveMedalNewActivity;->finish()V

    .line 144
    return-void
.end method
