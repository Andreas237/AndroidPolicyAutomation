.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->d(Ljava/lang/String;Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Ljava/lang/String;)V
    .locals 0

    .line 897
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$2;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 900
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dwo;->c(Landroid/content/Context;)Lo/dwo;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$2;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$2;->d:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v2}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->k(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dwo;->b(Ljava/lang/String;Landroid/content/Context;)V

    .line 901
    return-void
.end method
