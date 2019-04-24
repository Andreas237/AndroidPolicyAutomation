.class public Lo/dlj;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 2

    .line 143
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 144
    const-string v0, "SportFitness_2"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    const-string v0, "SportFitness_3"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    const-string v0, "SportFitness_4"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 147
    invoke-static {}, Lo/dmp;->b()Lo/dmp;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dmp;->e(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public static b()Z
    .locals 2

    .line 120
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 121
    const-string v0, "SportRun_2"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    const-string v0, "SportRun_3"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 123
    const-string v0, "SportRun_4"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    invoke-static {}, Lo/dmp;->b()Lo/dmp;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dmp;->e(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public static c()Z
    .locals 2

    .line 132
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 133
    const-string v0, "SportFitness_0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 134
    const-string v0, "SportFitness_1"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    invoke-static {}, Lo/dmp;->b()Lo/dmp;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dmp;->e(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public static d()Z
    .locals 2

    .line 109
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 110
    const-string v0, "SportRun_0"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 111
    const-string v0, "SportRun_1"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    invoke-static {}, Lo/dmp;->b()Lo/dmp;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dmp;->e(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public static e()Z
    .locals 2

    .line 97
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 98
    const-string v0, "bmi_l3"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 99
    const-string v0, "bmi_l4"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    const-string v0, "bmi_l5"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 101
    invoke-static {}, Lo/dmp;->b()Lo/dmp;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dmp;->e(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public static g()Z
    .locals 2

    .line 167
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 168
    const-string v0, "SportStep_1"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 169
    invoke-static {}, Lo/dmp;->b()Lo/dmp;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dmp;->e(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public static k()Z
    .locals 2

    .line 155
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 156
    const-string v0, "SportBike_2"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 157
    const-string v0, "SportBike_3"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 158
    const-string v0, "SportBike_4"

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    invoke-static {}, Lo/dmp;->b()Lo/dmp;

    move-result-object v0

    invoke-virtual {v0, v1}, Lo/dmp;->e(Ljava/util/List;)Z

    move-result v0

    return v0
.end method
