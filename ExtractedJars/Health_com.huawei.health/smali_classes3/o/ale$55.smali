.class Lo/ale$55;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ale;->aQ()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/ale;

.field final synthetic c:I


# direct methods
.method constructor <init>(Lo/ale;I)V
    .locals 0

    .line 3833
    iput-object p1, p0, Lo/ale$55;->b:Lo/ale;

    iput p2, p0, Lo/ale$55;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 3837
    iget v0, p0, Lo/ale$55;->c:I

    invoke-static {v0}, Lo/dda;->d(I)Ljava/lang/String;

    move-result-object v4

    .line 3838
    invoke-static {}, Lo/eaw;->d()Lo/eaw;

    move-result-object v0

    invoke-virtual {v0, v4}, Lo/eaw;->c(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v5

    .line 3839
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3841
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device has downloaded!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3842
    return-void

    .line 3844
    :cond_0
    const-string v0, "Login_MainInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "current device has not downloaded!!!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3845
    iget-object v0, p0, Lo/ale$55;->b:Lo/ale;

    iget v1, p0, Lo/ale$55;->c:I

    invoke-virtual {v0, v1}, Lo/ale;->c(I)V

    .line 3847
    return-void
.end method
