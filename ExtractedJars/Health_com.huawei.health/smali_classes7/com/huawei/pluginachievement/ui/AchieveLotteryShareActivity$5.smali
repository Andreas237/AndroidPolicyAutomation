.class Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/squareup/picasso/Callback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)V
    .locals 0

    .line 139
    iput-object p1, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$5;->c:Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError()V
    .locals 2

    .line 147
    const-string v0, "PLGACHIEVE_AchieveLotteryShareActivity"

    const-string v1, "Fail to load ImageAward! "

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    return-void
.end method

.method public onSuccess()V
    .locals 1

    .line 142
    iget-object v0, p0, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity$5;->c:Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;->d(Lcom/huawei/pluginachievement/ui/AchieveLotteryShareActivity;)V

    .line 143
    return-void
.end method
