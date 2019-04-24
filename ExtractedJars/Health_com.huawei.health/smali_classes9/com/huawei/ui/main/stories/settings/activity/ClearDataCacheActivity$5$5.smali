.class Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->a(Ljava/lang/Boolean;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->d:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->a(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)Landroid/widget/TextView;

    move-result-object v0

    const-string v1, "0B"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 314
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->d:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    const-string v1, "0B"

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;Ljava/lang/String;)Ljava/lang/String;

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->d:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    sget-object v1, Lo/dae;->er:Lo/dae;

    invoke-virtual {v1}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "0"

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->b(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    iget-object v0, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->d:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5$5;->e:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;

    iget-object v1, v1, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity$5;->d:Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;->e(Lcom/huawei/ui/main/stories/settings/activity/ClearDataCacheActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_clear_cache_complish:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/emv;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 317
    return-void
.end method
