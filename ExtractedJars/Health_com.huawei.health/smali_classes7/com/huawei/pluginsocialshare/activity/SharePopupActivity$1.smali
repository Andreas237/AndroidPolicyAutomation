.class Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$1;
.super Lo/dbs;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->b()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;)V
    .locals 0

    .line 460
    iput-object p1, p0, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity$1;->c:Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;

    invoke-direct {p0}, Lo/dbs;-><init>()V

    return-void
.end method


# virtual methods
.method public onDenied(Ljava/lang/String;)V
    .locals 4

    .line 468
    invoke-static {}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onDenied()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 469
    return-void
.end method

.method public onGranted()V
    .locals 4

    .line 463
    invoke-static {}, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;->a()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onGranted()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 464
    return-void
.end method
