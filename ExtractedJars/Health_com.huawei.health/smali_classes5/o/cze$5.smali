.class Lo/cze$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/zk;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cze;->d(Ljava/lang/String;Lo/cza;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cza;

.field final synthetic d:Lo/cze;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cze;Ljava/lang/String;Lo/cza;)V
    .locals 0

    .line 102
    iput-object p1, p0, Lo/cze$5;->d:Lo/cze;

    iput-object p2, p0, Lo/cze$5;->e:Ljava/lang/String;

    iput-object p3, p0, Lo/cze$5;->b:Lo/cza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 111
    iget-object v0, p0, Lo/cze$5;->b:Lo/cza;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/cze$5;->b:Lo/cza;

    invoke-interface {v0, p1}, Lo/cza;->onCallBackFail(I)V

    .line 112
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 4

    .line 105
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "GRSManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getUrl error, key is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cze$5;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 106
    :cond_0
    iget-object v0, p0, Lo/cze$5;->b:Lo/cza;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lo/cze$5;->b:Lo/cza;

    invoke-interface {v0, p1}, Lo/cza;->onCallBackSuccess(Ljava/lang/String;)V

    .line 107
    :cond_1
    return-void
.end method
