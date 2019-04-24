.class Lo/bkx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/boj$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bkx;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bkx;


# direct methods
.method constructor <init>(Lo/bkx;)V
    .locals 0

    .line 310
    iput-object p1, p0, Lo/bkx$2;->e:Lo/bkx;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c()V
    .locals 5

    .line 314
    iget-object v0, p0, Lo/bkx$2;->e:Lo/bkx;

    invoke-static {v0}, Lo/bkx;->e(Lo/bkx;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/awm;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    .line 315
    iget-object v0, p0, Lo/bkx$2;->e:Lo/bkx;

    invoke-static {v0}, Lo/bkx;->b(Lo/bkx;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lo/bkx$2;->e:Lo/bkx;

    invoke-static {v1}, Lo/bkx;->c(Lo/bkx;)Lo/bfh;

    move-result-object v1

    iget-object v2, p0, Lo/bkx$2;->e:Lo/bkx;

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v4, v3}, Lo/awm;->d(Landroid/content/Context;Lo/bfh;Lo/awm$d;Ljava/lang/String;Ljava/lang/String;)V

    .line 316
    return-void
.end method

.method public d()V
    .locals 0

    .line 321
    return-void
.end method
