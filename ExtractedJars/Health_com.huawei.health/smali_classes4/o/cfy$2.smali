.class Lo/cfy$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cfy;->d(Ljava/lang/String;Ljava/lang/String;ZIIZLo/cfy$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cfy;


# direct methods
.method constructor <init>(Lo/cfy;)V
    .locals 0

    .line 334
    iput-object p1, p0, Lo/cfy$2;->e:Lo/cfy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 2

    .line 338
    iget-object v0, p0, Lo/cfy$2;->e:Lo/cfy;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cfy;->e(Lo/cfy;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;)Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/CustomDialog;

    .line 339
    return-void
.end method
