.class Lo/esv$10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/xj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/esv;


# direct methods
.method constructor <init>(Lo/esv;)V
    .locals 0

    .line 1652
    iput-object p1, p0, Lo/esv$10;->b:Lo/esv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/String;)V
    .locals 4

    .line 1655
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "SocialObserver onChange start"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1656
    const/4 v0, 0x1

    if-ne v0, p1, :cond_0

    .line 1657
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MessageObserver onChange onResponse"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1658
    iget-object v0, p0, Lo/esv$10;->b:Lo/esv;

    invoke-static {v0}, Lo/esv;->j(Lo/esv;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/esv$10$3;

    invoke-direct {v1, p0}, Lo/esv$10$3;-><init>(Lo/esv$10;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1665
    :cond_0
    return-void
.end method
