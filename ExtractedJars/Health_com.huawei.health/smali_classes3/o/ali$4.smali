.class Lo/ali$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ali;->b(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Landroid/content/Context;

.field final synthetic d:Lo/ali;


# direct methods
.method constructor <init>(Lo/ali;Landroid/content/Context;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lo/ali$4;->d:Lo/ali;

    iput-object p2, p0, Lo/ali$4;->b:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 3

    .line 127
    new-instance v2, Landroid/content/Intent;

    const-string v0, "com.huawei.hihealth.action_data_refresh"

    invoke-direct {v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 128
    const-string v0, "refresh_type"

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 129
    iget-object v0, p0, Lo/ali$4;->b:Landroid/content/Context;

    const-string v1, "com.huawei.hihealth.DEFAULT_PERMISSION"

    invoke-virtual {v0, v2, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 130
    iget-object v0, p0, Lo/ali$4;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/cnt;->k(Landroid/content/Context;)V

    .line 131
    return-void
.end method
