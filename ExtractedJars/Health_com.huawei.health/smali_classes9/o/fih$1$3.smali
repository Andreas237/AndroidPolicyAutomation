.class Lo/fih$1$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fih$1;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fih$1;


# direct methods
.method constructor <init>(Lo/fih$1;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lo/fih$1$3;->e:Lo/fih$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 102
    const-string v0, "SocialActRecyclerAdapte"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackFail ACTIVITY_KEY i = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 89
    const-string v0, "SocialActRecyclerAdapte"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "GRSManager onCallBackSuccess ACTIVITY_KEY url = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 91
    iget-object v0, p0, Lo/fih$1$3;->e:Lo/fih$1;

    iget-object v0, v0, Lo/fih$1;->d:Lo/fil;

    invoke-virtual {v0}, Lo/fil;->s()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fic;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 92
    iget-object v0, p0, Lo/fih$1$3;->e:Lo/fih$1;

    iget-object v0, v0, Lo/fih$1;->b:Lo/fih;

    iget-object v1, p0, Lo/fih$1$3;->e:Lo/fih$1;

    iget-object v1, v1, Lo/fih$1;->d:Lo/fil;

    invoke-virtual {v0, p1, v1}, Lo/fih;->d(Ljava/lang/String;Lo/fil;)V

    goto :goto_0

    .line 95
    :cond_0
    iget-object v0, p0, Lo/fih$1$3;->e:Lo/fih$1;

    iget-object v0, v0, Lo/fih$1;->b:Lo/fih;

    invoke-static {v0}, Lo/fih;->b(Lo/fih;)V

    .line 98
    :goto_0
    return-void
.end method
