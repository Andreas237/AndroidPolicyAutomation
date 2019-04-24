.class Lo/cvz$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cms;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->b(Lo/duh;Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/duh;

.field final synthetic c:Lo/cvz;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lo/cvz$2;->c:Lo/cvz;

    iput-object p2, p0, Lo/cvz$2;->b:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 2

    .line 240
    iget-object v0, p0, Lo/cvz$2;->c:Lo/cvz;

    iget-object v1, p0, Lo/cvz$2;->b:Lo/duh;

    invoke-static {v0, v1}, Lo/cvz;->c(Lo/cvz;Lo/duh;)V

    .line 241
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 4

    .line 251
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flush data from stepMoudle to account studio onServiceException!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 252
    iget-object v0, p0, Lo/cvz$2;->c:Lo/cvz;

    iget-object v1, p0, Lo/cvz$2;->b:Lo/duh;

    invoke-static {v0, v1}, Lo/cvz;->c(Lo/cvz;Lo/duh;)V

    .line 253
    return-void
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 4

    .line 245
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "flush data from stepMoudle to account studio is failed!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    iget-object v0, p0, Lo/cvz$2;->c:Lo/cvz;

    iget-object v1, p0, Lo/cvz$2;->b:Lo/duh;

    invoke-static {v0, v1}, Lo/cvz;->c(Lo/cvz;Lo/duh;)V

    .line 247
    return-void
.end method
