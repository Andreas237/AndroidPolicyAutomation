.class Lo/bsb$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bsb;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/bsr;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/bsb;

.field final synthetic b:Lo/bsr;

.field final synthetic d:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lo/bsb;Lorg/json/JSONObject;Lo/bsr;)V
    .locals 0

    .line 1035
    iput-object p1, p0, Lo/bsb$6;->a:Lo/bsb;

    iput-object p2, p0, Lo/bsb$6;->d:Lorg/json/JSONObject;

    iput-object p3, p0, Lo/bsb$6;->b:Lo/bsr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 1045
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCallBackFail i = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1046
    iget-object v0, p0, Lo/bsb$6;->b:Lo/bsr;

    const/4 v1, -0x5

    invoke-static {v1}, Lo/bsi;->c(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, -0x5

    invoke-virtual {v0, v2, v1}, Lo/bsr;->d(ILjava/lang/String;)V

    .line 1047
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 1038
    const-string v0, "Suggestion_CloudImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCallBackSuccess url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1039
    invoke-static {p1}, Lo/bsl;->e(Ljava/lang/String;)V

    .line 1040
    invoke-static {}, Lo/bsl;->o()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lo/bsb$6;->d:Lorg/json/JSONObject;

    iget-object v2, p0, Lo/bsb$6;->b:Lo/bsr;

    invoke-static {v0, v1, v2}, Lo/bsa;->a(Ljava/lang/String;Lorg/json/JSONObject;Lo/bsr;)V

    .line 1041
    return-void
.end method
