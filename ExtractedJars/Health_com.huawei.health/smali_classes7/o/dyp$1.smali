.class Lo/dyp$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ml;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dyp;->b(Landroid/content/Context;ILjava/util/List;ZZ)Lo/ly;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Z

.field final synthetic d:Lo/dyp;


# direct methods
.method constructor <init>(Lo/dyp;Z)V
    .locals 0

    .line 326
    iput-object p1, p0, Lo/dyp$1;->d:Lo/dyp;

    iput-boolean p2, p0, Lo/dyp$1;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(FLcom/github/mikephil/charting/data/Entry;ILo/oa;)Ljava/lang/String;
    .locals 4

    .line 329
    iget-boolean v0, p0, Lo/dyp$1;->c:Z

    if-eqz v0, :cond_0

    .line 330
    float-to-double v0, p1

    const/4 v2, 0x1

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 332
    :cond_0
    invoke-static {p1}, Lo/cdl;->e(F)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
