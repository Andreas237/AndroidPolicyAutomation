.class public Lo/dww;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 20
    const-string v0, "PLGACHIEVE_AchievePeriodMedalService"

    sput-object v0, Lo/dww;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/dvu;Landroid/content/Context;JJ)Z
    .locals 3

    .line 25
    invoke-virtual {p0}, Lo/dvu;->j()I

    move-result v1

    .line 27
    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    .line 29
    :sswitch_0
    invoke-static/range {p0 .. p5}, Lo/dww;->d(Lo/dvu;Landroid/content/Context;JJ)Z

    move-result v2

    .line 30
    goto :goto_1

    .line 33
    :goto_0
    const/4 v2, 0x0

    .line 36
    :goto_1
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_0
    .end sparse-switch
.end method

.method private static d(Lo/dvu;Landroid/content/Context;JJ)Z
    .locals 7

    .line 44
    sget-object v0, Lo/dww;->b:Ljava/lang/String;

    const-string v1, "enter dealFitnessMedal"

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    invoke-virtual {p0}, Lo/dvu;->B()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 46
    new-instance v3, Ljava/util/Date;

    const/4 v0, 0x1

    invoke-static {p2, p3, v0}, Lo/dxc;->c(JZ)J

    move-result-wide v0

    invoke-direct {v3, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 47
    new-instance v4, Ljava/util/Date;

    const/4 v0, 0x0

    invoke-static {p4, p5, v0}, Lo/dxc;->c(JZ)J

    move-result-wide v0

    invoke-direct {v4, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 48
    invoke-static {p1}, Lo/dth;->b(Landroid/content/Context;)Lo/dth;

    move-result-object v0

    invoke-virtual {v0}, Lo/dth;->d()Lo/dti;

    move-result-object v0

    invoke-interface {v0, v3, v4}, Lo/dti;->a(Ljava/util/Date;Ljava/util/Date;)I

    move-result v5

    .line 49
    invoke-virtual {p0}, Lo/dvu;->C()I

    move-result v6

    .line 50
    sget-object v0, Lo/dww;->b:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "dealFitnessMedal medalLevel="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "duration="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dzu;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    if-lt v5, v6, :cond_0

    .line 52
    const/4 v0, 0x1

    return v0

    .line 55
    :cond_0
    const/4 v0, 0x0

    return v0
.end method
