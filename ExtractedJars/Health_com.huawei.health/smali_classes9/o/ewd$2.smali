.class Lo/ewd$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ewd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ewd;


# direct methods
.method constructor <init>(Lo/ewd;)V
    .locals 0

    .line 311
    iput-object p1, p0, Lo/ewd$2;->e:Lo/ewd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 314
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 315
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message is null!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 316
    :cond_0
    const v0, 0x186a0

    if-ne v0, p1, :cond_1

    .line 317
    invoke-static {}, Lo/aks;->e()Lo/aks;

    move-result-object v0

    iget-object v1, p0, Lo/ewd$2;->e:Lo/ewd;

    invoke-static {v1}, Lo/ewd;->d(Lo/ewd;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/aks;->s(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 318
    iget-object v0, p0, Lo/ewd$2;->e:Lo/ewd;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/ewd;->b(Lo/ewd;Z)V

    .line 319
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback is unRegisterNotificationPress"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 321
    :cond_1
    const-string v0, "PressureMeasureMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Message is not right!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 323
    :goto_0
    return-void
.end method
