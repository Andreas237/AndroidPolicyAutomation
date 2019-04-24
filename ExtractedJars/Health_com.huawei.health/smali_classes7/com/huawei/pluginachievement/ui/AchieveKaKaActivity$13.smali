.class Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->e(ILo/dwk;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dwk;

.field final synthetic e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Lo/dwk;)V
    .locals 0

    .line 575
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    iput-object p2, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;->b:Lo/dwk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 578
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    iget-object v1, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;->b:Lo/dwk;

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Lo/dwk;)V

    .line 579
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->o(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;)V

    .line 580
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->a(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Z)Z

    .line 581
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity$13;->e:Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;->c(Lcom/huawei/pluginachievement/ui/AchieveKaKaActivity;Z)Z

    .line 582
    return-void
.end method
