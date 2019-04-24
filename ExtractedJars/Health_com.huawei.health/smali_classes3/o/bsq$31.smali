.class Lo/bsq$31;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsq;->e(Ljava/lang/String;Ljava/lang/String;Lo/bui;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lo/bui;

.field final synthetic c:Lo/bsq;


# direct methods
.method constructor <init>(Lo/bsq;Lo/bui;Ljava/lang/String;)V
    .locals 0

    .line 3323
    iput-object p1, p0, Lo/bsq$31;->c:Lo/bsq;

    iput-object p2, p0, Lo/bsq$31;->b:Lo/bui;

    iput-object p3, p0, Lo/bsq$31;->a:Ljava/lang/String;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 3332
    const-string v0, "DataImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadFitnessAudioXMl downloadFile success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3333
    iget-object v0, p0, Lo/bsq$31;->a:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bsm;->b(Ljava/lang/String;Z)V

    .line 3334
    iget-object v0, p0, Lo/bsq$31;->b:Lo/bui;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/bui;->d(Ljava/lang/Object;)V

    .line 3335
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 3326
    const-string v0, "DataImpl"

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downLoadFitnessAudioXMl downloadFile onFailure:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "errorCode="

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, "   errorInfo="

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x4

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3327
    iget-object v0, p0, Lo/bsq$31;->b:Lo/bui;

    invoke-virtual {v0, p1, p2}, Lo/bui;->b(ILjava/lang/String;)V

    .line 3328
    return-void
.end method
