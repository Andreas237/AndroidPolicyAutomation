.class Lo/dlu$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlu;->b(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/egg;

.field final synthetic c:Lo/dlu;


# direct methods
.method constructor <init>(Lo/dlu;Lo/egg;)V
    .locals 0

    .line 295
    iput-object p1, p0, Lo/dlu$1;->c:Lo/dlu;

    iput-object p2, p0, Lo/dlu$1;->b:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 298
    const-string v0, "SMART_BloodpressSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodpServiceDialog judgeSuggestBloodpService err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 299
    if-nez p1, :cond_0

    .line 300
    const-string v4, "\u8840\u538b\u670d\u52a1"

    .line 301
    new-instance v0, Lo/dlu$1$4;

    invoke-direct {v0, p0}, Lo/dlu$1$4;-><init>(Lo/dlu$1;)V

    invoke-static {v4, v0}, Lo/dmn;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 319
    goto :goto_0

    .line 320
    :cond_0
    iget-object v0, p0, Lo/dlu$1;->b:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 322
    :goto_0
    return-void
.end method
