.class Lo/cbu$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cet;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cbu;->by()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/cbu;


# direct methods
.method constructor <init>(Lo/cbu;)V
    .locals 0

    .line 4870
    iput-object p1, p0, Lo/cbu$3;->c:Lo/cbu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lo/cvv;)V
    .locals 4

    .line 4875
    if-eqz p1, :cond_0

    .line 4876
    iget-object v0, p0, Lo/cbu$3;->c:Lo/cbu;

    invoke-static {v0, p1}, Lo/cbu;->c(Lo/cbu;Lo/cvv;)V

    .line 4877
    const-string v0, "Track_SportManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runningPosture is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p1}, Lo/cvv;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 4879
    :cond_0
    const-string v0, "Track_SportManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runningPosture is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 4881
    :goto_0
    return-void
.end method
