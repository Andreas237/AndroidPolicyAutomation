.class Lo/cgd$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cfy$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgd;->e(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cgd;

.field final synthetic c:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cgd;Ljava/lang/String;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lo/cgd$5;->b:Lo/cgd;

    iput-object p2, p0, Lo/cgd$5;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/cfy$a;Ljava/lang/Object;)V
    .locals 4

    .line 59
    sget-object v0, Lo/cfy$a;->b:Lo/cfy$a;

    invoke-virtual {p1, v0}, Lo/cfy$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 61
    iget-object v0, p0, Lo/cgd$5;->b:Lo/cgd;

    invoke-virtual {v0}, Lo/cgd;->b()V

    .line 62
    invoke-static {}, Lo/cgd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoWifiWaintingDialog() onDialogButtonClick Yes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 63
    iget-object v0, p0, Lo/cgd$5;->b:Lo/cgd;

    iget-object v1, p0, Lo/cgd$5;->c:Ljava/lang/String;

    const-string v2, "ACITON_ACTIVITY_WAIT_CITY_AS"

    invoke-static {v0, v1, v2}, Lo/cgd;->b(Lo/cgd;Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    :cond_0
    return-void
.end method
