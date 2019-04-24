.class Lo/agm$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agm;->g()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/agm;


# direct methods
.method constructor <init>(Lo/agm;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lo/agm$2;->c:Lo/agm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 199
    iget-object v0, p0, Lo/agm$2;->c:Lo/agm;

    invoke-static {v0}, Lo/agm;->f(Lo/agm;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 200
    iget-object v0, p0, Lo/agm$2;->c:Lo/agm;

    invoke-static {v0}, Lo/agm;->i(Lo/agm;)V

    .line 201
    iget-object v0, p0, Lo/agm$2;->c:Lo/agm;

    invoke-static {v0}, Lo/agm;->k(Lo/agm;)V

    goto :goto_0

    .line 203
    :cond_0
    iget-object v0, p0, Lo/agm$2;->c:Lo/agm;

    invoke-static {v0}, Lo/agm;->d(Lo/agm;)Landroid/app/Activity;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$string;->IDS_plugin_device_weight_device_not_connect:I

    invoke-static {v0, v1}, Lo/emv;->e(Landroid/content/Context;I)V

    .line 205
    :goto_0
    return-void
.end method
