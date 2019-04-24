.class final Lo/aor$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/aor;->c(Landroid/content/Context;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Context;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 335
    iput-object p1, p0, Lo/aor$3;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 340
    new-instance v2, Lo/bca;

    invoke-direct {v2}, Lo/bca;-><init>()V

    .line 341
    invoke-virtual {v2}, Lo/bca;->d()Z

    move-result v0

    if-nez v0, :cond_0

    .line 345
    invoke-virtual {v2}, Lo/bca;->c()V

    .line 346
    const-string v0, "AccountLoginManager"

    const-string v1, "offline info exist, don\'t logout im."

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 350
    :cond_0
    invoke-static {}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->c()Lcom/huawei/health/sns/server/im/SNSIMCenter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/health/sns/server/im/SNSIMCenter;->g()V

    .line 353
    :goto_0
    invoke-static {}, Lo/aor;->d()Lo/aor;

    move-result-object v0

    iget-object v1, p0, Lo/aor$3;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lo/aor;->e(Landroid/content/Context;)V

    .line 354
    return-void
.end method
