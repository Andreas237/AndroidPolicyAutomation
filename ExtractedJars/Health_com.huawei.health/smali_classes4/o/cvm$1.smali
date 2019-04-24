.class Lo/cvm$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cvm;->e(Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cvm;

.field final synthetic b:Lo/cvm$b;

.field final synthetic c:Lo/cvn;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cvm;Lo/cvn;Ljava/lang/String;Ljava/lang/String;Lo/cvm$b;)V
    .locals 0

    iput-object p1, p0, Lo/cvm$1;->a:Lo/cvm;

    iput-object p2, p0, Lo/cvm$1;->c:Lo/cvn;

    iput-object p3, p0, Lo/cvm$1;->e:Ljava/lang/String;

    iput-object p4, p0, Lo/cvm$1;->d:Ljava/lang/String;

    iput-object p5, p0, Lo/cvm$1;->b:Lo/cvm$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lo/cvm$1;->c:Lo/cvn;

    iget-object v1, p0, Lo/cvm$1;->e:Ljava/lang/String;

    iget-object v2, p0, Lo/cvm$1;->d:Ljava/lang/String;

    new-instance v3, Lo/cvm$1$5;

    invoke-direct {v3, p0}, Lo/cvm$1$5;-><init>(Lo/cvm$1;)V

    const/4 v4, 0x2

    invoke-interface {v0, v1, v2, v3, v4}, Lo/cvn;->d(Ljava/lang/String;Ljava/lang/String;Lo/cvk;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v5

    const-string v0, "HsfPackageInstaller"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "installPackage "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lo/cvm$1;->a:Lo/cvm;

    iget-object v1, p0, Lo/cvm$1;->b:Lo/cvm$b;

    invoke-static {v0, v1}, Lo/cvm;->b(Lo/cvm;Lo/cvm$b;)V

    :goto_0
    return-void
.end method
