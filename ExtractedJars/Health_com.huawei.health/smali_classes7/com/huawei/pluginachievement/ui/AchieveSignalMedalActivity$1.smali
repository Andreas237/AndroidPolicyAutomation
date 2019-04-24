.class Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V
    .locals 0

    .line 217
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$1;->e:Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 220
    invoke-static {}, Lo/czu;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 221
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$1;->e:Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$1;->e:Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;

    invoke-static {v1}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->b(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const-string v3, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->e(Landroid/content/Context;[Ljava/lang/String;)V

    goto :goto_0

    .line 223
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity$1;->e:Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveSignalMedalActivity;)V

    .line 225
    :goto_0
    return-void
.end method
