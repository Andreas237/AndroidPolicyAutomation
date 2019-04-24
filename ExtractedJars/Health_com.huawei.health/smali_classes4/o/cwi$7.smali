.class Lo/cwi$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cwi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/cwi;


# direct methods
.method constructor <init>(Lo/cwi;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/cwi$7;->a:Lo/cwi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 247
    iget-object v0, p0, Lo/cwi$7;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->c(Lo/cwi;)Lo/bru;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 249
    const-string v0, "PluginSuggestionAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCancleClickCallback called onSummary(null)"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 250
    iget-object v0, p0, Lo/cwi$7;->a:Lo/cwi;

    invoke-static {v0}, Lo/cwi;->c(Lo/cwi;)Lo/bru;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lo/bru;->a(Lcom/huawei/health/suggestion/model/Summary;)V

    .line 252
    :cond_0
    return-void
.end method
