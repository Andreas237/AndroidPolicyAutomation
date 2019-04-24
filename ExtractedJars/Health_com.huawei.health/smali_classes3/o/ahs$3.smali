.class Lo/ahs$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ahs;->d(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Landroid/os/Bundle;

.field final synthetic e:Lo/ahs;


# direct methods
.method constructor <init>(Lo/ahs;Landroid/os/Bundle;Landroid/app/Activity;)V
    .locals 0

    .line 223
    iput-object p1, p0, Lo/ahs$3;->e:Lo/ahs;

    iput-object p2, p0, Lo/ahs$3;->c:Landroid/os/Bundle;

    iput-object p3, p0, Lo/ahs$3;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .line 226
    iget-object v0, p0, Lo/ahs$3;->e:Lo/ahs;

    iget-object v1, p0, Lo/ahs$3;->c:Landroid/os/Bundle;

    const-string v2, "devId"

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/ahs;->c(Ljava/lang/String;Z)V

    .line 227
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/ahs$3;->b:Landroid/app/Activity;

    const-class v1, Lcom/huawei/health/device/ui/DeviceMainActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 228
    iget-object v0, p0, Lo/ahs$3;->c:Landroid/os/Bundle;

    const-string v1, "view"

    const-string v2, "WifiVersionDetails"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    iget-object v0, p0, Lo/ahs$3;->c:Landroid/os/Bundle;

    invoke-virtual {v3, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 230
    iget-object v0, p0, Lo/ahs$3;->b:Landroid/app/Activity;

    invoke-virtual {v0, v3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 231
    invoke-interface {p1}, Landroid/content/DialogInterface;->cancel()V

    .line 232
    return-void
.end method
