.class public Lo/ang;
.super Lo/ank;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lo/ank;-><init>()V

    .line 31
    invoke-virtual {p0}, Lo/ang;->a()V

    .line 33
    return-void
.end method

.method private c(Ljava/util/ArrayList;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 101
    const-string v0, "Step_AuthorityHealthCursor"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addAuthorityColumn "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 102
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 103
    return-void
.end method


# virtual methods
.method protected b()V
    .locals 2

    .line 59
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 61
    const/4 v0, 0x0

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 64
    const/4 v0, 0x1

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 67
    const/4 v0, 0x2

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 70
    const/4 v0, 0x3

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 73
    const/4 v0, 0x4

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 76
    const/4 v0, 0x5

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 82
    const/4 v0, 0x7

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 85
    const/16 v0, 0x8

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 88
    const/16 v0, 0x9

    invoke-direct {p0, v1, v0}, Lo/ang;->c(Ljava/util/ArrayList;I)V

    .line 90
    invoke-virtual {p0, v1}, Lo/ang;->c(Ljava/util/ArrayList;)V

    .line 91
    return-void
.end method

.method protected c()V
    .locals 1

    .line 41
    const-string v0, "authority_age"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 42
    const-string v0, "authority_gender"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 43
    const-string v0, "authority_sport"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 44
    const-string v0, "authority_sleep"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 45
    const-string v0, "authority_weight"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 46
    const-string v0, "authority_height"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 48
    const-string v0, "authority_heart_rate"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 49
    const-string v0, "authority_blood_sugar"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 50
    const-string v0, "authority_blood_pressure"

    invoke-virtual {p0, v0}, Lo/ang;->e(Ljava/lang/String;)V

    .line 51
    return-void
.end method
