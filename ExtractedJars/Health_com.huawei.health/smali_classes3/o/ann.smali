.class public Lo/ann;
.super Lo/ano;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V"
        }
    .end annotation

    .line 33
    invoke-direct {p0, p1}, Lo/ano;-><init>(Ljava/util/Map;)V

    .line 34
    return-void
.end method

.method private e(III)I
    .locals 1

    .line 121
    const/16 v0, 0x186

    if-lt p1, v0, :cond_0

    const/16 v0, 0x78

    if-lt p2, v0, :cond_0

    const/4 v0, 0x2

    if-gt p3, v0, :cond_0

    .line 122
    const/4 v0, 0x3

    return v0

    .line 125
    :cond_0
    const/16 v0, 0x14a

    if-lt p1, v0, :cond_1

    const/16 v0, 0x5a

    if-lt p2, v0, :cond_1

    const/16 v0, 0x78

    if-ge p2, v0, :cond_1

    const/4 v0, 0x3

    if-gt p3, v0, :cond_1

    .line 126
    const/4 v0, 0x2

    return v0

    .line 130
    :cond_1
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method protected b()V
    .locals 5

    .line 73
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-gtz v0, :cond_1

    .line 74
    :cond_0
    return-void

    .line 76
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 79
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v1, "sleep_start_time"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v1, "sleep_end_time"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v1, "sleep_duration_sum"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v1, "sleep_deep_duration"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v1, "sleep_shallow_duration"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v1, "sleep_wake_duration"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v1, "sleep_wake_count"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    iget-object v0, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v1, "sleep_duration_sum"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v2, "sleep_deep_duration"

    .line 101
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iget-object v2, p0, Lo/ann;->e:Ljava/util/Map;

    const-string v3, "sleep_wake_count"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 100
    invoke-direct {p0, v0, v1, v2}, Lo/ann;->e(III)I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    invoke-virtual {p0, v4}, Lo/ann;->c(Ljava/util/ArrayList;)V

    .line 117
    return-void
.end method

.method protected c()V
    .locals 1

    .line 42
    const-string v0, "start_time"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 44
    const-string v0, "end_time"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 46
    const-string v0, "sleep_Sum"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 48
    const-string v0, "deep_sleep_sum"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 50
    const-string v0, "light_sleep_sum"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 52
    const-string v0, "wake_sum"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 54
    const-string v0, "wake_count"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 56
    const-string v0, "sleep_quality"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 58
    const-string v0, "sleep_avg"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 60
    const-string v0, "deep_sleep_avg"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 62
    const-string v0, "light_sleep_avg"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 64
    const-string v0, "wake_avg"

    invoke-virtual {p0, v0}, Lo/ann;->e(Ljava/lang/String;)V

    .line 65
    return-void
.end method
