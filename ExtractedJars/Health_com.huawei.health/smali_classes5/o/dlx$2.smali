.class Lo/dlx$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlx;->d(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlx;

.field final synthetic d:Lo/egg;


# direct methods
.method constructor <init>(Lo/dlx;Lo/egg;)V
    .locals 0

    .line 188
    iput-object p1, p0, Lo/dlx$2;->b:Lo/dlx;

    iput-object p2, p0, Lo/dlx$2;->d:Lo/egg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 5

    .line 191
    const-string v0, "SMART_BloodSugarSmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showBloodsgDeviceDialog err_code = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 192
    if-nez p1, :cond_0

    .line 194
    const-string v4, "\u8840\u7cd6\u4eea"

    .line 196
    new-instance v0, Lo/dlx$2$1;

    invoke-direct {v0, p0}, Lo/dlx$2$1;-><init>(Lo/dlx$2;)V

    invoke-static {v4, v0}, Lo/dmn;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 215
    goto :goto_0

    .line 216
    :cond_0
    iget-object v0, p0, Lo/dlx$2;->d:Lo/egg;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lo/egg;->c(ILjava/lang/Object;)V

    .line 218
    :goto_0
    return-void
.end method
