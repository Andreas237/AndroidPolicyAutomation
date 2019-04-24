.class Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1$5;->c:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 86
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1$5;->c:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->a(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;)V

    .line 87
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1$5;->c:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;

    iget-object v0, v0, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity$1;->a:Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;->e(Lcom/huawei/pluginachievement/ui/kakatask/AchieveKaKaDetailActivity;Z)Z

    .line 88
    return-void
.end method
