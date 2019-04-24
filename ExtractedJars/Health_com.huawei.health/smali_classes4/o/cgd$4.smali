.class Lo/cgd$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cfy$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cgd;->e(Ljava/lang/String;ZJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/cgd;

.field final synthetic c:J

.field final synthetic d:Z

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lo/cgd;JZLjava/lang/String;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/cgd$4;->b:Lo/cgd;

    iput-wide p2, p0, Lo/cgd$4;->c:J

    iput-boolean p4, p0, Lo/cgd$4;->d:Z

    iput-object p5, p0, Lo/cgd$4;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lo/cfy$a;Ljava/lang/Object;)V
    .locals 4

    .line 89
    sget-object v0, Lo/cfy$a;->b:Lo/cfy$a;

    invoke-virtual {p1, v0}, Lo/cfy$a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 91
    invoke-static {}, Lo/cgd;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "showNoWifiDialog() onDialogButtonClick Yes"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 92
    iget-wide v0, p0, Lo/cgd$4;->c:J

    const/4 v2, 0x1

    const/4 v3, 0x1

    invoke-static {v2, v3, v0, v1}, Lo/djf;->b(IIJ)V

    .line 93
    iget-boolean v0, p0, Lo/cgd$4;->d:Z

    if-eqz v0, :cond_0

    .line 95
    iget-object v0, p0, Lo/cgd$4;->b:Lo/cgd;

    iget-object v1, p0, Lo/cgd$4;->e:Ljava/lang/String;

    const-string v2, "ACTION_MAP_ONCHRCKUPDATE_AS"

    invoke-static {v0, v1, v2}, Lo/cgd;->b(Lo/cgd;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 99
    :cond_0
    iget-object v0, p0, Lo/cgd$4;->b:Lo/cgd;

    iget-object v1, p0, Lo/cgd$4;->e:Ljava/lang/String;

    const-string v2, "ACITON_ACTIVITY_LOAD_CITY_AS"

    invoke-static {v0, v1, v2}, Lo/cgd;->b(Lo/cgd;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    :cond_1
    :goto_0
    return-void
.end method
