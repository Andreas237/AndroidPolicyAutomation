.class Lo/ale$24;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->b(Ljava/lang/String;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Lo/ale;


# direct methods
.method constructor <init>(Lo/ale;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1650
    iput-object p1, p0, Lo/ale$24;->e:Lo/ale;

    iput-object p2, p0, Lo/ale$24;->d:Ljava/lang/String;

    iput-object p3, p0, Lo/ale$24;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 1653
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: copyAToBByHiDATA onResult errorCode = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1654
    iget-object v0, p0, Lo/ale$24;->e:Lo/ale;

    iget-object v1, p0, Lo/ale$24;->d:Ljava/lang/String;

    iget-object v2, p0, Lo/ale$24;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2, p1}, Lo/ale;->e(Lo/ale;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1655
    return-void
.end method
