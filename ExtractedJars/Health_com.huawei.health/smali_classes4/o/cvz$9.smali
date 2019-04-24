.class Lo/cvz$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/duh;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvz;->d(Landroid/content/Context;JJLo/duh;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cvz;

.field final synthetic e:Lo/duh;


# direct methods
.method constructor <init>(Lo/cvz;Lo/duh;)V
    .locals 0

    .line 1238
    iput-object p1, p0, Lo/cvz$9;->b:Lo/cvz;

    iput-object p2, p0, Lo/cvz$9;->e:Lo/duh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(ILjava/lang/Object;)V
    .locals 4

    .line 1241
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1242
    const-string v0, "PluginAchieveAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readBestStepMonthOfYear obj is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1243
    iget-object v0, p0, Lo/cvz$9;->e:Lo/duh;

    const/4 v1, -0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1244
    return-void

    .line 1246
    :cond_0
    iget-object v0, p0, Lo/cvz$9;->e:Lo/duh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 1247
    iget-object v0, p0, Lo/cvz$9;->e:Lo/duh;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lo/duh;->e(ILjava/lang/Object;)V

    .line 1249
    :cond_1
    return-void
.end method
