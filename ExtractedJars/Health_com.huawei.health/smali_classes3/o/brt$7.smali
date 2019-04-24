.class Lo/brt$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/brt;


# direct methods
.method constructor <init>(Lo/brt;)V
    .locals 0

    .line 1006
    iput-object p1, p0, Lo/brt$7;->d:Lo/brt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 1010
    invoke-static {}, Lo/bta;->d()Lo/bta;

    move-result-object v0

    invoke-virtual {v0}, Lo/bta;->a()V

    .line 1011
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->h()V

    .line 1013
    new-instance v2, Landroid/content/Intent;

    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/health/suggestion/data/DataDownloadService;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1014
    invoke-static {}, Lo/brx;->b()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 1016
    invoke-static {}, Lo/ahr;->d()Lo/ahr;

    move-result-object v0

    invoke-virtual {v0}, Lo/ahr;->a()V

    .line 1017
    return-void
.end method
