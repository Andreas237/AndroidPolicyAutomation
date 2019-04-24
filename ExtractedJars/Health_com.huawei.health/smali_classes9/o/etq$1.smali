.class Lo/etq$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/etq;->b(Landroid/content/Intent;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/etq;


# direct methods
.method constructor <init>(Lo/etq;)V
    .locals 0

    .line 449
    iput-object p1, p0, Lo/etq$1;->c:Lo/etq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 452
    const-string v0, "DeviceStateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showAppStoreDialog():\u70b9\u51fb\u4e0d\u540c\u610f\u4e0b\u8f7d\u534e\u4e3a\u5e94\u7528\u5e02\u573aAPP!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 453
    iget-object v0, p0, Lo/etq$1;->c:Lo/etq;

    invoke-static {v0}, Lo/etq;->d(Lo/etq;)Lo/egv;

    move-result-object v0

    invoke-virtual {v0}, Lo/egv;->dismiss()V

    .line 455
    return-void
.end method
