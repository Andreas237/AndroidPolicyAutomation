.class Lo/ezm$d$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ezm$d;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ezm$d;


# direct methods
.method constructor <init>(Lo/ezm$d;)V
    .locals 0

    .line 430
    iput-object p1, p0, Lo/ezm$d$3;->b:Lo/ezm$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 433
    new-instance v2, Landroid/content/Intent;

    iget-object v0, p0, Lo/ezm$d$3;->b:Lo/ezm$d;

    invoke-virtual {v0}, Lo/ezm$d;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/fitness/activity/heartrate/WarningHRActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 434
    const-string v0, "com.huawei.health"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 435
    iget-object v0, p0, Lo/ezm$d$3;->b:Lo/ezm$d;

    invoke-virtual {v0}, Lo/ezm$d;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 436
    return-void
.end method
