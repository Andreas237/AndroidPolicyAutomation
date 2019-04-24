.class public Lo/anm;
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

    .line 31
    invoke-direct {p0, p1}, Lo/ano;-><init>(Ljava/util/Map;)V

    .line 32
    return-void
.end method

.method private e(Ljava/util/ArrayList;I)Ljava/util/ArrayList;
    .locals 2

    .line 120
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 121
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 123
    :cond_0
    return-object p1
.end method


# virtual methods
.method protected b()V
    .locals 3

    .line 76
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    if-nez v0, :cond_0

    .line 77
    return-void

    .line 79
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 81
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "time"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "time"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "step"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    const/4 v0, 0x2

    invoke-direct {p0, v2, v0}, Lo/anm;->e(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object v2

    .line 90
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "distance"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "carior"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 94
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "duration"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 96
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "step"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 98
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "distance"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "carior"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    iget-object v0, p0, Lo/anm;->e:Ljava/util/Map;

    const-string v1, "duration"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    const/16 v0, 0xc

    invoke-direct {p0, v2, v0}, Lo/anm;->e(Ljava/util/ArrayList;I)Ljava/util/ArrayList;

    move-result-object v2

    .line 116
    invoke-virtual {p0, v2}, Lo/anm;->c(Ljava/util/ArrayList;)V

    .line 117
    return-void
.end method

.method protected c()V
    .locals 1

    .line 39
    const-string v0, "start_time"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 40
    const-string v0, "end_time"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 41
    const-string v0, "steps_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 42
    const-string v0, "steps_max"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 43
    const-string v0, "steps_max_day"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 44
    const-string v0, "distances_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 45
    const-string v0, "calories_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 46
    const-string v0, "duration_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 48
    const-string v0, "walk_steps_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 49
    const-string v0, "walk_distances_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 50
    const-string v0, "walk_calories_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 51
    const-string v0, "walk_uration_um"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 53
    const-string v0, "run_steps_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 54
    const-string v0, "run_distances_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 55
    const-string v0, "run_calories_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 56
    const-string v0, "run_duration_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 58
    const-string v0, "climb_steps_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 59
    const-string v0, "climb_distances_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 60
    const-string v0, "climb_calories_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 61
    const-string v0, "climb_duration_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 63
    const-string v0, "cycle_steps_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 64
    const-string v0, "cycle_distances_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 65
    const-string v0, "cycle_calories_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 66
    const-string v0, "cycle_duration_sum"

    invoke-virtual {p0, v0}, Lo/anm;->e(Ljava/lang/String;)V

    .line 68
    return-void
.end method
