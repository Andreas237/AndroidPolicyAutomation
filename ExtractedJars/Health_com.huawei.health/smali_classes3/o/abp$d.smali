.class Lo/abp$d;
.super Lo/akk$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic c:Lo/abp;


# direct methods
.method private constructor <init>(Lo/abp;)V
    .locals 0

    .line 240
    iput-object p1, p0, Lo/abp$d;->c:Lo/abp;

    invoke-direct {p0}, Lo/akk$e;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/abp;Lo/abp$1;)V
    .locals 0

    .line 240
    invoke-direct {p0, p1}, Lo/abp$d;-><init>(Lo/abp;)V

    return-void
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 244
    if-eqz p1, :cond_0

    .line 247
    const-string v0, "sensorhub_log"

    :try_start_0
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v4

    .line 248
    invoke-static {v4}, Lo/dhn;->a([B)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 251
    goto :goto_0

    .line 249
    :catch_0
    move-exception v4

    .line 250
    const-string v0, "Step_MidwareStepCounter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/ArrayIndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 253
    :cond_0
    :goto_0
    return-void
.end method
