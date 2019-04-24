.class public Lo/emk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ejn;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final e(F)Ljava/lang/String;
    .locals 11

    .line 56
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    move-result v7

    .line 58
    const/4 v0, 0x1

    if-ge v7, v0, :cond_0

    .line 60
    const/4 v7, 0x1

    .line 63
    :cond_0
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v8

    .line 64
    div-int/lit8 v9, v7, 0x3c

    .line 65
    rem-int/lit8 v10, v7, 0x3c

    .line 66
    if-nez v8, :cond_1

    .line 67
    const-string v0, ""

    return-object v0

    .line 69
    :cond_1
    invoke-static {v8}, Lo/cxa;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 70
    invoke-static {v7}, Lo/cxh;->d(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 72
    :cond_2
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/commonui/R$string;->IDS_hwh_motiontrack_show_pace:I

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    int-to-double v3, v9

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-static {v3, v4, v5, v6}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lo/emi;Lo/elb;)V
    .locals 4

    .line 28
    invoke-virtual {p2}, Lo/elb;->e()Lo/eit$b;

    move-result-object v2

    .line 29
    invoke-virtual {p1, v2}, Lo/emi;->b(Lo/eit$b;)Lo/eim;

    move-result-object v0

    new-instance v1, Lo/emk$1;

    invoke-direct {v1, p0, p1}, Lo/emk$1;-><init>(Lo/emk;Lo/emi;)V

    invoke-virtual {v0, v1}, Lo/eim;->e(Lo/eim$e;)V

    .line 40
    invoke-virtual {p1, v2}, Lo/emi;->a(Lo/eit$b;)Lo/eit;

    move-result-object v0

    new-instance v1, Lo/emk$4;

    invoke-direct {v1, p0}, Lo/emk$4;-><init>(Lo/emk;)V

    invoke-virtual {v0, v1}, Lo/eit;->b(Lo/mf;)V

    .line 47
    invoke-virtual {p1, v2}, Lo/emi;->e(Lo/eit$b;)Lo/eid;

    move-result-object v3

    .line 49
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lo/eid;->b(Z)V

    .line 51
    invoke-virtual {v3, p0}, Lo/eid;->c(Lo/ejn;)V

    .line 52
    return-void
.end method
