.class public abstract Lo/tc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lo/th;

.field private final e:Lo/qm;


# direct methods
.method constructor <init>(Lo/qm;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lo/tc;->e:Lo/qm;

    .line 44
    new-instance v0, Lo/th;

    invoke-direct {v0, p1}, Lo/th;-><init>(Lo/qm;)V

    iput-object v0, p0, Lo/tc;->a:Lo/th;

    .line 45
    return-void
.end method

.method public static c(Lo/qm;)Lo/tc;
    .locals 6

    .line 58
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/qm;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    new-instance v0, Lo/sw;

    invoke-direct {v0, p0}, Lo/sw;-><init>(Lo/qm;)V

    return-object v0

    .line 61
    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Lo/qm;->d(I)Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    new-instance v0, Lo/td;

    invoke-direct {v0, p0}, Lo/td;-><init>(Lo/qm;)V

    return-object v0

    .line 65
    :cond_1
    const/4 v0, 0x1

    const/4 v1, 0x4

    invoke-static {p0, v0, v1}, Lo/th;->c(Lo/qm;II)I

    move-result v3

    .line 67
    sparse-switch v3, :sswitch_data_0

    goto :goto_0

    .line 68
    :sswitch_0
    new-instance v0, Lo/sr;

    invoke-direct {v0, p0}, Lo/sr;-><init>(Lo/qm;)V

    return-object v0

    .line 69
    :sswitch_1
    new-instance v0, Lo/sq;

    invoke-direct {v0, p0}, Lo/sq;-><init>(Lo/qm;)V

    return-object v0

    .line 72
    :goto_0
    const/4 v0, 0x1

    const/4 v1, 0x5

    invoke-static {p0, v0, v1}, Lo/th;->c(Lo/qm;II)I

    move-result v4

    .line 73
    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    .line 74
    :sswitch_2
    new-instance v0, Lo/su;

    invoke-direct {v0, p0}, Lo/su;-><init>(Lo/qm;)V

    return-object v0

    .line 75
    :sswitch_3
    new-instance v0, Lo/ss;

    invoke-direct {v0, p0}, Lo/ss;-><init>(Lo/qm;)V

    return-object v0

    .line 78
    :goto_1
    const/4 v0, 0x1

    const/4 v1, 0x7

    invoke-static {p0, v0, v1}, Lo/th;->c(Lo/qm;II)I

    move-result v5

    .line 79
    packed-switch v5, :pswitch_data_0

    goto/16 :goto_2

    .line 80
    :pswitch_0
    new-instance v0, Lo/sy;

    const-string v1, "310"

    const-string v2, "11"

    invoke-direct {v0, p0, v1, v2}, Lo/sy;-><init>(Lo/qm;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 81
    :pswitch_1
    new-instance v0, Lo/sy;

    const-string v1, "320"

    const-string v2, "11"

    invoke-direct {v0, p0, v1, v2}, Lo/sy;-><init>(Lo/qm;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 82
    :pswitch_2
    new-instance v0, Lo/sy;

    const-string v1, "310"

    const-string v2, "13"

    invoke-direct {v0, p0, v1, v2}, Lo/sy;-><init>(Lo/qm;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 83
    :pswitch_3
    new-instance v0, Lo/sy;

    const-string v1, "320"

    const-string v2, "13"

    invoke-direct {v0, p0, v1, v2}, Lo/sy;-><init>(Lo/qm;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 84
    :pswitch_4
    new-instance v0, Lo/sy;

    const-string v1, "310"

    const-string v2, "15"

    invoke-direct {v0, p0, v1, v2}, Lo/sy;-><init>(Lo/qm;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 85
    :pswitch_5
    new-instance v0, Lo/sy;

    const-string v1, "320"

    const-string v2, "15"

    invoke-direct {v0, p0, v1, v2}, Lo/sy;-><init>(Lo/qm;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 86
    :pswitch_6
    new-instance v0, Lo/sy;

    const-string v1, "310"

    const-string v2, "17"

    invoke-direct {v0, p0, v1, v2}, Lo/sy;-><init>(Lo/qm;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 87
    :pswitch_7
    new-instance v0, Lo/sy;

    const-string v1, "320"

    const-string v2, "17"

    invoke-direct {v0, p0, v1, v2}, Lo/sy;-><init>(Lo/qm;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 90
    :goto_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown decoder: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_0
        0x5 -> :sswitch_1
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0xc -> :sswitch_2
        0xd -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x38
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
        :pswitch_7
    .end packed-switch
.end method


# virtual methods
.method public abstract b()Ljava/lang/String;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lo/oo;,
            Lo/of;
        }
    .end annotation
.end method

.method protected final c()Lo/qm;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/tc;->e:Lo/qm;

    return-object v0
.end method

.method protected final e()Lo/th;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/tc;->a:Lo/th;

    return-object v0
.end method
