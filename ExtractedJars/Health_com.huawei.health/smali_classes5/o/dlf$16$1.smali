.class Lo/dlf$16$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf$16;->onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dlf$16;


# direct methods
.method constructor <init>(Lo/dlf$16;)V
    .locals 0

    .line 432
    iput-object p1, p0, Lo/dlf$16$1;->a:Lo/dlf$16;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 435
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 437
    iget-object v0, p0, Lo/dlf$16$1;->a:Lo/dlf$16;

    iget-object v0, v0, Lo/dlf$16;->b:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    iget-object v1, p0, Lo/dlf$16$1;->a:Lo/dlf$16;

    iget-object v1, v1, Lo/dlf$16;->b:Lo/dlf;

    invoke-static {v1}, Lo/dlf;->b(Lo/dlf;)Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/dlf$16$1$3;

    invoke-direct {v2, p0}, Lo/dlf$16$1$3;-><init>(Lo/dlf$16$1;)V

    invoke-virtual {v0, v1, v2}, Lo/dlz;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 466
    :cond_0
    return-void
.end method
