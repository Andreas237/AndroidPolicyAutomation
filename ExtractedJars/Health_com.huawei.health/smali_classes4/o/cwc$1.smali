.class Lo/cwc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/exercise/modle/ITreadmillStyleCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cwc;->c(Lo/ccq;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cwc;


# direct methods
.method constructor <init>(Lo/cwc;)V
    .locals 0

    .line 1414
    iput-object p1, p0, Lo/cwc$1;->e:Lo/cwc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTreadmillStyleChange(IJ)V
    .locals 4

    .line 1417
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFreeIndoorRunninngStyle onTreadmillStyleChange mTreadmillManager is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1418
    iget-object v0, p0, Lo/cwc$1;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->p(Lo/cwc;)Lo/ccq;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1419
    iget-object v0, p0, Lo/cwc$1;->e:Lo/cwc;

    invoke-static {v0}, Lo/cwc;->p(Lo/cwc;)Lo/ccq;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lo/ccq;->e(IJ)V

    goto :goto_0

    .line 1421
    :cond_0
    const-string v0, "Track_PluginHealthTrackAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerFreeIndoorRunninngStyle mTreadmillStyleCallbck is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1423
    :goto_0
    return-void
.end method
