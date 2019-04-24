.class public Lo/bvc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Lo/bvc;


# instance fields
.field private e:Lo/bvm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 14
    new-instance v0, Lo/bvc;

    invoke-direct {v0}, Lo/bvc;-><init>()V

    sput-object v0, Lo/bvc;->d:Lo/bvc;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    return-void
.end method

.method public static c()Lo/bvc;
    .locals 1

    .line 17
    sget-object v0, Lo/bvc;->d:Lo/bvc;

    return-object v0
.end method


# virtual methods
.method public c(Lo/bvm;)V
    .locals 4

    .line 29
    const-string v0, "Suggestion_DeviceStateHelper"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "registerCallback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 30
    iput-object p1, p0, Lo/bvc;->e:Lo/bvm;

    .line 31
    return-void
.end method

.method public e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 4

    .line 36
    const-string v0, "Suggestion_DeviceStateHelper"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSportState "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/bvc;->e:Lo/bvm;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 37
    iget-object v0, p0, Lo/bvc;->e:Lo/bvm;

    if-eqz v0, :cond_0

    .line 38
    iget-object v0, p0, Lo/bvc;->e:Lo/bvm;

    invoke-interface {v0, p1}, Lo/bvm;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 40
    :cond_0
    return-void
.end method
