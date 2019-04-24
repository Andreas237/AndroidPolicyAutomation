.class Lo/fds$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fds;->a(Lo/ekr;Lo/ehe$a;JJI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lo/ekr;

.field final synthetic c:Lo/ehe$a;

.field final synthetic e:Lo/fds;


# direct methods
.method constructor <init>(Lo/fds;ILo/ekr;Lo/ehe$a;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lo/fds$4;->e:Lo/fds;

    iput p2, p0, Lo/fds$4;->a:I

    iput-object p3, p0, Lo/fds$4;->b:Lo/ekr;

    iput-object p4, p0, Lo/fds$4;->c:Lo/ehe$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 117
    iget-object v0, p0, Lo/fds$4;->e:Lo/fds;

    invoke-virtual {v0, p1}, Lo/fds;->b(Ljava/util/List;)V

    .line 118
    iget v0, p0, Lo/fds$4;->a:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 119
    iget-object v0, p0, Lo/fds$4;->e:Lo/fds;

    iget-object v1, p0, Lo/fds$4;->b:Lo/ekr;

    iget-object v2, p0, Lo/fds$4;->c:Lo/ehe$a;

    invoke-virtual {v0, v1, v2}, Lo/fds;->b(Lo/ekr;Lo/ehe$a;)V

    .line 120
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readSevenDaysWeight type==1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 122
    :cond_0
    iget-object v0, p0, Lo/fds$4;->e:Lo/fds;

    iget-object v1, p0, Lo/fds$4;->b:Lo/ekr;

    iget-object v2, p0, Lo/fds$4;->c:Lo/ehe$a;

    invoke-virtual {v0, v1, v2}, Lo/fds;->a(Lo/ekr;Lo/ehe$a;)V

    .line 123
    const-string v0, "WeightLineChartStorageHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "readSevenDaysWeight type==2"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 126
    :goto_0
    return-void
.end method
