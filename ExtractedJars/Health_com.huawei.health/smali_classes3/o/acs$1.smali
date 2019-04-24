.class Lo/acs$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cly;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/acs;->d(JJLo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/egg;

.field final synthetic e:Lo/acs;


# direct methods
.method constructor <init>(Lo/acs;Lo/egg;)V
    .locals 0

    .line 124
    iput-object p1, p0, Lo/acs$1;->e:Lo/acs;

    iput-object p2, p0, Lo/acs$1;->a:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(Ljava/util/List;II)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;II)V"
        }
    .end annotation

    .line 128
    sget-object v0, Lo/acs;->c:Lo/acs;

    invoke-virtual {v0, p1}, Lo/acs;->b(Ljava/util/List;)V

    .line 129
    iget-object v0, p0, Lo/acs$1;->a:Lo/egg;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 130
    return-void
.end method
