.class Lo/dnq$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod$b$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dnq$2;->e(Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dnq$2;


# direct methods
.method constructor <init>(Lo/dnq$2;)V
    .locals 0

    .line 249
    iput-object p1, p0, Lo/dnq$2$1;->c:Lo/dnq$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 4

    .line 252
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AccountDataChange success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lo/dnq$2$1;->c:Lo/dnq$2;

    iget-object v0, v0, Lo/dnq$2;->a:Lo/doi;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/doi;->e(Ljava/util/Map;)V

    .line 254
    return-void
.end method

.method public c(I)V
    .locals 4

    .line 258
    const-string v0, "HWUserProfileMgrNative"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "AccountDataChange fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 259
    iget-object v0, p0, Lo/dnq$2$1;->c:Lo/dnq$2;

    iget-object v0, v0, Lo/dnq$2;->a:Lo/doi;

    invoke-virtual {v0}, Lo/doi;->d()V

    .line 260
    return-void
.end method
