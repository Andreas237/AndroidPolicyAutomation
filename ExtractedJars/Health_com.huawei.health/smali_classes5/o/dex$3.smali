.class Lo/dex$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dex;->e(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dex;


# direct methods
.method constructor <init>(Lo/dex;)V
    .locals 0

    .line 1211
    iput-object p1, p0, Lo/dex$3;->e:Lo/dex;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 5

    .line 1214
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "saveIntensiveInfo onResult type="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const-string v3, " obj="

    const/4 v4, 0x2

    aput-object v3, v2, v4

    const/4 v3, 0x3

    aput-object p2, v2, v3

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1215
    if-nez p1, :cond_0

    .line 1216
    iget-object v0, p0, Lo/dex$3;->e:Lo/dex;

    invoke-static {v0}, Lo/dex;->c(Lo/dex;)Lo/dex$d;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lo/dex$d;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 1218
    :cond_0
    iget-object v0, p0, Lo/dex$3;->e:Lo/dex;

    invoke-static {v0}, Lo/dex;->c(Lo/dex;)Lo/dex$d;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lo/dex$d;->sendEmptyMessage(I)Z

    .line 1219
    const-string v0, "Fitness_MgrStorage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertSampPointHiHealthData not correct obj="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1221
    :goto_0
    return-void
.end method
