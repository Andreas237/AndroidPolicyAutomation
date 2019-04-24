.class Lo/epf$15$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epf$15;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/epf$15;


# direct methods
.method constructor <init>(Lo/epf$15;)V
    .locals 0

    .line 674
    iput-object p1, p0, Lo/epf$15$2;->c:Lo/epf$15;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 677
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ACTION_DEVICE_LIST_DELETE refreshDeviceStatus"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 678
    iget-object v0, p0, Lo/epf$15$2;->c:Lo/epf$15;

    iget-object v0, v0, Lo/epf$15;->e:Lo/epf;

    invoke-virtual {v0}, Lo/epf;->c()V

    .line 679
    return-void
.end method
