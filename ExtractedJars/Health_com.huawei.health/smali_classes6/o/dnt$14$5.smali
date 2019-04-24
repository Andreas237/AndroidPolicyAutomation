.class Lo/dnt$14$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/don$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt$14;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dnt$14;


# direct methods
.method constructor <init>(Lo/dnt$14;)V
    .locals 0

    .line 488
    iput-object p1, p0, Lo/dnt$14$5;->c:Lo/dnt$14;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/String;)V
    .locals 5

    .line 491
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 492
    const-string v0, "newPath"

    invoke-interface {v4, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "downloadHeadPic newPath:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 494
    iget-object v0, p0, Lo/dnt$14$5;->c:Lo/dnt$14;

    iget-object v0, v0, Lo/dnt$14;->b:Lo/doi;

    invoke-virtual {v0, v4}, Lo/doi;->e(Ljava/util/Map;)V

    .line 495
    return-void
.end method

.method public d()V
    .locals 1

    .line 499
    iget-object v0, p0, Lo/dnt$14$5;->c:Lo/dnt$14;

    iget-object v0, v0, Lo/dnt$14;->b:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 500
    return-void
.end method
