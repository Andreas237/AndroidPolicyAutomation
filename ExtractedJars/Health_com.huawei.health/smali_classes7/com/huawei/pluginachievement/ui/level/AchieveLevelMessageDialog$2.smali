.class Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;)V
    .locals 0

    .line 147
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog$2;->d:Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 1

    .line 152
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog$2;->d:Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;->a(Lcom/huawei/pluginachievement/ui/level/AchieveLevelMessageDialog;)V

    .line 153
    return-void
.end method

.method public onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 156
    return-void
.end method

.method public onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 0

    .line 149
    return-void
.end method
