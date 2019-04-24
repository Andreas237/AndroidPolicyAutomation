.class Lo/cgd$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cfy$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgd;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cgd;


# direct methods
.method constructor <init>(Lo/cgd;)V
    .locals 0

    .line 216
    iput-object p1, p0, Lo/cgd$3;->e:Lo/cgd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/cfy$a;Ljava/lang/Object;)V
    .locals 5

    .line 220
    sget-object v0, Lo/cfy$a;->b:Lo/cfy$a;

    invoke-virtual {p1, v0}, Lo/cfy$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 222
    invoke-static {}, Lo/cgd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNetworkOpenDlg() onDialogButtonClick Yes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    new-instance v4, Landroid/content/Intent;

    const-string v0, "android.settings.SETTINGS"

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 224
    iget-object v0, p0, Lo/cgd$3;->e:Lo/cgd;

    invoke-static {v0}, Lo/cgd;->c(Lo/cgd;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 226
    :cond_0
    return-void
.end method
