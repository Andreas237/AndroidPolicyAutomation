.class public Lo/dmb;
.super Lo/dlv;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 54
    invoke-direct {p0, p1}, Lo/dlv;-><init>(Landroid/content/Context;)V

    .line 55
    return-void
.end method


# virtual methods
.method public d()V
    .locals 5

    .line 58
    const-string v0, "SMART_ParticipatedActivitySmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getOngoingActivities"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    iget-object v0, p0, Lo/dmb;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    const v1, 0x186a0

    invoke-virtual {v0, v1}, Lo/dln;->d(I)I

    move-result v4

    .line 61
    const-string v0, "SMART_ParticipatedActivitySmarter"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "delResult = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 76
    return-void
.end method
