.class Lo/brt$2$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cza;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/brt$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/brt$2;


# direct methods
.method constructor <init>(Lo/brt$2;)V
    .locals 0

    .line 263
    iput-object p1, p0, Lo/brt$2$3;->a:Lo/brt$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackFail(I)V
    .locals 4

    .line 279
    const-string v0, "PluginSuggestion"

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

    .line 280
    return-void
.end method

.method public onCallBackSuccess(Ljava/lang/String;)V
    .locals 4

    .line 266
    const-string v0, "PluginSuggestion"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCallBackSuccess url = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    invoke-static {p1}, Lo/bsl;->e(Ljava/lang/String;)V

    .line 268
    invoke-static {}, Lo/btj;->e()Lo/btj;

    move-result-object v0

    new-instance v1, Lo/brt$2$3$4;

    invoke-direct {v1, p0}, Lo/brt$2$3$4;-><init>(Lo/brt$2$3;)V

    invoke-virtual {v0, v1}, Lo/btj;->b(Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V

    .line 275
    return-void
.end method
