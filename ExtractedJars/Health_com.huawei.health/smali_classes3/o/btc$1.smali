.class Lo/btc$1;
.super Lo/bsr;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/btc;->d(JFI)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/btc;


# direct methods
.method constructor <init>(Lo/btc;)V
    .locals 0

    .line 176
    iput-object p1, p0, Lo/btc$1;->b:Lo/btc;

    invoke-direct {p0}, Lo/bsr;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lorg/json/JSONObject;)V
    .locals 4

    .line 185
    const-string v0, "DayTotalRecordDao"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEvent onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iget-object v0, p0, Lo/btc$1;->b:Lo/btc;

    invoke-static {v0}, Lo/btc;->c(Lo/btc;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 187
    return-void
.end method

.method public d(ILjava/lang/String;)V
    .locals 4

    .line 179
    const-string v0, "DayTotalRecordDao"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "setEvent onFailure "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 180
    iget-object v0, p0, Lo/btc$1;->b:Lo/btc;

    invoke-static {v0}, Lo/btc;->c(Lo/btc;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 181
    return-void
.end method
