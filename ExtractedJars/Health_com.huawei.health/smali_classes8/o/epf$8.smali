.class Lo/epf$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/epf;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/epf;


# direct methods
.method constructor <init>(Lo/epf;)V
    .locals 0

    .line 1837
    iput-object p1, p0, Lo/epf$8;->d:Lo/epf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 7

    .line 1839
    const-string v0, "UIHLH_AchievementCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updatelayout updateLayoutIsShow err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ; objData = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const/4 v3, 0x0

    if-ne v3, p2, :cond_0

    const-string v3, "null"

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1840
    const/4 v4, 0x0

    .line 1841
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 1842
    move-object v5, p2

    check-cast v5, Ljava/lang/String;

    .line 1843
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const-string v0, "2"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1844
    const/4 v4, 0x0

    goto :goto_1

    .line 1846
    :cond_1
    const/4 v4, 0x1

    .line 1849
    :cond_2
    :goto_1
    if-nez v4, :cond_3

    .line 1850
    iget-object v0, p0, Lo/epf$8;->d:Lo/epf;

    invoke-static {v0}, Lo/epf;->a(Lo/epf;)Landroid/os/Handler;

    move-result-object v5

    .line 1851
    const/4 v0, 0x0

    if-eq v0, v5, :cond_3

    .line 1852
    invoke-virtual {v5}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v6

    .line 1853
    const/16 v0, 0x8

    iput v0, v6, Landroid/os/Message;->what:I

    .line 1854
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1857
    :cond_3
    return-void
.end method
