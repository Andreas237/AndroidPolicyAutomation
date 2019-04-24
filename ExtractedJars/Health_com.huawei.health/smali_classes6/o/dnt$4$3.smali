.class Lo/dnt$4$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnt$4;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/dnt$4;


# direct methods
.method constructor <init>(Lo/dnt$4;)V
    .locals 0

    .line 606
    iput-object p1, p0, Lo/dnt$4$3;->d:Lo/dnt$4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 609
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo write hihealth success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 610
    iget-object v0, p0, Lo/dnt$4$3;->d:Lo/dnt$4;

    iget-object v0, v0, Lo/dnt$4;->e:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 611
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 615
    const-string v0, "AccountDataMgrByAllowLoginArea"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "processModifyUserInfo write hihealth fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 616
    iget-object v0, p0, Lo/dnt$4$3;->d:Lo/dnt$4;

    iget-object v0, v0, Lo/dnt$4;->e:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 617
    return-void
.end method
