.class Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;)V
    .locals 0

    .line 179
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity$4;->b:Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;

    invoke-virtual {v0}, Lcom/huawei/pluginachievement/ui/AchieveLevelMainActivity;->finish()V

    .line 183
    return-void
.end method
