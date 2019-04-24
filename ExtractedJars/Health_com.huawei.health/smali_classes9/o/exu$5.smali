.class Lo/exu$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/exu;->d(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/exu;

.field final synthetic c:Lo/egg;


# direct methods
.method constructor <init>(Lo/exu;Lo/egg;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lo/exu$5;->a:Lo/exu;

    iput-object p2, p0, Lo/exu$5;->c:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 4

    .line 167
    iget-object v0, p0, Lo/exu$5;->c:Lo/egg;

    invoke-interface {v0, p1, p2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 168
    const-string v0, "FitnessThirdPartyDataInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "requestGoogleFitSegentDatas  sucess !!! "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 169
    return-void
.end method
