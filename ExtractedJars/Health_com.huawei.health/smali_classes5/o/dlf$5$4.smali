.class Lo/dlf$5$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlf$5;->onChange(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dlf$5;


# direct methods
.method constructor <init>(Lo/dlf$5;)V
    .locals 0

    .line 493
    iput-object p1, p0, Lo/dlf$5$4;->c:Lo/dlf$5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 496
    iget-object v0, p0, Lo/dlf$5$4;->c:Lo/dlf$5;

    iget-object v0, v0, Lo/dlf$5;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->t(Lo/dlf;)Lo/dll;

    move-result-object v0

    invoke-virtual {v0}, Lo/dll;->a()V

    .line 497
    iget-object v0, p0, Lo/dlf$5$4;->c:Lo/dlf$5;

    iget-object v0, v0, Lo/dlf$5;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->g(Lo/dlf;)Lo/dlt;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlt;->k()V

    .line 498
    iget-object v0, p0, Lo/dlf$5$4;->c:Lo/dlf$5;

    iget-object v0, v0, Lo/dlf$5;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlz;->d()V

    .line 499
    iget-object v0, p0, Lo/dlf$5$4;->c:Lo/dlf$5;

    iget-object v0, v0, Lo/dlf$5;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    invoke-virtual {v0}, Lo/dlz;->b()V

    .line 500
    iget-object v0, p0, Lo/dlf$5$4;->c:Lo/dlf$5;

    iget-object v0, v0, Lo/dlf$5;->d:Lo/dlf;

    invoke-static {v0}, Lo/dlf;->d(Lo/dlf;)Lo/dlz;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lo/dlz;->c(Z)V

    .line 501
    return-void
.end method
