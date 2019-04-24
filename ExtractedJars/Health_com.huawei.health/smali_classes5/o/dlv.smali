.class public Lo/dlv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected b:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lo/dlv;->b:Landroid/content/Context;

    .line 23
    return-void
.end method


# virtual methods
.method protected c(Ljava/lang/String;ILjava/lang/String;)Z
    .locals 6

    .line 54
    iget-object v0, p0, Lo/dlv;->b:Landroid/content/Context;

    .line 55
    const/16 v1, 0x2725

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    .line 54
    invoke-static {v0, v1, p1}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 57
    invoke-static {p2, p3}, Lo/dmn;->a(ILjava/lang/String;)Z

    move-result v5

    .line 58
    const-string v0, "SMART_BaseSmarter"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "userType = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, ", isNoLongerRecommend = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const/4 v2, 0x3

    aput-object v4, v1, v2

    const-string v2, ", enable = "

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    const-string v0, "1"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    if-nez v5, :cond_1

    .line 61
    :cond_0
    const/4 v0, 0x0

    return v0

    .line 63
    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public e()V
    .locals 0

    .line 37
    return-void
.end method
