.class public Lo/cft;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Lo/cgd;

.field private b:I

.field private c:J

.field private d:J

.field private e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;ILjava/lang/String;J)V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/cft;->d:J

    .line 39
    invoke-static {p1}, Lo/cgd;->b(Landroid/content/Context;)Lo/cgd;

    move-result-object v0

    iput-object v0, p0, Lo/cft;->a:Lo/cgd;

    .line 40
    iput p2, p0, Lo/cft;->b:I

    .line 41
    iput-object p3, p0, Lo/cft;->e:Ljava/lang/String;

    .line 42
    iput-wide p4, p0, Lo/cft;->c:J

    .line 43
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 7

    .line 49
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v5

    .line 50
    iget-wide v0, p0, Lo/cft;->d:J

    sub-long v0, v5, v0

    const-wide/16 v2, 0x3e8

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    .line 52
    iput-wide v5, p0, Lo/cft;->d:J

    .line 53
    return-void

    .line 55
    :cond_0
    const-string v0, "Track_OfflineMapOnClickListener"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/cft;->e:Ljava/lang/String;

    const/4 v3, 0x1

    aput-object v2, v1, v3

    iget v2, p0, Lo/cft;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    iget v0, p0, Lo/cft;->b:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 59
    :sswitch_0
    iget-object v0, p0, Lo/cft;->a:Lo/cgd;

    iget-object v1, p0, Lo/cft;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/cgd;->b(Ljava/lang/String;)V

    .line 60
    goto :goto_0

    .line 62
    :sswitch_1
    iget-object v0, p0, Lo/cft;->a:Lo/cgd;

    iget-object v1, p0, Lo/cft;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lo/cgd;->a(Ljava/lang/String;)V

    .line 63
    goto :goto_0

    .line 70
    :sswitch_2
    iget-object v0, p0, Lo/cft;->a:Lo/cgd;

    iget-object v1, p0, Lo/cft;->e:Ljava/lang/String;

    iget-wide v2, p0, Lo/cft;->c:J

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/cgd;->a(Ljava/lang/String;ZJ)V

    .line 71
    goto :goto_0

    .line 73
    :sswitch_3
    iget-object v0, p0, Lo/cft;->a:Lo/cgd;

    iget-object v1, p0, Lo/cft;->e:Ljava/lang/String;

    iget-wide v2, p0, Lo/cft;->c:J

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/cgd;->a(Ljava/lang/String;ZJ)V

    .line 74
    goto :goto_0

    .line 76
    :sswitch_4
    iget-object v0, p0, Lo/cft;->a:Lo/cgd;

    iget-object v1, p0, Lo/cft;->e:Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lo/cgd;->d(Ljava/lang/String;Z)V

    .line 77
    iget-object v0, p0, Lo/cft;->a:Lo/cgd;

    iget-object v1, p0, Lo/cft;->e:Ljava/lang/String;

    iget-wide v2, p0, Lo/cft;->c:J

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/cgd;->a(Ljava/lang/String;ZJ)V

    .line 78
    goto :goto_0

    .line 81
    :sswitch_5
    iget-object v0, p0, Lo/cft;->a:Lo/cgd;

    iget-object v1, p0, Lo/cft;->e:Ljava/lang/String;

    iget-wide v2, p0, Lo/cft;->c:J

    const/4 v4, 0x1

    invoke-virtual {v0, v1, v4, v2, v3}, Lo/cgd;->a(Ljava/lang/String;ZJ)V

    .line 82
    nop

    .line 85
    .line 89
    :goto_0
    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x1 -> :sswitch_3
        0x0 -> :sswitch_0
        0x1 -> :sswitch_6
        0x2 -> :sswitch_1
        0x3 -> :sswitch_2
        0x4 -> :sswitch_6
        0x5 -> :sswitch_2
        0x6 -> :sswitch_2
        0x7 -> :sswitch_5
        0xa -> :sswitch_5
        0x65 -> :sswitch_2
        0x66 -> :sswitch_4
        0x67 -> :sswitch_2
        0x3ea -> :sswitch_2
    .end sparse-switch
.end method
