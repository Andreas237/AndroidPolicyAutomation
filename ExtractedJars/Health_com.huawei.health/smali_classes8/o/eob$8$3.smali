.class Lo/eob$8$3;
.super Lo/djx$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eob$8;->onResponse(ILjava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/eob$8;


# direct methods
.method constructor <init>(Lo/eob$8;)V
    .locals 0

    .line 464
    iput-object p1, p0, Lo/eob$8$3;->e:Lo/eob$8;

    invoke-direct {p0}, Lo/djx$a;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/String;)V
    .locals 4

    .line 467
    const-string v0, "UpdateInteractors"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "errorcode = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 468
    const v0, 0x186a0

    if-ne p1, v0, :cond_0

    .line 470
    iget-object v0, p0, Lo/eob$8$3;->e:Lo/eob$8;

    iget-object v0, v0, Lo/eob$8;->b:Lo/eob;

    invoke-virtual {v0}, Lo/eob;->m()V

    .line 472
    :cond_0
    return-void
.end method
