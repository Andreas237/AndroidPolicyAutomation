.class Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 155
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->e(Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 156
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.intent.action.DIAL"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "tel:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->e(Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 157
    const/high16 v0, 0x10000000

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 158
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;

    invoke-virtual {v0, v3}, Lcom/huawei/ui/main/stories/me/activity/HealthAboutActivity;->startActivity(Landroid/content/Intent;)V

    .line 160
    :cond_0
    return-void
.end method
