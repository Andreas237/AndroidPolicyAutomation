.class Lo/ale$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->Z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale;

.field final synthetic d:Lo/dcu;


# direct methods
.method constructor <init>(Lo/ale;Lo/dcu;)V
    .locals 0

    .line 1111
    iput-object p1, p0, Lo/ale$15;->b:Lo/ale;

    iput-object p2, p0, Lo/ale$15;->d:Lo/dcu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1114
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "accountmigrate: checkLastException copyByHuid"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1115
    iget-object v0, p0, Lo/ale$15;->b:Lo/ale;

    iget-object v1, p0, Lo/ale$15;->d:Lo/dcu;

    invoke-virtual {v1}, Lo/dcu;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/ale;->a(Lo/ale;Ljava/lang/String;)V

    .line 1116
    return-void
.end method
