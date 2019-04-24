.class Lo/emd$5;
.super Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/emd;->onAttachedToWindow()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/emd;


# direct methods
.method constructor <init>(Lo/emd;Landroid/content/Context;)V
    .locals 0

    .line 83
    iput-object p1, p0, Lo/emd$5;->d:Lo/emd;

    invoke-direct {p0, p2}, Lcom/huawei/ui/commonui/utils/StatusbarClickedListener;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 86
    iget-object v0, p0, Lo/emd$5;->d:Lo/emd;

    invoke-static {v0}, Lo/emd;->a(Lo/emd;)Lo/emd;

    move-result-object v0

    invoke-virtual {v0}, Lo/emd;->b()V

    .line 87
    return-void
.end method
