.class public Lo/dzm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;
.implements Ljava/io/Serializable;


# instance fields
.field private d:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput p1, p0, Lo/dzm;->d:I

    .line 19
    return-void
.end method


# virtual methods
.method public compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 6

    .line 22
    move-object v4, p1

    check-cast v4, Lo/dwl;

    .line 23
    move-object v5, p2

    check-cast v5, Lo/dwl;

    .line 24
    iget v0, p0, Lo/dzm;->d:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 26
    :sswitch_0
    invoke-virtual {v5}, Lo/dwl;->c()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {v4}, Lo/dwl;->c()Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    .line 27
    const/4 v0, -0x1

    return v0

    .line 29
    :cond_0
    const/4 v0, 0x1

    return v0

    .line 32
    :goto_0
    const/4 v0, 0x0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
