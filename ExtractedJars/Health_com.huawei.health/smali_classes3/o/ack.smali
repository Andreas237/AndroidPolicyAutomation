.class public Lo/ack;
.super Lo/acp;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 17
    invoke-direct {p0}, Lo/acp;-><init>()V

    .line 14
    const-string v0, ""

    iput-object v0, p0, Lo/ack;->a:Ljava/lang/String;

    .line 15
    const-string v0, ""

    iput-object v0, p0, Lo/ack;->d:Ljava/lang/String;

    .line 16
    const-string v0, ""

    iput-object v0, p0, Lo/ack;->e:Ljava/lang/String;

    .line 18
    iput-object p1, p0, Lo/ack;->a:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lo/ack;->d:Ljava/lang/String;

    .line 20
    iput-object p3, p0, Lo/ack;->e:Ljava/lang/String;

    .line 21
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/ack;->d:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lo/aby;)Z
    .locals 4

    .line 30
    const-string v0, "PluginDevice_PluginDevice"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceAutoTestDevice doCreateBond"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 31
    const/4 v0, 0x7

    invoke-interface {p1, v0}, Lo/aby;->onStateChanged(I)V

    .line 32
    const/4 v0, 0x0

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 51
    iget-object v0, p0, Lo/ack;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(I)Z
    .locals 1

    .line 36
    const/4 v0, 0x0

    return v0
.end method

.method public c()Z
    .locals 1

    .line 25
    const/4 v0, 0x0

    return v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 61
    iget-object v0, p0, Lo/ack;->e:Ljava/lang/String;

    return-object v0
.end method
