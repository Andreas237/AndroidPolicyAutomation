.class Lo/ako$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ako;->e(Lo/acl;II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ako;


# direct methods
.method constructor <init>(Lo/ako;)V
    .locals 0

    .line 69
    iput-object p1, p0, Lo/ako$4;->e:Lo/ako;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 72
    const-string v0, "HWhealthLinkage_HealthLibInteractor"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthDataHandler type is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    return-void
.end method
